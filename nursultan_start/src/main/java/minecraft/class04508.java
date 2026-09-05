/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00429
 *  minecraft.class00464
 *  minecraft.class00500
 *  minecraft.class01217
 *  minecraft.class01289
 *  minecraft.class01312
 *  minecraft.class02131
 *  minecraft.class04252
 *  minecraft.class04396
 *  minecraft.class04425
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05378
 *  minecraft.class05781
 *  minecraft.class06889
 *  minecraft.class06898
 *  minecraft.class06990
 *  minecraft.class07049
 *  minecraft.class07065
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07105
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08005
 *  minecraft.class08700
 *  net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class00429;
import minecraft.class00464;
import minecraft.class00500;
import minecraft.class01217;
import minecraft.class01289;
import minecraft.class01312;
import minecraft.class02131;
import minecraft.class04252;
import minecraft.class04396;
import minecraft.class04425;
import minecraft.class04516;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05378;
import minecraft.class05781;
import minecraft.class06889;
import minecraft.class06898;
import minecraft.class06990;
import minecraft.class07049;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07105;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08005;
import minecraft.class08700;
import net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension;
import org.jspecify.annotations.Nullable;

public class class04508
extends class07150 {
    private static final int M = 20;
    private static final int B = 1;
    private static final int Z = 20;
    private static final int W = 3;
    private static final int T = 5;
    private static final int b = 10;
    private static final float X = 3.0f;
    private static final int a = 1;
    private static final int p = 80;
    public class04396 N = new class04396();
    public class04396 y = new class04396();
    public class04396 L = new class04396();
    public class04396 u = new class04396();
    public class04396 i = new class04396();
    public class04396 R = new class04396();
    private int F = 0;
    private int A = 0;
    private static final class04252 f = (class080052, class070492, class060692) -> {
        class070492.method_73183().method_43129(null, class070492, class04909.LF, class070492.method_5634(), 1.0f, 1.0f);
        class04252.y.deflect(class080052, class070492, class060692);
    };

    public static class05300 M() {
        return class07079.H().N(class05298.l, (double)0.63f).N(class05298.n, 30.0).N(class05298.P, 24.0).N(class05298.u, 3.0);
    }

    public @Nullable class07438 T() {
        return this.S();
    }

    public class04252 method_56071(class08005 class080052) {
        if (class080052.method_5864() == class07078.n || class080052.method_5864() == class07078.ya) {
            return class04252.N;
        }
        return this.method_5864().N(class01217.j) ? f : class04252.N;
    }

    public void method_5674(class02131<?> class021312) {
        if (this.method_73183().method_8608() && field_18064.equals(class021312)) {
            this.n();
            class01312 class013122 = this.method_18376();
            switch (class013122) {
                case field_47247: {
                    this.i.y(this.field_6012);
                    break;
                }
                case field_47248: {
                    this.R.y(this.field_6012);
                    break;
                }
                case field_47246: {
                    this.y.y(this.field_6012);
                }
            }
        }
        super.method_5674(class021312);
    }

    public double method_29241() {
        return this.method_5751();
    }

    public void method_5773() {
        class01312 class013122 = this.method_18376();
        switch (class013122) {
            case field_47246: {
                this.N(20);
                break;
            }
            case field_47247: 
            case field_47248: 
            case field_18076: {
                this.B().N(1 + this.method_59922().y(1));
                break;
            }
            case field_30095: {
                this.u.y(this.field_6012);
                this.E();
            }
        }
        this.N.y(this.field_6012);
        if (class013122 != class01312.field_47246 && this.y.y()) {
            this.L.N(this.field_6012);
            this.y.N();
        }
        int n = this.A = this.A == 0 ? this.field_5974.N(1, 80) : this.A - 1;
        if (this.A == 0) {
            this.W();
        }
        super.method_5773();
    }

    public class04911 method_5634() {
        return class04911.field_15251;
    }

    protected class07065 method_33570() {
        return class07065.field_28632;
    }

    public boolean method_5747(double d, float f, class07072 class070722) {
        if (d > 3.0) {
            this.method_5783(class04909.LD, 1.0f, 1.0f);
        }
        return super.method_5747(d, f, class070722);
    }

    public class04508(class07078<? extends class07150> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(class04425.field_47413, -1.0f);
        this.N(class04425.field_3, -1.0f);
        this.J = 10;
    }

    public class04508 B() {
        this.F = 0;
        return this;
    }

    public void D() {
        if (this.T() != null && this.method_24828()) {
            return;
        }
        this.method_73183().method_55116((class07049)this, this.s(), this.method_5634(), 1.0f, 1.0f);
    }

    protected class04891 s() {
        return this.method_24828() ? class04909.Lf : class04909.LC;
    }

    private void n() {
        this.i.N();
        this.N.N();
        this.R.N();
        this.u.N();
    }

    public Optional<class07438> m() {
        return this.method_18868().L(class05378.d).map(class07072::u).filter(class070492 -> class070492 instanceof class07438).map(class070492 -> (class07438)class070492);
    }

    public double v() {
        return this.method_23318() + (double)(this.method_17682() / 2.0f) + (double)0.3f;
    }

    public boolean y(class06889 class068892) {
        class06889 class068893 = this.method_24515().method_46558();
        return class068892.N(class068893, 4.0, 10.0);
    }

    public void E() {
        if (++this.F > 5) {
            return;
        }
        class00500 class005002 = !this.method_55667().P() ? this.method_55667() : this.method_25936();
        class06889 class068892 = this.method_18798();
        class06889 class068893 = this.method_73189().i(class068892).y(0.0, (double)0.1f, 0.0);
        for (int i = 0; i < 3; ++i) {
            this.method_73183().method_8406((class07126)this.N(new class07105(class07107.y, class005002)), class068893.M, class068893.B, class068893.Z, 0.0, 0.0, 0.0);
        }
    }

    private class07105 N(class07105 class071052) {
        class07209 class072092 = !this.method_55667().P() ? this.method_24515() : this.method_23312();
        ((BlockStateParticleEffectExtension)class071052).fabric_setBlockPos(class072092);
        return class071052;
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("breezeBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.y("breezeActivityUpdate");
        class04516.N(this);
        class046432.L();
        super.N(class047822);
    }

    public void N(int n) {
        class00500 class005002;
        if (this.method_5765()) {
            return;
        }
        class06889 class068892 = this.method_5829().R();
        class06889 class068893 = new class06889(class068892.M, this.method_73189().B, class068892.Z);
        class00500 class005003 = class005002 = !this.method_55667().P() ? this.method_55667() : this.method_25936();
        if (class005002.b() == class06898.field_11455) {
            return;
        }
        for (int i = 0; i < n; ++i) {
            this.method_73183().method_8406((class07126)this.N(new class07105(class07107.y, class005002)), class068893.M, class068893.B, class068893.Z, 0.0, 0.0, 0.0);
        }
    }

    public void W() {
        float f = 0.7f + 0.4f * this.field_5974.z();
        float f2 = 0.8f + 0.2f * this.field_5974.z();
        this.method_73183().method_55116((class07049)this, class04909.uy, this.method_5634(), f2, f);
    }

    public int NR() {
        return 30;
    }

    public int NB() {
        return 25;
    }

    public void method_74589(class04782 class047822, class06990 class069902) {
        super.method_74589(class047822, class069902);
        class069902.N(class00429.u, () -> new class00464(this.method_18868().L(class05378.s).map(class07049::method_5628), this.method_18868().L(class05378.yE)));
    }

    public class05781<class04508> method_28306() {
        return class01289.N(class04516.R, class04516.i);
    }

    public boolean method_5679(class04782 class047822, class07072 class070722) {
        return class070722.u() instanceof class04508 || super.method_5679(class047822, class070722);
    }

    public class04891 method_6002() {
        return class04909.Lr;
    }

    public class01289<class04508> method_18868() {
        return super.method_18868();
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.uN;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class04516.N(this, (class01289<class04508>)this.method_28306().N(dynamic));
    }

    public boolean method_5973(class07078<?> class070782) {
        return class070782 == class07078.Ly || class070782 == class07078.Nn;
    }
}

