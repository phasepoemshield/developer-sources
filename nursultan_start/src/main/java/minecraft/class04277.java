/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01174
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02737
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class05898
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class07625
 *  minecraft.class08476
 *  minecraft.class08479
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01174;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02737;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class05898;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class07625;
import minecraft.class08476;
import minecraft.class08479;
import org.joml.Quaternionfc;

public class class04277
extends class02840<class07625, class08479, class01174> {
    private static final class01894 N = class01894.y((String)"textures/entity/iron_golem/iron_golem.png");

    public class04277(class04832 class048322) {
        super(class048322, (class06078)new class01174(class048322.N(class04802.yq)), 0.7f);
        this.N((class06249)new class05898((class06252)this));
        this.N((class06249)new class02737((class06252)this));
    }

    public class08479 method_55269() {
        return new class08479();
    }

    public void method_62354(class07625 class076252, class08479 class084792, float f) {
        super.method_62354((class07438)class076252, (class08476)class084792, f);
        class084792.N = (float)class076252.v() > 0.0f ? (float)class076252.v() - f : 0.0f;
        class084792.y = class076252.n();
        class084792.L = class076252.m();
    }

    protected void y(class08479 class084792, class01421 class014212, float f, float f2) {
        super.y((class08476)class084792, class014212, f, f2);
        if ((double)class084792.Ny < 0.01) {
            return;
        }
        float f3 = 13.0f;
        float f4 = (Math.abs((class084792.NN + 6.0f) % 13.0f - 6.5f) - 3.25f) / 3.25f;
        class014212.N((Quaternionfc)class02058.R.N(6.5f * f4));
    }

    public class01894 N(class08479 class084792) {
        return N;
    }
}

