/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class02514
 *  minecraft.class02516
 *  minecraft.class02524
 *  minecraft.class02529
 *  minecraft.class02532
 *  minecraft.class02537
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class00751;
import minecraft.class02514;
import minecraft.class02516;
import minecraft.class02524;
import minecraft.class02529;
import minecraft.class02532;
import minecraft.class02537;
import minecraft.class02563;
import minecraft.class04206;

public interface class02546 {
    public static final Codec<class02546> N = class04206.Nj.T().dispatch(class02546::N, mapCodec -> mapCodec);
    public static final Codec<class02546> y = Codec.either((Codec)class02514.L, N).xmap(either -> (class02546)either.map(class025142 -> class025142, class025462 -> class025462), class025462 -> class025462 instanceof class02514 ? Either.left((Object)((class02514)class025462)) : Either.right((Object)class025462));

    public static class02532 y(float f) {
        return class02546.N(f, f);
    }

    public static MapCodec<? extends class02546> N(class00751<MapCodec<? extends class02546>> class007512) {
        class00751.N(class007512, (String)"clamped", (Object)class02524.L);
        class00751.N(class007512, (String)"fraction", (Object)class02537.L);
        class00751.N(class007512, (String)"levels_squared", class02563.L);
        class00751.N(class007512, (String)"linear", (Object)class02532.L);
        class00751.N(class007512, (String)"exponent", (Object)class02529.L);
        return (MapCodec)class00751.N(class007512, (String)"lookup", (Object)class02516.L);
    }

    public static class02514 N(float f) {
        return new class02514(f);
    }

    public static class02532 N(float f, float f2) {
        return new class02532(f, f2);
    }

    public static class02516 N(List<Float> list, class02546 class025462) {
        return new class02516(list, class025462);
    }

    public float N(int var1);

    public MapCodec<? extends class02546> N();
}

