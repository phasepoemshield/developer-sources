/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01225
 *  minecraft.class03530
 *  minecraft.class05946
 *  minecraft.class08322
 *  minecraft.class08331
 *  net.fabricmc.fabric.api.datagen.v1.provider.FabricProvidedTagBuilder
 *  net.fabricmc.fabric.mixin.datagen.TagAppenderMixin
 */
package minecraft;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class01225;
import minecraft.class03530;
import minecraft.class05946;
import minecraft.class08322;
import minecraft.class08331;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricProvidedTagBuilder;
import net.fabricmc.fabric.mixin.datagen.TagAppenderMixin;

public interface class08292<E, T>
extends FabricProvidedTagBuilder,
TagAppenderMixin {
    public class08292<E, T> y(E var1);

    public class08292<E, T> y(class03530<T> var1);

    public class08292<E, T> N(class03530<T> var1);

    public static <T> class08292<class05946<T>, T> N(class01225 class012252) {
        return new class08322(class012252);
    }

    default public <U> class08292<U, T> N(Function<U, E> function) {
        class08292 class082922 = this;
        return new class08331(this, class082922, function);
    }

    default public class08292<E, T> N(E ... EArray) {
        return this.N((E)Arrays.stream(EArray));
    }

    default public class08292<E, T> N(Collection<E> collection) {
        collection.forEach(this::N);
        return this;
    }

    default public class08292<E, T> N(Stream<E> stream) {
        stream.forEach(this::N);
        return this;
    }

    public class08292<E, T> N(E var1);
}

