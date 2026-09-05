/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.PlayerMessageSignature
 *  com.viaversion.viaversion.api.type.OptionalType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.viaversion.api.minecraft.PlayerMessageSignature;
import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class PlayerMessageSignatureType
extends Type<PlayerMessageSignature> {
    public PlayerMessageSignatureType() {
        super(PlayerMessageSignature.class);
    }

    public void write(ByteBuf buffer, PlayerMessageSignature value) {
        Types.UUID.write(buffer, (Object)value.uuid());
        Types.BYTE_ARRAY_PRIMITIVE.write(buffer, (Object)value.signatureBytes());
    }

    public PlayerMessageSignature read(ByteBuf buffer) {
        return new PlayerMessageSignature((UUID)Types.UUID.read(buffer), (byte[])Types.BYTE_ARRAY_PRIMITIVE.read(buffer));
    }

    public static final class OptionalPlayerMessageSignatureType
    extends OptionalType<PlayerMessageSignature> {
        public OptionalPlayerMessageSignatureType() {
            super(Types.PLAYER_MESSAGE_SIGNATURE);
        }
    }
}

