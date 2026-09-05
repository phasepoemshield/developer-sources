/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05015
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06994
 *  minecraft.class06999
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05015;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06994;
import minecraft.class06999;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class08092;

public abstract class class07732
extends class06994 {
    private static boolean L(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10084();
        return class07732.y(class005002, class054872, class072092) && !class054872.method_8316(class072093).N(class01231.N);
    }

    public class07732(class01362 class013622) {
        super(class013622);
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class07732.y(class005002, (class05487)class047822, class072092)) {
            class047822.method_8501(class072092, class00869.z.W());
            return;
        }
        if (class047822.U(class072092.method_10084()) >= 9) {
            class00500 class005003 = this.W();
            for (int i = 0; i < 4; ++i) {
                class07209 class072093 = class072092.method_10069(class060692.y(3) - 1, class060692.y(5) - 3, class060692.y(3) - 1);
                if (!class047822.method_8320(class072093).N(class00869.z) || !class07732.L(class005003, (class05487)class047822, class072093)) continue;
                class047822.method_8501(class072093, (class00500)class005003.y((class08092)L, (Comparable)Boolean.valueOf(class07732.U((class00500)class047822.method_8320(class072093.method_10084())))));
            }
        }
    }

    private static boolean y(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10084();
        class00500 class005003 = class054872.method_8320(class072093);
        if (class005003.N(class00869.is) && (Integer)class005003.L((class08092)class06999.L) == 1) {
            return true;
        }
        if (class005003.Y().R() == 8) {
            return false;
        }
        return class05015.N((class00500)class005002, (class00500)class005003, (class07211)class07211.field_11036, (int)class005003.z()) < 15;
    }

    protected abstract MapCodec<? extends class07732> N();
}

