/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class09001
 *  minecraft.class09007
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class09001;
import minecraft.class09007;
import minecraft.class09024;
import minecraft.class09031;
import minecraft.class09037;
import minecraft.class09040;

public class class09028 {
    public static MapCodec<? extends class09037> N(class00751<MapCodec<? extends class09037>> class007512) {
        class00751.N(class007512, (String)"notice", class09024.B);
        class00751.N(class007512, (String)"server_links", (Object)class09001.N);
        class00751.N(class007512, (String)"dialog_list", class09040.N);
        class00751.N(class007512, (String)"multi_action", (Object)class09007.N);
        return (MapCodec)class00751.N(class007512, (String)"confirmation", class09031.N);
    }
}

