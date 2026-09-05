/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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

public final class ProfilePropertyType
extends Type<GameProfile.Property> {
    public ProfilePropertyType() {
        super(GameProfile.Property.class);
    }

    public void write(Ops ops, GameProfile.Property value) {
        ops.writeMap(propertyMap -> propertyMap.write("name", Types.STRING, (Object)value.name()).write("value", Types.STRING, (Object)value.value()).writeOptional("signature", Types.STRING, (Object)value.signature()));
    }

    public void write(ByteBuf buffer, GameProfile.Property value) {
        Types.STRING.write(buffer, (Object)value.name());
        Types.STRING.write(buffer, (Object)value.value());
        Types.OPTIONAL_STRING.write(buffer, (Object)value.signature());
    }

    public GameProfile.Property read(ByteBuf buffer) {
        String name = (String)Types.STRING.read(buffer);
        String value = (String)Types.STRING.read(buffer);
        String signature = (String)Types.OPTIONAL_STRING.read(buffer);
        return new GameProfile.Property(name, value, signature);
    }
}

