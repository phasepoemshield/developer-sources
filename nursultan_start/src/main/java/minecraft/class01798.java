/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class04802
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class07311
 *  minecraft.class08797
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01803;
import minecraft.class01894;
import minecraft.class04802;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class07311;
import minecraft.class08797;

public class class01798
extends class06249<class08797, class01803> {
    private static final class07311 N = class06851.b((class01894)class01894.y((String)"textures/entity/breeze/breeze_eyes.png"));
    private final class01803 y;

    public class01798(class06252<class08797, class01803> class062522, class01140 class011402) {
        super(class062522);
        this.y = new class01803(class011402.N(class04802.K));
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08797 class087972, float f, float f2) {
        class012372.N(1).N((class06271)this.y, (Object)class087972, class014212, N, n, class01384.u, -1, null, class087972.l, null);
    }
}

