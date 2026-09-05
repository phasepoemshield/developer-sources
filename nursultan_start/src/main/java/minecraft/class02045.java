/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class00765
 *  minecraft.class01296
 *  minecraft.class01905
 *  minecraft.class03532
 *  minecraft.class03543
 *  minecraft.class03548
 *  minecraft.class03556
 *  minecraft.class04084
 *  minecraft.class04412
 *  minecraft.class04419
 *  minecraft.class04748
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00765;
import minecraft.class01296;
import minecraft.class01905;
import minecraft.class03532;
import minecraft.class03543;
import minecraft.class03548;
import minecraft.class03556;
import minecraft.class04084;
import minecraft.class04412;
import minecraft.class04419;
import minecraft.class04748;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class02045 {
    private static final Logger N = LogUtils.getLogger();
    private final class04084 y;
    private final class00765 L;
    private final long u;
    private final long i;
    private final Map<class04748, List<class03532>> R = new Object2ObjectOpenHashMap();
    private final Map<class03548, CompletableFuture<List<class07321>>> M = new Object2ObjectArrayMap();
    private boolean B;
    private final List<class03556<class04412>> Z;

    public class04084 L() {
        return this.y;
    }

    private class02045(class04084 class040842, class00765 class007652, long l, long l2, List<class03556<class04412>> list) {
        this.y = class040842;
        this.u = l;
        this.L = class007652;
        this.i = l2;
        this.Z = list;
    }

    private void i() {
        Set var1 = this.L.L();
        this.N().forEach(class035562 -> {
            class04419 class0441922;
            class04412 class044122 = (class04412)class035562.N();
            boolean bl = false;
            for (class04419 class0441922 : class044122.N()) {
                class04748 class047483 = (class04748)class0441922.N().N();
                if (!class047483.y().N().anyMatch(var1::contains)) continue;
                this.R.computeIfAbsent(class047483, class047482 -> new ArrayList()).add(class044122.y());
                bl = true;
            }
            if (bl && (class0441922 = class044122.y()) instanceof class03548) {
                class03548 class035482 = (class03548)class0441922;
                this.M.put(class035482, this.N((class03556<class04412>)class035562, class035482));
            }
        });
    }

    public long u() {
        return this.u;
    }

    public void y() {
        if (!this.B) {
            this.i();
            this.B = true;
        }
    }

    public static class02045 N(class04084 class040842, long l, class00765 class007652, Stream<class03556<class04412>> stream) {
        List list = stream.filter(class035562 -> class02045.N((class04412)class035562.N(), class007652)).toList();
        return new class02045(class040842, class007652, l, 0L, list);
    }

    public List<class03532> N(class03556<class04748> class035562) {
        this.y();
        return this.R.getOrDefault(class035562.N(), List.of());
    }

    public @Nullable List<class07321> N(class03548 class035482) {
        this.y();
        CompletableFuture<List<class07321>> var2 = this.M.get(class035482);
        return var2 != null ? var2.join() : null;
    }

    private CompletableFuture<List<class07321>> N(class03556<class04412> class035562, class03548 class035482) {
        if (class035482.L() == 0) {
            return CompletableFuture.completedFuture(List.of());
        }
        Stopwatch stopwatch = Stopwatch.createStarted((Ticker)class07536.i);
        int n = class035482.N();
        int n2 = class035482.L();
        ArrayList<CompletableFuture<class07321>> arrayList = new ArrayList<CompletableFuture<class07321>>(n2);
        int n3 = class035482.y();
        class03543 var8 = class035482.u();
        class06069 class060692 = class06069.u();
        class060692.N(this.i);
        double d = class060692.U() * Math.PI * 2.0;
        int n4 = 0;
        int n5 = 0;
        for (int i = 0; i < n2; ++i) {
            double d2 = (double)(4 * n + n * n5 * 6) + (class060692.U() - 0.5) * ((double)n * 2.5);
            int n6 = (int)Math.round(Math.cos(d) * d2);
            int n7 = (int)Math.round(Math.sin(d) * d2);
            class06069 class060693 = class060692.y();
            arrayList.add(CompletableFuture.supplyAsync(() -> {
                Pair var5 = this.L.N(class01296.N((int)n6, (int)8), 0, class01296.N((int)n7, (int)8), 112, arg_0 -> ((class03543)var8).N(arg_0), class060693, this.y.y());
                if (var5 != null) {
                    class07209 class072092 = (class07209)var5.getFirst();
                    return new class07321(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()));
                }
                return new class07321(n6, n7);
            }, class07536.B().N("structureRings")));
            d += Math.PI * 2 / (double)n3;
            if (++n4 != n3) continue;
            n4 = 0;
            n3 += 2 * n3 / (++n5 + 1);
            n3 = Math.min(n3, n2 - i);
            d += class060692.U() * Math.PI * 2.0;
        }
        return class07536.L(arrayList).thenApply(list -> {
            double d = (double)stopwatch.stop().elapsed(TimeUnit.MILLISECONDS) / 1000.0;
            N.debug("Calculation for {} took {}s", (Object)class035562, (Object)d);
            return list;
        });
    }

    public List<class03556<class04412>> N() {
        return this.Z;
    }

    public static class02045 N(class04084 class040842, long l, class00765 class007652, class01905<class04412> class019052) {
        List<class03556<class04412>> list = class019052.z().filter(class035292 -> class02045.N((class04412)class035292.N(), class007652)).collect(Collectors.toUnmodifiableList());
        return new class02045(class040842, class007652, l, l, list);
    }

    public boolean N(class03556<class04412> class035562, int n, int n2, int n3) {
        class03532 class035322 = ((class04412)class035562.N()).y();
        for (int i = n - n3; i <= n + n3; ++i) {
            for (int j = n2 - n3; j <= n2 + n3; ++j) {
                if (!class035322.y(this, i, j)) continue;
                return true;
            }
        }
        return false;
    }

    private static boolean N(class04412 class044122, class00765 class007652) {
        return class044122.N().stream().flatMap(class044192 -> ((class04748)class044192.N().N()).y().N()).anyMatch(class007652.L()::contains);
    }
}

