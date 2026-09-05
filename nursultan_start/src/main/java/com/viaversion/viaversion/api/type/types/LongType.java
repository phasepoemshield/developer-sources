/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.OptionalType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.TypeConverter
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.TypeConverter;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public class LongType
extends Type<Long>
implements TypeConverter<Long> {
    public LongType() {
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

    public void write(Ops ops, Long value) {
        ops.writeLong(value.longValue());
    }

    @Deprecated
    public void write(ByteBuf buffer, Long object) {
        buffer.writeLong(object.longValue());
    }

    @Deprecated
    public Long read(ByteBuf buffer) {
        return buffer.readLong();
    }

    public long readPrimitive(ByteBuf buffer) {
        return buffer.readLong();
    }

    public void writePrimitive(ByteBuf buffer, long object) {
        buffer.writeLong(object);
    }

    public static final class OptionalLongType
    extends OptionalType<Long> {
        public OptionalLongType() {
            super((Type)Types.LONG);
        }
    }
}

