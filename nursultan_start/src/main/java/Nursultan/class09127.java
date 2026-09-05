/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09169
 *  Nursultan.class09170
 *  Nursultan.class11058
 *  Nursultan.class11087
 *  Nursultan.class11098
 *  Nursultan.class11499
 *  minecraft.class04995
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09121;
import Nursultan.class09122;
import Nursultan.class09126;
import Nursultan.class09128;
import Nursultan.class09129;
import Nursultan.class09130;
import Nursultan.class09131;
import Nursultan.class09134;
import Nursultan.class09135;
import Nursultan.class09137;
import Nursultan.class09139;
import Nursultan.class09142;
import Nursultan.class09145;
import Nursultan.class09149;
import Nursultan.class09151;
import Nursultan.class09153;
import Nursultan.class09157;
import Nursultan.class09158;
import Nursultan.class09161;
import Nursultan.class09162;
import Nursultan.class09169;
import Nursultan.class09170;
import Nursultan.class11058;
import Nursultan.class11087;
import Nursultan.class11098;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class09127 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;

    public class09127() {
        this.u();
        this.L_0 = new class09129();
        this.L_1 = new class09145();
        this.L_2 = new class09137();
        this.L_3 = new class09157();
        this.L_4 = new class09135();
        this.L_5 = new class09162();
        this.y_0 = new class09158();
        this.y_1 = new class11058();
        this.y_2 = new class09128();
        this.y_3 = new class09142();
        this.y_4 = new class11098();
        this.y_5 = new class09161();
        this.N_3 = Float.valueOf(1.0f);
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = 0;
            this.N_5 = 0;
            this.N_6 = 0;
        }
    }

    private void N(long l, float f, boolean bl, boolean bl2, boolean bl3) {
        if (l < (Long)this.N_0) {
            return;
        }
        float f2 = (bl ? 0.35f : 0.0f) + (bl2 ? 0.45f : 0.0f) + (bl3 ? 0.55f : 0.0f);
        this.N_1 = Float.valueOf(class09139.N((double)(-f * (0.46f + f2 * 0.42f)), (double)(f * (0.58f + f2 * 0.68f))));
        this.N_2 = Float.valueOf(class09139.N((double)(-f * (0.18f + f2 * 0.16f)), (double)(f * (0.18f + f2 * 0.16f))));
        this.N_3 = Float.valueOf(class09139.N((double)(0.97f - f2 * 0.02f), (double)(1.03f + f2 * 0.035f)));
        this.N_0 = l + (long)class09139.N(bl3 ? 88.0 : 130.0, bl2 ? 220.0 : 380.0);
    }

    public boolean N() {
        return ((class11058)this.y_1).y();
    }

    private float N(float f, double d, float f2) {
        if (Math.abs(f) <= f2) {
            return 0.0f;
        }
        if (d <= 1.0E-5) {
            return f;
        }
        int n = Math.round(f / (float)d);
        if (n == 0) {
            n = f > 0.0f ? 1 : -1;
        }
        return (float)n * (float)d;
    }

    private float N(float f, float f2, float f3, boolean bl) {
        float f4 = Math.abs(f2) > 1.0E-4f ? Math.signum(f2) : (Math.random() > 0.5 ? 1.0f : -1.0f);
        float f5 = f + f4 * f3 * class09139.N((double)0.22f, bl ? (double)0.92f : (double)0.58f);
        if (Math.abs(f2) > f3 * 3.0f) {
            float f6 = Math.max(f3, Math.abs(f2) - f3 * class09139.N((double)1.6f, (double)3.4f));
            f5 = class04995.N((float)f5, (float)(-f6), (float)f6);
        }
        return f5;
    }

    private float N(float f, double d, boolean bl, boolean bl2) {
        if (Math.abs(f) <= 1.0E-4f || d <= 1.0E-5) {
            return f;
        }
        float f2 = Math.signum(f);
        float f3 = Math.abs(f) / (float)d;
        int n = Math.max(1, (int)Math.floor(f3));
        int n2 = Math.max(n, (int)Math.ceil(f3));
        int n3 = Math.random() < (double)class04995.N((float)(f3 - (float)n), (float)0.0f, (float)1.0f) ? n2 : n;
        int n4 = n3;
        if (bl2) {
            int n5 = bl ? ((Integer)this.N_4).intValue() : ((Integer)this.N_5).intValue();
            int n6 = n5;
            if (n3 == Math.abs(n5) && n3 > 1) {
                n3 += Math.random() > 0.5 ? 1 : -1;
            }
        }
        return f2 * (float)n3 * (float)d;
    }

    public class09121 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, float f, float f2, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        int n;
        double d = class09170.N();
        float f3 = (float)Math.max(d, (double)0.035f);
        long l = System.currentTimeMillis();
        class09122 class091222 = ((class11058)this.y_1).N(class110872, class074382, class114992, class114993, f, f2, d, bl4, bl5, bl6, bl3, bl2, bl);
        class114993 = class091222.B();
        f = class091222.u();
        f2 = class091222.y();
        bl4 = class091222.M();
        bl6 = class091222.R();
        bl3 = class091222.z();
        if (class091222.L()) {
            return this.N(class110872, class074382, class114992, class114993, f, f2, d, bl5, bl6, bl3, bl2, class091222.Z(), class091222.U());
        }
        float f4 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f5 = class114993.R() - class114992.R();
        float f6 = bl4 ? 0.0f : f5;
        float f7 = class04995.N((float)f4, (float)(-f), (float)f);
        float f8 = bl4 ? 0.0f : class04995.N((float)f6, (float)(-f2), (float)f2);
        boolean bl7 = bl5 && !bl6 && !bl3 && !bl2 && !bl && Math.abs(f4) <= Math.max(f3 * 18.0f, 2.2f) && Math.abs(f6) <= Math.max(f3 * 12.0f, 1.1f);
        boolean bl8 = bl7;
        if (bl7) {
            class09130 class091302 = ((class09129)this.L_0).N(f4, f6, f7, f8, d, bl4, false, true);
            float f9 = class091302.y();
            float f10 = bl4 ? 0.0f : class091302.N();
            class09126 class091262 = ((class09162)this.L_5).N(f4, f6, f9, f10, f3, bl4, false, bl2, bl5, bl6);
            f9 = class091262.y();
            f10 = bl4 ? 0.0f : class091262.N();
            class09169 class091692 = ((class09158)this.y_0).N(class110872, class074382, class114992, f4, f5, f9, f10, f, f2, d, bl4, false, bl2, bl5, bl6);
            f9 = class091692.y();
            f10 = class091692.u();
            bl4 = class091692.i();
            float f11 = class091692.L() / Math.max(f3, f);
            float f12 = class091692.N() / Math.max(f3, f2);
            class11499 class114994 = new class11499(class114992.y() + f9, class04995.N((float)(class114992.R() + f10), (float)-90.0f, (float)90.0f));
            class114994 = ((class09145)this.L_1).N(class110872, class074382, class114992, class114993, class114994, d, bl4, bl5, bl6);
            class114994 = ((class09137)this.L_2).N(class110872, class074382, class114992, class114993, class114994, d, bl5, bl6);
            if (bl4 && class114994.R() != class114992.R()) {
                class114994 = new class11499(class114994.y(), class114992.R());
            }
            class114994 = ((class09157)this.L_3).N(class110872, class074382, class114992, class114993, class114994, d, bl4, bl5, bl6, false, bl2);
            boolean bl9 = class091222.N() || class091222.i();
            class09149 class091492 = ((class09128)this.y_2).N(class110872, class074382, class114992, class114993, class114994, d, bl4, bl5, bl6, f, f2, bl9, class091222.Z(), class091222.U());
            class114994 = class091492.L();
            class09151 class091512 = ((class09142)this.y_3).N(class110872, class074382, class114992, class114993, class114994, d, bl4, bl5, bl6, class091492.y(), class091492.N(), bl9, bl2, class091222.i());
            class114994 = class091512.y();
            class09134 class091342 = ((class11098)this.y_4).N(class110872, class074382, class114992, class114993, class114994, d, bl5, bl6, bl9, class091222.U(), false, bl2, class091512.N(), class091512.u());
            class114994 = class091342.L();
            bl4 = bl4 && !bl9 && !class091222.U();
            f9 = class09170.N((float)class114992.y(), (float)class114994.y());
            f10 = class114994.R() - class114992.R();
            int n2 = this.N(f9, f3);
            int n3 = this.N(f10, f3);
            this.N_4 = n2;
            this.N_5 = n3;
            this.N_6 = 0;
            float f13 = this.N(Math.max(Math.abs(f9), class091342.N()), d, true);
            float f14 = this.N(Math.max(Math.abs(f10), class091342.y()), d, false);
            class09153 class091532 = ((class09135)this.L_4).N(class110872, class074382, class114992, class114994, d, bl4, bl5, bl6, false, bl2, f13, f14);
            return this.N(class110872, class074382, class114992, class114993, class091532.L(), d, bl4, bl5, bl6, false, bl2, class091532.y(), class091532.N());
        }
        this.N(l, f3, bl, bl2, bl3);
        boolean bl10 = bl5 && Math.abs(f4) <= f3 * 3.5f && Math.abs(f6) <= f3 * 2.0f;
        boolean bl11 = bl10;
        if (!bl10) {
            f7 += ((Float)this.N_1).floatValue();
            if (!bl4) {
                f8 += ((Float)this.N_2).floatValue();
            }
        } else if (bl2) {
            f7 += ((Float)this.N_1).floatValue() * 0.34f;
            if (!bl4) {
                f8 += ((Float)this.N_2).floatValue() * 0.18f;
            }
        }
        class09130 class091303 = ((class09129)this.L_0).N(f4, f6, f7, f8, d, bl4, bl3, false);
        float f15 = class091303.y();
        float f16 = bl4 ? 0.0f : class091303.N();
        class09126 class091263 = ((class09162)this.L_5).N(f4, f6, f15, f16, f3, bl4, bl3, bl2, bl5, bl6);
        f15 = class091263.y();
        f16 = bl4 ? 0.0f : class091263.N();
        class09169 class091693 = ((class09158)this.y_0).N(class110872, class074382, class114992, f4, f5, f15, f16, f, f2, d, bl4, bl3, bl2, bl5, bl6);
        f15 = class091693.y();
        f16 = class091693.u();
        bl4 = class091693.i();
        float f17 = class091693.L() / Math.max(f3, f);
        float f18 = class091693.N() / Math.max(f3, f2);
        int n4 = this.N(f15, f3);
        int n5 = this.N(f16, f3);
        if (n4 == (Integer)this.N_4 && n5 == (Integer)this.N_5 && (n4 != 0 || n5 != 0)) {
            int n6 = (Integer)this.N_6 + 1;
            n = n6;
            this.N_6 = n6;
        } else {
            n = 0;
        }
        this.N_6 = n;
        if ((Integer)this.N_6 >= 6 && !bl5) {
            f15 = this.N(f15, f4, f3, bl3);
            if (!bl4) {
                f16 = this.N(f16, f6, f3 * 0.55f, false);
            }
            f15 = this.N(f15, d, true, true);
            f16 = bl4 ? 0.0f : this.N(f16, d, false, true);
            n4 = this.N(f15, f3);
            n5 = this.N(f16, f3);
        }
        class11499 class114995 = new class11499(class114992.y() + f15, class04995.N((float)(class114992.R() + f16), (float)-90.0f, (float)90.0f));
        class114995 = this.N(class110872, class074382, class114992, class114993, class114995, bl5, bl6, d, Math.abs(f15), Math.abs(f16), bl10);
        class114995 = ((class09145)this.L_1).N(class110872, class074382, class114992, class114993, class114995, d, bl4, bl5, bl6);
        class114995 = ((class09137)this.L_2).N(class110872, class074382, class114992, class114993, class114995, d, bl5, bl6);
        if (bl4 && class114995.R() != class114992.R()) {
            class114995 = new class11499(class114995.y(), class114992.R());
        }
        class114995 = ((class09157)this.L_3).N(class110872, class074382, class114992, class114993, class114995, d, bl4, bl5, bl6, bl3, bl2);
        boolean bl12 = class091222.N() || class091222.i();
        class09149 class091493 = ((class09128)this.y_2).N(class110872, class074382, class114992, class114993, class114995, d, bl4, bl5, bl6, f, f2, bl12, class091222.Z(), class091222.U());
        class114995 = class091493.L();
        class09151 class091513 = ((class09142)this.y_3).N(class110872, class074382, class114992, class114993, class114995, d, bl4, bl5, bl6, class091493.y(), class091493.N(), bl12, bl2, class091222.i());
        class114995 = class091513.y();
        class09134 class091343 = ((class11098)this.y_4).N(class110872, class074382, class114992, class114993, class114995, d, bl5, bl6, bl12, class091222.U(), bl3, bl2, class091513.N(), class091513.u());
        class114995 = class091343.L();
        bl4 = bl4 && !bl12 && !class091222.U();
        float f19 = Math.abs(class09170.N((float)class114992.y(), (float)class114995.y()));
        float f20 = Math.abs(class114995.R() - class114992.R());
        n4 = this.N(class09170.N((float)class114992.y(), (float)class114995.y()), f3);
        n5 = this.N(class114995.R() - class114992.R(), f3);
        float f21 = this.N(Math.max(f19, class091343.N()), d, true);
        float f22 = this.N(Math.max(f20, class091343.y()), d, false);
        this.N_4 = n4;
        this.N_5 = n5;
        class09153 class091533 = ((class09135)this.L_4).N(class110872, class074382, class114992, class114995, d, bl4, bl5, bl6, bl3, bl2, f21, f22);
        return this.N(class110872, class074382, class114992, class114993, class091533.L(), d, bl4, bl5, bl6, bl3, bl2, class091533.y(), class091533.N());
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, boolean bl, boolean bl2, double d, float f, float f2, boolean bl3) {
        if (class114994 == null || class110872.N(class074382, class114994) || !bl || bl2) {
            return class114994;
        }
        float f3 = class09170.N((float)class114992.y(), (float)class114994.y());
        float f4 = class114994.R() - class114992.R();
        float[] fArray = new float[]{0.86f, 0.68f, 0.5f, 0.34f, 0.18f};
        for (float f5 : fArray) {
            class11499 class114995 = new class11499(class114992.y() + this.N(f3 * f5, d, true, true), class04995.N((float)(class114992.R() + this.N(f4 * f5, d, false, true)), (float)-90.0f, (float)90.0f));
            if (!class110872.N(class074382, class114995)) continue;
            return class114995;
        }
        class11499 class114996 = this.N(class114992, class114993, d, f, f2);
        if (class110872.N(class074382, class114996)) {
            return class114996;
        }
        return bl3 ? class114992 : class114994;
    }

    private float N(float f, double d, boolean bl) {
        if (d <= 1.0E-5) {
            return Math.max(bl ? 0.35f : 0.25f, f);
        }
        float f2 = bl ? 0.35f : 0.25f;
        return (float)Math.max(1, Math.round(Math.max(f2, f) / (float)d)) * (float)d;
    }

    private class09121 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, float f, float f2) {
        class09131 class091312 = ((class09161)this.y_5).N(class110872, class074382, class114992, class114993, class114994, d, bl, bl2, bl3, bl4, bl5, f, f2);
        return new class09121(class091312.L(), class091312.N(), class091312.y());
    }

    public void N(class11499 class114992) {
        this.N_0 = 0L;
        this.N_1 = Float.valueOf(0.0f);
        this.N_2 = Float.valueOf(0.0f);
        this.N_3 = Float.valueOf(1.0f);
        this.N_4 = 0;
        this.N_5 = 0;
        this.N_6 = 0;
        ((class09129)this.L_0).N();
        ((class09145)this.L_1).N();
        ((class09137)this.L_2).N();
        ((class09157)this.L_3).N();
        ((class09135)this.L_4).N();
        ((class09162)this.L_5).N();
        ((class09158)this.y_0).N();
        ((class11058)this.y_1).N();
        ((class09128)this.y_2).N();
        ((class09142)this.y_3).N();
        ((class11098)this.y_4).N();
        ((class09161)this.y_5).N();
    }

    private class11499 N(class11499 class114992, class11499 class114993, double d, float f, float f2) {
        float f3 = class04995.N((float)class09170.N((float)class114992.y(), (float)class114993.y()), (float)(-f), (float)f);
        float f4 = class04995.N((float)(class114993.R() - class114992.R()), (float)(-f2), (float)f2);
        f3 = this.N(f3, d, true, true);
        f4 = this.N(f4, d, false, true);
        return new class11499(class114992.y() + f3, class04995.N((float)(class114992.R() + f4), (float)-90.0f, (float)90.0f));
    }

    private int N(float f, float f2) {
        if (Math.abs(f) <= 1.0E-4f) {
            return 0;
        }
        return Math.round(f / f2);
    }

    private class09121 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, float f, float f2, double d, boolean bl, boolean bl2, boolean bl3, boolean bl4, float f3, boolean bl5) {
        float f4 = (float)Math.max(d, (double)0.035f);
        float f5 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f6 = class114993.R() - class114992.R();
        float f7 = this.N(class04995.N((float)f5, (float)(-f), (float)f), d, true, true);
        float f8 = this.N(class04995.N((float)f6, (float)(-f2), (float)f2), d, false, true);
        if (Math.abs(f7) <= f4 && Math.abs(f5) > f4 * 2.0f) {
            f7 = Math.signum(f5) * f4 * class09139.N(2.27362837, 4.83737733);
            f7 = this.N(f7, d, true, true);
        }
        class11499 class114994 = new class11499(class114992.y() + f7, class04995.N((float)(class114992.R() + f8), (float)-90.0f, (float)90.0f));
        class114994 = this.N(class110872, class074382, class114992, class114993, class114994, bl, bl2, d, Math.abs(f7), Math.abs(f8), false);
        class114994 = ((class09145)this.L_1).N(class110872, class074382, class114992, class114993, class114994, d, false, bl, bl2);
        class114994 = ((class09137)this.L_2).N(class110872, class074382, class114992, class114993, class114994, d, bl, bl2);
        class114994 = ((class09157)this.L_3).N(class110872, class074382, class114992, class114993, class114994, d, false, bl, bl2, true, bl4);
        class09149 class091492 = ((class09128)this.y_2).N(class110872, class074382, class114992, class114993, class114994, d, false, bl, bl2, f, f2, true, f3, bl5);
        class114994 = class091492.L();
        class09151 class091512 = ((class09142)this.y_3).N(class110872, class074382, class114992, class114993, class114994, d, false, bl, bl2, class091492.y(), class091492.N(), true, bl4, false);
        class114994 = class091512.y();
        class09134 class091342 = ((class11098)this.y_4).N(class110872, class074382, class114992, class114993, class114994, d, bl, bl2, true, bl5, bl3, bl4, class091512.N(), class091512.u());
        class114994 = class091342.L();
        float f9 = Math.abs(class09170.N((float)class114992.y(), (float)class114994.y()));
        float f10 = Math.abs(class114994.R() - class114992.R());
        int n = this.N(class09170.N((float)class114992.y(), (float)class114994.y()), f4);
        int n2 = this.N(class114994.R() - class114992.R(), f4);
        this.N_6 = 0;
        this.N_4 = n;
        this.N_5 = n2;
        float f11 = this.N(Math.max(f9, class091342.N()), d, true);
        float f12 = this.N(Math.max(f10, class091342.y()), d, false);
        class09153 class091532 = ((class09135)this.L_4).N(class110872, class074382, class114992, class114994, d, false, bl, bl2, bl3, bl4, f11, f12);
        return this.N(class110872, class074382, class114992, class114993, class091532.L(), d, false, bl, bl2, bl3, bl4, class091532.y(), class091532.N());
    }
}

