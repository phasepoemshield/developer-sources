/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  minecraft.class06069
 *  net.caffeinemc.mods.lithium.common.ai.WeightedListIterable
 *  net.caffeinemc.mods.lithium.common.ai.WeightedListIterable$ListIterator
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class02134;
import minecraft.class06069;
import net.caffeinemc.mods.lithium.common.ai.WeightedListIterable;

public class class02150<U>
implements Iterable<U>,
WeightedListIterable {
    protected final List<class02134<U>> N;
    private final class06069 y = class06069.u();

    public class02150() {
        this.N = Lists.newArrayList();
    }

    private class02150(List<class02134<U>> list) {
        this.N = Lists.newArrayList(list);
    }

    public String toString() {
        return "ShufflingList[" + String.valueOf(this.N) + "]";
    }

    @Override
    public Iterator iterator() {
        return new WeightedListIterable.ListIterator(this.N.iterator());
    }

    public Stream<U> y() {
        return this.N.stream().map(class02134::N);
    }

    public class02150<U> N() {
        this.N.forEach(class021342 -> class021342.N(this.y.z()));
        this.N.sort(Comparator.comparingDouble(class02134::L));
        return this;
    }

    public static <U> Codec<class02150<U>> N(Codec<U> codec) {
        return class02134.N(codec).listOf().xmap(class02150::new, class021502 -> class021502.N);
    }

    public class02150<U> N(U u, int n) {
        this.N.add(new class02134<U>(u, n));
        return this;
    }
}

