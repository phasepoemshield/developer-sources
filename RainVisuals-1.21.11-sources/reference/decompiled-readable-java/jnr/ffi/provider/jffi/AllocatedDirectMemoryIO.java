/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import java.util.concurrent.atomic.AtomicBoolean;
import jnr.ffi.Runtime;
import jnr.ffi.provider.jffi.DirectMemoryIO;

class AllocatedDirectMemoryIO
extends DirectMemoryIO {
    private final long size;
    private final AtomicBoolean allocated = new AtomicBoolean(true);

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
        if (!(obj instanceof AllocatedDirectMemoryIO)) void var1_1;
        return super.equals(var1_1);
        AllocatedDirectMemoryIO mem = (AllocatedDirectMemoryIO)obj;
        if (mem.size != this.size) return false;
        if (mem.address() != this.address()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public AllocatedDirectMemoryIO(Runtime runtime, long size, boolean clear) {
        super(runtime, IO.allocateMemory(size, clear));
        this.size = size;
        if (this.address() == 0L) {
            throw new OutOfMemoryError("Failed to allocate " + size + " bytes");
        }
    }

    protected void finalize() throws Throwable {
        try {
            if (this.allocated.getAndSet(false)) {
                IO.freeMemory(this.address());
            }
        }
        finally {
            super.finalize();
        }
    }

    public final void dispose() {
        if (this.allocated.getAndSet(false)) {
            IO.freeMemory(this.address());
        }
    }
}

