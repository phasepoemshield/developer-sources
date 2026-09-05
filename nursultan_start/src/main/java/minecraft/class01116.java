/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class01929
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04782
 *  minecraft.class05918
 *  minecraft.class06113
 *  minecraft.class06172
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class07741
 *  minecraft.class08050
 *  minecraft.class08214
 *  minecraft.class08299
 *  minecraft.class08303
 *  minecraft.class08308
 *  minecraft.class08319
 *  minecraft.class08329
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01130;
import minecraft.class01136;
import minecraft.class01929;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04782;
import minecraft.class05918;
import minecraft.class06113;
import minecraft.class06172;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07741;
import minecraft.class08050;
import minecraft.class08214;
import minecraft.class08299;
import minecraft.class08303;
import minecraft.class08308;
import minecraft.class08319;
import minecraft.class08329;
import org.slf4j.Logger;

public class class01116
implements class01136<class07049> {
    private static final Logger N = LogUtils.getLogger();
    private static final String y = "Entities";
    private static final String L = "Position";
    private final class04782 u;
    private final class06172 i;
    private final LongSet R = new LongOpenHashSet();
    private final class08214 M;

    public class01116(class06172 class061722, class04782 class047822, Executor executor) {
        this.i = class061722;
        this.u = class047822;
        this.M = new class08214(executor, "entity-deserializer");
    }

    @Override
    public void close() throws IOException {
        this.i.close();
    }

    private void y(CompletableFuture<?> completableFuture, class07321 class073212) {
        completableFuture.exceptionally(throwable -> {
            N.error("Failed to load entity chunk {}", (Object)class073212, throwable);
            this.u.method_8503().N(throwable, this.i.m(), class073212);
            return null;
        });
    }

    private static class01130<class07049> y(class07321 class073212) {
        return new class01130<class07049>(class073212, List.of());
    }

    @Override
    public void N(class01130<class07049> class011302) {
        class07321 class073212 = class011302.N();
        if (class011302.L()) {
            if (this.R.add(class073212.y())) {
                this.N(this.i.N(class073212, class05918.N), class073212);
            }
            return;
        }
        try (class04495 class044952 = new class04495(class08050.N((class07321)class073212), N);){
            class07741 class077412 = new class07741();
            class011302.y().forEach(class070492 -> {
                class08303 class083032 = class08303.N((class04490)class044952.N_46(class070492.method_71370()), (class01929)class070492.method_56673());
                if (class070492.method_5662((class08329)class083032)) {
                    class07001 class070012 = class083032.y();
                    class077412.add((Object)class070012);
                }
            });
            class07001 class070012 = class07717.i((class07001)new class07001());
            class070012.N(y, (class07709)class077412);
            class070012.N(L, class07321.N, (Object)class073212);
            this.N(this.i.N(class073212, class070012), class073212);
            this.R.remove(class073212.y());
        }
    }

    @Override
    public void N(boolean bl) {
        this.i.y(bl).join();
        this.M.N();
    }

    private void N(CompletableFuture<?> completableFuture, class07321 class073212) {
        completableFuture.exceptionally(throwable -> {
            N.error("Failed to store entity chunk {}", (Object)class073212, throwable);
            this.u.method_8503().y(throwable, this.i.m(), class073212);
            return null;
        });
    }

    @Override
    public CompletableFuture<class01130<class07049>> N(class07321 class073212) {
        if (this.R.contains(class073212.y())) {
            return CompletableFuture.completedFuture(class01116.y(class073212));
        }
        CompletableFuture var2 = this.i.u(class073212);
        this.y(var2, class073212);
        return var2.thenApplyAsync(optional -> {
            class07321 class073213;
            if (optional.isEmpty()) {
                this.R.add(class073212.y());
                return class01116.y(class073212);
            }
            try {
                class073213 = (class07321)((class07001)optional.get()).N_15(L, class07321.N).orElseThrow();
                if (!Objects.equals(class073212, class073213)) {
                    N.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{class073212, class073212, class073213});
                    this.u.method_8503().N(class073213, class073212, this.i.m());
                }
            }
            catch (Exception exception) {
                N.warn("Failed to parse chunk {} position info", (Object)class073212, (Object)exception);
                this.u.method_8503().N((Throwable)exception, this.i.m(), class073212);
            }
            class073213 = this.i.N((class07001)optional.get(), -1);
            try (class04495 class044952 = new class04495(class08050.N((class07321)class073212), N);){
                class08299 class082992 = class08308.N((class04490)class044952, (class01929)this.u.method_30349(), (class07001)class073213);
                class08319 class083192 = class082992.u(y);
                List var7 = class07078.N((class08319)class083192, (class07299)this.u, (class06113)class06113.field_52444).toList();
                class01130 class011302 = new class01130(class073212, var7);
                return class011302;
            }
        }, arg_0 -> ((class08214)this.M).N(arg_0));
    }
}

