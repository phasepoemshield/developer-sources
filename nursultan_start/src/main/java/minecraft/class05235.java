/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01201
 *  minecraft.class01219
 *  minecraft.class01249
 *  minecraft.class01281
 *  minecraft.class03442
 *  minecraft.class03556
 *  minecraft.class03564
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05077
 *  minecraft.class05083
 *  minecraft.class05483
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01201;
import minecraft.class01219;
import minecraft.class01249;
import minecraft.class01281;
import minecraft.class03442;
import minecraft.class03556;
import minecraft.class03564;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05077;
import minecraft.class05083;
import minecraft.class05239;
import minecraft.class05242;
import minecraft.class05255;
import minecraft.class05273;
import minecraft.class05282;
import minecraft.class05483;
import minecraft.class05946;

public interface class05235<P extends class01219> {
    public static final Codec<class01219> N = class04206.NR.T().dispatch("processor_type", class01219::N, class05235::codec);
    public static final Codec<class05483> y = N.listOf().xmap(class05483::new, class05483::N);
    public static final Codec<class05483> L = Codec.withAlternative((Codec)y.fieldOf("processors").codec(), y);
    public static final Codec<class03556<class05483>> u = class01281.N((class05946)class04227.yT, L);
    public static final class05235<class05282> i = class05235.N("block_ignore", class05282.N);
    public static final class05235<class01201> R = class05235.N("block_rot", class01201.N);
    public static final class05235<class05239> M = class05235.N("gravity", class05239.N);
    public static final class05235<class05255> B = class05235.N("jigsaw_replacement", class05255.N);
    public static final class05235<class05273> Z = class05235.N("rule", class05273.N);
    public static final class05235<class05242> z = class05235.N("nop", class05242.N);
    public static final class05235<class05083> U = class05235.N("block_age", class05083.N);
    public static final class05235<class05077> E = class05235.N("blackstone_replace", class05077.N);
    public static final class05235<class01249> W = class05235.N("lava_submerged_block", class01249.N);
    public static final class05235<class03442> m = class05235.N("protected_blocks", class03442.y);
    public static final class05235<class03564> P = class05235.N("capped", class03564.N);

    public static <P extends class01219> class05235<P> N(String string, MapCodec<P> mapCodec) {
        return (class05235)class00751.N((class00751)class04206.NR, (String)string, () -> mapCodec);
    }

    public MapCodec<P> codec();
}

