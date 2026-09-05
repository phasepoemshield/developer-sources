/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00379
 *  minecraft.class00394
 *  minecraft.class00415
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class02477
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06638
 *  minecraft.class06695
 *  minecraft.class07209
 *  minecraft.class07242
 *  minecraft.class07278
 *  minecraft.class08092
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.item.base.SingleStackStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.item;

import java.util.Objects;
import minecraft.class00379;
import minecraft.class00394;
import minecraft.class00415;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class02477;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06638;
import minecraft.class06695;
import minecraft.class07209;
import minecraft.class07242;
import minecraft.class07278;
import minecraft.class08092;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.item.base.SingleStackStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.DebugMessages;
import net.fabricmc.fabric.impl.transfer.item.InventoryStorageImpl;
import net.fabricmc.fabric.impl.transfer.item.ItemVariantImpl;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;

class InventorySlotWrapper
extends SingleStackStorage {
    private final InventoryStorageImpl storage;
    final int slot;
    private final SpecialLogicInventory specialInv;
    private class06584 lastReleasedSnapshot = null;

    public void setStack(class06584 class065842) {
        if (this.specialInv == null) {
            this.storage.inventory.method_5447(this.slot, class065842);
        } else {
            this.specialInv.fabric_setSuppress(true);
            try {
                this.storage.inventory.method_5447(this.slot, class065842);
            }
            finally {
                this.specialInv.fabric_setSuppress(false);
            }
        }
    }

    InventorySlotWrapper(InventoryStorageImpl inventoryStorageImpl, int n) {
        SpecialLogicInventory specialLogicInventory;
        this.storage = inventoryStorageImpl;
        this.slot = n;
        class06695 class066952 = inventoryStorageImpl.inventory;
        this.specialInv = class066952 instanceof SpecialLogicInventory ? (specialLogicInventory = (SpecialLogicInventory)class066952) : null;
    }

    public String toString() {
        return "InventorySlotWrapper[%s#%d]".formatted(new Object[]{DebugMessages.forInventory(this.storage.inventory), this.slot});
    }

    public long extract(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        long l2 = super.extract(itemVariant, l, transactionContext);
        if (this.specialInv != null && l2 > 0L) {
            this.specialInv.fabric_onTransfer(this.slot, transactionContext);
        }
        return l2;
    }

    public long insert(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        if (!this.canInsert(this.slot, ((ItemVariantImpl)itemVariant).getCachedStack())) {
            return 0L;
        }
        long l2 = super.insert(itemVariant, l, transactionContext);
        if (this.specialInv != null && l2 > 0L) {
            this.specialInv.fabric_onTransfer(this.slot, transactionContext);
        }
        return l2;
    }

    public class06584 getStack() {
        return this.storage.inventory.method_5438(this.slot);
    }

    public void updateSnapshots(TransactionContext transactionContext) {
        class00379 class003792;
        this.storage.markDirtyParticipant.updateSnapshots(transactionContext);
        super.updateSnapshots(transactionContext);
        class06695 class066952 = this.storage.inventory;
        if (class066952 instanceof class00379 && (class003792 = (class00379)class066952).w().L((class08092)class00860.i) != class06638.field_12569) {
            class066952 = class003792.d().method_10093(class00860.E((class00500)class003792.w()));
            class00394 class003942 = class003792.G().method_8321((class07209)class066952);
            if (class003942 instanceof class00379) {
                class00379 class003793 = (class00379)class003942;
                ((InventoryStorageImpl)InventoryStorageImpl.of((class06695)class003793, null)).markDirtyParticipant.updateSnapshots(transactionContext);
            }
        }
    }

    public int getCapacity(ItemVariant itemVariant) {
        if (this.storage.inventory instanceof class07242 && this.slot == 1 && itemVariant.isOf((Object)class06570.jU)) {
            return 1;
        }
        if (this.storage.inventory instanceof class00415 && this.slot < 3) {
            return 1;
        }
        return Math.min(this.storage.inventory.method_5444(), itemVariant.getItem().M());
    }

    public void onFinalCommit() {
        class06584 class065842 = this.lastReleasedSnapshot;
        class06584 class065843 = this.getStack();
        class06695 class0669522 = this.storage.inventory;
        if (class0669522 instanceof SpecialLogicInventory) {
            SpecialLogicInventory specialLogicInventory = (SpecialLogicInventory)class0669522;
            specialLogicInventory.fabric_onFinalCommit(this.slot, class065842, class065843);
        }
        if (!class065842.R() && class065842.B() == class065843.B()) {
            if (!Objects.equals(class065842.u(), class065843.u())) {
                for (class06695 class0669522 : class065842.y().y()) {
                    class065842.N((class02477)class0669522, null);
                }
                class065842.y(class065843.y());
            }
            class065842.i(class065843.c());
            this.setStack(class065842);
        } else {
            class065842.i(0);
        }
    }

    protected void releaseSnapshot(class06584 class065842) {
        this.lastReleasedSnapshot = class065842;
    }

    private boolean canInsert(int n, class06584 class065842) {
        class06695 class066952 = this.storage.inventory;
        if (class066952 instanceof class07278) {
            class07278 class072782 = (class07278)class066952;
            return class072782.N(n, class065842, null);
        }
        return this.storage.inventory.method_5437(n, class065842);
    }
}

