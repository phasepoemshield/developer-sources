/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04684
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07080
 *  minecraft.class07878
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.transfer.v1.transaction.Transaction
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  net.fabricmc.fabric.impl.transfer.DebugMessages
 */
package net.fabricmc.fabric.api.transfer.v1.fluid;

import java.util.Objects;
import minecraft.class04684;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07080;
import minecraft.class07878;
import minecraft.class08036;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.DebugMessages;

public final class FluidStorageUtil {
    private FluidStorageUtil() {
    }

    public static boolean interactWithFluidStorage(Storage<FluidVariant> storage, class08036 class080362, class07050 class070502) {
        Storage<FluidVariant> storage2 = ContainerItemContext.forPlayerInteraction(class080362, class070502).find(FluidStorage.ITEM);
        if (storage2 == null) {
            return false;
        }
        class06581 class065812 = class080362.method_5998(class070502).B();
        try {
            return FluidStorageUtil.moveWithSound(storage, storage2, class080362, true, class065812) || FluidStorageUtil.moveWithSound(storage2, storage, class080362, false, class065812);
        }
        catch (Exception exception) {
            class07080 class070802 = class07080.N((Throwable)exception, (String)"Interacting with fluid storage");
            class070802.N("Interaction details").N("Player", () -> DebugMessages.forPlayer((class08036)class080362)).N("Hand", (Object)class070502).N("Hand item", () -> ((class06581)class065812).toString()).N("Fluid storage", () -> Objects.toString(storage, null));
            throw new class07878(class070802);
        }
    }

    private static boolean moveWithSound(Storage<FluidVariant> storage, Storage<FluidVariant> storage2, class08036 class080362, boolean bl, class06581 class065812) {
        for (StorageView<FluidVariant> storageView : storage) {
            long l;
            if (storageView.isResourceBlank()) continue;
            FluidVariant fluidVariant = storageView.getResource();
            try (Transaction transaction = Transaction.openOuter();){
                l = storageView.extract(fluidVariant, Long.MAX_VALUE, (TransactionContext)transaction);
                transaction.abort();
            }
            transaction = Transaction.openOuter();
            try {
                class04891 class048912;
                long l2 = storage2.insert(fluidVariant, l, (TransactionContext)transaction);
                if (l2 <= 0L || storageView.extract(fluidVariant, l2, (TransactionContext)transaction) != l2) continue;
                transaction.commit();
                class04891 class048913 = class048912 = bl ? FluidVariantAttributes.getFillSound(fluidVariant) : FluidVariantAttributes.getEmptySound(fluidVariant);
                if (fluidVariant.isOf(class04684.L)) {
                    if (bl && class065812 == class06570.nP) {
                        class048912 = class04909.LX;
                    }
                    if (!bl && class065812 == class06570.ns) {
                        class048912 = class04909.Lc;
                    }
                }
                class080362.method_73183().method_43128((class07049)class080362, class080362.method_23317(), class080362.method_23320(), class080362.method_23321(), class048912, class04911.field_15248, 1.0f, 1.0f);
                boolean bl2 = true;
                return bl2;
            }
            finally {
                if (transaction == null) continue;
                transaction.close();
            }
        }
        return false;
    }
}

