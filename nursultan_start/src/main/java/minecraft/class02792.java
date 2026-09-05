/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01134
 *  minecraft.class01140
 *  minecraft.class01188
 *  minecraft.class01532
 *  minecraft.class01894
 *  minecraft.class02439
 *  minecraft.class02562
 *  minecraft.class04256
 *  minecraft.class04832
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07079
 *  minecraft.class07182
 *  minecraft.class08118
 *  minecraft.class08248
 *  minecraft.class08467
 */
package minecraft;

import minecraft.class01134;
import minecraft.class01140;
import minecraft.class01188;
import minecraft.class01532;
import minecraft.class01894;
import minecraft.class02439;
import minecraft.class02562;
import minecraft.class04256;
import minecraft.class04832;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07079;
import minecraft.class07182;
import minecraft.class08118;
import minecraft.class08248;
import minecraft.class08467;

public class class02792
extends class04256<class07182, class08248, class02439> {
    private static final class01894 N = class01894.y((String)"textures/entity/piglin/zombified_piglin.png");

    public class02792(class04832 class048322, class01134 class011342, class01134 class011343, class08118<class01134> class081182, class08118<class01134> class081183) {
        super(class048322, (class01188)new class02439(class048322.N(class011342)), (class01188)new class02439(class048322.N(class011343)), 0.5f, class01532.N);
        this.N((class06249)new class02562((class06252)this, class08118.N(class081182, (class01140)class048322.R(), class02439::new), class08118.N(class081183, (class01140)class048322.R(), class02439::new), class048322.B()));
    }

    public class08248 method_55269() {
        return new class08248();
    }

    public class01894 N(class08248 class082482) {
        return N;
    }

    public void method_62354(class07182 class071822, class08248 class082482, float f) {
        super.method_62354((class07079)class071822, (class08467)class082482, f);
        class082482.N = class071822.Nl();
    }
}

