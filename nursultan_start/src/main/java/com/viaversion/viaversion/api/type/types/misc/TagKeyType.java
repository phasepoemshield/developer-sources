/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.KeyType;
import com.viaversion.viaversion.util.Key;

public class TagKeyType
extends KeyType {
    @Override
    public void write(Ops ops, Key value) {
        Types.STRING.write(ops, (Object)("#" + value.toString()));
    }
}

