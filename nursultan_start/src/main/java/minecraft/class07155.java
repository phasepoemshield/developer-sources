/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10720
 *  Nursultan.class10721
 *  Nursultan.class10722
 *  minecraft.class00500
 *  minecraft.class01001
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class01328
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07472
 *  minecraft.class07473
 *  minecraft.class07542
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10720;
import Nursultan.class10721;
import Nursultan.class10722;
import minecraft.class00500;
import minecraft.class01001;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01328;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07142;
import minecraft.class07157;
import minecraft.class07171;
import minecraft.class07177;
import minecraft.class07180;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07472;
import minecraft.class07473;
import minecraft.class07542;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07155
extends class07079
implements class07542 {
    public static final float N = 7.448451f;
    public static final int y = class04995.u((float)24.166098f);
    private static final class02131<Integer> R = class03289.N(class07155.class, (class04383)class02154.y);
    public class06889 L = class06889.L;
    @Nullable class07209 u;
    class07142 i = class07142.field_7318;

    static /* synthetic */ class06069 L(class07155 class071552) {
        return class071552.field_5974;
    }

    public int M() {
        return (Integer)this.field_6011.N(R);
    }

    static /* synthetic */ class06069 M(class07155 class071552) {
        return class071552.field_5974;
    }

    public void method_5674(class02131<?> class021312) {
        if (R.equals(class021312)) {
            this.Z();
        }
        super.method_5674(class021312);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(R, (Object)0);
    }

    public void method_5773() {
        super.method_5773();
        if (this.method_73183().method_8608()) {
            float f = class04995.P((double)((float)(this.B() + this.field_6012) * 7.448451f * ((float)Math.PI / 180) + (float)Math.PI));
            float f2 = class04995.P((double)((float)(this.B() + this.field_6012 + 1) * 7.448451f * ((float)Math.PI / 180) + (float)Math.PI));
            if (f > 0.0f && f2 <= 0.0f) {
                this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.Gz, this.method_5634(), 0.95f + this.field_5974.z() * 0.05f, 0.95f + this.field_5974.z() * 0.05f, false);
            }
            float f3 = this.method_17681() * 1.48f;
            float f4 = class04995.P((double)(this.method_36454() * ((float)Math.PI / 180))) * f3;
            float f5 = class04995.m((double)(this.method_36454() * ((float)Math.PI / 180))) * f3;
            float f6 = (0.3f + f * 0.45f) * this.method_17682() * 2.5f;
            this.method_73183().method_8406((class07126)class07107.Nu, this.method_23317() + (double)f4, this.method_23318() + (double)f6, this.method_23321() + (double)f5, 0.0, 0.0, 0.0);
            this.method_73183().method_8406((class07126)class07107.Nu, this.method_23317() - (double)f4, this.method_23318() + (double)f6, this.method_23321() - (double)f5, 0.0, 0.0, 0.0);
        }
    }

    public class04911 method_5634() {
        return class04911.field_15251;
    }

    public void method_5623(double d, boolean bl, class00500 class005002, class07209 class072092) {
    }

    public boolean method_5776() {
        return (this.B() + this.field_6012) % y == 0;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.y("anchor_pos", class07209.field_25064, (Object)this.u);
        class083292.N("size", this.M());
    }

    public boolean method_5640(double d) {
        return true;
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.u = class082992.N("anchor_pos", class07209.field_25064).orElse(null);
        this.N(class082992.N("size", 0));
    }

    public class07155(class07078<? extends class07155> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 5;
        this.q = new class10722(this, (class07079)this);
        this.o = new class10721((class07079)this);
    }

    static /* synthetic */ class06069 B(class07155 class071552) {
        return class071552.field_5974;
    }

    public int B() {
        return this.method_5628() * 3;
    }

    private void Z() {
        this.method_18382();
        this.method_5996(class05298.u).N((double)(6 + this.M()));
    }

    static /* synthetic */ class06069 Z(class07155 class071552) {
        return class071552.field_5974;
    }

    static /* synthetic */ class06069 i(class07155 class071552) {
        return class071552.field_5974;
    }

    protected class04891 s() {
        return class04909.GM;
    }

    static /* synthetic */ class06069 U(class07155 class071552) {
        return class071552.field_5974;
    }

    static /* synthetic */ class06069 z(class07155 class071552) {
        return class071552.field_5974;
    }

    static /* synthetic */ class06069 u(class07155 class071552) {
        return class071552.field_5974;
    }

    static /* synthetic */ class06069 y(class07155 class071552) {
        return class071552.field_5974;
    }

    static /* synthetic */ class06069 E(class07155 class071552) {
        return class071552.field_5974;
    }

    static /* synthetic */ class06069 N(class07155 class071552) {
        return class071552.field_5974;
    }

    public class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        this.u = this.method_24515().method_10086(5);
        this.N(0);
        return super.N(class010012, class070522, class061132, class074462);
    }

    public void N(int n) {
        this.field_6011.N(R, (Object)class04995.N((int)n, (int)0, (int)64));
    }

    boolean N(class04782 class047822, class07438 class074382, class01328 class013282) {
        return class013282.N(class047822, (class07438)this, class074382);
    }

    static /* synthetic */ class06069 R(class07155 class071552) {
        return class071552.field_5974;
    }

    protected class07472 Z_() {
        return new class10720(this, (class07079)this);
    }

    protected void l_() {
        this.e.N(1, (class07473)new class07171(this));
        this.e.N(2, (class07473)new class07180(this));
        this.e.N(3, (class07473)new class07177(this));
        this.H.N(1, (class07473)new class07157(this));
    }

    public class04891 method_6002() {
        return class04909.GZ;
    }

    public float method_6107() {
        return 1.0f;
    }

    public class01325 method_55694(class01312 class013122) {
        int n = this.M();
        return super.method_55694(class013122).N(1.0f + 0.15f * (float)n);
    }

    public void method_6091(class06889 class068892) {
        this.method_70670(class068892, 0.2f);
    }

    public boolean method_6101() {
        return false;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.GU;
    }

    public boolean method_5973(class07078<?> class070782) {
        return true;
    }
}

