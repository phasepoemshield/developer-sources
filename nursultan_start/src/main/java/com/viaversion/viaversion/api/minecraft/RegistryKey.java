/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.api.minecraft;

import com.viaversion.viaversion.api.minecraft.SimpleRegistryKey;
import com.viaversion.viaversion.util.Key;

public interface RegistryKey {
    public static RegistryKey of(String key) {
        return new SimpleRegistryKey(Key.of((String)key));
    }

    public Key key();
}

