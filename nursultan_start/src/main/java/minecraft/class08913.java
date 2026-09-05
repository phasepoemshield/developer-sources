/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class06333
 *  minecraft.class08374
 *  minecraft.class08830
 *  minecraft.class08845
 *  minecraft.class08895
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class01894;
import minecraft.class06333;
import minecraft.class08374;
import minecraft.class08830;
import minecraft.class08845;
import minecraft.class08895;
import minecraft.class08904;
import minecraft.class08920;
import minecraft.class08922;
import minecraft.class08927;
import minecraft.class08932;

public class class08913 {
    public static final class06333<class01894, MapCodec<? extends class08895>> N = new class06333();
    public static final Codec<class08895> y = N.N(class01894.N).dispatch(class08895::method_65585, mapCodec -> mapCodec);

    public static void N() {
        N.N((Object)class01894.y((String)"empty"), (Object)class08374.N);
        N.N((Object)class01894.y((String)"model"), (Object)class08845.N);
        N.N((Object)class01894.y((String)"range_dispatch"), class08920.N);
        N.N((Object)class01894.y((String)"special"), class08922.N);
        N.N((Object)class01894.y((String)"composite"), class08904.N);
        N.N((Object)class01894.y((String)"bundle/selected_item"), (Object)class08830.N);
        N.N((Object)class01894.y((String)"select"), class08932.N);
        N.N((Object)class01894.y((String)"condition"), class08927.N);
    }
}

