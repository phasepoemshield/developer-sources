/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03552
 *  minecraft.class03556
 *  minecraft.class05946
 *  minecraft.class06069
 */
package minecraft;

import java.util.Optional;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03552;
import minecraft.class03556;
import minecraft.class05946;
import minecraft.class06069;

public interface class02055<T> {
    default public class03552<T> y(class03530<T> class035302) {
        return this.N(class035302).orElseThrow(() -> new IllegalStateException("Missing tag " + String.valueOf(class035302)));
    }

    default public class03529<T> y(class05946<T> class059462) {
        return this.N(class059462).orElseThrow(() -> new IllegalStateException("Missing element " + String.valueOf(class059462)));
    }

    public Optional<class03529<T>> N(class05946<T> var1);

    default public Optional<class03556<T>> N(class03530<T> class035302, class06069 class060692) {
        return this.N(class035302).flatMap(class035522 -> class035522.N(class060692));
    }

    public Optional<class03552<T>> N(class03530<T> var1);
}

