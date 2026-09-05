/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Queues
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.jtracy.Zone
 *  com.mojang.logging.LogUtils
 *  javax.annotation.CheckReturnValue
 *  minecraft.class02253
 *  minecraft.class02510
 *  minecraft.class02672
 *  minecraft.class04530
 *  minecraft.class07529
 *  minecraft.class07878
 *  minecraft.class08199
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.CheckReturnValue;
import minecraft.class02253;
import minecraft.class02510;
import minecraft.class02672;
import minecraft.class04530;
import minecraft.class07529;
import minecraft.class07878;
import minecraft.class08199;
import org.slf4j.Logger;

public abstract class class06709<R extends Runnable>
implements class02510,
class08199<R>,
Executor {
    public static final long y = 100000L;
    private final String N;
    private static final Logger L = LogUtils.getLogger();
    private final Queue<R> u = Queues.newConcurrentLinkedQueue();
    private int i;

    protected abstract boolean L(R var1);

    protected void M_1(R r) {
        block8: {
            try (Zone zone = TracyClient.beginZone((String)"Task", (boolean)class07529.ND);){
                r.run();
            }
            catch (Exception exception) {
                L.error(LogUtils.FATAL_MARKER, "Error executing task on {}", (Object)this.as_(), (Object)exception);
                if (!class06709.N(exception)) break block8;
                throw exception;
            }
        }
    }

    protected class06709(String string) {
        this.N = string;
        class02672.N.N((class02510)this);
    }

    private CompletableFuture<Void> B(Runnable runnable) {
        return CompletableFuture.supplyAsync(() -> {
            runnable.run();
            return null;
        }, this);
    }

    protected boolean I() {
        return this.i > 0;
    }

    public boolean J() {
        Runnable runnable = (Runnable)this.u.peek();
        if (runnable == null) {
            return false;
        }
        if (!this.I() && !this.L(runnable)) {
            return false;
        }
        this.M_1((Runnable)this.u.remove());
        return true;
    }

    public void i(Runnable runnable) {
        if (!this.E_()) {
            this.B(runnable).join();
        } else {
            runnable.run();
        }
    }

    protected void o() {
        Thread.yield();
        LockSupport.parkNanos("waiting for tasks", 100000L);
    }

    protected abstract Thread k();

    @Override
    public void execute(Runnable runnable) {
        Runnable runnable2 = this.y(runnable);
        if (this.Y()) {
            this.N(runnable2);
        } else {
            this.M_1(runnable2);
        }
    }

    protected void g() {
        while (this.J()) {
        }
    }

    @CheckReturnValue
    public CompletableFuture<Void> u(Runnable runnable) {
        if (this.Y()) {
            return this.B(runnable);
        }
        runnable.run();
        return CompletableFuture.completedFuture(null);
    }

    public void y(BooleanSupplier booleanSupplier) {
        ++this.i;
        try {
            while (!booleanSupplier.getAsBoolean()) {
                if (this.J()) continue;
                this.o();
            }
        }
        finally {
            --this.i;
        }
    }

    public static boolean N(Throwable throwable) {
        if (throwable instanceof class07878) {
            return class06709.N(((class07878)throwable).getCause());
        }
        return throwable instanceof OutOfMemoryError || throwable instanceof StackOverflowError;
    }

    public void N(R r) {
        this.u.add(r);
        LockSupport.unpark(this.k());
    }

    public <V> CompletableFuture<V> N(Supplier<V> supplier) {
        if (this.Y()) {
            return CompletableFuture.supplyAsync(supplier, this);
        }
        return CompletableFuture.completedFuture(supplier.get());
    }

    public void R(Runnable runnable) {
        this.execute(runnable);
    }

    protected void O() {
        this.u.clear();
    }

    protected boolean Y() {
        return !this.E_();
    }

    public boolean E_() {
        return Thread.currentThread() == this.k();
    }

    public int F_() {
        return this.u.size();
    }

    public String as_() {
        return this.N;
    }

    public List<class04530> at_() {
        return ImmutableList.of((Object)class04530.N((String)(this.N + "-pending-tasks"), (class02253)class02253.field_29551, this::F_));
    }
}

