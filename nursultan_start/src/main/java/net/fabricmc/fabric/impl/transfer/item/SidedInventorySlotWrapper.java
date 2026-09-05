/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06695
 *  minecraft.class07054
 *  minecraft.class07211
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageView
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.item;

import minecraft.class06695;
import minecraft.class07054;
import minecraft.class07211;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.DebugMessages;
import net.fabricmc.fabric.impl.transfer.item.InventorySlotWrapper;
import net.fabricmc.fabric.impl.transfer.item.ItemVariantImpl;

class SidedInventorySlotWrapper
implements SingleSlotStorage<ItemVariant> {
    private final InventorySlotWrapper slotWrapper;
    private final class07054 sidedInventory;
    private final class07211 direction;

    SidedInventorySlotWrapper(InventorySlotWrapper inventorySlotWrapper, class07054 class070542, class07211 class072112) {
        this.slotWrapper = inventorySlotWrapper;
        this.sidedInventory = class070542;
        this.direction = class072112;
    }

    public String toString() {
        return "SidedInventorySlotWrapper[%s#%d/%s]".formatted(new Object[]{DebugMessages.forInventory((class06695)this.sidedInventory), this.slotWrapper.slot, this.direction.name()});
    }

    public long extract(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        if (!this.sidedInventory.y(this.slotWrapper.slot, ((ItemVariantImpl)itemVariant).getCachedStack(), this.direction)) {
            return 0L;
        }
        return this.slotWrapper.extract(itemVariant, l, transactionContext);
    }

    public long insert(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        if (!this.sidedInventory.N(this.slotWrapper.slot, ((ItemVariantImpl)itemVariant).getCachedStack(), this.direction)) {
            return 0L;
        }
        return this.slotWrapper.insert(itemVariant, l, transactionContext);
    }

    public ItemVariant getResource() {
        return this.slotWrapper.getResource();
    }

    public long getCapacity() {
        return this.slotWrapper.getCapacity();
    }

    public long getAmount() {
        return this.slotWrapper.getAmount();
    }

    public boolean isResourceBlank() {
        return this.slotWrapper.isResourceBlank();
    }

    public StorageView<ItemVariant> getUnderlyingView() {
        return this.slotWrapper.getUnderlyingView();
    }
}

