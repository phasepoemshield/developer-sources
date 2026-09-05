/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.viabedrock.protocol.types.primitive;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class UUIDType
extends Type<UUID> {
    public UUIDType() {
        super(UUID.class);
    }

    public void write(ByteBuf buffer, UUID value) {
        buffer.writeLongLE(value.getMostSignificantBits());
        buffer.writeLongLE(value.getLeastSignificantBits());
    }

    public UUID read(ByteBuf buffer) {
        return new UUID(buffer.readLongLE(), buffer.readLongLE());
    }
}

