/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.provider.BoundedMemoryIO;
import jnr.ffi.provider.jffi.DirectMemoryIO;

public final class MemoryUtil {
    static Pointer newPointer(Runtime runtime, int ptr) {
        return ptr != 0 ? new DirectMemoryIO(runtime, ptr) : null;
    }

    static Pointer newPointer(Runtime runtime, long ptr, long size) {
        return ptr != 0L ? new BoundedMemoryIO(new DirectMemoryIO(runtime, ptr), 0L, size) : null;
    }

    static Pointer newPointer(Runtime runtime, long ptr) {
        return ptr != 0L ? new DirectMemoryIO(runtime, ptr) : null;
    }

    private MemoryUtil() {
    }
}

