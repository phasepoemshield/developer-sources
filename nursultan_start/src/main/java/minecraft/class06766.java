/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class03965
 *  minecraft.class05880
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07485
 *  minecraft.class08036
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class03965;
import minecraft.class05880;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07485;
import minecraft.class08036;

public class class06766
extends class00891 {
    public static final MapCodec<class06766> N = class06766.y(class06766::new);
    private static final class00392 y = class00392.L((String)"container.crafting");

    public class06766(class01362 class013622) {
        super(class013622);
    }

    public MapCodec<? extends class06766> N() {
        return N;
    }

    protected class06237 N(class00500 class005002, class07299 class072992, class07209 class072092) {
        return new class03965((n, class080442, class080362) -> new class07485(n, class080442, class05880.N((class07299)class072992, (class07209)class072092)), y);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!class072992.method_8608()) {
            class080362.method_17355(class005002.N(class072992, class072092));
            class080362.method_7281(class01235.Ns);
        }
        return class07082.N;
    }
}

