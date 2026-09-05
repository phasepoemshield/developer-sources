/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00717
 *  minecraft.class00734
 *  minecraft.class04197
 *  minecraft.class04218
 *  minecraft.class06584
 *  net.caffeinemc.mods.lithium.mixin.util.accessors.ItemEntityAccessor
 */
package net.caffeinemc.mods.lithium.common.entity.item;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;
import minecraft.class00717;
import minecraft.class00734;
import minecraft.class04197;
import minecraft.class04218;
import minecraft.class06584;
import net.caffeinemc.mods.lithium.mixin.util.accessors.ItemEntityAccessor;

public class ItemEntityLazyIterationConsumer
implements class04197<class00717> {
    private final class06584 stack;
    private final class00734 box;
    private final Predicate<class00717> predicate;
    private final ArrayList<class00717> mergeEntities;
    private final class00717 searchingEntity;
    private int adjustedStackCount;

    public ItemEntityLazyIterationConsumer(class00717 class007172, class00734 class007342, Predicate<class00717> predicate) {
        this.searchingEntity = class007172;
        this.box = class007342;
        this.predicate = predicate;
        this.mergeEntities = new ArrayList();
        this.stack = this.searchingEntity.N();
        this.adjustedStackCount = this.stack.c();
    }

    public class04218 accept(class00717 class007172) {
        if (!this.box.L(class007172.method_5829()) || !this.predicate.test(class007172)) {
            return class04218.field_41283;
        }
        int n = ItemEntityLazyIterationConsumer.predictReceivedItemCount(this.searchingEntity, this.stack, this.adjustedStackCount, class007172);
        if (n != 0) {
            this.mergeEntities.add(class007172);
            this.adjustedStackCount += n;
            if (this.adjustedStackCount <= 0 || this.adjustedStackCount >= this.stack.U()) {
                return class04218.field_41284;
            }
        }
        return class04218.field_41283;
    }

    public ArrayList<class00717> getMergeEntities() {
        return this.mergeEntities;
    }

    private static int getTransferAmount(int n, int n2, int n3) {
        return Math.min(Math.min(n, 64) - n2, n3);
    }

    private static int predictReceivedItemCount(class00717 class007172, class06584 class065842, int n, class00717 class007173) {
        class06584 class065843;
        if (Objects.equals(((ItemEntityAccessor)class007172).lithium$getOwner(), ((ItemEntityAccessor)class007173).lithium$getOwner()) && class00717.N((class06584)class065842, (class06584)(class065843 = class007173.N()))) {
            if (class065843.c() < n) {
                return ItemEntityLazyIterationConsumer.getTransferAmount(class065842.U(), n, class065843.c());
            }
            return -ItemEntityLazyIterationConsumer.getTransferAmount(class065843.U(), class065843.c(), n);
        }
        return 0;
    }
}

