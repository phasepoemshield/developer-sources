/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07050
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.item.PlayerInventoryStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.context;

import java.util.List;
import minecraft.class07050;
import minecraft.class08036;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.item.PlayerInventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

public class PlayerContainerItemContext
implements ContainerItemContext {
    private final PlayerInventoryStorage playerWrapper;
    private final SingleSlotStorage<ItemVariant> slot;

    public PlayerContainerItemContext(class08036 class080362, class07050 class070502) {
        this.playerWrapper = PlayerInventoryStorage.of((class08036)class080362);
        this.slot = this.playerWrapper.getHandSlot(class070502);
    }

    public PlayerContainerItemContext(class08036 class080362, SingleSlotStorage<ItemVariant> singleSlotStorage) {
        this.playerWrapper = PlayerInventoryStorage.of((class08036)class080362);
        this.slot = singleSlotStorage;
    }

    public String toString() {
        return "PlayerContainerItemContext[%d %s %s/%s]".formatted(new Object[]{this.slot.getAmount(), this.slot.getResource(), this.playerWrapper, this.slot});
    }

    public long insertOverflow(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        this.playerWrapper.offerOrDrop(itemVariant, l, transactionContext);
        return l;
    }

    public SingleSlotStorage<ItemVariant> getMainSlot() {
        return this.slot;
    }

    public List<SingleSlotStorage<ItemVariant>> getAdditionalSlots() {
        return this.playerWrapper.getSlots();
    }
}

