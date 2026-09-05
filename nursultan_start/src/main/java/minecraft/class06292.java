/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 *  minecraft.class06709
 *  minecraft.class07080
 */
package minecraft;

import java.util.concurrent.locks.LockSupport;
import minecraft.class06202;
import minecraft.class06709;
import minecraft.class07080;

public class class06292
extends class06709<Runnable> {
    private Thread N = this.L();
    private volatile boolean L;

    protected boolean L(Runnable runnable) {
        return !this.L;
    }

    private Thread L() {
        Thread thread2 = new Thread(this::R);
        thread2.setDaemon(true);
        thread2.setName("Sound engine");
        thread2.setUncaughtExceptionHandler((thread, throwable) -> class06202.Nq().u(class07080.N((Throwable)throwable, (String)("Uncaught exception on thread: " + thread.getName()))));
        thread2.start();
        return thread2;
    }

    public class06292() {
        super("Sound executor");
    }

    protected void o() {
        LockSupport.park("waiting for tasks");
    }

    protected Thread k() {
        return this.N;
    }

    public void y() {
        this.L = false;
        this.N = this.L();
    }

    public Runnable y(Runnable runnable) {
        return runnable;
    }

    public void N() {
        this.L = true;
        this.O();
        this.N.interrupt();
        try {
            this.N.join();
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public void N(Runnable runnable) {
        if (!this.L) {
            super.N(runnable);
        }
    }

    private void R() {
        while (!this.L) {
            this.y(() -> this.L);
        }
    }
}

