/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10242
 *  com.mojang.serialization.Dynamic
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01217
 *  minecraft.class01226
 *  minecraft.class01289
 *  minecraft.class01517
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04396
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05378
 *  minecraft.class05781
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06273
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07472
 *  minecraft.class07633
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10242;
import com.mojang.serialization.Dynamic;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00500;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01217;
import minecraft.class01226;
import minecraft.class01289;
import minecraft.class01517;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03696;
import minecraft.class03806;
import minecraft.class03829;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04396;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05378;
import minecraft.class05781;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06273;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07472;
import minecraft.class07633;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class03811
extends class07633 {
    public static final float N = 0.6f;
    public static final float y = 32.5f;
    public static final int L = 80;
    private static final double M = 7.0;
    private static final double B = 2.0;
    private static final class02131<class03829> Z = class03289.N(class03811.class, (class04383)class02154.I);
    private long X = 0L;
    public final class04396 u = new class04396();
    public final class04396 i = new class04396();
    public final class04396 R = new class04396();
    private int p;
    private boolean F = false;

    private void w() {
        switch (this.n().ordinal()) {
            case 0: {
                this.u.N();
                this.i.N();
                this.R.N();
                break;
            }
            case 3: {
                this.u.y(this.field_6012);
                this.i.N();
                this.R.N();
                break;
            }
            case 1: {
                this.u.N();
                this.i.y(this.field_6012);
                this.R.N();
                break;
            }
            case 2: {
                this.u.N();
                this.i.N();
                if (this.F) {
                    this.R.N();
                    this.F = false;
                }
                if (this.X == 0L) {
                    this.R.N(this.field_6012);
                    this.R.N(class03829.field_47792.y(), 1.0f);
                    break;
                }
                this.R.y(this.field_6012);
            }
        }
    }

    public void method_5674(class02131<?> class021312) {
        if (Z.equals(class021312)) {
            this.X = 0L;
        }
        super.method_5674(class021312);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(Z, (Object)class03829.field_47790);
    }

    public void method_5773() {
        super.method_5773();
        if (this.method_73183().method_8608()) {
            this.w();
        }
        if (this.W()) {
            this.NM();
        }
        ++this.X;
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.W()) {
            f = (f - 1.0f) / 2.0f;
        }
        return super.method_64397(class047822, class070722, f);
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.NM, 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("state", class03829.field_47794, (Object)this.n());
        class083292.N("scute_time", this.p);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("state", class03829.field_47794).orElse(class03829.field_47790));
        class082992.i("scute_time").ifPresent(n -> {
            this.p = n;
        });
    }

    public void method_5711(byte by) {
        if (by == 64 && this.method_73183().method_8608()) {
            this.F = true;
            this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.NW, this.method_5634(), 1.0f, 1.0f, false);
        } else {
            super.method_5711(by);
        }
    }

    public class03811(class07078<? extends class07633> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.f().N(true);
        this.p = this.d();
    }

    public static class05300 B() {
        return class07633.Ne().N(class05298.n, 12.0).N(class05298.l, 0.14);
    }

    protected class04891 s() {
        if (this.W()) {
            return null;
        }
        return class04909.NR;
    }

    public class03829 n() {
        return (class03829)((Object)this.field_6011.N(Z));
    }

    public boolean l() {
        return !this.Nk() && !this.method_52535() && !this.g_() && !this.method_5765() && !this.method_5782();
    }

    private int d() {
        return this.field_5974.y(20 * class01517.i * 5) + 20 * class01517.i * 5;
    }

    public boolean m() {
        return this.n().N(this.X);
    }

    public void t() {
        if (this.W()) {
            return;
        }
        this.NN();
        this.Na();
        this.method_32876((class03556)class01194.n);
        this.method_56078(class04909.NZ);
        this.N(class03829.field_47791);
    }

    public boolean v() {
        return this.n() == class03829.field_47791 && this.X > (long)class03829.field_47791.y();
    }

    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        return (class07077)class07078.M.N((class07299)class047822, class06113.field_16466);
    }

    public boolean N(@Nullable class07049 class070492, class06584 class065842) {
        if (this.method_6109()) {
            return false;
        }
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.method_72394(class047822, class06273.NS, class070492, class065842, (arg_0, arg_1) -> ((class03811)this).method_5775(arg_0, arg_1));
            this.method_43077(class04909.NP);
            this.method_32876((class03556)class01194.b);
        }
        return true;
    }

    private boolean N(class03811 class038112) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20_5) && class038112.W();
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class065842.N(class06570.kN) && this.N((class07049)class080362, class065842)) {
            class065842.N(16, (class07438)class080362, class070502.N());
            return class07082.N;
        }
        class03811 class038112 = this;
        if (this.N(class038112)) {
            return class07082.u;
        }
        return super.N(class080362, class070502);
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.NF);
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("armadilloBrain");
        ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class047822, (class07438)this);
        class046432.L();
        class046432.N("armadilloActivityUpdate");
        class03806.N(this);
        class046432.L();
        if (this.method_5805() && --this.p <= 0 && this.method_27071(class047822)) {
            if (this.method_64169(class047822, class06273.NK, (arg_0, arg_1) -> ((class03811)this).method_5775(arg_0, arg_1))) {
                this.method_5783(class04909.NU, 1.0f, (this.field_5974.z() - this.field_5974.z()) * 0.2f + 1.0f);
                this.method_32876((class03556)class01194.v);
            }
            this.p = this.d();
        }
        super.N(class047822);
    }

    public void N(class03829 class038292) {
        this.field_6011.N(Z, (Object)class038292);
    }

    public boolean N(class07438 class074382) {
        if (!this.method_5829().L(7.0, 2.0, 7.0).L(class074382.method_5829())) {
            return false;
        }
        if (class074382.method_5864().N(class01217.u)) {
            return true;
        }
        if (this.method_6065() == class074382) {
            return true;
        }
        if (class074382 instanceof class08036) {
            class08036 class080362 = (class08036)class074382;
            if (class080362.method_7325()) {
                return false;
            }
            return class080362.method_5624() || class080362.method_5765();
        }
        return false;
    }

    public static boolean N(class07078<class03811> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072842.method_8320(class072092.method_10074()).N(class01210.LW) && class03811.N((class07295)class072842, (class07209)class072092);
    }

    public boolean W() {
        return this.field_6011.N(Z) != class03829.field_47790;
    }

    protected void O() {
        this.method_56078(class04909.NL);
    }

    public void G() {
        if (!this.W()) {
            return;
        }
        this.method_32876((class03556)class01194.n);
        this.method_56078(class04909.NE);
        this.N(class03829.field_47790);
    }

    public int NR() {
        if (this.W()) {
            return 0;
        }
        return 32;
    }

    protected class07472 Z_() {
        return new class10242(this, (class07079)this);
    }

    public class05781<class03811> method_28306() {
        return class03806.N();
    }

    public class04891 method_6002() {
        return class04909.NB;
    }

    public float method_17825() {
        return this.method_6109() ? 0.6f : 1.0f;
    }

    public void method_6074(class04782 class047822, class07072 class070722, float f) {
        super.method_6074(class047822, class070722, f);
        if (this.Nt() || this.method_29504()) {
            return;
        }
        if (class070722.u() instanceof class07438) {
            this.method_18868().N(class05378.o, (Object)true, 80L);
            if (this.l()) {
                this.t();
            }
        } else if (class070722.N(class03696.J)) {
            this.G();
        }
    }

    public class04891 method_6011(class07072 class070722) {
        if (this.W()) {
            return class04909.Ni;
        }
        return class04909.Nu;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class03806.N((class01289<class03811>)this.method_28306().N(dynamic));
    }

    public boolean T_() {
        return super.T_() && !this.W();
    }
}

