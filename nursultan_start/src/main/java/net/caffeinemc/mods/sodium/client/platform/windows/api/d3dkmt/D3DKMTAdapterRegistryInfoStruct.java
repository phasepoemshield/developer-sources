/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.system.Struct
 *  org.lwjgl.system.Struct$Layout
 *  org.lwjgl.system.Struct$Member
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt;

import java.nio.ByteBuffer;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Struct;

class D3DKMTAdapterRegistryInfoStruct
extends Struct<D3DKMTAdapterRegistryInfoStruct> {
    private static final int MAX_PATH = 260;
    private static final int SIZEOF;
    private static final int ALIGNOF;
    private static final int OFFSET_ADAPTER_STRING;
    private static final int OFFSET_BIOS_STRING;
    private static final int OFFSET_DAC_TYPE;
    private static final int OFFSET_CHIP_TYPE;

    protected D3DKMTAdapterRegistryInfoStruct create(long l, ByteBuffer byteBuffer) {
        return new D3DKMTAdapterRegistryInfoStruct(l, byteBuffer);
    }

    private static @Nullable String getString(long l) {
        ByteBuffer byteBuffer = MemoryUtil.memByteBuffer((long)l, (int)520);
        int n = MemoryUtil.memLengthNT2((ByteBuffer)byteBuffer) >> 1;
        if (n == 0) {
            return null;
        }
        return MemoryUtil.memUTF16((ByteBuffer)byteBuffer, (int)n);
    }

    private D3DKMTAdapterRegistryInfoStruct(long l, ByteBuffer byteBuffer) {
        super(l, byteBuffer);
    }

    public @Nullable String getAdapterString() {
        return D3DKMTAdapterRegistryInfoStruct.getString(this.address + (long)OFFSET_ADAPTER_STRING);
    }

    public int sizeof() {
        return SIZEOF;
    }

    public static D3DKMTAdapterRegistryInfoStruct calloc(MemoryStack memoryStack) {
        return new D3DKMTAdapterRegistryInfoStruct(memoryStack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    static {
        Struct.Layout layout = D3DKMTAdapterRegistryInfoStruct.__struct((Struct.Member[])new Struct.Member[]{D3DKMTAdapterRegistryInfoStruct.__member((int)520, (int)2), D3DKMTAdapterRegistryInfoStruct.__member((int)520, (int)2), D3DKMTAdapterRegistryInfoStruct.__member((int)520, (int)2), D3DKMTAdapterRegistryInfoStruct.__member((int)520, (int)2)});
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET_ADAPTER_STRING = layout.offsetof(0);
        OFFSET_BIOS_STRING = layout.offsetof(1);
        OFFSET_DAC_TYPE = layout.offsetof(2);
        OFFSET_CHIP_TYPE = layout.offsetof(3);
    }
}

