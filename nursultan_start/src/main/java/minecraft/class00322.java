/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00245
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class03971
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06851
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class00245;
import minecraft.class00292;
import minecraft.class00313;
import minecraft.class01894;
import minecraft.class02840;
import minecraft.class03971;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06851;
import minecraft.class08476;

public class class00322<T extends class00245>
extends class02840<T, class00292, class00313> {
    private static final class01894 N = class01894.y((String)"textures/entity/creaking/creaking.png");
    private static final class01894 i = class01894.y((String)"textures/entity/creaking/creaking_eyes.png");

    public class00322(class04832 class048322) {
        super(class048322, (class06078)new class00313(class048322.N(class04802.Nt)), 0.6f);
        this.N((class06249)new class03971((class06252)this, class002922 -> i, (class002922, f) -> class002922.u ? 1.0f : 0.0f, (class06078)new class00313(class048322.N(class04802.NG)), class06851::T, true));
    }

    public class00292 method_55269() {
        return new class00292();
    }

    public void method_62354(T t, class00292 class002922, float f) {
        super.method_62354(t, (class08476)class002922, f);
        class002922.y.N(((class00245)t).M);
        class002922.N.N(((class00245)t).B);
        class002922.L.N(((class00245)t).Z);
        if (t.W()) {
            class002922.r = 0.0f;
            class002922.NU = false;
            class002922.u = t.m();
        } else {
            class002922.u = t.v();
        }
        class002922.i = t.B();
    }

    public class01894 N(class00292 class002922) {
        return N;
    }
}

