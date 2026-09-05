/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.model.Position2f
 */
package net.raphimc.viabedrock.protocol.types.position;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.model.Position2f;

public class Position2fType
extends Type<Position2f> {
    public Position2fType() {
        super("Position2f", Position2f.class);
    }

    public void write(ByteBuf buffer, Position2f value) {
        buffer.writeFloatLE(value.x());
        buffer.writeFloatLE(value.y());
    }

    public Position2f read(ByteBuf buffer) {
        float x = buffer.readFloatLE();
        float y = buffer.readFloatLE();
        return new Position2f(x, y);
    }
}

