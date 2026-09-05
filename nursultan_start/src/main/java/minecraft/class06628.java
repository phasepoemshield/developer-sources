/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00926
 *  minecraft.class00942
 *  minecraft.class03748
 *  minecraft.class06333
 *  minecraft.class06609
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00926;
import minecraft.class00942;
import minecraft.class03748;
import minecraft.class06333;
import minecraft.class06609;

public class class06628 {
    private static final class06333<String, MapCodec<? extends class00926>> y = new class06333();
    public static final MapCodec<class00926> N = class03748.N(y, class00926::N, (String)"object");

    static {
        y.N((Object)"atlas", (Object)class00942.y);
        y.N((Object)"player", (Object)class06609.N);
    }
}

