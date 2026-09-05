/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00728
 *  minecraft.class00735
 *  minecraft.class03530
 *  minecraft.class03552
 */
package minecraft;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import minecraft.class00728;
import minecraft.class00735;
import minecraft.class03530;
import minecraft.class03552;

public interface class00752<T> {
    public Stream<class03552<T>> L();

    public boolean y();

    public static <T> class00752<T> N() {
        return new class00728();
    }

    public void N(BiConsumer<? super class03530<T>, ? super class03552<T>> var1);

    public Optional<class03552<T>> N(class03530<T> var1);

    public static <T> class00752<T> N(Map<class03530<T>, class03552<T>> map) {
        return new class00735(map);
    }
}

