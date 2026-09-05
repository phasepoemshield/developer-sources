/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04782
 */
package net.fabricmc.fabric.api.entity;

import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04782;

final class FakePlayer$FakePlayerKey
extends Record {
    final class04782 world;
    final GameProfile profile;

    FakePlayer$FakePlayerKey(class04782 class047822, GameProfile gameProfile) {
        this.world = class047822;
        this.profile = gameProfile;
    }

    public GameProfile profile() {
        return this.profile;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{FakePlayer$FakePlayerKey.class, "world;profile", "world", "profile"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{FakePlayer$FakePlayerKey.class, "world;profile", "world", "profile"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{FakePlayer$FakePlayerKey.class, "world;profile", "world", "profile"}, this);
    }

    public class04782 world() {
        return this.world;
    }
}

