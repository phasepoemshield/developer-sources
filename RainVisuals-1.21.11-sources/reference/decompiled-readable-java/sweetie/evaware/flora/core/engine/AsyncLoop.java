/*
 * Decompiled with CFR 0.152.
 */
package sweetie.evaware.flora.core.engine;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

public class AsyncLoop
extends Thread {
    private static final VarHandle CONSUMER_IDX;
    private volatile long consumerIndex;
    long p14;
    long p11;
    long p23;
    long p13;
    long p12;
    long p25;
    long p02;
    private static final VarHandle ARRAY_ELEM;
    private volatile long producerIndex;
    long p07;
    long p22;
    private static final int MASK = 65535;
    private final AtomicBoolean running = new AtomicBoolean(true);
    long p27;
    private static final VarHandle PRODUCER_IDX;
    long p26;
    long p17;
    long p06;
    long p24;
    private static final int CAPACITY = 65536;
    long p15;
    long p03;
    long p21;
    long p16;
    private final Runnable[] buffer = new Runnable[65536];
    long p01;
    long p04;
    long p05;

    public void shutdown() {
        this.running.set(false);
        LockSupport.unpark(this);
    }

    public void execute(Runnable task) {
        long currHead;
        long currTail;
        do {
            currHead = CONSUMER_IDX.getVolatile(this);
            currTail = PRODUCER_IDX.getVolatile(this);
            if (currTail - currHead < 65536L) continue;
            Thread.onSpinWait();
        } while (!PRODUCER_IDX.compareAndSet(this, currTail, currTail + 1L));
        int offset = (int)(currTail & 0xFFFFL);
        ARRAY_ELEM.setRelease(this.buffer, offset, task);
        if (currTail == currHead) {
            LockSupport.unpark(this);
        }
    }

    static {
        try {
            MethodHandles.Lookup l = MethodHandles.lookup();
            PRODUCER_IDX = l.findVarHandle(AsyncLoop.class, "producerIndex", Long.TYPE);
            CONSUMER_IDX = l.findVarHandle(AsyncLoop.class, "consumerIndex", Long.TYPE);
            ARRAY_ELEM = MethodHandles.arrayElementVarHandle(Runnable[].class);
        }
        catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public AsyncLoop() {
        super("Async-Worker");
        this.setDaemon(true);
        this.start();
    }

    @Override
    public void run() {
        while (this.running.get()) {
            long currTail;
            long currHead = CONSUMER_IDX.getVolatile(this);
            if (currHead < (currTail = PRODUCER_IDX.getVolatile(this))) {
                int offset = (int)(currHead & 0xFFFFL);
                Runnable task = ARRAY_ELEM.getAcquire(this.buffer, offset);
                if (task == null) {
                    Thread.onSpinWait();
                    continue;
                }
                try {
                    task.run();
                }
                catch (Throwable t) {
                    t.printStackTrace();
                }
                ARRAY_ELEM.setRelease(this.buffer, offset, null);
                CONSUMER_IDX.setRelease(this, currHead + 1L);
                continue;
            }
            LockSupport.park();
        }
    }
}

