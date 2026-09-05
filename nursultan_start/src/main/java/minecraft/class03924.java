/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class04865
 *  minecraft.class07833
 *  minecraft.class07850
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class04865;
import minecraft.class07833;
import minecraft.class07850;
import minecraft.class08088;

public class class03924 {
    public static MapCodec<? extends class08088> N(class00751<MapCodec<? extends class08088>> class007512) {
        class00751.N(class007512, (String)"noise", (Object)class04865.u);
        class00751.N(class007512, (String)"flat", (Object)class07850.u);
        return (MapCodec)class00751.N(class007512, (String)"debug", (Object)class07833.u);
    }
}

