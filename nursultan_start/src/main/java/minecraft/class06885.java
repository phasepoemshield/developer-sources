/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00869
 *  minecraft.class00885
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05946
 *  minecraft.class06183
 *  minecraft.class06273
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00869;
import minecraft.class00885;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05946;
import minecraft.class06183;
import minecraft.class06273;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08092;

public class class06885
extends class00891 {
    public static final MapCodec<class06885> N = class06885.y(class06885::new);

    public class06885(class01362 class013622) {
        super(class013622);
    }

    public MapCodec<class06885> N() {
        return N;
    }

    protected class07082 N(class06584 class065843, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        if (!class065843.N(class06570.vr)) {
            return super.N(class065843, class005002, class072992, class072092, class080362, class070502, class061832);
        }
        if (!(class072992 instanceof class04782)) {
            return class07082.N;
        }
        class04782 class047823 = (class04782)class072992;
        class07211 class072112 = class061832.i();
        class07211 class072113 = class072112.z() == class07185.field_11052 ? class080362.method_5735().b() : class072112;
        class06885.N((class04782)class047823, (class05946)class06273.NX, (class00500)class005002, (class00394)class072992.method_8321(class072092), (class06584)class065843, (class07049)class080362, (class047822, class065842) -> {
            class00717 class007172 = new class00717(class072992, (double)class072092.method_10263() + 0.5 + (double)class072113.P() * 0.65, (double)class072092.method_10264() + 0.1, (double)class072092.method_10260() + 0.5 + (double)class072113.T() * 0.65, class065842);
            class007172.method_18800(0.05 * (double)class072113.P() + class072992.field_9229.U() * 0.02, 0.05, 0.05 * (double)class072113.T() + class072992.field_9229.U() * 0.02);
            class072992.method_8649((class07049)class007172);
        });
        class072992.method_8396(null, class072092, class04909.lo, class04911.field_15245, 1.0f, 1.0f);
        class072992.method_8652(class072092, (class00500)class00869.iK.W().y((class08092)class00885.y, (Comparable)class072113), 11);
        class065843.N(1, (class07438)class080362, class070502.N());
        class072992.N((class07049)class080362, (class03556)class01194.H, class072092);
        class080362.method_7259(class01235.L.y((Object)class06570.vr));
        return class07082.N;
    }
}

