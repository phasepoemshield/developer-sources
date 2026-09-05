/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class02477
 *  minecraft.class02820
 *  minecraft.class02830
 *  minecraft.class02854
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class02477;
import minecraft.class02820;
import minecraft.class02830;
import minecraft.class02854;
import minecraft.class02928;
import minecraft.class02940;
import minecraft.class02946;
import minecraft.class02948;
import minecraft.class04206;

public interface class02936 {
    public static final class02928<class02854> N = new class02948();
    public static final class02928<class02830> y = new class02940();
    public static final class02928<class02820> L = new class02946();
    public static final Map<class02477<?>, class02928<?>> u = Stream.of(N, y, L).collect(Collectors.toMap(class02928::N, class029282 -> class029282));
    public static final Codec<class02928<?>> i = class04206.NW.T().comapFlatMap(class024772 -> {
        class02928<?> var1 = u.get(class024772);
        return var1 != null ? DataResult.success(var1) : DataResult.error(() -> "No items in component");
    }, class02928::N);
}

