/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08741
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.GLCapabilities
 */
package minecraft;

import java.nio.ByteBuffer;
import java.util.Set;
import minecraft.class08741;
import minecraft.class08854;
import minecraft.class08879;
import minecraft.class08888;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GLCapabilities;

public abstract class class08882 {
    abstract void y(int var1, long var2, int var4);

    abstract void y(int var1, ByteBuffer var2, int var3);

    abstract int y();

    abstract void N(int var1, int var2);

    public static class08882 N(GLCapabilities gLCapabilities, Set<String> set, class08741 class087412) {
        if (gLCapabilities.GL_ARB_direct_state_access && class08879.i && !class087412.y()) {
            set.add("GL_ARB_direct_state_access");
            return new class08888();
        }
        return new class08854();
    }

    abstract void N(int var1, int var2, int var3, int var4, int var5);

    abstract void N(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12);

    abstract void N(int var1, long var2, long var4, int var6);

    abstract void N(int var1, int var2, long var3, long var5, long var7);

    abstract void N(int var1, ByteBuffer var2, int var3);

    abstract void N(int var1, long var2, ByteBuffer var4, int var5);

    abstract void N(int var1, long var2, int var4);

    abstract int N();

    abstract @Nullable ByteBuffer N(int var1, long var2, long var4, int var6, int var7);
}

