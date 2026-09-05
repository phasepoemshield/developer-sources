/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.context;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

public class SingleSlotContainerItemContext
implements ContainerItemContext {
    private final SingleSlotStorage<ItemVariant> slot;

    public SingleSlotContainerItemContext(SingleSlotStorage<ItemVariant> singleSlotStorage) {
        this.slot = Objects.requireNonNull(singleSlotStorage);
    }

    public String toString() {
        return "SingleSlotContainerItemContext[%d %s %s]".formatted(new Object[]{this.slot.getAmount(), this.slot.getResource(), this.slot});
    }

    public long insertOverflow(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        return 0L;
    }

    public SingleSlotStorage<ItemVariant> getMainSlot() {
        return this.slot;
    }

    public List<SingleSlotStorage<ItemVariant>> getAdditionalSlots() {
        return Collections.emptyList();
    }
}

