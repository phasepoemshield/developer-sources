/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class07133
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08071
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00753;
import minecraft.class00772;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class07133;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08071;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class00749
extends class07133 {
    public static final MapCodec<class00749> N = class00749.y(class00749::new);
    public static final int y = 3;
    public static final class08071 L = class06665.NG;
    private static final int R = 4;
    private static final int M = 2;

    public class00749(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(0)));
    }

    private boolean u(class00500 class005002, class07299 class072992, class07209 class072092) {
        int n = (Integer)class005002.L((class08092)L);
        if (n < 3) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n + 1)), 2);
            return false;
        }
        this.L(class005002, class072992, class072092);
        return true;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    private boolean N(class07290 class072902, class07209 class072092, int n) {
        int n2 = 0;
        class07218 class072182 = new class07218();
        for (class07211 class072112 : class07211.values()) {
            class072182.N((class00753)class072092, class072112);
            if (!class072902.method_8320((class07209)class072182).N((class00891)this) || ++n2 < n) continue;
            return false;
        }
        return true;
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return class06584.E;
    }

    public MapCodec<class00749> N() {
        return N;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class008912.W().N((class00891)this) && this.N((class07290)class072992, class072092, 2)) {
            this.L(class005002, class072992, class072092);
        }
        super.N(class005002, class072992, class072092, class008912, class027332, bl);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if ((class060692.y(3) == 0 || this.N((class07290)class047822, class072092, 4)) && (class047822.method_27983() == class07299.field_25181 ? class047822.method_8314(class00772.field_9282, class072092) : class047822.U(class072092)) > 11 - (Integer)class005002.L((class08092)L) - class005002.z() && this.u(class005002, (class07299)class047822, class072092)) {
            class07218 class072182 = new class07218();
            for (class07211 class072112 : class07211.values()) {
                class072182.N((class00753)class072092, class072112);
                class00500 class005003 = class047822.method_8320((class07209)class072182);
                if (!class005003.N((class00891)this) || this.u(class005003, (class07299)class047822, (class07209)class072182)) continue;
                class047822.N((class07209)class072182, (class00891)this, class04995.N((class06069)class060692, (int)20, (int)40));
            }
            return;
        }
        class047822.N(class072092, (class00891)this, class04995.N((class06069)class060692, (int)20, (int)40));
    }

    public void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        class072992.N(class072092, (class00891)this, class04995.N((class06069)class072992.method_8409(), (int)60, (int)120));
    }
}

