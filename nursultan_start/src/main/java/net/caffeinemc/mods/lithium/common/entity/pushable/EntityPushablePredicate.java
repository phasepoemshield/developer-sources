/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.entity.pushable;

import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate$1;

public abstract class EntityPushablePredicate<S>
implements Predicate<S> {
    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new EntityPushablePredicate$1(predicate, predicate2);
    }
}

