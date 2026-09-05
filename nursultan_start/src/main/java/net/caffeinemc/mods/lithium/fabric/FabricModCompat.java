/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00739
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07234
 *  minecraft.class08092
 *  net.caffeinemc.mods.lithium.common.services.PlatformModCompat
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemStorage
 *  net.fabricmc.loader.api.FabricLoader
 */
package net.caffeinemc.mods.lithium.fabric;

import minecraft.class00500;
import minecraft.class00739;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07234;
import minecraft.class08092;
import net.caffeinemc.mods.lithium.common.services.PlatformModCompat;
import net.fabricmc.fabric.api.transfer.v1.item.ItemStorage;
import net.fabricmc.loader.api.FabricLoader;

public class FabricModCompat
implements PlatformModCompat {
    private static final boolean HAS_TRANSFER_API = FabricLoader.getInstance().isModLoaded("fabric-transfer-api-v1");

    private static boolean canFindApiInventory(class07234 class072342, class00500 class005002, boolean bl) {
        class07211 class072112 = bl ? class07211.field_11036 : (class07211)class005002.L((class08092)class00739.y);
        class07209 class072092 = class072342.d().method_10093(class072112);
        Object object = ItemStorage.SIDED.find(class072342.G(), class072092, (Object)class072112.b());
        return object != null;
    }

    public boolean canHopperInteractWithApiBlockInventory(class07234 class072342, class00500 class005002, boolean bl) {
        if (!HAS_TRANSFER_API) {
            return false;
        }
        return FabricModCompat.canFindApiInventory(class072342, class005002, bl);
    }
}

