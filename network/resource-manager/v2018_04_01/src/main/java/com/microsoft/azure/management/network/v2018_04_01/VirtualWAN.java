/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_04_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_04_01.implementation.VirtualWANInner;

/**
 * Type representing VirtualWAN.
 */
public interface VirtualWAN extends HasInner<VirtualWANInner>, Resource, GroupableResourceCore<NetworkManager, VirtualWANInner>, HasResourceGroup, Refreshable<VirtualWAN>, Updatable<VirtualWAN.Update>, HasManager<NetworkManager> {
    /**
     * @return the disableVpnEncryption value.
     */
    Boolean disableVpnEncryption();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the virtualHubs value.
     */
    List<SubResource> virtualHubs();

    /**
     * @return the vpnSites value.
     */
    List<SubResource> vpnSites();

    /**
     * The entirety of the VirtualWAN definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualWAN definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualWAN definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VirtualWAN definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the virtualwan update allowing to specify DisableVpnEncryption.
         */
        interface WithDisableVpnEncryption {
            /**
             * Specifies disableVpnEncryption.
             */
            WithCreate withDisableVpnEncryption(Boolean disableVpnEncryption);
        }

        /**
         * The stage of the virtualwan update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(ProvisioningState provisioningState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualWAN>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDisableVpnEncryption, DefinitionStages.WithProvisioningState {
        }
    }
    /**
     * The template for a VirtualWAN update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualWAN>, Resource.UpdateWithTags<Update>, UpdateStages.WithDisableVpnEncryption, UpdateStages.WithProvisioningState {
    }

    /**
     * Grouping of VirtualWAN update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualwan {0} allowing to specify DisableVpnEncryption.
         */
        interface WithDisableVpnEncryption {
            /**
             * Specifies disableVpnEncryption.
             */
            Update withDisableVpnEncryption(Boolean disableVpnEncryption);
        }

        /**
         * The stage of the virtualwan {0} allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(ProvisioningState provisioningState);
        }

    }
}
