/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02484
 *  minecraft.class02678
 *  minecraft.class02830
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageView
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  net.fabricmc.fabric.mixin.transfer.BundleContentsAccessor
 *  org.apache.commons.lang3.math.Fraction
 */
package net.fabricmc.fabric.impl.transfer.item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import minecraft.class02484;
import minecraft.class02678;
import minecraft.class02830;
import minecraft.class06584;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.item.BundleContentsStorage;
import net.fabricmc.fabric.mixin.transfer.BundleContentsAccessor;
import org.apache.commons.lang3.math.Fraction;

class BundleContentsStorage$BundleSlotWrapper
implements StorageView<ItemVariant> {
    private final int index;
    final /* synthetic */ BundleContentsStorage this$0;

    BundleContentsStorage$BundleSlotWrapper(BundleContentsStorage bundleContentsStorage, int n) {
        this.this$0 = bundleContentsStorage;
        this.index = n;
    }

    public long extract(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        class02678 class026782;
        StoragePreconditions.notNegative((long)l);
        if (!this.this$0.isStillValid()) {
            return 0L;
        }
        if (this.this$0.bundleContents().i() <= this.index) {
            return 0L;
        }
        if (!itemVariant.matches(this.getStack())) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList((Collection)this.this$0.bundleContents().u());
        int n = (int)Math.min((long)((class06584)arrayList.get(this.index)).c(), l);
        ((class06584)arrayList.get(this.index)).B(n);
        if (((class06584)arrayList.get(this.index)).R()) {
            arrayList.remove(this.index);
        }
        if (!this.this$0.updateStack(class026782 = class02678.N().N(class02484.D, (Object)new class02830(arrayList)).N(), transactionContext)) {
            return 0L;
        }
        return n;
    }

    public ItemVariant getResource() {
        return ItemVariant.of((class06584)this.getStack());
    }

    private class06584 getStack() {
        if (this.this$0.bundleContents().i() <= this.index) {
            return class06584.E;
        }
        return (class06584)((List)this.this$0.bundleContents().L()).get(this.index);
    }

    public long getCapacity() {
        Fraction fraction = Fraction.ONE.subtract(this.this$0.bundleContents().R());
        int n = Math.max(fraction.divideBy(BundleContentsAccessor.getOccupancy((class06584)this.getStack())).intValue(), 0);
        return this.getAmount() + (long)n;
    }

    public long getAmount() {
        return this.getStack().c();
    }

    public boolean isResourceBlank() {
        return this.getStack().R();
    }
}

