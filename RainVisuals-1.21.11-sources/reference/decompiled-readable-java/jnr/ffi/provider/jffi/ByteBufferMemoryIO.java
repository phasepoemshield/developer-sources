/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.MemoryIO;
import java.nio.ByteBuffer;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.provider.AbstractBufferMemoryIO;
import jnr.ffi.provider.jffi.MemoryUtil;

public class ByteBufferMemoryIO
extends AbstractBufferMemoryIO {
    @Override
    public Pointer getPointer(long offset, long size) {
        return MemoryUtil.newPointer(this.getRuntime(), this.getAddress(offset), size);
    }

    public ByteBufferMemoryIO(Runtime runtime, ByteBuffer buffer) {
        super(runtime, buffer, ByteBufferMemoryIO.address(buffer));
    }

    @Override
    public void putPointer(long offset, Pointer value) {
        this.putAddress(offset, value != null ? value.address() : 0L);
    }

    @Override
    public Pointer getPointer(long offset) {
        return MemoryUtil.newPointer(this.getRuntime(), this.getAddress(offset));
    }

    private static long address(ByteBuffer buffer) {
        if (buffer.isDirect()) {
            long address = MemoryIO.getInstance().getDirectBufferAddress(buffer);
            return address != 0L ? address + (long)buffer.position() : 0L;
        }
        return 0L;
    }
}

