/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03320
 *  minecraft.class06386
 *  minecraft.class07830
 */
package minecraft;

import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class03158;
import minecraft.class03320;
import minecraft.class06386;
import minecraft.class07830;

@FunctionalInterface
public interface class03160<C extends class06386> {
    public static <C extends class06386> class03160<C> N(Predicate<class03158<C>> predicate, class03320<C> class033202) {
        Optional optional = Optional.of(class033202);
        return class031582 -> predicate.test(class031582) ? optional : Optional.empty();
    }

    public static <C extends class06386> Predicate<class03158<C>> N(class07830 class078302) {
        return class031582 -> class031582.N(class078302);
    }

    public Optional<class03320<C>> createGenerator(class03158<C> var1);
}

