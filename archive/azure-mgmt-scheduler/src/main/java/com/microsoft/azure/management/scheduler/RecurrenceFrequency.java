/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RecurrenceFrequency.
 */
public enum RecurrenceFrequency {
    /** Enum value Minute. */
    MINUTE("Minute"),

    /** Enum value Hour. */
    HOUR("Hour"),

    /** Enum value Day. */
    DAY("Day"),

    /** Enum value Week. */
    WEEK("Week"),

    /** Enum value Month. */
    MONTH("Month");

    /** The actual serialized value for a RecurrenceFrequency instance. */
    private String value;

    RecurrenceFrequency(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RecurrenceFrequency instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RecurrenceFrequency object, or null if unable to parse.
     */
    @JsonCreator
    public static RecurrenceFrequency fromString(String value) {
        RecurrenceFrequency[] items = RecurrenceFrequency.values();
        for (RecurrenceFrequency item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
