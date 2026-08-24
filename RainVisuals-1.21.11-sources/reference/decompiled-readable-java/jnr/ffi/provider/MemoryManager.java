/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider;

import java.nio.ByteBuffer;
import jnr.ffi.Pointer;

public interface MemoryManager {
    public Pointer allocateTemporary(int var1, boolean var2);

    public Pointer allocate(int var1);

    public Pointer allocateDirect(int var1);

    public Pointer allocateDirect(long var1, boolean var3);

    public Pointer newPointer(long var1);

    public Pointer newOpaquePointer(long var1);

    public Pointer newPointer(long var1, long var3);

    public Pointer newPointer(ByteBuffer var1);

    public Pointer allocateDirect(int var1, boolean var2);

    public Pointer allocateDirect(long var1);
}

