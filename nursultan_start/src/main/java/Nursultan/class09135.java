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

import Nursultan.class09153;
import Nursultan.class09166;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class09135 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0L;
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = Float.valueOf(0.0f);
            this.N_5 = Float.valueOf(0.0f);
        }
    }

    public class09135() {
        this.L();
        this.N_0 = new class09166();
    }

    public class09153 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, double d, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, float f, float f2) {
        if (class114992 == null || class114993 == null || d <= 1.0E-5) {
            return new class09153(class114993, f, f2);
        }
        float f3 = (float)Math.max(d, (double)0.035f);
        this.N(System.currentTimeMillis(), f3, bl4, bl5);
        class11499 class114994 = new class11499(class114993.y() + ((Float)this.N_2).floatValue(), bl ? class114993.R() : class04995.N((float)(class114993.R() + ((Float)this.N_3).floatValue()), (float)-90.0f, (float)90.0f));
        if (bl2 && !bl3 && !class110872.N(class074382, class114994)) {
            class114994 = this.N(class110872, class074382, class114993, bl);
        }
        float f4 = Math.max(0.01f, f + ((Float)this.N_4).floatValue());
        float f5 = Math.max(0.01f, f2 + (bl ? 0.0f : ((Float)this.N_5).floatValue()));
        return new class09153(class114994, f4, f5);
    }

    private void N(long l, float f, boolean bl, boolean bl2) {
        if (l < (Long)this.N_1) {
            return;
        }
        float f2 = (bl ? 1.0f : 0.0f) + (bl2 ? 0.55f : 0.0f);
        float f3 = f * (0.18f + f2 * 0.08f);
        float f4 = f * (0.075f + f2 * 0.035f);
        this.N_2 = Float.valueOf(this.N(f3));
        this.N_3 = Float.valueOf(this.N(f4));
        this.N_4 = Float.valueOf(this.N(f * (0.2f + f2 * 0.11f)));
        this.N_5 = Float.valueOf(this.N(f * (0.1f + f2 * 0.05f)));
        this.N_1 = l + (long)((class09166)this.N_0).y(bl ? 34.0f : 48.0f, bl2 ? 96.0f : 145.0f);
    }

    public void N() {
        this.N_1 = 0L;
        this.N_2 = Float.valueOf(0.0f);
        this.N_3 = Float.valueOf(0.0f);
        this.N_4 = Float.valueOf(0.0f);
        this.N_5 = Float.valueOf(0.0f);
        ((class09166)this.N_0).y();
    }

    private float N(float f) {
        float f2 = ((class09166)this.N_0).N();
        float f3 = ((class09166)this.N_0).y(0.19f, 0.83f);
        if (f3 > 0.46f && f3 < 0.56f) {
            f3 += (float)((class09166)this.N_0).N() * ((class09166)this.N_0).N(0.08f, 0.18f);
        }
        return f2 * f * class04995.N((float)f3, (float)0.12f, (float)0.92f);
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, boolean bl) {
        float[] fArray = new float[]{0.72f, 0.48f, 0.26f, -0.38f, -0.18f};
        for (float f : fArray) {
            class11499 class114993 = new class11499(class114992.y() + ((Float)this.N_2).floatValue() * f, bl ? class114992.R() : class04995.N((float)(class114992.R() + ((Float)this.N_3).floatValue() * f), (float)-90.0f, (float)90.0f));
            if (!class110872.N(class074382, class114993)) continue;
            return class114993;
        }
        return class114992;
    }
}

