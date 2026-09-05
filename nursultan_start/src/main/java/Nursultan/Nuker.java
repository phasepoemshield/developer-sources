/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09378
 *  Nursultan.class10626
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11303
 *  Nursultan.class11364
 *  Nursultan.class11397
 *  Nursultan.class11494
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11525
 *  Nursultan.class11534
 *  Nursultan.class11782
 *  Nursultan.class11892
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  baritone.api.BaritoneAPI
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05630
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 */
package Nursultan;

import Nursultan.class09378;
import Nursultan.class10626;
import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11303;
import Nursultan.class11364;
import Nursultan.class11397;
import Nursultan.class11494;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11525;
import Nursultan.class11534;
import Nursultan.class11782;
import Nursultan.class11892;
import Nursultan.class11921;
import Nursultan.class11938;
import baritone.api.BaritoneAPI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05630;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;

@class11080(L="Nuker", y=class11072.PLAYER, N=class11106.BASE)
public class Nuker
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public boolean L_init;

    public void P() {
        this.b();
        if (((Set)this.L_3).isEmpty()) {
            return;
        }
        ((Set)this.L_3).clear();
        class11938.L().L((Object)class11364.N((class09378)class09378.NUKER));
    }

    public Nuker() {
        this.b();
        this.L_0 = class11524.N((class11512)this, (String)"break-only-allowed-blocks", (boolean)false);
        this.L_1 = class11524.N((class11512)this, (String)"break-only-in-selection", (boolean)false);
        this.L_2 = class11524.N((class11512)this, (String)"height-range", (class11494)new class11494(-1.0f, 4.0f), (class11494)new class11494(0.0f, 2.0f), (float)1.0f);
        this.L_3 = new HashSet();
    }

    private void b() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_4 = false;
        }
    }

    public Set<class00891> m() {
        this.b();
        return (Set)this.L_3;
    }

    private class07209 t() {
        class07209 class0720922;
        class06183 class061832;
        this.b();
        class06889 class068892 = ((class04453)((class06202)this.y_0).T_4).method_33571();
        if (((class05630)((class06202)this.y_0).i_7).I.R() && (class061832 = class11892.N((class05862)new class05862(class068892, class11505.L().U().L(((class04453)((class06202)this.y_0).T_4).method_55754()).i(class068892), class05849.field_17559, class05835.field_1348, (class07049)((class04453)((class06202)this.y_0).T_4)))).N() != class07113.field_1333) {
            return class061832.u();
        }
        float f = 4.5f;
        class11494 class114942 = (class11494)((class11525)this.L_2).i();
        class06889 class068893 = new class06889(((class04453)((class06202)this.y_0).T_4).method_23317(), Math.ceil(((class04453)((class06202)this.y_0).T_4).method_23318()), ((class04453)((class06202)this.y_0).T_4).method_23321());
        class00734 class007342 = new class00734(class068893, class068893).L((double)f, (double)class114942.L(), (double)f).u(0.0, (double)(class114942.L() + class114942.N()), 0.0);
        HashSet<class07209> hashSet = new HashSet<class07209>();
        for (class07209 class0720922 : class07209.method_62671((class00734)class007342)) {
            if (this.N(class0720922)) continue;
            hashSet.add(class0720922.method_10062());
        }
        class07209 class072094 = class07209.method_49638((class00737)class068892);
        class0720922 = class07209.method_49638((class00737)class068893).method_10074();
        return hashSet.stream().min(Comparator.comparingDouble(class072093 -> class072093.method_10264() > class0720922.method_10264() ? 0.0 : 1.0).thenComparing(class072093 -> class072093.method_10262((class00753)class072094))).orElse(null);
    }

    private boolean y(class07209 class072092) {
        this.b();
        if (!((Boolean)((class11507)this.L_1).i()).booleanValue()) {
            return false;
        }
        return Arrays.stream(BaritoneAPI.getProvider().getBaritoneForPlayer((class04453)((class06202)this.y_0).T_4).getSelectionManager().getSelections()).noneMatch(iSelection -> iSelection.aabb().y(class072092));
    }

    public void y() {
        this.b();
        if (((Set)this.L_3).isEmpty()) {
            class11303.y((Object)class11921.N((String)"nuker.allowed-blocks-empty", (Object[])new Object[]{Character.valueOf(((Character)class10626.N_1).charValue())}).N(class06541.field_1080));
        }
        this.L_4 = false;
        this.L_5 = null;
        super.y();
    }

    public boolean y(class00891 class008912) {
        this.b();
        if (((Set)this.L_3).removeIf(class008913 -> class008913 == class008912)) {
            class11938.L().L((Object)class11364.N((class09378)class09378.NUKER));
            return true;
        }
        return false;
    }

    @class11782
    public void N(class10992 class109922) {
        this.b();
        this.L_4 = false;
        if (((class04453)((class06202)this.y_0).T_4).method_6115()) {
            return;
        }
        if (this.N((class07209)this.L_5) && (this.L_5 = this.t()) == null) {
            return;
        }
        class06889 class068892 = (class06889)((class03448)((class06202)this.y_0).T_3).method_8320((class07209)this.L_5).R((class07290)((class03448)((class06202)this.y_0).T_3), (class07209)this.L_5).method_1096((double)((class07209)this.L_5).method_10263(), (double)((class07209)this.L_5).method_10264(), (double)((class07209)this.L_5).method_10260()).method_33661(((class04453)((class06202)this.y_0).T_4).method_33571()).get();
        class11499 class114992 = class11505.N().N(class11505.N((class11499)class11505.N(), (class06889)class068892)).u(true).N(true);
        if (Math.abs(class114992.R()) == 90.0f) {
            class114992 = new class11499(((class04453)((class06202)this.y_0).T_4).method_36454(), class114992.R()).u(true).N(true);
        }
        class06889 class068893 = class114992.U().L(((class04453)((class06202)this.y_0).T_4).method_55754()).i(((class04453)((class06202)this.y_0).T_4).method_33571());
        class06183 class061832 = class11892.N((class05862)new class05862(((class04453)((class06202)this.y_0).T_4).method_33571(), class068893, class05849.field_17559, class05835.field_1348, (class07049)((class04453)((class06202)this.y_0).T_4)));
        if (class061832.N() != class07113.field_1333) {
            class11534.y((class11499)class114992);
            if (((class03443)((class06202)this.y_0).T_2).y(class061832.u(), class061832.i())) {
                this.L_4 = true;
                ((class04453)((class06202)this.y_0).T_4).method_6104(class07050.field_5808);
            }
        }
    }

    @class11782
    public void N(class11397 class113972) {
        this.b();
        if (((Boolean)this.L_4).booleanValue()) {
            class113972.N();
        }
    }

    private boolean N(class07209 class072092) {
        this.b();
        if (class072092 == null) {
            return true;
        }
        if (this.y(class072092)) {
            return true;
        }
        class00500 class005002 = ((class03448)((class06202)this.y_0).T_3).method_8320(class072092);
        if (class005002.P() || class005002.i((class07290)((class03448)((class06202)this.y_0).T_3), class072092) == -1.0f) {
            return true;
        }
        if (((class04453)((class06202)this.y_0).T_4).method_21701((class07299)((class03448)((class06202)this.y_0).T_3), class072092, ((class03443)((class06202)this.y_0).T_2).U())) {
            return true;
        }
        if (((Boolean)((class11507)this.L_0).i()).booleanValue() && !((Set)this.L_3).contains(class005002.i())) {
            return true;
        }
        class00494 class004942 = class005002.R((class07290)((class03448)((class06202)this.y_0).T_3), class072092);
        if (class004942.method_1110()) {
            return true;
        }
        Optional var4 = class004942.method_1096((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260()).method_33661(((class04453)((class06202)this.y_0).T_4).method_33571());
        return var4.isEmpty() || ((class06889)var4.get()).R(((class04453)((class06202)this.y_0).T_4).method_33571()) > ((class04453)((class06202)this.y_0).T_4).method_55754();
    }

    public boolean N(class00891 class008912) {
        this.b();
        if (((Set)this.L_3).add(class008912)) {
            class11938.L().L((Object)class11364.N((class09378)class09378.NUKER));
            return true;
        }
        return false;
    }
}

