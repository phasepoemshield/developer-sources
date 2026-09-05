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
 *  minecraft.class06851
 *  minecraft.class06959
 *  minecraft.class07209
 *  minecraft.class07311
 *  minecraft.class08028
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
import minecraft.class06851;
import minecraft.class06959;
import minecraft.class07209;
import minecraft.class07311;
import minecraft.class08028;
import minecraft.class08800;
import org.joml.Quaternionfc;

public class class03134
extends class04507<class08028, class08800> {
    private static final class01894 N = class01894.y((String)"textures/entity/enderdragon/dragon_fireball.png");
    private static final class07311 y = class06851.M((class01894)N);

    public class03134(class04832 class048322) {
        super(class048322);
    }

    private static void N(class01391 class013912, class01423 class014232, int n, float f, int n2, int n3, int n4) {
        class013912.N(class014232, f - 0.5f, (float)n2 - 0.25f, 0.0f).method_39415(-1).method_22913((float)n3, (float)n4).method_22922(class01384.u).method_60803(n).y(class014232, 0.0f, 1.0f, 0.0f);
    }

    protected int method_24087(class08028 class080282, class07209 class072092) {
        return 15;
    }

    public void method_3936(class08800 class088002, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.y(2.0f, 2.0f, 2.0f);
        class014212.N((Quaternionfc)class069592.i);
        class012372.N(class014212, y, (class014232, class013912) -> {
            class03134.N(class013912, class014232, class088002.G, 0.0f, 0, 0, 1);
            class03134.N(class013912, class014232, class088002.G, 1.0f, 0, 1, 1);
            class03134.N(class013912, class014232, class088002.G, 1.0f, 1, 1, 0);
            class03134.N(class013912, class014232, class088002.G, 0.0f, 1, 0, 0);
        });
        class014212.y();
        super.method_3936(class088002, class014212, class012372, class069592);
    }

    public class08800 method_55269() {
        return new class08800();
    }
}

