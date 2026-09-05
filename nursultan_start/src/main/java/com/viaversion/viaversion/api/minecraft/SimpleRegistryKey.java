/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.api.minecraft;

import com.viaversion.viaversion.api.minecraft.RegistryKey;
import com.viaversion.viaversion.util.Key;

record SimpleRegistryKey(Key key) implements RegistryKey
{
    public String toString() {
        return this.key.toString();
    }
}

