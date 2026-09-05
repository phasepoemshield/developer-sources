/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class00947
 *  minecraft.class03475
 *  minecraft.class04284
 *  minecraft.class05647
 *  minecraft.class06262
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.freetype.FT_Bitmap
 *  org.lwjgl.util.freetype.FT_Face
 *  org.lwjgl.util.freetype.FT_GlyphSlot
 *  org.lwjgl.util.freetype.FT_Vector
 *  org.lwjgl.util.freetype.FreeType
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Locale;
import minecraft.class00947;
import minecraft.class03475;
import minecraft.class04284;
import minecraft.class05647;
import minecraft.class05859;
import minecraft.class05861;
import minecraft.class06262;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Bitmap;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_GlyphSlot;
import org.lwjgl.util.freetype.FT_Vector;
import org.lwjgl.util.freetype.FreeType;

public class class05852
implements class06262 {
    private @Nullable ByteBuffer L;
    private @Nullable FT_Face u;
    final float N;
    private final class03475<class05859> i = new class03475(class05859[]::new, n -> new class05859[n][]);

    public class05852(ByteBuffer byteBuffer, FT_Face fT_Face, float f, float f2, float f3, float f4, String string) {
        this.L = byteBuffer;
        this.u = fT_Face;
        this.N = f2;
        IntArraySet intArraySet = new IntArraySet();
        string.codePoints().forEach(arg_0 -> ((IntSet)intArraySet).add(arg_0));
        int n2 = Math.round(f * f2);
        FreeType.FT_Set_Pixel_Sizes((FT_Face)fT_Face, (int)n2, (int)n2);
        float f5 = f3 * f2;
        float f6 = -f4 * f2;
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            int n3;
            FT_Vector fT_Vector = class04284.N((FT_Vector)FT_Vector.malloc((MemoryStack)memoryStack), (float)f5, (float)f6);
            FreeType.FT_Set_Transform((FT_Face)fT_Face, null, (FT_Vector)fT_Vector);
            IntBuffer intBuffer = memoryStack.mallocInt(1);
            int n4 = (int)FreeType.FT_Get_First_Char((FT_Face)fT_Face, (IntBuffer)intBuffer);
            while ((n3 = intBuffer.get(0)) != 0) {
                if (!intArraySet.contains(n4)) {
                    this.i.N(n4, (Object)new class05859(n3));
                }
                n4 = (int)FreeType.FT_Get_Next_Char((FT_Face)fT_Face, (long)n4, (IntBuffer)intBuffer);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void close() {
        if (this.u != null) {
            Object object = class04284.N;
            synchronized (object) {
                class04284.y((int)FreeType.FT_Done_Face((FT_Face)this.u), (String)"Deleting face");
            }
            this.u = null;
        }
        MemoryUtil.memFree((Buffer)this.L);
        this.L = null;
    }

    FT_Face y() {
        if (this.L == null || this.u == null) {
            throw new IllegalStateException("Provider already closed");
        }
        return this.u;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private class00947 N(int n, class05859 class058592) {
        class00947 class009472 = class058592.y;
        if (class009472 == null) {
            FT_Face fT_Face;
            FT_Face fT_Face2 = fT_Face = this.y();
            synchronized (fT_Face2) {
                class009472 = class058592.y;
                if (class009472 == null) {
                    class058592.y = class009472 = this.N(n, fT_Face, class058592.N);
                }
            }
        }
        return class009472;
    }

    private class00947 N(int n, FT_Face fT_Face, int n2) {
        FT_GlyphSlot fT_GlyphSlot;
        int n3 = FreeType.FT_Load_Glyph((FT_Face)fT_Face, (int)n2, (int)0x400008);
        if (n3 != 0) {
            class04284.N((int)n3, (String)String.format(Locale.ROOT, "Loading glyph U+%06X", n));
        }
        if ((fT_GlyphSlot = fT_Face.glyph()) == null) {
            throw new NullPointerException(String.format(Locale.ROOT, "Glyph U+%06X not initialized", n));
        }
        float f = class04284.N((FT_Vector)fT_GlyphSlot.advance());
        FT_Bitmap fT_Bitmap = fT_GlyphSlot.bitmap();
        int n4 = fT_GlyphSlot.bitmap_left();
        int n5 = fT_GlyphSlot.bitmap_top();
        int n6 = fT_Bitmap.width();
        int n7 = fT_Bitmap.rows();
        if (n6 <= 0 || n7 <= 0) {
            return new class05647(f / this.N);
        }
        return new class05861(this, n4, n5, n6, n7, f, n2);
    }

    public IntSet N() {
        return this.i.y();
    }

    public @Nullable class00947 N(int n) {
        class05859 class058592 = (class05859)this.i.N(n);
        return class058592 != null ? this.N(n, class058592) : null;
    }
}

