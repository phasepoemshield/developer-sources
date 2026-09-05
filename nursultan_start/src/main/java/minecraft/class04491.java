/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 *  minecraft.class06510
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import minecraft.class06338;
import minecraft.class06510;

public final class class04491
extends Record {
    final Map<Character, class06510> key;
    final List<String> pattern;
    private static final Codec<List<String>> u = Codec.STRING.listOf().comapFlatMap(list -> {
        if (list.size() > 3) {
            return DataResult.error(() -> "Invalid pattern: too many rows, 3 is maximum");
        }
        if (list.isEmpty()) {
            return DataResult.error(() -> "Invalid pattern: empty pattern not allowed");
        }
        int n = ((String)list.getFirst()).length();
        for (String string : list) {
            if (string.length() > 3) {
                return DataResult.error(() -> "Invalid pattern: too many columns, 3 is maximum");
            }
            if (n == string.length()) continue;
            return DataResult.error(() -> "Invalid pattern: each row must be the same width");
        }
        return DataResult.success((Object)list);
    }, Function.identity());
    private static final Codec<Character> i = Codec.STRING.comapFlatMap(string -> {
        if (string.length() != 1) {
            return DataResult.error(() -> "Invalid key entry: '" + string + "' is an invalid symbol (must be 1 character only).");
        }
        if (" ".equals(string)) {
            return DataResult.error(() -> "Invalid key entry: ' ' is a reserved symbol.");
        }
        return DataResult.success((Object)Character.valueOf(string.charAt(0)));
    }, String::valueOf);
    public static final MapCodec<class04491> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.y(i, (Codec)class06510.field_46095).fieldOf("key").forGetter(class044912 -> class044912.key), (App)u.fieldOf("pattern").forGetter(class044912 -> class044912.pattern)).apply(instance, class04491::new));

    public class04491(Map<Character, class06510> map, List<String> list) {
        this.key = map;
        this.pattern = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04491.class, "key;pattern", "key", "pattern"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04491.class, "key;pattern", "key", "pattern"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04491.class, "key;pattern", "key", "pattern"}, this);
    }

    public List<String> y() {
        return this.pattern;
    }

    public Map<Character, class06510> N() {
        return this.key;
    }
}

