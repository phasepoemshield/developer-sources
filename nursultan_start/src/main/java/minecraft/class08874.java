/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11660
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.logging.LogUtils
 *  minecraft.class00500
 *  minecraft.class01140
 *  minecraft.class01894
 *  minecraft.class02012
 *  minecraft.class02028
 *  minecraft.class02601
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class06851
 *  minecraft.class07311
 *  minecraft.class07949
 *  minecraft.class08097
 *  minecraft.class08404
 *  minecraft.class08529
 *  minecraft.class08905
 *  minecraft.class08906
 *  minecraft.class08910
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.model.loading.BakedModelsHooks
 *  net.fabricmc.fabric.impl.client.model.loading.ModelLoadingEventDispatcher
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class11660;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import minecraft.class00500;
import minecraft.class01140;
import minecraft.class01894;
import minecraft.class02012;
import minecraft.class02028;
import minecraft.class02601;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class06851;
import minecraft.class07311;
import minecraft.class07949;
import minecraft.class08097;
import minecraft.class08404;
import minecraft.class08529;
import minecraft.class08839;
import minecraft.class08860;
import minecraft.class08881;
import minecraft.class08887;
import minecraft.class08889;
import minecraft.class08890;
import minecraft.class08895;
import minecraft.class08905;
import minecraft.class08906;
import minecraft.class08910;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.model.loading.BakedModelsHooks;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingEventDispatcher;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class08874 {
    public static final class05913 N = class05911.m.N("fire_0");
    public static final class05913 y = class05911.m.N("fire_1");
    public static final class05913 L = class05911.m.N("lava_still");
    public static final class05913 u = class05911.m.N("lava_flow");
    public static final class05913 i = class05911.m.N("water_still");
    public static final class05913 R = class05911.m.N("water_flow");
    public static final class05913 M = class05911.m.N("water_overlay");
    public static final class05913 B = new class05913(class05911.L, class01894.y((String)"entity/banner_base"));
    public static final class05913 Z = new class05913(class05911.u, class01894.y((String)"entity/shield_base"));
    public static final class05913 z = new class05913(class05911.u, class01894.y((String)"entity/shield_base_nopattern"));
    public static final int U = 10;
    public static final List<class01894> E = IntStream.range(0, 10).mapToObj(n -> class01894.y((String)("block/destroy_stage_" + n))).collect(Collectors.toList());
    public static final List<class01894> W = E.stream().map(class018942 -> class018942.N(string -> "textures/" + string + ".png")).collect(Collectors.toList());
    public static final List<class07311> m = W.stream().map(class06851::v).collect(Collectors.toList());
    static final Logger P = LogUtils.getLogger();
    private final class01140 b;
    private final class08097 j;
    private final class07949 v;
    private final Map<class00500, class08889> n;
    private final Map<class01894, class08839> t;
    final Map<class01894, class08529> s;
    final class08529 T;
    private @Nullable ModelLoadingEventDispatcher G;

    public class08874(class01140 class011402, class08097 class080972, class07949 class079492, Map<class00500, class08889> map, Map<class01894, class08839> map2, Map<class01894, class08529> map3, class08529 class085292) {
        this.b = class011402;
        this.j = class080972;
        this.v = class079492;
        this.n = map;
        this.t = map2;
        this.s = map3;
        this.T = class085292;
        this.N((CallbackInfo)null);
    }

    private class08910 N(class08895 class088952, class08905 class089052, Operation operation, class01894 class018942) {
        if (this.G == null) {
            return (class08910)operation.call(new Object[]{class088952, class089052});
        }
        return this.G.modifyItemModel(class088952, class018942, class089052, operation);
    }

    private static class08887 N(class08889 class088892, class00500 class005002, class02028 class020282, Operation operation) {
        ModelLoadingEventDispatcher modelLoadingEventDispatcher = (ModelLoadingEventDispatcher)ModelLoadingEventDispatcher.CURRENT.get();
        if (modelLoadingEventDispatcher == null) {
            return (class08887)operation.call(new Object[]{class088892, class005002, class020282});
        }
        return modelLoadingEventDispatcher.modifyBlockModel(class088892, class005002, class020282, operation);
    }

    private CompletableFuture N(CompletableFuture completableFuture, Executor executor, class08860 class088602) {
        if (this.G == null) {
            return completableFuture;
        }
        CompletableFuture completableFuture2 = class08404.N((Map)this.G.getExtraModels(), (T extraModelKey, U unbakedExtraModel) -> {
            try {
                return unbakedExtraModel.bake((class02028)class088602);
            }
            catch (Exception exception) {
                P.warn("Unable to bake extra model: '{}'", extraModelKey, (Object)exception);
                return null;
            }
        }, (Executor)executor);
        return completableFuture.thenCombine((CompletionStage)completableFuture2, (class088902, map) -> {
            ((BakedModelsHooks)class088902).fabric_setExtraModels(map);
            return class088902;
        });
    }

    private void N(CallbackInfo callbackInfo) {
        this.G = (ModelLoadingEventDispatcher)ModelLoadingEventDispatcher.CURRENT.get();
    }

    private class08910 N(class08895 class088952, class08905 class089052, Operation operation, LocalRef localRef) {
        return this.N(class088952, class089052, operation, (class01894)localRef.get());
    }

    private BiFunction N(BiFunction biFunction) {
        if (this.G == null) {
            return biFunction;
        }
        return (class005002, class088892) -> {
            ModelLoadingEventDispatcher.CURRENT.set(this.G);
            class08887 class088872 = (class08887)biFunction.apply(class005002, class088892);
            ModelLoadingEventDispatcher.CURRENT.remove();
            return class088872;
        };
    }

    public CompletableFuture<class08890> N(class02601 class026012, Executor executor) {
        class11660 class116602 = new class11660();
        class08881 class088812 = class08881.N(this.T, class026012, (class02012)class116602);
        class08860 class088602 = new class08860(this, class026012, (class02012)class116602, class088812);
        Executor executor2 = executor;
        BiFunction<class00500, class08889, class08887> biFunction = (class005002, class088892) -> {
            try {
                return class08874.N(class088892, class005002, class088602, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_1087$class_9979, net.minecraft.class_2680, net.minecraft.class_7775]");
                    Object[] objectArray2 = objectArray;
                    return ((class08889)objectArray[0]).method_65542((class00500)objectArray2[1], (class02028)objectArray2[2]);
                });
            }
            catch (Exception exception) {
                P.warn("Unable to bake model: '{}': {}", class005002, (Object)exception);
                return null;
            }
        };
        CompletableFuture completableFuture = class08404.N(this.n, (BiFunction)this.N(biFunction), (Executor)executor2);
        CompletableFuture completableFuture2 = class08404.N(this.t, (T class018942, U class088392) -> {
            try {
                class08905 class089052 = new class08905((class02028)class088602, this.b, this.j, this.v, class088812.L(), class088392.L());
                class08895 class088952 = class088392.N();
                Operation operation = objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_10439$class_10441, net.minecraft.class_10439$class_10440]");
                    return ((class08895)objectArray[0]).method_65587((class08905)objectArray[1]);
                };
                LocalRefImpl localRefImpl = new LocalRefImpl();
                localRefImpl.init(class018942);
                class018942 = (class01894)localRefImpl.dispose();
                return this.N(class088952, class089052, operation, (LocalRef)localRefImpl);
            }
            catch (Exception exception) {
                P.warn("Unable to bake item model: '{}'", class018942, (Object)exception);
                return null;
            }
        }, (Executor)executor);
        HashMap hashMap = new HashMap(this.t.size());
        this.t.forEach((class018942, class088392) -> {
            class08906 class089062 = class088392.y();
            if (!class089062.equals((Object)class08906.N)) {
                hashMap.put(class018942, class089062);
            }
        });
        return this.N((CompletableFuture)completableFuture.thenCombine((CompletionStage)completableFuture2, (map2, map3) -> new class08890(class088812, (Map<class00500, class08887>)map2, (Map<class01894, class08910>)map3, hashMap)), executor, class088602);
    }
}

