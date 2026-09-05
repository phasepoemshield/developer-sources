/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.TypeConverter
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.viabedrock.protocol.types.primitive;

import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.TypeConverter;
import io.netty.buffer.ByteBuf;

public class LongLEType
extends Type<Long>
implements TypeConverter<Long> {
    public LongLEType() {
        super("LongLE", Long.class);
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
        return buffer.readLongLE();
    }

    public void writePrimitive(ByteBuf buffer, long value) {
        buffer.writeLongLE(value);
    }
}

