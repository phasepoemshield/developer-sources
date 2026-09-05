/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07482
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.Transaction
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  net.fabricmc.fabric.impl.transfer.context.ConstantContainerItemContext
 *  net.fabricmc.fabric.impl.transfer.context.CreativeInteractionContainerItemContext
 *  net.fabricmc.fabric.impl.transfer.context.PlayerContainerItemContext
 *  net.fabricmc.fabric.impl.transfer.context.SingleSlotContainerItemContext
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.context;

import java.util.List;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07482;
import minecraft.class08036;
import net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.item.PlayerInventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.context.ConstantContainerItemContext;
import net.fabricmc.fabric.impl.transfer.context.CreativeInteractionContainerItemContext;
import net.fabricmc.fabric.impl.transfer.context.PlayerContainerItemContext;
import net.fabricmc.fabric.impl.transfer.context.SingleSlotContainerItemContext;
import org.jspecify.annotations.Nullable;

public interface ContainerItemContext {
    default public long extract(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        return this.getMainSlot().extract((Object)itemVariant, l, transactionContext);
    }

    default public long insert(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        long l2 = this.getMainSlot().insert((Object)itemVariant, l, transactionContext);
        long l3 = this.insertOverflow(itemVariant, l - l2, transactionContext);
        return l2 + l3;
    }

    default public <A> @Nullable A find(ItemApiLookup<A, ContainerItemContext> itemApiLookup) {
        return (A)(this.getItemVariant().isBlank() ? null : itemApiLookup.find(this.getItemVariant().toStack(), (Object)this));
    }

    public static ContainerItemContext ofPlayerCursor(class08036 class080362, class07482 class074822) {
        return ContainerItemContext.ofPlayerSlot(class080362, PlayerInventoryStorage.getCursorStorage(class074822));
    }

    default public long exchange(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative(itemVariant, l);
        try (Transaction transaction = transactionContext.openNested();){
            long l2 = this.extract(this.getItemVariant(), l, (TransactionContext)transaction);
            if (this.insert(itemVariant, l2, (TransactionContext)transaction) == l2) {
                transaction.commit();
                long l3 = l2;
                return l3;
            }
        }
        return 0L;
    }

    public static ContainerItemContext forCreativeInteraction(class08036 class080362, class06584 class065842) {
        return new CreativeInteractionContainerItemContext(ItemVariant.of(class065842), (long)class065842.c(), class080362);
    }

    public static ContainerItemContext forPlayerInteraction(class08036 class080362, class07050 class070502) {
        if (class080362.method_56992()) {
            return ContainerItemContext.forCreativeInteraction(class080362, class080362.method_5998(class070502));
        }
        return ContainerItemContext.ofPlayerHand(class080362, class070502);
    }

    public static ContainerItemContext ofPlayerHand(class08036 class080362, class07050 class070502) {
        return new PlayerContainerItemContext(class080362, class070502);
    }

    default public long getAmount() {
        if (this.getItemVariant().isBlank()) {
            throw new IllegalStateException("Amount may not be queried when the current item variant is blank.");
        }
        return this.getMainSlot().getAmount();
    }

    public static ContainerItemContext ofSingleSlot(SingleSlotStorage<ItemVariant> singleSlotStorage) {
        return new SingleSlotContainerItemContext(singleSlotStorage);
    }

    public long insertOverflow(ItemVariant var1, long var2, TransactionContext var4);

    public SingleSlotStorage<ItemVariant> getMainSlot();

    public static ContainerItemContext withConstant(class06584 class065842) {
        return ContainerItemContext.withConstant(ItemVariant.of(class065842), class065842.c());
    }

    public static ContainerItemContext withConstant(ItemVariant itemVariant, long l) {
        StoragePreconditions.notNegative(l);
        return new ConstantContainerItemContext(itemVariant, l);
    }

    public List<SingleSlotStorage<ItemVariant>> getAdditionalSlots();

    default public ItemVariant getItemVariant() {
        return (ItemVariant)this.getMainSlot().getResource();
    }

    public static ContainerItemContext ofPlayerSlot(class08036 class080362, SingleSlotStorage<ItemVariant> singleSlotStorage) {
        return new PlayerContainerItemContext(class080362, singleSlotStorage);
    }
}

