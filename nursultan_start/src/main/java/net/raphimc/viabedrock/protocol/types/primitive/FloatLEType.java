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

public class FloatLEType
extends Type<Float>
implements TypeConverter<Float> {
    public FloatLEType() {
        super("FloatLE", Float.class);
    }

    public Float from(Object o) {
        if (o instanceof Number) {
            return Float.valueOf(((Number)o).floatValue());
        }
        if (o instanceof Boolean) {
            return Float.valueOf((Boolean)o != false ? 1.0f : 0.0f);
        }
        return (Float)o;
    }

    public void write(ByteBuf buffer, Float value) {
        this.writePrimitive(buffer, value.floatValue());
    }

    public Float read(ByteBuf buffer) {
        return Float.valueOf(this.readPrimitive(buffer));
    }

    public float readPrimitive(ByteBuf buffer) {
        return buffer.readFloatLE();
    }

    public void writePrimitive(ByteBuf buffer, float value) {
        buffer.writeFloatLE(value);
    }
}

