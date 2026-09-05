/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04814
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class07644
 *  minecraft.class08476
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04814;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class07644;
import minecraft.class08476;
import org.joml.Quaternionfc;

public class class01749
extends class02840<class07644, class08476, class04814> {
    private static final class01894 N = class01894.y((String)"textures/entity/fish/cod.png");

    public class01749(class04832 class048322) {
        super(class048322, (class06078)new class04814(class048322.N(class04802.Ny)), 0.3f);
    }

    protected void y(class08476 class084762, class01421 class014212, float f, float f2) {
        super.y(class084762, class014212, f, f2);
        float f3 = 4.3f * class04995.m((double)(0.6f * class084762.P));
        class014212.N((Quaternionfc)class02058.u.N(f3));
        if (!class084762.NZ) {
            class014212.N(0.1f, 0.1f, -0.1f);
            class014212.N((Quaternionfc)class02058.R.N(90.0f));
        }
    }

    public class08476 method_55269() {
        return new class08476();
    }

    public class01894 N(class08476 class084762) {
        return N;
    }
}

