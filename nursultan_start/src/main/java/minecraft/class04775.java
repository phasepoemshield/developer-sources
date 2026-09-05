/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  minecraft.class00536
 *  minecraft.class00538
 *  minecraft.class00554
 *  minecraft.class00772
 *  minecraft.class01296
 *  minecraft.class05795
 *  minecraft.class06265
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class08050
 *  minecraft.class08201
 *  minecraft.class08214
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import minecraft.class00536;
import minecraft.class00538;
import minecraft.class00554;
import minecraft.class00772;
import minecraft.class01296;
import minecraft.class04783;
import minecraft.class05795;
import minecraft.class06265;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class08050;
import minecraft.class08201;
import minecraft.class08214;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04775
extends class05795
implements AutoCloseable {
    public static final int N = 1000;
    private static final Logger i = LogUtils.getLogger();
    private final class08214 R;
    private final ObjectList<Pair<class04783, Runnable>> M = new ObjectArrayList();
    private final class06265 B;
    private final class08201 Z;
    private final int z;
    private final AtomicBoolean U = new AtomicBoolean();

    public class04775(class00538 class005382, class06265 class062652, boolean bl, class08214 class082142, class08201 class082012) {
        super(class005382, true, bl);
        this.z = 1000;
        this.B = class062652;
        this.Z = class082012;
        this.R = class082142;
    }

    @Override
    public void close() {
    }

    public void y(class07321 class073212) {
        this.N(class073212.B, class073212.Z, class04783.field_17261, class07536.N(() -> super.y(class073212), () -> "propagateLight " + String.valueOf(class073212)));
    }

    public CompletableFuture<class08050> y(class08050 class080502, boolean bl) {
        class07321 class073212 = class080502.R();
        class080502.N(false);
        this.N(class073212.B, class073212.Z, class04783.field_17261, class07536.N(() -> {
            if (!bl) {
                super.y(class073212);
            }
            if (class07529.H) {
                i.debug("LIT {}", (Object)class073212);
            }
        }, () -> "lightChunk " + String.valueOf(class073212) + " " + bl));
        return CompletableFuture.supplyAsync(() -> {
            class080502.N(true);
            return class080502;
        }, runnable -> this.N(class073212.B, class073212.Z, class04783.field_17262, runnable));
    }

    public void y() {
        if ((!this.M.isEmpty() || super.au_()) && this.U.compareAndSet(false, true)) {
            this.R.N(() -> {
                this.R();
                this.U.set(false);
            });
        }
    }

    public void y(class07321 class073212, boolean bl) {
        this.N(class073212.B, class073212.Z, () -> 0, class04783.field_17261, class07536.N(() -> super.y(class073212, bl), () -> "retainData " + String.valueOf(class073212)));
    }

    public void N(class07209 class072092) {
        class07209 class072093 = class072092.method_10062();
        this.N(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()), class04783.field_17261, class07536.N(() -> super.N(class072093), () -> "checkBlock " + String.valueOf(class072093)));
    }

    public CompletableFuture<?> N(int n, int n2) {
        return CompletableFuture.runAsync(() -> {}, runnable -> this.N(n, n2, class04783.field_17262, runnable));
    }

    public void N(class00772 class007722, class01296 class012962, @Nullable class00536 class005362) {
        this.N(class012962.N(), class012962.L(), () -> 0, class04783.field_17261, class07536.N(() -> super.N(class007722, class012962, class005362), () -> "queueData " + String.valueOf(class012962)));
    }

    private void N(int n, int n2, class04783 class047832, Runnable runnable) {
        this.N(n, n2, this.B.u(class07321.u((int)n, (int)n2)), class047832, runnable);
    }

    private void N(int n, int n2, IntSupplier intSupplier, class04783 class047832, Runnable runnable) {
        this.Z.N(() -> {
            this.M.add((Object)Pair.of((Object)((Object)class047832), (Object)runnable));
            if (this.M.size() >= 1000) {
                this.R();
            }
        }, class07321.u((int)n, (int)n2), intSupplier);
    }

    public int N() {
        throw (UnsupportedOperationException)class07536.y((Throwable)new UnsupportedOperationException("Ran automatically on a different thread!"));
    }

    public CompletableFuture<class08050> N(class08050 class080502, boolean bl) {
        class07321 class073212 = class080502.R();
        this.N(class073212.B, class073212.Z, class04783.field_17261, class07536.N(() -> {
            class00554[] class00554Array = class080502.u();
            for (int i = 0; i < class080502.method_32890(); ++i) {
                if (class00554Array[i].L()) continue;
                int n = this.u.method_31604(i);
                super.N(class01296.N((class07321)class073212, (int)n), false);
            }
        }, () -> "initializeLight: " + String.valueOf(class073212)));
        return CompletableFuture.supplyAsync(() -> {
            super.N(class073212, bl);
            super.y(class073212, false);
            return class080502;
        }, runnable -> this.N(class073212.B, class073212.Z, class04783.field_17262, runnable));
    }

    protected void N(class07321 class073212) {
        this.N(class073212.B, class073212.Z, () -> 0, class04783.field_17261, class07536.N(() -> {
            int n;
            super.y(class073212, false);
            super.N(class073212, false);
            for (n = this.u(); n < this.i(); ++n) {
                super.N(class00772.field_9282, class01296.N((class07321)class073212, (int)n), null);
                super.N(class00772.field_9284, class01296.N((class07321)class073212, (int)n), null);
            }
            for (n = this.u.method_32891(); n <= this.u.method_31597(); ++n) {
                super.N(class01296.N((class07321)class073212, (int)n), true);
            }
        }, () -> "updateChunkStatus " + String.valueOf(class073212) + " true"));
    }

    public void N(class01296 class012962, boolean bl) {
        this.N(class012962.N(), class012962.L(), () -> 0, class04783.field_17261, class07536.N(() -> super.N(class012962, bl), () -> "updateSectionStatus " + String.valueOf(class012962) + " " + bl));
    }

    public void N(class07321 class073212, boolean bl) {
        this.N(class073212.B, class073212.Z, class04783.field_17261, class07536.N(() -> super.N(class073212, bl), () -> "enableLight " + String.valueOf(class073212) + " " + bl));
    }

    private void R() {
        int n;
        int n2 = Math.min(this.M.size(), 1000);
        ObjectListIterator var2 = this.M.iterator();
        for (n = 0; var2.hasNext() && n < n2; ++n) {
            Pair var4 = (Pair)var2.next();
            if (var4.getFirst() != class04783.field_17261) continue;
            ((Runnable)var4.getSecond()).run();
        }
        var2.back(n);
        super.N();
        for (n = 0; var2.hasNext() && n < n2; ++n) {
            Pair pair = (Pair)var2.next();
            if (pair.getFirst() == class04783.field_17262) {
                ((Runnable)pair.getSecond()).run();
            }
            var2.remove();
        }
    }
}

