/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01134
 *  minecraft.class01894
 *  minecraft.class02681
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class08118
 *  minecraft.class08451
 *  minecraft.class08793
 */
package minecraft;

import minecraft.class01134;
import minecraft.class01894;
import minecraft.class02681;
import minecraft.class02802;
import minecraft.class02839;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class08118;
import minecraft.class08451;
import minecraft.class08793;

public class class02823
extends class02802<class02839, class08793> {
    private static final class01894 N = class01894.y((String)"textures/entity/skeleton/bogged.png");
    private static final class01894 i = class01894.y((String)"textures/entity/skeleton/bogged_overlay.png");

    public class02823(class04832 class048322) {
        super(class048322, (class08118<class01134>)class04802.g, new class02681(class048322.N(class04802.O)));
        this.N((class06249)new class08451((class06252)this, class048322.R(), class04802.I, i));
    }

    public class08793 method_55269() {
        return new class08793();
    }

    @Override
    public void method_62354(class02839 class028392, class08793 class087932, float f) {
        super.method_62354(class028392, class087932, f);
        class087932.N = class028392.t();
    }

    public class01894 N(class08793 class087932) {
        return N;
    }
}

