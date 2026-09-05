/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  minecraft.class01386
 *  minecraft.class01999
 *  minecraft.class02614
 *  minecraft.class03063
 *  minecraft.class03130
 *  minecraft.class03176
 *  minecraft.class03448
 *  minecraft.class03579
 *  minecraft.class03950
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07080
 *  minecraft.class08214
 *  minecraft.class08233
 *  minecraft.class08717
 *  minecraft.class08744
 */
package minecraft;

import com.google.common.collect.Queues;
import java.util.Locale;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01386;
import minecraft.class01999;
import minecraft.class02614;
import minecraft.class03063;
import minecraft.class03130;
import minecraft.class03176;
import minecraft.class03335;
import minecraft.class03345;
import minecraft.class03354;
import minecraft.class03448;
import minecraft.class03579;
import minecraft.class03950;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07080;
import minecraft.class08214;
import minecraft.class08233;
import minecraft.class08717;
import minecraft.class08744;

public class class03365 {
    private final class08233 Z = new class08233();
    private final Queue<Runnable> z = Queues.newConcurrentLinkedQueue();
    final Executor N = this.z::add;
    final Queue<class08744> y = Queues.newConcurrentLinkedQueue();
    final class03950 L;
    private final class03130 U;
    volatile boolean u;
    private final class08214 E;
    private final class08717 W;
    class03448 i;
    final class03063 R;
    class06889 M = class06889.L;
    final class02614 B;

    public boolean L() {
        return this.Z.N() == 0 && this.z.isEmpty();
    }

    public int M() {
        return this.z.size();
    }

    public class03365(class03448 class034482, class03063 class030632, class08717 class087172, class01386 class013862, class01999 class019992, class03579 class035792) {
        this.i = class034482;
        this.R = class030632;
        this.L = class013862.N();
        this.U = class013862.y();
        this.W = class087172;
        this.E = new class08214((Executor)class087172, "Section Renderer");
        this.E.N(this::Z);
        this.B = new class02614(class019992, class035792);
    }

    public int B() {
        return this.U.method_54646();
    }

    private void Z() {
        if (this.u || this.U.method_54645()) {
            return;
        }
        class03354 class033542 = this.Z.N(this.M);
        if (class033542 == null) {
            return;
        }
        class03950 class039502 = Objects.requireNonNull(this.U.method_54642());
        ((CompletableFuture)CompletableFuture.supplyAsync(() -> class033542.N(class039502), this.W.N(class033542.y())).thenCompose(completableFuture -> completableFuture)).whenComplete((class033352, throwable) -> {
            if (throwable != null) {
                class06202.Nq().u(class07080.N((Throwable)throwable, (String)"Batching sections"));
                return;
            }
            class033542.y.set(true);
            this.E.N(() -> {
                if (class033352 == class03335.field_21438) {
                    class039502.N();
                } else {
                    class039502.y();
                }
                this.U.method_54644(class039502);
                this.Z();
            });
        });
    }

    public String i() {
        return String.format(Locale.ROOT, "pC: %03d, pU: %02d, aB: %02d", this.Z.N(), this.z.size(), this.U.method_54646());
    }

    public void u() {
        this.u = true;
        this.y();
        this.N();
    }

    public void y() {
        this.Z.y();
    }

    public void N(class03448 class034482) {
        this.i = class034482;
    }

    public void N(class03354 class033542) {
        if (this.u) {
            return;
        }
        this.E.N(() -> {
            if (this.u) {
                return;
            }
            this.Z.N(class033542);
            this.Z();
        });
    }

    public void N(class03345 class033452, class03176 class031762) {
        class033452.L(class031762);
    }

    public void N() {
        class08744 class087442;
        Runnable runnable;
        while ((runnable = this.z.poll()) != null) {
            runnable.run();
        }
        while ((class087442 = this.y.poll()) != null) {
            class087442.close();
        }
    }

    public void N(class06889 class068892) {
        this.M = class068892;
    }

    public int R() {
        return this.Z.N();
    }
}

