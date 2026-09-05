/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.shorts.ShortOpenHashSet
 *  it.unimi.dsi.fastutil.shorts.ShortSet
 *  minecraft.class00381
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00504
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class00772
 *  minecraft.class01296
 *  minecraft.class02236
 *  minecraft.class02818
 *  minecraft.class03469
 *  minecraft.class05474
 *  minecraft.class05795
 *  minecraft.class06265
 *  minecraft.class07209
 *  minecraft.class07259
 *  minecraft.class07261
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07536
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.common.world.chunk.ChunkHolderExtended
 *  net.caffeinemc.mods.lithium.common.world.chunk.ChunkStatusTracker
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents$LevelTypeChange
 *  net.fabricmc.fabric.impl.event.lifecycle.ChunkLevelTypeEventTracker
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.shorts.ShortOpenHashSet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class00381;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00504;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00772;
import minecraft.class01296;
import minecraft.class02236;
import minecraft.class02818;
import minecraft.class03469;
import minecraft.class04763;
import minecraft.class04767;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04789;
import minecraft.class05474;
import minecraft.class05795;
import minecraft.class06265;
import minecraft.class07209;
import minecraft.class07259;
import minecraft.class07261;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07536;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.world.chunk.ChunkHolderExtended;
import net.caffeinemc.mods.lithium.common.world.chunk.ChunkStatusTracker;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents;
import net.fabricmc.fabric.impl.event.lifecycle.ChunkLevelTypeEventTracker;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04745
extends class02236
implements ChunkHolderExtended,
ChunkLevelTypeEventTracker {
    public static final class02818<class00570> N = class02818.N((String)"Unloaded level chunk");
    private static final CompletableFuture<class02818<class00570>> i = CompletableFuture.completedFuture(N);
    private final class05474 R;
    private volatile CompletableFuture<class02818<class00570>> M;
    private volatile CompletableFuture<class02818<class00570>> B;
    private volatile CompletableFuture<class02818<class00570>> Z;
    private int z;
    private int U;
    private int E;
    private boolean W;
    private final @Nullable ShortSet[] m;
    private final BitSet P;
    private final BitSet s;
    private final class05795 T;
    private final class04767 b;
    private final class04789 j;
    private boolean v;
    private CompletableFuture<?> n;
    private CompletableFuture<?> t;
    private CompletableFuture<?> G;
    private static final class04763[] l = class04763.values();
    private class04763 d = class04763.field_19334;
    private long w;

    private void L(class06265 class062652, Executor executor, CallbackInfo callbackInfo) {
        if (this.d == class04763.field_44856) {
            ((ServerChunkEvents.LevelTypeChange)ServerChunkEvents.CHUNK_LEVEL_TYPE_CHANGE.invoker()).onChunkLevelTypeChange((class04782)this.R, (class00570)this.N(class00549.m), class04763.field_44856, class04763.field_13877);
            this.d = class04763.field_13877;
        }
    }

    public CompletableFuture<class02818<class00570>> L() {
        return this.M;
    }

    public CompletableFuture<?> M() {
        return this.G;
    }

    public class04745(class07321 class073212, int n, class05474 class054742, class05795 class057952, class04767 class047672, class04789 class047892) {
        super(class073212);
        this.M = i;
        this.B = i;
        this.Z = i;
        this.P = new BitSet();
        this.s = new BitSet();
        this.n = CompletableFuture.completedFuture(null);
        this.t = CompletableFuture.completedFuture(null);
        this.G = CompletableFuture.completedFuture(null);
        this.R = class054742;
        this.T = class057952;
        this.b = class047672;
        this.j = class047892;
        this.U = this.z = class03469.y + 1;
        this.E = this.z;
        this.N(n);
        this.m = new ShortSet[class054742.method_32890()];
    }

    public boolean B() {
        return this.G.isDone();
    }

    public boolean Z() {
        return this.W || !this.s.isEmpty() || !this.P.isEmpty();
    }

    public @Nullable class00570 i() {
        if (!this.t.isDone()) {
            return null;
        }
        return this.u();
    }

    public int U() {
        return this.E;
    }

    public int z() {
        return this.U;
    }

    public @Nullable class00570 u() {
        return (class00570)this.N().getNow(N).y(null);
    }

    public CompletableFuture<class02818<class00570>> y() {
        return this.Z;
    }

    protected void y(CompletableFuture<?> completableFuture) {
        this.G = this.G.isDone() ? completableFuture : this.G.thenCombine(completableFuture, (object, object2) -> null);
    }

    private void y(class06265 class062652, Executor executor, CallbackInfo callbackInfo) {
        if (this.d == class04763.field_44855) {
            ((ServerChunkEvents.LevelTypeChange)ServerChunkEvents.CHUNK_LEVEL_TYPE_CHANGE.invoker()).onChunkLevelTypeChange((class04782)this.R, (class00570)this.N(class00549.m), class04763.field_44855, class04763.field_44856);
            this.d = class04763.field_44856;
        }
    }

    private void y(int n) {
        this.E = n;
    }

    public boolean E() {
        return this.v;
    }

    private void N(class06265 class062652, class04763 class047632, CallbackInfo callbackInfo) {
        class04763 class047633 = class03469.L((int)this.z);
        class04782 class047822 = (class04782)this.R;
        for (int i = class047633.ordinal(); i > class047632.ordinal(); --i) {
            class04763 class047634 = l[i];
            class04763 class047635 = l[i - 1];
            if (!this.d.N(class047634)) continue;
            ((ServerChunkEvents.LevelTypeChange)ServerChunkEvents.CHUNK_LEVEL_TYPE_CHANGE.invoker()).onChunkLevelTypeChange(class047822, (class00570)this.N(class00549.m), class047634, class047635);
            this.d = class047635;
        }
    }

    private void N(class06265 class062652, Executor executor, CallbackInfo callbackInfo) {
        if (this.N(class00549.m) instanceof class00570 && this.d == class04763.field_19334) {
            ((ServerChunkEvents.LevelTypeChange)ServerChunkEvents.CHUNK_LEVEL_TYPE_CHANGE.invoker()).onChunkLevelTypeChange((class04782)this.R, (class00570)this.N(class00549.m), class04763.field_19334, class04763.field_44855);
            this.d = class04763.field_44855;
        }
    }

    private void N(class06265 class062652, Executor executor, CallbackInfo callbackInfo, class04763 class047632, class04763 class047633) {
        class08050 class080502;
        class04782 class047822 = class062652.u;
        boolean bl = class047633.N(class04763.field_44855);
        boolean bl2 = class047632.N(class04763.field_44855);
        if (!bl && bl2) {
            ChunkStatusTracker.onChunkInaccessible((class04782)class047822, (class07321)this.u);
        } else if (!bl2 && (class080502 = this.N(class00549.m)) instanceof class00570) {
            class00570 class005702 = (class00570)class080502;
            ChunkStatusTracker.onChunkAccessible((class04782)class047822, (class00570)class005702);
        }
    }

    private void N(List<class04770> list, class07299 class072992, class07209 class072092) {
        class00381 var5;
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 != null && (var5 = class003942.i()) != null) {
            this.N(list, var5);
        }
    }

    private void N(List<class04770> list, class07299 class072992, class07209 class072092, class00500 class005002) {
        if (class005002.k()) {
            this.N(list, class072992, class072092);
        }
    }

    public CompletableFuture<class02818<class00570>> N() {
        return this.B;
    }

    public boolean N(class00772 class007722, int n) {
        int n2;
        class08050 class080502 = this.y(class00549.U);
        if (class080502 == null) {
            return false;
        }
        class080502.Z();
        if (this.u() == null) {
            return false;
        }
        int n3 = this.T.u();
        int n4 = this.T.i();
        if (n < n3 || n > n4) {
            return false;
        }
        BitSet bitSet = class007722 == class00772.field_9284 ? this.s : this.P;
        if (!bitSet.get(n2 = n - n3)) {
            bitSet.set(n2);
            return true;
        }
        return false;
    }

    public boolean N(class07209 class072092) {
        if (this.u() == null) {
            return false;
        }
        boolean bl = this.W;
        int n = this.R.method_31602(class072092.method_10264());
        ShortSet shortSet = this.m[n];
        if (shortSet == null) {
            this.W = true;
            this.m[n] = shortSet = new ShortOpenHashSet();
        }
        shortSet.add(class01296.y((class07209)class072092));
        return !bl;
    }

    public void N(CompletableFuture<?> completableFuture) {
        this.t = this.t.isDone() ? completableFuture : this.t.thenCombine(completableFuture, (object, object2) -> null);
    }

    public void N(class00570 class005702) {
        List<class04770> var3;
        if (!this.Z()) {
            return;
        }
        class07299 class072992 = class005702.J();
        if (!this.s.isEmpty() || !this.P.isEmpty()) {
            var3 = this.j.N(this.u, true);
            if (!var3.isEmpty()) {
                class00504 class005042 = new class00504(class005702.R(), this.T, this.s, this.P);
                this.N(var3, (class00381<?>)class005042);
            }
            this.s.clear();
            this.P.clear();
        }
        if (!this.W) {
            return;
        }
        var3 = this.j.N(this.u, false);
        for (int i = 0; i < this.m.length; ++i) {
            class00500 class005003;
            class00554 class005542;
            ShortSet shortSet = this.m[i];
            if (shortSet == null) continue;
            this.m[i] = null;
            if (var3.isEmpty()) continue;
            int n = this.R.method_31604(i);
            class01296 class012962 = class01296.N((class07321)class005702.R(), (int)n);
            if (shortSet.size() == 1) {
                class005542 = class012962.M(shortSet.iterator().nextShort());
                class005003 = class072992.method_8320((class07209)class005542);
                this.N(var3, (class00381<?>)new class07259((class07209)class005542, class005003));
                this.N(var3, class072992, (class07209)class005542, class005003);
                continue;
            }
            class005542 = class005702.y(i);
            class005003 = new class07261(class012962, shortSet, class005542);
            this.N(var3, (class00381<?>)class005003);
            class005003.N((class072092, class005002) -> this.N(var3, class072992, (class07209)class072092, (class00500)class005002));
        }
        this.W = false;
    }

    protected void N(class06265 class062652, Executor executor) {
        class04763 class047632 = class03469.L((int)this.z);
        class04763 class047633 = class03469.L((int)this.U);
        boolean bl = class047632.N(class04763.field_44855);
        boolean bl2 = class047633.N(class04763.field_44855);
        this.v |= bl2;
        if (!bl && bl2) {
            this.M = class062652.L(this);
            this.N(class062652, this.M, executor, class04763.field_44855);
            this.y(this.M);
            this.N(class062652, executor, null);
        }
        if (bl && !bl2) {
            this.M.complete(N);
            this.M = i;
        }
        boolean bl3 = class047632.N(class04763.field_44856);
        boolean bl4 = class047633.N(class04763.field_44856);
        if (!bl3 && bl4) {
            this.B = class062652.y(this);
            this.N(class062652, this.B, executor, class04763.field_44856);
            this.y(this.B);
            this.y(class062652, executor, null);
        }
        if (bl3 && !bl4) {
            this.B.complete(N);
            this.B = i;
        }
        boolean bl5 = class047632.N(class04763.field_13877);
        boolean bl6 = class047633.N(class04763.field_13877);
        if (!bl5 && bl6) {
            if (this.Z != i) {
                throw (IllegalStateException)class07536.y((Throwable)new IllegalStateException());
            }
            this.Z = class062652.N(this);
            this.N(class062652, this.Z, executor, class04763.field_13877);
            this.y(this.Z);
            this.L(class062652, executor, null);
        }
        if (bl5 && !bl6) {
            this.Z.complete(N);
            this.Z = i;
        }
        this.N(class062652, executor, null, class047632, class047633);
        if (!class047633.N(class047632)) {
            this.N(class062652, class047633);
        }
        this.b.method_17209(this.u, this::U, this.U, this::y);
        this.z = this.U;
    }

    private void N(class06265 class062652, class04763 class047632) {
        this.N(class062652, class047632, null);
        this.n.cancel(false);
        class062652.N(this.u, class047632);
    }

    private void N(List<class04770> list, class00381<?> class003812) {
        list.forEach(class047702 -> class047702.field_13987.method_14364(class003812));
    }

    public void N(int n) {
        this.U = n;
    }

    private void N(class06265 class062652, CompletableFuture<class02818<class00570>> completableFuture, Executor executor, class04763 class047632) {
        this.n.cancel(false);
        CompletableFuture completableFuture2 = new CompletableFuture();
        completableFuture2.thenRunAsync(() -> class062652.N(this.u, class047632), executor);
        this.n = completableFuture2;
        completableFuture.thenAccept(class028182 -> class028182.N_36(class005702 -> completableFuture2.complete(null)));
    }

    public void W() {
        this.v = class03469.L((int)this.U).N(class04763.field_44855);
    }

    public boolean lithium$updateLastAccessTime(long l) {
        long l2 = this.w;
        this.w = l;
        return l2 != l;
    }

    public CompletableFuture<?> R() {
        return this.t;
    }

    public class04763 fabric_getCurrentEventLevelType() {
        return this.d;
    }

    public void fabric_setCurrentEventLevelType(class04763 class047632) {
        this.d = class047632;
    }
}

