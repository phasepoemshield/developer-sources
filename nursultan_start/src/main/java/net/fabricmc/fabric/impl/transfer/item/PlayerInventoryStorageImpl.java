/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06695
 *  minecraft.class07050
 *  minecraft.class08044
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.item.PlayerInventoryStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageUtil
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.item;

import java.util.List;
import java.util.Objects;
import minecraft.class06695;
import minecraft.class07050;
import minecraft.class08044;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.item.PlayerInventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageUtil;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.DebugMessages;
import net.fabricmc.fabric.impl.transfer.item.InventoryStorageImpl;
import net.fabricmc.fabric.impl.transfer.item.PlayerInventoryStorageImpl$DroppedStacks;

class PlayerInventoryStorageImpl
extends InventoryStorageImpl
implements PlayerInventoryStorage {
    private final PlayerInventoryStorageImpl$DroppedStacks droppedStacks = new PlayerInventoryStorageImpl$DroppedStacks(this);
    final class08044 playerInventory;

    PlayerInventoryStorageImpl(class08044 class080442) {
        super((class06695)class080442);
        this.playerInventory = class080442;
    }

    @Override
    public String toString() {
        return "PlayerInventoryStorage[" + DebugMessages.forInventory((class06695)this.playerInventory) + "]";
    }

    public long insert(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        return this.offer(itemVariant, l, transactionContext);
    }

    public long offer(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative((TransferVariant)itemVariant, (long)l);
        long l2 = l;
        List<SingleSlotStorage<ItemVariant>> list = this.getSlots().subList(0, 36);
        for (class07050 class070502 : class07050.values()) {
            SingleSlotStorage<ItemVariant> singleSlotStorage = this.getHandSlot(class070502);
            if (!((ItemVariant)singleSlotStorage.getResource()).equals((Object)itemVariant) || (l -= singleSlotStorage.insert((Object)itemVariant, l, transactionContext)) != 0L) continue;
            return l2;
        }
        l -= StorageUtil.insertStacking(list, (Object)itemVariant, (long)l, (TransactionContext)transactionContext);
        return l2 - l;
    }

    public void drop(ItemVariant itemVariant, long l, boolean bl, boolean bl2, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative((TransferVariant)itemVariant, (long)l);
        if (l > 0L && !this.playerInventory.z.method_73183().method_8608()) {
            this.droppedStacks.addDrop(itemVariant, l, bl, bl2, transactionContext);
        }
    }

    public SingleSlotStorage<ItemVariant> getHandSlot(class07050 class070502) {
        if (Objects.requireNonNull(class070502) == class07050.field_5808) {
            if (class08044.L((int)this.playerInventory.N())) {
                return this.getSlot(this.playerInventory.N());
            }
            throw new RuntimeException("Unexpected player selected slot: " + this.playerInventory.N());
        }
        if (class070502 == class07050.field_5810) {
            return this.getSlot(40);
        }
        throw new UnsupportedOperationException("Unknown hand: " + String.valueOf(class070502));
    }
}

