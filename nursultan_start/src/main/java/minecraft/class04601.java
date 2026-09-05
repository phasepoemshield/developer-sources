/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01631
 *  minecraft.class02689
 *  minecraft.class03933
 *  minecraft.class05096
 *  minecraft.class05097
 *  minecraft.class05111
 *  minecraft.class06202
 *  minecraft.class07536
 *  minecraft.class07923
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01631;
import minecraft.class02689;
import minecraft.class03933;
import minecraft.class04621;
import minecraft.class04633;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05111;
import minecraft.class06202;
import minecraft.class07536;
import minecraft.class07923;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04601 {
    private static final Logger N = LogUtils.getLogger();
    private static final class00392 y = class00392.L((String)"mco.util.time.now");
    private static final int L = 60;
    private static final int u = 3600;
    private static final int i = 86400;

    public static Consumer<class05097> N(Function<class05097, class05096> function, String string) {
        return class04601.N(function).andThen(class050972 -> N.error(string, (Throwable)class050972));
    }

    private static /* synthetic */ void N(class06202 class062022, Function function, class05097 class050972) {
        class062022.execute(() -> class062022.N((class05096)function.apply(class050972)));
    }

    public static Consumer<class05097> N(Function<class05097, class05096> function) {
        return arg_0 -> class04601.N(class06202.Nq(), function, arg_0);
    }

    public static class00392 N(Instant instant) {
        return class04601.N(System.currentTimeMillis() - instant.toEpochMilli());
    }

    public static void N(class01054 class010542, int n, int n2, int n3, UUID uUID) {
        class07923 class079232 = class06202.Nq().Nn().N(class02689.N((UUID)uUID));
        class03933.N((class01054)class010542, (class01631)class079232.y(), (int)n, (int)n2, (int)n3);
    }

    public static <T> CompletableFuture<T> N(class04621<T> class046212, @Nullable Consumer<class05097> consumer) {
        return CompletableFuture.supplyAsync(() -> {
            class05111 class051112 = class05111.N();
            try {
                return class046212.apply(class051112);
            }
            catch (Throwable throwable) {
                if (throwable instanceof class05097) {
                    class05097 class050972 = (class05097)throwable;
                    if (consumer != null) {
                        consumer.accept(class050972);
                    }
                } else {
                    N.error("Unhandled exception", throwable);
                }
                throw new RuntimeException(throwable);
            }
        }, (Executor)class07536.z());
    }

    public static /* bridge */ CompletableFuture<Void> N(class04633 class046332, @Nullable Consumer<class05097> consumer) {
        return class04601.N(class046332, consumer);
    }

    public static class00392 N(long l) {
        if (l < 0L) {
            return y;
        }
        long l2 = l / 1000L;
        if (l2 < 60L) {
            return class00392.N((String)"mco.time.secondsAgo", (Object[])new Object[]{l2});
        }
        if (l2 < 3600L) {
            long l3 = l2 / 60L;
            return class00392.N((String)"mco.time.minutesAgo", (Object[])new Object[]{l3});
        }
        if (l2 < 86400L) {
            long l4 = l2 / 3600L;
            return class00392.N((String)"mco.time.hoursAgo", (Object[])new Object[]{l4});
        }
        long l5 = l2 / 86400L;
        return class00392.N((String)"mco.time.daysAgo", (Object[])new Object[]{l5});
    }
}

