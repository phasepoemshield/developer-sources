/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01156
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class07153
 *  minecraft.class07438
 *  minecraft.class08440
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01156;
import minecraft.class01894;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class07153;
import minecraft.class07438;
import minecraft.class08440;
import minecraft.class08476;

public class class04253
extends class02840<class07153, class08440, class01156> {
    private static final class01894 N = class01894.y((String)"textures/entity/illager/ravager.png");

    public class04253(class04832 class048322) {
        super(class048322, (class06078)new class01156(class048322.N(class04802.Lf)), 1.1f);
    }

    public class08440 method_55269() {
        return new class08440();
    }

    public void method_62354(class07153 class071532, class08440 class084402, float f) {
        super.method_62354((class07438)class071532, (class08476)class084402, f);
        class084402.N = (float)class071532.W() > 0.0f ? (float)class071532.W() - f : 0.0f;
        class084402.y = (float)class071532.B() > 0.0f ? (float)class071532.B() - f : 0.0f;
        class084402.L = class071532.m() > 0 ? ((float)(20 - class071532.m()) + f) / 20.0f : 0.0f;
    }

    public class01894 N(class08440 class084402) {
        return N;
    }
}

