/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.RegistryKey
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.EitherType
 *  com.viaversion.viaversion.util.Either
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.viaversion.api.minecraft.RegistryKey;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.EitherType;
import com.viaversion.viaversion.util.Either;
import com.viaversion.viaversion.util.Key;

public final class SynchronizedRegistryEitherType
extends EitherType<Integer, String> {
    private final RegistryKey registryKey;

    public SynchronizedRegistryEitherType(RegistryKey registryKey) {
        super((Type)Types.VAR_INT, Types.STRING);
        this.registryKey = registryKey;
    }

    public void write(Ops ops, Either<Integer, String> value) {
        if (value.isLeft()) {
            Key key = ops.context().registryAccess().registryKey(this.registryKey.key().toString(), ((Integer)value.left()).intValue());
            Types.IDENTIFIER.write(ops, (Object)key);
        } else {
            Types.IDENTIFIER.write(ops, (Object)Key.of((String)((String)value.right())));
        }
    }
}

