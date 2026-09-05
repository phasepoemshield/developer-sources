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
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class VarIntType
extends Type<Integer>
implements TypeConverter<Integer> {
    public VarIntType() {
        super("VarInt", Integer.class);
    }

    public Integer from(Object o) {
        if (o instanceof Number) {
            return ((Number)o).intValue();
        }
        if (o instanceof Boolean) {
            return (Boolean)o != false ? 1 : 0;
        }
        return (Integer)o;
    }

    public void write(ByteBuf buffer, Integer value) {
        this.writePrimitive(buffer, value);
    }

    public Integer read(ByteBuf buffer) {
        return this.readPrimitive(buffer);
    }

    public int readPrimitive(ByteBuf buffer) {
        int i = BedrockTypes.UNSIGNED_VAR_INT.readPrimitive(buffer);
        return i >>> 1 ^ -(i & 1);
    }

    public void writePrimitive(ByteBuf buffer, int value) {
        BedrockTypes.UNSIGNED_VAR_INT.writePrimitive(buffer, value << 1 ^ value >> 31);
    }
}

