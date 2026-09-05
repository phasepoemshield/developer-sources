/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.CLongBuffer
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.freetype.FT_Face
 *  org.lwjgl.util.freetype.FT_MM_Var
 *  org.lwjgl.util.freetype.FT_Var_Axis
 *  org.lwjgl.util.freetype.FreeType
 *  org.lwjgl.util.msdfgen.MSDFGen
 *  org.lwjgl.util.msdfgen.MSDFGenBitmap
 *  org.lwjgl.util.msdfgen.MSDFGenExt
 *  org.lwjgl.util.msdfgen.MSDFGenTransform
 */
package Nursultan;

import Nursultan.class09735;
import Nursultan.class09749;
import Nursultan.class09755;
import Nursultan.class09757;
import Nursultan.class09761;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.CLongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_MM_Var;
import org.lwjgl.util.freetype.FT_Var_Axis;
import org.lwjgl.util.freetype.FreeType;
import org.lwjgl.util.msdfgen.MSDFGen;
import org.lwjgl.util.msdfgen.MSDFGenBitmap;
import org.lwjgl.util.msdfgen.MSDFGenExt;
import org.lwjgl.util.msdfgen.MSDFGenTransform;

public final class class09745
implements AutoCloseable {
    public static final double N = 3.0;
    private static final long y = 2003265652L;
    private final FT_Face L;
    private long u;
    private long i;
    private ByteBuffer R;
    private boolean M = true;
    private final class09749 B;
    private final int Z;
    private final long[] z;
    private float U;

    public float L() {
        return this.U;
    }

    public class09755 L(int n, int n2, int n3, double d) {
        return this.N(0, 1, false, n, n2, n3, d, d);
    }

    private void L(float f) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            CLongBuffer cLongBuffer = memoryStack.mallocCLong(this.z.length);
            cLongBuffer.put(this.z);
            cLongBuffer.put(this.Z, class09745.u(f));
            cLongBuffer.flip();
            class09745.y(FreeType.FT_Set_Var_Design_Coordinates((FT_Face)this.L, (CLongBuffer)cLongBuffer), "FT_Set_Var_Design_Coordinates");
        }
    }

    private class09745(long l, FT_Face fT_Face, long l2, ByteBuffer byteBuffer, class09757 class097572) {
        this.u = l;
        this.L = fT_Face;
        this.i = l2;
        this.R = byteBuffer;
        if (class097572 != null) {
            this.B = class097572.N();
            this.Z = class097572.y();
            this.z = class097572.L();
            this.U = class097572.N().y();
        } else {
            this.B = null;
            this.Z = -1;
            this.z = null;
            this.U = Float.NaN;
        }
    }

    @Override
    public void close() {
        if (this.i != 0L) {
            MSDFGenExt.msdf_ft_font_destroy((long)this.i);
            this.i = 0L;
        }
        if (this.u != 0L) {
            FreeType.FT_Done_Face((FT_Face)this.L);
            FreeType.FT_Done_FreeType((long)this.u);
            this.u = 0L;
        }
        if (this.R != null) {
            MemoryUtil.memFree((Buffer)this.R);
            this.R = null;
        }
    }

    private static long u() {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            class09745.y(FreeType.FT_Init_FreeType((PointerBuffer)pointerBuffer), "FT_Init_FreeType");
            long l = pointerBuffer.get(0);
            return l;
        }
    }

    private static long u(float f) {
        return Math.round((double)f * 65536.0);
    }

    private static byte[] y(MSDFGenBitmap mSDFGenBitmap, int n) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            class09745.N(MSDFGen.msdf_bitmap_get_pixels((MSDFGenBitmap)mSDFGenBitmap, (PointerBuffer)pointerBuffer), "get_pixels");
            FloatBuffer floatBuffer = MemoryUtil.memFloatBuffer((long)pointerBuffer.get(0), (int)n);
            byte[] byArray = new byte[n];
            for (int i = 0; i < n; ++i) {
                byArray[i] = class09745.y(floatBuffer.get(i));
            }
            byte[] byArray2 = byArray;
            return byArray2;
        }
    }

    private static void y(int n, String string) {
        if (n != 0) {
            throw new IllegalStateException("FreeType " + string + " failed (err=" + n + ")");
        }
    }

    public class09755 y(int n, int n2, int n3, double d) {
        return this.N(3, 4, true, n, n2, n3, d, d);
    }

    public class09749 y() {
        return this.B;
    }

    public static byte y(float f) {
        int n = (int)(f * 256.0f);
        if (n < 0) {
            n = 0;
        } else if (n > 255) {
            n = 255;
        }
        return (byte)n;
    }

    /*
     * Exception decompiling
     */
    private class09755 N(int var1_1, int var2_2, boolean var3_3, int var4_4, int var5_5, int var6_6, double var7_7, double var9_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public class09745 N(boolean bl) {
        this.M = bl;
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static class09757 N(long l, FT_Face fT_Face) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            class09749 class097492;
            int n;
            long[] lArray;
            FT_MM_Var fT_MM_Var;
            block14: {
                class09757 class097572;
                PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
                if (FreeType.FT_Get_MM_Var((FT_Face)fT_Face, (PointerBuffer)pointerBuffer) != 0) {
                    class09757 class097573 = null;
                    return class097573;
                }
                fT_MM_Var = FT_MM_Var.create((long)pointerBuffer.get(0));
                try {
                    int n2 = fT_MM_Var.num_axis();
                    long l2 = fT_MM_Var.axis().address();
                    lArray = new long[n2];
                    n = -1;
                    class097492 = null;
                    for (int i = 0; i < n2; ++i) {
                        FT_Var_Axis fT_Var_Axis = FT_Var_Axis.create((long)(l2 + (long)i * (long)FT_Var_Axis.SIZEOF));
                        lArray[i] = fT_Var_Axis.def();
                        if (fT_Var_Axis.tag() != 2003265652L) continue;
                        n = i;
                        class097492 = new class09749(class09745.N(fT_Var_Axis.minimum()), class09745.N(fT_Var_Axis.def()), class09745.N(fT_Var_Axis.maximum()));
                    }
                    if (n >= 0) break block14;
                    class097572 = null;
                }
                catch (Throwable throwable) {
                    FreeType.FT_Done_MM_Var((long)l, (FT_MM_Var)fT_MM_Var);
                    throw throwable;
                }
                FreeType.FT_Done_MM_Var((long)l, (FT_MM_Var)fT_MM_Var);
                return class097572;
            }
            class09757 class097574 = new class09757(class097492, n, lArray);
            FreeType.FT_Done_MM_Var((long)l, (FT_MM_Var)fT_MM_Var);
            return class097574;
        }
    }

    private static float[] N(MSDFGenBitmap mSDFGenBitmap, int n) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            class09745.N(MSDFGen.msdf_bitmap_get_pixels((MSDFGenBitmap)mSDFGenBitmap, (PointerBuffer)pointerBuffer), "get_pixels");
            FloatBuffer floatBuffer = MemoryUtil.memFloatBuffer((long)pointerBuffer.get(0), (int)n);
            float[] fArray = new float[n];
            floatBuffer.get(fArray);
            float[] fArray2 = fArray;
            return fArray2;
        }
    }

    /*
     * Exception decompiling
     */
    public class09761 N(int var1_1, double var2_2, double var4_3, class09735 var6_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void N(int n, MSDFGenBitmap mSDFGenBitmap, long l, MSDFGenTransform mSDFGenTransform) {
        switch (n) {
            case 0: {
                class09745.N(MSDFGen.msdf_generate_sdf((MSDFGenBitmap)mSDFGenBitmap, (long)l, (MSDFGenTransform)mSDFGenTransform), "generate_sdf");
                break;
            }
            case 1: {
                class09745.N(MSDFGen.msdf_generate_psdf((MSDFGenBitmap)mSDFGenBitmap, (long)l, (MSDFGenTransform)mSDFGenTransform), "generate_psdf");
                break;
            }
            case 2: {
                class09745.N(MSDFGen.msdf_generate_msdf((MSDFGenBitmap)mSDFGenBitmap, (long)l, (MSDFGenTransform)mSDFGenTransform), "generate_msdf");
                break;
            }
            case 3: {
                class09745.N(MSDFGen.msdf_generate_mtsdf((MSDFGenBitmap)mSDFGenBitmap, (long)l, (MSDFGenTransform)mSDFGenTransform), "generate_mtsdf");
                break;
            }
            default: {
                throw new IllegalArgumentException("unsupported bitmap type " + n);
            }
        }
    }

    private static class09745 N(long l, long l2, ByteBuffer byteBuffer) {
        FT_Face fT_Face = FT_Face.create((long)l2);
        class09757 class097572 = class09745.N(l, fT_Face);
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            int n = MSDFGenExt.msdf_ft_adopt_font((long)l2, (PointerBuffer)pointerBuffer);
            if (n != 0) {
                FreeType.FT_Done_Face((FT_Face)fT_Face);
                FreeType.FT_Done_FreeType((long)l);
                if (byteBuffer != null) {
                    MemoryUtil.memFree((Buffer)byteBuffer);
                }
                throw new IllegalStateException("msdf_ft_adopt_font failed (err=" + n + ")");
            }
            class09745 class097452 = new class09745(l, fT_Face, pointerBuffer.get(0), byteBuffer, class097572);
            return class097452;
        }
    }

    public static class09745 N(byte[] byArray) {
        long l = class09745.u();
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)byArray.length);
        byteBuffer.put(byArray).flip();
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            int n = FreeType.FT_New_Memory_Face((long)l, (ByteBuffer)byteBuffer, (long)0L, (PointerBuffer)pointerBuffer);
            if (n != 0) {
                MemoryUtil.memFree((Buffer)byteBuffer);
                FreeType.FT_Done_FreeType((long)l);
                throw new IllegalStateException("FT_New_Memory_Face failed (err=" + n + ")");
            }
            class09745 class097452 = class09745.N(l, pointerBuffer.get(0), byteBuffer);
            return class097452;
        }
    }

    public static class09745 N(String string) {
        long l = class09745.u();
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            int n = FreeType.FT_New_Face((long)l, (CharSequence)string, (long)0L, (PointerBuffer)pointerBuffer);
            if (n != 0) {
                FreeType.FT_Done_FreeType((long)l);
                throw new IllegalStateException("FT_New_Face failed for '" + string + "' (err=" + n + ")");
            }
            class09745 class097452 = class09745.N(l, pointerBuffer.get(0), null);
            return class097452;
        }
    }

    private static void N(int n, String string) {
        if (n != 0) {
            throw new IllegalStateException("msdfgen " + string + " failed (err=" + n + ")");
        }
    }

    public class09745 N(float f) {
        if (!Float.isFinite(f) || f <= 0.0f) {
            throw new IllegalArgumentException("weight must be finite and positive");
        }
        if (this.B == null) {
            throw new IllegalStateException("font has no variable 'wght' axis; weight cannot be applied");
        }
        float f2 = Math.max(this.B.N(), Math.min(this.B.L(), f));
        this.L(f2);
        this.U = f2;
        return this;
    }

    public class09755 N(int n, int n2, int n3, double d) {
        return this.N(2, 3, true, n, n2, n3, d, d);
    }

    public int N(int n) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = memoryStack.mallocInt(1);
            class09745.N(MSDFGenExt.msdf_ft_font_get_glyph_index((long)this.i, (int)n, (IntBuffer)intBuffer), "get_glyph_index");
            int n2 = intBuffer.get(0);
            return n2;
        }
    }

    private static float N(long l) {
        return (float)((double)l / 65536.0);
    }

    public boolean N() {
        return this.M;
    }
}

