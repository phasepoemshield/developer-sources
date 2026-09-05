/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongList
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  minecraft.class02253
 *  minecraft.class04640
 *  minecraft.class04657
 *  minecraft.class04681
 *  minecraft.class07536
 *  org.apache.commons.lang3.tuple.Pair
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import minecraft.class02253;
import minecraft.class04640;
import minecraft.class04657;
import minecraft.class04681;
import minecraft.class05025;
import minecraft.class07536;
import org.apache.commons.lang3.tuple.Pair;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05011
implements class04657 {
    private static final long N = Duration.ofMillis(100L).toNanos();
    private static final Logger L = LogUtils.getLogger();
    private final List<String> u = Lists.newArrayList();
    private final LongList i = new LongArrayList();
    private final Map<String, class05025> R = Maps.newHashMap();
    private final IntSupplier M;
    private final LongSupplier B;
    private final long Z;
    private final int z;
    private String U = "";
    private boolean E;
    private @Nullable class05025 W;
    private final BooleanSupplier m;
    private final Set<Pair<String, class02253>> P = new ObjectArraySet();

    public void L() {
        if (!this.E) {
            L.error("Cannot pop from profiler if profiler tick hasn't started - missing startTick()?");
            return;
        }
        if (this.i.isEmpty()) {
            L.error("Tried to pop one too many times! Mismatched push() and pop()?");
            return;
        }
        long l = class07536.u();
        long l2 = this.i.removeLong(this.i.size() - 1);
        this.u.removeLast();
        long l3 = l - l2;
        class05025 class050252 = this.R();
        class050252.L += l3;
        ++class050252.u;
        class050252.N = Math.max(class050252.N, l3);
        class050252.y = Math.min(class050252.y, l3);
        if (l3 > N && !this.m.getAsBoolean()) {
            L.warn("Something's taking too long! '{}' took aprox {} ms", LogUtils.defer(() -> class04681.y((String)this.U)), LogUtils.defer(() -> (double)l3 / 1000000.0));
        }
        this.U = this.u.isEmpty() ? "" : (String)this.u.getLast();
        this.W = null;
    }

    public class05011(LongSupplier longSupplier, IntSupplier intSupplier, BooleanSupplier booleanSupplier) {
        this.Z = longSupplier.getAsLong();
        this.B = longSupplier;
        this.z = intSupplier.getAsInt();
        this.M = intSupplier;
        this.m = booleanSupplier;
    }

    public Set<Pair<String, class02253>> i() {
        return this.P;
    }

    public @Nullable class05025 u(String string) {
        return this.R.get(string);
    }

    public class04681 u() {
        return new class04640(this.R, this.Z, this.z, this.B.getAsLong(), this.M.getAsInt());
    }

    public void y() {
        if (!this.E) {
            L.error("Profiler tick already ended - missing startTick()?");
            return;
        }
        this.L();
        this.E = false;
        if (!this.U.isEmpty()) {
            L.error("Profiler tick ended before path was fully popped (remainder: '{}'). Mismatched push/pop?", LogUtils.defer(() -> class04681.y((String)this.U)));
        }
    }

    public void y(String string) {
        this.L();
        this.N(string);
    }

    public void y(Supplier<String> supplier) {
        this.L();
        this.N(supplier);
    }

    public void N() {
        if (this.E) {
            L.error("Profiler tick already started - missing endTick()?");
            return;
        }
        this.E = true;
        this.U = "";
        this.u.clear();
        this.N("root");
    }

    public void N(String string, int n) {
        this.R().i.addTo((Object)string, (long)n);
    }

    public void N(Supplier<String> supplier) {
        this.N(supplier.get());
    }

    public void N(String string) {
        if (!this.E) {
            L.error("Cannot push '{}' to profiler if profiler tick hasn't started - missing startTick()?", (Object)string);
            return;
        }
        if (!this.U.isEmpty()) {
            this.U = this.U + "\u001e";
        }
        this.U = this.U + string;
        this.u.add(this.U);
        this.i.add(class07536.u());
        this.W = null;
    }

    public void N(Supplier<String> supplier, int n) {
        this.R().i.addTo((Object)supplier.get(), (long)n);
    }

    public void N(class02253 class022532) {
        this.P.add((Pair<String, class02253>)Pair.of((Object)this.U, (Object)class022532));
    }

    private class05025 R() {
        if (this.W == null) {
            this.W = this.R.computeIfAbsent(this.U, string -> new class05025());
        }
        return this.W;
    }
}

