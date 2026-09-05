/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00133
 *  minecraft.class00751
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00133;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class08751;
import minecraft.class08752;
import minecraft.class08775;

public class class08747 {
    public static MapCodec<? extends class08752> N(class00751<MapCodec<? extends class08752>> class007512) {
        class08751.N.forEach((class006542, mapCodec) -> class00751.N((class00751)class007512, (class01894)class01894.y((String)class006542.method_15434()), (Object)mapCodec));
        class00751.N(class007512, (class01894)class01894.y((String)"dynamic/run_command"), (Object)class00133.N);
        return (MapCodec)class00751.N(class007512, (class01894)class01894.y((String)"dynamic/custom"), class08775.N);
    }
}

