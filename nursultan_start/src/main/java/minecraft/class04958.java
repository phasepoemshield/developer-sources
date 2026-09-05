/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06665
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08005
 *  minecraft.class08007
 *  minecraft.class08071
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06665;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08005;
import minecraft.class08007;
import minecraft.class08071;
import minecraft.class08092;

public class class04958
extends class00891 {
    public static final MapCodec<class04958> N = class04958.y(class04958::new);
    private static final class08071 y = class06665.ND;
    private static final int L = 20;
    private static final int u = 8;

    public class04958(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Integer.valueOf(0)));
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return (Integer)class005002.L((class08092)y);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if ((Integer)class005002.L((class08092)y) != 0) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(0)), 3);
        }
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class072992.method_8608() || class005002.N(class005003.i())) {
            return;
        }
        if ((Integer)class005002.L((class08092)y) > 0 && !class072992.method_8397().N(class072092, (Object)this)) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(0)), 18);
        }
    }

    public MapCodec<class04958> N() {
        return N;
    }

    protected void N(class07299 class072992, class00500 class005002, class06183 class061832, class08005 class080052) {
        int n = class04958.N((class07284)class072992, class005002, class061832, (class07049)class080052);
        class07049 class070492 = class080052.z();
        if (class070492 instanceof class04770) {
            class04770 class047702 = (class04770)class070492;
            class047702.method_7281(class01235.NJ);
            class06912.c.N(class047702, (class07049)class080052, class061832.y(), n);
        }
    }

    private static int N(class07284 class072842, class00500 class005002, class06183 class061832, class07049 class070492) {
        int n;
        int n2 = class04958.N(class061832, class061832.y());
        int n3 = n = class070492 instanceof class08007 ? 20 : 8;
        if (!class072842.method_8397().N(class061832.u(), (Object)class005002.i())) {
            class04958.N(class072842, class005002, n2, class061832.u(), n);
        }
        return n2;
    }

    private static int N(class06183 class061832, class06889 class068892) {
        class07211 class072112 = class061832.i();
        double d = Math.abs(class04995.R(class068892.M) - 0.5);
        double d2 = Math.abs(class04995.R(class068892.B) - 0.5);
        double d3 = Math.abs(class04995.R(class068892.Z) - 0.5);
        class07185 class071852 = class072112.z();
        double d4 = class071852 == class07185.field_11052 ? Math.max(d, d3) : (class071852 == class07185.field_11051 ? Math.max(d, d2) : Math.max(d2, d3));
        return Math.max(1, class04995.L(15.0 * class04995.N((0.5 - d4) / 0.5, 0.0, 1.0)));
    }

    private static void N(class07284 class072842, class00500 class005002, int n, class07209 class072092, int n2) {
        class072842.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(n)), 3);
        class072842.N(class072092, class005002.i(), n2);
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

