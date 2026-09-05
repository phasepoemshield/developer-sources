/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import minecraft.class04025;

abstract class class04023
implements class04025 {
    protected final List<class04025> i;

    protected class04023(List<class04025> list) {
        this.i = list;
    }

    public static <T extends class04023> MapCodec<T> N(Function<List<class04025>, T> function) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04025.y.listOf().fieldOf("predicates").forGetter(class040232 -> class040232.i)).apply((Applicative)instance, function));
    }
}

