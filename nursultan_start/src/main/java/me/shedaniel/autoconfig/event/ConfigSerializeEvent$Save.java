/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07082
 */
package me.shedaniel.autoconfig.event;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.ConfigHolder;
import minecraft.class07082;

@FunctionalInterface
public interface ConfigSerializeEvent$Save<T extends ConfigData> {
    public class07082 onSave(ConfigHolder<T> var1, T var2);
}

