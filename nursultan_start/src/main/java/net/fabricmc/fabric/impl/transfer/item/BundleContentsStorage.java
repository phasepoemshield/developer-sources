/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02484
 *  minecraft.class02678
 *  minecraft.class02822
 *  minecraft.class02830
 *  minecraft.class06581
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageView
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import minecraft.class02484;
import minecraft.class02678;
import minecraft.class02822;
import minecraft.class02830;
import minecraft.class06581;
import minecraft.class06584;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.item.BundleContentsStorage$BundleSlotWrapper;

public class BundleContentsStorage
implements Storage<ItemVariant> {
    private final ContainerItemContext ctx;
    private final List<BundleContentsStorage$BundleSlotWrapper> slotCache = new ArrayList<BundleContentsStorage$BundleSlotWrapper>();
    private List<StorageView<ItemVariant>> slots = List.of();
    private final class06581 originalItem;

    public BundleContentsStorage(ContainerItemContext containerItemContext) {
        this.ctx = containerItemContext;
        this.originalItem = containerItemContext.getItemVariant().getItem();
    }

    public long extract(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        StoragePreconditions.notNegative((long)l);
        if (!this.isStillValid()) {
            return 0L;
        }
        this.updateSlotsIfNeeded();
        long l2 = 0L;
        for (StorageView<ItemVariant> storageView : this.slots) {
            if ((l2 += storageView.extract((Object)itemVariant, l - l2, transactionContext)) == l) break;
        }
        return l2;
    }

    public long insert(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        class06584 class065842;
        StoragePreconditions.notBlankNotNegative((TransferVariant)itemVariant, (long)l);
        if (!this.isStillValid()) {
            return 0L;
        }
        if (l > Integer.MAX_VALUE) {
            l = Integer.MAX_VALUE;
        }
        if (!class02830.y((class06584)(class065842 = itemVariant.toStack((int)l)))) {
            return 0L;
        }
        class02822 class028222 = new class02822(this.bundleContents());
        int n = class028222.N(class065842);
        if (n == 0) {
            return 0L;
        }
        class02678 class026782 = class02678.N().N(class02484.D, (Object)class028222.u()).N();
        if (!this.updateStack(class026782, transactionContext)) {
            return 0L;
        }
        return n;
    }

    public Iterator<StorageView<ItemVariant>> iterator() {
        this.updateSlotsIfNeeded();
        return this.slots.iterator();
    }

    private void updateSlotsIfNeeded() {
        int n = this.bundleContents().i();
        if (this.slots.size() != n) {
            while (n > this.slotCache.size()) {
                this.slotCache.add(new BundleContentsStorage$BundleSlotWrapper(this, this.slotCache.size()));
            }
            this.slots = Collections.unmodifiableList(this.slotCache.subList(0, n));
        }
    }

    class02830 bundleContents() {
        return (class02830)this.ctx.getItemVariant().getComponentMap().a_(class02484.D, (Object)class02830.N);
    }

    boolean updateStack(class02678 class026782, TransactionContext transactionContext) {
        ItemVariant itemVariant = this.ctx.getItemVariant().withComponentChanges(class026782);
        return this.ctx.exchange(itemVariant, 1L, transactionContext) > 0L;
    }

    boolean isStillValid() {
        return this.ctx.getItemVariant().getItem() == this.originalItem;
    }
}

