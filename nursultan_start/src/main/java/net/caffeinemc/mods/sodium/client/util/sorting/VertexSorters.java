/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03326
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  org.apache.commons.lang3.Validate
 *  org.joml.Intersectionf
 *  org.joml.Vector3f
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.util.sorting;

import java.nio.ByteBuffer;
import minecraft.class03326;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.util.MathUtil;
import net.caffeinemc.mods.sodium.client.util.sorting.RadixSort;
import net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters$SortByDistanceToOrigin;
import net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters$SortByDistanceToPoint;
import net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters$SortByFallback;
import net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters$SortByOrthographicZ;
import net.caffeinemc.mods.sodium.client.util.sorting.VertexSortingExtended;
import org.apache.commons.lang3.Validate;
import org.joml.Intersectionf;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;

public class VertexSorters {
    public static int[] sort(ByteBuffer byteBuffer, int n, int n2, VertexSortingExtended vertexSortingExtended) {
        Validate.isTrue((byteBuffer.remaining() >= n2 * n ? 1 : 0) != 0, (String)"Vertex buffer is not large enough to contain all vertices", (Object[])new Object[0]);
        if (SodiumClientMod.options().quality.useClosestPointEntitySort) {
            if (vertexSortingExtended instanceof VertexSorters$SortByDistanceToPoint) {
                VertexSorters$SortByDistanceToPoint vertexSorters$SortByDistanceToPoint = (VertexSorters$SortByDistanceToPoint)vertexSortingExtended;
                return VertexSorters.sortWithPerspective(byteBuffer, n, n2, vertexSorters$SortByDistanceToPoint, vertexSorters$SortByDistanceToPoint.x, vertexSorters$SortByDistanceToPoint.y, vertexSorters$SortByDistanceToPoint.z);
            }
            if (vertexSortingExtended instanceof VertexSorters$SortByDistanceToOrigin) {
                return VertexSorters.sortWithPerspective(byteBuffer, n, n2, vertexSortingExtended, 0.0f, 0.0f, 0.0f);
            }
        }
        return VertexSorters.sortWithCentroid(byteBuffer, n, n2, vertexSortingExtended);
    }

    public static VertexSortingExtended distance(float f, float f2, float f3) {
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f) {
            return VertexSorters$SortByDistanceToOrigin.INSTANCE;
        }
        return new VertexSorters$SortByDistanceToPoint(f, f2, f3);
    }

    public static VertexSortingExtended fallback(class03326 class033262) {
        return new VertexSorters$SortByFallback(class033262);
    }

    public static int[] sortWithPerspective(ByteBuffer byteBuffer, int n, int n2, VertexSortingExtended vertexSortingExtended, float f, float f2, float f3) {
        long l = MemoryUtil.memAddress((ByteBuffer)byteBuffer);
        long l2 = MemoryUtil.memAddress((ByteBuffer)byteBuffer, (int)n2);
        long l3 = MemoryUtil.memAddress((ByteBuffer)byteBuffer, (int)(n2 * 2));
        int n3 = n / 4;
        int n4 = n2 * 4;
        int[] nArray = new int[n3];
        int[] nArray2 = new int[n3];
        Vector3f vector3f = new Vector3f();
        for (int i = 0; i < n3; ++i) {
            float f4 = MemoryUtil.memGetFloat((long)(l + 0L));
            float f5 = MemoryUtil.memGetFloat((long)(l + 4L));
            float f6 = MemoryUtil.memGetFloat((long)(l + 8L));
            float f7 = MemoryUtil.memGetFloat((long)(l2 + 0L));
            float f8 = MemoryUtil.memGetFloat((long)(l2 + 4L));
            float f9 = MemoryUtil.memGetFloat((long)(l2 + 8L));
            float f10 = MemoryUtil.memGetFloat((long)(l3 + 0L));
            float f11 = MemoryUtil.memGetFloat((long)(l3 + 4L));
            float f12 = MemoryUtil.memGetFloat((long)(l3 + 8L));
            Intersectionf.findClosestPointOnRectangle((float)f7, (float)f8, (float)f9, (float)f4, (float)f5, (float)f6, (float)f10, (float)f11, (float)f12, (float)f, (float)f2, (float)f3, (Vector3f)vector3f);
            nArray[i] = MathUtil.floatToComparableInt(-vertexSortingExtended.applyMetric(vector3f.x, vector3f.y, vector3f.z));
            nArray2[i] = i;
            l += (long)n4;
            l2 += (long)n4;
            l3 += (long)n4;
        }
        RadixSort.sortIndirect(nArray2, nArray, true);
        return nArray2;
    }

    public static VertexSortingExtended orthographicZ() {
        return VertexSorters$SortByOrthographicZ.INSTANCE;
    }

    public static int[] sortWithCentroid(ByteBuffer byteBuffer, int n, int n2, VertexSortingExtended vertexSortingExtended) {
        long l = MemoryUtil.memAddress((ByteBuffer)byteBuffer);
        long l2 = MemoryUtil.memAddress((ByteBuffer)byteBuffer, (int)(n2 * 2));
        int n3 = n / 4;
        int n4 = n2 * 4;
        int[] nArray = new int[n3];
        int[] nArray2 = new int[n3];
        for (int i = 0; i < n3; ++i) {
            float f = MemoryUtil.memGetFloat((long)(l + 0L));
            float f2 = MemoryUtil.memGetFloat((long)(l + 4L));
            float f3 = MemoryUtil.memGetFloat((long)(l + 8L));
            float f4 = MemoryUtil.memGetFloat((long)(l2 + 0L));
            float f5 = MemoryUtil.memGetFloat((long)(l2 + 4L));
            float f6 = MemoryUtil.memGetFloat((long)(l2 + 8L));
            float f7 = (f + f4) * 0.5f;
            float f8 = (f2 + f5) * 0.5f;
            float f9 = (f3 + f6) * 0.5f;
            nArray[i] = MathUtil.floatToComparableInt(-vertexSortingExtended.applyMetric(f7, f8, f9));
            nArray2[i] = i;
            l += (long)n4;
            l2 += (long)n4;
        }
        RadixSort.sortIndirect(nArray2, nArray, true);
        return nArray2;
    }
}

