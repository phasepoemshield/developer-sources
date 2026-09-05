/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class02325
 *  minecraft.class08886
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.stream.IntStream;
import minecraft.class00157;
import minecraft.class00170;
import minecraft.class02325;
import minecraft.class08886;
import org.jspecify.annotations.Nullable;

final class class00186
extends class08886 {
    class00186(String string, int n, class00157 class001572, class00157 ... class00157Array) {
        super(string, n, class001572, class00157Array);
    }

    public <T> T N(DynamicOps<T> dynamicOps) {
        return (T)dynamicOps.createIntList(IntStream.empty());
    }

    public <T> @Nullable T N(DynamicOps<T> dynamicOps, List<class00170> list, class02325<?> class023252) {
        IntStream.Builder builder = IntStream.builder();
        for (class00170 class001702 : list) {
            Number number = this.N(class001702, class023252);
            if (number == null) {
                return null;
            }
            builder.add(number.intValue());
        }
        return (T)dynamicOps.createIntList(builder.build());
    }
}

