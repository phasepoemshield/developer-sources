/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01487
 *  minecraft.class04770
 *  minecraft.class08774
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;
import minecraft.class01487;
import minecraft.class04770;
import minecraft.class08774;

public final class class07947
extends Record {
    private final Optional<UUID> id;
    private final Optional<String> name;
    public static final MapCodec<class07947> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01487.u.optionalFieldOf("id").forGetter(class07947::N), (App)Codec.STRING.optionalFieldOf("name").forGetter(class07947::y)).apply(instance, class07947::new));

    public class07947(Optional<UUID> optional, Optional<String> optional2) {
        this.id = optional;
        this.name = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07947.class, "id;name", "id", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07947.class, "id;name", "id", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07947.class, "id;name", "id", "name"}, this);
    }

    public Optional<String> y() {
        return this.name;
    }

    public static class07947 N(GameProfile gameProfile) {
        return new class07947(Optional.of(gameProfile.id()), Optional.of(gameProfile.name()));
    }

    public static class07947 N(class08774 class087742) {
        return new class07947(Optional.of(class087742.N()), Optional.of(class087742.y()));
    }

    public Optional<UUID> N() {
        return this.id;
    }

    public static class07947 N(class04770 class047702) {
        return class07947.N(class047702.method_7334());
    }
}

