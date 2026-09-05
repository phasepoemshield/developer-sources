/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02795
 *  minecraft.class04388
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class07883
 *  minecraft.class08255
 *  minecraft.class08476
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02795;
import minecraft.class04388;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class07883;
import minecraft.class08255;
import minecraft.class08476;
import org.joml.Quaternionfc;

public class class02650<T extends class07883>
extends class02795<T, class08255, class04388> {
    private static final class01894 N = class01894.y((String)"textures/entity/squid/squid.png");

    public class02650(class04832 class048322, class04388 class043882, class04388 class043883) {
        super(class048322, (class06078)class043882, (class06078)class043883, 0.7f);
    }

    public class08255 method_55269() {
        return new class08255();
    }

    public void method_62354(T t, class08255 class082552, float f) {
        super.method_62354(t, (class08476)class082552, f);
        class082552.N = class04995.B((float)f, (float)((class07883)t).B, (float)((class07883)t).M);
        class082552.y = class04995.B((float)f, (float)((class07883)t).y, (float)((class07883)t).N);
        class082552.L = class04995.B((float)f, (float)((class07883)t).u, (float)((class07883)t).L);
    }

    protected void y(class08255 class082552, class01421 class014212, float f, float f2) {
        class014212.N(0.0f, class082552.NB ? 0.25f : 0.5f, 0.0f);
        class014212.N((Quaternionfc)class02058.u.N(180.0f - f));
        class014212.N((Quaternionfc)class02058.y.N(class082552.y));
        class014212.N((Quaternionfc)class02058.u.N(class082552.L));
        class014212.N(0.0f, class082552.NB ? -0.6f : -1.2f, 0.0f);
    }

    public class01894 N(class08255 class082552) {
        return N;
    }
}

