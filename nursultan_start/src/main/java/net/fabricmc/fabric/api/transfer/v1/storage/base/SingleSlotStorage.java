/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.storage.SlottedStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageView
 *  net.fabricmc.fabric.impl.transfer.TransferApiImpl
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import java.util.Iterator;
import net.fabricmc.fabric.api.transfer.v1.storage.SlottedStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.impl.transfer.TransferApiImpl;

public interface SingleSlotStorage<T>
extends SlottedStorage<T>,
StorageView<T> {
    default public SingleSlotStorage<T> getSlot(int n) {
        if (n != 0) {
            throw new IndexOutOfBoundsException("Slot " + n + " does not exist in a single-slot storage.");
        }
        return this;
    }

    default public Iterator<StorageView<T>> iterator() {
        return TransferApiImpl.singletonIterator((Object)this);
    }

    default public int getSlotCount() {
        return 1;
    }
}

