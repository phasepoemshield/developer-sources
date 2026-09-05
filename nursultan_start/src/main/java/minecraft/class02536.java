/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class02544
 *  minecraft.class02547
 *  minecraft.class04206
 *  minecraft.class06069
 *  minecraft.class08150
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import minecraft.class00751;
import minecraft.class02519;
import minecraft.class02521;
import minecraft.class02527;
import minecraft.class02544;
import minecraft.class02547;
import minecraft.class04206;
import minecraft.class06069;
import minecraft.class08150;

public interface class02536 {
    public static final Codec<class02536> y = class04206.Nt.T().dispatch(class02536::N, Function.identity());

    public static MapCodec<? extends class02536> N(class00751<MapCodec<? extends class02536>> class007512) {
        class00751.N(class007512, (String)"add", class02527.N);
        class00751.N(class007512, (String)"all_of", (Object)class02547.N);
        class00751.N(class007512, (String)"multiply", (Object)class02544.N);
        class00751.N(class007512, (String)"remove_binomial", class02521.N);
        class00751.N(class007512, (String)"exponential", (Object)class08150.N);
        return (MapCodec)class00751.N(class007512, (String)"set", class02519.N);
    }

    public MapCodec<? extends class02536> N();

    public float N(int var1, class06069 var2, float var3);
}

