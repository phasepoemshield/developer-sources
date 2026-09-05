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

public final class RegistryValueType
extends VarIntType
implements RegistryKey {
    private final Key key;
    private final String[] names;

    public String[] names() {
        return this.names;
    }

    public RegistryValueType(Key key, String ... names) {
        this.key = key;
        this.names = names;
        for (int i = 0; i < names.length; ++i) {
            names[i] = Key.namespaced((String)names[i]);
        }
    }

    @Override
    public void write(Ops ops, Integer value) {
        Types.IDENTIFIER.write(ops, (Object)Key.of((String)this.names[value]));
    }

    public Key key() {
        return this.key;
    }

    public String byId(int id) {
        return this.names[id];
    }
}

