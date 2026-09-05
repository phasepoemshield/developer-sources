/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.TypeConverter;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public class BooleanType
extends Type<Boolean>
implements TypeConverter<Boolean> {
    public BooleanType() {
        super(Boolean.class);
    }

    @Override
    public Boolean from(Object o) {
        if (o instanceof Number) {
            Number number = (Number)o;
            return number.intValue() == 1;
        }
        return (Boolean)o;
    }

    @Override
    public void write(Ops ops, Boolean value) {
        ops.writeBoolean(value.booleanValue());
    }

    @Override
    public void write(ByteBuf buffer, Boolean object) {
        buffer.writeBoolean(object.booleanValue());
    }

    @Override
    public Boolean read(ByteBuf buffer) {
        return buffer.readBoolean();
    }

    public static final class OptionalBooleanType
    extends OptionalType<Boolean> {
        public OptionalBooleanType() {
            super(Types.BOOLEAN);
        }
    }
}

