/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10533
 *  com.mojang.logging.LogUtils
 *  minecraft.class04767
 *  minecraft.class06244
 *  minecraft.class06256
 *  minecraft.class06263
 *  minecraft.class07321
 *  minecraft.class07529
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10533;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import minecraft.class04767;
import minecraft.class06244;
import minecraft.class06256;
import minecraft.class06263;
import minecraft.class07321;
import minecraft.class07529;
import minecraft.class08199;
import minecraft.class08240;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08201
implements class04767,
AutoCloseable {
    public static final int N = 4;
    private static final Logger L = LogUtils.getLogger();
    private final class06263 u;
    private final class08199<Runnable> i;
    private final class08240 R;
    protected boolean y;

    protected @Nullable class06256 L() {
        return this.u.N();
    }

    public class08201(class08199<Runnable> class081992, Executor executor) {
        this.u = new class06263(class081992.as_() + "_queue");
        this.i = class081992;
        this.R = new class08240(4, executor, "dispatcher");
        this.y = true;
    }

    @Override
    public void close() {
        this.i.close();
    }

    protected void y() {
        this.R.N(new class10533(3, () -> {
            class06256 class062562 = this.L();
            if (class062562 == null) {
                this.y = true;
            } else {
                this.N(class062562);
            }
        }));
    }

    public void N(long l, Runnable runnable, boolean bl) {
        this.R.N(new class10533(1, () -> {
            this.u.N(l, bl);
            this.N(l);
            if (this.y) {
                this.y = false;
                this.y();
            }
            runnable.run();
        }));
    }

    protected void N(class06256 class062562) {
        CompletableFuture.allOf((CompletableFuture[])class062562.y().stream().map(runnable -> this.i.N_87(completableFuture -> {
            runnable.run();
            completableFuture.complete(class06244.field_17274);
        })).toArray(CompletableFuture[]::new)).thenAccept(void_ -> this.y());
    }

    protected void N(long l) {
    }

    public void N(Runnable runnable, long l, IntSupplier intSupplier) {
        this.R.N(new class10533(2, () -> {
            int n = intSupplier.getAsInt();
            if (class07529.H) {
                L.debug("SUB {} {} {} {}", new Object[]{new class07321(l), n, this.i, this.u});
            }
            this.u.N(runnable, l, n);
            if (this.y) {
                this.y = false;
                this.y();
            }
        }));
    }

    public boolean N() {
        return this.R.L() || this.u.y();
    }

    public void method_17209(class07321 class073212, IntSupplier intSupplier, int n, IntConsumer intConsumer) {
        this.R.N(new class10533(0, () -> {
            int n2 = intSupplier.getAsInt();
            if (class07529.H) {
                L.debug("RES {} {} -> {}", new Object[]{class073212, n2, n});
            }
            this.u.N(n2, class073212, n);
            intConsumer.accept(n);
        }));
    }
}

