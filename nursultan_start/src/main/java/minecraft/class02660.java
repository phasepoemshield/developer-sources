/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02862
 *  minecraft.class03852
 *  minecraft.class04507
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06244
 *  minecraft.class06271
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07311
 *  minecraft.class07517
 *  minecraft.class08259
 *  minecraft.class08800
 *  org.joml.Quaternionfc
 */
package minecraft;

import java.util.List;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02862;
import minecraft.class03852;
import minecraft.class04507;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06244;
import minecraft.class06271;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07311;
import minecraft.class07517;
import minecraft.class08259;
import minecraft.class08800;
import org.joml.Quaternionfc;

public class class02660
extends class04507<class07517, class08259> {
    public static final class01894 N = class01894.y((String)"textures/entity/trident.png");
    private final class03852 y;

    public class02660(class04832 class048322) {
        super(class048322);
        this.y = new class03852(class048322.N(class04802.ue));
    }

    public void method_3936(class08259 class082592, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.N((Quaternionfc)class02058.u.N(class082592.y - 90.0f));
        class014212.N((Quaternionfc)class02058.R.N(class082592.N + 90.0f));
        List var5 = class02862.N((class07311)this.y.method_23500(N), (boolean)false, (boolean)class082592.L);
        for (int i = 0; i < var5.size(); ++i) {
            class012372.N(i).N((class06271)this.y, (Object)class06244.field_17274, class014212, (class07311)var5.get(i), class082592.G, class01384.u, -1, null, class082592.l, null);
        }
        class014212.y();
        super.method_3936((class08800)class082592, class014212, class012372, class069592);
    }

    public void method_62354(class07517 class075172, class08259 class082592, float f) {
        super.method_62354((class07049)class075172, (class08800)class082592, f);
        class082592.y = class075172.method_61415(f);
        class082592.N = class075172.method_61414(f);
        class082592.L = class075172.m();
    }

    public class08259 method_55269() {
        return new class08259();
    }
}

