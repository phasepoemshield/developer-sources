/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class01964
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06113
 *  minecraft.class06665
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08791
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class01964;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06113;
import minecraft.class06665;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08791;

public class class03561
extends class00891 {
    public static final MapCodec<class03561> N = class03561.y(class03561::new);
    public static final int y = 2;
    public static final class08071 L = class06665.Nq;
    private static final int u = 24000;
    private static final int i = 12000;
    private static final int R = 300;
    private static final class00494 M = class00891.N((double)14.0, (double)12.0, (double)0.0, (double)16.0);

    private boolean T(class00500 class005002) {
        return this.U(class005002) == 2;
    }

    public class03561(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(0)));
    }

    public int U(class00500 class005002) {
        return (Integer)class005002.L((class08092)L);
    }

    public void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        boolean bl2 = class03561.N((class07290)class072992, class072092);
        if (!class072992.method_8608() && bl2) {
            class072992.N(3009, class072092, 0);
        }
        int n = (bl2 ? 12000 : 24000) / 3;
        class072992.N((class03556)class01194.Z, class072092, class01164.N((class00500)class005002));
        class072992.N(class072092, (class00891)this, n + class072992.field_9229.y(300));
    }

    public boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public static boolean N(class07290 class072902, class07209 class072092) {
        return class072902.method_8320(class072092.method_10074()).N(class01210.LV);
    }

    public MapCodec<class03561> N() {
        return N;
    }

    public void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!this.T(class005002)) {
            class047822.method_8396(null, class072092, class04909.Yp, class04911.field_15245, 0.7f, 0.9f + class060692.z() * 0.2f);
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(this.U(class005002) + 1)), 2);
            return;
        }
        class047822.method_8396(null, class072092, class04909.YF, class04911.field_15245, 0.7f, 0.9f + class060692.z() * 0.2f);
        class047822.N(class072092, false);
        class01964 class019642 = (class01964)class07078.yb.N((class07299)class047822, class06113.field_16466);
        if (class019642 != null) {
            class06889 class068892 = class072092.method_46558();
            class019642.y(true);
            class019642.method_5808(class068892.N(), class068892.y(), class068892.L(), class04995.R((float)(class047822.field_9229.z() * 360.0f)), 0.0f);
            class047822.method_8649((class07049)class019642);
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    public class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return M;
    }
}

