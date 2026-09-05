/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.entity.pushable;

import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;

class EntityPushablePredicate$1
extends EntityPushablePredicate<T> {
    final /* synthetic */ Predicate val$first;
    final /* synthetic */ Predicate val$second;

    EntityPushablePredicate$1(Predicate predicate, Predicate predicate2) {
        this.val$first = predicate;
        this.val$second = predicate2;
    }

    @Override
    public boolean test(T t) {
        return this.val$first.test(t) && this.val$second.test(t);
    }
}

