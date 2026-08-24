/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.PageManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jnr.ffi.Runtime;
import jnr.ffi.provider.jffi.AllocatedDirectMemoryIO;
import jnr.ffi.provider.jffi.DirectMemoryIO;
import jnr.ffi.provider.jffi.NativeFinalizer;
import jnr.ffi.util.ref.FinalizablePhantomReference;
import jnr.ffi.util.ref.FinalizableReferenceQueue;

public class TransientNativeMemory
extends DirectMemoryIO {
    private final Sentinel sentinel;
    private static final int PAGES_PER_MAGAZINE = 2;
    private final long size;
    private static final Map<Magazine, Boolean> referenceSet = new ConcurrentHashMap<Magazine, Boolean>();
    private static final ThreadLocal<Magazine> currentMagazine = new ThreadLocal();

    /*
     * WARNING - void declaration
     */
    public static DirectMemoryIO allocate(Runtime runtime, long size, int align, boolean clear) {
        void var1_1;
        void var7_6;
        void var6_5;
        Runtime runtime2;
        block7: {
            long memory;
            long address;
            Sentinel sentinel;
            Magazine magazine;
            block6: {
                if (size < 0L) {
                    throw new IllegalArgumentException("negative size: " + size);
                }
                if (size > 256L) {
                    return new AllocatedDirectMemoryIO(runtime, size, clear);
                }
                magazine = currentMagazine.get();
                sentinel = magazine != null ? magazine.sentinel() : null;
                if (sentinel == null) break block6;
                address = magazine.allocate(size, align);
                if (address != 0L) break block7;
            }
            PageManager pm = PageManager.getInstance();
            while (true) {
                memory = pm.allocatePages(2, 3);
                if (memory != 0L && memory != -1L) break;
                System.gc();
                FinalizableReferenceQueue.cleanUpAll();
            }
            sentinel = new Sentinel();
            magazine = new Magazine(sentinel, pm, memory, 2);
            referenceSet.put(magazine, Boolean.TRUE);
            currentMagazine.set(magazine);
            address = magazine.allocate(size, align);
        }
        return new TransientNativeMemory(runtime2, (Sentinel)var6_5, (long)var7_6, (long)var1_1);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    TransientNativeMemory(Runtime runtime, Sentinel sentinel, long address, long size) {
        super(runtime, address);
        this.sentinel = sentinel;
        this.size = size;
    }

    public final void dispose() {
    }

    @Override
    public long size() {
        return this.size;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TransientNativeMemory)) void var1_1;
        return super.equals(var1_1);
        TransientNativeMemory mem = (TransientNativeMemory)obj;
        if (mem.size != this.size) return false;
        if (mem.address() != this.address()) return false;
        return true;
    }

    public static DirectMemoryIO allocate(Runtime runtime, int size, int align, boolean clear) {
        return TransientNativeMemory.allocate(runtime, (long)size, align, clear);
    }

    private static long align(long offset, long align) {
        return offset + align - 1L & (align - 1L ^ 0xFFFFFFFFFFFFFFFFL);
    }

    private static final class Sentinel {
        private Sentinel() {
        }
    }

    private static final class Magazine
    extends FinalizablePhantomReference<Sentinel> {
        private final long page;
        private final long end;
        private final int pageCount;
        private long memory;
        private final PageManager pm;
        private final Reference<Sentinel> sentinelReference;

        @Override
        public final void finalizeReferent() {
            this.pm.freePages(this.page, this.pageCount);
            referenceSet.remove(this);
        }

        Sentinel sentinel() {
            return this.sentinelReference.get();
        }

        Magazine(Sentinel sentinel, PageManager pm, long page, int pageCount) {
            super(sentinel, NativeFinalizer.getInstance().getFinalizerQueue());
            this.sentinelReference = new WeakReference<Sentinel>(sentinel);
            this.pm = pm;
            this.memory = this.page = page;
            this.pageCount = pageCount;
            this.end = this.memory + (long)pageCount * pm.pageSize();
        }

        long allocate(long size, int align) {
            long address = TransientNativeMemory.align(this.memory, align);
            if (address + size <= this.end) {
                this.memory = address + size;
                return address;
            }
            return 0L;
        }
    }
}

