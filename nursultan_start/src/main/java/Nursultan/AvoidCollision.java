/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11101
 *  Nursultan.class11106
 *  Nursultan.class11385
 *  Nursultan.class11782
 *  Nursultan.class11902
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11101;
import Nursultan.class11106;
import Nursultan.class11385;
import Nursultan.class11782;
import Nursultan.class11902;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07049;

@class11080(L="AvoidCollision", y=class11072.PLAYER, u=class11101.DEVELOPMENT, N=class11106.BASE)
public class AvoidCollision
extends class11067 {
    @class11782
    public void N(class11385 class113852) {
        float f = 0.3f;
        for (int i = -180; i <= 180; i += 90) {
            double d = -Math.sin(Math.toRadians(i)) * (double)f;
            double d2 = Math.cos(Math.toRadians(i)) * (double)f;
            if (!((class03448)((class06202)this.y_0).T_3).method_8600((class07049)((class04453)((class06202)this.y_0).T_4), ((class04453)((class06202)this.y_0).T_4).method_5829().u(d, 0.0, d2)).iterator().hasNext()) continue;
            class113852.B(true);
            class11902.N((class11385)class113852, (float)(i + 180));
            break;
        }
    }
}

