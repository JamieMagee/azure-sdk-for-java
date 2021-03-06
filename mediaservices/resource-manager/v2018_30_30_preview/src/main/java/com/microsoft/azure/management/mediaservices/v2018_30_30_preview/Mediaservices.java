/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation.MediaservicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Mediaservices.
 */
public interface Mediaservices extends SupportsCreating<MediaService.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<MediaService>, SupportsListingByResourceGroup<MediaService>, SupportsListing<MediaService>, HasInner<MediaservicesInner> {
    /**
     * Synchronizes Storage Account Keys.
     * Synchronizes storage account keys for a storage account associated with the Media Service account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable syncStorageKeysAsync(String resourceGroupName, String accountName);

    /**
     * Get a Media Services account.
     * Get the details of a Media Services account.
     *
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SubscriptionMediaService> getBySubscriptionAsync(String accountName);

}
