/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.MapMaker
 *  minecraft.class06695
 *  minecraft.class07054
 *  minecraft.class07211
 *  minecraft.class08044
 *  net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.transfer.item;

import com.google.common.collect.MapMaker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import minecraft.class06695;
import minecraft.class07054;
import minecraft.class07211;
import minecraft.class08044;
import net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.impl.transfer.DebugMessages;
import net.fabricmc.fabric.impl.transfer.item.InventorySlotWrapper;
import net.fabricmc.fabric.impl.transfer.item.InventoryStorageImpl$MarkDirtyParticipant;
import net.fabricmc.fabric.impl.transfer.item.PlayerInventoryStorageImpl;
import net.fabricmc.fabric.impl.transfer.item.SidedInventoryStorageImpl;
import org.jspecify.annotations.Nullable;

public class InventoryStorageImpl
extends CombinedStorage<ItemVariant, SingleSlotStorage<ItemVariant>>
implements InventoryStorage {
    private static final Map<class06695, InventoryStorageImpl> WRAPPERS = new MapMaker().weakValues().makeMap();
    final class06695 inventory;
    final List<InventorySlotWrapper> backingList;
    final InventoryStorageImpl$MarkDirtyParticipant markDirtyParticipant = new InventoryStorageImpl$MarkDirtyParticipant(this);

    InventoryStorageImpl(class06695 class066952) {
        super(Collections.emptyList());
        this.inventory = class066952;
        this.backingList = new ArrayList<InventorySlotWrapper>();
    }

    public String toString() {
        return "InventoryStorage[" + DebugMessages.forInventory(this.inventory) + "]";
    }

    public static InventoryStorage of(class06695 class066953, @Nullable class07211 class072112) {
        InventoryStorageImpl inventoryStorageImpl = WRAPPERS.computeIfAbsent(class066953, class066952 -> {
            if (class066952 instanceof class08044) {
                class08044 class080442 = (class08044)class066952;
                return new PlayerInventoryStorageImpl(class080442);
            }
            return new InventoryStorageImpl((class06695)class066952);
        });
        inventoryStorageImpl.resizeSlotList();
        return inventoryStorageImpl.getSidedWrapper(class072112);
    }

    public List<SingleSlotStorage<ItemVariant>> getSlots() {
        return this.parts;
    }

    private void resizeSlotList() {
        int n = this.inventory.method_5439();
        if (n != this.parts.size()) {
            while (this.backingList.size() < n) {
                this.backingList.add(new InventorySlotWrapper(this, this.backingList.size()));
            }
            this.parts = Collections.unmodifiableList(this.backingList.subList(0, n));
        }
    }

    private InventoryStorage getSidedWrapper(@Nullable class07211 class072112) {
        if (this.inventory instanceof class07054 && class072112 != null) {
            return new SidedInventoryStorageImpl(this, class072112);
        }
        return this;
    }
}

