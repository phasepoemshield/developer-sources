/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.TypeConverter
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.TypeConverter;
import io.netty.buffer.ByteBuf;

public class ShortType
extends Type<Short>
implements TypeConverter<Short> {
    public ShortType() {
        super(Short.class);
    }

    public Short from(Object o) {
        if (o instanceof Number) {
            Number number = (Number)o;
            return number.shortValue();
        }
        if (o instanceof Boolean) {
            Boolean boo = (Boolean)o;
            return boo != false ? (short)1 : 0;
        }
        throw new UnsupportedOperationException();
    }

    public void write(Ops ops, Short value) {
        ops.writeShort(value.shortValue());
    }

    @Deprecated
    public void write(ByteBuf buffer, Short object) {
        buffer.writeShort((int)object.shortValue());
    }

    @Deprecated
    public Short read(ByteBuf buffer) {
        return buffer.readShort();
    }

    public short readPrimitive(ByteBuf buffer) {
        return buffer.readShort();
    }

    public void writePrimitive(ByteBuf buffer, short object) {
        buffer.writeShort((int)object);
    }
}

