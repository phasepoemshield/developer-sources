/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class08547;
import minecraft.class08561;
import minecraft.class08563;
import minecraft.class08568;

public class class08587 {
    public static MapCodec<? extends class08568> N(class00751<MapCodec<? extends class08568>> class007512) {
        class00751.N(class007512, (String)"structure", class08547.N);
        class00751.N(class007512, (String)"moon_brightness", class08563.N);
        return (MapCodec)class00751.N(class007512, (String)"biome", class08561.N);
    }
}

