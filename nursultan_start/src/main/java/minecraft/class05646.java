/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class07049
 *  minecraft.class07324
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class04782;
import minecraft.class05645;
import minecraft.class05660;
import minecraft.class05663;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class07049;
import minecraft.class07324;
import org.jspecify.annotations.Nullable;

public final class class05646
extends Record
implements class05663 {
    private final Map<class05946<class05660>, class05663> trades;

    public class05646(Map<class05946<class05660>, class05663> map) {
        this.trades = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05646.class, "trades", "trades"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05646.class, "trades", "trades"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05646.class, "trades", "trades"}, this);
    }

    public Map<class05946<class05660>, class05663> N() {
        return this.trades;
    }

    @SafeVarargs
    public static class05646 N(class05663 class056632, class05946<class05660> ... class05946Array) {
        return new class05646(Arrays.stream(class05946Array).collect(Collectors.toMap(class059462 -> class059462, class059462 -> class056632)));
    }

    @Override
    public @Nullable class07324 N(class04782 class047822, class07049 class070492, class06069 class060692) {
        if (class070492 instanceof class05645) {
            class05946 var5 = ((class05645)class070492).t().N().i().orElse(null);
            if (var5 == null) {
                return null;
            }
            class05663 class056632 = this.trades.get(var5);
            if (class056632 == null) {
                return null;
            }
            return class056632.N(class047822, class070492, class060692);
        }
        return null;
    }
}

