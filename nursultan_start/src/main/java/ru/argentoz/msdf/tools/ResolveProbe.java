/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09716
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.util.msdfgen.MSDFGen
 *  org.lwjgl.util.msdfgen.MSDFGenExt
 *  org.lwjgl.util.msdfgen.MSDFGenVector2
 */
package ru.argentoz.msdf.tools;

import Nursultan.class09716;
import java.nio.DoubleBuffer;
import java.util.ArrayList;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.msdfgen.MSDFGen;
import org.lwjgl.util.msdfgen.MSDFGenExt;
import org.lwjgl.util.msdfgen.MSDFGenVector2;

public final class ResolveProbe {
    private ResolveProbe() {
    }

    public static void main(String[] stringArray) {
        long l;
        long l2;
        long l3;
        String string = stringArray[0];
        int n = stringArray.length > 1 ? stringArray[1].codePointAt(0) : 90;
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            ResolveProbe.N(MSDFGenExt.msdf_ft_init((PointerBuffer)pointerBuffer));
            l3 = pointerBuffer.get(0);
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            ResolveProbe.N(MSDFGenExt.msdf_ft_load_font((long)l3, (CharSequence)string, (PointerBuffer)pointerBuffer));
            l2 = pointerBuffer.get(0);
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            DoubleBuffer doubleBuffer = memoryStack.mallocDouble(1);
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            ResolveProbe.N(MSDFGenExt.msdf_ft_font_load_glyph((long)l2, (int)n, (int)1, (DoubleBuffer)doubleBuffer, (PointerBuffer)pointerBuffer));
            l = pointerBuffer.get(0);
        }
        long l4 = class09716.N((long)l);
        System.out.println("glyph '" + (char)n + "'  resolved=" + l4);
        ResolveProbe.N(l4);
        MSDFGen.msdf_shape_free((long)l4);
        MSDFGen.msdf_shape_free((long)l);
        MSDFGenExt.msdf_ft_font_destroy((long)l2);
        MSDFGenExt.msdf_ft_deinit((long)l3);
    }

    private static int y(long l) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            ResolveProbe.N(MSDFGen.msdf_segment_get_point_count((long)l, (PointerBuffer)pointerBuffer));
            int n = (int)pointerBuffer.get(0);
            return n;
        }
    }

    private static long y(long l, long l2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            ResolveProbe.N(MSDFGen.msdf_contour_get_edge((long)l, (long)l2, (PointerBuffer)pointerBuffer));
            long l3 = pointerBuffer.get(0);
            return l3;
        }
    }

    private static double y(double[] dArray, double[] dArray2, double[] dArray3) {
        double d = dArray2[0] - dArray[0];
        double d2 = dArray2[1] - dArray[1];
        double d3 = dArray3[0] - dArray2[0];
        double d4 = dArray3[1] - dArray2[1];
        double d5 = Math.hypot(d, d2);
        double d6 = Math.hypot(d3, d4);
        if (d5 < 1.0E-12 || d6 < 1.0E-12) {
            return 0.0;
        }
        double d7 = (d * d3 + d2 * d4) / (d5 * d6);
        d7 = Math.max(-1.0, Math.min(1.0, d7));
        return Math.toDegrees(Math.acos(d7));
    }

    private static double N(double[] dArray, double[] dArray2) {
        return Math.hypot(dArray[0] - dArray2[0], dArray[1] - dArray2[1]);
    }

    private static double N(double[] dArray, double[] dArray2, double[] dArray3) {
        double d = dArray3[0] - dArray2[0];
        double d2 = dArray3[1] - dArray2[1];
        double d3 = d * d + d2 * d2;
        double d4 = d3 < 1.0E-18 ? 0.0 : ((dArray[0] - dArray2[0]) * d + (dArray[1] - dArray2[1]) * d2) / d3;
        d4 = Math.max(0.0, Math.min(1.0, d4));
        return Math.hypot(dArray[0] - (dArray2[0] + d4 * d), dArray[1] - (dArray2[1] + d4 * d2));
    }

    private static void N(long l) {
        long l2 = ResolveProbe.N(l, 0);
        System.out.println("contours=" + l2);
        for (long i = 0L; i < l2; ++i) {
            int n;
            double[] dArray;
            long l3 = ResolveProbe.N(l, i);
            long l4 = ResolveProbe.N(l3, 1);
            ArrayList<double[]> arrayList = new ArrayList<double[]>();
            double d = Double.MAX_VALUE;
            try (MemoryStack memoryStack = MemoryStack.stackPush();){
                MSDFGenVector2 mSDFGenVector2 = MSDFGenVector2.malloc((MemoryStack)memoryStack);
                double[] dArray2 = null;
                dArray = null;
                for (long j = 0L; j < l4; ++j) {
                    long l5 = ResolveProbe.y(l3, j);
                    n = ResolveProbe.y(l5);
                    double[] dArray3 = ResolveProbe.N(l5, 0, mSDFGenVector2);
                    double[] dArray4 = ResolveProbe.N(l5, n - 1, mSDFGenVector2);
                    if (dArray2 == null) {
                        dArray2 = dArray3;
                    }
                    arrayList.add(dArray4);
                    double d2 = ResolveProbe.N(dArray3, dArray4);
                    d = Math.min(d, d2);
                    dArray = dArray4;
                }
            }
            int n2 = 0;
            int n3 = 0;
            for (int j = 0; j < arrayList.size(); ++j) {
                double[] dArray5;
                double[] dArray6;
                dArray = (double[])arrayList.get((j - 1 + arrayList.size()) % arrayList.size());
                double d3 = ResolveProbe.y(dArray, dArray6 = (double[])arrayList.get(j), dArray5 = (double[])arrayList.get((j + 1) % arrayList.size()));
                if (d3 > 150.0) {
                    ++n2;
                }
                if (!(ResolveProbe.N(dArray6, dArray5) < 0.002)) continue;
                ++n3;
            }
            double d4 = Double.MAX_VALUE;
            int[] nArray = new int[]{-1, -1};
            for (int j = 0; j < arrayList.size(); ++j) {
                for (int k = j + 2; k < arrayList.size(); ++k) {
                    double d5;
                    if (j == 0 && k == arrayList.size() - 1 || !((d5 = ResolveProbe.N((double[])arrayList.get(j), (double[])arrayList.get(k))) < d4)) continue;
                    d4 = d5;
                    nArray[0] = j;
                    nArray[1] = k;
                }
            }
            double d6 = Double.MAX_VALUE;
            int n4 = -1;
            n = -1;
            int n5 = arrayList.size();
            for (int j = 0; j < n5; ++j) {
                for (int k = 0; k < n5; ++k) {
                    double d7;
                    int n6 = k;
                    int n7 = (k + 1) % n5;
                    if (j == n6 || j == n7 || !((d7 = ResolveProbe.N((double[])arrayList.get(j), (double[])arrayList.get(n6), (double[])arrayList.get(n7))) < d6)) continue;
                    d6 = d7;
                    n4 = j;
                    n = n6;
                }
            }
            System.out.printf("  contour %d: edges=%d minEdgeLen=%.6f spikes=%d tiny=%d minPinch=%.6f minPointToSeg=%.6f @v%d,seg%d%n", i, l4, d, n2, n3, d4, d6, n4, n);
        }
    }

    private static void N(int n) {
        if (n != 0) {
            throw new IllegalStateException("msdfgen err=" + n);
        }
    }

    private static double[] N(long l, int n, MSDFGenVector2 mSDFGenVector2) {
        ResolveProbe.N(MSDFGen.msdf_segment_get_point((long)l, (long)n, (MSDFGenVector2)mSDFGenVector2));
        return new double[]{mSDFGenVector2.x(), mSDFGenVector2.y()};
    }

    private static long N(long l, int n) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            ResolveProbe.N(n == 0 ? MSDFGen.msdf_shape_get_contour_count((long)l, (PointerBuffer)pointerBuffer) : MSDFGen.msdf_contour_get_edge_count((long)l, (PointerBuffer)pointerBuffer));
            long l2 = pointerBuffer.get(0);
            return l2;
        }
    }

    private static long N(long l, long l2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            ResolveProbe.N(MSDFGen.msdf_shape_get_contour((long)l, (long)l2, (PointerBuffer)pointerBuffer));
            long l3 = pointerBuffer.get(0);
            return l3;
        }
    }
}

