/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.protocols.v1_8to1_9.provider.HandItemProvider
 *  minecraft.class06584
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion;

import com.viaversion.viafabricplus.protocoltranslator.translator.ItemTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.HandItemProvider;
import minecraft.class06584;

public final class ViaFabricPlusHandItemProvider
extends HandItemProvider {
    public static class06584 lastUsedItem = null;

    public Item getHandItem(UserConnection userConnection) {
        if (lastUsedItem != null && !lastUsedItem.R()) {
            return ItemTranslator.mcToVia(lastUsedItem, ProtocolVersion.v1_8);
        }
        return null;
    }
}

