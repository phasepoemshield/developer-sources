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
 *  minecraft.class04978
 *  minecraft.class04983
 *  minecraft.class05487
 *  minecraft.class06069
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
import minecraft.class04978;
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

public class class05578
extends class04978
implements class05568 {
    public static final MapCodec<class05578> i = class05578.y(class05578::new);

    protected class04983 L() {
        return (class04983)class00869.vA;
    }

    public class05578(class01362 class013622) {
        super(class013622, class07211.field_11033, N, false);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)x_, (Comparable)Boolean.valueOf(false)));
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return (Boolean)class005002.L((class08092)x_) == false;
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class047822.method_8652(class072092, (class00500)class005002.y((class08092)x_, (Comparable)Boolean.valueOf(true)), 2);
    }

    public MapCodec<class05578> N() {
        return i;
    }

    protected class00500 N(class00500 class005002, class00500 class005003) {
        return (class00500)class005003.y((class08092)x_, (Comparable)((Boolean)class005002.L((class08092)x_)));
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)class06570.wy);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        return class05568.N((class07049)class080362, class005002, class072992, class072092);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{x_});
    }
}

