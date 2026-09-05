/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10967
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11322
 *  Nursultan.class11328
 *  Nursultan.class11368
 *  Nursultan.class11388
 *  Nursultan.class11400
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11679
 *  Nursultan.class11687
 *  Nursultan.class11703
 *  Nursultan.class11782
 *  Nursultan.class11807
 *  Nursultan.class11849
 *  Nursultan.class11857
 *  Nursultan.class11868
 *  Nursultan.class11869
 *  Nursultan.class11929
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00381
 *  minecraft.class01683
 *  minecraft.class02484
 *  minecraft.class03448
 *  minecraft.class04227
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07356
 *  minecraft.class07364
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.class10967;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11322;
import Nursultan.class11328;
import Nursultan.class11368;
import Nursultan.class11388;
import Nursultan.class11400;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11679;
import Nursultan.class11687;
import Nursultan.class11703;
import Nursultan.class11782;
import Nursultan.class11807;
import Nursultan.class11849;
import Nursultan.class11857;
import Nursultan.class11868;
import Nursultan.class11869;
import Nursultan.class11929;
import Nursultan.class11938;
import Nursultan.class12002;
import com.mojang.serialization.Lifecycle;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class00381;
import minecraft.class01683;
import minecraft.class02484;
import minecraft.class03448;
import minecraft.class04227;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07356;
import minecraft.class07364;
import minecraft.class07510;

@class11080(L="AutoSwap", y=class11072.COMBAT, N=class11106.BASE)
public class AutoSwap
extends class11067 {
    public Object L_0;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object R_0;
    public Object R_1;
    public Object R_2;
    public Object R_3;
    public Object R_4;
    public Object R_5;
    public Object R_6;
    public Object R_7;

    private void L(int n) {
        this.s();
        if (class11281.u((int)n) && class11938.j().y() - (Integer)this.L_0 > 15) {
            class11322.N((int)n);
            ((class01683)((class04453)((class06202)this.y_0).T_4).y_0).M().method_10743((class00381)new class07364(class07356.field_12969, class07209.field_10980, class07211.field_11033));
            class11322.L();
            this.L_0 = class11938.j().y();
            return;
        }
        class11938.m().N(0, class11281.L((int)n), 40, class07510.field_7791).y();
    }

    public AutoSwap() {
        this.s();
        this.u_0 = class11524.N((class11512)this, (String)"swap-key", (class12002)class12002.UNKNOWN);
        this.u_1 = new class11703(this, "multi", false);
        this.i_0 = class11524.N((class11512)this, (String)"mode", (class11535[])new class11807[]{new class11687(this, "default", true), (class11703)this.u_1});
        this.i_1 = () -> new class11679("shield", true, class11328.N((class06581)class06570.lo));
        this.i_2 = () -> new class11679("g-apples", false, class11328.N((class06581)class06570.bV));
        this.R_0 = () -> new class11679("any-food", false, class11929::U);
        this.R_1 = () -> new class11679("totem", false, class11328.N((class06581)class06570.la));
        this.R_2 = () -> new class11679("fireworks", false, class11328.N((class06581)class06570.GJ));
        this.R_3 = () -> new class11679("sunrise-runes", false, class065842 -> (class065842.B() == class06570.Go || class065842.B() == class06570.lG) && class065842.I());
        this.R_4 = () -> new class11679("sphere", false, class065842 -> class065842.B() == class06570.Gw && (class065842.y().N(class02484.b) || class11929.N((class06584)class065842, (String)"sphereEffect")));
        this.R_5 = (class11517)class11524.N((class11512)this, (String)"first-item", (class11535[])new class11679[]{(class11679)((Supplier)this.i_1).get(), (class11679)((Supplier)this.R_1).get(), (class11679)((Supplier)this.R_2).get(), (class11679)((Supplier)this.R_0).get(), (class11679)((Supplier)this.i_2).get(), (class11679)((Supplier)this.R_4).get(), (class11679)((Supplier)this.R_3).get()}).N((T class115362) -> {
            this.s();
            return !((class11703)this.u_1).U();
        });
        this.R_6 = (class11517)class11524.N((class11512)this, (String)"second-item", (class11535[])new class11679[]{(class11679)((Supplier)this.i_1).get(), (class11679)((Supplier)this.R_1).get(), (class11679)((Supplier)this.R_2).get(), (class11679)((Supplier)this.R_0).get(), (class11679)((Supplier)this.i_2).get(), (class11679)((Supplier)this.R_4).get(), (class11679)((Supplier)this.R_3).get()}).N((T class115362) -> {
            this.s();
            return !((class11703)this.u_1).U();
        });
        this.R_7 = class11524.N((class11512)this, (String)"log-swapped-item", (boolean)false);
        class11938.Z().N(class062022 -> (class03448)class062022.T_3 != null && ((class03448)class062022.T_3).method_30349().method_46759(class04227.yR).map(class007512 -> class007512.R().equals(Lifecycle.experimental())).orElse(false) != false, () -> ((class11703)((class11703)this.u_1)).N());
    }

    private void s() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0;
        }
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        this.s();
        ((class11807)((class11517)this.i_0).i()).y((Object)class114002);
    }

    @class11782
    public void N(class11368 class113682) {
        this.s();
        ((class11807)((class11517)this.i_0).i()).y((Object)class113682);
    }

    @class11782
    public void N(class10967 class109672) {
        this.s();
        ((class11807)((class11517)this.i_0).i()).y((Object)class109672);
    }

    public boolean N(Function<Stream<class11297>, Integer> function) {
        this.s();
        int n = function.apply(class11281.L(class065842 -> !class065842.R()));
        if (class11281.y((int)n)) {
            return false;
        }
        if (((Boolean)((class11507)this.R_7).i()).booleanValue()) {
            class06584 class065843 = (class06584)((class04453)((class06202)this.y_0).T_4).method_31548().u().get(n);
            class11938.g().i().y().N((class11849)new class11869(class065843.t())).N((class11868)new class11857(class065843.Y().L().getString())).N(1500L).N();
        }
        this.L(n);
        return true;
    }

    @class11782
    public void N(class11388 class113882) {
        this.s();
        ((class11807)((class11517)this.i_0).i()).y((Object)class113882);
    }
}

