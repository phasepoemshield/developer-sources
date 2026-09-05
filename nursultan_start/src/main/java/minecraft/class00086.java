/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class08494
 *  minecraft.class08523
 *  minecraft.class08882
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import minecraft.class00090;
import minecraft.class08494;
import minecraft.class08523;
import minecraft.class08882;
import org.jspecify.annotations.Nullable;

class class00086
extends class00090 {
    class00086() {
    }

    @Override
    public class08494 N(class08882 class088822, class08523 class085232, long l, long l2, int n) {
        GlStateManager.clearGlErrors();
        ByteBuffer byteBuffer = class088822.N(class085232.u, l, l2, n, class085232.usage());
        if (byteBuffer == null) {
            throw new IllegalStateException("Can't map buffer, opengl error " + GlStateManager._getError());
        }
        return new class08494(() -> class088822.N(class085232.u, class085232.usage()), class085232, byteBuffer);
    }

    @Override
    public class08523 N(class08882 class088822, @Nullable Supplier<String> supplier, int n, ByteBuffer byteBuffer) {
        int n2 = class088822.N();
        int n3 = byteBuffer.remaining();
        class088822.N(n2, byteBuffer, n);
        return new class08523(supplier, class088822, n, (long)n3, n2, null);
    }

    @Override
    public class08523 N(class08882 class088822, @Nullable Supplier<String> supplier, int n, long l) {
        int n2 = class088822.N();
        class088822.N(n2, l, n);
        return new class08523(supplier, class088822, n, l, n2, null);
    }
}

