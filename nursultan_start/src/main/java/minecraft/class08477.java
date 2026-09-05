/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01430
 *  minecraft.class01894
 *  minecraft.class03095
 *  minecraft.class04802
 *  minecraft.class04995
 *  minecraft.class06252
 *  minecraft.class08268
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01430;
import minecraft.class01894;
import minecraft.class03095;
import minecraft.class04802;
import minecraft.class04995;
import minecraft.class06252;
import minecraft.class08268;

public class class08477
extends class01430<class08268, class03095> {
    private static final class01894 N = class01894.y((String)"textures/entity/wither/wither_armor.png");
    private final class03095 y;

    public class08477(class06252<class08268, class03095> class062522, class01140 class011402) {
        super(class062522);
        this.y = new class03095(class011402.N(class04802.iE));
    }

    protected class03095 L() {
        return this.y;
    }

    protected class01894 N() {
        return N;
    }

    protected boolean N(class08268 class082682) {
        return class082682.u;
    }

    protected float N(float f) {
        return class04995.P((double)(f * 0.02f)) * 3.0f;
    }
}

