/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class04711
 *  minecraft.class04995
 *  minecraft.class05908
 *  minecraft.class06339
 *  minecraft.class06378
 *  minecraft.class07491
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import minecraft.class04711;
import minecraft.class04995;
import minecraft.class05353;
import minecraft.class05381;
import minecraft.class05908;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class07491;
import org.jspecify.annotations.Nullable;

public class class05338 {
    private static final Codec<class05338> y = RecordCodecBuilder.create(instance -> instance.group((App)class06339.N.optionalFieldOf("min").forGetter(class053382 -> Optional.ofNullable(class053382.L)), (App)class06339.N.optionalFieldOf("max").forGetter(class053382 -> Optional.ofNullable(class053382.u))).apply(instance, class05338::new));
    public static final Codec<class05338> N = Codec.either((Codec)Codec.INT, y).xmap(either -> (class05338)either.map(class05338::N, Function.identity()), class053382 -> {
        OptionalInt optionalInt = class053382.y();
        if (optionalInt.isPresent()) {
            return Either.left((Object)optionalInt.getAsInt());
        }
        return Either.right((Object)class053382);
    });
    private final @Nullable class06378 L;
    private final @Nullable class06378 u;
    private final class05381 i;
    private final class05353 R;

    public static class05338 L(int n) {
        return new class05338(Optional.empty(), Optional.of(class04711.N((float)n)));
    }

    private class05338(Optional<class06378> optional, Optional<class06378> optional2) {
        this((class06378)optional.orElse(null), (class06378)optional2.orElse(null));
    }

    private class05338(@Nullable class06378 class063782, @Nullable class06378 class063783) {
        this.L = class063782;
        this.u = class063783;
        if (class063782 == null) {
            if (class063783 == null) {
                this.i = (class059082, n) -> n;
                this.R = (class059082, n) -> true;
            } else {
                this.i = (class059082, n) -> Math.min(class063783.N(class059082), n);
                this.R = (class059082, n) -> n <= class063783.N(class059082);
            }
        } else if (class063783 == null) {
            this.i = (class059082, n) -> Math.max(class063782.N(class059082), n);
            this.R = (class059082, n) -> n >= class063782.N(class059082);
        } else {
            this.i = (class059082, n) -> class04995.N((int)n, (int)class063782.N(class059082), (int)class063783.N(class059082));
            this.R = (class059082, n) -> n >= class063782.N(class059082) && n <= class063783.N(class059082);
        }
    }

    public static class05338 y(int n) {
        return new class05338(Optional.of(class04711.N((float)n)), Optional.empty());
    }

    public boolean y(class05908 class059082, int n) {
        return this.R.test(class059082, n);
    }

    private OptionalInt y() {
        class04711 class047112;
        class06378 class063782;
        if (Objects.equals(this.L, this.u) && (class063782 = this.L) instanceof class04711 && Math.floor((class047112 = (class04711)class063782).L()) == (double)class047112.L()) {
            return OptionalInt.of((int)class047112.L());
        }
        return OptionalInt.empty();
    }

    public Set<class07491<?>> N() {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        if (this.L != null) {
            builder.addAll((Iterable)this.L.y());
        }
        if (this.u != null) {
            builder.addAll((Iterable)this.u.y());
        }
        return builder.build();
    }

    public static class05338 N(int n) {
        class04711 class047112 = class04711.N((float)n);
        return new class05338(Optional.of(class047112), Optional.of(class047112));
    }

    public static class05338 N(int n, int n2) {
        return new class05338(Optional.of(class04711.N((float)n)), Optional.of(class04711.N((float)n2)));
    }

    public int N(class05908 class059082, int n) {
        return this.i.apply(class059082, n);
    }
}

