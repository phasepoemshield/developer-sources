/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.GameProfile
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  com.viaversion.viaversion.api.minecraft.ResolvableProfile
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Key
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.minecraft.ResolvableProfile;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Key;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

public final class ResolvableProfileType
extends Type<ResolvableProfile> {
    public ResolvableProfileType() {
        super(ResolvableProfile.class);
    }

    public void write(Ops ops, ResolvableProfile value) {
        String modelType = value.modelType() != null ? (value.modelType() == 0 ? "slim" : "wide") : null;
        ops.writeMap(map -> map.writeInlinedMap(Types.GAME_PROFILE, (Object)value.profile()).writeOptional("texture", Types.IDENTIFIER, value.bodyTexture() != null ? Key.of((String)value.bodyTexture()) : null).writeOptional("cape", Types.IDENTIFIER, value.capeTexture() != null ? Key.of((String)value.capeTexture()) : null).writeOptional("elytra", Types.IDENTIFIER, value.elytraTexture() != null ? Key.of((String)value.elytraTexture()) : null).writeOptional("model", Types.OPTIONAL_STRING, (Object)modelType));
    }

    public void write(ByteBuf buffer, ResolvableProfile value) {
        GameProfile profile = value.profile();
        if (!profile.dynamic()) {
            buffer.writeBoolean(true);
            Types.UUID.write(buffer, (Object)profile.id());
            Types.STRING.write(buffer, (Object)profile.name());
            Types.PROFILE_PROPERTY_ARRAY.write(buffer, (Object)profile.properties());
        } else {
            buffer.writeBoolean(false);
            Types.GAME_PROFILE.write(buffer, (Object)profile);
        }
        Types.OPTIONAL_STRING.write(buffer, (Object)value.bodyTexture());
        Types.OPTIONAL_STRING.write(buffer, (Object)value.capeTexture());
        Types.OPTIONAL_STRING.write(buffer, (Object)value.elytraTexture());
        Types.OPTIONAL_BOOLEAN.write(buffer, value.modelType() != null ? Boolean.valueOf(value.modelType() == 0) : null);
    }

    public ResolvableProfile read(ByteBuf buffer) {
        GameProfile profile;
        if (buffer.readBoolean()) {
            UUID id = (UUID)Types.UUID.read(buffer);
            String name = (String)Types.STRING.read(buffer);
            GameProfile.Property[] properties = (GameProfile.Property[])Types.PROFILE_PROPERTY_ARRAY.read(buffer);
            profile = new GameProfile(name, id, properties, false);
        } else {
            profile = (GameProfile)Types.GAME_PROFILE.read(buffer);
        }
        String texture = (String)Types.OPTIONAL_STRING.read(buffer);
        String capeTexture = (String)Types.OPTIONAL_STRING.read(buffer);
        String elytraTexture = (String)Types.OPTIONAL_STRING.read(buffer);
        Boolean encodedModelType = (Boolean)Types.OPTIONAL_BOOLEAN.read(buffer);
        Integer modelType = encodedModelType != null ? Integer.valueOf(encodedModelType != false ? 0 : 1) : null;
        return new ResolvableProfile(profile, texture, capeTexture, elytraTexture, modelType);
    }
}

