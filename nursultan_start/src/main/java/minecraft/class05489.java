/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02294
 *  minecraft.class02453
 *  minecraft.class02721
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06244
 *  minecraft.class08468
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02294;
import minecraft.class02453;
import minecraft.class02721;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class05506;
import minecraft.class05522;
import minecraft.class06244;
import minecraft.class08468;

public class class05489<M extends class02721>
extends class05506<M, class06244> {
    private static final class01894 N = class01894.y((String)"textures/entity/bee/bee_stinger.png");

    public class05489(class02294<?, class08468, M> class022942, class04832 class048322) {
        super(class022942, new class02453(class048322.N(class04802.l)), class06244.field_17274, N, class05522.field_53233);
    }

    @Override
    protected int N(class08468 class084682) {
        return class084682.A;
    }
}

