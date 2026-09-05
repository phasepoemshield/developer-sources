/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09838
 *  Nursultan.class09868
 */
package Nursultan;

import Nursultan.class09667;
import Nursultan.class09672;
import Nursultan.class09838;
import Nursultan.class09868;

public final class class09681
implements class09667 {
    private static final float N = 1.0E-4f;
    private static final float y = 16.0f;
    private final class09868 L;
    private final float u;
    private final class09838 i;

    public class09681(class09868 class098682) {
        this(class098682, 16.0f, class09838.N);
    }

    public class09681(class09868 class098682, float f, class09838 class098382) {
        this.L = class098682;
        this.u = class09681.N(f);
        this.i = class098382 == null ? class09838.N : class098382;
    }

    private float y(float f) {
        if (!Float.isFinite(f) || f <= 0.0f) {
            return this.u;
        }
        return f;
    }

    private class09838 N(class09838 class098382) {
        return class098382 == null ? this.i : class098382;
    }

    private static float N(float f) {
        if (!Float.isFinite(f) || f <= 0.0f) {
            return 16.0f;
        }
        return f;
    }

    @Override
    public class09672 N(String string, float f, float f2, class09838 class098382) {
        String string2 = string == null ? "" : string;
        float f3 = this.y(f2);
        class09838 class098383 = this.N(class098382);
        if (string2.isEmpty()) {
            float f4 = this.L.N(f3, class098383);
            return new class09672(0.0f, f4);
        }
        if (Float.isInfinite(f)) {
            return this.N(string2, f3, class098383);
        }
        float f5 = this.L.N(f3, class098383);
        if (f <= 1.0E-4f) {
            return new class09672(0.0f, f5 * (float)string2.length());
        }
        int n = 1;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i = 0; i < string2.length(); ++i) {
            char c = string2.charAt(i);
            if (c == '\n') {
                f7 = Math.max(f7, f6);
                f6 = 0.0f;
                ++n;
                continue;
            }
            float f8 = this.L.N((int)c, f3, class098383);
            if (f6 > 0.0f && f6 + f8 > f) {
                f7 = Math.max(f7, f6);
                f6 = f8;
                ++n;
                continue;
            }
            f6 += f8;
        }
        f7 = Math.max(f7, f6);
        return new class09672(Math.min(f7, f), (float)n * f5);
    }

    @Override
    public class09672 N(String string, float f) {
        return this.N(string, f, this.u, this.i);
    }

    @Override
    public class09672 N(String string, float f, class09838 class098382) {
        String string2 = string == null ? "" : string;
        float f2 = this.y(f);
        class09838 class098383 = this.N(class098382);
        float f3 = this.L.N(string2, f2, class098383);
        float f4 = this.L.N(f2, class098383);
        return new class09672(f3, f4);
    }

    @Override
    public class09672 N(String string) {
        return this.N(string, this.u, this.i);
    }
}

