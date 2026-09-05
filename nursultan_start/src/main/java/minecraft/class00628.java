/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00608
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07438
 *  minecraft.class07632
 *  minecraft.class07872
 *  minecraft.class08004
 *  minecraft.class08036
 *  minecraft.class08071
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00608;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07438;
import minecraft.class07632;
import minecraft.class07872;
import minecraft.class08004;
import minecraft.class08036;
import minecraft.class08071;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class00628
extends class00891 {
    public static final MapCodec<class00628> N = class00628.y(class00628::new);
    public static final class08071 y = class06665.Nq;
    public static final class08071 L = class06665.No;
    public static final int u = 2;
    public static final int i = 1;
    public static final int R = 4;
    private static final class00494 M = class00891.N((double)3.0, (double)0.0, (double)3.0, (double)12.0, (double)7.0, (double)12.0);
    private static final class00494 B = class00891.y((double)14.0, (double)0.0, (double)7.0);

    public class00628(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Integer.valueOf(0))).y((class08092)L, (Comparable)Integer.valueOf(1)));
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (this.N((class07299)class047822, class072092) && class00628.N((class07290)class047822, class072092)) {
            int n = (Integer)class005002.L((class08092)y);
            if (n < 2) {
                class047822.method_8396(null, class072092, class04909.OY, class04911.field_15245, 0.7f, 0.9f + class060692.z() * 0.2f);
                class047822.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(n + 1)), 2);
                class047822.N((class03556)class01194.L, class072092, class01164.N((class00500)class005002));
            } else {
                class047822.method_8396(null, class072092, class04909.OQ, class04911.field_15245, 0.7f, 0.9f + class060692.z() * 0.2f);
                class047822.method_8650(class072092, false);
                class047822.N((class03556)class01194.R, class072092, class01164.N((class00500)class005002));
                for (int i = 0; i < (Integer)class005002.L((class08092)L); ++i) {
                    class047822.N(2001, class072092, class00891.W((class00500)class005002));
                    class07872 class078722 = (class07872)class07078.yK.N((class07299)class047822, class06113.field_16466);
                    if (class078722 == null) continue;
                    class078722.u(-24000);
                    class078722.N(class072092);
                    class078722.method_5808((double)class072092.method_10263() + 0.3 + (double)i * 0.2, (double)class072092.method_10264(), (double)class072092.method_10260() + 0.3, 0.0f, 0.0f);
                    class047822.method_8649((class07049)class078722);
                }
            }
        }
    }

    public static boolean y(class07290 class072902, class07209 class072092) {
        return class072902.method_8320(class072092).N(class01210.I);
    }

    public void N(class07299 class072992, class08036 class080362, class07209 class072092, class00500 class005002, @Nullable class00394 class003942, class06584 class065842) {
        super.N(class072992, class080362, class072092, class005002, class003942, class065842);
        this.N(class072992, class072092, class005002);
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = class069422.method_8045().method_8320(class069422.method_8037());
        if (class005002.N((class00891)this)) {
            return (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(Math.min(4, (Integer)class005002.L((class08092)L) + 1)));
        }
        return super.N(class069422);
    }

    protected boolean N(class00500 class005002, class06942 class069422) {
        if (!class069422.method_8046() && class069422.method_8041().N(this.B()) && (Integer)class005002.L((class08092)L) < 4) {
            return true;
        }
        return super.N(class005002, class069422);
    }

    public MapCodec<class00628> N() {
        return N;
    }

    private boolean N(class04782 class047822, class07049 class070492) {
        if (class070492 instanceof class07872 || class070492 instanceof class07632) {
            return false;
        }
        if (class070492 instanceof class07438) {
            return class070492 instanceof class08036 || (Boolean)class047822.method_64395().N(class07305.I) != false;
        }
        return false;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return (Integer)class005002.L((class08092)L) == 1 ? M : B;
    }

    private void N(class07299 class072992, class07209 class072092, class00500 class005002) {
        class072992.method_8396(null, class072092, class04909.Ok, class04911.field_15245, 0.7f, 0.9f + class072992.field_9229.z() * 0.2f);
        int n = (Integer)class005002.L((class08092)L);
        if (n <= 1) {
            class072992.N(class072092, false);
        } else {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n - 1)), 2);
            class072992.N((class03556)class01194.R, class072092, class01164.N((class00500)class005002));
            class072992.N(2001, class072092, class00891.W((class00500)class005002));
        }
    }

    private void N(class07299 class072992, class00500 class005002, class07209 class072092, class07049 class070492, int n) {
        class04782 class047822;
        if (class005002.N(class00869.my) && class072992 instanceof class04782 && this.N(class047822 = (class04782)class072992, class070492) && class072992.field_9229.y(n) == 0) {
            this.N((class07299)class047822, class072092, class005002);
        }
    }

    public void N(class07299 class072992, class00500 class005002, class07209 class072092, class07049 class070492, double d) {
        if (!(class070492 instanceof class08004)) {
            this.N(class072992, class005002, class072092, class070492, 3);
        }
        super.N(class072992, class005002, class072092, class070492, d);
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, class07049 class070492) {
        if (!class070492.method_21749()) {
            this.N(class072992, class005002, class072092, class070492, 100);
        }
        super.N(class072992, class072092, class005002, class070492);
    }

    public static boolean N(class07290 class072902, class07209 class072092) {
        return class00628.y(class072902, class072092.method_10074());
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class00628.N((class07290)class072992, class072092) && !class072992.method_8608()) {
            class072992.N(2012, class072092, 15);
        }
    }

    private boolean N(class07299 class072992, class07209 class072092) {
        float f = ((Float)class072992.method_75728().N(class00608.q, class072092)).floatValue();
        return f > 0.0f && class072992.field_9229.z() < f;
    }
}

