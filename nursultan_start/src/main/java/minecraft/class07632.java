/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class01210
 *  minecraft.class01328
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04396
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07065
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07830
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00737;
import minecraft.class01210;
import minecraft.class01328;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04396;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07656;
import minecraft.class07830;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07632
extends class07656 {
    public static final float N = 0.5f;
    public static final float y = 10.0f;
    private static final class02131<Byte> i = class03289.N(class07632.class, (class04383)class02154.N);
    private static final int R = 1;
    private static final class01328 M = class01328.y().N(4.0);
    private static final byte B = 0;
    public final class04396 L = new class04396();
    public final class04396 u = new class04396();
    private @Nullable class07209 Z;

    public static class05300 M() {
        return class07079.H().N(class05298.n, 6.0);
    }

    public boolean method_5696() {
        return true;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(i, (Object)0);
    }

    public void method_5773() {
        super.method_5773();
        if (this.B()) {
            this.method_18799(class06889.L);
            this.method_23327(this.method_23317(), (double)class04995.N((double)this.method_23318()) + 1.0 - (double)this.method_17682(), this.method_23321());
        } else {
            this.method_18799(this.method_18798().u(1.0, 0.6, 1.0));
        }
        this.Z();
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.method_5679(class047822, class070722)) {
            return false;
        }
        if (this.B()) {
            this.N(false);
        }
        return super.method_64397(class047822, class070722, f);
    }

    public void method_5623(double d, boolean bl, class00500 class005002, class07209 class072092) {
    }

    public boolean method_5776() {
        return !this.B() && (float)this.field_6012 % 10.0f == 0.0f;
    }

    protected class07065 method_33570() {
        return class07065.field_28632;
    }

    public boolean method_5810() {
        return false;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("BatFlags", ((Byte)this.field_6011.N(i)).byteValue());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.field_6011.N(i, (Object)class082992.N("BatFlags", (byte)0));
    }

    public class07632(class07078<? extends class07632> class070782, class07299 class072992) {
        super(class070782, class072992);
        if (!class072992.method_8608()) {
            this.N(true);
        }
    }

    public boolean B() {
        return ((Byte)this.field_6011.N(i) & 1) != 0;
    }

    private void Z() {
        if (this.B()) {
            this.L.N();
            this.u.y(this.field_6012);
        } else {
            this.u.N();
            this.L.y(this.field_6012);
        }
    }

    public @Nullable class04891 s() {
        if (this.B() && this.field_5974.y(4) != 0) {
            return null;
        }
        return class04909.yF;
    }

    protected void N(class04782 class047822) {
        super.N(class047822);
        class07209 class072092 = this.method_24515();
        class07209 class072093 = class072092.method_10084();
        if (this.B()) {
            boolean bl = this.method_5701();
            if (class047822.method_8320(class072093).u((class07290)class047822, class072092)) {
                if (this.field_5974.y(200) == 0) {
                    ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(this.field_5974.y(360));
                }
                if (class047822.N(M, (class07438)this) != null) {
                    this.N(false);
                    if (!bl) {
                        class047822.method_8444(null, 1025, class072092, 0);
                    }
                }
            } else {
                this.N(false);
                if (!bl) {
                    class047822.method_8444(null, 1025, class072092, 0);
                }
            }
        } else {
            if (!(this.Z == null || class047822.R(this.Z) && this.Z.method_10264() > class047822.method_31607())) {
                this.Z = null;
            }
            if (this.Z == null || this.field_5974.y(30) == 0 || this.Z.method_19769((class00737)this.method_73189(), 2.0)) {
                this.Z = class07209.method_49637((double)(this.method_23317() + (double)this.field_5974.y(7) - (double)this.field_5974.y(7)), (double)(this.method_23318() + (double)this.field_5974.y(6) - 2.0), (double)(this.method_23321() + (double)this.field_5974.y(7) - (double)this.field_5974.y(7)));
            }
            double d = (double)this.Z.method_10263() + 0.5 - this.method_23317();
            double d2 = (double)this.Z.method_10264() + 0.1 - this.method_23318();
            double d3 = (double)this.Z.method_10260() + 0.5 - this.method_23321();
            class06889 class068892 = this.method_18798();
            class06889 class068893 = class068892.y((Math.signum(d) * 0.5 - class068892.M) * (double)0.1f, (Math.signum(d2) * (double)0.7f - class068892.B) * (double)0.1f, (Math.signum(d3) * 0.5 - class068892.Z) * (double)0.1f);
            this.method_18799(class068893);
            float f = class04995.R((float)((float)(class04995.u((double)class068893.Z, (double)class068893.M) * 57.2957763671875) - 90.0f - this.method_36454()));
            ((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(0.5f);
            this.method_36456(this.method_36454() + f);
            if (this.field_5974.y(100) == 0 && class047822.method_8320(class072093).u((class07290)class047822, class072093)) {
                this.N(true);
            }
        }
    }

    public static boolean N(class07078<class07632> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        if (class072092.method_10264() >= class072842.N(class07830.field_13202, class072092).method_10264()) {
            return false;
        }
        if (class060692.Z()) {
            return false;
        }
        if (class072842.U(class072092) > class060692.y(4)) {
            return false;
        }
        if (!class072842.method_8320(class072092.method_10074()).N(class01210.LG)) {
            return false;
        }
        return class07632.y(class070782, (class07284)class072842, (class06113)class061132, (class07209)class072092, (class06069)class060692);
    }

    public void N(boolean bl) {
        byte by = (Byte)this.field_6011.N(i);
        if (bl) {
            this.field_6011.N(i, (Object)((byte)(by | 1)));
        } else {
            this.field_6011.N(i, (Object)((byte)(by & 0xFFFFFFFE)));
        }
    }

    public void method_6087(class07049 class070492) {
    }

    public class04891 method_6002() {
        return class04909.yA;
    }

    public float method_6107() {
        return 0.1f;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.yf;
    }

    public float method_6017() {
        return super.method_6017() * 0.95f;
    }

    public void method_6070() {
    }
}

