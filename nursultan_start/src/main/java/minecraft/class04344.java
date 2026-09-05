/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05630
 *  minecraft.class06478
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class04355;
import minecraft.class04370;
import minecraft.class05630;
import minecraft.class06478;

public interface class04344<T> {
    public Optional<T> u(T var1);

    public Codec<T> y();

    public Function<class04370<T>, class06478> N(class04355<T> var1, class05630 var2, int var3, int var4, int var5, Consumer<T> var6);
}

