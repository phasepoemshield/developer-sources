/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02484
 *  minecraft.class02678
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class06506
 *  minecraft.class06517
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07310
 *  net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.ExtractionOnlyStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.transfer.fluid;

import minecraft.class02484;
import minecraft.class02678;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07310;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.ExtractionOnlyStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import org.jspecify.annotations.Nullable;

public class WaterPotionStorage
implements ExtractionOnlyStorage<FluidVariant>,
SingleSlotStorage<FluidVariant> {
    private static final FluidVariant CONTAINED_FLUID = FluidVariant.of((class04651)class04684.L);
    private static final long CONTAINED_AMOUNT = 27000L;
    private final ContainerItemContext context;

    private WaterPotionStorage(ContainerItemContext containerItemContext) {
        this.context = containerItemContext;
    }

    public String toString() {
        return "WaterPotionStorage[" + String.valueOf(this.context) + "]";
    }

    public long extract(FluidVariant fluidVariant, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative((TransferVariant)fluidVariant, (long)l);
        if (!this.isWaterPotion()) {
            return 0L;
        }
        if (fluidVariant.equals((Object)CONTAINED_FLUID) && l >= 27000L && this.context.exchange(this.mapToGlassBottle(), 1L, transactionContext) == 1L) {
            return 27000L;
        }
        return 0L;
    }

    public FluidVariant getResource() {
        if (this.isWaterPotion()) {
            return CONTAINED_FLUID;
        }
        return FluidVariant.blank();
    }

    public static @Nullable WaterPotionStorage find(ContainerItemContext containerItemContext) {
        return WaterPotionStorage.isWaterPotion(containerItemContext) ? new WaterPotionStorage(containerItemContext) : null;
    }

    public long getCapacity() {
        return this.getAmount();
    }

    public long getAmount() {
        if (this.isWaterPotion()) {
            return 27000L;
        }
        return 0L;
    }

    private static boolean isWaterPotion(ContainerItemContext containerItemContext) {
        ItemVariant itemVariant = containerItemContext.getItemVariant();
        class06517 class065172 = (class06517)itemVariant.getComponentMap().a_(class02484.h, (Object)class06517.N);
        return itemVariant.isOf((Object)class06570.ns) && class065172.i().orElse(null) == class06506.N;
    }

    private boolean isWaterPotion() {
        return WaterPotionStorage.isWaterPotion(this.context);
    }

    private ItemVariant mapToGlassBottle() {
        class06584 class065842 = this.context.getItemVariant().toStack();
        class065842.N(class02484.h, (Object)class06517.N);
        return ItemVariant.of((class07310)class06570.nP, (class02678)class065842.u());
    }

    public boolean isResourceBlank() {
        return this.getResource().isBlank();
    }
}

