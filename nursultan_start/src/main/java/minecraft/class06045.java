/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class04983
 *  minecraft.class05487
 *  minecraft.class05568
 *  minecraft.class06183
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08036
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class04983;
import minecraft.class05487;
import minecraft.class05568;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08036;
import minecraft.class08092;

public class class06045
extends class04983
implements class05568 {
    public static final MapCodec<class06045> M = class06045.y(class06045::new);
    private static final float B = 0.11f;

    public class06045(class01362 class013622) {
        super(class013622, class07211.field_11033, N, false, 0.1);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)i, (Comparable)Integer.valueOf(0))).y((class08092)x_, (Comparable)Boolean.valueOf(false)));
    }

    protected class00891 u() {
        return class00869.vf;
    }

    protected boolean E(class00500 class005002) {
        return class005002.P();
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return (Boolean)class005002.L((class08092)x_) == false;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        super.N(class005172);
        class005172.N(new class08092[]{x_});
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class047822.method_8652(class072092, (class00500)class005002.y((class08092)x_, (Comparable)Boolean.valueOf(true)), 2);
    }

    public MapCodec<class06045> N() {
        return M;
    }

    protected int N(class06069 class060692) {
        return 1;
    }

    protected class00500 N(class00500 class005002, class00500 class005003) {
        return (class00500)class005003.y((class08092)x_, (Comparable)((Boolean)class005002.L((class08092)x_)));
    }

    protected class00500 N(class00500 class005002, class06069 class060692) {
        return (class00500)super.N(class005002, class060692).y((class08092)x_, (Comparable)Boolean.valueOf(class060692.z() < 0.11f));
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)class06570.wy);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        return class05568.N((class07049)class080362, (class00500)class005002, (class07299)class072992, (class07209)class072092);
    }
}

