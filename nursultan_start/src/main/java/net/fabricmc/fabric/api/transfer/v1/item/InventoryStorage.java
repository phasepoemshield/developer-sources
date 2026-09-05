/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06695
 *  minecraft.class07211
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.impl.transfer.item.InventoryStorageImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.item;

import java.util.List;
import java.util.Objects;
import minecraft.class06695;
import minecraft.class07211;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.SlottedStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.impl.transfer.item.InventoryStorageImpl;
import org.jspecify.annotations.Nullable;

public interface InventoryStorage
extends SlottedStorage<ItemVariant> {
    @Override
    default public SingleSlotStorage<ItemVariant> getSlot(int n) {
        return this.getSlots().get(n);
    }

    public static InventoryStorage of(class06695 class066952, @Nullable class07211 class072112) {
        Objects.requireNonNull(class066952, "Null inventory is not supported.");
        return InventoryStorageImpl.of((class06695)class066952, (class07211)class072112);
    }

    @Override
    public List<SingleSlotStorage<ItemVariant>> getSlots();

    @Override
    default public int getSlotCount() {
        return this.getSlots().size();
    }
}

