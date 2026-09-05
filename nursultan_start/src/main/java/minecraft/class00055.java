/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class08494
 *  minecraft.class08523
 *  minecraft.class08882
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
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
import org.lwjgl.system.MemoryUtil;

class class00055
extends class00090 {
    class00055() {
    }

    private @Nullable ByteBuffer N(class08882 class088822, int n, int n2, long l) {
        ByteBuffer byteBuffer;
        int n3 = 0;
        if ((n & 1) != 0) {
            n3 |= 1;
        }
        if ((n & 2) != 0) {
            n3 |= 0x12;
        }
        if (n3 != 0) {
            GlStateManager.clearGlErrors();
            byteBuffer = class088822.N(n2, 0L, l, n3 | 0x40, n);
            if (byteBuffer == null) {
                throw new IllegalStateException("Can't persistently map buffer, opengl error " + GlStateManager._getError());
            }
        } else {
            byteBuffer = null;
        }
        return byteBuffer;
    }

    @Override
    public class08494 N(class08882 class088822, class08523 class085232, long l, long l2, int n) {
        if (class085232.i == null) {
            throw new IllegalStateException("Somehow trying to map an unmappable buffer");
        }
        if (l > Integer.MAX_VALUE || l2 > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Mapping buffers larger than 2GB is not supported");
        }
        if (l < 0L || l2 < 0L) {
            throw new IllegalArgumentException("Offset or length must be positive integer values");
        }
        return new class08494(() -> {
            if ((n & 2) != 0) {
                class088822.N(class085232.u, l, l2, class085232.usage());
            }
        }, class085232, MemoryUtil.memSlice((ByteBuffer)class085232.i, (int)((int)l), (int)((int)l2)));
    }

    @Override
    public class08523 N(class08882 class088822, @Nullable Supplier<String> supplier, int n, ByteBuffer byteBuffer) {
        int n2 = class088822.N();
        int n3 = byteBuffer.remaining();
        class088822.y(n2, byteBuffer, n);
        ByteBuffer byteBuffer2 = this.N(class088822, n, n2, (long)n3);
        return new class08523(supplier, class088822, n, (long)n3, n2, byteBuffer2);
    }

    @Override
    public class08523 N(class08882 class088822, @Nullable Supplier<String> supplier, int n, long l) {
        int n2 = class088822.N();
        class088822.y(n2, l, n);
        ByteBuffer byteBuffer = this.N(class088822, n, n2, l);
        return new class08523(supplier, class088822, n, l, n2, byteBuffer);
    }
}

