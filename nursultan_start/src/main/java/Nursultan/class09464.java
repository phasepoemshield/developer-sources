/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01289
 *  net.caffeinemc.mods.lithium.common.ai.useless_behaviors.LithiumEmptyBehavior
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import com.google.common.collect.AbstractIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Iterator;
import minecraft.class01289;
import net.caffeinemc.mods.lithium.common.ai.useless_behaviors.LithiumEmptyBehavior;
import org.jspecify.annotations.Nullable;

public class class09464<E>
extends AbstractIterator<E> {
    final /* synthetic */ Iterator N;

    public class09464(class01289 class012892, Iterator iterator) {
        this.N = iterator;
    }

    protected @Nullable E computeNext() {
        while (this.N.hasNext()) {
            Pair pair = (Pair)this.N.next();
            if (pair.getSecond() == LithiumEmptyBehavior.EMPTY_BEHAVIOR_SENTINEL) continue;
            return (E)pair;
        }
        return (E)((Pair)this.endOfData());
    }
}

