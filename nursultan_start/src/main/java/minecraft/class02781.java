/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01134
 *  minecraft.class02795
 *  minecraft.class04832
 *  minecraft.class05293
 *  minecraft.class06013
 *  minecraft.class06078
 *  minecraft.class07079
 *  minecraft.class08476
 *  minecraft.class08484
 */
package minecraft;

import minecraft.class01134;
import minecraft.class02795;
import minecraft.class04832;
import minecraft.class05293;
import minecraft.class06013;
import minecraft.class06078;
import minecraft.class07079;
import minecraft.class08476;
import minecraft.class08484;

public abstract class class02781<T extends class07079>
extends class02795<T, class08484, class06013> {
    public class02781(class04832 class048322, class01134 class011342, class01134 class011343, float f) {
        super(class048322, (class06078)new class06013(class048322.N(class011342)), (class06078)new class06013(class048322.N(class011343)), f);
    }

    public class08484 method_55269() {
        return new class08484();
    }

    public void method_62354(T t, class08484 class084842, float f) {
        super.method_62354(t, (class08476)class084842, f);
        class084842.N = ((class05293)t).W();
    }
}

