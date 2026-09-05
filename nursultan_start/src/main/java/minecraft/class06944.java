/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class02615
 *  minecraft.class03556
 *  minecraft.class03557
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06501
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07774
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class02615;
import minecraft.class03556;
import minecraft.class03557;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07774;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class06944
extends class06581 {
    public static final int N = 3;
    public static final int y = 1;
    public static final int L = 3;

    public class06944(class06573 class065732) {
        super(class065732);
    }

    public static void N(class07284 class072842, class07209 class072092, int n) {
        class00500 class005002 = class072842.method_8320(class072092);
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class00873) {
            class00873 class008732 = (class00873)class008912;
            class008912 = class008732.N(class072092);
            switch (class008732.ay_()) {
                case field_47834: {
                    class02615.N((class07284)class072842, (class07209)class008912, (int)(n * 3), (double)3.0, (double)1.0, (boolean)false, (class07126)class07107.F);
                    break;
                }
                case field_47835: {
                    class02615.N((class07284)class072842, (class07209)class008912, (int)n, (class07126)class07107.F);
                }
            }
        } else if (class005002.N(class00869.K)) {
            class02615.N((class07284)class072842, (class07209)class072092, (int)(n * 3), (double)3.0, (double)1.0, (boolean)false, (class07126)class07107.F);
        }
    }

    public class07082 N(class06501 class065012) {
        class07299 class072992 = class065012.method_8045();
        class07209 class072092 = class065012.method_8037();
        class07209 class072093 = class072092.method_10093(class065012.method_8038());
        class06584 class065842 = class065012.method_8041();
        if (class06944.N(class065842, class072992, class072092)) {
            if (!class072992.method_8608()) {
                class065842.N((class07049)class065012.method_8036(), class01194.Q);
                class072992.N(1505, class072092, 15);
            }
            return class07082.N;
        }
        if (class072992.method_8320(class072092).L((class07290)class072992, class072092, class065012.method_8038()) && class06944.N(class065842, class072992, class072093, class065012.method_8038())) {
            if (!class072992.method_8608()) {
                class065842.N((class07049)class065012.method_8036(), class01194.Q);
                class072992.N(1505, class072093, 15);
            }
            return class07082.N;
        }
        return class07082.i;
    }

    public static boolean N(class06584 class065842, class07299 class072992, class07209 class072092, @Nullable class07211 class072112) {
        if (!class072992.method_8320(class072092).N(class00869.K) || class072992.method_8316(class072092).R() != 8) {
            return false;
        }
        if (!(class072992 instanceof class04782)) {
            return true;
        }
        class06069 class060692 = class072992.method_8409();
        block0: for (int i = 0; i < 128; ++i) {
            class07209 class072093 = class072092;
            class00500 class005002 = class00869.yJ.W();
            for (int j = 0; j < i / 16; ++j) {
                if (class072992.method_8320(class072093 = class072093.method_10069(class060692.y(3) - 1, (class060692.y(3) - 1) * class060692.y(3) / 2, class060692.y(3) - 1)).W((class07290)class072992, class072093)) continue block0;
            }
            class03556 var8 = class072992.i(class072093);
            if (var8.N(class03557.NN)) {
                if (i == 0 && class072112 != null && class072112.z().L()) {
                    class005002 = class04206.i.N(class01210.No, class072992.field_9229).map(class035562 -> ((class00891)class035562.N()).W()).orElse(class005002);
                    if (class005002.y((class08092)class07774.L)) {
                        class005002 = (class00500)class005002.y((class08092)class07774.L, (Comparable)class072112);
                    }
                } else if (class060692.y(4) == 0) {
                    class005002 = class04206.i.N(class01210.NI, class072992.field_9229).map(class035562 -> ((class00891)class035562.N()).W()).orElse(class005002);
                }
            }
            if (class005002.N(class01210.No, class013392 -> class013392.y((class08092)class07774.L))) {
                for (int j = 0; !class005002.N((class05487)class072992, class072093) && j < 4; ++j) {
                    class005002 = (class00500)class005002.y((class08092)class07774.L, (Comparable)class07221.field_11062.N(class060692));
                }
            }
            if (!class005002.N((class05487)class072992, class072093)) continue;
            class00500 class005003 = class072992.method_8320(class072093);
            if (class005003.N(class00869.K) && class072992.method_8316(class072093).R() == 8) {
                class072992.method_8652(class072093, class005002, 3);
                continue;
            }
            if (!class005003.N(class00869.yJ) || !((class00873)class00869.yJ).N((class05487)class072992, class072093, class005003) || class060692.y(10) != 0) continue;
            ((class00873)class00869.yJ).N((class04782)class072992, class060692, class072093, class005003);
        }
        class065842.B(1);
        return true;
    }

    public static boolean N(class06584 class065842, class07299 class072992, class07209 class072092) {
        class00873 class008732;
        class00500 class005002 = class072992.method_8320(class072092);
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class00873 && (class008732 = (class00873)class008912).N((class05487)class072992, class072092, class005002)) {
            if (class072992 instanceof class04782) {
                if (class008732.N(class072992, class072992.field_9229, class072092, class005002)) {
                    class008732.N((class04782)class072992, class072992.field_9229, class072092, class005002);
                }
                class065842.B(1);
            }
            return true;
        }
        return false;
    }
}

