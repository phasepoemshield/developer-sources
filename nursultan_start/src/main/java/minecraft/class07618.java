/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10714
 *  minecraft.class00717
 *  minecraft.class00737
 *  minecraft.class01001
 *  minecraft.class01226
 *  minecraft.class01328
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02735
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05581
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07432
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07450
 *  minecraft.class07451
 *  minecraft.class07454
 *  minecraft.class07464
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07549
 *  minecraft.class07956
 *  minecraft.class07961
 *  minecraft.class07962
 *  minecraft.class07979
 *  minecraft.class07985
 *  minecraft.class07989
 *  minecraft.class07999
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10714;
import java.util.Objects;
import java.util.function.Predicate;
import minecraft.class00717;
import minecraft.class00737;
import minecraft.class01001;
import minecraft.class01226;
import minecraft.class01328;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02735;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05581;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07432;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07450;
import minecraft.class07451;
import minecraft.class07454;
import minecraft.class07464;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07549;
import minecraft.class07623;
import minecraft.class07635;
import minecraft.class07639;
import minecraft.class07642;
import minecraft.class07653;
import minecraft.class07956;
import minecraft.class07961;
import minecraft.class07962;
import minecraft.class07979;
import minecraft.class07985;
import minecraft.class07989;
import minecraft.class07999;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07618
extends class02735 {
    private static final class02131<Boolean> R = class03289.N(class07618.class, (class04383)class02154.U);
    private static final class02131<Integer> M = class03289.N(class07618.class, (class04383)class02154.y);
    static final class01328 N = class01328.y().N(10.0).u();
    public static final int y = 4800;
    private static final int B = 2400;
    public static final Predicate<class00717> L = class007172 -> !class007172.R() && class007172.method_5805() && class007172.method_5799();
    public static final float u = 0.65f;
    private static final boolean Z = false;
    @Nullable class07209 i;

    static /* synthetic */ class06069 L(class07618 class076182) {
        return class076182.field_5974;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(R, (Object)false);
        class042932.N(M, (Object)2400);
    }

    public int method_5748() {
        return 4800;
    }

    public void method_5773() {
        super.method_5773();
        if (this.Nt()) {
            this.method_5855(this.method_5748());
            return;
        }
        if (this.method_5721()) {
            this.y(2400);
        } else {
            this.y(this.E() - 1);
            if (this.E() <= 0) {
                this.method_64419(this.method_48923().v(), 1.0f);
            }
            if (this.method_24828()) {
                this.method_18799(this.method_18798().y((double)((this.field_5974.z() * 2.0f - 1.0f) * 0.2f), 0.5, (double)((this.field_5974.z() * 2.0f - 1.0f) * 0.2f)));
                this.method_36456(this.field_5974.z() * 360.0f);
                this.method_24830(false);
                this.field_64356 = true;
            }
        }
        if (this.method_73183().method_8608() && this.method_5799() && this.method_18798().B() > 0.03) {
            class06889 class068892 = this.method_5828(0.0f);
            float f = class04995.P((double)(this.method_36454() * ((float)Math.PI / 180))) * 0.3f;
            float f2 = class04995.m((double)(this.method_36454() * ((float)Math.PI / 180))) * 0.3f;
            float f3 = 1.2f - this.field_5974.z() * 0.7f;
            for (int i = 0; i < 2; ++i) {
                this.method_73183().method_8406((class07126)class07107.NG, this.method_23317() - class068892.M * (double)f3 + (double)f, this.method_23318() - class068892.B, this.method_23321() - class068892.Z * (double)f3 + (double)f2, 0.0, 0.0, 0.0);
                this.method_73183().method_8406((class07126)class07107.NG, this.method_23317() - class068892.M * (double)f3 - (double)f, this.method_23318() - class068892.B, this.method_23321() - class068892.Z * (double)f3 - (double)f2, 0.0, 0.0, 0.0);
            }
        }
    }

    protected class04891 method_5737() {
        return class04909.ZO;
    }

    protected class04891 method_5625() {
        return class04909.ZQ;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("GotFish", this.B());
        class083292.N("Moistness", this.E());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("GotFish", false));
        this.y(class082992.N("Moistness", 2400));
    }

    protected boolean method_5860(class07049 class070492) {
        return true;
    }

    public void method_5711(byte by) {
        if (by == 38) {
            this.N((class07126)class07107.F);
        } else {
            super.method_5711(by);
        }
    }

    public class07618(class07078<? extends class07618> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.q = new class05581((class07079)this, 85, 10, 0.02f, 0.1f, true);
        this.o = new class07450((class07079)this, 10);
        this.L(true);
    }

    public boolean B() {
        return (Boolean)this.field_6011.N(R);
    }

    protected @Nullable class04891 s() {
        return this.method_5799() ? class04909.Zt : class04909.Zn;
    }

    protected boolean m() {
        class07209 class072092 = this.f().M();
        if (class072092 != null) {
            return class072092.method_19769((class00737)this.method_73189(), 12.0);
        }
        return false;
    }

    public boolean g() {
        return true;
    }

    static /* synthetic */ class06069 y(class07618 class076182) {
        return class076182.field_5974;
    }

    public void y(int n) {
        this.field_6011.N(M, (Object)n);
    }

    public int E() {
        return (Integer)this.field_6011.N(M);
    }

    private void N(class07126 class071262) {
        for (int i = 0; i < 7; ++i) {
            double d = this.field_5974.E() * 0.01;
            double d2 = this.field_5974.E() * 0.01;
            double d3 = this.field_5974.E() * 0.01;
            this.method_73183().method_8406(class071262, this.method_23322(1.0), this.method_23319() + 0.2, this.method_23325(1.0), d, d2, d3);
        }
    }

    static /* synthetic */ class06069 N(class07618 class076182) {
        return class076182.field_5974;
    }

    protected class07623 N(class07299 class072992) {
        return new class07639((class07079)this, class072992);
    }

    public @Nullable class07618 y(class04782 class047822, class07077 class070772) {
        return (class07618)class07078.e.N((class07299)class047822, class06113.field_16466);
    }

    public void N(boolean bl) {
        this.field_6011.N(R, (Object)bl);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        this.method_5855(this.method_5748());
        this.method_36457(0.0f);
        class07446 class074463 = Objects.requireNonNullElseGet(class074462, () -> new class10714(0.1f));
        return super.N(class010012, class070522, class061132, class074463);
    }

    protected class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (!class065842.R() && class065842.N(class01226.yP)) {
            if (!this.method_73183().method_8608()) {
                this.method_5783(class04909.Zd, 1.0f, 1.0f);
            }
            if (this.method_6109()) {
                class065842.N(1, (class07438)class080362);
                this.N(class07618.i((int)(-this.s)), true);
            } else {
                this.N(true);
                class065842.N(1, (class07438)class080362);
            }
            return class07082.N;
        }
        return super.N(class080362, class070502);
    }

    protected void N(int n) {
    }

    protected void N(class04782 class047822, class00717 class007172) {
        class06584 class065842;
        if (this.method_6118(class07085.field_6173).R() && this.L(class065842 = class007172.N())) {
            this.method_29499(class007172);
            this.method_5673(class07085.field_6173, class065842);
            this.N(class07085.field_6173);
            this.method_6103((class07049)class007172, class065842.c());
            class007172.method_31472();
        }
    }

    public static class05300 W() {
        return class07079.H().N(class05298.n, 10.0).N(class05298.l, (double)1.2f).N(class05298.u, 3.0);
    }

    public int Ni() {
        return 1;
    }

    public int NR() {
        return 1;
    }

    protected void l_() {
        this.e.N(0, (class07473)new class07454((class07475)this));
        this.e.N(0, (class07473)new class07979((class07475)this));
        this.e.N(1, (class07473)new class07642(this));
        this.e.N(2, (class07473)new class07635(this, 4.0));
        this.e.N(4, (class07473)new class07985((class07475)this, 1.0, 10));
        this.e.N(4, (class07473)new class07956((class07079)this));
        this.e.N(5, (class07473)new class07962((class07079)this, class08036.class, 6.0f));
        this.e.N(5, (class07473)new class07961(this, 10));
        this.e.N(6, (class07473)new class07999((class07475)this, (double)1.2f, true));
        this.e.N(8, (class07473)new class07653(this));
        this.e.N(8, (class07473)new class07432((class07475)this));
        this.e.N(9, (class07473)new class07464((class07475)this, class07549.class, 8.0f, 1.0, 1.0));
        this.H.N(1, (class07473)new class07989((class07475)this, new Class[]{class07549.class}).N(new Class[0]));
    }

    public @Nullable class04891 method_6002() {
        return class04909.Zl;
    }

    public int method_6064(int n) {
        return this.method_5748();
    }

    public void method_59928() {
        this.method_5783(class04909.ZG, 1.0f, 1.0f);
    }

    public float method_17825() {
        return this.method_6109() ? 0.65f : 1.0f;
    }

    public boolean method_18395(class07438 class074382) {
        return !this.method_6109() && super.method_18395(class074382);
    }

    public boolean method_63626(class07085 class070852) {
        return class070852 == class07085.field_6173 && this.method_5936();
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Zw;
    }

    public void method_76087(class06889 class068892, double d, boolean bl, double d2) {
        this.method_5724(this.method_6029(), class068892);
        this.method_5784(class07451.field_6308, this.method_18798());
        this.method_18799(this.method_18798().L(0.9));
        if (this.T() == null) {
            this.method_18799(this.method_18798().y(0.0, -0.005, 0.0));
        }
    }
}

