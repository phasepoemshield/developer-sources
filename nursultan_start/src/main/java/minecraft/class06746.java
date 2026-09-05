/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10667
 *  Nursultan.class10673
 *  minecraft.class00207
 *  minecraft.class01894
 *  minecraft.class02795
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06729
 *  minecraft.class06738
 *  minecraft.class07085
 *  minecraft.class08156
 *  minecraft.class08476
 *  minecraft.class08719
 */
package minecraft;

import Nursultan.class10667;
import Nursultan.class10673;
import minecraft.class00207;
import minecraft.class01894;
import minecraft.class02795;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06729;
import minecraft.class06738;
import minecraft.class07085;
import minecraft.class08156;
import minecraft.class08476;
import minecraft.class08719;

public class class06746<T extends class08156>
extends class02795<T, class06729, class06738> {
    private static final class01894 N = class01894.y((String)"textures/entity/nautilus/nautilus.png");
    private static final class01894 i = class01894.y((String)"textures/entity/nautilus/nautilus_baby.png");

    public class06746(class04832 class048322) {
        super(class048322, (class06078)new class06738(class048322.N(class04802.Ly)), (class06078)new class06738(class048322.N(class04802.LL)), 0.7f);
        this.N((class06249)new class00207((class06252)this, class048322.B(), class08719.field_63622, class067292 -> class067292.y, (class06078)new class10667(class048322.N(class04802.Li)), null));
        this.N((class06249)new class00207((class06252)this, class048322.B(), class08719.field_63621, class067292 -> class067292.N, (class06078)new class10673(class048322.N(class04802.Lu)), null));
    }

    public class06729 method_55269() {
        return new class06729();
    }

    public class01894 N(class06729 class067292) {
        return class067292.NB ? i : N;
    }

    public void method_62354(T t, class06729 class067292, float f) {
        super.method_62354(t, (class08476)class067292, f);
        class067292.N = t.method_6118(class07085.field_55946).t();
        class067292.y = t.NZ().t();
    }
}

