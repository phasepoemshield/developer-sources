/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.OptionalType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.UUIDUtil
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.UUIDUtil;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class UUIDType
extends Type<UUID> {
    public UUIDType() {
        super(UUID.class);
    }

    public void write(Ops ops, UUID value) {
        ops.write(Types.INT_ARRAY_PRIMITIVE, (Object)UUIDUtil.toIntArray((UUID)value));
    }

    public void write(ByteBuf buffer, UUID object) {
        buffer.writeLong(object.getMostSignificantBits());
        buffer.writeLong(object.getLeastSignificantBits());
    }

    public UUID read(ByteBuf buffer) {
        return new UUID(buffer.readLong(), buffer.readLong());
    }

    public static final class OptionalUUIDType
    extends OptionalType<UUID> {
        public OptionalUUIDType() {
            super(Types.UUID);
        }
    }
}

