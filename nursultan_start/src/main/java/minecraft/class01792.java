/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class04507
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06271
 *  minecraft.class06373
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class08009
 *  minecraft.class08486
 *  minecraft.class08800
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class04507;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06271;
import minecraft.class06373;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class08009;
import minecraft.class08486;
import minecraft.class08800;
import org.joml.Quaternionfc;

public class class01792
extends class04507<class08009, class08486> {
    private static final class01894 N = class01894.y((String)"textures/entity/illager/evoker_fangs.png");
    private final class06373 y;

    public class01792(class04832 class048322) {
        super(class048322);
        this.y = new class06373(class048322.N(class04802.yy));
    }

    public void method_3936(class08486 class084862, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class084862.y == 0.0f) {
            return;
        }
        class014212.N();
        class014212.N((Quaternionfc)class02058.u.N(90.0f - class084862.N));
        class014212.y(-1.0f, -1.0f, 1.0f);
        class014212.N(0.0f, -1.501f, 0.0f);
        class012372.N((class06271)this.y, (Object)class084862, class014212, this.y.method_23500(N), class084862.G, class01384.u, class084862.l, null);
        class014212.y();
        super.method_3936((class08800)class084862, class014212, class012372, class069592);
    }

    public void method_62354(class08009 class080092, class08486 class084862, float f) {
        super.method_62354((class07049)class080092, (class08800)class084862, f);
        class084862.N = class080092.method_36454();
        class084862.y = class080092.N(f);
    }

    public class08486 method_55269() {
        return new class08486();
    }
}

