/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class06333
 *  minecraft.class08358
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class01894;
import minecraft.class06333;
import minecraft.class08358;
import minecraft.class08811;
import minecraft.class08818;
import minecraft.class08821;
import minecraft.class08832;
import minecraft.class08834;
import minecraft.class08840;
import minecraft.class08841;
import minecraft.class08843;

public class class08835 {
    public static final class06333<class01894, MapCodec<? extends class08843>> N = new class06333();
    public static final Codec<class08843> y = N.N(class01894.N).dispatch(class08843::N, mapCodec -> mapCodec);

    public static void N() {
        N.N((Object)class01894.y((String)"custom_model_data"), class08818.N);
        N.N((Object)class01894.y((String)"constant"), class08834.N);
        N.N((Object)class01894.y((String)"dye"), class08840.N);
        N.N((Object)class01894.y((String)"grass"), class08832.N);
        N.N((Object)class01894.y((String)"firework"), class08821.N);
        N.N((Object)class01894.y((String)"potion"), class08811.N);
        N.N((Object)class01894.y((String)"map_color"), class08841.N);
        N.N((Object)class01894.y((String)"team"), (Object)class08358.N);
    }
}

