/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09235
 *  Nursultan.class09237
 *  Nursultan.class09239
 *  Nursultan.class09240
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00325
 *  minecraft.class00327
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class01194
 *  minecraft.class01289
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04396
 *  minecraft.class04425
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05378
 *  minecraft.class05487
 *  minecraft.class05781
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07062
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07105
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07472
 *  minecraft.class07623
 *  minecraft.class07655
 *  minecraft.class08005
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08630
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09235;
import Nursultan.class09237;
import Nursultan.class09239;
import Nursultan.class09240;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import minecraft.class00260;
import minecraft.class00262;
import minecraft.class00325;
import minecraft.class00327;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class01194;
import minecraft.class01289;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03696;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04396;
import minecraft.class04425;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05378;
import minecraft.class05487;
import minecraft.class05781;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07062;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07105;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07472;
import minecraft.class07623;
import minecraft.class07655;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08630;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class00245
extends class07150 {
    private static final class02131<Boolean> W = class03289.N(class00245.class, (class04383)class02154.U);
    private static final class02131<Boolean> T = class03289.N(class00245.class, (class04383)class02154.U);
    private static final class02131<Boolean> b = class03289.N(class00245.class, (class04383)class02154.U);
    private static final class02131<Optional<class07209>> X = class03289.N(class00245.class, (class04383)class02154.s);
    private static final int a = 15;
    private static final int p = 1;
    private static final float F = 3.0f;
    private static final float A = 32.0f;
    private static final float f = 144.0f;
    public static final int N = 40;
    private static final float C = 0.4f;
    public static final float y = 0.3f;
    public static final int L = 16545810;
    public static final int u = 0x5F5F5F;
    public static final int i = 8;
    public static final int R = 45;
    private static final int S = 4;
    private int x;
    public final class04396 M = new class04396();
    public final class04396 B = new class04396();
    public final class04396 Z = new class04396();
    private int D;
    private boolean h;
    private int r;
    private int NN;

    public static class05300 M() {
        return class07150.Y().N(class05298.n, 1.0).N(class05298.l, (double)0.4f).N(class05298.u, 3.0).N(class05298.P, 32.0).N(class05298.O, 1.0625);
    }

    public void P() {
        if (((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 > this.r) {
            this.r = ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 + this.method_59922().N(this.h ? 2 : ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 / 4, this.h ? 8 : ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 / 2);
            this.h = !this.h;
        }
    }

    public @Nullable class07438 T() {
        return this.S();
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(W, (Object)true);
        class042932.N(T, (Object)false);
        class042932.N(b, (Object)false);
        class042932.N(X, Optional.empty());
    }

    public boolean method_5753() {
        return this.N() || super.method_5753();
    }

    public void method_5773() {
        class00394 class003942;
        class07209 class072092;
        if (!this.method_73183().method_8608() && (class072092 = this.U()) != null && !((class003942 = this.method_73183().method_8321(class072092)) instanceof class00327 && ((class00327)class003942).y(this))) {
            this.method_6033(0.0f);
        }
        super.method_5773();
        if (this.method_73183().method_8608()) {
            this.n();
            this.P();
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        class00327 class003272;
        class07209 class072092 = this.U();
        if (class072092 == null || class070722.N(class03696.u)) {
            return super.method_64397(class047822, class070722, f);
        }
        if (this.method_5679(class047822, class070722) || this.D > 0 || this.method_29504()) {
            return false;
        }
        class08036 class080362 = this.N(class070722);
        class07049 class070492 = class070722.L();
        if (!(class070492 instanceof class07438) && !(class070492 instanceof class08005) && class080362 == null) {
            return false;
        }
        this.D = 8;
        this.method_73183().method_8421((class07049)this, (byte)66);
        this.method_32876((class03556)class01194.n);
        class00394 class003942 = this.method_73183().method_8321(class072092);
        if (class003942 instanceof class00327 && (class003272 = (class00327)class003942).y(this)) {
            if (class080362 != null) {
                class003272.y();
            }
            this.method_6013(class070722);
        }
        return true;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.Bj, 0.15f, 1.0f);
    }

    public boolean method_5810() {
        return super.method_5810() && this.B();
    }

    public void method_5762(double d, double d2, double d3) {
        if (!this.B()) {
            return;
        }
        super.method_5762(d, d2, d3);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.y("home_pos", class07209.field_25064, (Object)this.U());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        class082992.N("home_pos", class07209.field_25064).ifPresent(this::N);
    }

    public void method_5711(byte by) {
        if (by == 66) {
            this.D = 8;
            this.method_6013(this.method_48923().s());
        } else if (by == 4) {
            this.x = 15;
            this.method_59928();
        } else {
            super.method_5711(by);
        }
    }

    public boolean method_5822(boolean bl) {
        return !this.N() && super.method_5822(bl);
    }

    public class00245(class07078<? extends class00245> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.o = new class09235(this, this);
        this.q = new class09237(this, this);
        this.K = new class09240(this, this);
        ((class07655)this.f()).N(true);
        this.J = 0;
    }

    public boolean B() {
        return (Boolean)this.field_6011.N(W);
    }

    public void Z() {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class072992 = this.method_5829();
            class06889 class068892 = class072992.R();
            double d = class072992.y() * 0.3;
            double d2 = class072992.L() * 0.3;
            double d3 = class072992.u() * 0.3;
            class047822.method_65096((class07126)new class07105(class07107.yz, class00869.n.W()), class068892.M, class068892.B, class068892.Z, 100, d, d2, d3, 0.0);
            class047822.method_65096((class07126)new class07105(class07107.yz, (class00500)class00869.Lp.W().y((class08092)class00325.L, (Comparable)class08630.field_55833)), class068892.M, class068892.B, class068892.Z, 10, d, d2, d3, 0.0);
        }
        this.method_56078(this.method_6002());
        this.method_5650(class07062.field_26999);
    }

    public boolean b() {
        List var1 = ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.z).orElse(List.of());
        boolean bl = this.v();
        if (var1.isEmpty()) {
            if (bl) {
                this.j();
            }
            return true;
        }
        boolean bl2 = false;
        for (class08036 class080362 : var1) {
            if (!this.method_18395((class07438)class080362) || this.method_5722((class07049)class080362)) continue;
            bl2 = true;
            if (bl && !class07438.staticFields_7212a028292fd3c078969e3ee4c71d9e8_5.test(class080362) || !this.method_64619((class07438)class080362, 0.5, false, true, new double[]{this.method_23320(), this.method_23318() + 0.5 * (double)this.method_55693(), (this.method_23320() + this.method_23318()) / 2.0})) continue;
            if (bl) {
                return false;
            }
            if (!(class080362.method_5858((class07049)this) < 144.0)) continue;
            this.N(class080362);
            return false;
        }
        if (!bl2 && bl) {
            this.j();
        }
        return true;
    }

    protected class04891 s() {
        if (this.v()) {
            return null;
        }
        return class04909.Bm;
    }

    private void n() {
        this.M.N(this.x > 0, this.field_6012);
        this.B.N(this.D > 0, this.field_6012);
        this.Z.N(this.W(), this.field_6012);
    }

    public boolean m() {
        return this.h;
    }

    public boolean v() {
        return (Boolean)this.field_6011.N(T);
    }

    public void j() {
        this.method_18868().y(class05378.s);
        this.method_32876((class03556)class01194.n);
        this.method_56078(class04909.Bs);
        this.N(false);
    }

    public @Nullable class07209 U() {
        return ((Optional)this.field_6011.N(X)).orElse(null);
    }

    public boolean z() {
        List var1 = ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.z).orElse(List.of());
        if (var1.isEmpty()) {
            this.NN = 0;
            return false;
        }
        class00734 class007342 = this.method_5829();
        for (class08036 class080362 : var1) {
            if (!class007342.u(class080362.method_33571())) continue;
            ++this.NN;
            return this.NN > 4;
        }
        this.NN = 0;
        return false;
    }

    public void y(class07209 class072092) {
        this.field_6011.N(X, Optional.of(class072092));
    }

    public void y(class07072 class070722) {
        this.N(class070722);
        this.method_6078(class070722);
        this.method_56078(class04909.Bl);
    }

    public void E() {
        this.field_6011.N(b, (Object)true);
    }

    public class08036 N(class07072 class070722) {
        this.method_65344(class070722);
        return this.method_65343(class070722);
    }

    public void N(class08036 class080362) {
        this.method_18868().N(class05378.s, (Object)class080362);
        this.method_32876((class03556)class01194.n);
        this.method_56078(class04909.BP);
        this.N(true);
    }

    public void N(class07209 class072092) {
        this.y(class072092);
        this.N(class04425.field_17, 8.0f);
        this.N(class04425.field_33534, 8.0f);
        this.N(class04425.field_14, 8.0f);
        this.N(class04425.field_3, 0.0f);
        this.N(class04425.field_9, 0.0f);
    }

    public boolean N() {
        return this.U() != null;
    }

    public float N(class07209 class072092, class05487 class054872) {
        return 0.0f;
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("creakingBrain");
        this.method_18868().N((class04782)this.method_73183(), (class07438)this);
        class046432.L();
        class00260.N(this);
    }

    public void N(boolean bl) {
        this.field_6011.N(T, (Object)bl);
    }

    protected class07623 N(class07299 class072992) {
        return new class00262(this, this, class072992);
    }

    public boolean W() {
        return (Boolean)this.field_6011.N(b);
    }

    protected class07472 Z_() {
        return new class09239(this, this);
    }

    public void method_6005(double d, double d2, double d3) {
        if (!this.B()) {
            return;
        }
        super.method_6005(d, d2, d3);
    }

    public class05781<class00245> method_28306() {
        return class00260.N();
    }

    public class04891 method_6002() {
        return class04909.Bb;
    }

    public void method_59928() {
        this.method_56078(class04909.BT);
    }

    public void method_48565(float f) {
        float f2 = Math.min(f * 25.0f, 3.0f);
        ((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_3.N(f2, 0.4f, 1.0f);
    }

    public void method_6007() {
        if (this.D > 0) {
            --this.D;
        }
        if (this.x > 0) {
            --this.x;
        }
        if (!this.method_73183().method_8608()) {
            boolean bl = (Boolean)this.field_6011.N(W);
            boolean bl2 = this.b();
            if (bl2 != bl) {
                this.method_32876((class03556)class01194.n);
                if (bl2) {
                    this.method_56078(class04909.Bn);
                } else {
                    this.NN();
                    this.method_56078(class04909.Bv);
                }
            }
            this.field_6011.N(W, (Object)bl2);
        }
        super.method_6007();
    }

    public class01289<class00245> method_18868() {
        return super.method_18868();
    }

    public boolean method_6121(class04782 class047822, class07049 class070492) {
        if (!(class070492 instanceof class07438)) {
            return false;
        }
        this.x = 15;
        this.method_73183().method_8421((class07049)this, (byte)4);
        return super.method_6121(class047822, class070492);
    }

    public class04891 method_6011(class07072 class070722) {
        return this.N() ? class04909.BG : super.method_6011(class070722);
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class00260.y(this, (class01289<class00245>)this.method_28306().N(dynamic));
    }

    public void method_6108() {
        if (this.N() && this.W()) {
            ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 = ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 + 1;
            if (!this.method_73183().method_8608() && ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 > 45 && !this.method_31481()) {
                this.Z();
            }
        } else {
            super.method_6108();
        }
    }
}

