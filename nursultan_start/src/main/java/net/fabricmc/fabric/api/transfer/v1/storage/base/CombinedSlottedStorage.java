/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import java.util.List;
import java.util.StringJoiner;
import net.fabricmc.fabric.api.transfer.v1.storage.SlottedStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;

public class CombinedSlottedStorage<T, S extends SlottedStorage<T>>
extends CombinedStorage<T, S>
implements SlottedStorage<T> {
    @Override
    public SingleSlotStorage<T> getSlot(int n) {
        int n2 = n;
        for (SlottedStorage slottedStorage : this.parts) {
            if (n2 < slottedStorage.getSlotCount()) {
                return slottedStorage.getSlot(n2);
            }
            n2 -= slottedStorage.getSlotCount();
        }
        throw new IndexOutOfBoundsException("Slot " + n + " is out of bounds. This storage has size " + this.getSlotCount());
    }

    public CombinedSlottedStorage(List<S> list) {
        super(list);
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (SlottedStorage slottedStorage : this.parts) {
            stringJoiner.add(slottedStorage.toString());
        }
        return "CombinedSlottedStorage[" + String.valueOf(stringJoiner) + "]";
    }

    @Override
    public int getSlotCount() {
        int n = 0;
        for (SlottedStorage slottedStorage : this.parts) {
            n += slottedStorage.getSlotCount();
        }
        return n;
    }
}

