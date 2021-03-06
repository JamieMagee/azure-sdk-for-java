/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.implementation;

import com.microsoft.azure.management.devtestlab.EnvironmentDeploymentProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * An environment, which is essentially an ARM template deployment.
 */
@JsonFlatten
public class DtlEnvironmentInner extends Resource {
    /**
     * The deployment properties of the environment.
     */
    @JsonProperty(value = "properties.deploymentProperties")
    private EnvironmentDeploymentProperties deploymentProperties;

    /**
     * The display name of the Azure Resource Manager template that produced
     * the environment.
     */
    @JsonProperty(value = "properties.armTemplateDisplayName")
    private String armTemplateDisplayName;

    /**
     * The identifier of the resource group containing the environment's
     * resources.
     */
    @JsonProperty(value = "properties.resourceGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroupId;

    /**
     * The creator of the environment.
     */
    @JsonProperty(value = "properties.createdByUser", access = JsonProperty.Access.WRITE_ONLY)
    private String createdByUser;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the deploymentProperties value.
     *
     * @return the deploymentProperties value
     */
    public EnvironmentDeploymentProperties deploymentProperties() {
        return this.deploymentProperties;
    }

    /**
     * Set the deploymentProperties value.
     *
     * @param deploymentProperties the deploymentProperties value to set
     * @return the DtlEnvironmentInner object itself.
     */
    public DtlEnvironmentInner withDeploymentProperties(EnvironmentDeploymentProperties deploymentProperties) {
        this.deploymentProperties = deploymentProperties;
        return this;
    }

    /**
     * Get the armTemplateDisplayName value.
     *
     * @return the armTemplateDisplayName value
     */
    public String armTemplateDisplayName() {
        return this.armTemplateDisplayName;
    }

    /**
     * Set the armTemplateDisplayName value.
     *
     * @param armTemplateDisplayName the armTemplateDisplayName value to set
     * @return the DtlEnvironmentInner object itself.
     */
    public DtlEnvironmentInner withArmTemplateDisplayName(String armTemplateDisplayName) {
        this.armTemplateDisplayName = armTemplateDisplayName;
        return this;
    }

    /**
     * Get the resourceGroupId value.
     *
     * @return the resourceGroupId value
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * Get the createdByUser value.
     *
     * @return the createdByUser value
     */
    public String createdByUser() {
        return this.createdByUser;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the DtlEnvironmentInner object itself.
     */
    public DtlEnvironmentInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the uniqueIdentifier value.
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the uniqueIdentifier value.
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set
     * @return the DtlEnvironmentInner object itself.
     */
    public DtlEnvironmentInner withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

}
