/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01894
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06851
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07057
 *  minecraft.class07209
 *  minecraft.class07311
 *  minecraft.class08457
 *  minecraft.class08800
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01894;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06851;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07057;
import minecraft.class07209;
import minecraft.class07311;
import minecraft.class08457;
import minecraft.class08800;
import org.joml.Quaternionfc;

public class class01764
extends class04507<class07057, class08457> {
    private static final class01894 N = class01894.y((String)"textures/entity/experience_orb.png");
    private static final class07311 y = class06851.Z((class01894)N);

    public class01764(class04832 class048322) {
        super(class048322);
        this.field_4673 = 0.15f;
        this.field_4672 = 0.75f;
    }

    protected int method_24087(class07057 class070572, class07209 class072092) {
        return class04995.N((int)(super.method_24087((class07049)class070572, class072092) + 7), (int)0, (int)15);
    }

    public void method_62354(class07057 class070572, class08457 class084572, float f) {
        super.method_62354((class07049)class070572, (class08800)class084572, f);
        class084572.N = class070572.y();
    }

    public class08457 method_55269() {
        return new class08457();
    }

    private static void N(class01391 class013912, class01423 class014232, float f, float f2, int n, int n2, int n3, float f3, float f4, int n4) {
        class013912.N(class014232, f, f2, 0.0f).method_1336(n, n2, n3, 128).method_22913(f3, f4).method_22922(class01384.u).method_60803(n4).y(class014232, 0.0f, 1.0f, 0.0f);
    }

    public void method_3936(class08457 class084572, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        int n = class084572.N;
        float f = (float)(n % 4 * 16 + 0) / 64.0f;
        float f2 = (float)(n % 4 * 16 + 16) / 64.0f;
        float f3 = (float)(n / 4 * 16 + 0) / 64.0f;
        float f4 = (float)(n / 4 * 16 + 16) / 64.0f;
        float f5 = 1.0f;
        float f6 = 0.5f;
        float f7 = 0.25f;
        float f8 = 255.0f;
        float f9 = class084572.P / 2.0f;
        int n2 = (int)((class04995.m((double)(f9 + 0.0f)) + 1.0f) * 0.5f * 255.0f);
        int n3 = 255;
        int n4 = (int)((class04995.m((double)(f9 + 4.1887903f)) + 1.0f) * 0.1f * 255.0f);
        class014212.N(0.0f, 0.1f, 0.0f);
        class014212.N((Quaternionfc)class069592.i);
        float f10 = 0.3f;
        class014212.y(0.3f, 0.3f, 0.3f);
        class012372.N(class014212, y, (class014232, class013912) -> {
            class01764.N(class013912, class014232, -0.5f, -0.25f, n2, 255, n4, f, f4, class084572.G);
            class01764.N(class013912, class014232, 0.5f, -0.25f, n2, 255, n4, f2, f4, class084572.G);
            class01764.N(class013912, class014232, 0.5f, 0.75f, n2, 255, n4, f2, f3, class084572.G);
            class01764.N(class013912, class014232, -0.5f, 0.75f, n2, 255, n4, f, f3, class084572.G);
        });
        class014212.y();
        super.method_3936((class08800)class084572, class014212, class012372, class069592);
    }
}

