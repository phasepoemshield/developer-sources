/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.MapMaker
 *  com.google.common.primitives.Ints
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class04651
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08092
 *  net.fabricmc.fabric.api.transfer.v1.fluid.CauldronFluidContent
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant
 */
package net.fabricmc.fabric.impl.transfer.fluid;

import com.google.common.collect.MapMaker;
import com.google.common.primitives.Ints;
import java.util.Map;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class04651;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08092;
import net.fabricmc.fabric.api.transfer.v1.fluid.CauldronFluidContent;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant;
import net.fabricmc.fabric.impl.transfer.fluid.CauldronStorage$WorldLocation;

public class CauldronStorage
extends SnapshotParticipant<class00500>
implements SingleSlotStorage<FluidVariant> {
    private static final Map<CauldronStorage$WorldLocation, CauldronStorage> CAULDRONS = new MapMaker().concurrencyLevel(1).weakValues().makeMap();
    private final CauldronStorage$WorldLocation location;
    private class00500 lastReleasedSnapshot;

    CauldronStorage(CauldronStorage$WorldLocation cauldronStorage$WorldLocation) {
        this.location = cauldronStorage$WorldLocation;
    }

    public static CauldronStorage get(class07299 class072992, class07209 class072092) {
        CauldronStorage$WorldLocation cauldronStorage$WorldLocation = new CauldronStorage$WorldLocation(class072992, class072092.method_10062());
        return CAULDRONS.computeIfAbsent(cauldronStorage$WorldLocation, CauldronStorage::new);
    }

    public String toString() {
        return "CauldronStorage[" + String.valueOf((Object)this.location) + "]";
    }

    public long extract(FluidVariant fluidVariant, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative((TransferVariant)fluidVariant, (long)l);
        CauldronFluidContent cauldronFluidContent = this.getCurrentContent();
        if (fluidVariant.isOf((Object)cauldronFluidContent.fluid)) {
            int n;
            int n2 = Ints.saturatedCast((long)(l / cauldronFluidContent.amountPerLevel));
            int n3 = Math.min(n2, n = cauldronFluidContent.currentLevel(this.createSnapshot()));
            if (n3 > 0) {
                if (n3 == n) {
                    this.updateSnapshots(transactionContext);
                    this.location.world.method_8652(this.location.pos, class00869.MZ.W(), 0);
                } else {
                    this.updateLevel(cauldronFluidContent, n - n3, transactionContext);
                }
            }
            return (long)n3 * cauldronFluidContent.amountPerLevel;
        }
        return 0L;
    }

    public long insert(FluidVariant fluidVariant, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative((TransferVariant)fluidVariant, (long)l);
        CauldronFluidContent cauldronFluidContent = CauldronFluidContent.getForFluid((class04651)fluidVariant.getFluid());
        if (cauldronFluidContent != null) {
            int n = Ints.saturatedCast((long)(l / cauldronFluidContent.amountPerLevel));
            if (this.getAmount() == 0L) {
                int n2 = Math.min(n, cauldronFluidContent.maxLevel);
                if (n2 > 0) {
                    this.updateLevel(cauldronFluidContent, n2, transactionContext);
                }
                return (long)n2 * cauldronFluidContent.amountPerLevel;
            }
            CauldronFluidContent cauldronFluidContent2 = this.getCurrentContent();
            if (fluidVariant.isOf((Object)cauldronFluidContent2.fluid)) {
                int n3 = cauldronFluidContent2.currentLevel(this.createSnapshot());
                int n4 = Math.min(n, cauldronFluidContent2.maxLevel - n3);
                if (n4 > 0) {
                    this.updateLevel(cauldronFluidContent2, n3 + n4, transactionContext);
                }
                return (long)n4 * cauldronFluidContent2.amountPerLevel;
            }
        }
        return 0L;
    }

    public FluidVariant getResource() {
        return FluidVariant.of((class04651)this.getCurrentContent().fluid);
    }

    public long getCapacity() {
        CauldronFluidContent cauldronFluidContent = this.getCurrentContent();
        return (long)cauldronFluidContent.maxLevel * cauldronFluidContent.amountPerLevel;
    }

    private void updateLevel(CauldronFluidContent cauldronFluidContent, int n, TransactionContext transactionContext) {
        this.updateSnapshots(transactionContext);
        class00500 class005002 = cauldronFluidContent.block.W();
        if (cauldronFluidContent.levelProperty != null) {
            class005002 = (class00500)class005002.y((class08092)cauldronFluidContent.levelProperty, (Comparable)Integer.valueOf(n));
        }
        this.location.world.method_8652(this.location.pos, class005002, 0);
    }

    public void onFinalCommit() {
        class00500 class005002 = this.lastReleasedSnapshot;
        class00500 class005003 = this.createSnapshot();
        if (class005002 != class005003) {
            this.location.world.method_8652(this.location.pos, class005002, 0);
            this.location.world.method_8501(this.location.pos, class005003);
        }
    }

    public void readSnapshot(class00500 class005002) {
        this.location.world.method_8652(this.location.pos, class005002, 0);
    }

    public class00500 createSnapshot() {
        return this.location.world.method_8320(this.location.pos);
    }

    protected void releaseSnapshot(class00500 class005002) {
        this.lastReleasedSnapshot = class005002;
    }

    public long getAmount() {
        CauldronFluidContent cauldronFluidContent = this.getCurrentContent();
        return (long)cauldronFluidContent.currentLevel(this.createSnapshot()) * cauldronFluidContent.amountPerLevel;
    }

    private CauldronFluidContent getCurrentContent() {
        CauldronFluidContent cauldronFluidContent = CauldronFluidContent.getForBlock((class00891)this.createSnapshot().i());
        if (cauldronFluidContent == null) {
            throw new IllegalStateException("Unexpected error: no cauldron at location " + String.valueOf((Object)this.location));
        }
        return cauldronFluidContent;
    }

    public boolean isResourceBlank() {
        return this.getResource().isBlank();
    }
}

