/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11281
 *  Nursultan.class11322
 *  Nursultan.class11389
 *  Nursultan.class11400
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11512
 *  Nursultan.class11522
 *  Nursultan.class11524
 *  Nursultan.class11527
 *  Nursultan.class11534
 *  Nursultan.class11782
 *  Nursultan.class11791
 *  Nursultan.class11799
 *  Nursultan.class11907
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06942
 *  minecraft.class07050
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11281;
import Nursultan.class11322;
import Nursultan.class11389;
import Nursultan.class11400;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11512;
import Nursultan.class11522;
import Nursultan.class11524;
import Nursultan.class11527;
import Nursultan.class11534;
import Nursultan.class11782;
import Nursultan.class11791;
import Nursultan.class11799;
import Nursultan.class11907;
import Nursultan.class11938;
import Nursultan.class12002;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;

@class11080(L="WebTrap", y=class11072.COMBAT, N=class11106.TOOLS)
public class WebTrap
extends class11067 {
    public static Object L_0;
    public static Object L_1;
    public Object u_0;
    public Object u_1;
    public boolean u_init;

    private class07209 L(class07438 class074382) {
        class06889 class068892 = this.N(class074382);
        class06889 class068894 = new class06889(class068892.M - class074382.field_6014, 0.0, class068892.Z - class074382.field_5969);
        class06889 class068895 = class068892.i(class068894.L(6.0));
        class00734 class007342 = class074382.method_5829().L(class068895.u(class068892));
        class06889 class068896 = this.N(class007342).stream().min(Comparator.comparingDouble(class068893 -> class068893.M(class068895))).orElse(null);
        return class068896 == null ? null : class07209.method_49638((class00737)class068896);
    }

    private class07438 T() {
        class07438 class074382 = class11938.u().C().v();
        if (class074382 instanceof class08036) {
            class08036 class080363 = (class08036)class074382;
            if (!class11791.u().test(class080363)) {
                return class080363;
            }
        }
        return ((class03448)((class06202)this.y_0).T_3).N(class08036.class, ((class04453)((class06202)this.y_0).T_4).method_5829().M(((class04453)((class06202)this.y_0).T_4).method_55754() + 1.0), class080362 -> class080362 != (class04453)((class06202)this.y_0).T_4 && !class11791.u().test(class080362)).stream().min(Comparator.comparingDouble(class080362 -> class080362.method_73189().M(((class04453)((class06202)this.y_0).T_4).method_73189()))).orElse(null);
    }

    public WebTrap() {
        this.v();
        this.u_0 = class11524.N((class11512)this, (String)"place-key", (class12002)class12002.UNKNOWN);
    }

    static {
        WebTrap.n();
    }

    private void s() {
        this.v();
        this.u_1 = 0;
        class11322.i();
    }

    private static void n() {
        L_0 = 20;
        L_1 = 6.0;
    }

    private void v() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_1 = 0;
        }
    }

    private Supplier<List<class07209>> y(class07209 class072092) {
        return () -> List.of(class072092.method_10084(), class072092);
    }

    private void y(class07438 class074382) {
        class07050 class070502;
        boolean bl;
        this.v();
        class07209 class072092 = this.L(class074382);
        if (class072092 == null) {
            return;
        }
        int n = class11281.R((class06581)class06570.Lf);
        boolean bl2 = bl = ((class04453)((class06202)this.y_0).T_4).method_6079().B() == class06570.Lf;
        if (class11281.y((int)n) && !bl) {
            return;
        }
        class07050 class070503 = class070502 = bl ? class07050.field_5810 : class07050.field_5808;
        if (!bl && ((class04453)((class06202)this.y_0).T_4).method_31548().N() != n) {
            class11322.N((int)n);
        }
        class06584 class065842 = ((class04453)((class06202)this.y_0).T_4).method_5998(class070502);
        for (class07209 class072093 : this.y(class072092).get()) {
            if (!this.N(class072093, class070502, class065842)) continue;
            this.u_1 = 0;
            break;
        }
    }

    public void y() {
        this.s();
        super.y();
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        this.v();
        if (((class11527)this.u_0).N((class11389)class114002)) {
            this.u_1 = 20;
        }
    }

    private boolean N(class07209 class072092, class07050 class070502, class06584 class065842) {
        class00500 class005002 = ((class03448)((class06202)this.y_0).T_3).method_8320(class072092);
        if (class005002.N(class00869.yw) || !class005002.d()) {
            return false;
        }
        if (((class04453)((class06202)this.y_0).T_4).method_5829().L(new class00734(class072092))) {
            return false;
        }
        class06889 class068892 = ((class04453)((class06202)this.y_0).T_4).method_33571();
        double d = ((class04453)((class06202)this.y_0).T_4).method_55754();
        for (class07211 class072112 : class07211.values()) {
            class06942 class069422;
            class11499 class114992;
            class11499 class114993;
            class06183 class061832;
            class06889 class068893;
            class07209 class072093 = class072092.method_10093(class072112.b());
            class00494 class004942 = ((class03448)((class06202)this.y_0).T_3).method_8320(class072093).R((class07290)((class03448)((class06202)this.y_0).T_3), class072093);
            if (class004942.method_1110() || (class068893 = class06889.y((class00753)class072093).i(class06889.N((class00753)class072112.E()).L(0.5))).M(class068892) > d * d || !this.N(class068892, class068893, class072112) || (class061832 = this.N(class114993 = (class114992 = class11505.N()).N(class11505.N((class11499)class114992, (class06889)class068893)).N(true).u(true), class068892, class004942, class072093)) == null || class061832.N() == class07113.field_1333 || class061832.i() != class072112) continue;
            class06183 class061833 = this.N(class114992, class068892, class004942, class072093);
            if (this.N(class061833, class061832)) {
                class114993 = class114992;
                class061832 = class061833;
            }
            if (!(class069422 = new class06942((class07299)((class03448)((class06202)this.y_0).T_3), (class08036)((class04453)((class06202)this.y_0).T_4), class070502, class065842, class061832)).N() || !class069422.method_8037().equals((Object)class072092)) continue;
            class11907.N((class07050)class070502, (class06183)class061832);
            class11534.y((class11499)class114993.N(class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_0));
            return true;
        }
        return false;
    }

    private boolean N(class06889 class068892, class06889 class068893, class07211 class072112) {
        return class068892.u(class068893).y(class06889.N((class00753)class072112.E())) > 0.0;
    }

    private class06889 N(class07438 class074382) {
        return class074382.method_73189();
    }

    private boolean N(class06183 class061832, class06183 class061833) {
        return class061832 != null && class061833 != null && class061832.N() != class07113.field_1333 && class061833.N() != class07113.field_1333 && class061832.u().equals((Object)class061833.u()) && class061832.i() == class061833.i();
    }

    @class11782(L={AttackAura.class})
    public void N(class10992 class109922) {
        this.v();
        if ((Integer)this.u_1 <= 0) {
            return;
        }
        this.u_1 = (Integer)this.u_1 - 1;
        class07438 class074382 = this.T();
        if (class074382 == null) {
            this.s();
            return;
        }
        if (((class11799)((class03443)((class06202)this.y_0).T_2)).N() >= 3) {
            this.y(class074382);
        }
        if ((Integer)this.u_1 <= 0) {
            this.s();
        }
    }

    private List<class06889> N(class00734 class007342) {
        ArrayList<class06889> arrayList = new ArrayList<class06889>();
        int n = (int)Math.floor(class007342.N);
        int n2 = (int)Math.floor(class007342.u);
        int n3 = (int)Math.floor(class007342.L);
        int n4 = (int)Math.floor(class007342.R);
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                arrayList.add(new class06889((double)i + 0.5, class007342.y, (double)j + 0.5));
            }
        }
        return arrayList;
    }

    private class06183 N(class11499 class114992, class06889 class068892, class00494 class004942, class07209 class072092) {
        class06889 class068893 = class068892.i(class114992.U().L(((class04453)((class06202)this.y_0).T_4).method_55754()));
        return class004942.method_1092(class068892, class068893, class072092);
    }
}

