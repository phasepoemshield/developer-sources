/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11371
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11678
 *  Nursultan.class11681
 *  Nursultan.class11692
 *  Nursultan.class11694
 *  Nursultan.class11697
 *  Nursultan.class11699
 *  Nursultan.class11701
 *  Nursultan.class11711
 *  Nursultan.class11713
 *  Nursultan.class11782
 *  Nursultan.class11801
 *  Nursultan.class11938
 *  Nursultan.class12029
 *  minecraft.class00381
 *  minecraft.class00509
 *  minecraft.class00676
 *  minecraft.class00743
 *  minecraft.class02484
 *  minecraft.class02575
 *  minecraft.class02830
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05462
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06937
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.class10990;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11371;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11678;
import Nursultan.class11681;
import Nursultan.class11692;
import Nursultan.class11694;
import Nursultan.class11697;
import Nursultan.class11699;
import Nursultan.class11701;
import Nursultan.class11711;
import Nursultan.class11713;
import Nursultan.class11782;
import Nursultan.class11801;
import Nursultan.class11938;
import Nursultan.class12029;
import java.util.Comparator;
import java.util.List;
import minecraft.class00381;
import minecraft.class00509;
import minecraft.class00676;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02575;
import minecraft.class02830;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05462;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07510;

@class11080(L="AutoTotem", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoTotem
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object i_0;
    public Object i_1;
    public static Object R_0;

    private void P() {
        this.j();
        if (class11938.m().u()) {
            return;
        }
        class06584 class065843 = ((class04453)((class06202)this.y_0).T_4).method_6079();
        if (((Integer)this.L_0 != -1 || (Integer)this.L_1 != -1) && !((Boolean)this.L_3).booleanValue() || class065843.y().N(class02484.e) && !class065843.L(class02484.b)) {
            return;
        }
        class11297 class112972 = class11281.L(class065842 -> class065842.y().N(class02484.e)).min((Comparator)this.L_4).orElse(null);
        if (class112972 != null && !class112972.N().L(class02484.b)) {
            this.N(class112972, class065843);
            return;
        }
        if (this.N(class065843, false)) {
            return;
        }
        if (class112972 != null) {
            this.N(class112972, class065843);
            return;
        }
        this.N(class065843, true);
    }

    private int T() {
        int n;
        class00743 var1 = ((class04453)((class06202)this.y_0).T_4).method_31548().u();
        for (n = 9; n < var1.size(); ++n) {
            if (!((class06584)var1.get(n)).R()) continue;
            return n;
        }
        for (n = 0; n < 9; ++n) {
            if (!((class06584)var1.get(n)).R()) continue;
            return n;
        }
        return -1;
    }

    public AutoTotem() {
        this.j();
        this.i_0 = new class11701("health-trigger", true);
        this.i_1 = new class11713("elytra-health-trigger", false);
        this.u_0 = new class11711("crystal-trigger", false);
        this.u_1 = new class11699("tnt-trigger", false);
        this.u_2 = new class11692("falling-dripstone-trigger", false);
        this.u_3 = new class11681("falling-trigger", false);
        this.u_4 = new class11694("trident-trigger", true);
        this.u_5 = new class11678("mace-smash-trigger", false);
        this.u_6 = class11524.y((class11512)this, (String)"triggers", (class11535[])new class11697[]{(class11701)this.i_0, (class11713)this.i_1, (class11681)this.u_3, (class11711)this.u_0, (class11699)this.u_1, (class11692)this.u_2, (class11694)this.u_4, (class11678)this.u_5});
        this.L_0 = -1;
        this.L_1 = -1;
        this.L_4 = Comparator.comparingInt(class112972 -> class112972.N().L(class02484.b) ? 1 : 0);
        ((class11523)this.u_6).L().forEach(class116972 -> {
            if (class116972 instanceof class11801) {
                class116972.N((Object)this);
            }
        });
    }

    static {
        AutoTotem.d();
    }

    private boolean s() {
        return ((class04453)((class06202)this.y_0).T_4).method_7357().N(class06570.la.E());
    }

    private void n() {
        this.j();
        if (class11938.m().u()) {
            return;
        }
        if ((Integer)this.L_1 != -1) {
            this.l();
            return;
        }
        if ((Integer)this.L_0 == -1) {
            return;
        }
        if (this.N((int)((Integer)this.L_0), 0) != -1) {
            this.L_0 = -1;
        }
    }

    private void l() {
        this.j();
        if ((class07482)((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3 != ((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2 || !((class07482)((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R()) {
            return;
        }
        class06584 class065842 = (class06584)((class04453)((class06202)this.y_0).T_4).method_31548().u().get(((Integer)this.L_1).intValue());
        class02830 class028302 = (class02830)class065842.method_58694(class02484.D);
        if (class028302 == null || class028302.M()) {
            this.L_1 = -1;
            return;
        }
        int n = class11281.L((int)((Integer)this.L_1));
        if (class028302.Z() && class028302.B() != 0) {
            class05462.N((class06584)class065842, (int)0);
            ((class06202)this.y_0).NE().N((class00381)new class02575(n, 0));
        }
        boolean bl = !((class04453)((class06202)this.y_0).T_4).method_6079().R();
        class12029 class120292 = class11938.m().N(0, n, 1, class07510.field_7790).N(0, 45, 0, class07510.field_7790);
        if (bl) {
            class120292.N(0, n, 0, class07510.field_7790);
        }
        class120292.y(class062022 -> {
            this.j();
            this.L_2 = class11938.j().y();
        }).y();
        this.L_1 = -1;
    }

    private static void d() {
        R_0 = 45;
    }

    private boolean k() {
        this.j();
        return class11938.j().y() - (Integer)this.L_2 < 5 && ((Integer)this.L_0 != -1 || (Integer)this.L_1 != -1);
    }

    private boolean t() {
        this.j();
        return ((List)((class11523)this.u_6).i()).stream().anyMatch(class11697::N);
    }

    private void j() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0;
            this.L_1 = 0;
            this.L_2 = 0;
            this.L_3 = false;
        }
    }

    private int y(int n) {
        for (class06937 class069372 : ((class07482)((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).T) {
            if (class069372.L != ((class04453)((class06202)this.y_0).T_4).method_31548() || class069372.B() != n) continue;
            return class069372.u;
        }
        return -1;
    }

    private boolean y(class06584 class065843, boolean bl) {
        class02830 class028302 = (class02830)class065843.method_58694(class02484.D);
        if (class028302 == null) {
            return false;
        }
        return class028302.y().anyMatch(class065842 -> class065842.y().N(class02484.e) && (bl || !class065842.L(class02484.b)));
    }

    private int N(class02830 class028302) {
        int n = -1;
        for (int i = 0; i < class028302.i(); ++i) {
            class06584 class065842 = class028302.N(i);
            if (!class065842.y().N(class02484.e)) continue;
            if (!class065842.L(class02484.b)) {
                return i;
            }
            if (n != -1) continue;
            n = i;
        }
        return n;
    }

    @class11782
    public void N(class11371 class113712) {
        if (!(class113712.N() instanceof class00676)) {
            return;
        }
        if (((class04453)((class06202)this.y_0).T_4).method_6047().L(class02484.e) || this.k() || this.s()) {
            return;
        }
        if (this.t()) {
            this.P();
        }
    }

    private boolean N(class06584 class065843, boolean bl) {
        int n;
        this.j();
        if ((class07482)((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3 != ((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2 || !((class07482)((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R()) {
            return false;
        }
        class11297 class112972 = class11281.L(class065842 -> this.y((class06584)class065842, bl)).findFirst().orElse(null);
        if (class112972 == null) {
            return false;
        }
        class02830 class028302 = (class02830)class112972.N().method_58694(class02484.D);
        int n2 = this.N(class028302);
        if (this.N(class065843) && class028302.N(n2).L(class02484.b)) {
            return false;
        }
        boolean bl2 = class028302.i() == 1 && class02830.y((class06584)class065843);
        int n3 = n = class065843.R() || bl2 ? -1 : this.T();
        if (!class065843.R() && !bl2 && class11281.y((int)n)) {
            return false;
        }
        int n4 = class11281.L((int)class112972.y());
        if (class028302.B() != n2) {
            class05462.N((class06584)class112972.N(), (int)n2);
            ((class06202)this.y_0).NE().N((class00381)new class02575(n4, n2));
        }
        class12029 class120292 = class11938.m().N(0, n4, 1, class07510.field_7790).N(0, 45, 0, class07510.field_7790);
        if (!class065843.R()) {
            if (bl2) {
                class120292.N(0, n4, 0, class07510.field_7790);
                this.L_1 = class112972.y();
            } else {
                class120292.N(0, class11281.L((int)n), 0, class07510.field_7790);
                this.L_0 = n;
            }
        }
        int n5 = this.Y();
        class120292.y(class062022 -> {
            this.j();
            this.L_2 = class11938.j().y() + n5;
        }).y();
        this.L_3 = false;
        return true;
    }

    @class11782
    public void N(class10996 class109962) {
        if (((class04453)((class06202)this.y_0).T_4).method_6047().L(class02484.e) || this.k()) {
            return;
        }
        if (this.s()) {
            this.n();
            return;
        }
        if (this.t()) {
            this.P();
            return;
        }
        this.n();
    }

    @class11782
    public void N(class10990 class109902) {
        class00509 class005092;
        class00381 var3;
        this.j();
        if ((class03448)((class06202)this.y_0).T_3 != null && (var3 = class109902.u()) instanceof class00509 && (class005092 = (class00509)var3).N((class07299)((class03448)((class06202)this.y_0).T_3)) == (class04453)((class06202)this.y_0).T_4 && class005092.N() == 35) {
            this.L_3 = true;
            this.L_2 = class11938.j().y() - 5;
        }
    }

    private boolean N(class06584 class065842) {
        return class065842.y().N(class02484.e) && class065842.L(class02484.b);
    }

    private void N(class11297 class112972, class06584 class065842) {
        this.j();
        if (this.N(class065842) && class112972.N().L(class02484.b)) {
            return;
        }
        int n = class112972.y();
        int n2 = this.Y();
        if ((Integer)this.L_0 == -1 && !class065842.R()) {
            this.L_0 = this.N(n, n2);
            if ((Integer)this.L_0 != -1) {
                this.L_3 = false;
            }
            return;
        }
        if (this.N(n, n2) != -1) {
            this.L_3 = false;
        }
    }

    private int N(int n, int n2) {
        int n3 = this.y(n);
        if (n3 == -1) {
            return -1;
        }
        class11938.m().N(((class07482)((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, n3, 40, class07510.field_7791).y(class062022 -> {
            this.j();
            this.L_2 = class11938.j().y() + n2;
        }).y();
        return n;
    }

    private int Y() {
        this.j();
        return ((class11711)this.u_0).N() || ((class11699)this.u_1).N() ? 160 : 0;
    }
}

