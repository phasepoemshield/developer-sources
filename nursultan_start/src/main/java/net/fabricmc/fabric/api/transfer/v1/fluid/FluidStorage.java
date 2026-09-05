/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class06506
 *  minecraft.class06517
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06913
 *  minecraft.class07211
 *  minecraft.class07310
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup
 *  net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SidedStorageBlockEntity
 *  net.fabricmc.fabric.impl.transfer.fluid.CombinedProvidersImpl
 *  net.fabricmc.fabric.impl.transfer.fluid.EmptyBucketStorage
 *  net.fabricmc.fabric.impl.transfer.fluid.WaterPotionStorage
 *  net.fabricmc.fabric.mixin.transfer.BucketItemAccessor
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.fluid;

import minecraft.class01894;
import minecraft.class02484;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06913;
import minecraft.class07211;
import minecraft.class07310;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup;
import net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.fluid.CauldronFluidContent;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage$CombinedItemApiProvider;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.EmptyItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.FullItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SidedStorageBlockEntity;
import net.fabricmc.fabric.impl.transfer.fluid.CombinedProvidersImpl;
import net.fabricmc.fabric.impl.transfer.fluid.EmptyBucketStorage;
import net.fabricmc.fabric.impl.transfer.fluid.WaterPotionStorage;
import net.fabricmc.fabric.mixin.transfer.BucketItemAccessor;
import org.jspecify.annotations.Nullable;

public final class FluidStorage {
    public static final BlockApiLookup<Storage<FluidVariant>, @Nullable class07211> SIDED = BlockApiLookup.get((class01894)class01894.N((String)"fabric", (String)"sided_fluid_storage"), Storage.asClass(), class07211.class);
    public static final ItemApiLookup<Storage<FluidVariant>, ContainerItemContext> ITEM = ItemApiLookup.get((class01894)class01894.N((String)"fabric", (String)"fluid_storage"), Storage.asClass(), ContainerItemContext.class);
    public static final Event<FluidStorage$CombinedItemApiProvider> GENERAL_COMBINED_PROVIDER = CombinedProvidersImpl.createEvent((boolean)false);

    private FluidStorage() {
    }

    static {
        CauldronFluidContent.getForFluid((class04651)class04684.L);
        SIDED.registerFallback((class072992, class072092, class005002, class003942, class072112) -> {
            if (class003942 instanceof SidedStorageBlockEntity) {
                SidedStorageBlockEntity sidedStorageBlockEntity = (SidedStorageBlockEntity)class003942;
                return sidedStorageBlockEntity.getFluidStorage(class072112);
            }
            return null;
        });
        ITEM.registerFallback((class065842, containerItemContext) -> ((FluidStorage$CombinedItemApiProvider)GENERAL_COMBINED_PROVIDER.invoker()).find((ContainerItemContext)containerItemContext));
        FluidStorage.combinedItemApiProvider(class06570.jU).register(EmptyBucketStorage::new);
        GENERAL_COMBINED_PROVIDER.register(containerItemContext -> {
            class06913 class069132;
            class06581 class065812 = containerItemContext.getItemVariant().getItem();
            if (class065812 instanceof class06913 && (class065812 = ((BucketItemAccessor)(class069132 = (class06913)class065812)).fabric_getFluid()) != null && class065812.N() == class069132) {
                return new FullItemFluidStorage(containerItemContext, class06570.jU, FluidVariant.of((class04651)class065812), 81000L);
            }
            return null;
        });
        FluidStorage.combinedItemApiProvider(class06570.nP).register(containerItemContext -> new EmptyItemFluidStorage(containerItemContext, itemVariant -> {
            class06584 class065842 = itemVariant.toStack();
            class065842.N(class02484.h, (Object)new class06517(class06506.N));
            return ItemVariant.of((class07310)class06570.ns, class065842.u());
        }, (class04651)class04684.L, 27000L));
        FluidStorage.combinedItemApiProvider(class06570.ns).register(WaterPotionStorage::find);
    }

    public static Event<FluidStorage$CombinedItemApiProvider> combinedItemApiProvider(class06581 class065812) {
        return CombinedProvidersImpl.getOrCreateItemEvent((class06581)class065812);
    }
}

