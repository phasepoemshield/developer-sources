/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10714
 *  Nursultan.class10866
 *  com.google.common.collect.Sets
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01001
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01231
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class01332
 *  minecraft.class01335
 *  minecraft.class01894
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05188
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06113
 *  minecraft.class06570
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
 *  minecraft.class07117
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07322
 *  minecraft.class07434
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07459
 *  minecraft.class07463
 *  minecraft.class07469
 *  minecraft.class07471
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07623
 *  minecraft.class07633
 *  minecraft.class07956
 *  minecraft.class07960
 *  minecraft.class07962
 *  minecraft.class07978
 *  minecraft.class07993
 *  minecraft.class08004
 *  minecraft.class08036
 *  minecraft.class08725
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10714;
import Nursultan.class10866;
import com.google.common.collect.Sets;
import java.util.LinkedHashSet;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01001;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01231;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01332;
import minecraft.class01335;
import minecraft.class01361;
import minecraft.class01363;
import minecraft.class01894;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05188;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06113;
import minecraft.class06570;
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
import minecraft.class07117;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07322;
import minecraft.class07434;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07459;
import minecraft.class07463;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07623;
import minecraft.class07633;
import minecraft.class07956;
import minecraft.class07960;
import minecraft.class07962;
import minecraft.class07978;
import minecraft.class07993;
import minecraft.class08004;
import minecraft.class08036;
import minecraft.class08725;
import org.jspecify.annotations.Nullable;

public class class01377
extends class07633
implements class01361 {
    private static final class01894 N = class01894.y((String)"suffocating");
    private static final class07471 y = new class07471(N, (double)-0.34f, class07463.field_6330);
    private static final float L = 0.35f;
    private static final float u = 0.55f;
    private static final class02131<Integer> i = class03289.N(class01377.class, (class04383)class02154.y);
    private static final class02131<Boolean> R = class03289.N(class01377.class, (class04383)class02154.U);
    private final class01332 M;
    private @Nullable class07960 B;

    public class06889 method_24829(class07438 class074382) {
        class06889[] class06889Array = new class06889[]{class01377.method_24826((double)this.method_17681(), (double)class074382.method_17681(), (float)class074382.method_36454()), class01377.method_24826((double)this.method_17681(), (double)class074382.method_17681(), (float)(class074382.method_36454() - 22.5f)), class01377.method_24826((double)this.method_17681(), (double)class074382.method_17681(), (float)(class074382.method_36454() + 22.5f)), class01377.method_24826((double)this.method_17681(), (double)class074382.method_17681(), (float)(class074382.method_36454() - 45.0f)), class01377.method_24826((double)this.method_17681(), (double)class074382.method_17681(), (float)(class074382.method_36454() + 45.0f))};
        LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
        double d = this.method_5829().i;
        double d2 = this.method_5829().y - 0.5;
        class07218 class072182 = new class07218();
        for (class06889 class068892 : class06889Array) {
            class072182.N(this.method_23317() + class068892.M, d, this.method_23321() + class068892.Z);
            for (double d3 = d; d3 > d2; d3 -= 1.0) {
                linkedHashSet.add(class072182.method_10062());
                class072182.N(class07211.field_11033);
            }
        }
        for (class07209 class072092 : linkedHashSet) {
            double d4;
            if (this.method_73183().method_8316(class072092).N(class01231.y) || !class05188.N((double)(d4 = this.method_73183().L(class072092)))) continue;
            class06889 class068893 = class06889.N((class00753)class072092, (double)d4);
            for (class01312 class013122 : class074382.method_24831()) {
                class00734 class007342 = class074382.method_24833(class013122);
                if (!class05188.N((class07322)this.method_73183(), (class07438)class074382, (class00734)class007342.L(class068893))) continue;
                class074382.method_18380(class013122);
                return class068893;
            }
        }
        return new class06889(this.method_23317(), this.method_5829().i, this.method_23321());
    }

    public void method_5674(class02131<?> class021312) {
        if (i.equals(class021312) && this.method_73183().method_8608()) {
            this.M.N();
        }
        super.method_5674(class021312);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(i, (Object)0);
        class042932.N(R, (Object)false);
    }

    public void method_5773() {
        if (this.v() && this.field_5974.y(140) == 0) {
            this.method_56078(class04909.Ys);
        } else if (this.Nk() && this.field_5974.y(60) == 0) {
            this.method_56078(class04909.YT);
        }
        if (!this.Nt()) {
            class00500 class005002 = this.method_73183().method_8320(this.method_24515());
            class00500 class005003 = this.method_43261();
            boolean bl = class005002.N(class01210.yM) || class005003.N(class01210.yM) || this.method_5861(class01231.y) > 0.0;
            class07049 class070492 = this.method_5854();
            boolean bl2 = class070492 instanceof class01377 && ((class01377)class070492).B();
            this.N(!bl || bl2);
        }
        super.method_5773();
        this.n();
    }

    public void method_5623(double d, boolean bl, class00500 class005002, class07209 class072092) {
        if (this.method_5771()) {
            this.method_38785();
            return;
        }
        super.method_5623(d, bl, class005002, class072092);
    }

    protected float method_5867() {
        return this.field_5994 + 0.6f;
    }

    public boolean method_5809() {
        return false;
    }

    public @Nullable class07438 method_5642() {
        class08036 class080362;
        class07049 class070492;
        if (this.Nz() && (class070492 = this.method_31483()) instanceof class08036 && (class080362 = (class08036)class070492).method_24518(class06570.sP)) {
            return class080362;
        }
        return super.method_5642();
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(this.method_5771() ? class04909.Yn : class04909.Yv, 1.0f, 1.0f);
    }

    protected class06889 method_52533(class07049 class070492, class01325 class013252, float f) {
        if (!this.method_73183().method_8608()) {
            return super.method_52533(class070492, class013252, f);
        }
        float f2 = Math.min(0.25f, ((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_3.y());
        float f3 = ((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_3.L();
        float f4 = 0.12f * class04995.P((double)(f3 * 1.5f)) * 2.0f * f2;
        return super.method_52533(class070492, class013252, f).y(0.0, (double)(f4 * f), 0.0);
    }

    protected boolean method_5818(class07049 class070492) {
        return !this.method_5782() && !this.method_5777(class01231.y);
    }

    public class01377(class07078<? extends class01377> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.M = new class01332(this.field_6011, i);
        this.field_23807 = true;
        this.N(class04425.field_18, -1.0f);
        this.N(class04425.field_14, 0.0f);
        this.N(class04425.field_9, 0.0f);
        this.N(class04425.field_3, 0.0f);
    }

    public boolean B() {
        return (Boolean)this.field_6011.N(R);
    }

    protected @Nullable class04891 s() {
        if (this.Nk() || this.v()) {
            return null;
        }
        return class04909.YP;
    }

    protected boolean c() {
        return true;
    }

    private void n() {
        if (this.method_5771()) {
            if (!class06092.N((class07049)this).N(class07117.u, this.method_24515(), true) || this.method_73183().method_8316(this.method_24515().method_10084()).N(class01231.y)) {
                this.method_18799(this.method_18798().L(0.5).y(0.0, 0.05, 0.0));
            } else {
                this.method_24830(true);
            }
        }
    }

    public static class05300 m() {
        return class07633.Ne().N(class05298.l, (double)0.175f);
    }

    private boolean v() {
        return this.B != null && this.B.U();
    }

    protected class07623 N(class07299 class072992) {
        return new class01335(this, class072992);
    }

    public static boolean N(class07078<class01377> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        class07218 class072182 = class072092.method_25503();
        do {
            class072182.N(class07211.field_11036);
        } while (class072842.method_8316((class07209)class072182).N(class01231.y));
        return class072842.method_8320((class07209)class072182).P();
    }

    private class07446 N(class01001 class010012, class07052 class070522, class07079 class070792, @Nullable class07446 class074462) {
        class070792.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0f);
        class070792.N(class010012, class070522, class06113.field_16460, class074462);
        class070792.method_5873((class07049)this, true, false);
        return new class10714(0.0f);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        if (this.method_6109()) {
            return super.N(class010012, class070522, class061132, class074462);
        }
        class06069 class060692 = class010012.method_8409();
        if (class060692.y(30) == 0) {
            class07079 class070792 = (class07079)class07078.LN.N((class07299)class010012.method_8410(), class06113.field_16460);
            if (class070792 != null) {
                class074462 = this.N(class010012, class070522, class070792, (class07446)new class10866(class08004.N((class06069)class060692), false));
                class070792.method_5673(class07085.field_6173, new class06584((class07310)class06570.sP));
                this.method_5673(class07085.field_55946, new class06584((class07310)class06570.PF));
                this.N(class07085.field_55946);
            }
        } else if (class060692.y(10) == 0) {
            class07077 class070772 = (class07077)class07078.yY.N((class07299)class010012.method_8410(), class06113.field_16460);
            if (class070772 != null) {
                class070772.u(-24000);
                class074462 = this.N(class010012, class070522, (class07079)class070772, null);
            }
        } else {
            class074462 = new class10714(0.5f);
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        boolean bl = this.N(class080362.method_5998(class070502));
        if (!bl && this.Nz() && !this.method_5782() && !class080362.method_21823()) {
            if (!this.method_73183().method_8608()) {
                class080362.method_5804((class07049)this);
            }
            return class07082.N;
        }
        class07082 class070822 = super.N(class080362, class070502);
        if (!class070822.N()) {
            class06584 class065842 = class080362.method_5998(class070502);
            if (this.method_63623(class065842, class07085.field_55946)) {
                return class065842.N(class080362, (class07438)this, class070502);
            }
            return class07082.i;
        }
        if (bl && !this.method_5701()) {
            this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.Yt, this.method_5634(), 1.0f, 1.0f + (this.field_5974.z() - this.field_5974.z()) * 0.2f);
        }
        return class070822;
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.yL);
    }

    public @Nullable class01377 y(class04782 class047822, class07077 class070772) {
        return (class01377)class07078.yY.N((class07299)class047822, class06113.field_16466);
    }

    public float N(class07209 class072092, class05487 class054872) {
        if (class054872.method_8320(class072092).Y().N(class01231.y)) {
            return 10.0f;
        }
        return this.method_5771() ? Float.NEGATIVE_INFINITY : 0.0f;
    }

    public boolean N(class05487 class054872) {
        return class054872.method_8606((class07049)this);
    }

    public void N(boolean bl) {
        this.field_6011.N(R, (Object)bl);
        class07469 class074692 = this.method_5996(class05298.l);
        if (class074692 != null) {
            if (bl) {
                class074692.N(y);
            } else {
                class074692.L(N);
            }
        }
    }

    @Override
    public boolean W() {
        return this.M.N(this.method_59922());
    }

    public class06889 ac_() {
        return new class06889(0.0, (double)(0.6f * this.method_5751()), (double)(this.method_17681() * 0.4f));
    }

    protected void l_() {
        this.e.N(1, (class07473)new class07993((class07475)this, 1.65));
        this.e.N(2, (class07473)new class07434((class07633)this, 1.0));
        this.B = new class07960((class07475)this, 1.4, class065842 -> class065842.N(class01226.yu), false);
        this.e.N(3, (class07473)this.B);
        this.e.N(4, (class07473)new class01363(this, 1.0));
        this.e.N(5, (class07473)new class07459((class07633)this, 1.0));
        this.e.N(7, (class07473)new class07978((class07475)this, 1.0, 60));
        this.e.N(8, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(8, (class07473)new class07956((class07079)this));
        this.e.N(9, (class07473)new class07962((class07079)this, class01377.class, 8.0f));
    }

    public float method_49485(class08036 class080362) {
        return (float)(this.method_45325(class05298.l) * (double)(this.B() ? 0.35f : 0.55f) * (double)this.M.L());
    }

    public class04891 method_6002() {
        return class04909.Yb;
    }

    public void method_49481(class08036 class080362, class06889 class068892) {
        this.method_5710(class080362.method_36454(), class080362.method_36455() * 0.5f);
        float f = this.method_36454();
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(f);
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(f);
        this.field_5982 = f;
        this.M.y();
        super.method_49481(class080362, class068892);
    }

    public boolean method_26319(class04688 class046882) {
        return class046882.N(class01231.y);
    }

    public boolean method_29503() {
        return true;
    }

    public boolean method_63626(class07085 class070852) {
        return class070852 == class07085.field_55946 || super.method_63626(class070852);
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Yj;
    }

    public class03556<class04891> method_66667(class07085 class070852, class06584 class065842, class08725 class087252) {
        if (class070852 == class07085.field_55946) {
            return class04909.YG;
        }
        return super.method_66667(class070852, class065842, class087252);
    }

    public class06889 method_49482(class08036 class080362, class06889 class068892) {
        return new class06889(0.0, 0.0, 1.0);
    }

    public boolean method_56991(class07085 class070852) {
        if (class070852 == class07085.field_55946) {
            return this.method_5805() && !this.method_6109();
        }
        return super.method_56991(class070852);
    }
}

