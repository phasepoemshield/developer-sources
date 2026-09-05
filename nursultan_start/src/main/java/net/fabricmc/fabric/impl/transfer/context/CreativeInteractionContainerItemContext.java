/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.item.PlayerInventoryStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.context;

import minecraft.class08036;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.item.PlayerInventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.context.ConstantContainerItemContext;

public class CreativeInteractionContainerItemContext
extends ConstantContainerItemContext {
    private final PlayerInventoryStorage playerInventory;

    public CreativeInteractionContainerItemContext(ItemVariant itemVariant, long l, class08036 class080362) {
        super(itemVariant, l);
        this.playerInventory = PlayerInventoryStorage.of((class08036)class080362);
    }

    @Override
    public String toString() {
        return "CreativeInteractionContainerItemContext[%d %s]".formatted(new Object[]{this.getMainSlot().getAmount(), this.getMainSlot().getResource()});
    }

    @Override
    public long insertOverflow(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative((TransferVariant)itemVariant, (long)l);
        if (l > 0L) {
            boolean bl = false;
            for (SingleSlotStorage singleSlotStorage : this.playerInventory.getSlots()) {
                if (!((ItemVariant)singleSlotStorage.getResource()).equals((Object)itemVariant) || singleSlotStorage.getAmount() <= 0L) continue;
                bl = true;
                break;
            }
            if (!bl) {
                this.playerInventory.offer(itemVariant, 1L, transactionContext);
            }
        }
        return l;
    }
}

