/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  minecraft.class00751
 *  minecraft.class01073
 *  minecraft.class01079
 *  minecraft.class01080
 *  minecraft.class01081
 *  minecraft.class01089
 *  minecraft.class01214
 *  minecraft.class01711
 *  minecraft.class01894
 *  minecraft.class03069
 *  minecraft.class04227
 *  minecraft.class04478
 *  minecraft.class06482
 *  minecraft.class07684
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08152
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Server
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import minecraft.class00751;
import minecraft.class01073;
import minecraft.class01079;
import minecraft.class01080;
import minecraft.class01081;
import minecraft.class01089;
import minecraft.class01214;
import minecraft.class01711;
import minecraft.class01894;
import minecraft.class03069;
import minecraft.class04227;
import minecraft.class04478;
import minecraft.class05946;
import minecraft.class06482;
import minecraft.class07684;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08152;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.slf4j.Logger;

public class class05961
implements class01081,
FabricResourceReloader {
    private static final Logger y = LogUtils.getLogger();
    public static final class05946<class00751<class07684<class07701>>> N = class05946.N(class01894.y((String)"function"));
    private static final class03069 L = new class03069(class04227.L(N), ".mcfunction");
    private volatile Map<class01894, class07684<class07701>> u = ImmutableMap.of();
    private final class01214<class07684<class07701>> i = new class01214((class018942, bl) -> this.N(class018942), class04227.u(N));
    private volatile Map<class01894, List<class07684<class07701>>> R = Map.of();
    private final class08152 M;
    private final CommandDispatcher<class07701> B;
    private class01894 Z;

    public class05961(class08152 class081522, CommandDispatcher<class07701> commandDispatcher) {
        this.M = class081522;
        this.B = commandDispatcher;
    }

    public Iterable<class01894> y() {
        return this.R.keySet();
    }

    public List<class07684<class07701>> y(class01894 class018942) {
        return this.R.getOrDefault(class018942, List.of());
    }

    public Map<class01894, class07684<class07701>> N() {
        return this.u;
    }

    public Optional<class07684<class07701>> N(class01894 class018942) {
        return Optional.ofNullable(this.u.get(class018942));
    }

    private static List<String> N(class01079 class010792) {
        List var2;
        block8: {
            BufferedReader bufferedReader = class010792.method_43039();
            try {
                var2 = bufferedReader.lines().toList();
                if (bufferedReader == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    throw new CompletionException(iOException);
                }
            }
            bufferedReader.close();
        }
        return var2;
    }

    public class01894 fabric$getId() {
        if (this.Z == null) {
            class05961 var1 = this;
            this.Z = var1 instanceof class06482 ? ResourceReloaderKeys.Server.RECIPES : (var1 instanceof class04478 ? ResourceReloaderKeys.Server.ADVANCEMENTS : (var1 instanceof class05961 ? ResourceReloaderKeys.Server.FUNCTIONS : class01894.y((String)("private/" + var1.getClass().getSimpleName().toLowerCase(Locale.ROOT)))));
        }
        return this.Z;
    }

    public CompletableFuture<Void> method_25931(class01073 class010732, Executor executor, class01080 class010802, Executor executor2) {
        class01089 class010892 = class010732.N();
        CompletableFuture<Map> completableFuture = CompletableFuture.supplyAsync(() -> this.i.N(class010892), executor);
        CompletionStage completionStage = CompletableFuture.supplyAsync(() -> L.N(class010892), executor).thenCompose(map -> {
            HashMap hashMap = Maps.newHashMap();
            class07701 class077012 = class07686.N((class08152)this.M);
            for (Map.Entry entry : map.entrySet()) {
                class01894 class018942 = (class01894)entry.getKey();
                class01894 class018943 = L.y(class018942);
                hashMap.put(class018943, CompletableFuture.supplyAsync(() -> {
                    List<String> var4 = class05961.N((class01079)entry.getValue());
                    return class07684.N((class01894)class018943, this.B, (class01711)class077012, var4);
                }, executor));
            }
            CompletableFuture[] completableFutureArray = hashMap.values().toArray(new CompletableFuture[0]);
            return CompletableFuture.allOf(completableFutureArray).handle((void_, throwable) -> hashMap);
        });
        return ((CompletableFuture)((CompletableFuture)completableFuture.thenCombine(completionStage, Pair::of)).thenCompose(arg_0 -> ((class01080)class010802).N(arg_0))).thenAcceptAsync(pair -> {
            Map map = (Map)pair.getSecond();
            ImmutableMap.Builder builder = ImmutableMap.builder();
            map.forEach((class018942, completableFuture) -> ((CompletableFuture)completableFuture.handle((class076842, throwable) -> {
                if (throwable != null) {
                    y.error("Failed to load function {}", class018942, throwable);
                } else {
                    builder.put(class018942, class076842);
                }
                return null;
            })).join());
            this.u = builder.build();
            this.R = this.i.N((Map)pair.getFirst());
        }, executor2);
    }
}

