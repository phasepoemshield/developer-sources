/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01281
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00193;
import minecraft.class00196;
import minecraft.class00206;
import minecraft.class00215;
import minecraft.class00227;
import minecraft.class00751;
import minecraft.class01281;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class05946;

public interface class00225 {
    public static final Codec<class00225> N = class04206.Ng.T().dispatch(class00225::N, mapCodec -> mapCodec);
    public static final Codec<class03556<class00225>> y = class01281.N((class05946)class04227.yn, N);

    default public void y(class04782 class047822) {
    }

    public static MapCodec<? extends class00225> N(class00751<MapCodec<? extends class00225>> class007512) {
        class00751.N(class007512, (String)"all_of", class00227.L);
        class00751.N(class007512, (String)"game_rules", class00206.L);
        class00751.N(class007512, (String)"time_of_day", class00215.L);
        class00751.N(class007512, (String)"weather", class00193.L);
        return (MapCodec)class00751.N(class007512, (String)"function", class00196.L);
    }

    public MapCodec<? extends class00225> N();

    public void N(class04782 var1);
}

