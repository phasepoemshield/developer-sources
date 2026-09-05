/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00752
 *  minecraft.class03530
 *  minecraft.class03552
 */
package minecraft;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import minecraft.class00752;
import minecraft.class03530;
import minecraft.class03552;

class class00728<T>
implements class00752<T> {
    public Stream<class03552<T>> L() {
        throw new IllegalStateException("Tags not bound");
    }

    class00728() {
    }

    public boolean y() {
        return false;
    }

    public void N(BiConsumer<? super class03530<T>, ? super class03552<T>> biConsumer) {
        throw new IllegalStateException("Tags not bound");
    }

    public Optional<class03552<T>> N(class03530<T> class035302) {
        throw new IllegalStateException("Tags not bound, trying to access " + String.valueOf(class035302));
    }
}

