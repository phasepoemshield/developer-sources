/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06052
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class04995;
import minecraft.class06052;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

final class class01183 {
    private final int N;
    private final @Nullable class06889 y;

    class01183(int n, class06069 class060692, class06052 class060522) {
        this.N = n;
        float f = class060522.N(class060692);
        float f2 = class04995.y((class06069)class060692, (float)0.0f, (float)((float)Math.PI));
        this.y = new class06889((double)(class04995.P((double)f2) * f), 0.0, (double)(class04995.m((double)f2) * f));
    }

    private class01183() {
        this.N = 0;
        this.y = null;
    }

    class07209 N(class07209 class072092) {
        if (this.y == null) {
            return class072092;
        }
        int n = this.N - class072092.method_10264();
        class06889 class068892 = this.y.L((double)n);
        return class072092.method_10069(class04995.N((double)class068892.M), 0, class04995.N((double)class068892.Z));
    }

    static class01183 N() {
        return new class01183();
    }
}

