/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00548
 *  minecraft.class00549
 *  minecraft.class02796
 *  minecraft.class02818
 *  minecraft.class03469
 *  minecraft.class04763
 *  minecraft.class06265
 *  minecraft.class07080
 *  minecraft.class07321
 *  minecraft.class07361
 *  minecraft.class07878
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.mixin.world.chunk_access.GenerationChunkHolderAccessor
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import minecraft.class00548;
import minecraft.class00549;
import minecraft.class02217;
import minecraft.class02228;
import minecraft.class02237;
import minecraft.class02248;
import minecraft.class02796;
import minecraft.class02818;
import minecraft.class03469;
import minecraft.class04763;
import minecraft.class06265;
import minecraft.class07080;
import minecraft.class07321;
import minecraft.class07361;
import minecraft.class07878;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.mixin.world.chunk_access.GenerationChunkHolderAccessor;
import org.jspecify.annotations.Nullable;

public abstract class class02236
implements GenerationChunkHolderAccessor {
    private static final List<class00549> N = class00549.N();
    private static final class02818<class08050> i = class02818.N((String)"Not done yet");
    public static final class02818<class08050> y = class02818.N((String)"Unloaded chunk");
    public static final CompletableFuture<class02818<class08050>> L = CompletableFuture.completedFuture(y);
    protected final class07321 u;
    private volatile @Nullable class00549 R;
    private final AtomicReference<@Nullable class00549> M = new AtomicReference();
    private final AtomicReferenceArray<@Nullable CompletableFuture<class02818<class08050>>> B = new AtomicReferenceArray(N.size());
    private final AtomicReference<@Nullable class02217> Z = new AtomicReference();
    private final AtomicInteger z = new AtomicInteger();
    private volatile CompletableFuture<Void> U = CompletableFuture.completedFuture(null);

    private CompletableFuture<class02818<class08050>> L(class00549 class005492) {
        CompletableFuture completableFuture;
        if (this.R(class005492)) {
            return L;
        }
        int n = class005492.y();
        CompletableFuture<class02818<class08050>> var3 = this.B.get(n);
        while (var3 == null) {
            CompletableFuture<class02818<class08050>> completableFuture2 = new CompletableFuture<class02818<class08050>>();
            completableFuture = this.B.compareAndExchange(n, null, completableFuture2);
            if (completableFuture != null) continue;
            if (this.R(class005492)) {
                this.N(n, completableFuture2);
                return L;
            }
            return completableFuture2;
        }
        return completableFuture;
    }

    public void P() {
        CompletableFuture<Void> var1 = this.U;
        int n = this.z.decrementAndGet();
        if (n == 0) {
            var1.complete(null);
        }
        if (n < 0) {
            throw new IllegalStateException("More releases than claims. Count: " + n);
        }
    }

    public @Nullable class00549 T() {
        CompletableFuture<class02818<class08050>> var1 = this.B.get(class00549.L.y());
        class08050 class080502 = var1 == null ? null : (class08050)var1.getNow(i).y(null);
        return class080502 == null ? null : class080502.E();
    }

    public class02236(class07321 class073212) {
        this.u = class073212;
        if (!class073212.N()) {
            throw new IllegalStateException("Trying to create chunk out of reasonable bounds: " + String.valueOf(class073212));
        }
    }

    private boolean i(class00549 class005492) {
        class00549 class005493 = class005492 == class00549.L ? null : class005492.L();
        class00549 class005494 = this.M.compareAndExchange(class005493, class005492);
        if (class005494 == class005493) {
            return true;
        }
        if (class005494 == null || class005492.y(class005494)) {
            throw new IllegalStateException("Unexpected last startedWork status: " + String.valueOf(class005494) + " while trying to start: " + String.valueOf(class005492));
        }
        return false;
    }

    public class07321 b() {
        return this.u;
    }

    public @Nullable class08050 s() {
        class00549 class005492 = this.M.get();
        if (class005492 == null) {
            return null;
        }
        class08050 class080502 = this.N(class005492);
        if (class080502 != null) {
            return class080502;
        }
        return this.N(class005492.L());
    }

    public @Nullable class00549 n() {
        class00549 class005492 = this.M.get();
        if (class005492 == null) {
            return null;
        }
        if (this.N(class005492) != null) {
            return class005492;
        }
        return class005492.L();
    }

    public void m() {
        if (this.z.getAndIncrement() == 0) {
            this.U = new CompletableFuture();
            this.y(this.U);
        }
    }

    public List<Pair<class00549, @Nullable CompletableFuture<class02818<class08050>>>> v() {
        ArrayList<Pair<class00549, CompletableFuture<class02818<class08050>>>> arrayList = new ArrayList<Pair<class00549, CompletableFuture<class02818<class08050>>>>();
        for (int i = 0; i < N.size(); ++i) {
            arrayList.add((Pair<class00549, CompletableFuture<class02818<class08050>>>)Pair.of((Object)N.get(i), this.B.get(i)));
        }
        return arrayList;
    }

    public class04763 j() {
        return class03469.L((int)this.z());
    }

    public abstract int U();

    public abstract int z();

    private @Nullable class00549 u(@Nullable class00549 class005492) {
        if (class005492 == null) {
            return null;
        }
        class00549 class005493 = class005492;
        class00549 class005494 = this.M.get();
        while (class005494 == null || class005493.y(class005494)) {
            if (this.B.get(class005493.y()) != null) {
                return class005493;
            }
            if (class005493 == class00549.L) break;
            class005493 = class005493.L();
        }
        return null;
    }

    protected abstract void y(CompletableFuture<?> var1);

    public @Nullable class08050 y(class00549 class005492) {
        if (this.R(class005492)) {
            return null;
        }
        return this.N(class005492);
    }

    protected void N(class06265 class062652) {
        class00549 class005492;
        class00549 class005493 = this.R;
        this.R = class005492 = class03469.N((int)this.z());
        if (class005493 != null && (class005492 == null || class005492.u(class005493))) {
            this.N(class005492, class005493);
            if (this.Z.get() != null) {
                this.N(class062652, this.u(class005492));
            }
        }
    }

    public CompletableFuture<class02818<class08050>> N(class00549 class005492, class06265 class062652) {
        if (this.R(class005492)) {
            return L;
        }
        CompletableFuture<class02818<class08050>> var3 = this.L(class005492);
        if (var3.isDone()) {
            return var3;
        }
        class02217 class022172 = this.Z.get();
        if (class022172 == null || class005492.y(class022172.N)) {
            this.N(class062652, class005492);
        }
        return var3;
    }

    CompletableFuture<class02818<class08050>> N(class02237 class022372, class02228 class022282, class02248<class02236> class022482) {
        if (this.R(class022372.N())) {
            return L;
        }
        if (this.i(class022372.N())) {
            return class022282.N(this, class022372, class022482).handle((class080502, throwable) -> {
                if (throwable != null) {
                    class07080 class070802 = class07080.N((Throwable)throwable, (String)"Exception chunk generation/loading");
                    class02796.N((RuntimeException)new class07878(class070802));
                } else {
                    this.N(class022372.N(), (class08050)class080502);
                }
                return class02818.N((Object)class080502);
            });
        }
        return this.L(class022372.N());
    }

    private void N(class06265 class062652, @Nullable class00549 class005492) {
        class02217 class022172 = class005492 != null ? class062652.N(class005492, this.b()) : null;
        class02217 class022173 = this.Z.getAndSet(class022172);
        if (class022173 != null) {
            class022173.y();
        }
    }

    private void N(@Nullable class00549 class005492, class00549 class005493) {
        int n = class005492 == null ? 0 : class005492.y() + 1;
        int n2 = class005493.y();
        for (int i = n; i <= n2; ++i) {
            CompletableFuture<class02818<class08050>> var6 = this.B.get(i);
            if (var6 == null) continue;
            this.N(i, var6);
        }
    }

    private void N(int n, CompletableFuture<class02818<class08050>> completableFuture) {
        if (completableFuture.complete(y) && !this.B.compareAndSet(n, completableFuture, null)) {
            throw new IllegalStateException("Nothing else should replace the future here");
        }
    }

    private void N(class00549 class005492, class08050 class080502) {
        class02818 class028182 = class02818.N((Object)class080502);
        int n = class005492.y();
        while (true) {
            CompletableFuture<class02818<class08050>> var5;
            if ((var5 = this.B.get(n)) == null) {
                if (!this.B.compareAndSet(n, null, CompletableFuture.completedFuture(class028182))) continue;
                return;
            }
            if (var5.complete((class02818<class08050>)class028182)) {
                return;
            }
            if (var5.getNow(i).N()) {
                throw new IllegalStateException("Trying to complete a future but found it to be completed successfully already");
            }
            Thread.yield();
        }
    }

    public void N(class00548 class005482) {
        CompletableFuture<class02818> completableFuture = CompletableFuture.completedFuture(class02818.N((Object)class005482));
        for (int i = 0; i < this.B.length() - 1; ++i) {
            CompletableFuture<class02818<class08050>> var4 = this.B.get(i);
            Objects.requireNonNull(var4);
            class08050 class080502 = (class08050)var4.getNow(class02236.i).y(null);
            if (class080502 instanceof class07361) {
                if (this.B.compareAndSet(i, var4, completableFuture)) continue;
                throw new IllegalStateException("Future changed by other thread while trying to replace it");
            }
            throw new IllegalStateException("Trying to replace a ProtoChunk, but found " + String.valueOf(class080502));
        }
    }

    void N(class02217 class022172) {
        this.Z.compareAndSet(class022172, null);
    }

    public @Nullable class08050 N(class00549 class005492) {
        CompletableFuture<class02818<class08050>> var2 = this.B.get(class005492.y());
        return var2 == null ? null : (class08050)var2.getNow(i).y(null);
    }

    public /* synthetic */ AtomicReferenceArray lithium$getChunkFuturesByStatus() {
        return this.B;
    }

    public /* synthetic */ boolean invokeCannotBeLoaded(class00549 class005492) {
        return this.R(class005492);
    }

    private boolean R(class00549 class005492) {
        class00549 class005493 = this.R;
        return class005493 == null || class005492.y(class005493);
    }
}

