/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the properties of a Azure SQL Recommended Elastic Pool being
 * upgraded.
 */
public class UpgradeRecommendedElasticPoolProperties {
    /**
     * The name of the Azure SQL Recommended Elastic Pool being upgraded.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /**
     * The target edition for the Azure SQL Recommended Elastic Pool being
     * upgraded. Possible values include: 'Basic', 'Standard', 'Premium'.
     */
    @JsonProperty(value = "Edition", required = true)
    private TargetElasticPoolEditions edition;

    /**
     * The DTU guarantee for the Azure SQL Recommended Elastic Pool being
     * upgraded.
     */
    @JsonProperty(value = "Dtu")
    private Integer dtu;

    /**
     * The storage limit in MB for the Azure SQL Recommended Elastic Pool being
     * upgraded.
     */
    @JsonProperty(value = "StorageMb")
    private Integer storageMb;

    /**
     * The DTU guarantee for database for the Azure SQL Recommended Elastic
     * Pool being upgraded.
     */
    @JsonProperty(value = "DatabaseDtuMin")
    private Integer databaseDtuMin;

    /**
     * The DTU cap for database for the Azure SQL Recommended Elastic Pool
     * being upgraded.
     */
    @JsonProperty(value = "DatabaseDtuMax")
    private Integer databaseDtuMax;

    /**
     * The list of database names to be put in the Azure SQL Recommended
     * Elastic Pool being upgraded.
     */
    @JsonProperty(value = "DatabaseCollection")
    private List<String> databaseCollection;

    /**
     * Gets or sets whether all databases to be put in the Azure SQL
     * Recommended Elastic Pool being upgraded.
     */
    @JsonProperty(value = "IncludeAllDatabases")
    private Boolean includeAllDatabases;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the UpgradeRecommendedElasticPoolProperties object itself.
     */
    public UpgradeRecommendedElasticPoolProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the edition value.
     *
     * @return the edition value
     */
    public TargetElasticPoolEditions edition() {
        return this.edition;
    }

    /**
     * Set the edition value.
     *
     * @param edition the edition value to set
     * @return the UpgradeRecommendedElasticPoolProperties object itself.
     */
    public UpgradeRecommendedElasticPoolProperties withEdition(TargetElasticPoolEditions edition) {
        this.edition = edition;
        return this;
    }

    /**
     * Get the dtu value.
     *
     * @return the dtu value
     */
    public Integer dtu() {
        return this.dtu;
    }

    /**
     * Set the dtu value.
     *
     * @param dtu the dtu value to set
     * @return the UpgradeRecommendedElasticPoolProperties object itself.
     */
    public UpgradeRecommendedElasticPoolProperties withDtu(Integer dtu) {
        this.dtu = dtu;
        return this;
    }

    /**
     * Get the storageMb value.
     *
     * @return the storageMb value
     */
    public Integer storageMb() {
        return this.storageMb;
    }

    /**
     * Set the storageMb value.
     *
     * @param storageMb the storageMb value to set
     * @return the UpgradeRecommendedElasticPoolProperties object itself.
     */
    public UpgradeRecommendedElasticPoolProperties withStorageMb(Integer storageMb) {
        this.storageMb = storageMb;
        return this;
    }

    /**
     * Get the databaseDtuMin value.
     *
     * @return the databaseDtuMin value
     */
    public Integer databaseDtuMin() {
        return this.databaseDtuMin;
    }

    /**
     * Set the databaseDtuMin value.
     *
     * @param databaseDtuMin the databaseDtuMin value to set
     * @return the UpgradeRecommendedElasticPoolProperties object itself.
     */
    public UpgradeRecommendedElasticPoolProperties withDatabaseDtuMin(Integer databaseDtuMin) {
        this.databaseDtuMin = databaseDtuMin;
        return this;
    }

    /**
     * Get the databaseDtuMax value.
     *
     * @return the databaseDtuMax value
     */
    public Integer databaseDtuMax() {
        return this.databaseDtuMax;
    }

    /**
     * Set the databaseDtuMax value.
     *
     * @param databaseDtuMax the databaseDtuMax value to set
     * @return the UpgradeRecommendedElasticPoolProperties object itself.
     */
    public UpgradeRecommendedElasticPoolProperties withDatabaseDtuMax(Integer databaseDtuMax) {
        this.databaseDtuMax = databaseDtuMax;
        return this;
    }

    /**
     * Get the databaseCollection value.
     *
     * @return the databaseCollection value
     */
    public List<String> databaseCollection() {
        return this.databaseCollection;
    }

    /**
     * Set the databaseCollection value.
     *
     * @param databaseCollection the databaseCollection value to set
     * @return the UpgradeRecommendedElasticPoolProperties object itself.
     */
    public UpgradeRecommendedElasticPoolProperties withDatabaseCollection(List<String> databaseCollection) {
        this.databaseCollection = databaseCollection;
        return this;
    }

    /**
     * Get the includeAllDatabases value.
     *
     * @return the includeAllDatabases value
     */
    public Boolean includeAllDatabases() {
        return this.includeAllDatabases;
    }

    /**
     * Set the includeAllDatabases value.
     *
     * @param includeAllDatabases the includeAllDatabases value to set
     * @return the UpgradeRecommendedElasticPoolProperties object itself.
     */
    public UpgradeRecommendedElasticPoolProperties withIncludeAllDatabases(Boolean includeAllDatabases) {
        this.includeAllDatabases = includeAllDatabases;
        return this;
    }

}
