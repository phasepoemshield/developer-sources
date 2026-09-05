/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02294
 *  minecraft.class06078
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class08476
 *  minecraft.class08800
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02294;
import minecraft.class06078;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class08476;
import minecraft.class08800;

public abstract class class06249<S extends class08800, M extends class06078<? super S>> {
    private final class06252<S, M> N;

    public class06249(class06252<S, M> class062522) {
        this.N = class062522;
    }

    public M u() {
        return this.N.L();
    }

    protected static <S extends class08476> void y(class06271<? super S> class062712, class01894 class018942, class01421 class014212, class01237 class012372, int n, S s, int n2, int n3) {
        class012372.N(n3).N(class062712, s, class014212, class06851.M((class01894)class018942), n, class02294.N(s, (float)0.0f), n2, null, s.l, null);
    }

    protected static <S extends class08476> void N(class06271<? super S> class062712, class01894 class018942, class01421 class014212, class01237 class012372, int n, S s, int n2, int n3) {
        if (!s.v) {
            class06249.y(class062712, class018942, class014212, class012372, n, s, n2, n3);
        }
    }

    public abstract void N(class01421 var1, class01237 var2, int var3, S var4, float var5, float var6);
}

