/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class01937
 *  minecraft.class01942
 *  minecraft.class01968
 *  minecraft.class01975
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class01937;
import minecraft.class01942;
import minecraft.class01968;
import minecraft.class01975;
import minecraft.class08092;

public class class08437 {
    private final ImmutableMap.Builder<String, class01968> N = ImmutableMap.builder();

    public final <T extends Comparable<T>> class08437 y(class08092<T> class080922, T t) {
        this.N(class080922, new class01968(List.of(new class01937(class080922.y(t), true))));
        return this;
    }

    public class01975 N() {
        return new class01942((Map)this.N.buildOrThrow());
    }

    @SafeVarargs
    public final <T extends Comparable<T>> class08437 N(class08092<T> class080922, T t, T ... TArray) {
        List list = Stream.concat(Stream.of(t), Stream.of(TArray)).map(arg_0 -> class080922.y(arg_0)).sorted().distinct().map(string -> new class01937(string, false)).toList();
        this.N(class080922, new class01968(list));
        return this;
    }

    public final <T extends Comparable<T>> class08437 N(class08092<T> class080922, T t) {
        this.N(class080922, new class01968(List.of(new class01937(class080922.y(t), false))));
        return this;
    }

    private <T extends Comparable<T>> void N(class08092<T> class080922, class01968 class019682) {
        this.N.put((Object)class080922.R(), (Object)class019682);
    }
}

