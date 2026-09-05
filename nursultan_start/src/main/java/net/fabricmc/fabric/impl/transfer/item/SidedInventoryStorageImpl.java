/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07054
 *  minecraft.class07211
 *  net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 */
package net.fabricmc.fabric.impl.transfer.item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import minecraft.class07054;
import minecraft.class07211;
import net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.impl.transfer.item.InventoryStorageImpl;
import net.fabricmc.fabric.impl.transfer.item.SidedInventorySlotWrapper;

class SidedInventoryStorageImpl
extends CombinedStorage<ItemVariant, SingleSlotStorage<ItemVariant>>
implements InventoryStorage {
    private final InventoryStorageImpl backingStorage;

    SidedInventoryStorageImpl(InventoryStorageImpl inventoryStorageImpl, class07211 class072112) {
        super(Collections.unmodifiableList(SidedInventoryStorageImpl.createWrapperList(inventoryStorageImpl, class072112)));
        this.backingStorage = inventoryStorageImpl;
    }

    public String toString() {
        return this.backingStorage.toString();
    }

    public List<SingleSlotStorage<ItemVariant>> getSlots() {
        return this.parts;
    }

    private static List<SingleSlotStorage<ItemVariant>> createWrapperList(InventoryStorageImpl inventoryStorageImpl, class07211 class072112) {
        class07054 class070542 = (class07054)inventoryStorageImpl.inventory;
        int[] nArray = class070542.N(class072112);
        SidedInventorySlotWrapper[] sidedInventorySlotWrapperArray = new SidedInventorySlotWrapper[nArray.length];
        for (int i = 0; i < nArray.length; ++i) {
            sidedInventorySlotWrapperArray[i] = new SidedInventorySlotWrapper(inventoryStorageImpl.backingList.get(nArray[i]), class070542, class072112);
        }
        return Arrays.asList(sidedInventorySlotWrapperArray);
    }
}

