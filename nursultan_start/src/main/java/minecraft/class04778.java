/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ByteMaps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongConsumer
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  minecraft.class00803
 *  minecraft.class01296
 *  minecraft.class01313
 *  minecraft.class01596
 *  minecraft.class01624
 *  minecraft.class01821
 *  minecraft.class02584
 *  minecraft.class03469
 *  minecraft.class06265
 *  minecraft.class07321
 *  minecraft.class07529
 *  minecraft.class08196
 *  minecraft.class08199
 *  minecraft.class08593
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongConsumer;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import minecraft.class00803;
import minecraft.class01296;
import minecraft.class01313;
import minecraft.class01596;
import minecraft.class01624;
import minecraft.class01821;
import minecraft.class02584;
import minecraft.class03469;
import minecraft.class04745;
import minecraft.class04759;
import minecraft.class04763;
import minecraft.class04766;
import minecraft.class04770;
import minecraft.class06265;
import minecraft.class07321;
import minecraft.class07529;
import minecraft.class08196;
import minecraft.class08199;
import minecraft.class08593;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class04778 {
    private static final Logger B = LogUtils.getLogger();
    static final int N = class03469.N((class04763)class04763.field_13877);
    final Long2ObjectMap<ObjectSet<class04770>> y = new Long2ObjectOpenHashMap();
    private final class01313 Z;
    private final class01821 z;
    final class08593 L;
    private final class04766 U = new class04766(this, 8);
    private final class04759 E = new class04759(this, 32);
    protected final Set<class04745> u = new ReferenceOpenHashSet();
    final class08196 i;
    final LongSet R = new LongOpenHashSet();
    final Executor M;
    private int W = 10;

    public boolean L(long l) {
        return class03469.u((int)this.z.L(l));
    }

    public String L() {
        return this.i.u();
    }

    protected class04778(class08593 class085932, Executor executor, Executor executor2) {
        this.L = class085932;
        this.Z = new class01313(this, class085932);
        this.z = new class01821(class085932);
        class08199 var4 = class08199.N((String)"player ticket throttler", (Executor)executor2);
        this.i = new class08196(var4, executor, 4);
        this.M = executor2;
    }

    private int i() {
        return Math.max(0, class03469.N((class04763)class04763.field_13877) - this.W);
    }

    public class02584 i(long l) {
        this.U.N();
        int n = this.U.L(l);
        if (n <= class00803.L) {
            return class02584.field_52394;
        }
        if (n > 8) {
            return class02584.field_52395;
        }
        return class02584.field_52396;
    }

    public boolean u(long l) {
        return class03469.i((int)this.z.L(l));
    }

    public boolean u() {
        return this.L.y();
    }

    public LongIterator y() {
        this.U.N();
        return this.U.N.keySet().iterator();
    }

    protected abstract @Nullable class04745 y(long var1);

    public void y(int n) {
        if (n != this.W) {
            this.W = n;
            this.L.N(this.i(), class01624.U);
        }
    }

    public void y(class01296 class012962, class04770 class047702) {
        class07321 class073212 = class012962.E();
        long l = class073212.y();
        ObjectSet var6 = (ObjectSet)this.y.get(l);
        var6.remove((Object)class047702);
        if (var6.isEmpty()) {
            this.y.remove(l);
            this.U.y(l, Integer.MAX_VALUE, false);
            this.E.y(l, Integer.MAX_VALUE, false);
            this.L.y(new class01596(class01624.U, this.i()), class073212);
        }
    }

    protected abstract boolean N(long var1);

    public void N(class01296 class012962, class04770 class047702) {
        class07321 class073212 = class012962.E();
        long l2 = class073212.y();
        ((ObjectSet)this.y.computeIfAbsent(l2, l -> new ObjectOpenHashSet())).add((Object)class047702);
        this.U.y(l2, 0, true);
        this.E.y(l2, 0, true);
        this.L.N(new class01596(class01624.U, this.i()), class073212);
    }

    protected abstract @Nullable class04745 N(long var1, int var3, @Nullable class04745 var4, int var5);

    protected void N(int n) {
        this.E.N(n);
    }

    public int N(long l, boolean bl) {
        if (bl) {
            return this.z.L(l);
        }
        return this.Z.L(l);
    }

    public boolean N(class06265 class062652) {
        boolean bl;
        this.U.N();
        this.z.N();
        this.E.N();
        int n = Integer.MAX_VALUE - this.Z.N(Integer.MAX_VALUE);
        boolean bl2 = bl = n != 0;
        if (bl && class07529.H) {
            B.debug("DMU {}", (Object)n);
        }
        if (!this.u.isEmpty()) {
            for (class04745 class047452 : this.u) {
                class047452.N(class062652);
            }
            for (class04745 class047452 : this.u) {
                class047452.N(class062652, this.M);
            }
            this.u.clear();
            return true;
        }
        if (!this.R.isEmpty()) {
            LongIterator longIterator = this.R.iterator();
            while (longIterator.hasNext()) {
                long l = longIterator.nextLong();
                if (!this.L.N(l).stream().anyMatch(class015962 -> class015962.N() == class01624.z)) continue;
                class04745 class047453 = class062652.N(l);
                if (class047453 == null) {
                    throw new IllegalStateException();
                }
                class047453.y().thenAccept(class028182 -> this.M.execute(() -> this.i.N(l, () -> {}, false)));
            }
            this.R.clear();
        }
        return bl;
    }

    public void N(LongConsumer longConsumer) {
        for (Long2ByteMap.Entry entry : Long2ByteMaps.fastIterable((Long2ByteMap)this.z.y)) {
            byte by = entry.getByteValue();
            long l = entry.getLongKey();
            if (!class03469.u((int)by)) continue;
            longConsumer.accept(l);
        }
    }

    public int N() {
        this.U.N();
        return this.U.N.size();
    }
}

