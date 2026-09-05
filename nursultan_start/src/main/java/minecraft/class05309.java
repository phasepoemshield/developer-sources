/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00207
 *  minecraft.class01377
 *  minecraft.class01894
 *  minecraft.class02795
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class05296
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class08253
 *  minecraft.class08476
 *  minecraft.class08719
 */
package minecraft;

import minecraft.class00207;
import minecraft.class01377;
import minecraft.class01894;
import minecraft.class02795;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class05296;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class08253;
import minecraft.class08476;
import minecraft.class08719;

public class class05309
extends class02795<class01377, class08253, class05296> {
    private static final class01894 N = class01894.y((String)"textures/entity/strider/strider.png");
    private static final class01894 i = class01894.y((String)"textures/entity/strider/strider_cold.png");
    private static final float R = 0.5f;

    protected boolean L(class08253 class082532) {
        return super.L((class08476)class082532) || class082532.y;
    }

    public class05309(class04832 class048322) {
        super(class048322, (class06078)new class05296(class048322.N(class04802.uO)), (class06078)new class05296(class048322.N(class04802.uI)), 0.5f);
        this.N((class06249)new class00207((class06252)this, class048322.B(), class08719.field_56124, class082532 -> class082532.N, (class06078)new class05296(class048322.N(class04802.ug)), (class06078)new class05296(class048322.N(class04802.uJ))));
    }

    protected float method_55831(class08253 class082532) {
        float f = super.method_55831((class08476)class082532);
        if (class082532.NB) {
            return f * 0.5f;
        }
        return f;
    }

    public class08253 method_55269() {
        return new class08253();
    }

    public void method_62354(class01377 class013772, class08253 class082532, float f) {
        super.method_62354((class07438)class013772, (class08476)class082532, f);
        class082532.N = class013772.method_6118(class07085.field_55946).t();
        class082532.y = class013772.B();
        class082532.L = class013772.method_5782();
    }

    public class01894 N(class08253 class082532) {
        return class082532.y ? i : N;
    }
}

