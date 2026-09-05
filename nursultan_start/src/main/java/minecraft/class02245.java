/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01097
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class02689
 *  minecraft.class03359
 *  minecraft.class06078
 *  minecraft.class06230
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07030
 *  minecraft.class07032
 *  minecraft.class07311
 *  minecraft.class07536
 *  minecraft.class07949
 *  minecraft.class08476
 *  org.joml.Quaternionfc
 */
package minecraft;

import java.util.function.Function;
import minecraft.class01097;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class02221;
import minecraft.class02689;
import minecraft.class03359;
import minecraft.class06078;
import minecraft.class06230;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07030;
import minecraft.class07032;
import minecraft.class07311;
import minecraft.class07536;
import minecraft.class07949;
import minecraft.class08476;
import org.joml.Quaternionfc;

public class class02245<S extends class08476, M extends class06078<S>>
extends class06249<S, M> {
    private static final float N = 0.625f;
    private static final float y = 1.1875f;
    private final class02221 L;
    private final Function<class07030, class01097> u;
    private final class07949 i;

    public class02245(class06252<S, M> class062522, class01140 class011402, class07949 class079492) {
        this(class062522, class011402, class079492, class02221.N);
    }

    public class02245(class06252<S, M> class062522, class01140 class011402, class07949 class079492, class02221 class022212) {
        super(class062522);
        this.L = class022212;
        this.u = class07536.y_4(class070302 -> class03359.N((class01140)class011402, (class07030)class070302));
        this.i = class079492;
    }

    public static void N(class01421 class014212, class02221 class022212) {
        class014212.N(0.0f, -0.25f + class022212.N(), 0.0f);
        class014212.N((Quaternionfc)class02058.u.N(180.0f));
        class014212.y(0.625f, -0.625f, -0.625f);
    }

    private class07311 N(class08476 class084762, class07030 class070302) {
        class02689 class026892;
        if (class070302 == class07032.field_11510 && (class026892 = class084762.Nb) != null) {
            return this.i.N(class026892).L();
        }
        return class03359.N((class07030)class070302, null);
    }

    public void N(class01421 class014212, class01237 class012372, int n, S s, float f, float f2) {
        if (((class08476)s).NP.i() && ((class08476)s).NT == null) {
            return;
        }
        class014212.N();
        class014212.y(this.L.L(), 1.0f, this.L.L());
        class06078 class060782 = this.u();
        class060782.method_63512().N(class014212);
        ((class06230)class060782).N(class014212);
        if (((class08476)s).NT != null) {
            class014212.N(0.0f, this.L.y(), 0.0f);
            class014212.y(1.1875f, -1.1875f, -1.1875f);
            class014212.N(-0.5, 0.0, -0.5);
            class07030 class070302 = ((class08476)s).NT;
            class01097 class010972 = this.u.apply(class070302);
            class07311 class073112 = this.N((class08476)s, class070302);
            class03359.N(null, (float)180.0f, (float)((class08476)s).Ns, (class01421)class014212, (class01237)class012372, (int)n, (class01097)class010972, (class07311)class073112, (int)((class08476)s).l, null);
        } else {
            class02245.N(class014212, this.L);
            ((class08476)s).NP.N(class014212, class012372, n, class01384.u, ((class08476)s).l);
        }
        class014212.y();
    }
}

