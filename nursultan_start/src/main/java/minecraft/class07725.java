/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00873
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class06761
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00873;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class06761;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;

public class class07725
extends class06761
implements class00873 {
    public static final MapCodec<class07725> L = class07725.y(class07725::new);

    public class07725(class01362 class013622) {
        super(class013622);
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class07725.N_21((class07299)class047822, (class07209)class072092, (class06584)new class06584((class07310)this));
    }

    public MapCodec<class07725> N() {
        return L;
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return true;
    }
}

