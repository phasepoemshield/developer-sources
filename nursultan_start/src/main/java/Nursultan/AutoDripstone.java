/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10916
 *  Nursultan.class10992
 *  Nursultan.class11066
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11281
 *  Nursultan.class11322
 *  Nursultan.class11385
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11534
 *  Nursultan.class11782
 *  Nursultan.class11907
 *  Nursultan.class11938
 *  Nursultan.class12010
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00624
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06918
 *  minecraft.class06942
 *  minecraft.class07050
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08052
 *  minecraft.class08092
 */
package Nursultan;

import Nursultan.class10916;
import Nursultan.class10992;
import Nursultan.class11066;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11281;
import Nursultan.class11322;
import Nursultan.class11385;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11534;
import Nursultan.class11782;
import Nursultan.class11907;
import Nursultan.class11938;
import Nursultan.class12010;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00624;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08052;
import minecraft.class08092;

@class11080(L="AutoDripstone", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoDripstone
extends class11067 {
    public Object L_0;
    public Object L_1;
    public boolean L_init;

    private void P() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = 0;
        }
    }

    public AutoDripstone() {
        this.P();
    }

    public boolean i() {
        if ((class04453)((class06202)this.y_0).T_4 != null) {
            class11322.i();
        }
        return super.i();
    }

    private class10916 s() {
        ArrayList<class10916> arrayList = new ArrayList<class10916>();
        for (class07209 class072092 : class07209.method_62671((class00734)((class04453)((class06202)this.y_0).T_4).method_5829().M(((class04453)((class06202)this.y_0).T_4).method_55754()))) {
            class00624 class006242;
            class00500 class005002 = ((class03448)((class06202)this.y_0).T_3).method_8320(class072092);
            class00891 class008912 = class005002.i();
            if (!(class008912 instanceof class00624) || !this.N(class072092, class005002, class006242 = (class00624)class008912)) continue;
            arrayList.add(new class10916(class005002, class005002.R((class07290)((class03448)((class06202)this.y_0).T_3), class072092).method_1096((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260()), class072092.method_10062(), ((Boolean)class005002.L((class08092)class00624.y)).booleanValue()));
        }
        class06889 class068892 = ((class04453)((class06202)this.y_0).T_4).method_33571();
        return arrayList.stream().min(Comparator.comparingDouble(class109162 -> class068892.M(class109162.L().method_46558()))).orElse(null);
    }

    private void j() {
        if (this.N(((class04453)((class06202)this.y_0).T_4).method_6047())) {
            return;
        }
        class11281.N((int)class11281.R((class06581)class06570.wC)).ifPresent(class11322::u);
    }

    private boolean N(class07209 class072092, class00500 class005002, class00624 class006242) {
        if (!((class11066)class006242).am_().L()) {
            return false;
        }
        if (class005002.L((class08092)class00624.L) != class08052.field_12617) {
            return false;
        }
        for (int i = 1; i <= 2; ++i) {
            class00500 class005003 = ((class03448)((class06202)this.y_0).T_3).method_8320(class072092.method_10087(i));
            if (class005003.P() || class005003.i() == class00869.vp) continue;
            return false;
        }
        return true;
    }

    private void N(class10916 class109162) {
        this.P();
        class06889 class068892 = ((class04453)((class06202)this.y_0).T_4).method_33571();
        class06889 class068893 = class109162.N().method_33661(((class04453)((class06202)this.y_0).T_4).method_33571()).orElse(class068892);
        class11499 class114992 = class11505.N().N(class11505.N((class11499)class11505.N(), (class06889)class068893)).u(true).N(true);
        class06889 class068894 = class114992.U().L(((class04453)((class06202)this.y_0).T_4).method_55754()).i(class068892);
        class06183 class061832 = class109162.y().R((class07290)((class03448)((class06202)this.y_0).T_3), class109162.L()).method_1092(class068892, class068894, class109162.L());
        if (class061832 == null || class061832.N() == class07113.field_1333) {
            return;
        }
        class11534.y((class11499)class114992);
        class11907.N((class07050)class07050.field_5808, (class06183)class061832);
        this.L_0 = false;
    }

    private boolean N(class06584 class065842) {
        return class065842.N(class06570.wC);
    }

    public boolean N(class06584 class065842, class06183 class061832, class07050 class070502) {
        class06581 class065812 = class065842.B();
        if (class065812 instanceof class06918) {
            class06918 class069182 = (class06918)class065812;
            class065812 = new class06942((class07299)((class03448)((class06202)this.y_0).T_3), (class08036)((class04453)((class06202)this.y_0).T_4), class070502, class065842, class061832);
            if (!class065812.N()) {
                return false;
            }
            if (((class03448)((class06202)this.y_0).T_3).method_31606(class065812.method_8037())) {
                return false;
            }
            return ((class12010)class069182).N((class06942)class065812) != null;
        }
        return false;
    }

    @class11782
    public void N(class10992 class109922) {
        this.P();
        class10916 class109162 = this.s();
        if (class109162 == null) {
            return;
        }
        this.j();
        if (class109162.u()) {
            this.N(class109162);
            return;
        }
        if (((class03448)((class06202)this.y_0).T_3).method_8320(class109162.L().method_10074()).i() != class00869.vp) {
            if ((Integer)this.L_1 + 5 > class11938.j().y()) {
                return;
            }
            for (class07050 class070502 : class07050.values()) {
                if (!this.N(((class04453)((class06202)this.y_0).T_4).method_5998(class070502))) continue;
                this.N(class109162, class070502);
                break;
            }
            return;
        }
        this.N(class109162);
    }

    private void N(class10916 class109162, class07050 class070502) {
        this.P();
        class06889 class068892 = ((class04453)((class06202)this.y_0).T_4).method_33571();
        for (class07211 class072112 : List.of(class07211.field_11043, class07211.field_11034, class07211.field_11039, class07211.field_11035, class07211.field_11036)) {
            class07209 class072092 = class109162.L().method_10074();
            class07209 class072093 = class072092.method_10093(class072112);
            class00494 class004942 = ((class03448)((class06202)this.y_0).T_3).method_8320(class072093).R((class07290)((class03448)((class06202)this.y_0).T_3), class072093);
            if (class004942.method_1110()) continue;
            class06889 class068893 = class072092.method_46558();
            class06889 class068894 = class004942.method_1096((double)class072093.method_10263(), (double)class072093.method_10264(), (double)class072093.method_10260()).method_33661(class068893).orElse(class068893);
            class11499 class114992 = class11505.N().N(class11505.N((class11499)class11505.N(), (class06889)class068894)).u(true).N(true);
            class06889 class068895 = class114992.U().L(((class04453)((class06202)this.y_0).T_4).method_55754()).i(class068892);
            class06183 class061832 = class004942.method_1092(class068892, class068895, class072093);
            if (class061832 == null || class061832.N() == class07113.field_1333 || class061832.i() != class072112.b() || !this.N(((class04453)((class06202)this.y_0).T_4).method_5998(class070502), class061832, class070502)) continue;
            if (!((class04453)((class06202)this.y_0).T_4).method_5715()) {
                this.L_0 = true;
                break;
            }
            class11534.y((class11499)class114992);
            class11907.N((class07050)class070502, (class06183)class061832);
            this.L_1 = class11938.j().y();
            break;
        }
    }

    @class11782
    public void N(class11385 class113852) {
        this.P();
        if ((Boolean)this.L_0 == null) {
            return;
        }
        class113852.y(((Boolean)this.L_0).booleanValue());
        if (((Boolean)this.L_0).booleanValue() && ((class04453)((class06202)this.y_0).T_4).method_31549().y) {
            class113852.i(true);
        }
        this.L_0 = null;
    }
}

