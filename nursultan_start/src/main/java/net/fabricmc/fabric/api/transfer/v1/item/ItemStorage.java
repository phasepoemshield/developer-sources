/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00379
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class05854
 *  minecraft.class06570
 *  minecraft.class06695
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07310
 *  net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup
 *  net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SidedStorageBlockEntity
 *  net.fabricmc.fabric.impl.transfer.item.BundleContentsStorage
 *  net.fabricmc.fabric.impl.transfer.item.ComposterWrapper
 *  net.fabricmc.fabric.impl.transfer.item.ContainerComponentStorage
 *  net.fabricmc.fabric.mixin.transfer.CompoundContainerAccessor
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.item;

import java.util.List;
import minecraft.class00379;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class05854;
import minecraft.class06570;
import minecraft.class06695;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07310;
import net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup;
import net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedSlottedStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SidedStorageBlockEntity;
import net.fabricmc.fabric.impl.transfer.item.BundleContentsStorage;
import net.fabricmc.fabric.impl.transfer.item.ComposterWrapper;
import net.fabricmc.fabric.impl.transfer.item.ContainerComponentStorage;
import net.fabricmc.fabric.mixin.transfer.CompoundContainerAccessor;
import org.jspecify.annotations.Nullable;

public final class ItemStorage {
    public static final BlockApiLookup<Storage<ItemVariant>, @Nullable class07211> SIDED = BlockApiLookup.get((class01894)class01894.N((String)"fabric", (String)"sided_item_storage"), Storage.asClass(), class07211.class);
    public static final ItemApiLookup<Storage<ItemVariant>, ContainerItemContext> ITEM = ItemApiLookup.get((class01894)class01894.N((String)"fabric", (String)"item_storage"), Storage.asClass(), ContainerItemContext.class);

    private ItemStorage() {
    }

    static {
        SIDED.registerForBlocks((class072992, class072092, class005002, class003942, class072112) -> ComposterWrapper.get((class07299)class072992, (class07209)class072092, (class07211)class072112), new class00891[]{class00869.TL});
        SIDED.registerFallback((class072992, class072092, class005002, class003942, class072112) -> {
            if (class003942 instanceof SidedStorageBlockEntity) {
                SidedStorageBlockEntity sidedStorageBlockEntity = (SidedStorageBlockEntity)class003942;
                return sidedStorageBlockEntity.getItemStorage(class072112);
            }
            return null;
        });
        SIDED.registerFallback((class072992, class072092, class005002, class003942, class072112) -> {
            class00891 class008912;
            class05854 class058542;
            class05854 class058543 = null;
            class00891 class008913 = class005002.i();
            if (class008913 instanceof class05854 && (class008913 = (class058542 = (class05854)class008913).N(class005002, (class07284)class072992, class072092)) == (class008912 = class058542.N(class005002, (class07284)class072992, class072092)) && class008913 != null) {
                return InventoryStorage.of((class06695)class008913, class072112);
            }
            if (class003942 instanceof class06695) {
                class058542 = (class06695)class003942;
                if (class003942 instanceof class00379 && (class008912 = class005002.i()) instanceof class00860) {
                    class008913 = (class00860)class008912;
                    class058543 = class00860.N((class00860)class008913, (class00500)class005002, (class07299)class072992, (class07209)class072092, (boolean)true);
                    if (class058543 instanceof CompoundContainerAccessor) {
                        class008912 = (CompoundContainerAccessor)class058543;
                        InventoryStorage inventoryStorage = InventoryStorage.of(class008912.fabric_getFirst(), class072112);
                        InventoryStorage inventoryStorage2 = InventoryStorage.of(class008912.fabric_getSecond(), class072112);
                        return new CombinedSlottedStorage(List.of(inventoryStorage, inventoryStorage2));
                    }
                } else {
                    class058543 = class058542;
                }
            }
            return class058543 != null ? InventoryStorage.of(class058543, class072112) : null;
        });
        ITEM.registerForItems((class065842, containerItemContext) -> new ContainerComponentStorage(containerItemContext, 27), new class07310[]{class06570.zS, class06570.zx, class06570.zD, class06570.zh, class06570.zr, class06570.UN, class06570.Uy, class06570.UL, class06570.Uu, class06570.Ui, class06570.UR, class06570.UM, class06570.UB, class06570.UZ, class06570.Uz, class06570.UU, class06570.UE});
        ITEM.registerForItems((class065842, containerItemContext) -> new BundleContentsStorage(containerItemContext), new class07310[]{class06570.jq, class06570.jK, class06570.jV, class06570.je, class06570.jH, class06570.jc, class06570.jX, class06570.ja, class06570.jp, class06570.jF, class06570.jA, class06570.jf, class06570.jC, class06570.jS, class06570.jx, class06570.jD, class06570.jh});
    }
}

