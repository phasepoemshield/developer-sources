/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  minecraft.class02566
 *  minecraft.class08280
 *  minecraft.class08829
 */
package minecraft;

import com.mojang.blaze3d.textures.GpuTextureView;
import minecraft.class02566;
import minecraft.class08280;
import minecraft.class08829;

public class class01384
implements AutoCloseable {
    private static final int i = 16;
    public static final int N = 0;
    public static final int y = 3;
    public static final int L = 10;
    public static final int u = class01384.N(0, 10);
    private final class08829 R = new class08829("Entity Color Overlay", 16, 16, false);

    public class01384() {
        class08280 class082802 = this.R.method_4525();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                if (i < 8) {
                    class082802.y(j, i, -1291911168);
                    continue;
                }
                int n = (int)((1.0f - (float)j / 15.0f * 0.75f) * 255.0f);
                class082802.y(j, i, class02566.Z((int)n));
            }
        }
        this.R.method_4524();
    }

    @Override
    public void close() {
        this.R.close();
    }

    public static int N(float f, boolean bl) {
        return class01384.N(class01384.N(f), class01384.N(bl));
    }

    public static int N(int n, int n2) {
        return n | n2 << 16;
    }

    public GpuTextureView N() {
        return this.R.method_71659();
    }

    public static int N(boolean bl) {
        return bl ? 3 : 10;
    }

    public static int N(float f) {
        return (int)(f * 15.0f);
    }
}

