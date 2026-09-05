/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class01927
 *  minecraft.class02709
 *  minecraft.class03024
 *  minecraft.class03367
 *  minecraft.class03626
 *  minecraft.class03798
 *  minecraft.class04129
 *  minecraft.class04206
 *  minecraft.class04289
 *  minecraft.class04559
 *  minecraft.class05950
 *  minecraft.class07577
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class01927;
import minecraft.class02709;
import minecraft.class03024;
import minecraft.class03367;
import minecraft.class03626;
import minecraft.class03798;
import minecraft.class04129;
import minecraft.class04206;
import minecraft.class04289;
import minecraft.class04559;
import minecraft.class05950;
import minecraft.class07577;

public class class03942 {
    public static final Codec<class04129> N = class04206.O.T().dispatch(class04129::N, class05950::N);
    public static final class05950 y = class03942.N("empty", (MapCodec<? extends class04129>)class03626.N);
    public static final class05950 L = class03942.N("item", (MapCodec<? extends class04129>)class03798.N);
    public static final class05950 u = class03942.N("loot_table", (MapCodec<? extends class04129>)class03367.N);
    public static final class05950 i = class03942.N("dynamic", (MapCodec<? extends class04129>)class03024.N);
    public static final class05950 R = class03942.N("tag", (MapCodec<? extends class04129>)class04289.N);
    public static final class05950 M = class03942.N("slots", (MapCodec<? extends class04129>)class07577.N);
    public static final class05950 B = class03942.N("alternatives", (MapCodec<? extends class04129>)class04559.N);
    public static final class05950 Z = class03942.N("sequence", (MapCodec<? extends class04129>)class01927.N);
    public static final class05950 z = class03942.N("group", (MapCodec<? extends class04129>)class02709.N);

    private static class05950 N(String string, MapCodec<? extends class04129> mapCodec) {
        return (class05950)class00751.N((class00751)class04206.O, (class01894)class01894.y((String)string), (Object)new class05950(mapCodec));
    }
}

