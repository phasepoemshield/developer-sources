/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class02515
 *  minecraft.class02530
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class02515;
import minecraft.class02530;
import minecraft.class02545;
import minecraft.class02555;

public interface class02561 {
    public static MapCodec<? extends class02530> N(class00751<MapCodec<? extends class02530>> class007512) {
        class00751.N(class007512, (String)"by_cost", (Object)class02515.y);
        class00751.N(class007512, (String)"by_cost_with_difficulty", class02545.L);
        return (MapCodec)class00751.N(class007512, (String)"single", class02555.y);
    }
}

