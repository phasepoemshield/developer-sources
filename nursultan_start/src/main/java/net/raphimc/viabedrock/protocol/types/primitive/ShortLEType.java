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

public class ShortLEType
extends Type<Short>
implements TypeConverter<Short> {
    public ShortLEType() {
        super("ShortLE", Short.class);
    }

    public Short from(Object o) {
        if (o instanceof Number) {
            return ((Number)o).shortValue();
        }
        if (o instanceof Boolean) {
            return (short)((Boolean)o != false ? 1 : 0);
        }
        return (Short)o;
    }

    public void write(ByteBuf buffer, Short value) {
        this.writePrimitive(buffer, value);
    }

    public Short read(ByteBuf buffer) {
        return this.readPrimitive(buffer);
    }

    public short readPrimitive(ByteBuf buffer) {
        return buffer.readShortLE();
    }

    public void writePrimitive(ByteBuf buffer, short value) {
        buffer.writeShortLE((int)value);
    }
}

