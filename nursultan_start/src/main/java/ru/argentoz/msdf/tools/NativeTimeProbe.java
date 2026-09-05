/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09740
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.util.msdfgen.MSDFGen
 *  org.lwjgl.util.msdfgen.MSDFGenBitmap
 *  org.lwjgl.util.msdfgen.MSDFGenBounds
 *  org.lwjgl.util.msdfgen.MSDFGenExt
 *  org.lwjgl.util.msdfgen.MSDFGenMultichannelConfig
 *  org.lwjgl.util.msdfgen.MSDFGenRange
 *  org.lwjgl.util.msdfgen.MSDFGenTransform
 *  org.lwjgl.util.msdfgen.MSDFGenVector2
 */
package ru.argentoz.msdf.tools;

import Nursultan.class09740;
import java.nio.DoubleBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.msdfgen.MSDFGen;
import org.lwjgl.util.msdfgen.MSDFGenBitmap;
import org.lwjgl.util.msdfgen.MSDFGenBounds;
import org.lwjgl.util.msdfgen.MSDFGenExt;
import org.lwjgl.util.msdfgen.MSDFGenMultichannelConfig;
import org.lwjgl.util.msdfgen.MSDFGenRange;
import org.lwjgl.util.msdfgen.MSDFGenTransform;
import org.lwjgl.util.msdfgen.MSDFGenVector2;

public final class NativeTimeProbe {
    private NativeTimeProbe() {
    }

    public static void main(String[] stringArray) {
        String string = stringArray.length > 0 ? stringArray[0] : "C:\\Windows\\Fonts\\arial.ttf";
        double d = 1.1111111111111112;
        double d2 = 1.1111111111111112;
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            NativeTimeProbe.N(MSDFGenExt.msdf_ft_init((PointerBuffer)pointerBuffer), "ft_init");
            long l = pointerBuffer.get(0);
            PointerBuffer pointerBuffer2 = memoryStack.mallocPointer(1);
            NativeTimeProbe.N(MSDFGenExt.msdf_ft_load_font((long)l, (CharSequence)string, (PointerBuffer)pointerBuffer2), "load_font");
            long l2 = pointerBuffer2.get(0);
            for (int n : new int[]{65, 64, 66}) {
                DoubleBuffer doubleBuffer = memoryStack.mallocDouble(1);
                PointerBuffer pointerBuffer3 = memoryStack.mallocPointer(1);
                NativeTimeProbe.N(MSDFGenExt.msdf_ft_font_load_glyph((long)l2, (int)n, (int)1, (DoubleBuffer)doubleBuffer, (PointerBuffer)pointerBuffer3), "load_glyph");
                long l3 = pointerBuffer3.get(0);
                MSDFGen.msdf_shape_normalize((long)l3);
                MSDFGen.msdf_shape_edge_colors_simple((long)l3, (double)3.0);
                MSDFGenBounds mSDFGenBounds = MSDFGenBounds.malloc((MemoryStack)memoryStack);
                NativeTimeProbe.N(MSDFGen.msdf_shape_get_bounds((long)l3, (MSDFGenBounds)mSDFGenBounds), "bounds");
                PointerBuffer pointerBuffer4 = memoryStack.mallocPointer(1);
                MSDFGen.msdf_shape_get_edge_count((long)l3, (PointerBuffer)pointerBuffer4);
                System.out.printf("%n'%c'  edges=%d%n", n, pointerBuffer4.get(0));
                for (int n2 : new int[]{32, 64}) {
                    double d3 = 7.0;
                    double d4 = ((double)n2 - 2.0 * d3) / Math.max(mSDFGenBounds.r() - mSDFGenBounds.l(), mSDFGenBounds.t() - mSDFGenBounds.b());
                    double d5 = 6.0 / d4;
                    MSDFGenBitmap mSDFGenBitmap = MSDFGenBitmap.malloc((MemoryStack)memoryStack);
                    NativeTimeProbe.N(MSDFGen.msdf_bitmap_alloc((int)2, (int)n2, (int)n2, (MSDFGenBitmap)mSDFGenBitmap), "bmp_alloc");
                    MSDFGenVector2 mSDFGenVector2 = MSDFGenVector2.malloc((MemoryStack)memoryStack).set(d4, d4);
                    MSDFGenVector2 mSDFGenVector22 = MSDFGenVector2.malloc((MemoryStack)memoryStack).set(d3 / d4 - mSDFGenBounds.l(), d3 / d4 - mSDFGenBounds.b());
                    MSDFGenRange mSDFGenRange = MSDFGenRange.malloc((MemoryStack)memoryStack).set(-d5 / 2.0, d5 / 2.0);
                    MSDFGenTransform mSDFGenTransform = MSDFGenTransform.malloc((MemoryStack)memoryStack);
                    mSDFGenTransform.set(mSDFGenVector2, mSDFGenVector22, mSDFGenRange);
                    NativeTimeProbe.N(n2, "native default", () -> MSDFGen.msdf_generate_msdf((MSDFGenBitmap)mSDFGenBitmap, (long)l3, (MSDFGenTransform)mSDFGenTransform));
                    MSDFGenMultichannelConfig mSDFGenMultichannelConfig = MSDFGenMultichannelConfig.malloc((MemoryStack)memoryStack);
                    mSDFGenMultichannelConfig.set(0, 0, 0, d, d2);
                    NativeTimeProbe.N(n2, "native fast (no ovl, no EC)", () -> MSDFGen.msdf_generate_msdf_with_config((MSDFGenBitmap)mSDFGenBitmap, (long)l3, (MSDFGenTransform)mSDFGenTransform, (MSDFGenMultichannelConfig)mSDFGenMultichannelConfig));
                    MSDFGen.msdf_bitmap_free((MSDFGenBitmap)mSDFGenBitmap);
                }
                MSDFGen.msdf_shape_free((long)l3);
            }
        }
    }

    private static void N(int n, String string, class09740 class097402) {
        int n2;
        for (n2 = 0; n2 < 30; ++n2) {
            NativeTimeProbe.N(class097402.go(), string);
        }
        n2 = 200;
        long l = System.nanoTime();
        for (int i = 0; i < n2; ++i) {
            class097402.go();
        }
        double d = (double)(System.nanoTime() - l) / 1000.0 / (double)n2;
        System.out.printf("  %3dx%-3d %-30s %7.1f us/glyph%n", n, n, string, d);
    }

    private static void N(int n, String string) {
        if (n != 0) {
            throw new IllegalStateException(string + " err=" + n);
        }
    }
}

