/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02135
 *  minecraft.class02142
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06667
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07126
 *  minecraft.class07138
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02135;
import minecraft.class02142;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06667;
import minecraft.class06896;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07126;
import minecraft.class07138;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08092;

public class class06888
extends class00891 {
    public static final MapCodec<class06888> N = class06888.y(class06888::new);
    public static final class06667 y = class06896.i;

    private static void L(class00500 class005002, class07299 class072992, class07209 class072092) {
        class06888.N(class072992, class072092);
        if (!((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(true)), 3);
        }
    }

    public class06888(class01362 class013622) {
        super(class013622);
        this.P((class00500)this.W().y((class08092)y, (Comparable)Boolean.valueOf(false)));
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(false)), 3);
        }
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class06888.N(class072992, class072092);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06584 class065842, boolean bl) {
        super.N(class005002, class047822, class072092, class065842, bl);
        if (bl) {
            this.N(class047822, class072092, class065842, (class02142)class02135.y((int)1, (int)5));
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    private static void N(class07299 class072992, class07209 class072092) {
        double d = 0.5625;
        class06069 class060692 = class072992.field_9229;
        for (class07211 class072112 : class07211.values()) {
            class07209 class072093 = class072092.method_10093(class072112);
            if (class072992.method_8320(class072093).t()) continue;
            class07185 class071852 = class072112.z();
            double d2 = class071852 == class07185.field_11048 ? 0.5 + 0.5625 * (double)class072112.P() : (double)class060692.z();
            double d3 = class071852 == class07185.field_11052 ? 0.5 + 0.5625 * (double)class072112.s() : (double)class060692.z();
            double d4 = class071852 == class07185.field_11051 ? 0.5 + 0.5625 * (double)class072112.T() : (double)class060692.z();
            class072992.method_8406((class07126)class07138.y, (double)class072092.method_10263() + d2, (double)class072092.method_10264() + d3, (double)class072092.method_10260() + d4, 0.0, 0.0, 0.0);
        }
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, class07049 class070492) {
        if (!class070492.method_21749()) {
            class06888.L(class005002, class072992, class072092);
        }
        super.N(class072992, class072092, class005002, class070492);
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        if (class072992.method_8608()) {
            class06888.N(class072992, class072092);
        } else {
            class06888.L(class005002, class072992, class072092);
        }
        if (class065842.B() instanceof class06918 && new class06942(class080362, class070502, class065842, class061832).N()) {
            return class07082.i;
        }
        return class07082.N;
    }

    public MapCodec<class06888> N() {
        return N;
    }

    protected void a_(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362) {
        class06888.L(class005002, class072992, class072092);
        super.a_(class005002, class072992, class072092, class080362);
    }

    protected boolean e_(class00500 class005002) {
        return (Boolean)class005002.L((class08092)y);
    }
}

