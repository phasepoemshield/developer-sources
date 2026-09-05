/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Multimaps
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  minecraft.class00331
 *  minecraft.class00359
 *  minecraft.class00361
 *  minecraft.class00370
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class00951
 *  minecraft.class01073
 *  minecraft.class01079
 *  minecraft.class01080
 *  minecraft.class01081
 *  minecraft.class01089
 *  minecraft.class01140
 *  minecraft.class01587
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02008
 *  minecraft.class02093
 *  minecraft.class02416
 *  minecraft.class02572
 *  minecraft.class02601
 *  minecraft.class02603
 *  minecraft.class03069
 *  minecraft.class03579
 *  minecraft.class03770
 *  minecraft.class04206
 *  minecraft.class04237
 *  minecraft.class04688
 *  minecraft.class04866
 *  minecraft.class05913
 *  minecraft.class06176
 *  minecraft.class07536
 *  minecraft.class07949
 *  minecraft.class08097
 *  minecraft.class08117
 *  minecraft.class08124
 *  minecraft.class08212
 *  minecraft.class08256
 *  minecraft.class08273
 *  minecraft.class08279
 *  minecraft.class08290
 *  minecraft.class08389
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08529
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08589
 *  minecraft.class08627
 *  minecraft.class08694
 *  minecraft.class08700
 *  minecraft.class08718
 *  minecraft.class08836
 *  minecraft.class08874
 *  minecraft.class08881
 *  minecraft.class08887
 *  minecraft.class08890
 *  minecraft.class08906
 *  minecraft.class08910
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey
 *  net.fabricmc.fabric.api.client.model.loading.v1.FabricBakedModelManager
 *  net.fabricmc.fabric.api.client.model.loading.v1.UnbakedModelDeserializer
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.client.model.loading.BakedModelsHooks
 *  net.fabricmc.fabric.impl.client.model.loading.ModelLoadingEventDispatcher
 *  net.fabricmc.fabric.impl.client.model.loading.ModelLoadingPluginManager
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import minecraft.class00144;
import minecraft.class00167;
import minecraft.class00175;
import minecraft.class00181;
import minecraft.class00331;
import minecraft.class00359;
import minecraft.class00361;
import minecraft.class00370;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class00951;
import minecraft.class01073;
import minecraft.class01079;
import minecraft.class01080;
import minecraft.class01081;
import minecraft.class01089;
import minecraft.class01140;
import minecraft.class01587;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02008;
import minecraft.class02093;
import minecraft.class02416;
import minecraft.class02572;
import minecraft.class02601;
import minecraft.class02603;
import minecraft.class03069;
import minecraft.class03579;
import minecraft.class03770;
import minecraft.class04206;
import minecraft.class04237;
import minecraft.class04688;
import minecraft.class04866;
import minecraft.class05913;
import minecraft.class06176;
import minecraft.class07536;
import minecraft.class07949;
import minecraft.class08097;
import minecraft.class08117;
import minecraft.class08124;
import minecraft.class08212;
import minecraft.class08256;
import minecraft.class08273;
import minecraft.class08279;
import minecraft.class08290;
import minecraft.class08389;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08529;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08589;
import minecraft.class08627;
import minecraft.class08694;
import minecraft.class08700;
import minecraft.class08718;
import minecraft.class08836;
import minecraft.class08874;
import minecraft.class08881;
import minecraft.class08887;
import minecraft.class08890;
import minecraft.class08906;
import minecraft.class08910;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey;
import net.fabricmc.fabric.api.client.model.loading.v1.FabricBakedModelManager;
import net.fabricmc.fabric.api.client.model.loading.v1.UnbakedModelDeserializer;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.client.model.loading.BakedModelsHooks;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingEventDispatcher;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingPluginManager;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class00183
implements class01081,
FabricBakedModelManager,
FabricResourceReloader {
    public static final class01894 N = class01894.y((String)"block_or_item");
    private static final Logger y = LogUtils.getLogger();
    private static final class03069 L = class03069.N((String)"models");
    private Map<class01894, class08910> u = Map.of();
    private Map<class01894, class08906> i = Map.of();
    private final class08117 R;
    private final class07949 M;
    private final class03770 B;
    private final class01587 Z;
    private class01140 z = class01140.N;
    private class08836 U = class08836.N;
    private class08881 E;
    private Object2IntMap<class00500> W = Object2IntMaps.emptyMap();
    private volatile @Nullable CompletableFuture m;
    private @Nullable Map P;
    private class01894 s;

    public class08836 L() {
        return this.U;
    }

    private Function L(Function function) {
        CompletableFuture completableFuture = this.m;
        if (completableFuture == null) {
            return function;
        }
        return object -> {
            ModelLoadingEventDispatcher.CURRENT.set((ModelLoadingEventDispatcher)completableFuture.join());
            try {
                Object r = function.apply(object);
                return r;
            }
            finally {
                ModelLoadingEventDispatcher.CURRENT.remove();
            }
        };
    }

    private CompletableFuture L(CompletableFuture completableFuture) {
        return completableFuture.thenCombine((CompletionStage)this.m, (class025722, modelLoadingEventDispatcher) -> modelLoadingEventDispatcher.modifyBlockModelsOnLoad(class025722));
    }

    public @Nullable Object getModel(ExtraModelKey extraModelKey) {
        return this.P == null ? null : this.P.get(extraModelKey);
    }

    public class00183(class01587 class015872, class08117 class081172, class07949 class079492) {
        this.Z = class015872;
        this.R = class081172;
        this.M = class079492;
        this.B = new class03770(this);
    }

    public Supplier<class01140> u() {
        return () -> this.z;
    }

    public class03770 y() {
        return this.B;
    }

    public class08906 y(class01894 class018942) {
        return this.i.getOrDefault(class018942, class08906.N);
    }

    private CompletableFuture y(CompletableFuture completableFuture) {
        return completableFuture.thenCombine((CompletionStage)this.m, (map, modelLoadingEventDispatcher) -> modelLoadingEventDispatcher.modifyModelsOnLoad(map));
    }

    private Function y(Function function) {
        return this.L(function);
    }

    private void N(class01073 class010732, Executor executor, class01080 class010802, Executor executor2, CallbackInfoReturnable callbackInfoReturnable) {
        this.m = ModelLoadingPluginManager.preparePlugins((class01073)class010732, (Executor)executor).thenApplyAsync(ModelLoadingEventDispatcher::new, executor);
    }

    private static void N(Map map, class02572 class025722, class00370 class003702, CallbackInfoReturnable callbackInfoReturnable, class08273 class082732) {
        ModelLoadingEventDispatcher modelLoadingEventDispatcher = (ModelLoadingEventDispatcher)ModelLoadingEventDispatcher.CURRENT.get();
        if (modelLoadingEventDispatcher != null) {
            modelLoadingEventDispatcher.getExtraModels().values().forEach(arg_0 -> ((class08273)class082732).N(arg_0));
        }
    }

    private void N(CallbackInfo callbackInfo, class08890 class088902) {
        this.P = ((BakedModelsHooks)class088902).fabric_getExtraModels();
    }

    private static class04237 N(Reader reader) {
        return null;
    }

    private static Object N(Object object, Reader reader) {
        return UnbakedModelDeserializer.deserialize((Reader)reader);
    }

    private CompletableFuture N(CompletableFuture completableFuture) {
        return completableFuture.thenApplyAsync(void_ -> {
            this.m = null;
            return void_;
        });
    }

    private Function N(Function function) {
        return this.L(function);
    }

    private static Map<class00500, class08887> N(Map<class00500, class08887> map, class08887 class088872) {
        try (class08694 class086942 = class08700.N().i("block state dispatch");){
            IdentityHashMap<class00500, class08887> identityHashMap = new IdentityHashMap<class00500, class08887>(map);
            Object object = class04206.i.iterator();
            while (object.hasNext()) {
                ((class00891)object.next()).E().N().forEach(class005002 -> {
                    if (map.putIfAbsent((class00500)class005002, class088872) == null) {
                        y.warn("Missing model for variant: '{}'", class005002);
                    }
                });
            }
            object = identityHashMap;
            return object;
        }
    }

    private static Object2IntMap<class00500> N(class01587 class015872, class02572 class025722) {
        try (class08694 class086942 = class08700.N().i("block groups");){
            Object2IntMap object2IntMap = class08279.N((class01587)class015872, (class02572)class025722);
            return object2IntMap;
        }
    }

    private void N(class00144 class001442) {
        class08890 class088902 = class001442.N();
        this.u = class088902.L();
        this.i = class088902.u();
        this.W = class001442.y();
        this.E = class088902.N();
        this.B.N(class001442.L());
        this.U = class001442.i();
        this.z = class001442.u();
        this.N(null, class088902);
    }

    public boolean N(class00500 class005002, class00500 class005003) {
        int n;
        if (class005002 == class005003) {
            return false;
        }
        int n2 = this.W.getInt((Object)class005002);
        if (n2 != -1 && n2 == (n = this.W.getInt((Object)class005003))) {
            class04688 class046882;
            class04688 class046883 = class005002.Y();
            return class046883 != (class046882 = class005003.Y());
        }
        return true;
    }

    public class08887 N() {
        return this.E.y();
    }

    public class08910 N(class01894 class018942) {
        return this.u.getOrDefault(class018942, this.E.L());
    }

    private static CompletableFuture<Map<class01894, class00167>> N(class01089 class010892, Executor executor) {
        return CompletableFuture.supplyAsync(() -> L.N(class010892), executor).thenCompose(map -> {
            ArrayList<CompletableFuture<Object>> arrayList = new ArrayList<CompletableFuture<Object>>(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(CompletableFuture.supplyAsync(() -> {
                    Pair pair;
                    block8: {
                        class01894 class018942 = L.y((class01894)entry.getKey());
                        BufferedReader bufferedReader = ((class01079)entry.getValue()).method_43039();
                        try {
                            BufferedReader bufferedReader2 = bufferedReader;
                            bufferedReader2 = class00183.N(bufferedReader2);
                            pair = Pair.of((Object)class018942, (Object)class00183.N(bufferedReader2, bufferedReader));
                            if (bufferedReader == null) break block8;
                        }
                        catch (Throwable throwable) {
                            try {
                                if (bufferedReader != null) {
                                    try {
                                        ((Reader)bufferedReader).close();
                                    }
                                    catch (Throwable throwable2) {
                                        throwable.addSuppressed(throwable2);
                                    }
                                }
                                throw throwable;
                            }
                            catch (Exception exception) {
                                y.error("Failed to load model {}", entry.getKey(), (Object)exception);
                                return null;
                            }
                        }
                        ((Reader)bufferedReader).close();
                    }
                    return pair;
                }, executor));
            }
            return class07536.L(arrayList).thenApply(list -> list.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
        });
    }

    private static class00181 N(Map<class01894, class00167> map, class02572 class025722, class00370 class003702) {
        try (class08694 class086942 = class08700.N().i("dependencies");){
            class08273 class082732 = new class08273(map, class08256.N());
            class082732.N(class02093.y, (class00167)new class02093());
            class025722.N().values().forEach(arg_0 -> ((class08273)class082732).N(arg_0));
            class003702.N().values().forEach(class088392 -> class082732.N((class08389)class088392.N()));
            class08529 class085292 = class082732.N();
            class00183.N(map, class025722, class003702, null, class082732);
            class00181 class001812 = new class00181(class085292, class082732.y());
            return class001812;
        }
    }

    private static CompletableFuture<class00144> N(class02008 class020082, class02008 class020083, class08874 class088742, Object2IntMap<class00500> object2IntMap, class01140 class011402, class08836 class088362, Executor executor) {
        Multimap multimap = Multimaps.synchronizedMultimap((Multimap)HashMultimap.create());
        Multimap multimap2 = Multimaps.synchronizedMultimap((Multimap)HashMultimap.create());
        return class088742.N((class02601)new class00175(class020082, class020083, multimap, multimap2), executor).thenApply(class088902 -> {
            multimap.asMap().forEach((string, collection) -> y.warn("Missing textures in model {}:\n{}", string, (Object)collection.stream().sorted(class05913.N).map(class059132 -> "    " + String.valueOf(class059132.N()) + ":" + String.valueOf(class059132.y())).collect(Collectors.joining("\n"))));
            multimap2.asMap().forEach((string2, collection) -> y.warn("Missing texture references in model {}:\n{}", string2, (Object)collection.stream().sorted().map(string -> "    " + string).collect(Collectors.joining("\n"))));
            Map<class00500, class08887> map = class00183.N((Map<class00500, class08887>)class088902.y(), class088902.N().y());
            return new class00144((class08890)class088902, object2IntMap, map, class011402, class088362);
        });
    }

    private /* synthetic */ CompletionStage N(CompletableFuture completableFuture, CompletableFuture completableFuture2, CompletableFuture completableFuture3, CompletableFuture completableFuture4, CompletableFuture completableFuture5, CompletableFuture completableFuture6, CompletableFuture completableFuture7, CompletableFuture completableFuture8, CompletableFuture completableFuture9, Executor executor, Void void_) {
        class02008 class020082 = (class02008)completableFuture.join();
        class02008 class020083 = (class02008)completableFuture2.join();
        class00181 class001812 = (class00181)((Object)completableFuture3.join());
        Object2IntMap object2IntMap = (Object2IntMap)completableFuture4.join();
        Sets.SetView setView = Sets.difference(((Map)completableFuture5.join()).keySet(), class001812.y().keySet());
        if (!setView.isEmpty()) {
            y.debug("Unreferenced models: \n{}", (Object)setView.stream().sorted().map(class018942 -> "\t" + String.valueOf(class018942) + "\n").collect(Collectors.joining()));
        }
        class08874 class088742 = new class08874((class01140)completableFuture6.join(), (class08097)this.R, this.M, ((class02572)completableFuture7.join()).N(), ((class00370)completableFuture8.join()).N(), class001812.y(), class001812.N());
        return class00183.N(class020082, class020083, class088742, (Object2IntMap<class00500>)object2IntMap, (class01140)completableFuture6.join(), (class08836)completableFuture9.join(), executor);
    }

    public class01894 fabric$getId() {
        if (this.s == null) {
            class00183 class001832 = this;
            this.s = class001832 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (class001832 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (class001832 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (class001832 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (class001832 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (class001832 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (class001832 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (class001832 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (class001832 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (class001832 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (class001832 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (class001832 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (class001832 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (class001832 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (class001832 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (class001832 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (class001832 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (class001832 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + class001832.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.s;
    }

    public final CompletableFuture<Void> method_25931(class01073 class010732, Executor executor, class01080 class010802, Executor executor2) {
        this.N(class010732, executor, class010802, executor2, null);
        class01089 class010892 = class010732.N();
        CompletableFuture<class01140> completableFuture = CompletableFuture.supplyAsync(class01140::N, executor);
        CompletionStage completionStage = completableFuture.thenApplyAsync(class011402 -> class08836.N((class00331)new class00359(class011402, (class08097)this.R, this.M)), executor);
        CompletableFuture completableFuture2 = this.y(class00183.N(class010892, executor));
        CompletableFuture completableFuture3 = this.L(class02603.N((class01089)class010892, (Executor)executor));
        CompletableFuture completableFuture4 = class00361.N((class01089)class010892, (Executor)executor);
        Executor executor3 = executor;
        Function<Void, Object> function = void_ -> class00183.N((Map<class01894, class00167>)((Map)completableFuture2.join()), (class02572)completableFuture3.join(), (class00370)completableFuture4.join());
        CompletionStage completionStage2 = CompletableFuture.allOf(completableFuture2, completableFuture3, completableFuture4).thenApplyAsync(this.N(function), executor3);
        CompletionStage completionStage3 = completableFuture3.thenApplyAsync(class025722 -> class00183.N(this.Z, class025722), executor);
        class08124 class081242 = (class08124)class010732.N(class08117.N);
        CompletableFuture completableFuture5 = class081242.N(class08589.u);
        CompletableFuture completableFuture6 = class081242.N(class08589.i);
        executor3 = executor;
        function = arg_0 -> this.N(completableFuture5, completableFuture6, (CompletableFuture)completionStage2, (CompletableFuture)completionStage3, completableFuture2, completableFuture, completableFuture3, completableFuture4, (CompletableFuture)completionStage, executor, arg_0);
        return this.N((CompletableFuture)((CompletableFuture)((CompletableFuture)CompletableFuture.allOf(new CompletableFuture[]{completableFuture5, completableFuture6, completionStage2, completionStage3, completableFuture3, completableFuture4, completableFuture, completionStage, completableFuture2}).thenComposeAsync(this.y(function), executor3)).thenCompose(arg_0 -> ((class01080)class010802).N(arg_0))).thenAcceptAsync(this::N, executor2));
    }
}

