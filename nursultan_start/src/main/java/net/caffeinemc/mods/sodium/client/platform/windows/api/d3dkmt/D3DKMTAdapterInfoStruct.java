/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.system.Struct
 *  org.lwjgl.system.Struct$Layout
 *  org.lwjgl.system.Struct$Member
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt;

import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMTAdapterInfoStruct$Buffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Struct;

class D3DKMTAdapterInfoStruct
extends Struct<D3DKMTAdapterInfoStruct> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    private static final int OFFSET_HADAPTER;
    private static final int OFFSET_ADAPTER_LUID;
    private static final int OFFSET_NUM_OF_SOURCES;
    private static final int OFFSET_PRECISE_PRESENT_REGIONS_PREFERRED;

    public static D3DKMTAdapterInfoStruct create(long l) {
        return new D3DKMTAdapterInfoStruct(l, null);
    }

    protected D3DKMTAdapterInfoStruct create(long l, ByteBuffer byteBuffer) {
        return new D3DKMTAdapterInfoStruct(l, byteBuffer);
    }

    D3DKMTAdapterInfoStruct(long l, ByteBuffer byteBuffer) {
        super(l, byteBuffer);
    }

    public int getAdapterHandle() {
        return MemoryUtil.memGetInt((long)(this.address + (long)OFFSET_HADAPTER));
    }

    public int sizeof() {
        return SIZEOF;
    }

    public static D3DKMTAdapterInfoStruct$Buffer calloc(int n) {
        return new D3DKMTAdapterInfoStruct$Buffer(MemoryUtil.nmemCalloc((long)n, (long)SIZEOF), n);
    }

    static {
        Struct.Layout layout = D3DKMTAdapterInfoStruct.__struct((Struct.Member[])new Struct.Member[]{D3DKMTAdapterInfoStruct.__member((int)4), D3DKMTAdapterInfoStruct.__member((int)8, (int)4), D3DKMTAdapterInfoStruct.__member((int)4), D3DKMTAdapterInfoStruct.__member((int)4)});
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET_HADAPTER = layout.offsetof(0);
        OFFSET_ADAPTER_LUID = layout.offsetof(1);
        OFFSET_NUM_OF_SOURCES = layout.offsetof(2);
        OFFSET_PRECISE_PRESENT_REGIONS_PREFERRED = layout.offsetof(3);
    }
}

