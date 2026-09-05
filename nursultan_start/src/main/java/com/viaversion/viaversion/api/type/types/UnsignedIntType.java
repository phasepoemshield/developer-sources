/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.TypeConverter
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types;

import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.TypeConverter;
import io.netty.buffer.ByteBuf;

public class UnsignedIntType
extends Type<Long>
implements TypeConverter<Long> {
    public static final long MAX_UNSIGNED_INT = 0xFFFFFFFFL;

    public UnsignedIntType() {
        super(Long.class);
    }

    public Long from(Object o) {
        if (o instanceof Number) {
            Number number = (Number)o;
            return number.longValue();
        }
        if (o instanceof Boolean) {
            Boolean boo = (Boolean)o;
            return boo != false ? 1L : 0L;
        }
        throw new UnsupportedOperationException();
    }

    public void write(ByteBuf buffer, Long l) {
        buffer.writeInt(l.intValue());
    }

    public Long read(ByteBuf buffer) {
        return buffer.readUnsignedInt();
    }

    public long readPrimitive(ByteBuf buffer) {
        return buffer.readUnsignedInt();
    }

    public void writePrimitive(ByteBuf buffer, long l) {
        buffer.writeInt((int)l);
    }
}

