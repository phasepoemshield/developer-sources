/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util;

class NativeBuffer$BufferReference {
    public final long address;
    public final int length;
    public final StackTraceElement[] allocationSite;
    public boolean freed;

    NativeBuffer$BufferReference(long l, int n, StackTraceElement[] stackTraceElementArray) {
        this.address = l;
        this.length = n;
        this.allocationSite = stackTraceElementArray;
    }

    void checkFreed() {
        if (this.freed) {
            throw new IllegalStateException("Buffer has been deleted");
        }
    }
}

