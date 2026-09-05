/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig;

import me.shedaniel.autoconfig.ConfigData$ValidationException;

public interface ConfigData {
    default public void validatePostLoad() throws ConfigData$ValidationException {
    }
}

