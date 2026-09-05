/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06183
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08005
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06183;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08005;

public class class05439
extends class00891 {
    public static final MapCodec<class05439> N = class05439.y(class05439::new);

    public class05439(class01362 class013622) {
        super(class013622);
    }

    public MapCodec<? extends class05439> N() {
        return N;
    }

    protected void N(class07299 class072992, class00500 class005002, class06183 class061832, class08005 class080052) {
        if (!class072992.method_8608()) {
            class07209 class072092 = class061832.u();
            class072992.method_8396(null, class072092, class04909.g, class04911.field_15245, 1.0f, 0.5f + class072992.field_9229.z() * 1.2f);
        }
    }
}

