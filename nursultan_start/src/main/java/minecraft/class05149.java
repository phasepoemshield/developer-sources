/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class07640
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class07640;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class05149
implements Runnable {
    private static final Logger u = LogUtils.getLogger();
    private static final AtomicInteger i = new AtomicInteger(0);
    private static final int R = 5;
    protected volatile boolean N;
    protected final String y;
    protected @Nullable Thread L;

    public boolean L() {
        return this.N;
    }

    protected class05149(String string) {
        this.y = string;
    }

    public synchronized void y() {
        this.N = false;
        if (null == this.L) {
            return;
        }
        int n = 0;
        while (this.L.isAlive()) {
            try {
                this.L.join(1000L);
                if (++n >= 5) {
                    u.warn("Waited {} seconds attempting force stop!", (Object)n);
                    continue;
                }
                if (!this.L.isAlive()) continue;
                u.warn("Thread {} ({}) failed to exit after {} second(s)", new Object[]{this, this.L.getState(), n, new Exception("Stack:")});
                this.L.interrupt();
            }
            catch (InterruptedException interruptedException) {}
        }
        u.info("Thread {} stopped", (Object)this.y);
        this.L = null;
    }

    public synchronized boolean N() {
        if (this.N) {
            return true;
        }
        this.N = true;
        this.L = new Thread((Runnable)this, this.y + " #" + i.incrementAndGet());
        this.L.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class07640(u));
        this.L.start();
        u.info("Thread {} started", (Object)this.y);
        return true;
    }
}

