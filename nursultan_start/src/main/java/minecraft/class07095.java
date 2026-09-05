/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00884
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00884;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08713;

public class class07095
extends class00891 {
    public static final MapCodec<class07095> N = class07095.y(class07095::new);
    private static final int y = 20;

    public class07095(class01362 class013622) {
        super(class013622);
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        class072992.N(class072092, (class00891)this, 20);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11036 && class005003.N(class00869.K)) {
            class087132.N(class072092, (class00891)this, 20);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public MapCodec<class07095> N() {
        return N;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class00884.y((class07284)class047822, (class07209)class072092.method_10084(), (class00500)class005002);
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, class07049 class070492) {
        if (!class070492.method_21749() && class070492 instanceof class07438) {
            class070492.method_64419(class072992.method_48963().R(), 1.0f);
        }
        super.N(class072992, class072092, class005002, class070492);
    }
}

