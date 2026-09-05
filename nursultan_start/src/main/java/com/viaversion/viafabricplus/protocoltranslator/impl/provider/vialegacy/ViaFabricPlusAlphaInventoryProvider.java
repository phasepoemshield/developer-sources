/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class07482
 *  minecraft.class08044
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.provider.AlphaInventoryProvider
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy;

import com.viaversion.viafabricplus.protocoltranslator.translator.ItemTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import java.util.List;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07482;
import minecraft.class08044;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.provider.AlphaInventoryProvider;

public final class ViaFabricPlusAlphaInventoryProvider
extends AlphaInventoryProvider {
    public void addToInventory(UserConnection userConnection, Item item) {
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        class044532.method_31548().M(ItemTranslator.viaToMc(item, LegacyProtocolVersion.b1_8tob1_8_1));
    }

    public Item[] getContainerItems(UserConnection userConnection) {
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        if (class044532 == null) {
            return new Item[37];
        }
        return this.convertItems((List<class06584>)((class07482)class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).L());
    }

    private Item convertItem(class06584 class065842) {
        Item item;
        if (!class065842.R() && (item = ItemTranslator.mcToVia(class065842, LegacyProtocolVersion.b1_8tob1_8_1)) != null) {
            return item.copy();
        }
        return null;
    }

    private Item[] convertItems(List<class06584> list) {
        Item[] itemArray = new Item[list.size()];
        for (int i = 0; i < itemArray.length; ++i) {
            itemArray[i] = this.convertItem(list.get(i));
        }
        return itemArray;
    }

    public Item[] getCraftingInventoryItems(UserConnection userConnection) {
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        if (class044532 == null) {
            return new Item[4];
        }
        return this.convertItems(class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.T().aC_());
    }

    public boolean usesInventoryTracker() {
        return false;
    }

    public Item[] getMainInventoryItems(UserConnection userConnection) {
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        if (class044532 == null) {
            return new Item[37];
        }
        return this.convertItems((List<class06584>)class044532.method_31548().u());
    }

    public Item[] getArmorInventoryItems(UserConnection userConnection) {
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        Item[] itemArray = new Item[4];
        if (class044532 != null) {
            class08044 class080442 = class044532.method_31548();
            itemArray[0] = this.convertItem(class080442.U.N(class07085.field_6166));
            itemArray[1] = this.convertItem(class080442.U.N(class07085.field_6172));
            itemArray[2] = this.convertItem(class080442.U.N(class07085.field_6174));
            itemArray[3] = this.convertItem(class080442.U.N(class07085.field_6169));
        }
        return itemArray;
    }
}

