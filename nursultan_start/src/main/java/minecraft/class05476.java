/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00801
 *  minecraft.class00865
 *  minecraft.class00869
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04823
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00801;
import minecraft.class00865;
import minecraft.class00869;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04823;
import minecraft.class07209;
import minecraft.class07299;

public class class05476
extends class00865 {
    public static final MapCodec<class05476> u = class05476.y(class05476::new);
    private static final float i = 0.05f;
    private static final float R = 0.1f;

    public class05476(class01362 class013622) {
        super(class013622, class04823.L);
    }

    public boolean E(class00500 class005002) {
        return false;
    }

    protected boolean N(class04651 class046512) {
        return true;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class04651 class046512) {
        if (class046512 == class04684.L) {
            class00500 class005003 = class00869.Mz.W();
            class072992.method_8501(class072092, class005003);
            class072992.N((class03556)class01194.L, class072092, class01164.N((class00500)class005003));
            class072992.N(1047, class072092, 0);
        } else if (class046512 == class04684.i) {
            class00500 class005004 = class00869.MU.W();
            class072992.method_8501(class072092, class005004);
            class072992.N((class03556)class01194.L, class072092, class01164.N((class00500)class005004));
            class072992.N(1046, class072092, 0);
        }
    }

    public MapCodec<class05476> N() {
        return u;
    }

    public void N_4(class00500 class005002, class07299 class072992, class07209 class072092, class00801 class008012) {
        if (!class05476.N(class072992, class008012)) {
            return;
        }
        if (class008012 == class00801.field_9382) {
            class072992.method_8501(class072092, class00869.Mz.W());
            class072992.N(null, (class03556)class01194.L, class072092);
        } else if (class008012 == class00801.field_9383) {
            class072992.method_8501(class072092, class00869.ME.W());
            class072992.N(null, (class03556)class01194.L, class072092);
        }
    }

    public static boolean N(class07299 class072992, class00801 class008012) {
        if (class008012 == class00801.field_9382) {
            return class072992.method_8409().z() < 0.05f;
        }
        if (class008012 == class00801.field_9383) {
            return class072992.method_8409().z() < 0.1f;
        }
        return false;
    }
}

