/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01231
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02484
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03969
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05349
 *  minecraft.class05378
 *  minecraft.class05487
 *  minecraft.class05581
 *  minecraft.class05970
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07055
 *  minecraft.class07072
 *  minecraft.class07075
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07107
 *  minecraft.class07109
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07431
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07450
 *  minecraft.class07451
 *  minecraft.class07453
 *  minecraft.class07610
 *  minecraft.class07623
 *  minecraft.class07633
 *  minecraft.class07639
 *  minecraft.class08036
 *  minecraft.class08185
 *  minecraft.class08725
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01231;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02484;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03969;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05349;
import minecraft.class05378;
import minecraft.class05487;
import minecraft.class05581;
import minecraft.class05970;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07075;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07107;
import minecraft.class07109;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07431;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07450;
import minecraft.class07451;
import minecraft.class07453;
import minecraft.class07610;
import minecraft.class07623;
import minecraft.class07633;
import minecraft.class07639;
import minecraft.class08036;
import minecraft.class08185;
import minecraft.class08725;
import org.jspecify.annotations.Nullable;

public abstract class class08156
extends class07453
implements class03969,
class07431 {
    public static final int N = 500;
    public static final int y = 3;
    public static final int L = 16;
    public static final int u = 32;
    public static final int i = 8;
    private static final int p = 60;
    private static final int F = 40;
    private static final double A = 0.9;
    private static final float f = 0.011f;
    private static final float C = 0.0325f;
    private static final float S = 0.02f;
    private static final class02131<Boolean> x = class03289.N(class08156.class, (class04383)class02154.U);
    private static final int D = 40;
    private static final int h = 5;
    private static final float r = 1.2f;
    private static final float NN = 0.5f;
    private int Ny = 0;
    protected float R;
    protected class07075 M;
    private static final double NL = 0.8;
    private static final double NE = 1.1;
    private static final double NW = 0.25;
    private static final double Nm = 2.0;
    private static final float NP = 0.15f;
    private static final float Ns = 1.0f;

    protected void w() {
        class07075 class070752 = this.M;
        this.M = new class07075(this.d());
        if (class070752 != null) {
            int n = Math.min(class070752.method_5439(), this.M.method_5439());
            for (int i = 0; i < n; ++i) {
                class06584 class065842 = class070752.method_5438(i);
                if (class065842.R()) continue;
                this.M.method_5447(i, class065842.t());
            }
        }
    }

    protected boolean Q() {
        return this.method_18868().N(class05378.NW) || this.method_18868().N(class05378.s);
    }

    public boolean method_5675() {
        return false;
    }

    public @Nullable class04803 method_32318(int n) {
        int n2 = n - 500;
        if (n2 >= 0 && n2 < this.M.method_5439()) {
            return this.M.method_32318(n2);
        }
        return super.method_32318(n);
    }

    public void method_5674(class02131<?> class021312) {
        if (!this.field_5953 && x.equals(class021312)) {
            this.Ny = this.Ny == 0 ? 40 : this.Ny;
        }
        super.method_5674(class021312);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(x, (Object)false);
    }

    public void method_5773() {
        super.method_5773();
        if (!this.method_73183().method_8608()) {
            this.y(this.method_73183());
        }
        if (this.v() && this.Ny < 35) {
            this.N(false);
        }
        if (this.Ny > 0) {
            --this.Ny;
            if (this.Ny == 0) {
                this.method_56078(this.l());
            }
        }
        if (this.method_5799()) {
            this.o();
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        class07049 class070492;
        boolean bl = super.method_64397(class047822, class070722, f);
        if (bl && (class070492 = class070722.u()) instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            class08185.N((class04782)class047822, (class08156)this, (class07438)class074382);
        }
        return bl;
    }

    public @Nullable class07438 method_5642() {
        class07049 class070492 = this.method_31483();
        if (this.Nz() && class070492 instanceof class08036) {
            return (class08036)class070492;
        }
        return super.method_5642();
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
    }

    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        this.NW();
        return super.method_5688(class080362, class070502);
    }

    protected boolean method_5818(class07049 class070492) {
        return !this.method_5782();
    }

    public class08156(class07078<? extends class08156> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.q = new class05581((class07079)this, 85, 10, 0.011f, 0.0f, true);
        this.o = new class07450((class07079)this, 10);
        this.N(class04425.field_18, 0.0f);
        this.w();
    }

    public static class05300 B() {
        return class07633.Ne().N(class05298.n, 15.0).N(class05298.l, 1.0).N(class05298.u, 3.0).N(class05298.b, (double)0.3f);
    }

    private int I() {
        if (!this.method_6109() && this.method_6118(class07085.field_55946).R()) {
            return 32;
        }
        return 16;
    }

    public int n() {
        return this.Ny;
    }

    protected @Nullable class04891 l() {
        return null;
    }

    public final int d() {
        return class07610.N((int)this.k());
    }

    public boolean m() {
        return this.Nz();
    }

    private void o() {
        double d = this.method_18798().M();
        double d2 = class04995.N((double)(d * 2.0), (double)0.15f, (double)1.0);
        if ((double)this.field_5974.z() < d2) {
            float f = this.method_36454();
            float f2 = class04995.N((float)this.method_36455(), (float)-10.0f, (float)10.0f);
            class06889 class068892 = this.method_5631(f2, f);
            double d3 = this.field_5974.U() * 0.8 * (1.0 + d);
            double d4 = ((double)this.field_5974.z() - 0.5) * d3;
            double d5 = ((double)this.field_5974.z() - 0.5) * d3;
            double d6 = ((double)this.field_5974.z() - 0.5) * d3;
            this.method_73183().method_8406((class07126)class07107.u, this.method_23317() - class068892.M * 1.1, this.method_23318() - class068892.B + 0.25, this.method_23321() - class068892.Z * 1.1, d4, d5, d6);
        }
    }

    public int k() {
        return 0;
    }

    public void t() {
    }

    public boolean v() {
        return (Boolean)this.field_6011.N(x);
    }

    public void y(int n) {
        this.method_56078(this.G());
        this.method_32876((class03556)class01194.n);
        this.N(true);
    }

    protected void y(class08036 class080362) {
        if (!this.method_73183().method_8608()) {
            class080362.method_5804((class07049)this);
            if (!this.method_5782()) {
                this.Nb();
            }
        }
    }

    private void y(class07299 class072992) {
        class07049 class070492 = this.method_31483();
        if (class070492 instanceof class08036) {
            boolean bl;
            class08036 class080362 = (class08036)class070492;
            boolean bl2 = class080362.method_6059(class07047.c);
            boolean bl3 = bl = class072992.N() % 40L == 0L;
            if (!bl2 || bl) {
                class080362.method_6092(new class07055(class07047.c, 60, 0, true, true, true));
            }
        }
    }

    public boolean N(double d) {
        return true;
    }

    protected class07623 N(class07299 class072992) {
        return new class07639((class07079)this, class072992);
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (this.method_6109()) {
            return super.N(class080362, class070502);
        }
        if (this.NQ() && class080362.method_21823()) {
            this.N(class080362);
            return class07082.N;
        }
        if (!class065842.R()) {
            if (!this.method_73183().method_8608() && !this.NQ() && this.N(class065842)) {
                this.N(class080362, class070502, class065842);
                this.R(class080362);
                return class07082.y;
            }
            if (this.N(class065842) && this.method_6032() < this.method_6063()) {
                class05349 class053492 = (class05349)class065842.method_58694(class02484.d);
                this.method_6025(class053492 != null ? (float)(2 * class053492.N()) : 1.0f);
                this.N(class080362, class070502, class065842);
                this.O();
                return class07082.N;
            }
            class07082 class070822 = class065842.N(class080362, (class07438)this, class070502);
            if (class070822.N()) {
                return class070822;
            }
        }
        if (this.NQ() && !class080362.method_21823() && !this.N(class065842)) {
            this.y(class080362);
            return class07082.N;
        }
        return super.N(class080362, class070502);
    }

    public float N(class07209 class072092, class05487 class054872) {
        return 0.0f;
    }

    public boolean N(class06584 class065842) {
        return this.NQ() || this.method_6109() ? class065842.N(class01226.yz) : class065842.N(class01226.yU);
    }

    protected class07109 N(class07438 class074382) {
        return new class07109(class074382.method_36455() * 0.5f, class074382.method_36454());
    }

    public boolean N(class06695 class066952) {
        return this.M != class066952;
    }

    protected void N(class08036 class080362, class07050 class070502, class06584 class065842) {
        if (class065842.N(class01226.yZ)) {
            class080362.method_6122(class070502, class05970.N((class06584)class065842, (class08036)class080362, (class06584)new class06584((class07310)class06570.jE)));
        } else {
            super.N(class080362, class070502, class065842);
        }
    }

    public void N(class08036 class080362) {
        if (!this.method_73183().method_8608() && (!this.method_5782() || this.method_5626((class07049)class080362)) && this.NQ()) {
            class080362.method_76575(this, (class06695)this.M);
        }
    }

    public class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class06069 class060692 = class010012.method_8409();
        class08185.N((class08156)this, (class06069)class060692);
        return super.N(class010012, class070522, class061132, class074462);
    }

    public boolean N(class05487 class054872) {
        return class054872.method_8606((class07049)this);
    }

    public void N(class04782 class047822) {
        this.W();
        super.N(class047822);
    }

    public void N(boolean bl) {
        this.field_6011.N(x, (Object)bl);
    }

    public void N(int n) {
        if (!this.Nz() || this.Ny > 0) {
            return;
        }
        this.R = this.d_(n);
    }

    protected void N(float f, class08036 class080362) {
        this.method_45319(class080362.method_5720().L((double)((this.method_5799() ? 1.2f : 0.5f) * f) * this.method_45325(class05298.l) * (double)this.method_23326()));
        this.Ny = 40;
        this.N(true);
        this.field_64356 = true;
    }

    public static boolean N(class07078<? extends class08156> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        int n = class072842.method_8615();
        int n2 = n - 25;
        return class072092.method_10264() >= n2 && class072092.method_10264() <= n - 5 && class072842.method_8316(class072092.method_10074()).N(class01231.N) && class072842.method_8320(class072092.method_10084()).N(class00869.K);
    }

    protected void W() {
        if (this.g_() || this.method_5782() || !this.NQ()) {
            return;
        }
        int n = this.I();
        if (this.Nj() && this.Ns().method_19771((class00753)this.method_24515(), (double)(n + 8)) && n == this.NT()) {
            return;
        }
        this.N(this.method_24515(), n);
    }

    private void R(class08036 class080362) {
        if (this.field_5974.y(3) == 0) {
            this.u(class080362);
            this.V.W();
            this.method_73183().method_8421((class07049)this, (byte)7);
        } else {
            this.method_73183().method_8421((class07049)this, (byte)6);
        }
        this.O();
    }

    protected @Nullable class04891 G() {
        return null;
    }

    protected boolean Y() {
        return this.method_31483() instanceof class07079;
    }

    public boolean method_6049(class07055 class070552) {
        if (class070552.L() == class07047.j) {
            return false;
        }
        return super.method_6049(class070552);
    }

    public float method_49485(class08036 class080362) {
        return this.method_5799() ? 0.0325f * (float)this.method_45325(class05298.l) : 0.02f * (float)this.method_45325(class05298.l);
    }

    public void method_49481(class08036 class080362, class06889 class068892) {
        super.method_49481(class080362, class068892);
        class07109 class071092 = this.N((class07438)class080362);
        float f = this.method_36454();
        float f2 = class04995.R((float)(class071092.U - f));
        float f3 = 0.5f;
        this.method_5710(f += f2 * 0.5f, class071092.z);
        float f4 = f;
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(f4);
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(f4);
        this.field_5982 = f4;
        if (this.method_66247()) {
            if (this.R > 0.0f && !this.method_70673()) {
                this.N(this.R, class080362);
            }
            this.R = 0.0f;
        }
    }

    public boolean method_63626(class07085 class070852) {
        return class070852 == class07085.field_48824 || class070852 == class07085.field_55946 || super.method_63626(class070852);
    }

    public class03556<class04891> method_66667(class07085 class070852, class06584 class065842, class08725 class087252) {
        if (class070852 == class07085.field_55946 && this.method_5869()) {
            return class04909.oG;
        }
        if (class070852 == class07085.field_55946) {
            return class04909.ol;
        }
        return super.method_66667(class070852, class065842, class087252);
    }

    public class06889 method_49482(class08036 class080362, class06889 class068892) {
        float f = class080362.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue();
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (class080362.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() != 0.0f) {
            float f4 = class04995.P((double)(class080362.method_36455() * ((float)Math.PI / 180)));
            float f5 = -class04995.m((double)(class080362.method_36455() * ((float)Math.PI / 180)));
            if (class080362.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() < 0.0f) {
                f4 *= -0.5f;
                f5 *= -0.5f;
            }
            f3 = f5;
            f2 = f4;
        }
        return new class06889((double)f, (double)f3, (double)f2);
    }

    public boolean method_56991(class07085 class070852) {
        if (class070852 == class07085.field_55946 || class070852 == class07085.field_48824) {
            return this.method_5805() && !this.method_6109() && this.NQ();
        }
        return super.method_56991(class070852);
    }

    public void method_76087(class06889 class068892, double d, boolean bl, double d2) {
        float f = this.method_6029();
        this.method_5724(f, class068892);
        this.method_5784(class07451.field_6308, this.method_18798());
        this.method_18799(this.method_18798().L(0.9));
    }
}

