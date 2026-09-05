/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class09035
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class08997;
import minecraft.class09011;
import minecraft.class09015;
import minecraft.class09020;
import minecraft.class09035;

public class class09018 {
    public static MapCodec<? extends class09015> N(class00751<MapCodec<? extends class09015>> class007512) {
        class00751.N(class007512, (class01894)class01894.y((String)"boolean"), class09020.N);
        class00751.N(class007512, (class01894)class01894.y((String)"number_range"), class09011.N);
        class00751.N(class007512, (class01894)class01894.y((String)"single_option"), class08997.N);
        return (MapCodec)class00751.N(class007512, (class01894)class01894.y((String)"text"), (Object)class09035.N);
    }
}

