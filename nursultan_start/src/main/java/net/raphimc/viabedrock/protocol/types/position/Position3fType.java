/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.OptionalType
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.model.Position3f
 */
package net.raphimc.viabedrock.protocol.types.position;

import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.model.Position3f;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class Position3fType
extends Type<Position3f> {
    public Position3fType() {
        super("Position3f", Position3f.class);
    }

    public void write(ByteBuf buffer, Position3f value) {
        buffer.writeFloatLE(value.x());
        buffer.writeFloatLE(value.y());
        buffer.writeFloatLE(value.z());
    }

    public Position3f read(ByteBuf buffer) {
        float x = buffer.readFloatLE();
        float y = buffer.readFloatLE();
        float z = buffer.readFloatLE();
        return new Position3f(x, y, z);
    }

    public static final class OptionalPosition3fType
    extends OptionalType<Position3f> {
        public OptionalPosition3fType() {
            super(BedrockTypes.POSITION_3F);
        }
    }
}

