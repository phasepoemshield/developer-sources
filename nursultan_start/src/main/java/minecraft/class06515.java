/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00751
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class02055
 *  minecraft.class02191
 *  minecraft.class02197
 *  minecraft.class02484
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04770
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04983
 *  minecraft.class06501
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import java.util.List;
import minecraft.class00500;
import minecraft.class00751;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class02055;
import minecraft.class02191;
import minecraft.class02197;
import minecraft.class02484;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04770;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04983;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;

public class class06515
extends class06581 {
    public class06515(class06573 class065732) {
        super(class065732);
    }

    @Override
    public class07082 N(class06501 class065012) {
        class04983 class049832;
        class07209 class072092;
        class07299 class072992 = class065012.method_8045();
        class00500 class005002 = class072992.method_8320(class072092 = class065012.method_8037());
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class04983 && !(class049832 = (class04983)class008912).b(class005002)) {
            class08036 class080362 = class065012.method_8036();
            class06584 class065842 = class065012.method_8041();
            if (class080362 instanceof class04770) {
                class06912.X.N((class04770)class080362, class072092, class065842);
            }
            class072992.method_8396((class07049)class080362, class072092, class04909.mR, class04911.field_15245, 1.0f, 1.0f);
            class00500 class005003 = class049832.T(class005002);
            class072992.method_8501(class072092, class005003);
            class072992.N((class03556)class01194.L, class072092, class01164.N((class07049)class065012.method_8036(), (class00500)class005003));
            if (class080362 != null) {
                class065842.N(1, (class07438)class080362, class065012.method_20287().N());
            }
            return class07082.N;
        }
        return super.N(class065012);
    }

    @Override
    public boolean N(class06584 class065842, class07299 class072992, class00500 class005002, class07209 class072092, class07438 class074382) {
        class02197 class021972 = (class02197)class065842.method_58694(class02484.O);
        if (class021972 == null) {
            return false;
        }
        if (!class072992.method_8608() && !class005002.N(class01210.Nh) && class021972.L() > 0) {
            class065842.N(class021972.L(), class074382, class07085.field_6173);
        }
        return true;
    }

    public static class02197 N() {
        class02055 class020552 = class04206.N((class00751)class04206.i);
        return new class02197(List.of(class02191.N((class03543)class03543.N((class03556[])new class03556[]{class00869.yw.s()}), (float)15.0f), class02191.y((class03543)class020552.y(class01210.H), (float)15.0f), class02191.y((class03543)class020552.y(class01210.N), (float)5.0f), class02191.y((class03543)class03543.N((class03556[])new class03556[]{class00869.Rc.s(), class00869.RX.s()}), (float)2.0f)), 1.0f, 1, true);
    }
}

