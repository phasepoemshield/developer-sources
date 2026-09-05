/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class08190
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class08159;
import minecraft.class08179;
import minecraft.class08190;

public class class08183 {
    public static MapCodec<? extends class08159> N(class00751<MapCodec<? extends class08159>> class007512) {
        class00751.N(class007512, (class01894)class01894.y((String)"atom"), (Object)class08190.L);
        return (MapCodec)class00751.N(class007512, (class01894)class01894.y((String)"command_level"), class08179.L);
    }
}

