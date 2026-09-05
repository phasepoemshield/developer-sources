/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.GameProfile
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

public final class GameProfileType
extends Type<GameProfile> {
    private static final GameProfile.Property[] EMPTY_PROPERTIES = new GameProfile.Property[0];

    public GameProfileType() {
        super(GameProfile.class);
    }

    public GameProfile read(ByteBuf buffer) {
        String name = (String)Types.OPTIONAL_STRING.read(buffer);
        UUID id = (UUID)Types.OPTIONAL_UUID.read(buffer);
        GameProfile.Property[] properties = (GameProfile.Property[])Types.PROFILE_PROPERTY_ARRAY.read(buffer);
        return new GameProfile(name, id, properties);
    }

    public void write(ByteBuf buffer, GameProfile value) {
        Types.OPTIONAL_STRING.write(buffer, (Object)value.name());
        Types.OPTIONAL_UUID.write(buffer, (Object)value.id());
        Types.PROFILE_PROPERTY_ARRAY.write(buffer, (Object)value.properties());
    }

    public void write(Ops ops, GameProfile value) {
        ops.writeMap(map -> map.writeOptional("name", Types.STRING, (Object)value.name()).writeOptional("id", Types.UUID, (Object)value.id()).writeOptional("properties", Types.PROFILE_PROPERTY_ARRAY, (Object)value.properties(), (Object)EMPTY_PROPERTIES));
    }
}

