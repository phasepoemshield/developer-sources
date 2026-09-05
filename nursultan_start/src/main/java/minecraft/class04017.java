/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class03005
 *  minecraft.class03011
 *  minecraft.class03017
 *  minecraft.class03020
 *  minecraft.class03022
 *  minecraft.class03033
 *  minecraft.class03034
 *  minecraft.class03035
 *  minecraft.class03037
 *  minecraft.class03979
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import minecraft.class00751;
import minecraft.class03005;
import minecraft.class03011;
import minecraft.class03017;
import minecraft.class03020;
import minecraft.class03022;
import minecraft.class03033;
import minecraft.class03034;
import minecraft.class03035;
import minecraft.class03037;
import minecraft.class03979;
import minecraft.class04018;
import minecraft.class04020;
import minecraft.class04034;
import minecraft.class04039;
import minecraft.class04040;
import minecraft.class04206;

public interface class04017
extends Function<class04039, class04018> {
    public static final Codec<class04017> L = class04206.Ny.T().dispatch(class040172 -> class040172.N().N(), Function.identity());

    public static MapCodec<? extends class04017> N(class00751<MapCodec<? extends class04017>> class007512) {
        class04020.N(class007512, "biome", class04034.N);
        class04020.N(class007512, "noise_threshold", class03011.u);
        class04020.N(class007512, "vertical_gradient", class03005.N);
        class04020.N(class007512, "y_above", class03022.i);
        class04020.N(class007512, "water", class03033.i);
        class04020.N(class007512, "temperature", class03017.field_35261);
        class04020.N(class007512, "steep", class03020.field_35255);
        class04020.N(class007512, "not", class03034.N);
        class04020.N(class007512, "hole", class04040.field_35244);
        class04020.N(class007512, "above_preliminary_surface", class03035.field_35601);
        return class04020.N(class007512, "stone_depth", class03037.i);
    }

    public class03979<? extends class04017> N();
}

