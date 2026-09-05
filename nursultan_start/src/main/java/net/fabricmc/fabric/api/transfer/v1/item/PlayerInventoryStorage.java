/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06695
 *  minecraft.class07050
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  net.fabricmc.fabric.impl.transfer.item.CursorSlotWrapper
 */
package net.fabricmc.fabric.api.transfer.v1.item;

import minecraft.class06695;
import minecraft.class07050;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;
import net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.item.CursorSlotWrapper;

public interface PlayerInventoryStorage
extends InventoryStorage {
    @Override
    public long insert(ItemVariant var1, long var2, TransactionContext var4);

    public static PlayerInventoryStorage of(class08036 class080362) {
        return PlayerInventoryStorage.of(class080362.method_31548());
    }

    public static PlayerInventoryStorage of(class08044 class080442) {
        return (PlayerInventoryStorage)InventoryStorage.of((class06695)class080442, null);
    }

    public long offer(ItemVariant var1, long var2, TransactionContext var4);

    default public void drop(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        this.drop(itemVariant, l, false, transactionContext);
    }

    default public void drop(ItemVariant itemVariant, long l, boolean bl, TransactionContext transactionContext) {
        this.drop(itemVariant, l, false, bl, transactionContext);
    }

    public void drop(ItemVariant var1, long var2, boolean var4, boolean var5, TransactionContext var6);

    default public void offerOrDrop(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        long l2 = this.offer(itemVariant, l, transactionContext);
        this.drop(itemVariant, l - l2, transactionContext);
    }

    public SingleSlotStorage<ItemVariant> getHandSlot(class07050 var1);

    public static SingleSlotStorage<ItemVariant> getCursorStorage(class07482 class074822) {
        return CursorSlotWrapper.get((class07482)class074822);
    }
}

