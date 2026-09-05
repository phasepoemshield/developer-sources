/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.util.msdfgen.MSDFGen
 *  org.lwjgl.util.msdfgen.MSDFGenVector2
 */
package Nursultan;

import Nursultan.class09737;
import Nursultan.class09739;
import Nursultan.class09747;
import java.awt.geom.Area;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.msdfgen.MSDFGen;
import org.lwjgl.util.msdfgen.MSDFGenVector2;

public final class class09716 {
    private static final double N = 1.0E-6;
    private static final double y = 1.0E-7;
    private static volatile class09747 L = class09747.JTS;

    static long L(long l) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            class09716.N(MSDFGen.msdf_shape_add_contour((long)l, (PointerBuffer)pointerBuffer), "add_contour");
            long l2 = pointerBuffer.get(0);
            return l2;
        }
    }

    private class09716() {
    }

    private static long u(long l) {
        Path2D.Double double_ = class09716.y(l);
        if (double_ == null) {
            return 0L;
        }
        return class09716.N(new Area(double_));
    }

    static Path2D.Double y(long l) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            class09716.N(MSDFGen.msdf_shape_get_contour_count((long)l, (PointerBuffer)pointerBuffer), "contour_count");
            long l2 = pointerBuffer.get(0);
            if (l2 == 0L) {
                Path2D.Double double_ = null;
                return double_;
            }
            Path2D.Double double_ = new Path2D.Double(1);
            MSDFGenVector2 mSDFGenVector2 = MSDFGenVector2.malloc((MemoryStack)memoryStack);
            for (long i = 0L; i < l2; ++i) {
                PointerBuffer pointerBuffer2 = memoryStack.mallocPointer(1);
                class09716.N(MSDFGen.msdf_shape_get_contour((long)l, (long)i, (PointerBuffer)pointerBuffer2), "get_contour");
                long l3 = pointerBuffer2.get(0);
                PointerBuffer pointerBuffer3 = memoryStack.mallocPointer(1);
                class09716.N(MSDFGen.msdf_contour_get_edge_count((long)l3, (PointerBuffer)pointerBuffer3), "edge_count");
                long l4 = pointerBuffer3.get(0);
                if (l4 == 0L) continue;
                boolean bl = false;
                block12: for (long j = 0L; j < l4; ++j) {
                    PointerBuffer pointerBuffer4 = memoryStack.mallocPointer(1);
                    class09716.N(MSDFGen.msdf_contour_get_edge((long)l3, (long)j, (PointerBuffer)pointerBuffer4), "get_edge");
                    double[] dArray = class09716.N(pointerBuffer4.get(0), mSDFGenVector2);
                    if (!bl) {
                        double_.moveTo(dArray[0], dArray[1]);
                        bl = true;
                    }
                    switch ((dArray.length - 2) / 2) {
                        case 1: {
                            double_.lineTo(dArray[2], dArray[3]);
                            continue block12;
                        }
                        case 2: {
                            double_.quadTo(dArray[2], dArray[3], dArray[4], dArray[5]);
                            continue block12;
                        }
                        case 3: {
                            double_.curveTo(dArray[2], dArray[3], dArray[4], dArray[5], dArray[6], dArray[7]);
                            continue block12;
                        }
                        default: {
                            throw new IllegalStateException("unexpected point count " + dArray.length);
                        }
                    }
                }
                if (!bl) continue;
                double_.closePath();
            }
            Path2D.Double double_2 = double_;
            return double_2;
        }
    }

    static long y() {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            class09716.N(MSDFGen.msdf_shape_alloc((PointerBuffer)pointerBuffer), "shape_alloc");
            long l = pointerBuffer.get(0);
            return l;
        }
    }

    private static void N(long l, int n, MSDFGenVector2 mSDFGenVector2, double d, double d2) {
        mSDFGenVector2.set(d, d2);
        class09716.N(MSDFGen.msdf_segment_set_point((long)l, (long)n, (MSDFGenVector2)mSDFGenVector2), "set_point");
    }

    private static long N(MemoryStack memoryStack, int n) {
        PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
        class09716.N(MSDFGen.msdf_segment_alloc((int)n, (PointerBuffer)pointerBuffer), "segment_alloc");
        return pointerBuffer.get(0);
    }

    static void N(long l, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            long l2 = class09716.N(memoryStack, 2);
            MSDFGenVector2 mSDFGenVector2 = MSDFGenVector2.malloc((MemoryStack)memoryStack);
            class09716.N(l2, 0, mSDFGenVector2, d, d2);
            class09716.N(l2, 1, mSDFGenVector2, d3, d4);
            class09716.N(l2, 2, mSDFGenVector2, d5, d6);
            class09716.N(l2, 3, mSDFGenVector2, d7, d8);
            class09716.N(MSDFGen.msdf_contour_add_edge((long)l, (long)l2), "add_edge");
        }
    }

    static void N(long l, double d, double d2, double d3, double d4, double d5, double d6) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            long l2 = class09716.N(memoryStack, 1);
            MSDFGenVector2 mSDFGenVector2 = MSDFGenVector2.malloc((MemoryStack)memoryStack);
            class09716.N(l2, 0, mSDFGenVector2, d, d2);
            class09716.N(l2, 1, mSDFGenVector2, d3, d4);
            class09716.N(l2, 2, mSDFGenVector2, d5, d6);
            class09716.N(MSDFGen.msdf_contour_add_edge((long)l, (long)l2), "add_edge");
        }
    }

    private static boolean N(double d, double d2, double d3, double d4) {
        return Math.abs(d - d3) < 1.0E-6 && Math.abs(d2 - d4) < 1.0E-6;
    }

    static void N(int n, String string) {
        if (n != 0) {
            throw new IllegalStateException("msdfgen " + string + " failed (err=" + n + ")");
        }
    }

    public static long N(long l) {
        return switch (L.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class09737.N(l);
            case 1 -> class09716.u(l);
        };
    }

    private static void N(long l, List<class09739> list) {
        long l2 = class09716.L(l);
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        for (class09739 class097392 : list) {
            double[] dArray = class097392.y();
            switch (class097392.N()) {
                case 0: {
                    d = d3 = dArray[0];
                    d2 = d4 = dArray[1];
                    break;
                }
                case 1: {
                    if (!class09716.N(d, d2, dArray[0], dArray[1])) {
                        class09716.N(l2, d, d2, dArray[0], dArray[1]);
                    }
                    d = dArray[0];
                    d2 = dArray[1];
                    break;
                }
                case 2: {
                    class09716.N(l2, d, d2, dArray[0], dArray[1], dArray[2], dArray[3]);
                    d = dArray[2];
                    d2 = dArray[3];
                    break;
                }
                case 3: {
                    class09716.N(l2, d, d2, dArray[0], dArray[1], dArray[2], dArray[3], dArray[4], dArray[5]);
                    d = dArray[4];
                    d2 = dArray[5];
                    break;
                }
                case 4: {
                    if (!class09716.N(d, d2, d3, d4)) {
                        class09716.N(l2, d, d2, d3, d4);
                    }
                    d = d3;
                    d2 = d4;
                    break;
                }
            }
        }
    }

    private static double N(List<class09739> list) {
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = 0.0;
        block7: for (class09739 class097392 : list) {
            double d6;
            double d7;
            switch (class097392.N()) {
                case 0: {
                    d = d3 = class097392.y()[0];
                    d2 = d4 = class097392.y()[1];
                    continue block7;
                }
                case 1: {
                    d7 = class097392.y()[0];
                    d6 = class097392.y()[1];
                    break;
                }
                case 2: {
                    d7 = class097392.y()[2];
                    d6 = class097392.y()[3];
                    break;
                }
                case 3: {
                    d7 = class097392.y()[4];
                    d6 = class097392.y()[5];
                    break;
                }
                case 4: {
                    d7 = d;
                    d6 = d2;
                    break;
                }
                default: {
                    continue block7;
                }
            }
            d5 += d3 * d6 - d7 * d4;
            d3 = d7;
            d4 = d6;
        }
        return d5 * 0.5;
    }

    private static long N(Area area) {
        long l;
        Object object;
        try (Object object2 = MemoryStack.stackPush();){
            object = object2.mallocPointer(1);
            class09716.N(MSDFGen.msdf_shape_alloc((PointerBuffer)object), "shape_alloc");
            l = object.get(0);
        }
        object2 = new ArrayList();
        object = null;
        PathIterator pathIterator = area.getPathIterator(null);
        double[] dArray = new double[6];
        while (!pathIterator.isDone()) {
            int n = pathIterator.currentSegment(dArray);
            if (n == 0) {
                object = new ArrayList();
                object2.add(object);
            }
            if (object != null) {
                object.add(new class09739(n, (double[])dArray.clone()));
            }
            pathIterator.next();
        }
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            List list = (List)iterator.next();
            if (Math.abs(class09716.N(list)) < 1.0E-7) continue;
            class09716.N(l, list);
        }
        return l;
    }

    private static double[] N(long l, MSDFGenVector2 mSDFGenVector2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            class09716.N(MSDFGen.msdf_segment_get_point_count((long)l, (PointerBuffer)pointerBuffer), "point_count");
            int n = (int)pointerBuffer.get(0);
            double[] dArray = new double[n * 2];
            for (int i = 0; i < n; ++i) {
                class09716.N(MSDFGen.msdf_segment_get_point((long)l, (long)i, (MSDFGenVector2)mSDFGenVector2), "get_point");
                dArray[i * 2] = mSDFGenVector2.x();
                dArray[i * 2 + 1] = mSDFGenVector2.y();
            }
            double[] dArray2 = dArray;
            return dArray2;
        }
    }

    public static class09747 N() {
        return L;
    }

    public static void N(class09747 class097472) {
        L = class097472;
    }

    static void N(long l, double d, double d2, double d3, double d4) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            long l2 = class09716.N(memoryStack, 0);
            MSDFGenVector2 mSDFGenVector2 = MSDFGenVector2.malloc((MemoryStack)memoryStack);
            class09716.N(l2, 0, mSDFGenVector2, d, d2);
            class09716.N(l2, 1, mSDFGenVector2, d3, d4);
            class09716.N(MSDFGen.msdf_contour_add_edge((long)l, (long)l2), "add_edge");
        }
    }
}

