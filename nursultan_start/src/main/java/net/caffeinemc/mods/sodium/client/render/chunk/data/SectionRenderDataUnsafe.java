/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.util.UInt32
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.render.chunk.data;

import net.caffeinemc.mods.sodium.client.util.UInt32;
import org.lwjgl.system.MemoryUtil;

public class SectionRenderDataUnsafe {
    private static final long OFFSET_BASE_ELEMENT = 0L;
    private static final long OFFSET_BASE_VERTEX = 4L;
    private static final long OFFSET_FACING_LIST = 8L;
    private static final long OFFSET_IS_LOCAL_INDEX = 15L;
    private static final long OFFSET_SLICE_MASK = 16L;
    private static final long OFFSET_ELEMENT_COUNTS = 20L;
    private static final long ALIGNMENT = 8L;
    private static final long STRIDE = 48L;

    public static long getVertexCount(long l, int n) {
        return UInt32.upcast((int)MemoryUtil.memGetInt((long)(l + 20L + (long)(n * 4))));
    }

    public static long getBaseVertex(long l) {
        return UInt32.upcast((int)MemoryUtil.memGetInt((long)(l + 4L)));
    }

    public static boolean isLocalIndex(long l) {
        return MemoryUtil.memGetByte((long)(l + 15L)) != 0;
    }

    public static long getFacingList(long l) {
        return MemoryUtil.memGetLong((long)(l + 8L));
    }

    public static int getSliceMask(long l) {
        return MemoryUtil.memGetInt((long)(l + 16L));
    }

    public static long getBaseElement(long l) {
        return Integer.toUnsignedLong(MemoryUtil.memGetInt((long)(l + 0L)));
    }

    public static void setVertexCount(long l, int n, long l2) {
        MemoryUtil.memPutInt((long)(l + 20L + (long)(n * 4)), (int)UInt32.downcast((long)l2));
    }

    public static long allocateHeap(int n) {
        long l = 48L * (long)n;
        long l2 = MemoryUtil.nmemAlignedAlloc((long)8L, (long)l);
        MemoryUtil.memSet((long)l2, (int)0, (long)l);
        return l2;
    }

    public static void clearVertexData(long l) {
        int n = MemoryUtil.memGetInt((long)(l + 0L));
        byte by = MemoryUtil.memGetByte((long)(l + 15L));
        SectionRenderDataUnsafe.clearFull(l);
        MemoryUtil.memPutInt((long)(l + 0L), (int)n);
        MemoryUtil.memPutByte((long)(l + 15L), (byte)by);
    }

    public static void setFacingList(long l, long l2) {
        byte by = MemoryUtil.memGetByte((long)(l + 15L));
        MemoryUtil.memPutLong((long)(l + 8L), (long)l2);
        MemoryUtil.memPutByte((long)(l + 15L), (byte)by);
    }

    public static long heapPointer(long l, int n) {
        return l + (long)n * 48L;
    }

    public static void setBaseVertex(long l, long l2) {
        MemoryUtil.memPutInt((long)(l + 4L), (int)UInt32.downcast((long)l2));
    }

    public static void setSliceMask(long l, int n) {
        MemoryUtil.memPutInt((long)(l + 16L), (int)n);
    }

    public static void clearIndexData(long l) {
        MemoryUtil.memPutInt((long)(l + 0L), (int)0);
        MemoryUtil.memPutByte((long)(l + 15L), (byte)0);
    }

    public static void freeHeap(long l) {
        MemoryUtil.nmemAlignedFree((long)l);
    }

    public static void clearFull(long l) {
        MemoryUtil.memSet((long)l, (int)0, (long)48L);
    }

    public static void setSharedBaseElement(long l, long l2) {
        MemoryUtil.memPutInt((long)(l + 0L), (int)UInt32.downcast((long)l2));
        MemoryUtil.memPutByte((long)(l + 15L), (byte)0);
    }

    public static void setLocalBaseElement(long l, long l2) {
        MemoryUtil.memPutInt((long)(l + 0L), (int)UInt32.downcast((long)l2));
        MemoryUtil.memPutByte((long)(l + 15L), (byte)1);
    }
}

