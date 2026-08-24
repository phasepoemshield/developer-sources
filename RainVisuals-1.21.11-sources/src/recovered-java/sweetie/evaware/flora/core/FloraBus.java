/*
 * Decompiled with CFR 0.152.
 */
package sweetie.evaware.flora.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import sweetie.evaware.flora.api.Subscription;
import sweetie.evaware.flora.core.Listener;
import sweetie.evaware.flora.core.engine.AsyncLoop;

public class FloraBus<T> {
    private static final AsyncLoop ASYNC_WORKER = new AsyncLoop();
    private final Object lock = new Object();
    private static final ForkJoinPool PARALLEL_POOL = ForkJoinPool.commonPool();
    private volatile Listener<T>[] syncListeners;
    private volatile Listener<T>[] parallelListeners;
    private final List<Listener<T>> subscribers = new ArrayList<Listener<T>>();
    private volatile Listener<T>[] asyncListeners;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void unsubscribe(Listener<T> listener) {
        Object object = this.lock;
        synchronized (object) {
            if (this.subscribers.remove(listener)) {
                this.rebuild();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Subscription subscribe(Listener<T> listener) {
        Object object = this.lock;
        synchronized (object) {
            this.subscribers.add(listener);
            this.rebuild();
        }
        return () -> this.unsubscribe(listener);
    }

    public void post(T event) {
        Listener<T>[] sync = this.syncListeners;
        int i = 0;
        int syncLen = sync.length;
        while (i < syncLen) {
            sync[i++].accept(event);
        }
        Listener[] async = this.asyncListeners;
        int asyncLen = async.length;
        if (asyncLen > 0) {
            ASYNC_WORKER.execute(() -> {
                int j = 0;
                while (j < asyncLen) {
                    async[j++].accept(event);
                }
            });
        }
        Listener<T>[] parallel = this.parallelListeners;
        int k = 0;
        int parLength = parallel.length;
        while (k < parLength) {
            Listener l = parallel[k++];
            PARALLEL_POOL.execute(() -> l.accept(event));
        }
    }

    public FloraBus() {
        this.syncListeners = new Listener[0];
        this.asyncListeners = new Listener[0];
        this.parallelListeners = new Listener[0];
    }

    private void rebuild() {
        Collections.sort(this.subscribers);
        ArrayList<Listener<T>> sync = new ArrayList<Listener<T>>();
        ArrayList<Listener<T>> async = new ArrayList<Listener<T>>();
        ArrayList<Listener<T>> parallel = new ArrayList<Listener<T>>();
        for (Listener<T> listener : this.subscribers) {
            switch (listener.mode) {
                case SYNC: {
                    sync.add(listener);
                    break;
                }
                case ASYNC: {
                    async.add(listener);
                    break;
                }
                case ASYNC_PARALLEL: {
                    parallel.add(listener);
                }
            }
        }
        this.syncListeners = sync.toArray(new Listener[0]);
        this.asyncListeners = async.toArray(new Listener[0]);
        this.parallelListeners = parallel.toArray(new Listener[0]);
    }
}

