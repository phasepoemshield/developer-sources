/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08494
 *  minecraft.class08523
 *  minecraft.class08879
 *  minecraft.class08882
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.GLCapabilities
 */
package minecraft;

import java.nio.ByteBuffer;
import java.util.Set;
import java.util.function.Supplier;
import minecraft.class00055;
import minecraft.class00086;
import minecraft.class08494;
import minecraft.class08523;
import minecraft.class08879;
import minecraft.class08882;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GLCapabilities;

public abstract class class00090 {
    public abstract class08494 N(class08882 var1, class08523 var2, long var3, long var5, int var7);

    public abstract class08523 N(class08882 var1, @Nullable Supplier<String> var2, int var3, ByteBuffer var4);

    public abstract class08523 N(class08882 var1, @Nullable Supplier<String> var2, int var3, long var4);

    public static class00090 N(GLCapabilities gLCapabilities, Set<String> set) {
        if (gLCapabilities.GL_ARB_buffer_storage && class08879.R) {
            set.add("GL_ARB_buffer_storage");
            return new class00055();
        }
        return new class00086();
    }
}

