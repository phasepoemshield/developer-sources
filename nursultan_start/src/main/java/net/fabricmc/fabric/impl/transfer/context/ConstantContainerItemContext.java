/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleVariantStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.context;

import java.util.Collections;
import java.util.List;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleVariantStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.context.ConstantContainerItemContext$1;

public class ConstantContainerItemContext
implements ContainerItemContext {
    private final SingleVariantStorage<ItemVariant> backingSlot = new ConstantContainerItemContext$1(this);

    public ConstantContainerItemContext(ItemVariant itemVariant, long l) {
        this.backingSlot.variant = itemVariant;
        this.backingSlot.amount = l;
    }

    public String toString() {
        return "ConstantContainerItemContext[%d %s]".formatted(new Object[]{this.getMainSlot().getAmount(), this.getMainSlot().getResource()});
    }

    public long insertOverflow(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative((TransferVariant)itemVariant, (long)l);
        return l;
    }

    public SingleSlotStorage<ItemVariant> getMainSlot() {
        return this.backingSlot;
    }

    public List<SingleSlotStorage<ItemVariant>> getAdditionalSlots() {
        return Collections.emptyList();
    }
}

