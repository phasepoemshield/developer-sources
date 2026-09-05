/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09139
 *  Nursultan.class09170
 *  Nursultan.class11499
 *  minecraft.class00734
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09139;
import Nursultan.class09170;
import Nursultan.class11064;
import Nursultan.class11073;
import Nursultan.class11087;
import Nursultan.class11104;
import Nursultan.class11499;
import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

public class class11057 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;

    public class11057() {
        this.u();
        this.N_5 = class11073.IDLE;
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = 0L;
            this.N_2 = 0L;
        }
    }

    private float y(float f) {
        return 1.0f - (float)Math.pow(1.0f - f, 2.2);
    }

    private void N(long l, boolean bl) {
        this.N_5 = class11073.IDLE;
        this.N_1 = 0L;
        this.N_2 = 0L;
        this.N_3 = null;
        this.N_4 = null;
        if (!bl && l >= (Long)this.N_0) {
            this.N_0 = l + (long)class09139.N((double)260.0, (double)680.0);
        }
    }

    private boolean N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, boolean bl, boolean bl2, boolean bl3) {
        if (!bl || bl2 || bl3 || class114992 == null) {
            return false;
        }
        long l = class110872.y().y();
        if (l < 135L || l > 485L) {
            return false;
        }
        float f = Math.abs(class09170.N((float)class114992.y(), (float)class114993.y()));
        float f2 = Math.abs(class114993.R() - class114992.R());
        if (f > 4.8f || f2 > 2.35f) {
            return false;
        }
        if (((class04453)((class06202)class11087.N_0).T_4).method_33571().R(class11064.y((class07049)class074382)) > (double)(class110872.N(class074382) + 0.7f)) {
            return false;
        }
        return Math.random() < (double)0.34f;
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993) {
        float f = class114992 == null ? class114993.y() : class114992.y();
        float f2 = class114992 == null ? class114993.R() : class114992.R();
        float f3 = class09170.N((float)f, (float)class114993.y());
        float f4 = Math.abs(f3) > 0.1f ? -Math.signum(f3) : (Math.random() > 0.5 ? 1.0f : -1.0f);
        float f5 = Math.random() > 0.5 ? 1.0f : -1.0f;
        float[] fArray = new float[]{14.0f, 18.5f, 23.0f, 28.5f, 34.0f, 41.0f, -16.0f, -22.0f, -30.0f, -38.0f};
        float[] fArray2 = new float[]{0.0f, 3.5f, -3.5f, 6.5f, -6.5f, 10.0f, -10.0f, 14.0f, -14.0f};
        class11499 class114994 = null;
        float f6 = 0.0f;
        for (float f7 : fArray) {
            for (float f8 : fArray2) {
                float f9;
                class11499 class114995 = new class11499(f + f4 * f7, class04995.N((float)(f2 + f5 * f8), (float)-90.0f, (float)90.0f));
                if (class110872.N(class074382, class114995)) continue;
                float f10 = Math.abs(class09170.N((float)class114993.y(), (float)class114995.y()));
                float f11 = Math.abs(class114995.R() - class114993.R());
                float f12 = f10 + f11 * 1.75f;
                if (!(f9 >= 16.0f) || !(f12 > f6)) continue;
                class114994 = class114995;
                f6 = f12;
            }
        }
        return class114994;
    }

    private class11499 N(class11499 class114992, class11499 class114993, float f) {
        if (class114992 == null) {
            return class114993;
        }
        return new class11499(class114992.y() + class09170.N((float)class114992.y(), (float)class114993.y()) * f, class04995.N((float)class04995.B((float)f, (float)class114992.R(), (float)class114993.R()), (float)-90.0f, (float)90.0f));
    }

    private float N(float f) {
        return (float)Math.pow(f, 0.38);
    }

    private boolean N(class11087 class110872, boolean bl, boolean bl2, boolean bl3) {
        return bl2 || bl && bl3 || class110872.y().y() > 540L;
    }

    public void N() {
        this.N_0 = 0L;
        this.N_1 = 0L;
        this.N_2 = 0L;
        this.N_3 = null;
        this.N_4 = null;
        this.N_5 = class11073.IDLE;
    }

    private boolean N(class11087 class110872, class07438 class074382, long l, class00734 class007342, class06889 class068892, class11499 class114992, class11499 class114993) {
        this.N_4 = this.N(class110872, class074382, class114992, class114993);
        if ((class11499)this.N_4 == null) {
            return false;
        }
        float f = class09139.N((double)0.0, (double)(Math.PI * 2));
        double d = Math.max(0.08, (class007342.u - class007342.N) * 0.5);
        double d2 = Math.max(0.08, (class007342.R - class007342.L) * 0.5);
        double d3 = class09139.N((double)1.05, (double)1.85);
        double d4 = class09139.N((double)(-(class007342.i - class007342.y) * 0.22), (double)((class007342.i - class007342.y) * 0.18));
        class06889 class068893 = class007342.R();
        this.N_3 = new class06889(class068893.M + Math.cos(f) * (d + d3), class04995.N((double)(class068892.B + d4), (double)(class007342.y - (class007342.i - class007342.y) * 0.28), (double)(class007342.i + (class007342.i - class007342.y) * 0.22)), class068893.Z + Math.sin(f) * (d2 + d3));
        this.N_5 = class11073.RELEASE;
        this.N_1 = l;
        this.N_2 = l + (long)class09139.N((double)145.0, (double)245.0);
        this.N_0 = l + (long)class09139.N((double)520.0, (double)1180.0);
        return true;
    }

    private class06889 N(class06889 class068892, class06889 class068893, float f) {
        if (class068893 == null) {
            return class068892;
        }
        return new class06889(class04995.u((double)f, (double)class068892.M, (double)class068893.M), class04995.u((double)f, (double)class068892.B, (double)class068893.B), class04995.u((double)f, (double)class068892.Z, (double)class068893.Z));
    }

    public class11104 N(class11087 class110872, class07438 class074382, class00734 class007342, class06889 class068892, class11499 class114992, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        long l = System.currentTimeMillis();
        if (this.N(class110872, bl2, bl3, bl4)) {
            this.N(l, false);
        }
        class11499 class114993 = class09170.N((class06889)class068892);
        if ((class11073)((Object)this.N_5) == class11073.IDLE && l >= (Long)this.N_0 && this.N(class110872, class074382, class114992, class114993, bl, bl2, bl3) && !this.N(class110872, class074382, l, class007342, class068892, class114992, class114993)) {
            this.N_0 = l + (long)class09139.N((double)85.0, (double)180.0);
        }
        if ((class11073)((Object)this.N_5) == class11073.IDLE) {
            return class11104.N(class068892, class114993);
        }
        if (l >= (Long)this.N_2) {
            if ((class11073)((Object)this.N_5) == class11073.RELEASE) {
                this.N_5 = class11073.FLICK;
                this.N_1 = l;
                this.N_2 = l + (long)class09139.N((double)145.0, (double)235.0);
            } else {
                this.N(l, true);
                return class11104.N(class068892, class114993);
            }
        }
        float f = class04995.N((float)((float)(l - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1)), (float)0.0f, (float)1.0f);
        if ((class11073)((Object)this.N_5) == class11073.RELEASE) {
            float f2 = this.y(f);
            class06889 class068893 = this.N(class068892, (class06889)this.N_3, f2);
            return new class11104(class068893, (class11499)this.N_4, true, false);
        }
        float f3 = 1.0f - this.N(f);
        class06889 class068894 = this.N(class068892, (class06889)this.N_3, f3);
        class11499 class114994 = this.N((class11499)this.N_4, class114993, 1.0f - f3);
        return new class11104(class068894, class114994, true, true);
    }
}

