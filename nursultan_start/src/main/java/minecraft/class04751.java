/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  minecraft.class00381
 *  minecraft.class00408
 *  minecraft.class00538
 *  minecraft.class00549
 *  minecraft.class00558
 *  minecraft.class00570
 *  minecraft.class00760
 *  minecraft.class00772
 *  minecraft.class00803
 *  minecraft.class01110
 *  minecraft.class01224
 *  minecraft.class01296
 *  minecraft.class01596
 *  minecraft.class01624
 *  minecraft.class01929
 *  minecraft.class02045
 *  minecraft.class02236
 *  minecraft.class02818
 *  minecraft.class03190
 *  minecraft.class03218
 *  minecraft.class03469
 *  minecraft.class03482
 *  minecraft.class04084
 *  minecraft.class04643
 *  minecraft.class05368
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06265
 *  minecraft.class06290
 *  minecraft.class06709
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07321
 *  minecraft.class07428
 *  minecraft.class07536
 *  minecraft.class08050
 *  minecraft.class08088
 *  minecraft.class08593
 *  minecraft.class08700
 *  net.caffeinemc.mods.lithium.common.world.ChunkAwareEntityIterable
 *  net.caffeinemc.mods.lithium.common.world.ChunkLoadTricks
 *  net.caffeinemc.mods.lithium.common.world.chunk.ChunkHolderExtended
 *  net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.PersistentEntitySectionManagerAccessor
 *  net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.ServerLevelAccessor
 *  net.caffeinemc.mods.lithium.mixin.world.chunk_access.GenerationChunkHolderAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import minecraft.class00381;
import minecraft.class00408;
import minecraft.class00538;
import minecraft.class00549;
import minecraft.class00558;
import minecraft.class00570;
import minecraft.class00760;
import minecraft.class00772;
import minecraft.class00803;
import minecraft.class01110;
import minecraft.class01224;
import minecraft.class01296;
import minecraft.class01596;
import minecraft.class01624;
import minecraft.class01929;
import minecraft.class02045;
import minecraft.class02236;
import minecraft.class02818;
import minecraft.class03190;
import minecraft.class03218;
import minecraft.class03469;
import minecraft.class03482;
import minecraft.class04084;
import minecraft.class04643;
import minecraft.class04745;
import minecraft.class04752;
import minecraft.class04770;
import minecraft.class04775;
import minecraft.class04778;
import minecraft.class04782;
import minecraft.class04785;
import minecraft.class05368;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06265;
import minecraft.class06290;
import minecraft.class06709;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07321;
import minecraft.class07428;
import minecraft.class07536;
import minecraft.class08050;
import minecraft.class08088;
import minecraft.class08593;
import minecraft.class08700;
import net.caffeinemc.mods.lithium.common.world.ChunkAwareEntityIterable;
import net.caffeinemc.mods.lithium.common.world.ChunkLoadTricks;
import net.caffeinemc.mods.lithium.common.world.chunk.ChunkHolderExtended;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.PersistentEntitySectionManagerAccessor;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.ServerLevelAccessor;
import net.caffeinemc.mods.lithium.mixin.world.chunk_access.GenerationChunkHolderAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04751
extends class00558 {
    private static final Logger u = LogUtils.getLogger();
    private final class04778 i;
    private final class04782 R;
    final Thread N;
    final class04775 y;
    private final class04752 M;
    public final class06265 L;
    private final class00408 B;
    private final class08593 Z;
    private long z;
    private boolean U = true;
    private static final int E = 4;
    private final long[] W;
    private final @Nullable class00549[] m;
    private final @Nullable class08050[] P;
    private final List<class00570> s;
    private final Set<class04745> T;
    private @Nullable class00760 b;
    private long j;
    private final long[] v = new long[4];
    private final class08050[] n = new class08050[4];

    public boolean L(int n, int n2) {
        int n3;
        class04745 class047452 = this.y(new class07321(n, n2).y());
        return !this.N(class047452, n3 = class03469.N((class00549)class00549.m));
    }

    public void L(class01624 class016242, class07321 class073212, int n) {
        this.Z.y(class016242, class073212, n);
    }

    private CompletableFuture<class02818<class08050>> L(int n, int n2, class00549 class005492, boolean bl) {
        class07321 class073212 = new class07321(n, n2);
        long l = class073212.y();
        int n3 = class03469.N((class00549)class005492);
        class04745 class047452 = this.y(l);
        if (bl) {
            this.N(new class01596(class01624.P, n3), class073212);
            if (this.N(class047452, n3)) {
                class04643 class046432 = class08700.N();
                class046432.N("chunkLoad");
                this.Z();
                class047452 = this.y(l);
                class046432.L();
                if (this.N(class047452, n3)) {
                    throw (IllegalStateException)class07536.y((Throwable)new IllegalStateException("No chunk holder after ticket has been added"));
                }
            }
        }
        if (this.N(class047452, n3)) {
            return class02236.L;
        }
        return class047452.N(class005492, this.L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private class08050 M(int n, int n2, class00549 class005492, boolean bl) {
        class08050 class080502;
        CompletableFuture var10;
        long l = class07321.u((int)n, (int)n2);
        int n3 = class03469.N((class00549)class005492);
        class04745 class047452 = this.y(l);
        class08050 class080503 = ChunkLoadTricks.tryRetrieveCurrentlyLoading((class04745)class047452);
        if (class080503 != null) {
            return class080503;
        }
        if (this.N(class047452, n3)) {
            if (!bl) return null;
            this.N(n, n2, n3);
            this.Z();
            class047452 = this.y(l);
            if (this.N(class047452, n3)) {
                throw (IllegalStateException)class07536.y((Throwable)new IllegalStateException("No chunk holder after ticket has been added"));
            }
        } else if (bl && ((ChunkHolderExtended)class047452).lithium$updateLastAccessTime(this.j)) {
            this.N(n, n2, n3);
        }
        if (!((GenerationChunkHolderAccessor)class047452).invokeCannotBeLoaded(class005492) && (var10 = (CompletableFuture)((GenerationChunkHolderAccessor)class047452).lithium$getChunkFuturesByStatus().get(class005492.y())) != null && var10.isDone() && (class080502 = (class08050)((class02818)var10.join()).y(null)) != null) {
            return class080502;
        }
        CompletableFuture completableFuture = class047452.N(class005492, this.L);
        if (completableFuture.isDone()) return (class08050)((class02818)completableFuture.join()).y(null);
        this.M.y(completableFuture::isDone);
        return (class08050)((class02818)completableFuture.join()).y(null);
    }

    public class07299 i() {
        return this.R;
    }

    public class00408 P() {
        return this.B;
    }

    public class03190 T() {
        return this.L.W();
    }

    public class04751(class04782 class047822, class04785 class047852, DataFixer dataFixer, class01224 class012242, Executor executor, class08088 class080882, int n, int n2, boolean bl, class01110 class011102, Supplier<class00408> supplier) {
        this.W = new long[4];
        this.m = new class00549[4];
        this.P = new class08050[4];
        this.s = new ObjectArrayList();
        this.T = new ReferenceOpenHashSet();
        this.R = class047822;
        this.M = new class04752(this, class047822);
        this.N = Thread.currentThread();
        Path path = class047852.N((class05946<class07299>)class047822.method_27983()).resolve("data");
        try {
            class06290.L((Path)path);
        }
        catch (IOException iOException) {
            u.error("Failed to create dimension data storage directory", (Throwable)iOException);
        }
        this.B = new class00408(path, dataFixer, (class01929)class047822.method_30349());
        this.Z = (class08593)this.B.N(class08593.y);
        this.L = new class06265(class047822, class047852, dataFixer, class012242, executor, (class06709)this.M, (class00538)this, class080882, class011102, supplier, this.Z, n, bl);
        this.y = this.L.u();
        this.i = this.L.Z();
        this.i.y(n2);
        this.v();
    }

    public boolean B() {
        return this.M.J();
    }

    boolean Z() {
        boolean bl = this.i.N(this.L);
        boolean bl2 = this.L.R();
        this.L.M();
        if (bl || bl2) {
            this.v();
            return true;
        }
        return false;
    }

    private /* synthetic */ class08050 i(int n, int n2, class00549 class005492, boolean bl) {
        return this.N(n, n2, class005492, bl);
    }

    public @Nullable class00760 b() {
        return this.b;
    }

    public class05368 s() {
        return this.L.U();
    }

    private void n() {
        long l = this.R.N();
        long l2 = l - this.z;
        this.z = l;
        if (this.R.method_27982()) {
            return;
        }
        class04643 class046432 = class08700.N();
        class046432.N("pollingChunks");
        if (this.R.method_54719().Z()) {
            class046432.N("tickingChunks");
            this.N(class046432, l2);
            class046432.L();
        }
        this.N(class046432);
        class046432.L();
    }

    public boolean m() {
        return this.Z.L();
    }

    private void v() {
        this.N((CallbackInfo)null);
        Arrays.fill(this.W, class07321.L);
        Arrays.fill(this.m, null);
        Arrays.fill(this.P, null);
    }

    public void j() {
        this.Z.u();
    }

    public class08088 U() {
        return this.L.N();
    }

    public void close() throws IOException {
        this.y(true);
        this.B.close();
        this.y.close();
        this.L.close();
    }

    public int z() {
        return this.M.F_();
    }

    public LongSet u() {
        return this.Z.i();
    }

    public void y(class07049 class070492) {
        this.L.N(class070492);
    }

    public void y(class01624 class016242, class07321 class073212, int n) {
        this.Z.N(class016242, class073212, n);
    }

    public @Nullable class03482 y(int n, int n2) {
        long l = class07321.u((int)n, (int)n2);
        class04745 class047452 = this.y(l);
        if (class047452 == null) {
            return null;
        }
        return class047452.N(class00549.U.L());
    }

    private @Nullable class04745 y(long l) {
        return this.L.y(l);
    }

    public CompletableFuture<class02818<class08050>> y(int n, int n2, class00549 class005492, boolean bl) {
        CompletionStage completionStage;
        if (Thread.currentThread() == this.N) {
            CompletableFuture<class02818<class08050>> var6 = this.L(n, n2, class005492, bl);
            this.M.y(var6::isDone);
        } else {
            completionStage = CompletableFuture.supplyAsync(() -> this.L(n, n2, class005492, bl), (Executor)((Object)this.M)).thenCompose(completableFuture -> completableFuture);
        }
        return completionStage;
    }

    public void y(int n) {
        this.i.y(n);
    }

    public void y(class07049 class070492, class00381<? super class07280> class003812) {
        this.L.N(class070492, class003812);
    }

    public void y(boolean bl) {
        this.Z();
        this.L.N(bl);
    }

    public int y() {
        return this.L.B();
    }

    public class02045 E() {
        return this.L.y();
    }

    public void N(BooleanSupplier booleanSupplier, boolean bl) {
        this.N(booleanSupplier, bl, null);
        class04643 class046432 = class08700.N();
        class046432.N("purge");
        if (this.R.method_54719().Z() || !bl) {
            this.Z.N(this.L);
        }
        this.Z();
        class046432.y("chunks");
        if (bl) {
            this.n();
            this.L.z();
        }
        class046432.y("unload");
        this.L.N(booleanSupplier);
        class046432.L();
        this.v();
    }

    private void N(class04643 class046432) {
        class046432.N("broadcast");
        for (class04745 class047452 : this.T) {
            class00570 class005702 = class047452.u();
            if (class005702 == null) continue;
            class047452.N(class005702);
        }
        this.T.clear();
        class046432.L();
    }

    public @Nullable class00570 N(int n, int n2) {
        if (Thread.currentThread() != this.N) {
            return null;
        }
        class08700.N().R("getChunkNow");
        long l = class07321.u((int)n, (int)n2);
        for (int i = 0; i < 4; ++i) {
            if (l != this.W[i] || this.m[i] != class00549.m) continue;
            class08050 class080502 = this.P[i];
            return class080502 instanceof class00570 ? (class00570)class080502 : null;
        }
        class04745 class047452 = this.y(l);
        if (class047452 == null) {
            return null;
        }
        class08050 class080503 = class047452.y(class00549.m);
        if (class080503 != null) {
            this.N(l, class080503, class00549.m);
            if (class080503 instanceof class00570) {
                return (class00570)class080503;
            }
        }
        return null;
    }

    private void N(long l, @Nullable class08050 class080502, class00549 class005492) {
        for (int i = 3; i > 0; --i) {
            this.W[i] = this.W[i - 1];
            this.m[i] = this.m[i - 1];
            this.P[i] = this.P[i - 1];
        }
        this.W[0] = l;
        this.m[0] = class005492;
        this.P[0] = class080502;
    }

    private void N(int n, int n2, int n3) {
        class07321 class073212 = new class07321(n, n2);
        this.N(new class01596(class01624.P, n3), class073212);
    }

    private static long N(int n, int n2, class00549 class005492) {
        return (long)n & 0xFFFFFFFL | ((long)n2 & 0xFFFFFFFL) << 28 | (long)class005492.y() << 56;
    }

    private void N(long l, class08050 class080502) {
        for (int i = 3; i > 0; --i) {
            this.v[i] = this.v[i - 1];
            this.n[i] = this.n[i - 1];
        }
        this.v[0] = l;
        this.n[0] = class080502;
    }

    private void N(CallbackInfo callbackInfo) {
        Arrays.fill(this.v, Long.MAX_VALUE);
        Arrays.fill(this.n, null);
    }

    public boolean N(class07321 class073212, boolean bl) {
        return this.Z.N(class073212, bl);
    }

    public boolean N(long l) {
        if (!this.R.method_39425(l)) {
            return false;
        }
        class04745 class047452 = this.y(l);
        if (class047452 == null) {
            return false;
        }
        return class047452.N().getNow(class04745.N).N();
    }

    private Iterable N(class04782 class047822) {
        return ((ChunkAwareEntityIterable)((PersistentEntitySectionManagerAccessor)((ServerLevelAccessor)class047822).getEntityManager()).getCache()).lithium$IterateEntitiesInTrackedSections();
    }

    private void N(BooleanSupplier booleanSupplier, boolean bl, CallbackInfo callbackInfo) {
        ++this.j;
    }

    public class08050 N(int n, int n2, class00549 class005492, boolean bl) {
        if (Thread.currentThread() != this.N) {
            return this.R(n, n2, class005492, bl);
        }
        long[] lArray = this.v;
        long l = class04751.N(n, n2, class005492);
        for (int i = 0; i < 4; ++i) {
            class08050 class080502;
            if (l != lArray[i] || (class080502 = this.n[i]) == null && bl) continue;
            return class080502;
        }
        class08050 class080503 = this.M(n, n2, class005492, bl);
        if (class080503 != null) {
            this.N(l, class080503);
        } else if (bl) {
            throw new IllegalStateException("Chunk not there when requested");
        }
        return class080503;
    }

    public void N(class04770 class047702) {
        if (!class047702.method_31481()) {
            this.L.y(class047702);
            if (class047702.method_70637()) {
                this.R.method_70636().y(class047702);
            }
        }
    }

    public void N(class07049 class070492) {
        this.L.y(class070492);
    }

    public void N(class07209 class072092) {
        int n;
        int n2 = class01296.N((int)class072092.method_10263());
        class04745 class047452 = this.y(class07321.u((int)n2, (int)(n = class01296.N((int)class072092.method_10260()))));
        if (class047452 != null && class047452.N(class072092)) {
            this.T.add(class047452);
        }
    }

    public void N(class07049 class070492, class00381<? super class07280> class003812) {
        this.L.y(class070492, class003812);
    }

    public void N(int n) {
        this.L.N(n);
    }

    public CompletableFuture<?> N(class01624 class016242, class07321 class073212, int n2) {
        if (!class016242.y()) {
            throw new IllegalStateException("Ticket type " + String.valueOf(class016242) + " does not trigger chunk loading");
        }
        if (class016242.i()) {
            throw new IllegalStateException("Ticket type " + String.valueOf(class016242) + " can expire before it loads, cannot fetch asynchronously");
        }
        this.y(class016242, class073212, n2);
        this.Z();
        class04745 class047452 = this.y(class073212.y());
        Objects.requireNonNull(class047452, "No chunk was scheduled for loading");
        return this.L.N(class047452, n2, (int n) -> class00549.m);
    }

    public void N(class01596 class015962, class07321 class073212) {
        this.Z.N(class015962, class073212);
    }

    private boolean N(@Nullable class04745 class047452, int n) {
        return class047452 == null || class047452.z() > n;
    }

    public void N(class00772 class007722, class01296 class012962) {
        this.M.execute(() -> {
            class04745 class047452 = this.y(class012962.E().y());
            if (class047452 != null && class047452.N(class007722, class012962.y())) {
                this.T.add(class047452);
            }
        });
    }

    public void N(class04745 class047452) {
        if (class047452.Z()) {
            this.T.add(class047452);
        }
    }

    private void N(long l, Consumer<class00570> consumer) {
        class04745 class047452 = this.y(l);
        if (class047452 != null) {
            class047452.L().getNow(class04745.N).N_36(consumer);
        }
    }

    private void N(class00570 class005702, long l, List<class07428> list, class00760 class007602) {
        class07321 class073212 = class005702.R();
        class005702.y(l);
        if (this.i.L(class073212.y())) {
            this.R.method_67503(class005702);
        }
        if (list.isEmpty()) {
            return;
        }
        if (this.R.method_67505(class073212)) {
            class00803.N((class04782)this.R, (class00570)class005702, (class00760)class007602, list);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N(class04643 class046432, long l) {
        List<class07428> list;
        class00760 class007602;
        class046432.N("naturalSpawnCount");
        class04782 class047822 = this.R;
        this.b = class007602 = class00803.N((int)this.i.N(), (Iterable)this.N(class047822), this::N, (class03218)new class03218(this.L));
        boolean bl = (Boolean)this.R.method_64395().N(class07305.S);
        int n = (Integer)this.R.method_64395().N(class07305.X);
        if (bl) {
            boolean bl2 = this.R.N() % 400L == 0L;
            List var8 = class00803.N((class00760)class007602, (boolean)true, (boolean)this.U, (boolean)bl2);
        } else {
            list = List.of();
        }
        List<class00570> var9 = this.s;
        try {
            class046432.y("filteringSpawningChunks");
            this.L.N(var9);
            class046432.y("shuffleSpawningChunks");
            class07536.L(var9, (class06069)this.R.field_9229);
            class046432.y("tickSpawningChunks");
            for (class00570 class005703 : var9) {
                this.N(class005703, l, list, class007602);
            }
        }
        finally {
            var9.clear();
        }
        class046432.y("tickTickingChunks");
        this.L.N((T class005702) -> this.R.method_18203((class00570)class005702, n));
        if (bl) {
            class046432.y("customSpawners");
            this.R.method_29202(this.U);
        }
        class046432.L();
    }

    public String N(class07321 class073212) {
        return this.L.N(class073212);
    }

    public String N() {
        return Integer.toString(this.y());
    }

    public void N(boolean bl) {
        this.U = bl;
    }

    public class04084 W() {
        return this.L.L();
    }

    private class08050 R(int n, int n2, class00549 class005492, boolean bl) {
        return CompletableFuture.supplyAsync(() -> this.N(n, n2, class005492, bl), (Executor)((Object)this.M)).join();
    }

    public class04775 L() {
        return this.y;
    }
}

