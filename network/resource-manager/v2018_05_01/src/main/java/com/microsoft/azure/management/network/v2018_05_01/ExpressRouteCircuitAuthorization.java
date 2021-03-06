/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_05_01.implementation.ExpressRouteCircuitAuthorizationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_05_01.implementation.NetworkManager;

/**
 * Type representing ExpressRouteCircuitAuthorization.
 */
public interface ExpressRouteCircuitAuthorization extends HasInner<ExpressRouteCircuitAuthorizationInner>, Indexable, Refreshable<ExpressRouteCircuitAuthorization>, Updatable<ExpressRouteCircuitAuthorization.Update>, HasManager<NetworkManager> {
    /**
     * @return the authorizationKey value.
     */
    String authorizationKey();

    /**
     * @return the authorizationUseStatus value.
     */
    AuthorizationUseStatus authorizationUseStatus();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * The entirety of the ExpressRouteCircuitAuthorization definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithExpressRouteCircuit, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ExpressRouteCircuitAuthorization definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ExpressRouteCircuitAuthorization definition.
         */
        interface Blank extends WithExpressRouteCircuit {
        }

        /**
         * The stage of the expressroutecircuitauthorization definition allowing to specify ExpressRouteCircuit.
         */
        interface WithExpressRouteCircuit {
           /**
            * Specifies resourceGroupName, circuitName.
            */
            WithCreate withExistingExpressRouteCircuit(String resourceGroupName, String circuitName);
        }

        /**
         * The stage of the expressroutecircuitauthorization definition allowing to specify AuthorizationKey.
         */
        interface WithAuthorizationKey {
            /**
             * Specifies authorizationKey.
             */
            WithCreate withAuthorizationKey(String authorizationKey);
        }

        /**
         * The stage of the expressroutecircuitauthorization definition allowing to specify AuthorizationUseStatus.
         */
        interface WithAuthorizationUseStatus {
            /**
             * Specifies authorizationUseStatus.
             */
            WithCreate withAuthorizationUseStatus(AuthorizationUseStatus authorizationUseStatus);
        }

        /**
         * The stage of the expressroutecircuitauthorization definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the expressroutecircuitauthorization definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the expressroutecircuitauthorization definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ExpressRouteCircuitAuthorization>, DefinitionStages.WithAuthorizationKey, DefinitionStages.WithAuthorizationUseStatus, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithProvisioningState {
        }
    }
    /**
     * The template for a ExpressRouteCircuitAuthorization update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ExpressRouteCircuitAuthorization>, UpdateStages.WithAuthorizationKey, UpdateStages.WithAuthorizationUseStatus, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithProvisioningState {
    }

    /**
     * Grouping of ExpressRouteCircuitAuthorization update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the expressroutecircuitauthorization update allowing to specify AuthorizationKey.
         */
        interface WithAuthorizationKey {
            /**
             * Specifies authorizationKey.
             */
            Update withAuthorizationKey(String authorizationKey);
        }

        /**
         * The stage of the expressroutecircuitauthorization update allowing to specify AuthorizationUseStatus.
         */
        interface WithAuthorizationUseStatus {
            /**
             * Specifies authorizationUseStatus.
             */
            Update withAuthorizationUseStatus(AuthorizationUseStatus authorizationUseStatus);
        }

        /**
         * The stage of the expressroutecircuitauthorization update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            Update withId(String id);
        }

        /**
         * The stage of the expressroutecircuitauthorization update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            Update withName(String name);
        }

        /**
         * The stage of the expressroutecircuitauthorization update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(String provisioningState);
        }

    }
}
