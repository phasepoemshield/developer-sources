/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01365
 *  minecraft.class01406
 *  minecraft.class02640
 *  minecraft.class03622
 *  minecraft.class04206
 *  minecraft.class04558
 *  minecraft.class08219
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01365;
import minecraft.class01406;
import minecraft.class02640;
import minecraft.class03622;
import minecraft.class03638;
import minecraft.class04206;
import minecraft.class04558;
import minecraft.class08219;

public class class03631 {
    public static final MapCodec<class04558> N = class03631.N("lightning", class04558.N);
    public static final MapCodec<class01365> y = class03631.N("fishing_hook", class01365.y);
    public static final MapCodec<class01406> L = class03631.N("player", class01406.y);
    public static final MapCodec<class03638> u = class03631.N("slime", class03638.N);
    public static final MapCodec<class02640> i = class03631.N("raider", class02640.N);
    public static final MapCodec<class08219> R = class03631.N("sheep", class08219.N);

    private static <T extends class03622> MapCodec<T> N(String string, MapCodec<T> mapCodec) {
        return (MapCodec)class00751.N((class00751)class04206.NP, (String)string, mapCodec);
    }

    public static MapCodec<? extends class03622> N(class00751<MapCodec<? extends class03622>> class007512) {
        return N;
    }
}

