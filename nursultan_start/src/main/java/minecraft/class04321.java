/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02142
 *  minecraft.class02151
 *  minecraft.class06041
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class02142;
import minecraft.class02151;
import minecraft.class04323;
import minecraft.class06041;
import minecraft.class06069;
import minecraft.class07209;

public class class04321
extends class06041 {
    public static final MapCodec<class04321> N = class02142.N((int)0, (int)256).fieldOf("count").xmap(class04321::new, class043212 -> class043212.L);
    private final class02142 L;

    private class04321(class02142 class021422) {
        this.L = class021422;
    }

    protected int N(class06069 class060692, class07209 class072092) {
        return this.L.N(class060692);
    }

    public class04323<?> N() {
        return class04323.R;
    }

    public static class04321 N(class02142 class021422) {
        return new class04321(class021422);
    }

    public static class04321 N(int n) {
        return class04321.N((class02142)class02151.N((int)n));
    }
}

