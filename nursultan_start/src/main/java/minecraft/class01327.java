/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02795
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06165
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class08460
 *  minecraft.class08476
 *  minecraft.class08837
 *  minecraft.class08943
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01316;
import minecraft.class01319;
import minecraft.class01320;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02795;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06165;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class08460;
import minecraft.class08476;
import minecraft.class08837;
import minecraft.class08943;
import org.joml.Quaternionfc;

public class class01327
extends class02795<class06165, class08460, class01316> {
    private static final class01894 N = class01894.y((String)"textures/entity/fox/fox.png");
    private static final class01894 i = class01894.y((String)"textures/entity/fox/fox_sleep.png");
    private static final class01894 R = class01894.y((String)"textures/entity/fox/snow_fox.png");
    private static final class01894 M = class01894.y((String)"textures/entity/fox/snow_fox_sleep.png");

    public class01327(class04832 class048322) {
        super(class048322, (class06078)new class01316(class048322.N(class04802.yL)), (class06078)new class01316(class048322.N(class04802.yu)), 0.4f);
        this.N(new class01320((class06252<class08460, class01316>)this));
    }

    public class08460 method_55269() {
        return new class08460();
    }

    public class01894 N(class08460 class084602) {
        if (class084602.B == class01319.field_17996) {
            return class084602.u ? i : N;
        }
        return class084602.u ? M : R;
    }

    public void method_62354(class06165 class061652, class08460 class084602, float f) {
        super.method_62354((class07438)class061652, (class08476)class084602, f);
        class08837.N((class07438)class061652, (class08837)class084602, (class08943)this.L);
        class084602.N = class061652.u(f);
        class084602.L = class061652.method_18276();
        class084602.y = class061652.i(f);
        class084602.u = class061652.method_6113();
        class084602.i = class061652.v();
        class084602.R = class061652.n();
        class084602.M = class061652.G();
        class084602.B = class061652.W();
    }

    protected void y(class08460 class084602, class01421 class014212, float f, float f2) {
        super.y((class08476)class084602, class014212, f, f2);
        if (class084602.M || class084602.R) {
            class014212.N((Quaternionfc)class02058.y.N(-class084602.h));
        }
    }
}

