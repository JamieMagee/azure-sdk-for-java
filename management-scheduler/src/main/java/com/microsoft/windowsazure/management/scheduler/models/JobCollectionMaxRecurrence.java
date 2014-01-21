/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.scheduler.models;

public class JobCollectionMaxRecurrence
{
    private JobCollectionRecurrenceFrequency frequency;
    
    /**
    * Defines the maximum recurrences that can be specified in any job in this
    * job collection.
    * @return The Frequency value.
    */
    public JobCollectionRecurrenceFrequency getFrequency()
    {
        return this.frequency;
    }
    
    /**
    * Defines the maximum recurrences that can be specified in any job in this
    * job collection.
    * @param frequencyValue The Frequency value.
    */
    public void setFrequency(final JobCollectionRecurrenceFrequency frequencyValue)
    {
        this.frequency = frequencyValue;
    }
    
    private int interval;
    
    /**
    * Defines the interval.
    * @return The Interval value.
    */
    public int getInterval()
    {
        return this.interval;
    }
    
    /**
    * Defines the interval.
    * @param intervalValue The Interval value.
    */
    public void setInterval(final int intervalValue)
    {
        this.interval = intervalValue;
    }
}