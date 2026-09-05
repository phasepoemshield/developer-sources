/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03737;

public final class class03713
extends Record {
    private final GameProfile gameProfile;
    private final int latency;
    private final class03737 clientInformation;
    private final boolean transferred;

    public class03737 L() {
        return this.clientInformation;
    }

    public class03713(GameProfile gameProfile, int n, class03737 class037372, boolean bl) {
        this.gameProfile = gameProfile;
        this.latency = n;
        this.clientInformation = class037372;
        this.transferred = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03713.class, "gameProfile;latency;clientInformation;transferred", "gameProfile", "latency", "clientInformation", "transferred"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03713.class, "gameProfile;latency;clientInformation;transferred", "gameProfile", "latency", "clientInformation", "transferred"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03713.class, "gameProfile;latency;clientInformation;transferred", "gameProfile", "latency", "clientInformation", "transferred"}, this);
    }

    public boolean u() {
        return this.transferred;
    }

    public int y() {
        return this.latency;
    }

    public static class03713 N(GameProfile gameProfile, boolean bl) {
        return new class03713(gameProfile, 0, class03737.N(), bl);
    }

    public GameProfile N() {
        return this.gameProfile;
    }
}

