/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01686
 *  minecraft.class04806
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01125;
import minecraft.class01134;
import minecraft.class01686;
import minecraft.class04806;

public class class01140 {
    public static final class01140 N = new class01140(Map.of());
    private final Map<class01134, class04806> y;

    public class01140(Map<class01134, class04806> map) {
        this.y = map;
    }

    public class01686 N(class01134 class011342) {
        class04806 class048062 = this.y.get((Object)class011342);
        if (class048062 == null) {
            throw new IllegalArgumentException("No model for layer " + String.valueOf((Object)class011342));
        }
        return class048062.N();
    }

    public static class01140 N() {
        return new class01140((Map<class01134, class04806>)ImmutableMap.copyOf(class01125.N()));
    }
}

