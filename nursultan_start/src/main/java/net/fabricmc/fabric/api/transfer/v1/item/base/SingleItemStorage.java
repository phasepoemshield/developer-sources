/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleVariantStorage
 */
package net.fabricmc.fabric.api.transfer.v1.item.base;

import minecraft.class08299;
import minecraft.class08329;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleVariantStorage;

public abstract class SingleItemStorage
extends SingleVariantStorage<ItemVariant> {
    public void readData(class08299 class082992) {
        SingleVariantStorage.readData((SingleVariantStorage)this, ItemVariant.CODEC, ItemVariant::blank, (class08299)class082992);
    }

    public void writeData(class08329 class083292) {
        SingleVariantStorage.writeData((SingleVariantStorage)this, ItemVariant.CODEC, (class08329)class083292);
    }

    protected final ItemVariant getBlankVariant() {
        return ItemVariant.blank();
    }
}

