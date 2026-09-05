/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class00765
 *  minecraft.class00782
 *  minecraft.class00787
 *  minecraft.class05997
 *  minecraft.class07663
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class00765;
import minecraft.class00782;
import minecraft.class00787;
import minecraft.class05997;
import minecraft.class07663;

public class class03939 {
    public static MapCodec<? extends class00765> N(class00751<MapCodec<? extends class00765>> class007512) {
        class00751.N(class007512, (String)"fixed", (Object)class00782.y);
        class00751.N(class007512, (String)"multi_noise", (Object)class05997.L);
        class00751.N(class007512, (String)"checkerboard", (Object)class00787.y);
        return (MapCodec)class00751.N(class007512, (String)"the_end", (Object)class07663.y);
    }
}

