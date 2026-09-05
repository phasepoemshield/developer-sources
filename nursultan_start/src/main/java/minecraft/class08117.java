/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00183
 *  minecraft.class00951
 *  minecraft.class01073
 *  minecraft.class01080
 *  minecraft.class01081
 *  minecraft.class01089
 *  minecraft.class01092
 *  minecraft.class01677
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02008
 *  minecraft.class02416
 *  minecraft.class03579
 *  minecraft.class04866
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class06176
 *  minecraft.class08212
 *  minecraft.class08290
 *  minecraft.class08388
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08589
 *  minecraft.class08626
 *  minecraft.class08627
 *  minecraft.class08718
 *  minecraft.class08918
 *  minecraft.class08923
 *  minecraft.class09033
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import minecraft.class00183;
import minecraft.class00951;
import minecraft.class01073;
import minecraft.class01080;
import minecraft.class01081;
import minecraft.class01089;
import minecraft.class01092;
import minecraft.class01677;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02008;
import minecraft.class02416;
import minecraft.class03579;
import minecraft.class04866;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class06176;
import minecraft.class08097;
import minecraft.class08104;
import minecraft.class08119;
import minecraft.class08124;
import minecraft.class08126;
import minecraft.class08212;
import minecraft.class08290;
import minecraft.class08388;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08589;
import minecraft.class08626;
import minecraft.class08627;
import minecraft.class08718;
import minecraft.class08918;
import minecraft.class08923;
import minecraft.class09033;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class08117
implements class01081,
class08097,
AutoCloseable,
FabricResourceReloader {
    private static final Logger y = LogUtils.getLogger();
    private static final List<class08126> L = List.of(new class08126(class05911.M, class08589.N, false), new class08126(class05911.L, class08589.y, false), new class08126(class05911.y, class08589.L, false), new class08126(class08626.N, class08589.u, true), new class08126(class08626.y, class08589.i, false), new class08126(class05911.R, class08589.R, false), new class08126(class05911.B, class08589.M, false), new class08126(class05911.Z, class08589.B, false, Set.of(class01677.L)), new class08126(class05911.z, class08589.Z, false), new class08126(class05911.U, class08589.z, false), new class08126(class08626.L, class08589.U, false), new class08126(class05911.u, class08589.E, false), new class08126(class05911.N, class08589.W, false), new class08126(class05911.i, class08589.m, false), new class08126(class05911.E, class08589.P, false));
    public static final class01092<class08124> N = new class01092();
    private final Map<class01894, class08119> u = new HashMap<class01894, class08119>();
    private final Map<class01894, class08119> i = new HashMap<class01894, class08119>();
    private Map<class05913, class08388> R = Map.of();
    private int M;
    private class01894 B;

    public class08117(class08627 class086272, int n) {
        for (class08126 class081262 : L) {
            class08626 class086262 = new class08626(class081262.N());
            class086272.N(class081262.N(), (class08918)class086262);
            class08119 class081192 = new class08119(class086262, class081262);
            this.u.put(class081262.N(), class081192);
            this.i.put(class081262.y(), class081192);
        }
        this.M = n;
    }

    @Override
    public void close() {
        this.R = Map.of();
        this.i.values().forEach(class08119::close);
        this.i.clear();
        this.u.clear();
    }

    private void N(class05913 class059132, CallbackInfoReturnable callbackInfoReturnable) {
        if (callbackInfoReturnable.getReturnValue() != null) {
            SpriteUtil.INSTANCE.markSpriteActive((class08388)callbackInfoReturnable.getReturnValue());
        }
    }

    @Override
    public class08388 N(class05913 class059132) {
        class08388 class083882 = this.R.get(class059132);
        if (class083882 != null) {
            class08388 class083883 = class083882;
            class08388 class083884 = class083883;
            class083884 = new CallbackInfoReturnable("", false, (Object)class083884);
            this.N(class059132, (CallbackInfoReturnable)class083884);
            return class083883;
        }
        class01894 class018942 = class059132.N();
        class08119 class081192 = this.u.get(class018942);
        if (class081192 == null) {
            throw new IllegalArgumentException("Invalid atlas texture id: " + String.valueOf(class018942));
        }
        class08388 class083885 = class081192.N().L();
        class08388 class083886 = class083885;
        class083886 = new CallbackInfoReturnable("", false, (Object)class083886);
        this.N(class059132, (CallbackInfoReturnable)class083886);
        return class083885;
    }

    public void N(int n) {
        this.M = n;
    }

    public void N(BiConsumer<class01894, class08626> biConsumer) {
        this.i.forEach((class018942, class081192) -> biConsumer.accept((class01894)class018942, class081192.N()));
    }

    public class08626 N(class01894 class018942) {
        class08119 class081192 = this.i.get(class018942);
        if (class081192 == null) {
            throw new IllegalArgumentException("Invalid atlas id: " + String.valueOf(class018942));
        }
        return class081192.N();
    }

    private void N(class08124 class081242) {
        this.R = class081242.N();
        HashMap hashMap = new HashMap();
        this.R.forEach((class059132, class083882) -> {
            class08388 class083883;
            if (!class059132.y().equals((Object)class08923.L()) && (class083883 = hashMap.putIfAbsent(class059132.y(), class083882)) != null) {
                y.warn("Duplicate sprite {} from atlas {}, already defined in atlas {}. This will be rejected in a future version", new Object[]{class059132.y(), class059132.N(), class083883.method_45852()});
            }
        });
    }

    public class01894 fabric$getId() {
        if (this.B == null) {
            class08117 class081172 = this;
            this.B = class081172 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (class081172 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (class081172 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (class081172 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (class081172 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (class081172 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (class081172 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (class081172 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (class081172 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (class081172 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (class081172 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (class081172 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (class081172 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (class081172 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (class081172 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (class081172 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (class081172 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (class081172 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + class081172.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.B;
    }

    public CompletableFuture<Void> method_25931(class01073 class010732, Executor executor, class01080 class010802, Executor executor2) {
        class08124 class081242 = (class08124)class010732.N(N);
        class01089 class010892 = class010732.N();
        class081242.N.forEach(class081042 -> class081042.N().N(class010892, executor, this.M).whenComplete((class020082, throwable) -> {
            if (class020082 != null) {
                class081042.y().complete((class02008)class020082);
            } else {
                class081042.y().completeExceptionally((Throwable)throwable);
            }
        }));
        return ((CompletableFuture)class081242.y.thenCompose(arg_0 -> ((class01080)class010802).N(arg_0))).thenAcceptAsync(object -> this.N(class081242), executor2);
    }

    public void prepareSharedState(class01073 class010732) {
        int n = this.i.size();
        ArrayList<class08104> arrayList = new ArrayList<class08104>(n);
        HashMap<class01894, CompletableFuture<class02008>> hashMap = new HashMap<class01894, CompletableFuture<class02008>>(n);
        ArrayList arrayList2 = new ArrayList(n);
        this.i.forEach((class018942, class081192) -> {
            CompletableFuture<class02008> completableFuture = new CompletableFuture<class02008>();
            hashMap.put((class01894)class018942, completableFuture);
            arrayList.add(new class08104((class08119)class081192, completableFuture));
            arrayList2.add(completableFuture.thenCompose(class02008::R));
        });
        CompletableFuture<Void> completableFuture = CompletableFuture.allOf((CompletableFuture[])arrayList2.toArray(CompletableFuture[]::new));
        class010732.N(N, (Object)new class08124(arrayList, hashMap, completableFuture));
    }
}

