/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01225
 *  minecraft.class03530
 */
package minecraft;

import java.util.Optional;
import java.util.function.Function;
import minecraft.class01225;
import minecraft.class03530;

@FunctionalInterface
public interface class07034<T>
extends Function<class03530<T>, Optional<class01225>> {
    default public boolean N(class03530<T> class035302) {
        return ((Optional)this.apply(class035302)).isPresent();
    }

    public static <T> class07034<T> N() {
        return class035302 -> Optional.empty();
    }
}

