/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package net.caffeinemc.mods.sodium.api.config;

import minecraft.class01894;

public interface ConfigState {
    public static final class01894 UPDATE_ON_REBUILD = class01894.N((String)"__meta__:update_on_rebuild");
    public static final class01894 UPDATE_ON_APPLY = class01894.N((String)"__meta__:update_on_apply");

    public boolean readBooleanOption(class01894 var1);

    public int readIntOption(class01894 var1);

    public <E extends Enum<E>> E readEnumOption(class01894 var1, Class<E> var2);
}

