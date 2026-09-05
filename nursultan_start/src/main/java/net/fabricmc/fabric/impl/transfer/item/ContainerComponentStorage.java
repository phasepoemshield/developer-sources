/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02484
 *  minecraft.class02854
 *  minecraft.class06581
 *  net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedSlottedStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.mixin.transfer.ItemContainerContentsAccessor
 */
package net.fabricmc.fabric.impl.transfer.item;

import java.util.ArrayList;
import java.util.Collections;
import minecraft.class02484;
import minecraft.class02854;
import minecraft.class06581;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedSlottedStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.impl.transfer.item.ContainerComponentStorage$ContainerSlotWrapper;
import net.fabricmc.fabric.mixin.transfer.ItemContainerContentsAccessor;

public class ContainerComponentStorage
extends CombinedSlottedStorage<ItemVariant, SingleSlotStorage<ItemVariant>> {
    final ContainerItemContext ctx;
    private final class06581 originalItem;

    public ContainerComponentStorage(ContainerItemContext containerItemContext, int n) {
        super(Collections.emptyList());
        this.ctx = containerItemContext;
        this.originalItem = containerItemContext.getItemVariant().getItem();
        ArrayList<ContainerComponentStorage$ContainerSlotWrapper> arrayList = new ArrayList<ContainerComponentStorage$ContainerSlotWrapper>(n);
        for (int i = 0; i < n; ++i) {
            arrayList.add(new ContainerComponentStorage$ContainerSlotWrapper(this, i));
        }
        this.parts = Collections.unmodifiableList(arrayList);
    }

    class02854 container() {
        return (class02854)this.ctx.getItemVariant().getComponentMap().a_(class02484.NG, (Object)class02854.N);
    }

    ItemContainerContentsAccessor containerAccessor() {
        return (ItemContainerContentsAccessor)this.container();
    }

    boolean isStillValid() {
        return this.ctx.getItemVariant().getItem() == this.originalItem;
    }
}

