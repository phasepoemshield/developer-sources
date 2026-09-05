/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.storage.AlphaInventoryTracker
 */
package net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.provider;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.Protocola1_2_3_5_1_2_6Tob1_0_1_1_1;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.provider.AlphaInventoryProvider;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.storage.AlphaInventoryTracker;

public class TrackingAlphaInventoryProvider
extends AlphaInventoryProvider {
    @Override
    public void addToInventory(UserConnection user, Item item) {
        ((AlphaInventoryTracker)user.get(AlphaInventoryTracker.class)).addItem(item);
    }

    @Override
    public Item[] getContainerItems(UserConnection user) {
        return Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.copyItems(((AlphaInventoryTracker)user.get(AlphaInventoryTracker.class)).getOpenContainerItems());
    }

    @Override
    public Item[] getCraftingInventoryItems(UserConnection user) {
        return Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.copyItems(((AlphaInventoryTracker)user.get(AlphaInventoryTracker.class)).getCraftingInventory());
    }

    @Override
    public boolean usesInventoryTracker() {
        return true;
    }

    @Override
    public Item[] getMainInventoryItems(UserConnection user) {
        return Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.copyItems(((AlphaInventoryTracker)user.get(AlphaInventoryTracker.class)).getMainInventory());
    }

    @Override
    public Item[] getArmorInventoryItems(UserConnection user) {
        return Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.copyItems(((AlphaInventoryTracker)user.get(AlphaInventoryTracker.class)).getArmorInventory());
    }
}

