/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.system.Pointer
 *  org.lwjgl.system.Struct
 *  org.lwjgl.system.Struct$Layout
 *  org.lwjgl.system.Struct$Member
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt;

import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMTAdapterInfoStruct;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Pointer;
import org.lwjgl.system.Struct;

class D3DKMTQueryAdapterInfoStruct
extends Struct<D3DKMTAdapterInfoStruct> {
    private static final int SIZEOF;
    private static final int ALIGNOF;
    private static final int OFFSET_ADAPTER_HANDLE;
    private static final int OFFSET_TYPE;
    private static final int OFFSET_DATA_PTR;
    private static final int OFFSET_DATA_SIZE;

    protected @NonNull D3DKMTAdapterInfoStruct create(long l, ByteBuffer byteBuffer) {
        return new D3DKMTAdapterInfoStruct(l, byteBuffer);
    }

    public void setType(int n) {
        MemoryUtil.memPutInt((long)(this.address + (long)OFFSET_TYPE), (int)n);
    }

    private D3DKMTQueryAdapterInfoStruct(long l, @Nullable ByteBuffer byteBuffer) {
        super(l, byteBuffer);
    }

    public void setDataPointer(long l) {
        MemoryUtil.memPutAddress((long)(this.address + (long)OFFSET_DATA_PTR), (long)l);
    }

    public void setAdapterHandle(int n) {
        MemoryUtil.memPutInt((long)(this.address + (long)OFFSET_ADAPTER_HANDLE), (int)n);
    }

    public void setDataLength(int n) {
        MemoryUtil.memPutInt((long)(this.address + (long)OFFSET_DATA_SIZE), (int)n);
    }

    public int sizeof() {
        return SIZEOF;
    }

    public static D3DKMTQueryAdapterInfoStruct malloc(MemoryStack memoryStack) {
        return new D3DKMTQueryAdapterInfoStruct(memoryStack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    static {
        Struct.Layout layout = D3DKMTQueryAdapterInfoStruct.__struct((Struct.Member[])new Struct.Member[]{D3DKMTQueryAdapterInfoStruct.__member((int)4), D3DKMTQueryAdapterInfoStruct.__member((int)4), D3DKMTQueryAdapterInfoStruct.__member((int)Pointer.POINTER_SIZE), D3DKMTQueryAdapterInfoStruct.__member((int)4)});
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET_ADAPTER_HANDLE = layout.offsetof(0);
        OFFSET_TYPE = layout.offsetof(1);
        OFFSET_DATA_PTR = layout.offsetof(2);
        OFFSET_DATA_SIZE = layout.offsetof(3);
    }
}

