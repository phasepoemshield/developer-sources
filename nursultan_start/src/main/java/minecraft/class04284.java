/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.util.freetype.FT_Vector
 *  org.lwjgl.util.freetype.FreeType
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.freetype.FT_Vector;
import org.lwjgl.util.freetype.FreeType;
import org.slf4j.Logger;

public class class04284 {
    private static final Logger y = LogUtils.getLogger();
    public static final Object N = new Object();
    private static long L = 0L;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void y() {
        Object object = N;
        synchronized (object) {
            if (L != 0L) {
                FreeType.FT_Done_Library((long)L);
                L = 0L;
            }
        }
    }

    public static boolean y(int n, String string) {
        if (n != 0) {
            y.error("FreeType error: {} ({})", (Object)class04284.N(n), (Object)string);
            return true;
        }
        return false;
    }

    public static float N(FT_Vector fT_Vector) {
        return (float)fT_Vector.x() / 64.0f;
    }

    private static String N(int n) {
        String string = FreeType.FT_Error_String((int)n);
        if (string != null) {
            return string;
        }
        return "Unrecognized error: 0x" + Integer.toHexString(n);
    }

    public static FT_Vector N(FT_Vector fT_Vector, float f, float f2) {
        long l = Math.round(f * 64.0f);
        long l2 = Math.round(f2 * 64.0f);
        return fT_Vector.set(l, l2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static long N() {
        Object object = N;
        synchronized (object) {
            if (L == 0L) {
                try (MemoryStack memoryStack = MemoryStack.stackPush();){
                    PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
                    class04284.N(FreeType.FT_Init_FreeType((PointerBuffer)pointerBuffer), "Initializing FreeType library");
                    L = pointerBuffer.get();
                }
            }
            return L;
        }
    }

    public static void N(int n, String string) {
        if (n != 0) {
            throw new IllegalStateException("FreeType error: " + class04284.N(n) + " (" + string + ")");
        }
    }
}

