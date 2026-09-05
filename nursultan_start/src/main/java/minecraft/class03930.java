/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.ServicesKeySet
 *  com.mojang.authlib.yggdrasil.ServicesKeyType
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00909
 *  minecraft.class00932
 *  minecraft.class01053
 *  minecraft.class08957
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00909;
import minecraft.class00932;
import minecraft.class01053;
import minecraft.class03962;
import minecraft.class08957;
import org.jspecify.annotations.Nullable;

public final class class03930
extends Record {
    private final MinecraftSessionService sessionService;
    private final ServicesKeySet servicesKeySet;
    private final GameProfileRepository profileRepository;
    private final class08957 nameToIdCache;
    private final class00909 profileResolver;
    private static final String R = "usercache.json";

    public MinecraftSessionService L() {
        return this.sessionService;
    }

    public class00909 M() {
        return this.profileResolver;
    }

    public class03930(MinecraftSessionService minecraftSessionService, ServicesKeySet servicesKeySet, GameProfileRepository gameProfileRepository, class08957 class089572, class00909 class009092) {
        this.sessionService = minecraftSessionService;
        this.servicesKeySet = servicesKeySet;
        this.profileRepository = gameProfileRepository;
        this.nameToIdCache = class089572;
        this.profileResolver = class009092;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03930.class, "sessionService;servicesKeySet;profileRepository;nameToIdCache;profileResolver", "sessionService", "servicesKeySet", "profileRepository", "nameToIdCache", "profileResolver"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03930.class, "sessionService;servicesKeySet;profileRepository;nameToIdCache;profileResolver", "sessionService", "servicesKeySet", "profileRepository", "nameToIdCache", "profileResolver"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03930.class, "sessionService;servicesKeySet;profileRepository;nameToIdCache;profileResolver", "sessionService", "servicesKeySet", "profileRepository", "nameToIdCache", "profileResolver"}, this);
    }

    public GameProfileRepository i() {
        return this.profileRepository;
    }

    public ServicesKeySet u() {
        return this.servicesKeySet;
    }

    public boolean y() {
        return !this.servicesKeySet.keys(ServicesKeyType.PROFILE_KEY).isEmpty();
    }

    public static class03930 N(YggdrasilAuthenticationService yggdrasilAuthenticationService, File file) {
        MinecraftSessionService minecraftSessionService = yggdrasilAuthenticationService.createMinecraftSessionService();
        GameProfileRepository gameProfileRepository = yggdrasilAuthenticationService.createProfileRepository();
        class01053 class010532 = new class01053(gameProfileRepository, new File(file, R));
        class00932 class009322 = new class00932(minecraftSessionService, (class08957)class010532);
        return new class03930(minecraftSessionService, yggdrasilAuthenticationService.getServicesKeySet(), gameProfileRepository, (class08957)class010532, (class00909)class009322);
    }

    public @Nullable class03962 N() {
        return class03962.N(this.servicesKeySet, ServicesKeyType.PROFILE_KEY);
    }

    public class08957 R() {
        return this.nameToIdCache;
    }
}

