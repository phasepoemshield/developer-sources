/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.ProfileKey
 *  com.viaversion.viaversion.api.type.OptionalType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.viaversion.api.minecraft.ProfileKey;
import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public class ProfileKeyType
extends Type<ProfileKey> {
    public ProfileKeyType() {
        super(ProfileKey.class);
    }

    public void write(ByteBuf buffer, ProfileKey object) {
        buffer.writeLong(object.expiresAt());
        Types.BYTE_ARRAY_PRIMITIVE.write(buffer, (Object)object.publicKey());
        Types.BYTE_ARRAY_PRIMITIVE.write(buffer, (Object)object.keySignature());
    }

    public ProfileKey read(ByteBuf buffer) {
        return new ProfileKey(buffer.readLong(), (byte[])Types.BYTE_ARRAY_PRIMITIVE.read(buffer), (byte[])Types.BYTE_ARRAY_PRIMITIVE.read(buffer));
    }

    public static final class OptionalProfileKeyType
    extends OptionalType<ProfileKey> {
        public OptionalProfileKeyType() {
            super(Types.PROFILE_KEY);
        }
    }
}

