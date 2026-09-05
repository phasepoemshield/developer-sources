/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.TypeConverter
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.viabedrock.protocol.types.primitive;

import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.TypeConverter;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public class UnsignedVarLongType
extends Type<Long>
implements TypeConverter<Long> {
    public UnsignedVarLongType() {
        super("UnsignedVarLong", Long.class);
    }

    public Long from(Object o) {
        if (o instanceof Number) {
            return ((Number)o).longValue();
        }
        if (o instanceof Boolean) {
            return (Boolean)o != false ? 1L : 0L;
        }
        return (Long)o;
    }

    public void write(ByteBuf buffer, Long value) {
        this.writePrimitive(buffer, value);
    }

    public Long read(ByteBuf buffer) {
        return this.readPrimitive(buffer);
    }

    public long readPrimitive(ByteBuf buffer) {
        byte in;
        long val = 0L;
        int shift = 0;
        do {
            in = buffer.readByte();
            val |= (long)(in & 0x7F) << shift;
            shift += 7;
        } while ((in & 0x80) != 0);
        return val;
    }

    public void writePrimitive(ByteBuf buffer, long value) {
        Types.VAR_LONG.writePrimitive(buffer, value);
    }
}

