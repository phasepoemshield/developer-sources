/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class08149;
import minecraft.class08160;
import minecraft.class08164;

public class class08171 {
    public static MapCodec<? extends class08164> N(class00751<MapCodec<? extends class08164>> class007512) {
        class00751.N(class007512, (class01894)class01894.y((String)"always_pass"), class08160.L);
        return (MapCodec)class00751.N(class007512, (class01894)class01894.y((String)"require"), class08149.y);
    }
}

