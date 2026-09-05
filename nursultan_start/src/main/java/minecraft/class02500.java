/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02666
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02470;
import minecraft.class02487;
import minecraft.class02666;
import minecraft.class04247;

public interface class02500 {
    public static final Codec<Map<class02487<?>, class02500>> y = Codec.dispatchedMap(class02487.N, class02487::L);
    public static final class02362<class04247, class02470<?>> L = class02487.y.y(class02470::N, class02487::i);
    public static final class02362<class04247, Map<class02487<?>, class02500>> u = L.N_33(class02389.L((int)64)).N_10(list -> list.stream().collect(Collectors.toMap(class02470::N, class02470::y)), map -> map.entrySet().stream().map(class02470::N).toList());

    public static MapCodec<class02470<?>> N(String string) {
        return class02487.N.dispatchMap(string, class02470::N, class02487::u);
    }

    public boolean N(class02666 var1);
}

