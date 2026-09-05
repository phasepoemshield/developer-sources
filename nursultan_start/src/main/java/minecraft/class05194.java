/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class06541
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class06541;
import org.jspecify.annotations.Nullable;

public final class class05194 {
    private static final String y = "#";
    public static final Codec<class05194> N = Codec.STRING.comapFlatMap(class05194::N, class05194::y);
    private static final Map<class06541, class05194> L = (Map)Stream.of(class06541.values()).filter(class06541::u).collect(ImmutableMap.toImmutableMap(Function.identity(), class065412 -> new class05194(class065412.i(), class065412.R())));
    private static final Map<String, class05194> u = (Map)L.values().stream().collect(ImmutableMap.toImmutableMap(class051942 -> class051942.R, Function.identity()));
    private final int i;
    private final @Nullable String R;

    public final String L() {
        return String.format(Locale.ROOT, "#%06X", this.i);
    }

    private class05194(int n, String string) {
        this.i = n & 0xFFFFFF;
        this.R = string;
    }

    private class05194(int n) {
        this.i = n & 0xFFFFFF;
        this.R = null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class05194 class051942 = (class05194)object;
        return this.i == class051942.i;
    }

    public String toString() {
        return this.y();
    }

    public int hashCode() {
        return Objects.hash(this.i, this.R);
    }

    public String y() {
        return this.R != null ? this.R : this.L();
    }

    public static @Nullable class05194 N(class06541 class065412) {
        return L.get(class065412);
    }

    public static class05194 N(int n) {
        return new class05194(n);
    }

    public int N() {
        return this.i;
    }

    public static DataResult<class05194> N(String string) {
        if (string.startsWith(y)) {
            try {
                int n = Integer.parseInt(string.substring(1), 16);
                if (n < 0 || n > 0xFFFFFF) {
                    return DataResult.error(() -> "Color value out of range: " + string);
                }
                return DataResult.success((Object)class05194.N(n), (Lifecycle)Lifecycle.stable());
            }
            catch (NumberFormatException numberFormatException) {
                return DataResult.error(() -> "Invalid color value: " + string);
            }
        }
        class05194 class051942 = u.get(string);
        if (class051942 == null) {
            return DataResult.error(() -> "Invalid color name: " + string);
        }
        return DataResult.success((Object)class051942, (Lifecycle)Lifecycle.stable());
    }
}

