/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01894
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import minecraft.class01894;
import minecraft.class06338;

public class class04421 {
    public static final Codec<class04421> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.G.optionalFieldOf("namespace").forGetter(class044212 -> class044212.y), (App)class06338.G.optionalFieldOf("path").forGetter(class044212 -> class044212.u)).apply(instance, class04421::new));
    private final Optional<Pattern> y;
    private final Predicate<String> L;
    private final Optional<Pattern> u;
    private final Predicate<String> i;
    private final Predicate<class01894> R;

    public Predicate<class01894> L() {
        return this.R;
    }

    private class04421(Optional<Pattern> optional, Optional<Pattern> optional2) {
        this.y = optional;
        this.L = optional.map(Pattern::asPredicate).orElse(string -> true);
        this.u = optional2;
        this.i = optional2.map(Pattern::asPredicate).orElse(string -> true);
        this.R = class018942 -> this.L.test(class018942.y()) && this.i.test(class018942.N());
    }

    public Predicate<String> y() {
        return this.i;
    }

    public Predicate<String> N() {
        return this.L;
    }
}

