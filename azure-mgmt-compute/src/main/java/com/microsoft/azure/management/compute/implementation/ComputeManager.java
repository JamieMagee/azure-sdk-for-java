package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.management.compute.AvailabilitySets;
import com.microsoft.azure.management.compute.VirtualMachineImages;
import com.microsoft.azure.management.compute.VirtualMachines;
import com.microsoft.azure.management.compute.implementation.api.ComputeManagementClientImpl;
import com.microsoft.azure.management.network.implementation.NetworkManager;
import com.microsoft.azure.management.resources.fluentcore.arm.AzureConfigurable;
import com.microsoft.azure.management.resources.fluentcore.arm.implementation.AzureConfigurableImpl;
import com.microsoft.azure.management.resources.implementation.ResourceManager;
import com.microsoft.azure.management.storage.implementation.StorageManager;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;

/**
 * Entry point to Azure compute resource management.
 */
public final class ComputeManager {
    // The service managers
    private ResourceManager resourceManager;
    private StorageManager storageManager;
    private NetworkManager networkManager;
    // The sdk clients
    private ComputeManagementClientImpl computeManagementClient;
    // The collections
    private AvailabilitySets availabilitySets;
    private VirtualMachines virtualMachines;
    private VirtualMachineImages virtualMachineImages;

    /**
     * Get a Configurable instance that can be used to create ComputeManager with optional configuration.
     *
     * @return Configurable
     */
    public static Configurable configure() {
        return new ComputeManager.ConfigurableImpl();
    }

    /**
     * Creates an instance of ComputeManager that exposes Compute resource management API entry points.
     *
     * @param credentials the credentials to use
     * @param subscriptionId the subscription
     * @return the ComputeManager
     */
    public static ComputeManager authenticate(ServiceClientCredentials credentials, String subscriptionId) {
        return new ComputeManager(AzureEnvironment.AZURE.newRestClientBuilder()
                .withCredentials(credentials)
                .build(), subscriptionId);
    }

    /**
     * Creates an instance of ComputeManager that exposes Compute resource management API entry points.
     *
     * @param restClient the RestClient to be used for API calls.
     * @param subscriptionId the subscription
     * @return the ComputeManager
     */
    public static ComputeManager authenticate(RestClient restClient, String subscriptionId) {
        return new ComputeManager(restClient, subscriptionId);
    }

    /**
     * The interface allowing configurations to be set.
     */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
         * Creates an instance of ComputeManager that exposes Compute resource management API entry points.
         *
         * @param credentials the credentials to use
         * @param subscriptionId the subscription
         * @return the ComputeManager
         */
        ComputeManager authenticate(ServiceClientCredentials credentials, String subscriptionId);
    }

    /**
     * The implementation for Configurable interface.
     */
    private static final class ConfigurableImpl extends AzureConfigurableImpl<Configurable> implements  Configurable {
        @Override
        public ComputeManager authenticate(ServiceClientCredentials credentials, String subscriptionId) {
            return ComputeManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
    }

    private ComputeManager(RestClient restClient, String subscriptionId) {
        computeManagementClient = new ComputeManagementClientImpl(restClient);
        computeManagementClient.withSubscriptionId(subscriptionId);
        resourceManager = ResourceManager.authenticate(restClient).withSubscription(subscriptionId);
        storageManager = StorageManager.authenticate(restClient, subscriptionId);
        networkManager = NetworkManager.authenticate(restClient, subscriptionId);
    }

    /**
     * @return the availability set resource management API entry point
     */
    public AvailabilitySets availabilitySets() {
        if (availabilitySets == null) {
            availabilitySets = new AvailabilitySetsImpl(computeManagementClient.availabilitySets(),
                    resourceManager);
        }
        return availabilitySets;
    }

    /**
     * @return the virtual machine resource management API entry point
     */
    public VirtualMachines virtualMachines() {
        if (virtualMachines == null) {
            virtualMachines = new VirtualMachinesImpl(computeManagementClient.virtualMachines(),
                    computeManagementClient.virtualMachineSizes(),
                    availabilitySets(),
                    resourceManager,
                    storageManager,
                    networkManager);
        }
        return virtualMachines;
    }

    /**
     * @return the virtual machine image resource management API entry point
     */
    public VirtualMachineImages virtualMachineImages() {
        if (virtualMachineImages == null) {
            virtualMachineImages = new VirtualMachineImagesImpl(computeManagementClient.virtualMachineImages());
        }
        return virtualMachineImages;
    }
}