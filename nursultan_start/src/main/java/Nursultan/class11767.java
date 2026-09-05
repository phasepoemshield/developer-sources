/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09087
 *  Nursultan.class09222
 *  Nursultan.class09322
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11925
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  minecraft.class00189
 *  minecraft.class01631
 *  minecraft.class01894
 *  minecraft.class06202
 *  minecraft.class07536
 *  minecraft.class08893
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09087;
import Nursultan.class09222;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11925;
import Nursultan.class12019;
import Nursultan.class12036;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import minecraft.class00189;
import minecraft.class01631;
import minecraft.class01894;
import minecraft.class06202;
import minecraft.class07536;
import minecraft.class08893;

public class class11767 {
    private static String[] M;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;

    private static Supplier<class01631> L(UUID uUID) {
        AtomicReference<class01631> atomicReference = new AtomicReference<class01631>(class00189.N((UUID)uUID));
        ((CompletableFuture)((CompletableFuture)CompletableFuture.supplyAsync(() -> ((MinecraftSessionService)N_3).fetchProfile(uUID, false), (Executor)class07536.Z()).thenCompose(profileResult -> profileResult != null ? ((class06202)N_2).yP().N(profileResult.profile()) : CompletableFuture.completedFuture(Optional.empty()))).thenAccept(optional -> optional.ifPresent(atomicReference::set))).exceptionally(throwable -> null);
        return atomicReference::get;
    }

    private static void L() {
        M = new String[5];
        class11767.M[0] = "u_projection";
        class11767.M[1] = "u_view";
        class11767.M[2] = "u_size";
        class11767.M[3] = "u_radius";
        class11767.M[4] = "texture_in";
    }

    private class11767() {
    }

    static {
        class11767.y();
        class11767.L();
        class11767.N();
        N_2 = class06202.Nq();
        N_3 = new YggdrasilAuthenticationService(((class06202)N_2).NJ()).createMinecraftSessionService();
        N_4 = new ConcurrentHashMap();
        N_5 = class11213.N((class09087)((class09087)class09063.N_2), (int)4, (int)6);
        N_6 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.y_0).N(4).N()).N((class11213)N_5).N();
    }

    private static void y() {
    }

    public static void N(UUID uUID, String string, float f, float f2, float f3, float f4) {
        class01894 class018942 = class11767.N(uUID, string);
        if (class018942 == null) {
            return;
        }
        GpuTexture gpuTexture = ((class06202)N_2).NO().y(class018942).method_68004();
        if (!(gpuTexture instanceof class08893)) {
            return;
        }
        class08893 class088932 = (class08893)gpuTexture;
        int n = class088932.N();
        class11176.N((class11213)((class11213)N_5), (float)f, (float)f2, (float)f3, (float)f4, (float)0.0f, (float)0.0f, (float)1.0f, (float)1.0f, (int)-1);
        ((class11174)N_6).N((T class093222) -> {
            class093222.z(M[0]).N(class11925.L());
            class093222.z(M[1]).N(RenderSystem.getModelViewMatrix());
            class093222.R(M[2]).N(f3, f4);
            class093222.i(M[3]).N(6.0f * class09222.L());
            class093222.M(M[4]).N(n);
        });
    }

    private static class01894 N(UUID uUID2, String string) {
        class01631 class016312 = uUID2.version() == 4 ? (class01631)((Map)N_4).computeIfAbsent(uUID2, uUID -> class11767.L(uUID)).get() : class00189.N((UUID)uUID2);
        return class016312 != null ? class016312.N().y() : null;
    }

    private static void N() {
        N_0 = 32;
        N_1 = Float.valueOf(6.0f);
    }
}

