/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09365
 *  com.google.common.collect.Queues
 *  com.mojang.logging.LogUtils
 *  minecraft.class00381
 *  minecraft.class00638
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09365;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionException;
import minecraft.class00381;
import minecraft.class00638;
import org.slf4j.Logger;

public class class00458
implements AutoCloseable {
    public static final Logger N = LogUtils.getLogger();
    private final Queue<class09365<?>> y = Queues.newConcurrentLinkedQueue();
    private final Thread L;
    private boolean u;

    public class00458(Thread thread) {
        this.L = thread;
    }

    @Override
    public void close() {
        this.u = true;
    }

    public void y() {
        if (!this.u) {
            while (!this.y.isEmpty()) {
                this.y.poll().N();
            }
        }
    }

    public boolean N() {
        return Thread.currentThread() == this.L;
    }

    public <T extends class00638> void N(T t, class00381<T> class003812) {
        if (this.u) {
            throw new RejectedExecutionException("Server already shutting down");
        }
        this.y.add(new class09365(t, class003812));
    }
}

