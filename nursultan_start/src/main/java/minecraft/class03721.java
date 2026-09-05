/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class05443
 *  minecraft.class06078
 *  minecraft.class07438
 *  minecraft.class07632
 *  minecraft.class08476
 *  minecraft.class08789
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class05443;
import minecraft.class06078;
import minecraft.class07438;
import minecraft.class07632;
import minecraft.class08476;
import minecraft.class08789;

public class class03721
extends class02840<class07632, class08789, class05443> {
    private static final class01894 N = class01894.y((String)"textures/entity/bat.png");

    public class03721(class04832 class048322) {
        super(class048322, (class06078)new class05443(class048322.N(class04802.j)), 0.25f);
    }

    public class08789 method_55269() {
        return new class08789();
    }

    public void method_62354(class07632 class076322, class08789 class087892, float f) {
        super.method_62354((class07438)class076322, (class08476)class087892, f);
        class087892.N = class076322.B();
        class087892.y.N(class076322.L);
        class087892.L.N(class076322.u);
    }

    public class01894 N(class08789 class087892) {
        return N;
    }
}

