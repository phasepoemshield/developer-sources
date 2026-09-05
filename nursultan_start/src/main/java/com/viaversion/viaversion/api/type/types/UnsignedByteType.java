/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.TypeConverter
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.TypeConverter;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public class UnsignedByteType
extends Type<Short>
implements TypeConverter<Short> {
    public static final int MAX_VALUE = 255;

    public UnsignedByteType() {
        super("Unsigned Byte", Short.class);
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

    public void write(ByteBuf buffer, Short object) {
        buffer.writeByte((int)object.shortValue());
    }

    public void write(Ops ops, Short value) {
        Types.BYTE.write(ops, Byte.valueOf((byte)(value & 0xFF)));
    }

    public Short read(ByteBuf buffer) {
        return buffer.readUnsignedByte();
    }
}

