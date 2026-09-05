/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06074
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07155
 *  minecraft.class07438
 *  minecraft.class08461
 *  minecraft.class08476
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02432;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06074;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07155;
import minecraft.class07438;
import minecraft.class08461;
import minecraft.class08476;
import org.joml.Quaternionfc;

public class class02492
extends class02840<class07155, class08461, class06074> {
    private static final class01894 N = class01894.y((String)"textures/entity/phantom.png");

    public class02492(class04832 class048322) {
        super(class048322, (class06078)new class06074(class048322.N(class04802.Lb)), 0.75f);
        this.N((class06249)new class02432((class06252<class08461, class06074>)this));
    }

    public class08461 method_55269() {
        return new class08461();
    }

    public void method_62354(class07155 class071552, class08461 class084612, float f) {
        super.method_62354((class07438)class071552, (class08476)class084612, f);
        class084612.N = (float)class071552.B() + class084612.P;
        class084612.y = class071552.M();
    }

    protected void y(class08461 class084612, class01421 class014212, float f, float f2) {
        super.y((class08476)class084612, class014212, f, f2);
        class014212.N((Quaternionfc)class02058.y.N(class084612.h));
    }

    public class01894 N(class08461 class084612) {
        return N;
    }

    protected void y(class08461 class084612, class01421 class014212) {
        float f = 1.0f + 0.15f * (float)class084612.y;
        class014212.y(f, f, f);
        class014212.N(0.0f, 1.3125f, 0.1875f);
    }
}

