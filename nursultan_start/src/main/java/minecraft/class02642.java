/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02802
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07164
 *  minecraft.class08443
 *  minecraft.class08451
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02802;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07164;
import minecraft.class08443;
import minecraft.class08451;

public class class02642
extends class02802<class07164, class08443> {
    private static final class01894 N = class01894.y((String)"textures/entity/skeleton/stray.png");
    private static final class01894 i = class01894.y((String)"textures/entity/skeleton/stray_overlay.png");

    public class02642(class04832 class048322) {
        super(class048322, class04802.uk, class04802.uY);
        this.N((class06249)new class08451((class06252)this, class048322.R(), class04802.uQ, i));
    }

    public class08443 method_55269() {
        return new class08443();
    }

    public class01894 N(class08443 class084432) {
        return N;
    }
}

