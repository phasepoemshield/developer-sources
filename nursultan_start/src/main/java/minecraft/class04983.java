/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06665
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04782;
import minecraft.class04985;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06665;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;

public abstract class class04983
extends class04985
implements class00873 {
    public static final class08071 i = class06665.NY;
    public static final int R = 25;
    private final double N;

    @Override
    protected class04983 L() {
        return this;
    }

    public class00500 T(class00500 class005002) {
        return (class00500)class005002.y((class08092)i, (Comparable)Integer.valueOf(25));
    }

    public class04983(class01362 class013622, class07211 class072112, class00494 class004942, boolean bl, double d) {
        super(class013622, class072112, class004942, bl);
        this.N = d;
        this.P((class00500)((class00500)this.Q.y()).y((class08092)i, (Comparable)Integer.valueOf(0)));
    }

    public boolean b(class00500 class005002) {
        return (Integer)class005002.L((class08092)i) == 25;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class07209 class072093;
        if ((Integer)class005002.L((class08092)i) < 25 && class060692.U() < this.N && this.E(class047822.method_8320(class072093 = class072092.method_10093(this.y)))) {
            class047822.method_8501(class072093, this.N(class005002, class047822.field_9229));
        }
    }

    @Override
    public class00500 y(class06069 class060692) {
        return (class00500)this.W().y((class08092)i, (Comparable)Integer.valueOf(class060692.y(25)));
    }

    protected abstract boolean E(class00500 var1);

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class07209 class072093 = class072092.method_10093(this.y);
        int n = Math.min((Integer)class005002.L((class08092)i) + 1, 25);
        int n2 = this.N(class060692);
        for (int i = 0; i < n2 && this.E(class047822.method_8320(class072093)); ++i) {
            class047822.method_8501(class072093, (class00500)class005002.y((class08092)class04983.i, (Comparable)Integer.valueOf(n)));
            class072093 = class072093.method_10093(this.y);
            n = Math.min(n + 1, 25);
        }
    }

    protected abstract int N(class06069 var1);

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == this.y.b()) {
            if (!class005002.N(class054872, class072092)) {
                class087132.N(class072092, (class00891)this, 1);
            } else {
                class00500 class005004 = class054872.method_8320(class072092.method_10093(this.y));
                if (class005004.N((class00891)this) || class005004.N(this.u())) {
                    return this.N(class005002, this.u().W());
                }
            }
        }
        if (class072112 == this.y && (class005003.N((class00891)this) || class005003.N(this.u()))) {
            return this.N(class005002, this.u().W());
        }
        if (this.L) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected abstract MapCodec<? extends class04983> N();

    public class00500 N(class00500 class005002, class06069 class060692) {
        return (class00500)class005002.N((class08092)i);
    }

    protected class00500 N(class00500 class005002, class00500 class005003) {
        return class005003;
    }

    public void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{i});
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return this.E(class054872.method_8320(class072092.method_10093(this.y)));
    }

    protected boolean e_(class00500 class005002) {
        return (Integer)class005002.L((class08092)i) < 25;
    }
}

