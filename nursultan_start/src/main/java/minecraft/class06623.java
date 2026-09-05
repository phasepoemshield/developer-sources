/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00397
 *  minecraft.class00403
 *  minecraft.class01449
 *  minecraft.class03748
 *  minecraft.class04457
 *  minecraft.class06333
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00397;
import minecraft.class00403;
import minecraft.class01449;
import minecraft.class03748;
import minecraft.class04457;
import minecraft.class06333;

public class class06623 {
    private static final class06333<String, MapCodec<? extends class04457>> y = new class06333();
    public static final MapCodec<class04457> N = class03748.N(y, class04457::N, (String)"source");

    static {
        y.N((Object)"entity", (Object)class00403.N);
        y.N((Object)"block", (Object)class00397.N);
        y.N((Object)"storage", (Object)class01449.N);
    }
}

