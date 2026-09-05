/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01894
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import minecraft.class01894;
import minecraft.class08706;
import minecraft.class08719;
import minecraft.class08732;

public class class08704 {
    private final Map<class08719, List<class08706>> N = new EnumMap<class08719, List<class08706>>(class08719.class);

    class08704() {
    }

    public class08704 y(class01894 class018942, boolean bl) {
        return this.N(class08719.field_54125, class08706.N(class018942, bl));
    }

    public class08732 N() {
        return new class08732((Map)this.N.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, entry -> List.copyOf((Collection)entry.getValue()))));
    }

    public class08704 N(class08719 class087193, class08706 ... class08706Array) {
        Collections.addAll(this.N.computeIfAbsent(class087193, class087192 -> new ArrayList()), class08706Array);
        return this;
    }

    public class08704 N(class01894 class018942, boolean bl) {
        this.N(class08719.field_54126, class08706.N(class018942, bl));
        this.y(class018942, bl);
        return this;
    }

    public class08704 N(class01894 class018942) {
        return this.N(class018942, false);
    }
}

