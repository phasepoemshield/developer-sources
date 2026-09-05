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
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Struct;

public class D3DKMTOpenGLInfoStruct
extends Struct<D3DKMTOpenGLInfoStruct> {
    private static final int MAX_PATH = 260;
    private static final int SIZEOF;
    private static final int ALIGNOF;
    private static final int OFFSET_UMD_OPENGL_ICD_FILE_NAME;
    private static final int OFFSET_VERSION;
    private static final int OFFSET_FLAGS;

    protected @NonNull D3DKMTOpenGLInfoStruct create(long l, ByteBuffer byteBuffer) {
        return new D3DKMTOpenGLInfoStruct(l, byteBuffer);
    }

    public int getFlags() {
        return MemoryUtil.memGetInt((long)(this.address + (long)OFFSET_FLAGS));
    }

    private D3DKMTOpenGLInfoStruct(long l, @Nullable ByteBuffer byteBuffer) {
        super(l, byteBuffer);
    }

    public int getVersion() {
        return MemoryUtil.memGetInt((long)(this.address + (long)OFFSET_VERSION));
    }

    public int sizeof() {
        return SIZEOF;
    }

    public @Nullable String getUserModeDriverFileName() {
        ByteBuffer byteBuffer = this.getUserModeDriverFileNameBuffer();
        int n = MemoryUtil.memLengthNT2((ByteBuffer)byteBuffer);
        if (n == 0) {
            return null;
        }
        return MemoryUtil.memUTF16((long)MemoryUtil.memAddress((ByteBuffer)byteBuffer), (int)(n >> 1));
    }

    public static D3DKMTOpenGLInfoStruct calloc(MemoryStack memoryStack) {
        return new D3DKMTOpenGLInfoStruct(memoryStack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static D3DKMTOpenGLInfoStruct calloc() {
        return new D3DKMTOpenGLInfoStruct(MemoryUtil.nmemCalloc((long)1L, (long)SIZEOF), null);
    }

    public ByteBuffer getUserModeDriverFileNameBuffer() {
        return MemoryUtil.memByteBuffer((long)(this.address + (long)OFFSET_UMD_OPENGL_ICD_FILE_NAME), (int)520);
    }

    static {
        Struct.Layout layout = D3DKMTOpenGLInfoStruct.__struct((Struct.Member[])new Struct.Member[]{D3DKMTOpenGLInfoStruct.__member((int)520, (int)2), D3DKMTOpenGLInfoStruct.__member((int)4), D3DKMTOpenGLInfoStruct.__member((int)4)});
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET_UMD_OPENGL_ICD_FILE_NAME = layout.offsetof(0);
        OFFSET_VERSION = layout.offsetof(1);
        OFFSET_FLAGS = layout.offsetof(2);
    }
}

