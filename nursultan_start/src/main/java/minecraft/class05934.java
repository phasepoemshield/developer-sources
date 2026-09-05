/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class06069
 *  org.apache.commons.lang3.StringUtils
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalLong;
import minecraft.class06069;
import org.apache.commons.lang3.StringUtils;

public class class05934 {
    public static final MapCodec<class05934> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.LONG.fieldOf("seed").stable().forGetter(class05934::L), (App)Codec.BOOL.fieldOf("generate_features").orElse((Object)true).stable().forGetter(class05934::u), (App)Codec.BOOL.fieldOf("bonus_chest").orElse((Object)false).stable().forGetter(class05934::i), (App)Codec.STRING.lenientOptionalFieldOf("legacy_custom_options").stable().forGetter(class059342 -> class059342.R)).apply(instance, instance.stable(class05934::new)));
    public static final class05934 y = new class05934("North Carolina".hashCode(), true, true);
    private final long L;
    private final boolean u;
    private final boolean i;
    private final Optional<String> R;

    public long L() {
        return this.L;
    }

    public static long M() {
        return class06069.u().B();
    }

    private class05934(long l, boolean bl, boolean bl2, Optional<String> optional) {
        this.L = l;
        this.u = bl;
        this.i = bl2;
        this.R = optional;
    }

    public class05934(long l, boolean bl, boolean bl2) {
        this(l, bl, bl2, Optional.empty());
    }

    public boolean i() {
        return this.i;
    }

    public boolean u() {
        return this.u;
    }

    public static class05934 y() {
        return new class05934(class05934.M(), false, false);
    }

    public class05934 y(boolean bl) {
        return new class05934(this.L, bl, this.i, this.R);
    }

    public static class05934 N() {
        return new class05934(class05934.M(), true, false);
    }

    public class05934 N(boolean bl) {
        return new class05934(this.L, this.u, bl, this.R);
    }

    public static OptionalLong N(String string) {
        if (StringUtils.isEmpty((CharSequence)(string = string.trim()))) {
            return OptionalLong.empty();
        }
        try {
            return OptionalLong.of(Long.parseLong(string));
        }
        catch (NumberFormatException numberFormatException) {
            return OptionalLong.of(string.hashCode());
        }
    }

    public class05934 N(OptionalLong optionalLong) {
        return new class05934(optionalLong.orElse(class05934.M()), this.u, this.i, this.R);
    }

    public boolean R() {
        return this.R.isPresent();
    }
}

