/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.windowsazure.services.management;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Map;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import com.microsoft.windowsazure.services.core.Builder;
import com.microsoft.windowsazure.services.core.UserAgentFilter;
import com.microsoft.windowsazure.services.management.implementation.ManagementExceptionProcessor;
import com.microsoft.windowsazure.services.management.implementation.ManagementRestProxy;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.client.urlconnection.HTTPSProperties;

public class Exports implements Builder.Exports {
    @Override
    public void register(Builder.Registry registry) {

        // provide contract implementation
        registry.add(ManagementContract.class, ManagementExceptionProcessor.class);
        registry.add(ManagementRestProxy.class);
        registry.add(UserAgentFilter.class);

        // alter jersey client config for service management
        registry.alter(ClientConfig.class, new Builder.Alteration<ClientConfig>() {

            @Override
            public ClientConfig alter(ClientConfig clientConfig, Builder builder, Map<String, Object> properties) {

                String keyStoreName = "d:\\src\\javacert\\azurecertkeystore.jks";
                // String trustStoreName = "c:\\src\\truststore.jks";
                String keyStorePass = "azurerocks";
                String keyPass = "azurecert";

                SSLContext sslContext = null;

                try {
                    sslContext = SSLContext.getInstance("SSL");
                }
                catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }

                KeyManager[] keyManager = createKeyManager(keyStoreName, keyStorePass, keyPass);
                TrustManager[] trustManager = createDefaultTrustManager();

                try {
                    sslContext.init(keyManager, trustManager, null);
                }
                catch (KeyManagementException e) {
                    throw new RuntimeException(e);
                }
                clientConfig.getProperties().put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES,
                        new HTTPSProperties(null, sslContext));
                return clientConfig;
            }
        });

    }

    private TrustManager[] createDefaultTrustManager() {

        TrustManagerFactory trustManagerFactory = null;
        try {
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        try {
            trustManagerFactory.init((KeyStore) null);
        }
        catch (KeyStoreException e) {
            throw new RuntimeException(e);
        }
        return trustManagerFactory.getTrustManagers();

    }

    private KeyManager[] createKeyManager(String keyStoreName, String keyStorePass, String keyPass) {
        KeyManagerFactory keyManagerFactory = createKeyManagerFactory(keyStoreName, keyStorePass, keyPass);
        return keyManagerFactory.getKeyManagers();
    }

    private KeyManagerFactory createKeyManagerFactory(String keyStoreName, String keyStorePass, String keyPass) {
        KeyManagerFactory keyManagerFactory = null;
        KeyStore keyStore = createKeyStore(keyStoreName, keyStorePass);

        try {
            keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        try {
            keyManagerFactory.init(keyStore, keyPass.toCharArray());
        }
        catch (UnrecoverableKeyException e) {
            throw new RuntimeException(e);
        }
        catch (KeyStoreException e) {
            throw new RuntimeException(e);
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        return keyManagerFactory;
    }

    private KeyStore createKeyStore(String keyStoreFileName, String keyStorePassword) {
        KeyStore keyStore = null;
        try {
            keyStore = KeyStore.getInstance("JKS");
        }
        catch (KeyStoreException e) {
            throw new RuntimeException(e);
        }

        FileInputStream keyStoreFileInputStream = null;
        try {
            keyStoreFileInputStream = new FileInputStream(keyStoreFileName);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            keyStore.load(keyStoreFileInputStream, keyStorePassword.toCharArray());
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        catch (CertificateException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        return keyStore;

    }
}
