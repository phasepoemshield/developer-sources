/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class01281
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06338
 *  minecraft.class08752
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import minecraft.class01281;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06338;
import minecraft.class08752;
import minecraft.class09039;

public interface class09037 {
    public static final Codec<Integer> y = class06338.N((int)1, (int)1024);
    public static final Codec<class09037> L = class04206.No.T().dispatch(class09037::N, mapCodec -> mapCodec);
    public static final Codec<class03556<class09037>> u = class01281.N((class05946)class04227.yL, L);
    public static final Codec<class03543<class09037>> i = class03541.N((class05946)class04227.yL, L);
    public static final class02362<class04247, class03556<class09037>> R = class02389.N((class05946)class04227.yL, (class02362)class02389.L(L));
    public static final class02362<ByteBuf, class09037> M = class02389.N(L);

    public Optional<class08752> u();

    public MapCodec<? extends class09037> N();

    public class09039 H_();
}

