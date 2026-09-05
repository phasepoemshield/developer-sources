/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class01757;
import minecraft.class01759;
import minecraft.class01762;
import minecraft.class01782;
import minecraft.class01784;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;

public class class01787 {
    public static final MapCodec<class01762> N = class04206.NE.T().dispatchMap(class01762::N, class01757::N);
    public static final Codec<class01762> y = N.codec();
    public static final class02362<class04247, class01762> L = class02389.N((class05946)class04227.NR).y(class01762::N, class01757::y);
    public static final class02362<class04247, Optional<class01762>> u = L.N_33(class02389::N);

    public static class01757<?> N(class00751<class01757<?>> class007512) {
        class00751.N(class007512, (String)"blank", class01784.y);
        class00751.N(class007512, (String)"styled", class01759.N);
        return (class01757)class00751.N(class007512, (String)"fixed", class01782.N);
    }
}

