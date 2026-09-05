/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.yggdrasil.response.NameAndId
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01487
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.response.NameAndId;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class01487;
import org.jspecify.annotations.Nullable;

public final class class08774
extends Record {
    private final UUID id;
    private final String name;
    public static final Codec<class08774> N = RecordCodecBuilder.create(instance -> instance.group((App)class01487.u.fieldOf("id").forGetter(class08774::N), (App)Codec.STRING.fieldOf("name").forGetter(class08774::y)).apply(instance, class08774::new));

    public class08774(UUID uUID, String string) {
        this.id = uUID;
        this.name = string;
    }

    public class08774(NameAndId nameAndId) {
        this(nameAndId.id(), nameAndId.name());
    }

    public class08774(GameProfile gameProfile) {
        this(gameProfile.id(), gameProfile.name());
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08774.class, "id;name", "id", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08774.class, "id;name", "id", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08774.class, "id;name", "id", "name"}, this);
    }

    public String y() {
        return this.name;
    }

    public void y(JsonObject jsonObject) {
        jsonObject.addProperty("uuid", this.N().toString());
        jsonObject.addProperty("name", this.y());
    }

    public static @Nullable class08774 N(JsonObject jsonObject) {
        UUID uUID;
        if (!jsonObject.has("uuid") || !jsonObject.has("name")) {
            return null;
        }
        String string = jsonObject.get("uuid").getAsString();
        try {
            uUID = UUID.fromString(string);
        }
        catch (Throwable throwable) {
            return null;
        }
        return new class08774(uUID, jsonObject.get("name").getAsString());
    }

    public UUID N() {
        return this.id;
    }

    public static class08774 N(String string) {
        UUID uUID = class01487.N((String)string);
        return new class08774(uUID, string);
    }
}

