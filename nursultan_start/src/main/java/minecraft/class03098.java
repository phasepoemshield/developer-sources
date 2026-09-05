/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class05281
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import minecraft.class03129;
import minecraft.class05281;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class07209;

@FunctionalInterface
public interface class03098 {
    public static final class03098 N = class059462 -> class059462;

    public class05946<class05281> lookup(class05946<class05281> var1);

    public static class03098 N(List<class03129> list, class07209 class072092, long l) {
        if (list.isEmpty()) {
            return N;
        }
        class06069 class060692 = class06069.y((long)l).L().N(class072092);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        list.forEach(class031292 -> class031292.N(class060692, (arg_0, arg_1) -> ((ImmutableMap.Builder)builder).put(arg_0, arg_1)));
        return arg_0 -> class03098.N((Map)builder.build(), arg_0);
    }

    private static /* synthetic */ class05946 N(Map map, class05946 class059462) {
        return Objects.requireNonNull(map.getOrDefault(class059462, class059462), () -> "alias " + String.valueOf(class059462.N()) + " was mapped to null value");
    }
}

