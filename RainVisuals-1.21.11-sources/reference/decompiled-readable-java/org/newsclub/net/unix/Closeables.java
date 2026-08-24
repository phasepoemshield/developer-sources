/*
 * Decompiled with CFR 0.152.
 */
package org.newsclub.net.unix;

import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Closeables
implements Closeable {
    private List<WeakReference<Closeable>> list;
    private boolean closed = false;

    public synchronized boolean isClosed() {
        return this.closed;
    }

    public synchronized boolean remove(Closeable closeable) {
        block4: {
            block3: {
                if (this.list == null || closeable == null) break block3;
                if (!this.closed) break block4;
            }
            return false;
        }
        Iterator<WeakReference<Closeable>> it = this.list.iterator();
        while (it.hasNext()) {
            if (!closeable.equals(it.next().get())) continue;
            it.remove();
            return true;
        }
        return false;
    }

    public Closeables(Closeable ... closeable) {
        this.list = new ArrayList<WeakReference<Closeable>>();
        Closeable[] closeableArray = closeable;
        int n = closeableArray.length;
        for (int i = 0; i < n; ++i) {
            Closeable cl = closeableArray[i];
            this.list.add(new HardReference<Closeable>(cl));
        }
    }

    public Closeables() {
    }

    /*
     * WARNING - void declaration
     */
    public synchronized boolean add(WeakReference<Closeable> closeable) {
        void var1_1;
        if (this.closed) {
            return false;
        }
        Closeable cl = (Closeable)closeable.get();
        if (cl == null) {
            return false;
        }
        if (this.list == null) {
            this.list = new ArrayList<WeakReference<Closeable>>();
        } else {
            Iterator<WeakReference<Closeable>> iterator2 = this.list.iterator();
            while (iterator2.hasNext()) {
                WeakReference<Closeable> ref = iterator2.next();
                if (!cl.equals(ref.get())) continue;
                return false;
            }
        }
        this.list.add((WeakReference<Closeable>)var1_1);
        return true;
    }

    @Override
    public void close() throws IOException {
        this.close(null);
    }

    public synchronized boolean add(Closeable closeable) {
        return this.add(new HardReference<Closeable>(closeable));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void close(IOException superException) throws IOException {
        void var2_2;
        List<WeakReference<Closeable>> l;
        IOException exc = superException;
        Closeables closeables = this;
        synchronized (closeables) {
            this.closed = true;
            l = this.list;
            if (l == null) {
                return;
            }
            l = new ArrayList<WeakReference<Closeable>>(l);
            this.list = null;
        }
        for (WeakReference weakReference : l) {
            Closeable cl = (Closeable)weakReference.get();
            if (cl == null) continue;
            try {
                cl.close();
            }
            catch (IOException e) {
                void var7_8;
                if (exc == null) {
                    exc = e;
                    continue;
                }
                exc.addSuppressed((Throwable)var7_8);
            }
        }
        if (var2_2 != null) {
            throw var2_2;
        }
    }

    private static final class HardReference<V>
    extends WeakReference<V> {
        private final V strongRef;

        @Override
        public V get() {
            return this.strongRef;
        }

        HardReference(V referent) {
            super(null);
            this.strongRef = referent;
        }
    }
}

