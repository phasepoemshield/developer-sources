/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class03091
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class06563
 *  minecraft.class06851
 *  minecraft.class08285
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class03091;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class06563;
import minecraft.class06851;
import minecraft.class08285;

public class class08445
extends class06249<class08285, class03091> {
    private static final class01894 N = class01894.y((String)"textures/entity/wolf/wolf_collar.png");

    public class08445(class06252<class08285, class03091> class062522) {
        super(class062522);
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08285 class082852, float f, float f2) {
        class06563 class065632 = class082852.B;
        if (class065632 == null || class082852.v) {
            return;
        }
        int n2 = class065632.L();
        class012372.N(1).N((class06271)this.u(), (Object)class082852, class014212, class06851.M((class01894)N), n, class01384.u, n2, null, class082852.l, null);
    }
}

