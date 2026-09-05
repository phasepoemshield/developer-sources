/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;
import minecraft.class04206;
import minecraft.class05052;

public abstract class class05054 {
    public static final Codec<class05054> N = class04206.h.T().dispatch(class05054::y, class05052::N);
    protected static final int y = 16;
    protected final OptionalInt L;

    public OptionalInt L() {
        return this.L;
    }

    public class05054(OptionalInt optionalInt) {
        this.L = optionalInt;
    }

    protected abstract class05052<?> y();

    protected static <S extends class05054> RecordCodecBuilder<S, OptionalInt> N() {
        return Codec.intRange((int)0, (int)80).optionalFieldOf("min_clipped_height").xmap(optional -> optional.map(OptionalInt::of).orElse(OptionalInt.empty()), optionalInt -> optionalInt.isPresent() ? Optional.of(optionalInt.getAsInt()) : Optional.empty()).forGetter(class050542 -> class050542.L);
    }

    public abstract int N(int var1, int var2);
}

