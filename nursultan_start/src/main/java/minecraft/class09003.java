/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class09034
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class09013;
import minecraft.class09022;
import minecraft.class09034;

public class class09003 {
    public static MapCodec<? extends class09034> N(class00751<MapCodec<? extends class09034>> class007512) {
        class00751.N(class007512, (class01894)class01894.y((String)"item"), class09013.L);
        return (MapCodec)class00751.N(class007512, (class01894)class01894.y((String)"plain_message"), class09022.u);
    }
}

