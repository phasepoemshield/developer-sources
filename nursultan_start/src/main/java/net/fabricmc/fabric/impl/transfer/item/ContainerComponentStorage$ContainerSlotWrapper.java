/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class02484
 *  minecraft.class02678
 *  minecraft.class02854
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.item;

import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02678;
import minecraft.class02854;
import minecraft.class06584;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.item.ContainerComponentStorage;

class ContainerComponentStorage$ContainerSlotWrapper
implements SingleSlotStorage<ItemVariant> {
    final int slot;
    final /* synthetic */ ContainerComponentStorage this$0;

    protected boolean setStack(class06584 class065842, TransactionContext transactionContext) {
        List list = this.this$0.container().y().collect(Collectors.toList());
        while (list.size() <= this.slot) {
            list.add(class06584.E);
        }
        list.set(this.slot, class065842);
        ContainerItemContext containerItemContext = this.this$0.ctx;
        ItemVariant itemVariant = containerItemContext.getItemVariant().withComponentChanges(class02678.N().N(class02484.NG, (Object)class02854.N(list)).N());
        return containerItemContext.exchange(itemVariant, 1L, transactionContext) == 1L;
    }

    ContainerComponentStorage$ContainerSlotWrapper(ContainerComponentStorage containerComponentStorage, int n) {
        this.this$0 = containerComponentStorage;
        this.slot = n;
    }

    public String toString() {
        return "ContainerSlotWrapper[%s#%d]".formatted(new Object[]{this.this$0.ctx.getItemVariant(), this.slot});
    }

    public long extract(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        int n;
        StoragePreconditions.notBlankNotNegative((TransferVariant)itemVariant, (long)l);
        if (!this.this$0.isStillValid()) {
            return 0L;
        }
        class06584 class065842 = this.getStack();
        if (itemVariant.matches(class065842) && (n = (int)Math.min((long)class065842.c(), l)) > 0) {
            class065842 = this.getStack().t();
            class065842.B(n);
            if (!this.setStack(class065842, transactionContext)) {
                return 0L;
            }
            return n;
        }
        return 0L;
    }

    public long insert(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        int n;
        StoragePreconditions.notBlankNotNegative((TransferVariant)itemVariant, (long)l);
        if (!this.this$0.isStillValid()) {
            return 0L;
        }
        class06584 class065842 = this.getStack();
        if ((itemVariant.matches(class065842) || class065842.R()) && itemVariant.getItem().u() && (n = (int)Math.min(l, this.getCapacity() - (long)class065842.c())) > 0) {
            class065842 = this.getStack().t();
            if (class065842.R()) {
                class065842 = itemVariant.toStack(n);
            } else {
                class065842.M(n);
            }
            if (!this.setStack(class065842, transactionContext)) {
                return 0L;
            }
            return n;
        }
        return 0L;
    }

    public ItemVariant getResource() {
        return ItemVariant.of((class06584)this.getStack());
    }

    private class06584 getStack() {
        class00743 class007432 = this.this$0.containerAccessor().fabric_getStacks();
        if (class007432.size() <= this.slot) {
            return class06584.E;
        }
        return (class06584)class007432.get(this.slot);
    }

    public long getCapacity() {
        return this.getStack().B().M();
    }

    public long getAmount() {
        return this.getStack().c();
    }

    public boolean isResourceBlank() {
        return this.getStack().R();
    }
}

