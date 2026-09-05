/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00864
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06273
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08400
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00864;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06273;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08400;

public class class05253
extends class00864
implements class00873 {
    public static final MapCodec<class05253> N = class05253.y(class05253::new);
    private static final float u = 0.003f;
    public static final int y = 3;
    public static final class08071 L = class06665.NG;
    private static final class00494 i = class00891.y((double)10.0, (double)0.0, (double)8.0);
    private static final class00494 R = class00891.y((double)14.0, (double)0.0, (double)16.0);

    public class05253(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(0)));
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        int n = (Integer)class005002.L((class08092)L);
        if (n < 3 && class060692.y(5) == 0 && class047822.method_22335(class072092.method_10084(), 0) >= 9) {
            class00500 class005003 = (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n + 1));
            class047822.method_8652(class072092, class005003, 2);
            class047822.N((class03556)class01194.L, class072092, class01164.N((class00500)class005003));
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return (Integer)class005002.L((class08092)L) < 3;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        int n = Math.min(3, (Integer)class005002.L((class08092)L) + 1);
        class047822.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n)), 2);
    }

    public MapCodec<class05253> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return switch ((Integer)class005002.L((class08092)L)) {
            case 0 -> i;
            case 3 -> class00389.y();
            default -> R;
        };
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)class06570.wN);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        class06889 class068892;
        class04782 class047822;
        block7: {
            block6: {
                if (!(class070492 instanceof class07438) || class070492.method_5864() == class07078.Ni || class070492.method_5864() == class07078.m) {
                    return;
                }
                class070492.method_5844(class005002, new class06889((double)0.8f, 0.75, (double)0.8f));
                if (!(class072992 instanceof class04782)) break block6;
                class047822 = (class04782)class072992;
                if ((Integer)class005002.L((class08092)L) != 0) break block7;
            }
            return;
        }
        class06889 class068893 = class068892 = class070492.method_65038() ? class070492.method_60478() : class070492.method_61411().u(class070492.method_73189());
        if (class068892.z() > 0.0) {
            double d = Math.abs(class068892.N());
            double d2 = Math.abs(class068892.L());
            if (d >= (double)0.003f || d2 >= (double)0.003f) {
                class070492.method_64397(class047822, class072992.method_48963().n(), 1.0f);
            }
        }
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        if (!((Integer)class005002.L((class08092)L) == 3) && class065842.N(class06570.vQ)) {
            return class07082.i;
        }
        return super.N(class065842, class005002, class072992, class072092, class080362, class070502, class061832);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if ((Integer)class005002.L((class08092)L) > 1) {
            if (class072992 instanceof class04782) {
                class04782 class047823 = (class04782)class072992;
                class00891.N((class04782)class047823, (class05946)class06273.NH, (class00500)class005002, (class00394)class072992.method_8321(class072092), null, (class07049)class080362, (class047822, class065842) -> class00891.N_21((class07299)class047822, (class07209)class072092, (class06584)class065842));
                class047823.method_8396(null, class072092, class04909.QV, class04911.field_15245, 1.0f, 0.8f + class047823.field_9229.z() * 0.4f);
                class00500 class005003 = (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(1));
                class047823.method_8652(class072092, class005003, 2);
                class047823.N((class03556)class01194.L, class072092, class01164.N((class07049)class080362, (class00500)class005003));
            }
            return class07082.N;
        }
        return super.N(class005002, class072992, class072092, class080362, class061832);
    }

    protected boolean e_(class00500 class005002) {
        return (Integer)class005002.L((class08092)L) < 3;
    }
}

