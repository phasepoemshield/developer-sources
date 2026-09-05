/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10318
 *  Nursultan.class10572
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class00381
 *  minecraft.class00408
 *  minecraft.class00538
 *  minecraft.class00544
 *  minecraft.class00548
 *  minecraft.class00549
 *  minecraft.class00570
 *  minecraft.class00695
 *  minecraft.class00753
 *  minecraft.class01042
 *  minecraft.class01110
 *  minecraft.class01135
 *  minecraft.class01224
 *  minecraft.class01296
 *  minecraft.class01905
 *  minecraft.class02045
 *  minecraft.class02055
 *  minecraft.class02217
 *  minecraft.class02228
 *  minecraft.class02236
 *  minecraft.class02237
 *  minecraft.class02248
 *  minecraft.class02277
 *  minecraft.class02584
 *  minecraft.class02599
 *  minecraft.class02688
 *  minecraft.class02818
 *  minecraft.class03142
 *  minecraft.class03469
 *  minecraft.class03598
 *  minecraft.class04084
 *  minecraft.class04157
 *  minecraft.class04227
 *  minecraft.class04594
 *  minecraft.class04643
 *  minecraft.class04745
 *  minecraft.class04757
 *  minecraft.class04763
 *  minecraft.class04770
 *  minecraft.class04775
 *  minecraft.class04778
 *  minecraft.class04782
 *  minecraft.class04785
 *  minecraft.class04789
 *  minecraft.class04865
 *  minecraft.class04932
 *  minecraft.class04995
 *  minecraft.class05176
 *  minecraft.class05368
 *  minecraft.class05474
 *  minecraft.class05707
 *  minecraft.class05715
 *  minecraft.class05795
 *  minecraft.class05943
 *  minecraft.class05946
 *  minecraft.class06172
 *  minecraft.class06234
 *  minecraft.class06263
 *  minecraft.class06614
 *  minecraft.class06709
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07074
 *  minecraft.class07078
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07321
 *  minecraft.class07344
 *  minecraft.class07361
 *  minecraft.class07371
 *  minecraft.class07536
 *  minecraft.class07878
 *  minecraft.class08050
 *  minecraft.class08088
 *  minecraft.class08199
 *  minecraft.class08201
 *  minecraft.class08214
 *  minecraft.class08593
 *  minecraft.class08700
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents$Unload
 *  net.fabricmc.fabric.mixin.networking.accessor.ChunkMapAccessor
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10318;
import Nursultan.class10572;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class00381;
import minecraft.class00408;
import minecraft.class00538;
import minecraft.class00544;
import minecraft.class00548;
import minecraft.class00549;
import minecraft.class00570;
import minecraft.class00695;
import minecraft.class00753;
import minecraft.class01042;
import minecraft.class01110;
import minecraft.class01135;
import minecraft.class01224;
import minecraft.class01296;
import minecraft.class01905;
import minecraft.class02045;
import minecraft.class02055;
import minecraft.class02217;
import minecraft.class02228;
import minecraft.class02236;
import minecraft.class02237;
import minecraft.class02248;
import minecraft.class02277;
import minecraft.class02584;
import minecraft.class02599;
import minecraft.class02688;
import minecraft.class02818;
import minecraft.class03142;
import minecraft.class03469;
import minecraft.class03598;
import minecraft.class04084;
import minecraft.class04157;
import minecraft.class04227;
import minecraft.class04594;
import minecraft.class04643;
import minecraft.class04745;
import minecraft.class04757;
import minecraft.class04763;
import minecraft.class04770;
import minecraft.class04775;
import minecraft.class04778;
import minecraft.class04782;
import minecraft.class04785;
import minecraft.class04789;
import minecraft.class04865;
import minecraft.class04932;
import minecraft.class04995;
import minecraft.class05176;
import minecraft.class05368;
import minecraft.class05474;
import minecraft.class05707;
import minecraft.class05715;
import minecraft.class05795;
import minecraft.class05943;
import minecraft.class05946;
import minecraft.class06172;
import minecraft.class06234;
import minecraft.class06263;
import minecraft.class06614;
import minecraft.class06709;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07074;
import minecraft.class07078;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07321;
import minecraft.class07344;
import minecraft.class07361;
import minecraft.class07371;
import minecraft.class07536;
import minecraft.class07878;
import minecraft.class08050;
import minecraft.class08088;
import minecraft.class08199;
import minecraft.class08201;
import minecraft.class08214;
import minecraft.class08593;
import minecraft.class08700;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents;
import net.fabricmc.fabric.mixin.networking.accessor.ChunkMapAccessor;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06265
extends class06172
implements class02228,
class04789,
ChunkMapAccessor {
    private static final class02818<List<class08050>> R = class02818.N((String)"Unloaded chunks found in range");
    private static final CompletableFuture<class02818<List<class08050>>> M = CompletableFuture.completedFuture(R);
    private static final byte B = -1;
    private static final byte Z = 0;
    private static final byte z = 1;
    private static final Logger U = LogUtils.getLogger();
    private static final int E = 200;
    private static final int W = 20;
    private static final int m = 10000;
    private static final int P = 128;
    public static final int N = 2;
    public static final int y = 32;
    public static final int L = class03469.N((class04763)class04763.field_13877);
    private final Long2ObjectLinkedOpenHashMap<class04745> s = new Long2ObjectLinkedOpenHashMap();
    private volatile Long2ObjectLinkedOpenHashMap<class04745> T = this.s.clone();
    private final Long2ObjectLinkedOpenHashMap<class04745> b = new Long2ObjectLinkedOpenHashMap();
    private final List<class02217> j = new ArrayList<class02217>();
    public final class04782 u;
    private final class04775 v;
    private final class06709<Runnable> n;
    private final class04084 t;
    private final class02045 G;
    private final class08593 l;
    private final class05368 d;
    final LongSet i = new LongOpenHashSet();
    private boolean w;
    private final class08201 k;
    private final class08201 Y;
    private final class01110 Q;
    private final class06234 O;
    private final String g;
    private final class04757 I = new class04757();
    private final Int2ObjectMap<class10572> J = new Int2ObjectOpenHashMap();
    private final Long2ByteMap o = new Long2ByteOpenHashMap();
    private final Long2LongMap q = new Long2LongOpenHashMap();
    private final LongSet K = new LongLinkedOpenHashSet();
    private final Queue<Runnable> V = Queues.newConcurrentLinkedQueue();
    private final AtomicInteger e = new AtomicInteger();
    private int H;
    private final class02688 c;

    public boolean L(class07049 class070492) {
        class10572 class105722 = (class10572)this.J.get(class070492.method_5628());
        if (class105722 != null) {
            return !class105722.u.isEmpty();
        }
        return false;
    }

    public @Nullable class00549 L(long l) {
        class04745 class047452 = this.y(l);
        return class047452 != null ? class047452.n() : null;
    }

    private void L(BooleanSupplier booleanSupplier) {
        long l = class07536.L();
        int n = 0;
        LongIterator longIterator = this.K.iterator();
        while (n < 20 && this.e.get() < 128 && booleanSupplier.getAsBoolean() && longIterator.hasNext()) {
            class08050 class080502;
            long l2 = longIterator.nextLong();
            class04745 class047452 = (class04745)this.T.get(l2);
            class08050 class080503 = class080502 = class047452 != null ? class047452.s() : null;
            if (class080502 == null || !class080502.U()) {
                longIterator.remove();
                continue;
            }
            if (!this.N(class047452, l)) continue;
            ++n;
            longIterator.remove();
        }
    }

    public CompletableFuture<class02818<class00570>> L(class04745 class047452) {
        return this.N(class047452, 1, class03469::y).thenApply(class028182 -> class028182.N_11(list -> (class00570)list.get(list.size() / 2)));
    }

    public List<class04770> L(class07321 class073212) {
        long l = class073212.y();
        if (!this.O.i(l).y(true)) {
            return List.of();
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (class04770 class047702 : this.I.N()) {
            if (!this.L(class047702, class073212)) continue;
            builder.add((Object)class047702);
        }
        return builder.build();
    }

    private boolean L(class04770 class047702, class07321 class073212) {
        if (class047702.method_7325()) {
            return false;
        }
        return class06265.N(class073212, class047702.method_73189()) < 16384.0;
    }

    protected class04084 L() {
        return this.t;
    }

    private boolean L(class04770 class047702) {
        return class047702.method_7325() && (Boolean)this.u.method_64395().N(class07305.Ny) == false;
    }

    public void M() {
        this.j.forEach(this::N);
        this.j.clear();
    }

    private CompletableFuture<class08050> M(class07321 class073212) {
        CompletionStage completionStage = this.U(class073212).thenApplyAsync(optional -> optional.map(class070012 -> {
            class07344 class073442 = class07344.N((class05474)this.u, (class06614)this.u.method_74142(), (class07001)class070012);
            if (class073442 == null) {
                U.error("Chunk file at {} is missing level data, skipping", (Object)class073212);
            }
            return class073442;
        }), class07536.B().N("parseChunk"));
        CompletableFuture var3 = this.d.N(class073212);
        return ((CompletableFuture)((CompletableFuture)completionStage).thenCombine((CompletionStage)var3, (optional, object) -> optional)).thenApplyAsync(optional -> {
            class08700.N().R("chunkLoad");
            if (optional.isPresent()) {
                class07361 class073612 = ((class07344)optional.get()).N(this.u, this.d, this.m(), class073212);
                this.N(class073212, class073612.E().u());
                return class073612;
            }
            return this.B(class073212);
        }, (Executor)this.n).exceptionallyAsync(throwable -> this.N((Throwable)throwable, class073212), (Executor)this.n);
    }

    public class06265(class04782 class047822, class04785 class047852, DataFixer dataFixer, class01224 class012242, Executor executor, class06709<Runnable> class067092, class00538 class005382, class08088 class080882, class01110 class011102, Supplier<class00408> supplier, class08593 class085932, int n, boolean bl) {
        super(new class02277(class047852.R(), class047822.method_27983(), "chunk"), class047852.N(class047822.method_27983()).resolve("region"), dataFixer, bl, class05715.field_19214, class05176.N((class05946)class047822.method_27983(), supplier, (DataFixer)dataFixer));
        class04865 class048652;
        Path path = class047852.N(class047822.method_27983());
        this.g = path.getFileName().toString();
        this.u = class047822;
        class01042 class010422 = class047822.method_30349();
        long l = class047822.method_8412();
        if (class080882 instanceof class04865) {
            class048652 = (class04865)class080882;
            this.t = class04084.N((class05943)((class05943)class048652.B().N()), (class02055)class010422.L(class04227.yW), (long)l);
        } else {
            this.t = class04084.N((class05943)class05943.i(), (class02055)class010422.L(class04227.yW), (long)l);
        }
        this.G = class080882.N((class01905)class010422.L(class04227.yb), this.t, l);
        this.n = class067092;
        class048652 = new class08214(executor, "worldgen");
        this.Q = class011102;
        class08214 class082142 = new class08214(executor, "light");
        this.k = new class08201((class08199)class048652, executor);
        this.Y = new class08201((class08199)class082142, executor);
        this.v = new class04775(class005382, this, this.u.method_8597().i(), class082142, this.Y);
        this.O = new class06234(this, class085932, executor, class067092);
        this.l = class085932;
        this.d = new class05368(new class02277(class047852.R(), class047822.method_27983(), "poi"), path.resolve("poi"), dataFixer, bl, class010422, (class02599)class047822.method_8503(), (class05474)class047822);
        this.N(n);
        this.c = new class02688(class047822, class080882, class012242, this.v, class067092, this::R);
    }

    private class08050 B(class07321 class073212) {
        this.Z(class073212);
        return new class07361(class073212, class07371.N, (class05474)this.u, this.u.method_74142(), null);
    }

    public int B() {
        return this.T.size();
    }

    public class04778 Z() {
        return this.O;
    }

    private void Z(class07321 class073212) {
        this.o.put(class073212.y(), (byte)-1);
    }

    private void i(class04770 class047702) {
        class10318 class103182;
        class07321 class073212 = class047702.method_31476();
        int n = this.N(class047702);
        class04157 class041572 = class047702.method_52372();
        if (class041572 instanceof class10318 && (class103182 = (class10318)class041572).i().equals((Object)class073212) && class103182.R() == n) {
            return;
        }
        this.N(class047702, class04157.N((class07321)class073212, (int)n));
    }

    public class02236 i(long l) {
        class04745 class047452 = (class04745)this.s.get(l);
        class047452.m();
        return class047452;
    }

    public boolean i() {
        return this.v.au_() || !this.b.isEmpty() || !this.s.isEmpty() || this.d.y() || !this.i.isEmpty() || !this.V.isEmpty() || this.k.N() || this.Y.N() || this.O.u();
    }

    private CompletableFuture<Optional<class07001>> U(class07321 class073212) {
        return this.u(class073212).thenApplyAsync(optional -> optional.map(this::N), class07536.B().N("upgradeChunk"));
    }

    protected class05368 U() {
        return this.d;
    }

    public void close() throws IOException {
        try {
            this.k.close();
            this.Y.close();
            this.d.close();
        }
        finally {
            super.close();
        }
    }

    private boolean z(class07321 class073212) {
        class07001 class070012;
        byte by = this.o.get(class073212.y());
        if (by != 0) {
            return by == 1;
        }
        try {
            class070012 = this.U(class073212).join().orElse(null);
            if (class070012 == null) {
                this.Z(class073212);
                return false;
            }
        }
        catch (Exception exception) {
            U.error("Failed to read chunk {}", (Object)class073212, (Object)exception);
            this.Z(class073212);
            return false;
        }
        class00544 class005442 = class07344.N((class07001)class070012).u();
        return this.N(class073212, class005442) == 1;
    }

    protected void z() {
        for (class04770 class047702 : this.I.N()) {
            this.i(class047702);
        }
        ArrayList arrayList = Lists.newArrayList();
        List var2 = this.u.method_18456();
        for (class10572 class105722 : this.J.values()) {
            boolean bl;
            class01296 class012962 = class105722.L;
            class01296 class012963 = class01296.N((class01135)class105722.y);
            boolean bl2 = bl = !Objects.equals(class012962, class012963);
            if (bl) {
                class105722.N(var2);
                class07049 class070492 = class105722.y;
                if (class070492 instanceof class04770) {
                    arrayList.add((class04770)class070492);
                }
                class105722.L = class012963;
            }
            if (!bl && !class105722.y.field_64356 && !this.O.L(class012963.E().y())) continue;
            class105722.N.N();
        }
        if (!arrayList.isEmpty()) {
            for (class10572 class105722 : this.J.values()) {
                class105722.N((List)arrayList);
            }
        }
    }

    private void u(class04770 class047702) {
        class01296 class012962 = class01296.N((class01135)class047702);
        class047702.method_17668(class012962);
    }

    protected class04775 u() {
        return this.v;
    }

    protected IntSupplier u(long l) {
        return () -> {
            class04745 class047452 = this.y(l);
            if (class047452 == null) {
                return class06263.N - 1;
            }
            return Math.min(class047452.U(), class06263.N - 1);
        };
    }

    public void y(Consumer<class00570> consumer) {
        ObjectIterator var2 = this.T.values().iterator();
        while (var2.hasNext()) {
            class00570 class005702 = ((class04745)var2.next()).i();
            if (class005702 == null) continue;
            consumer.accept(class005702);
        }
    }

    public void y(List<class08050> list2) {
        HashMap<class04770, List> hashMap = new HashMap<class04770, List>();
        for (class08050 class080502 : list2) {
            class00570 class005702;
            class07321 class073212 = class080502.R();
            class00570 class005703 = class080502 instanceof class00570 ? (class005702 = (class00570)class080502) : this.u.method_8497(class073212.B, class073212.Z);
            for (class04770 class047703 : this.N(class073212, false)) {
                hashMap.computeIfAbsent(class047703, class047702 -> new ArrayList()).add(class005703);
            }
        }
        hashMap.forEach((class047702, list) -> class047702.field_13987.method_14364((class00381)class03598.N((List)list)));
    }

    public void y(class04770 class047702) {
        class10572 class1057222;
        for (class10572 class1057222 : this.J.values()) {
            if (class1057222.y == class047702) {
                class1057222.N(this.u.method_18456());
                continue;
            }
            class1057222.y(class047702);
        }
        class01296 class012962 = class047702.method_14232();
        class1057222 = class01296.N((class01135)class047702);
        boolean bl = this.I.i(class047702);
        boolean bl2 = this.L(class047702);
        if (class012962.W() != class1057222.W() || bl != bl2) {
            this.u(class047702);
            if (!bl) {
                this.O.y(class012962, class047702);
            }
            if (!bl2) {
                this.O.N((class01296)class1057222, class047702);
            }
            if (!bl && bl2) {
                this.I.y(class047702);
            }
            if (bl && !bl2) {
                this.I.L(class047702);
            }
            this.i(class047702);
        }
    }

    protected void y(class07049 class070492, class00381<? super class07280> class003812) {
        class10572 class105722 = (class10572)this.J.get(class070492.method_5628());
        if (class105722 != null) {
            class105722.y(class003812);
        }
    }

    protected @Nullable class04745 y(long l) {
        return (class04745)this.T.get(l);
    }

    protected void y(class07049 class070492) {
        class04770 class047702;
        if (class070492 instanceof class04770) {
            class047702 = (class04770)class070492;
            this.N(class047702, false);
            ObjectIterator var3 = this.J.values().iterator();
            while (var3.hasNext()) {
                ((class10572)var3.next()).N(class047702);
            }
        }
        if ((class047702 = (class10572)this.J.remove(class070492.method_5628())) != null) {
            class047702.N();
        }
    }

    boolean y(class07321 class073212) {
        class02584 class025842 = this.O.i(class073212.y());
        if (class025842 == class02584.field_52396) {
            return this.E(class073212);
        }
        return class025842.y(true);
    }

    private boolean y(class04770 class047702, int n, int n2) {
        if (!this.N(class047702, n, n2)) {
            return false;
        }
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                if (i == 0 && j == 0 || this.N(class047702, n + i, n2 + j)) continue;
                return true;
            }
        }
        return false;
    }

    protected class02045 y() {
        return this.G;
    }

    public CompletableFuture<class02818<class00570>> y(class04745 class047452) {
        return this.N(class047452, 1, (int n) -> class00549.m).thenApplyAsync(class028182 -> class028182.N_11(list -> {
            class00570 class005702 = (class00570)list.get(list.size() / 2);
            class005702.N(this.u);
            this.u.method_39223(class005702);
            CompletableFuture var4 = class047452.R();
            if (var4.isDone()) {
                this.N(class047452, class005702);
            } else {
                var4.thenAcceptAsync(object -> this.N(class047452, class005702), (Executor)this.n);
            }
            return class005702;
        }), (Executor)this.n);
    }

    private static void y(class04770 class047702, class07321 class073212) {
        class047702.field_13987.field_45026.N(class047702, class073212);
    }

    private void y(BooleanSupplier booleanSupplier) {
        Runnable runnable;
        LongIterator longIterator = this.i.iterator();
        while (longIterator.hasNext()) {
            long l = longIterator.nextLong();
            class04745 class047452 = (class04745)this.s.get(l);
            if (class047452 != null) {
                this.s.remove(l);
                this.b.put(l, (Object)class047452);
                this.w = true;
                this.N(l, class047452);
            }
            longIterator.remove();
        }
        for (int i = Math.max(0, this.V.size() - 2000); (i > 0 || booleanSupplier.getAsBoolean()) && (runnable = this.V.poll()) != null; --i) {
            runnable.run();
        }
        this.L(booleanSupplier);
    }

    private boolean E(class07321 class073212) {
        for (class04770 class047702 : this.I.N()) {
            if (!this.L(class047702, class073212)) continue;
            return true;
        }
        return false;
    }

    public String E() {
        return this.g;
    }

    protected class08088 N() {
        return this.c.y();
    }

    private void N(class04745 class047452, CompletableFuture completableFuture, long l, CallbackInfo callbackInfo, class08050 class080502) {
        if (class080502 instanceof class00570) {
            class00570 class005702 = (class00570)class080502;
            ((ServerChunkEvents.Unload)ServerChunkEvents.CHUNK_UNLOAD.invoker()).onChunkUnload(this.u, class005702);
        }
    }

    public boolean N(class04770 class047702, int n, int n2) {
        return class047702.method_52372().N(n, n2) && !class047702.field_13987.field_45026.N(class07321.u((int)n, (int)n2));
    }

    public @Nullable class04745 N(long l) {
        return (class04745)this.s.get(l);
    }

    private void N(class04770 class047702, class07321 class073212) {
        class00570 class005702 = this.R(class073212.y());
        if (class005702 != null) {
            class06265.N(class047702, class005702);
        }
    }

    public int N(class04770 class047702) {
        return class04995.N((int)class047702.method_52371(), (int)2, (int)this.H);
    }

    protected void N(int n) {
        int n2 = class04995.N((int)n, (int)2, (int)32);
        if (n2 != this.H) {
            this.H = n2;
            this.O.N(this.H);
            for (class04770 class047702 : this.I.N()) {
                this.i(class047702);
            }
        }
    }

    private boolean N(class08050 class080502) {
        this.d.y(class080502.R());
        if (!class080502.z()) {
            return false;
        }
        class07321 class073212 = class080502.R();
        try {
            class00549 class005492 = class080502.E();
            if (class005492.u() != class00544.field_12807) {
                if (this.z(class073212)) {
                    return false;
                }
                if (class005492 == class00549.L && class080502.M().values().stream().noneMatch(class04932::y)) {
                    return false;
                }
            }
            class08700.N().R("chunkSave");
            this.e.incrementAndGet();
            CompletableFuture<class07001> completableFuture = CompletableFuture.supplyAsync(() -> ((class07344)class07344.N((class04782)this.u, (class08050)class080502)).N(), (Executor)class07536.B());
            this.N(class073212, completableFuture::join).handle((void_, throwable) -> {
                if (throwable != null) {
                    this.u.method_8503().y(throwable, this.m(), class073212);
                }
                this.e.decrementAndGet();
                return null;
            });
            this.N(class073212, class005492.u());
            return true;
        }
        catch (Exception exception) {
            this.u.method_8503().y((Throwable)exception, this.m(), class073212);
            return false;
        }
    }

    private boolean N(class04745 class047452, long l) {
        if (!class047452.E() || !class047452.B()) {
            return false;
        }
        class08050 class080502 = class047452.s();
        if (class080502 instanceof class00548 || class080502 instanceof class00570) {
            if (!class080502.U()) {
                return false;
            }
            long l2 = class080502.R().y();
            long l3 = this.q.getOrDefault(l2, -1L);
            if (l < l3) {
                return false;
            }
            boolean bl = this.N(class080502);
            class047452.W();
            if (bl) {
                this.q.put(l2, l + 10000L);
            }
            return bl;
        }
        return false;
    }

    Stream<class04745> N(class00549 class005492) {
        int n = class03469.N((class00549)class005492);
        return this.T.values().stream().filter(class047452 -> class047452.z() <= n);
    }

    private class07001 N(class07001 class070012) {
        return this.N(class070012, -1, class06265.N((class05946<class07299>)this.u.method_27983(), this.N().L()));
    }

    private static String N(CompletableFuture<class02818<class00570>> completableFuture) {
        try {
            class02818 class028182 = completableFuture.getNow(null);
            if (class028182 != null) {
                return class028182.N() ? "done" : "unloaded";
            }
            return "not completed";
        }
        catch (CompletionException completionException) {
            return "failed " + completionException.getCause().getMessage();
        }
        catch (CancellationException cancellationException) {
            return "cancelled";
        }
    }

    void N(Writer writer) throws IOException {
        class04594 class045942 = class04594.N().N("x").N("z").N("level").N("in_memory").N("status").N("full_status").N("accessible_ready").N("ticking_ready").N("entity_ticking_ready").N("ticket").N("spawning").N("block_entity_count").N("ticking_ticket").N("ticking_level").N("block_ticks").N("fluid_ticks").N(writer);
        for (Long2ObjectMap.Entry entry : this.T.long2ObjectEntrySet()) {
            long l = entry.getLongKey();
            class07321 class073212 = new class07321(l);
            class04745 class047452 = (class04745)entry.getValue();
            Optional<class08050> optional = Optional.ofNullable(class047452.s());
            Optional<Object> optional2 = optional.flatMap(class080502 -> class080502 instanceof class00570 ? Optional.of((class00570)class080502) : Optional.empty());
            class045942.N(new Object[]{class073212.B, class073212.Z, class047452.z(), optional.isPresent(), optional.map(class08050::E).orElse(null), optional2.map(class00570::g).orElse(null), class06265.N(class047452.L()), class06265.N(class047452.N()), class06265.N(class047452.y()), this.l.y(l, false), this.y(class073212), optional2.map(class005702 -> class005702.o().size()).orElse(0), this.l.y(l, true), this.O.N(l, true), optional2.map(class005702 -> class005702.P().N()).orElse(0), optional2.map(class005702 -> class005702.s().N()).orElse(0)});
        }
    }

    private void N(long l, class04745 class047452) {
        CompletableFuture var4 = class047452.M();
        ((CompletableFuture)var4.thenRunAsync(() -> {
            if (class047452.M() != var4) {
                this.N(l, class047452);
                return;
            }
            class08050 class080502 = class047452.s();
            if (this.b.remove(l, (Object)class047452) && class080502 != null) {
                class00570 class005702;
                if (class080502 instanceof class00570) {
                    class005702 = (class00570)class080502;
                    class005702.y(false);
                }
                this.N(class047452, var4, l, null, class080502);
                this.N(class080502);
                if (class080502 instanceof class00570) {
                    class005702 = (class00570)class080502;
                    this.u.method_18764(class005702);
                }
                this.v.N(class080502.R());
                this.v.y();
                this.q.remove(class080502.R().y());
            }
        }, this.V::add)).whenComplete((void_, throwable) -> {
            if (throwable != null) {
                U.error("Failed to save chunk {}", (Object)class047452.b(), throwable);
            }
        });
    }

    private static void N(class04770 class047702, class00570 class005702) {
        class047702.field_13987.field_45026.N(class005702);
    }

    public CompletableFuture<class08050> N(class02236 class022362, class02237 class022372, class02248<class02236> class022482) {
        class07321 class073212 = class022362.b();
        if (class022372.N() == class00549.L) {
            return this.M(class073212);
        }
        try {
            class02236 class022363 = (class02236)class022482.N(class073212.B, class073212.Z);
            class08050 class080502 = class022363.N(class022372.N().L());
            if (class080502 == null) {
                throw new IllegalStateException("Parent chunk missing");
            }
            return class022372.N(this.c, class022482, class080502);
        }
        catch (Exception exception) {
            exception.getStackTrace();
            class07080 class070802 = class07080.N((Throwable)exception, (String)"Exception generating new chunk");
            class07074 class070742 = class070802.N("Chunk to be generated");
            class070742.N("Status being generated", () -> class022372.N().R());
            class070742.N("Location", (Object)String.format(Locale.ROOT, "%d,%d", class073212.B, class073212.Z));
            class070742.N("Position hash", (Object)class07321.u((int)class073212.B, (int)class073212.Z));
            class070742.N("Generator", (Object)this.N());
            this.n.execute(() -> {
                throw new class07878(class070802);
            });
            throw new class07878(class070802);
        }
    }

    public void N(class02236 class022362) {
        class022362.P();
    }

    private byte N(class07321 class073212, class00544 class005442) {
        return this.o.put(class073212.y(), class005442 == class00544.field_12808 ? (byte)-1 : 1);
    }

    private class08050 N(Throwable throwable, class07321 class073212) {
        boolean bl;
        Throwable throwable2;
        Throwable throwable3;
        Throwable throwable4;
        if (throwable instanceof CompletionException) {
            throwable4 = (CompletionException)throwable;
            v0 = throwable4.getCause();
        } else {
            v0 = throwable3 = throwable;
        }
        if (throwable3 instanceof class07878) {
            class07878 class078782 = (class07878)throwable3;
            throwable2 = class078782.getCause();
        } else {
            throwable2 = throwable3;
        }
        throwable4 = throwable2;
        boolean bl2 = throwable4 instanceof Error;
        boolean bl3 = bl = throwable4 instanceof IOException || throwable4 instanceof class03142;
        if (!bl2) {
            if (!bl) {
                // empty if block
            }
        } else {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Exception loading chunk");
            class070802.N("Chunk being loaded").N("pos", (Object)class073212);
            this.Z(class073212);
            throw new class07878(class070802);
        }
        this.u.method_8503().N(throwable4, this.m(), class073212);
        return this.B(class073212);
    }

    private void N(class07321 class073212, IntSupplier intSupplier, int n, IntConsumer intConsumer) {
        this.k.method_17209(class073212, intSupplier, n, intConsumer);
        this.Y.method_17209(class073212, intSupplier, n, intConsumer);
    }

    public CompletableFuture<class02818<class00570>> N(class04745 class047452) {
        return this.N(class047452, 2, (int n) -> class00549.m).thenApply(class028182 -> class028182.N_11(list -> (class00570)list.get(list.size() / 2)));
    }

    private void N(class04745 class047452, class00570 class005702) {
        class07321 class073212 = class005702.R();
        for (class04770 class047702 : this.I.N()) {
            if (!class047702.method_52372().N(class073212)) continue;
            class06265.N(class047702, class005702);
        }
        this.u.method_14178().N(class047452);
        this.u.method_74535().N(class005702);
    }

    @Nullable class04745 N(long l, int n, @Nullable class04745 class047452, int n2) {
        if (!class03469.R((int)n2) && !class03469.R((int)n)) {
            return class047452;
        }
        if (class047452 != null) {
            class047452.N(n);
        }
        if (class047452 != null) {
            if (!class03469.R((int)n)) {
                this.i.add(l);
            } else {
                this.i.remove(l);
            }
        }
        if (class03469.R((int)n) && class047452 == null) {
            class047452 = (class04745)this.b.remove(l);
            if (class047452 != null) {
                class047452.N(n);
            } else {
                class047452 = new class04745(new class07321(l), n, (class05474)this.u, (class05795)this.v, this::N, (class04789)this);
            }
            this.s.put(l, (Object)class047452);
            this.w = true;
        }
        return class047452;
    }

    private void N(class02217 class022172) {
        class02236 class022362 = class022172.L();
        this.k.N(() -> {
            CompletableFuture var2 = class022172.N();
            if (var2 == null) {
                return;
            }
            var2.thenRun(() -> this.N(class022172));
        }, class022362.b().y(), () -> ((class02236)class022362).U());
    }

    public class02217 N(class00549 class005492, class07321 class073212) {
        class02217 class022172 = class02217.N((class02228)this, (class00549)class005492, (class07321)class073212);
        this.j.add(class022172);
        return class022172;
    }

    public void N(class07049 class070492, class00381<? super class07280> class003812, Predicate<class04770> predicate) {
        class10572 class105722 = (class10572)this.J.get(class070492.method_5628());
        if (class105722 != null) {
            class105722.N(class003812, predicate);
        }
    }

    public void N(class07049 class070492, class00381<? super class07280> class003812) {
        class10572 class105722 = (class10572)this.J.get(class070492.method_5628());
        if (class105722 != null) {
            class105722.N(class003812);
        }
    }

    protected void N(class07049 class070492) {
        if (class070492 instanceof class00695) {
            return;
        }
        class07078 var2 = class070492.method_5864();
        int n = var2.W() * 16;
        if (n == 0) {
            return;
        }
        int n2 = var2.m();
        if (this.J.containsKey(class070492.method_5628())) {
            throw (IllegalStateException)class07536.y((Throwable)new IllegalStateException("Entity is already tracked!"));
        }
        class10572 class105722 = new class10572(this, class070492, n, n2, var2.P());
        this.J.put(class070492.method_5628(), (Object)class105722);
        class105722.N(this.u.method_18456());
        if (class070492 instanceof class04770) {
            class04770 class047702 = (class04770)class070492;
            this.N(class047702, true);
            for (class10572 class105723 : this.J.values()) {
                if (class105723.y == class047702) continue;
                class105723.y(class047702);
            }
        }
    }

    public List<class04770> N(class07321 class073212, boolean bl) {
        Set var3 = this.I.N();
        ImmutableList.Builder builder = ImmutableList.builder();
        for (class04770 class047702 : var3) {
            if ((!bl || !this.y(class047702, class073212.B, class073212.Z)) && (bl || !this.N(class047702, class073212.B, class073212.Z))) continue;
            builder.add((Object)class047702);
        }
        return builder.build();
    }

    private void N(class04770 class047702, class04157 class041572) {
        if (class047702.method_51469() != this.u) {
            return;
        }
        class04157 class041573 = class047702.method_52372();
        if (class041572 instanceof class10318) {
            class10318 class103182 = (class10318)class041572;
            if (!(class041573 instanceof class10318) || !((class10318)class041573).i().equals((Object)class103182.i())) {
                class047702.field_13987.method_14364((class00381)new class05707(class103182.i().B, class103182.i().Z));
            }
        }
        class04157.N((class04157)class041573, (class04157)class041572, class073212 -> this.N(class047702, (class07321)class073212), class073212 -> class06265.y(class047702, class073212));
        class047702.method_52373(class041572);
    }

    public void N(class07321 class073213, int n) {
        int n2 = n + 1;
        class07321.N((class07321)class073213, (int)n2).forEach(class073212 -> {
            class04745 class047452 = this.y(class073212.y());
            if (class047452 != null) {
                class047452.N(this.v.N(class073212.B, class073212.Z));
            }
        });
    }

    protected void N(boolean bl) {
        if (bl) {
            List var2 = this.T.values().stream().filter(class04745::E).peek(class04745::W).toList();
            MutableBoolean mutableBoolean = new MutableBoolean();
            do {
                mutableBoolean.setFalse();
                var2.stream().map(class047452 -> {
                    this.n.y(() -> ((class04745)class047452).B());
                    return class047452.s();
                }).filter(class080502 -> class080502 instanceof class00548 || class080502 instanceof class00570).filter(this::N).forEach(class080502 -> mutableBoolean.setTrue());
            } while (mutableBoolean.isTrue());
            this.d.N();
            this.y(() -> true);
            this.y(true).join();
        } else {
            this.q.clear();
            long l = class07536.L();
            for (class04745 class047453 : this.T.values()) {
                this.N(class047453, l);
            }
        }
    }

    void N(class07321 class073212, class04763 class047632) {
        this.Q.onChunkStatusChange(class073212, class047632);
    }

    protected void N(BooleanSupplier booleanSupplier) {
        class04643 class046432 = class08700.N();
        class046432.N("poi");
        this.d.N(booleanSupplier);
        class046432.y("chunk_unload");
        if (!this.u.method_8458()) {
            this.y(booleanSupplier);
        }
        class046432.L();
    }

    public void N(class04770 class047702, Consumer<class07049> consumer) {
        for (class10572 class105722 : this.J.values()) {
            if (!class105722.u.contains(class047702.field_13987)) continue;
            consumer.accept(class105722.y);
        }
    }

    public class07878 N(IllegalStateException illegalStateException, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        Consumer<class04745> consumer = class047452 -> class047452.v().forEach(pair -> {
            class00549 class005492 = (class00549)pair.getFirst();
            CompletableFuture completableFuture = (CompletableFuture)pair.getSecond();
            if (completableFuture != null && completableFuture.isDone() && completableFuture.join() == null) {
                stringBuilder.append(class047452.b()).append(" - status: ").append(class005492).append(" future: ").append(completableFuture).append(System.lineSeparator());
            }
        });
        stringBuilder.append("Updating:").append(System.lineSeparator());
        this.s.values().forEach(consumer);
        stringBuilder.append("Visible:").append(System.lineSeparator());
        this.T.values().forEach(consumer);
        class07080 class070802 = class07080.N((Throwable)illegalStateException, (String)"Chunk loading");
        class07074 class070742 = class070802.N("Chunk loading");
        class070742.N("Details", (Object)string);
        class070742.N("Futures", (Object)stringBuilder);
        return new class07878(class070802);
    }

    boolean N(class07209 class072092, int n) {
        class06889 class068892 = new class06889((class00753)class072092);
        for (class04770 class047702 : this.I.N()) {
            if (!this.N(class047702, class068892, n)) continue;
            return true;
        }
        return false;
    }

    void N(Consumer<class00570> consumer) {
        this.O.N(l -> {
            class04745 class047452 = (class04745)this.T.get(l);
            if (class047452 == null) {
                return;
            }
            class00570 class005702 = class047452.u();
            if (class005702 == null) {
                return;
            }
            consumer.accept(class005702);
        });
    }

    void N(List<class00570> list) {
        LongIterator longIterator = this.O.y();
        while (longIterator.hasNext()) {
            class00570 class005702;
            class04745 class047452 = (class04745)this.T.get(longIterator.nextLong());
            if (class047452 == null || (class005702 = class047452.u()) == null || !this.E(class047452.b())) continue;
            list.add(class005702);
        }
    }

    public static class07001 N(class05946<class07299> class059463, Optional<class05946<MapCodec<? extends class08088>>> optional) {
        class07001 class070012 = new class07001();
        class070012.N_67("dimension", class059463.N().toString());
        optional.ifPresent(class059462 -> class070012.N_67("generator", class059462.N().toString()));
        return class070012;
    }

    void N(class04770 class047702, boolean bl) {
        boolean bl2 = this.L(class047702);
        boolean bl3 = this.I.u(class047702);
        if (bl) {
            this.I.N(class047702, bl2);
            this.u(class047702);
            if (!bl2) {
                this.O.N(class01296.N((class01135)class047702), class047702);
            }
            class047702.method_52373(class04157.N);
            this.i(class047702);
        } else {
            class01296 class012962 = class047702.method_14232();
            this.I.N(class047702);
            if (!bl3) {
                this.O.y(class012962, class047702);
            }
            this.N(class047702, class04157.N);
        }
    }

    public String N(class07321 class073212) {
        class04745 class047452 = this.y(class073212.y());
        if (class047452 == null) {
            return "null";
        }
        String string = class047452.z() + "\n";
        class00549 class005492 = class047452.n();
        class08050 class080502 = class047452.s();
        if (class005492 != null) {
            string = string + "St: \u00a7" + class005492.y() + String.valueOf(class005492) + "\u00a7r\n";
        }
        if (class080502 != null) {
            string = string + "Ch: \u00a7" + class080502.E().y() + String.valueOf(class080502.E()) + "\u00a7r\n";
        }
        class04763 class047632 = class047452.j();
        string = string + String.valueOf('\u00a7') + class047632.ordinal() + String.valueOf(class047632);
        return string + "\u00a7r";
    }

    private static double N(class07321 class073212, class06889 class068892) {
        double d = class01296.N((int)class073212.B, (int)8);
        double d2 = class01296.N((int)class073212.Z, (int)8);
        double d3 = d - class068892.M;
        double d4 = d2 - class068892.Z;
        return d3 * d3 + d4 * d4;
    }

    private boolean N(class04770 class047702, class06889 class068892, int n) {
        if (class047702.method_7325()) {
            return false;
        }
        return class047702.method_73189().R(class068892) < (double)n;
    }

    CompletableFuture<class02818<List<class08050>>> N(class04745 class047452, int n, IntFunction<class00549> intFunction) {
        if (n == 0) {
            class00549 class005492 = intFunction.apply(0);
            return class047452.N(class005492, this).thenApply(class028182 -> class028182.N_11(List::of));
        }
        int n2 = class04995.Z((int)(n * 2 + 1));
        ArrayList<CompletableFuture> arrayList = new ArrayList<CompletableFuture>(n2);
        class07321 class073212 = class047452.b();
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                int n3 = Math.max(Math.abs(j), Math.abs(i));
                long l = class07321.u((int)(class073212.B + j), (int)(class073212.Z + i));
                class04745 class047453 = this.N(l);
                if (class047453 == null) {
                    return M;
                }
                class00549 class005493 = intFunction.apply(n3);
                arrayList.add(class047453.N(class005493, this));
            }
        }
        return class07536.L(arrayList).thenApply(list -> {
            ArrayList<class08050> arrayList = new ArrayList<class08050>(list.size());
            for (class02818 class028182 : list) {
                if (class028182 == null) {
                    throw this.N(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
                }
                class08050 class080502 = (class08050)class028182.y(null);
                if (class080502 == null) {
                    return R;
                }
                arrayList.add(class080502);
            }
            return class02818.N(arrayList);
        });
    }

    public /* synthetic */ Int2ObjectMap getEntityTrackers() {
        return this.J;
    }

    public @Nullable class00570 R(long l) {
        class04745 class047452 = this.y(l);
        if (class047452 == null) {
            return null;
        }
        return class047452.i();
    }

    private void R(class07321 class073212) {
        this.K.add(class073212.y());
    }

    protected boolean R() {
        if (!this.w) {
            return false;
        }
        this.T = this.s.clone();
        this.w = false;
        return true;
    }
}

