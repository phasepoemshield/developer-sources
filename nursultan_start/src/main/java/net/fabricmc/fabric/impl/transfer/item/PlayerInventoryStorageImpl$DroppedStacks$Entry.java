/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 */
package net.fabricmc.fabric.impl.transfer.item;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;

final class PlayerInventoryStorageImpl$DroppedStacks$Entry
extends Record {
    final ItemVariant key;
    final long amount;
    final boolean throwRandomly;
    final boolean retainOwnership;

    public long amount() {
        return this.amount;
    }

    PlayerInventoryStorageImpl$DroppedStacks$Entry(ItemVariant itemVariant, long l, boolean bl, boolean bl2) {
        this.key = itemVariant;
        this.amount = l;
        this.throwRandomly = bl;
        this.retainOwnership = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{PlayerInventoryStorageImpl$DroppedStacks$Entry.class, "key;amount;throwRandomly;retainOwnership", "key", "amount", "throwRandomly", "retainOwnership"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{PlayerInventoryStorageImpl$DroppedStacks$Entry.class, "key;amount;throwRandomly;retainOwnership", "key", "amount", "throwRandomly", "retainOwnership"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{PlayerInventoryStorageImpl$DroppedStacks$Entry.class, "key;amount;throwRandomly;retainOwnership", "key", "amount", "throwRandomly", "retainOwnership"}, this);
    }

    public ItemVariant key() {
        return this.key;
    }

    public boolean retainOwnership() {
        return this.retainOwnership;
    }

    public boolean throwRandomly() {
        return this.throwRandomly;
    }
}

