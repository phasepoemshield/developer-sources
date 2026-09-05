/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;

public class class07710
extends class00891 {
    public static final MapCodec<class07710> N = class07710.y(class07710::new);
    public static final class08071 y = class06665.Nk;
    private static final class00494 L = class00891.y((double)12.0, (double)0.0, (double)16.0);

    public class07710(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Integer.valueOf(0)));
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class047822.R(class072092.method_10084())) {
            int n = 1;
            while (class047822.method_8320(class072092.method_10087(n)).N((class00891)this)) {
                ++n;
            }
            if (n < 3) {
                int n2 = (Integer)class005002.L((class08092)y);
                if (n2 == 15) {
                    class047822.method_8501(class072092.method_10084(), this.W());
                    class047822.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(0)), 260);
                } else {
                    class047822.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(n2 + 1)), 260);
                }
            }
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    public MapCodec<class07710> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!class005002.N(class054872, class072092)) {
            class087132.N(class072092, (class00891)this, 1);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return L;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class005002.N((class05487)class047822, class072092)) {
            class047822.N(class072092, true);
        }
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class00500 class005003 = class054872.method_8320(class072092.method_10074());
        if (class005003.N((class00891)this)) {
            return true;
        }
        if (class005003.N(class01210.Ni) || class005003.N(class01210.I)) {
            class07209 class072093 = class072092.method_10074();
            for (class07211 class072112 : class07221.field_11062) {
                class00500 class005004 = class054872.method_8320(class072093.method_10093(class072112));
                if (!class054872.method_8316(class072093.method_10093(class072112)).N(class01231.N) && !class005004.N(class00869.Eg)) continue;
                return true;
            }
        }
        return false;
    }
}

