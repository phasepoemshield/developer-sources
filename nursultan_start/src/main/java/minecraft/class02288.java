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
 *  minecraft.class06065
 *  minecraft.class06271
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class08021
 *  minecraft.class08456
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
import minecraft.class06065;
import minecraft.class06271;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class08021;
import minecraft.class08456;
import minecraft.class08800;
import org.joml.Quaternionfc;

public class class02288
extends class04507<class08021, class08456> {
    private static final class01894 N = class01894.y((String)"textures/entity/llama/spit.png");
    private final class06065 y;

    public class02288(class04832 class048322) {
        super(class048322);
        this.y = new class06065(class048322.N(class04802.yp));
    }

    public void method_3936(class08456 class084562, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.N(0.0f, 0.15f, 0.0f);
        class014212.N((Quaternionfc)class02058.u.N(class084562.N - 90.0f));
        class014212.N((Quaternionfc)class02058.R.N(class084562.y));
        class012372.N((class06271)this.y, (Object)class084562, class014212, this.y.method_23500(N), class084562.G, class01384.u, class084562.l, null);
        class014212.y();
        super.method_3936((class08800)class084562, class014212, class012372, class069592);
    }

    public void method_62354(class08021 class080212, class08456 class084562, float f) {
        super.method_62354((class07049)class080212, (class08800)class084562, f);
        class084562.y = class080212.method_61414(f);
        class084562.N = class080212.method_61415(f);
    }

    public class08456 method_55269() {
        return new class08456();
    }
}

