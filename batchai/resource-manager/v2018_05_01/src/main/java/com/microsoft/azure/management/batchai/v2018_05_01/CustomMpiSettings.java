/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the settings for a custom tool kit job.
 */
public class CustomMpiSettings {
    /**
     * The program and program command line parameters to be executed by mpi
     * runtime.
     */
    @JsonProperty(value = "commandLine", required = true)
    private String commandLine;

    /**
     * Number of processes parameter that is passed to MPI runtime.
     * The default value for this property is equal to nodeCount property.
     */
    @JsonProperty(value = "processCount")
    private Integer processCount;

    /**
     * Get the commandLine value.
     *
     * @return the commandLine value
     */
    public String commandLine() {
        return this.commandLine;
    }

    /**
     * Set the commandLine value.
     *
     * @param commandLine the commandLine value to set
     * @return the CustomMpiSettings object itself.
     */
    public CustomMpiSettings withCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }

    /**
     * Get the processCount value.
     *
     * @return the processCount value
     */
    public Integer processCount() {
        return this.processCount;
    }

    /**
     * Set the processCount value.
     *
     * @param processCount the processCount value to set
     * @return the CustomMpiSettings object itself.
     */
    public CustomMpiSettings withProcessCount(Integer processCount) {
        this.processCount = processCount;
        return this;
    }

}
