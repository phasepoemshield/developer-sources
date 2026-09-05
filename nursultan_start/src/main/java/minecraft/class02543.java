/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01430
 *  minecraft.class01894
 *  minecraft.class04802
 *  minecraft.class04816
 *  minecraft.class06252
 *  minecraft.class08786
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01430;
import minecraft.class01894;
import minecraft.class04802;
import minecraft.class04816;
import minecraft.class06252;
import minecraft.class08786;

public class class02543
extends class01430<class08786, class04816> {
    private static final class01894 N = class01894.y((String)"textures/entity/creeper/creeper_armor.png");
    private final class04816 y;

    public class02543(class06252<class08786, class04816> class062522, class01140 class011402) {
        super(class062522);
        this.y = new class04816(class011402.N(class04802.Nd));
    }

    protected class04816 L() {
        return this.y;
    }

    protected class01894 N() {
        return N;
    }

    protected boolean N(class08786 class087862) {
        return class087862.y;
    }

    protected float N(float f) {
        return f * 0.01f;
    }
}

