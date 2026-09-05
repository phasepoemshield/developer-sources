/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.EitherHolder
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Key
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.viaversion.api.minecraft.EitherHolder;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import com.viaversion.viaversion.util.Key;
import io.netty.buffer.ByteBuf;

public final class EitherHolderType<T>
extends Type<EitherHolder<T>> {
    private final HolderType<T> holderType;

    public EitherHolderType(HolderType<T> holderType) {
        super(EitherHolder.class);
        this.holderType = holderType;
    }

    public static <T> void write(ByteBuf buffer, EitherHolder<T> object, HolderType<T> holderType) {
        if (object.hasHolder()) {
            buffer.writeBoolean(true);
            holderType.write(buffer, object.holder());
        } else {
            buffer.writeBoolean(false);
            Types.STRING.write(buffer, (Object)object.key());
        }
    }

    public static <T> void write(Ops ops, EitherHolder<T> object, HolderType<T> holderType) {
        if (object.hasHolder()) {
            holderType.write(ops, object.holder());
        } else {
            ops.write(Types.IDENTIFIER, (Object)Key.of((String)object.key()));
        }
    }

    public void write(ByteBuf buffer, EitherHolder<T> object) {
        EitherHolderType.write(buffer, object, this.holderType);
    }

    public void write(Ops ops, EitherHolder<T> value) {
        EitherHolderType.write(ops, value, this.holderType);
    }

    public EitherHolder<T> read(ByteBuf buffer) {
        return EitherHolderType.read(buffer, this.holderType);
    }

    public static <T> EitherHolder<T> read(ByteBuf buffer, HolderType<T> holderType) {
        if (buffer.readBoolean()) {
            return EitherHolder.of(holderType.read(buffer));
        }
        return EitherHolder.of((String)((String)Types.STRING.read(buffer)));
    }
}

