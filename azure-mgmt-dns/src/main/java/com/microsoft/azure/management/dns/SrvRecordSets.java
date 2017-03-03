/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.dns;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByName;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasParent;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListingAsync;

/**
 *  Entry point to SRV record sets in a DNS zone.
 */
@Fluent
public interface SrvRecordSets extends
        SupportsListingAsync<SrvRecordSet>,
        SupportsGettingByName<SrvRecordSet>,
        HasParent<DnsZone> {
}