/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09170
 *  Nursultan.class11499
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class09147;
import Nursultan.class09166;
import Nursultan.class09170;
import Nursultan.class11499;
import minecraft.class04995;

public class class09144 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;
    public static Object y_0;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public boolean u_init;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object i_4;
    public Object i_5;

    private void L() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = 0L;
            this.L_2 = 0;
            this.L_3 = 0;
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
            this.N_2 = 0;
            this.N_3 = 0;
            this.N_4 = Float.valueOf(0.0f);
        }
        if (!this.u_init) {
            this.u_init = true;
            this.u_0 = Float.valueOf(0.0f);
            this.u_1 = Float.valueOf(0.0f);
            this.u_2 = false;
            this.u_3 = false;
        }
    }

    public class09144() {
        this.L();
        this.i_0 = new class09166();
        this.i_1 = new float[9];
        this.i_2 = new float[9];
        this.i_3 = new float[9];
        this.i_4 = new float[9];
        this.i_5 = new float[9];
        this.L_0 = new float[9];
    }

    static {
        class09144.B();
    }

    private static void B() {
        y_0 = 9;
    }

    private float y(float f, float f2) {
        if (Math.abs(f) > 1.0E-4f) {
            return f > 0.0f ? 1.0f : -1.0f;
        }
        if (Math.abs(f2) > 1.0E-4f) {
            return f2 > 0.0f ? 1.0f : -1.0f;
        }
        return ((class09166)this.i_0).N();
    }

    private int N(float f, float f2) {
        if (Math.abs(f) <= 1.0E-4f) {
            return 0;
        }
        return Math.round(f / f2);
    }

    private float N(float f, float f2, float f3, boolean bl) {
        float f4 = bl ? ((Float)this.u_0).floatValue() : ((Float)this.u_1).floatValue();
        float f5 = f3 * (bl ? 3.8273628f + ((Float)this.N_4).floatValue() * 3.1726382f : 1.6273628f + ((Float)this.N_4).floatValue() * 1.3726382f);
        float f6 = Math.abs(f2) + f5;
        float f7 = Math.abs(f2);
        float f8 = bl ? 5.8273625f : 2.7362838f;
        if (f7 > f3 * f8 && Math.signum(f) != Math.signum(f2)) {
            f6 = Math.min(f6, f5 * ((class09166)this.i_0).y(0.43628374f, 0.82736284f));
        }
        return class04995.N((float)f, (float)(-Math.min(f4, f6)), (float)Math.min(f4, f6));
    }

    private float N(float f, float[] fArray, int n, float f2, boolean bl) {
        int n2;
        if (n <= 0) {
            return f;
        }
        int n3 = this.N(f, f2);
        if (n3 == (n2 = this.N(fArray[n - 1], f2)) || n > 1 && n3 - n2 == n2 - this.N(fArray[n - 2], f2)) {
            float f3 = Math.abs(f) > 1.0E-4f ? Math.signum(f) : (float)((class09166)this.i_0).N();
            f += f3 * f2 * ((class09166)this.i_0).y(bl ? 0.6273628f : 0.32736284f, bl ? 2.1726382f : 1.1726383f);
        }
        return f;
    }

    private float N(float f, float f2, double d, boolean bl) {
        int n;
        if (Math.abs(f) <= 1.0E-4f || d <= 1.0E-5) {
            return f;
        }
        int n2 = Math.round(f / (float)d);
        if (n2 == 0 && Math.abs(f2) > (float)d) {
            n2 = f2 > 0.0f ? 1 : -1;
        } else if (n2 == 0) {
            n2 = f > 0.0f ? 1 : -1;
        }
        int n3 = n = bl ? ((Integer)this.N_0).intValue() : ((Integer)this.N_1).intValue();
        if (n2 == n && Math.abs(n2) > 1 && (n2 += n2 > 0 ? ((class09166)this.i_0).N(-1, 2) : ((class09166)this.i_0).N(-2, 1)) == 0) {
            int n4 = n2 = n > 0 ? 1 : -1;
        }
        if (bl) {
            this.N_0 = n2;
        } else {
            this.N_1 = n2;
        }
        return (float)n2 * (float)d;
    }

    public void N(long l, class11499 class114992, class11499 class114993, class11499 class114994, double d, float f, float f2, boolean bl, float f3, boolean bl2) {
        float f4 = (float)Math.max(d, (double)0.035f);
        float f5 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f6 = class114993.R() - class114992.R();
        float f7 = class09170.N((float)class114994.y(), (float)class114993.y());
        float f8 = class114993.R() - class114994.R();
        if (Math.abs(f7) <= f4 * 0.82736284f) {
            f7 = f5 * ((class09166)this.i_0).y(0.17263828f, bl ? 0.47263828f : 0.32736284f);
        }
        if (Math.abs(f8) <= f4 * 0.5273628f) {
            f8 = f6 * ((class09166)this.i_0).y(0.11726373f, bl ? 0.38273627f : 0.26372838f);
        }
        this.u_2 = bl;
        this.N_4 = Float.valueOf(f3);
        this.L_3 = 0;
        this.L_2 = bl ? ((class09166)this.i_0).N(4, 7) : ((class09166)this.i_0).N(3, 6);
        this.L_1 = l + (long)((class09166)this.i_0).y(bl ? 96.273636f : 136.37263f, bl ? 196.93738f : 264.82736f);
        this.N_0 = 0;
        this.N_1 = 0;
        this.N_2 = 0;
        this.N_3 = 0;
        float f9 = bl ? 1.9373773f : 1.5273628f;
        float f10 = bl ? 1.6273628f : 1.3726382f;
        this.u_0 = Float.valueOf(Math.max(f4 * (bl ? 6.8273625f : 4.736284f), Math.min(f * f9, Math.abs(f5) * 0.7362837f + f4 * (bl ? 12.827362f : 7.736284f))));
        this.u_1 = Float.valueOf(Math.max(f4 * (bl ? 3.2726383f : 2.1726382f), Math.min(f2 * f10, Math.abs(f6) * 0.6273628f + f4 * (bl ? 5.6273627f : 3.5273628f))));
        this.N((float[])this.i_1, (float[])this.i_3, f7, f5, f4, ((Float)this.u_0).floatValue(), true, bl2);
        this.N((float[])this.i_2, (float[])this.i_4, f8, f6, f4, ((Float)this.u_1).floatValue(), false, false);
        this.N((float[])this.i_5, bl ? 1.6232324f : 1.0273628f, bl ? 1.9373773f : 1.4273628f, 0.04736283f);
        this.N((float[])this.L_0, bl ? 1.1172637f : 0.9273628f, bl ? 1.6273628f : 1.2637284f, 0.03628373f);
        this.u_3 = true;
    }

    public boolean N(long l) {
        if (!((Boolean)this.u_3).booleanValue()) {
            return false;
        }
        if (l > (Long)this.L_1 || (Integer)this.L_3 >= (Integer)this.L_2) {
            this.u_3 = false;
            return false;
        }
        return true;
    }

    public class09147 N(class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, float f, float f2, long l) {
        if (!this.N(l)) {
            return class09147.N(class114994, f, f2);
        }
        float f3 = (float)Math.max(d, (double)0.035f);
        int n = (Integer)this.L_3;
        this.L_3 = n + 1;
        int n2 = n;
        float f4 = class09170.N((float)class114994.y(), (float)class114993.y());
        float f5 = bl ? 0.0f : class114993.R() - class114994.R();
        float f6 = ((float[])this.i_1)[n2] + f4 * ((float[])this.i_3)[n2] + ((class09166)this.i_0).N(true, f3 * (0.26372838f + ((Float)this.N_4).floatValue() * 0.6273628f));
        float f7 = bl ? 0.0f : ((float[])this.i_2)[n2] + f5 * ((float[])this.i_4)[n2] + ((class09166)this.i_0).N(false, f3 * (0.11726373f + ((Float)this.N_4).floatValue() * 0.32736284f));
        f6 = this.N(f6, f4, f3, true);
        f7 = bl ? 0.0f : this.N(f7, f5, f3, false);
        f6 = this.N(f6, f4, d, true);
        f7 = bl ? 0.0f : this.N(f7, f5, d, false);
        class11499 class114995 = new class11499(class114994.y() + f6, class04995.N((float)(class114994.R() + f7), (float)-90.0f, (float)90.0f));
        float f8 = this.N(Math.max(Math.abs(class09170.N((float)class114992.y(), (float)class114995.y())) + f3, f * ((float[])this.i_5)[n2] + Math.abs(f6) * ((class09166)this.i_0).y(0.26372838f, 0.82736284f)), f3, true);
        float f9 = this.N(Math.max(Math.abs(class114995.R() - class114992.R()) + f3, f2 * ((float[])this.L_0)[n2] + Math.abs(f7) * ((class09166)this.i_0).y(0.17263828f, 0.6273628f)), f3, false);
        return new class09147(class114995, f6, f7, f8, f9, true);
    }

    private float N(float f, float f2, boolean bl) {
        int n;
        int n2 = Math.max(1, Math.round(f / f2));
        int n3 = n = bl ? ((Integer)this.N_2).intValue() : ((Integer)this.N_3).intValue();
        if (n2 == n) {
            n2 += ((class09166)this.i_0).N() * ((class09166)this.i_0).N(1, bl ? 6 : 4);
            n2 = Math.max(1, n2);
        }
        if (bl) {
            this.N_2 = n2;
        } else {
            this.N_3 = n2;
        }
        return (float)n2 * f2;
    }

    private void N(float[] fArray, float f, float f2, float f3) {
        float f4 = 0.0f;
        for (int i = 0; i < (Integer)this.L_2; ++i) {
            float f5 = ((class09166)this.i_0).y(f, f2);
            if (i > 0 && Math.abs(f5 - f4) < f3) {
                f5 += (float)((class09166)this.i_0).N() * ((class09166)this.i_0).y(f3, f3 * 4.736284f);
                f5 = class04995.N((float)f5, (float)f, (float)f2);
            }
            fArray[i] = f5;
            f4 = f5;
        }
    }

    private void N(float[] fArray, float[] fArray2, float f, float f2, float f3, float f4, boolean bl, boolean bl2) {
        float f5;
        int n;
        float f6 = this.y(f, f2);
        float f7 = Math.max(Math.abs(f), Math.abs(f2) * ((class09166)this.i_0).y(0.09273628f, bl ? 0.26372838f : 0.17263828f));
        float f8 = f6 * (f7 * ((class09166)this.i_0).y(bl ? 0.43628374f : 0.32736284f, bl ? 0.8726383f : 0.7362837f) + f3 * ((class09166)this.i_0).y(bl ? 0.7362837f : 0.26372838f, bl ? 4.1726384f : 1.7362838f));
        float f9 = 0.0f;
        float[] fArray3 = new float[9];
        for (n = 0; n < (Integer)this.L_2; ++n) {
            f5 = ((class09166)this.i_0).y(0.11726373f, 1.0f);
            if (n == 0 && ((class09166)this.i_0).N(bl ? 0.42736283f : 0.32736284f)) {
                f5 += ((class09166)this.i_0).y(0.32736284f, 0.9273628f);
            }
            if (n > 1 && ((class09166)this.i_0).N(0.26372838f)) {
                f5 *= ((class09166)this.i_0).y(0.32736284f, 0.7362837f);
            }
            fArray3[n] = f5;
            f9 += f5;
        }
        for (n = 0; n < (Integer)this.L_2; ++n) {
            f5 = f6;
            if (n > 0 && ((class09166)this.i_0).N((bl ? 0.17263828f : 0.21736284f) + ((Float)this.N_4).floatValue() * 0.06372837f)) {
                f5 = -f5;
            }
            if (bl2 && bl && ((class09166)this.i_0).N(0.32736284f)) {
                f5 = -f5;
            }
            float f10 = f8 * (fArray3[n] / Math.max(0.001f, f9));
            float f11 = f5 * f3 * ((class09166)this.i_0).y(bl ? 0.21736284f : 0.08273628f, bl ? 2.8273628f + ((Float)this.N_4).floatValue() * 1.9273628f : 0.9273628f + ((Float)this.N_4).floatValue() * 0.82736284f);
            if (((class09166)this.i_0).N(0.38273627f)) {
                f11 *= ((class09166)this.i_0).y(-0.82736284f, 0.5637284f);
            }
            f10 = class04995.N((float)(f10 + f11), (float)(-f4), (float)f4);
            fArray[n] = this.N(f10, fArray, n, f3, bl);
            fArray2[n] = ((class09166)this.i_0).y(bl ? 0.08372837f : 0.06372837f, bl ? 0.32736284f + ((Float)this.N_4).floatValue() * 0.16372837f : 0.23628373f + ((Float)this.N_4).floatValue() * 0.12736283f);
        }
    }

    public void N() {
        this.L_1 = 0L;
        this.L_2 = 0;
        this.L_3 = 0;
        this.N_0 = 0;
        this.N_1 = 0;
        this.N_2 = 0;
        this.N_3 = 0;
        this.N_4 = Float.valueOf(0.0f);
        this.u_0 = Float.valueOf(0.0f);
        this.u_1 = Float.valueOf(0.0f);
        this.u_2 = false;
        this.u_3 = false;
        for (int i = 0; i < 9; ++i) {
            ((float[])this.i_1)[i] = 0.0f;
            ((float[])this.i_2)[i] = 0.0f;
            ((float[])this.i_3)[i] = 0.0f;
            ((float[])this.i_4)[i] = 0.0f;
            ((float[])this.i_5)[i] = 1.0f;
            ((float[])this.L_0)[i] = 1.0f;
        }
        ((class09166)this.i_0).y();
    }
}

