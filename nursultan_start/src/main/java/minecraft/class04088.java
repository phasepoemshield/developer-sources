/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06113
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08400
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04096;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06113;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08400;
import minecraft.class08713;

public class class04088
extends class00891 {
    public static final MapCodec<class04088> N = class04088.y(class04088::new);
    private static final int y = 2;
    private static final int L = 5;
    private static final int u = 3600;
    private static final int i = 12000;
    private static final class00494 R = class00891.y((double)16.0, (double)0.0, (double)1.5);
    private static int M = 3600;
    private static int B = 12000;

    public class04088(class01362 class013622) {
        super(class013622);
    }

    private double y(class06069 class060692) {
        double d = 0.2f;
        return class04995.N((double)class060692.U(), (double)0.2f, (double)0.7999999970197678);
    }

    private void y(class04782 class047822, class07209 class072092, class06069 class060692) {
        int n = class060692.y(2, 6);
        for (int i = 1; i <= n; ++i) {
            class04096 class040962 = (class04096)class07078.yQ.N((class07299)class047822, class06113.field_16466);
            if (class040962 == null) continue;
            double d = (double)class072092.method_10263() + this.y(class060692);
            double d2 = (double)class072092.method_10260() + this.y(class060692);
            int n2 = class060692.y(1, 361);
            class040962.method_5808(d, (double)class072092.method_10264() - 0.5, d2, n2, 0.0f);
            class040962.NW();
            class047822.method_8649((class07049)class040962);
        }
    }

    public static void y() {
        M = 3600;
        B = 12000;
    }

    private void N(class07299 class072992, class07209 class072092) {
        class072992.N(class072092, false);
    }

    private void N(class04782 class047822, class07209 class072092, class06069 class060692) {
        this.N((class07299)class047822, class072092);
        class047822.method_8396(null, class072092, class04909.EG, class04911.field_15245, 1.0f, 1.0f);
        this.y(class047822, class072092, class060692);
    }

    private static boolean N(class07290 class072902, class07209 class072092) {
        class04688 class046882 = class072902.method_8316(class072092);
        class04688 class046883 = class072902.method_8316(class072092.method_10084());
        return class046882.N() == class04684.L && class046883.N() == class04684.N;
    }

    public MapCodec<class04088> N() {
        return N;
    }

    public static void N(int n, int n2) {
        M = n;
        B = n2;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return R;
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        class072992.N(class072092, (class00891)this, class04088.N(class072992.method_8409()));
    }

    private static int N(class06069 class060692) {
        return class060692.y(M, B);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (class070492.method_5864().equals(class07078.Ny)) {
            this.N(class072992, class072092);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!this.a_(class005002, (class05487)class047822, class072092)) {
            this.N((class07299)class047822, class072092);
            return;
        }
        this.N(class047822, class072092, class060692);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!this.a_(class005002, class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class04088.N((class07290)class054872, class072092.method_10074());
    }
}

