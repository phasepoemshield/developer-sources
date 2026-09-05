/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09667
 *  Nursultan.class09672
 *  Nursultan.class09838
 *  Nursultan.class09868
 */
package Nursultan;

import Nursultan.class09667;
import Nursultan.class09672;
import Nursultan.class09838;
import Nursultan.class09868;

public class class11736
implements class09667 {
    public static Object N_0;
    public Object y_0;

    private static void L() {
        N_0 = Float.valueOf(1.0E-4f);
    }

    public class11736(class09868 class098682) {
        this.i();
        this.y_0 = class098682;
    }

    static {
        class11736.L();
    }

    private void i() {
    }

    public class09672 N(String string, float f, float f2, class09838 class098382) {
        if (string.isEmpty()) {
            float f3 = ((class09868)this.y_0).N(f2, class098382);
            return new class09672(0.0f, f3);
        }
        if (Float.isInfinite(f)) {
            return this.N(string, f2, class098382);
        }
        float f4 = ((class09868)this.y_0).N(f2, class098382);
        if (f <= 1.0E-4f) {
            return new class09672(0.0f, f4 * (float)string.length());
        }
        int n = 1;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int n2 = -1;
        for (int i = 0; i < string.length(); ++i) {
            int n3 = string.codePointAt(i);
            i += Character.charCount(n3);
            if (n3 == 10) {
                f6 = Math.max(f6, f5);
                f5 = 0.0f;
                ++n;
                n2 = -1;
                continue;
            }
            float f7 = n2 == -1 ? 0.0f : ((class09868)this.y_0).N(n2, n3, f2, class098382);
            float f8 = ((class09868)this.y_0).N(n3, f2, class098382) + f7;
            if (f5 > 0.0f && f5 + f8 > f) {
                f6 = Math.max(f6, f5);
                f5 = f8;
                ++n;
                n2 = -1;
                continue;
            }
            f5 += f8;
            n2 = n3;
        }
        f6 = Math.max(f6, f5);
        return new class09672((float)Math.round(Math.min(f6, f)), (float)n * f4);
    }

    public class09672 N(String string, float f, class09838 class098382) {
        float f2 = ((class09868)this.y_0).N(string, f, class098382);
        float f3 = ((class09868)this.y_0).N(f, class098382);
        return new class09672(f2, f3);
    }
}

