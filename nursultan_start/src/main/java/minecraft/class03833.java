/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class03662
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class08006
 *  minecraft.class08465
 *  minecraft.class08800
 *  minecraft.class08943
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class03662;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class08006;
import minecraft.class08465;
import minecraft.class08800;
import minecraft.class08943;
import org.joml.Quaternionfc;

public class class03833
extends class04507<class08006, class08465> {
    private final class08943 N;

    public class03833(class04832 class048322) {
        super(class048322);
        this.N = class048322.y();
    }

    public void method_62354(class08006 class080062, class08465 class084652, float f) {
        super.method_62354((class07049)class080062, (class08800)class084652, f);
        class084652.N = class080062.y();
        this.N.N(class084652.y, class080062.L(), class03662.field_4318, (class07049)class080062);
    }

    public class08465 method_55269() {
        return new class08465();
    }

    public void method_3936(class08465 class084652, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.N((Quaternionfc)class069592.i);
        if (class084652.N) {
            class014212.N((Quaternionfc)class02058.R.N(180.0f));
            class014212.N((Quaternionfc)class02058.u.N(180.0f));
            class014212.N((Quaternionfc)class02058.y.N(90.0f));
        }
        class084652.y.N(class014212, class012372, class084652.G, class01384.u, class084652.l);
        class014212.y();
        super.method_3936((class08800)class084652, class014212, class012372, class069592);
    }
}

