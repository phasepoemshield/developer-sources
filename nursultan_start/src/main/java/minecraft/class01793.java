/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class04508
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class08476
 *  minecraft.class08797
 */
package minecraft;

import minecraft.class01775;
import minecraft.class01798;
import minecraft.class01803;
import minecraft.class01894;
import minecraft.class02840;
import minecraft.class04508;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class08476;
import minecraft.class08797;

public class class01793
extends class02840<class04508, class08797, class01803> {
    private static final class01894 N = class01894.y((String)"textures/entity/breeze/breeze.png");

    public class01793(class04832 class048322) {
        super(class048322, (class06078)new class01803(class048322.N(class04802.o)), 0.5f);
        this.N(new class01775((class06252<class08797, class01803>)this, class048322.R()));
        this.N(new class01798((class06252<class08797, class01803>)this, class048322.R()));
    }

    public class08797 method_55269() {
        return new class08797();
    }

    public void method_62354(class04508 class045082, class08797 class087972, float f) {
        super.method_62354((class07438)class045082, (class08476)class087972, f);
        class087972.N.N(class045082.N);
        class087972.y.N(class045082.i);
        class087972.L.N(class045082.y);
        class087972.u.N(class045082.L);
        class087972.i.N(class045082.R);
        class087972.R.N(class045082.u);
    }

    public class01894 N(class08797 class087972) {
        return N;
    }
}

