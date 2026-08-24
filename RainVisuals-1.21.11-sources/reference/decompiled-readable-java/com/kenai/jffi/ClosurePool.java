/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Closure;
import com.kenai.jffi.DirectClosureBuffer;
import com.kenai.jffi.Foreign;
import com.kenai.jffi.MemoryIO;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class ClosurePool {
    private final ConcurrentLinkedQueue<Handle> partialQueue;
    private final Set<Magazine> magazines = Collections.synchronizedSet(new HashSet());
    private final CallContext callContext;
    private final ConcurrentLinkedQueue<Handle> freeQueue = new ConcurrentLinkedQueue();
    private static final Closure NULL_CLOSURE = new Closure(){

        @Override
        public void invoke(Closure.Buffer buffer) {
        }
    };

    synchronized void recycle(Magazine magazine) {
        magazine.recycle();
        if (!magazine.isEmpty()) {
            this.useMagazine(magazine);
        } else {
            this.magazines.remove(magazine);
        }
    }

    private void useMagazine(Magazine m) {
        Magazine.Slot s;
        ConcurrentLinkedQueue<Handle> q;
        MagazineHolder h = new MagazineHolder(this, m);
        ArrayList<Handle> handles = new ArrayList<Handle>();
        ConcurrentLinkedQueue<Handle> concurrentLinkedQueue = q = m.isFull() ? this.freeQueue : this.partialQueue;
        while ((s = m.get()) != null) {
            handles.add(new Handle(s, h));
        }
        q.addAll(handles);
    }

    /*
     * WARNING - void declaration
     */
    public Closure.Handle newClosureHandle(Closure closure) {
        void var2_2;
        Handle h = this.partialQueue.poll();
        if (h == null) {
            h = this.freeQueue.poll();
        }
        if (h == null) {
            h = this.allocateNewHandle();
        }
        h.slot.proxy.closure = closure;
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    private Handle allocateNewHandle() {
        void var1_1;
        Handle h;
        while ((h = this.partialQueue.poll()) == null && (h = this.freeQueue.poll()) == null) {
            Magazine m = new Magazine(this.callContext);
            this.useMagazine(m);
            this.magazines.add(m);
        }
        return var1_1;
    }

    ClosurePool(CallContext callContext) {
        this.partialQueue = new ConcurrentLinkedQueue();
        this.callContext = callContext;
    }

    void recycle(Magazine.Slot slot, MagazineHolder holder) {
        this.partialQueue.add(new Handle(slot, holder));
    }

    static final class Proxy {
        final CallContext callContext;
        static final Method METHOD = Proxy.getMethod();
        volatile Closure closure = ClosurePool.access$000();

        public void invoke(long retvalAddress, long paramAddress) {
            this.closure.invoke(new DirectClosureBuffer(this.callContext, retvalAddress, paramAddress));
        }

        Proxy(CallContext callContext) {
            this.callContext = callContext;
        }

        /*
         * WARNING - void declaration
         */
        private static Method getMethod() {
            try {
                Class[] classArray = new Class[2];
                classArray[0] = Long.TYPE;
                classArray[1] = Long.TYPE;
                return Proxy.class.getDeclaredMethod("invoke", classArray);
            }
            catch (Throwable ex) {
                void var0;
                throw new RuntimeException((Throwable)var0);
            }
        }
    }

    private static final class MagazineHolder {
        final ClosurePool pool;
        final Magazine magazine;

        protected void finalize() throws Throwable {
            try {
                this.pool.recycle(this.magazine);
            }
            finally {
                super.finalize();
            }
        }

        public MagazineHolder(ClosurePool pool, Magazine magazine) {
            this.pool = pool;
            this.magazine = magazine;
        }
    }

    private static final class Handle
    implements Closure.Handle {
        private volatile boolean disposed;
        final Magazine.Slot slot;
        final MagazineHolder holder;

        Handle(Magazine.Slot slot, MagazineHolder holder) {
            this.slot = slot;
            this.holder = holder;
        }

        @Override
        public synchronized void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.slot.autorelease = true;
                this.slot.proxy.closure = NULL_CLOSURE;
                this.holder.pool.recycle(this.slot, this.holder);
            }
        }

        @Override
        public long getAddress() {
            if (this.disposed) {
                throw new RuntimeException("trying to access disposed closure handle");
            }
            return this.slot.codeAddress;
        }

        @Override
        public void setAutoRelease(boolean autorelease) {
            if (!this.disposed) {
                this.slot.autorelease = autorelease;
            }
        }

        @Override
        @Deprecated
        public void free() {
            this.dispose();
        }
    }

    private static final class Magazine {
        private int freeCount;
        private int next;
        private final Slot[] slots;
        private final Foreign foreign = Foreign.getInstance();
        private final CallContext ctx;
        private static final MemoryIO IO = MemoryIO.getInstance();
        private final long magazine;

        void recycle() {
            for (int i = 0; i < this.slots.length; ++i) {
                Slot s = this.slots[i];
                if (!s.autorelease) continue;
                ++this.freeCount;
                s.proxy.closure = NULL_CLOSURE;
            }
            this.next = 0;
        }

        boolean isFull() {
            return this.slots.length == this.freeCount;
        }

        boolean isEmpty() {
            return this.freeCount < 1;
        }

        /*
         * WARNING - void declaration
         */
        protected void finalize() throws Throwable {
            try {
                boolean release = true;
                int i = 0;
                while (i < this.slots.length) {
                    void var2_2;
                    if (!this.slots[i].autorelease) {
                        release = false;
                        break;
                    }
                    ++var2_2;
                }
                if (this.magazine != 0L && release) {
                    this.foreign.freeClosureMagazine(this.magazine);
                }
            }
            finally {
                super.finalize();
            }
        }

        /*
         * WARNING - void declaration
         */
        Slot get() {
            while (this.freeCount > 0 && this.next < this.slots.length) {
                void var1_1;
                int n = this.next;
                this.next = n + 1;
                Slot s = this.slots[n];
                if (!s.autorelease) continue;
                --this.freeCount;
                return var1_1;
            }
            return null;
        }

        Magazine(CallContext ctx) {
            this.ctx = ctx;
            this.magazine = this.foreign.newClosureMagazine(ctx.getAddress(), Proxy.METHOD, false);
            ArrayList<Slot> slots = new ArrayList<Slot>();
            while (true) {
                Proxy proxy = new Proxy(ctx);
                long h = this.foreign.closureMagazineGet(this.magazine, proxy);
                if (h == 0L) break;
                Slot s = new Slot(h, proxy);
                slots.add(s);
            }
            this.slots = new Slot[slots.size()];
            slots.toArray(this.slots);
            this.next = 0;
            this.freeCount = this.slots.length;
        }

        static final class Slot {
            final long codeAddress;
            volatile boolean autorelease;
            final Proxy proxy;
            final long handle;

            public Slot(long handle, Proxy proxy) {
                this.handle = handle;
                this.proxy = proxy;
                this.autorelease = true;
                this.codeAddress = IO.getAddress(handle);
            }
        }
    }
}

