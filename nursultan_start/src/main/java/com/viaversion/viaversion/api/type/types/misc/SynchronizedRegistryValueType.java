/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.RegistryKey
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.viaversion.api.minecraft.RegistryKey;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.VarIntType;
import com.viaversion.viaversion.util.Key;

public final class SynchronizedRegistryValueType
extends VarIntType {
    private final RegistryKey registryKey;

    public SynchronizedRegistryValueType(RegistryKey registryKey) {
        this.registryKey = registryKey;
    }

    @Override
    public void write(Ops ops, Integer value) {
        Key key = ops.context().registryAccess().registryKey(this.registryKey.key().toString(), value.intValue());
        Types.IDENTIFIER.write(ops, (Object)key);
    }
}

