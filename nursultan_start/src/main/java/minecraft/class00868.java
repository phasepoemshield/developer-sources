/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05440
 *  minecraft.class05467
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05440;
import minecraft.class05467;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;

public class class00868
extends class00891 {
    public static final MapCodec<class00868> N = class00868.y(class00868::new);
    public static final int y = 6;
    public static final class08071 L = class06665.NQ;
    public static final int u = class00868.y(0);
    private static final class00494[] i = class00891.N(6, (int n) -> class00891.N(1 + n * 2, 0.0, 1.0, 15.0, 8.0, 15.0));

    public class00868(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(0)));
    }

    public static int y(int n) {
        return (7 - n) * 2;
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return class00868.y((Integer)class005002.L((class08092)L));
    }

    @Override
    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return i[(Integer)class005002.L((class08092)L)];
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        class00891 class008912;
        class06581 class065812 = class065842.B();
        if (!class065842.N(class01226.C) || (Integer)class005002.L((class08092)L) != 0 || !((class008912 = class00891.N(class065812)) instanceof class05440)) {
            return class07082.R;
        }
        class05440 class054402 = (class05440)class008912;
        class065842.N(1, (class07438)class080362);
        class072992.method_8396(null, class072092, class04909.uo, class04911.field_15245, 1.0f, 1.0f);
        class072992.method_8501(class072092, class05467.N((class05440)class054402));
        class072992.N((class07049)class080362, (class03556)class01194.L, class072092);
        class080362.method_7259(class01235.L.y((Object)class065812));
        return class07082.N;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (class072992.method_8608()) {
            if (class00868.N((class07284)class072992, class072092, class005002, class080362).N()) {
                return class07082.N;
            }
            if (class080362.method_5998(class07050.field_5808).R()) {
                return class07082.L;
            }
        }
        return class00868.N((class07284)class072992, class072092, class005002, class080362);
    }

    public MapCodec<class00868> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033 && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected static class07082 N(class07284 class072842, class07209 class072092, class00500 class005002, class08036 class080362) {
        if (!class080362.method_7332(false)) {
            return class07082.i;
        }
        class080362.method_7281(class01235.x);
        class080362.method_7344().N(2, 0.1f);
        int n = (Integer)class005002.L((class08092)L);
        class072842.N((class07049)class080362, (class03556)class01194.W, class072092);
        if (n < 6) {
            class072842.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n + 1)), 3);
        } else {
            class072842.method_8650(class072092, false);
            class072842.N((class07049)class080362, (class03556)class01194.R, class072092);
        }
        return class07082.N;
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class054872.method_8320(class072092.method_10074()).B();
    }
}

