/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.system.Struct
 *  org.lwjgl.system.Struct$Layout
 *  org.lwjgl.system.Struct$Member
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt;

import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMTAdapterInfoStruct;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMTAdapterInfoStruct$Buffer;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Struct;

class D3DKMTEnumAdaptersStruct
extends Struct<D3DKMTEnumAdaptersStruct> {
    private static final int SIZEOF;
    private static final int ALIGNOF;
    private static final int MAX_ENUM_ADAPTERS = 16;
    private static final int OFFSET_NUM_ADAPTERS;
    private static final int OFFSET_ADAPTERS;

    protected @NonNull D3DKMTEnumAdaptersStruct create(long l, ByteBuffer byteBuffer) {
        return new D3DKMTEnumAdaptersStruct(l, byteBuffer);
    }

    private D3DKMTEnumAdaptersStruct(long l, @Nullable ByteBuffer byteBuffer) {
        super(l, byteBuffer);
    }

    public D3DKMTAdapterInfoStruct$Buffer getAdapters() {
        return new D3DKMTAdapterInfoStruct$Buffer(this.address + (long)OFFSET_ADAPTERS, MemoryUtil.memGetInt((long)(this.address + (long)OFFSET_NUM_ADAPTERS)));
    }

    public int sizeof() {
        return SIZEOF;
    }

    public static D3DKMTEnumAdaptersStruct calloc(MemoryStack memoryStack) {
        return new D3DKMTEnumAdaptersStruct(memoryStack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    static {
        Struct.Layout layout = D3DKMTEnumAdaptersStruct.__struct((Struct.Member[])new Struct.Member[]{D3DKMTEnumAdaptersStruct.__member((int)4), D3DKMTEnumAdaptersStruct.__member((int)(D3DKMTAdapterInfoStruct.SIZEOF * 16), (int)D3DKMTAdapterInfoStruct.ALIGNOF)});
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET_NUM_ADAPTERS = layout.offsetof(0);
        OFFSET_ADAPTERS = layout.offsetof(1);
    }
}

