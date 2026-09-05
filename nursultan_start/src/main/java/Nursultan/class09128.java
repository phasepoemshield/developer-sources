/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11087
 *  Nursultan.class11499
 *  minecraft.class04995
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09144;
import Nursultan.class09147;
import Nursultan.class09149;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class09128 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public class09128() {
        this.R();
        this.N_0 = new class09144();
        this.N_1 = Integer.MIN_VALUE;
    }

    public class09149 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, boolean bl2, boolean bl3, float f, float f2, boolean bl4, float f3, boolean bl5) {
        if (class110872 == null || class074382 == null || class114992 == null || class114993 == null || class114994 == null) {
            return class09149.N(class114994, f, f2);
        }
        long l = System.currentTimeMillis();
        this.N(class110872, class114992, class114993, class114994, d, f, f2, bl4, f3, bl5, l);
        if (!((class09144)this.N_0).N(l)) {
            return class09149.N(class114994, f, f2);
        }
        class09147 class091472 = ((class09144)this.N_0).N(class114992, class114993, class114994, d, bl, f, f2, l);
        if (!class091472.y()) {
            return class09149.N(class114994, f, f2);
        }
        class11499 class114995 = this.N(class110872, class074382, class114994, class091472.i(), class091472.N(), class091472.L(), d, bl2, bl3);
        return new class09149(class114995, class091472.u(), class091472.R(), true);
    }

    private void N(class11087 class110872, class11499 class114992, class11499 class114993, class11499 class114994, double d, float f, float f2, boolean bl, float f3, boolean bl2, long l) {
        int n = class110872.u();
        if ((Integer)this.N_1 == Integer.MIN_VALUE) {
            this.N_1 = n;
            if (n <= 0 || class110872.y().y() > 90L) {
                return;
            }
        } else {
            if (n == (Integer)this.N_1) {
                return;
            }
            this.N_1 = n;
        }
        if (class110872.y().y() > 90L) {
            return;
        }
        float f4 = bl ? class04995.N((float)(0.38273627f + f3 * 0.7637284f + (bl2 ? 0.32736284f : 0.0f)), (float)0.0f, (float)1.0f) : 0.0f;
        ((class09144)this.N_0).N(l, class114992, class114993, class114994, d, f, f2, bl, f4, bl2);
    }

    public void N() {
        this.N_1 = Integer.MIN_VALUE;
        ((class09144)this.N_0).N();
    }

    private float N(float f, double d) {
        if (Math.abs(f) <= 1.0E-4f || d <= 1.0E-5) {
            return f;
        }
        int n = Math.round(f / (float)d);
        if (n == 0) {
            n = f > 0.0f ? 1 : -1;
        }
        return (float)n * (float)d;
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, float f, float f2, double d, boolean bl, boolean bl2) {
        if (!bl || bl2 || class110872.N(class074382, class114993)) {
            return class114993;
        }
        for (float f3 : new float[]{0.78372836f, 0.5273628f, 0.2927363f, 0.13726372f}) {
            class11499 class114994 = new class11499(class114992.y() + this.N(f * f3, d), class04995.N((float)(class114992.R() + this.N(f2 * f3, d)), (float)-90.0f, (float)90.0f));
            if (!class110872.N(class074382, class114994)) continue;
            return class114994;
        }
        return class114992;
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0;
        }
    }
}

