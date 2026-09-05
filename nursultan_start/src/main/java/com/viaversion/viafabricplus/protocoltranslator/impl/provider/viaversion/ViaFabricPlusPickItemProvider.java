/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.provider.PickItemProvider
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion;

import com.viaversion.viafabricplus.util.NotificationUtil;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.provider.PickItemProvider;

public final class ViaFabricPlusPickItemProvider
extends PickItemProvider {
    public void pickItemFromEntity(UserConnection userConnection, int n, boolean bl) {
        NotificationUtil.warnIncompatibilityPacket("1.21.4", "PICK_ITEM_FROM_ENTITY", "MinecraftClient#doItemPick", "Minecraft#pickBlock");
    }

    public void pickItemFromBlock(UserConnection userConnection, BlockPosition blockPosition, boolean bl) {
        NotificationUtil.warnIncompatibilityPacket("1.21.4", "PICK_ITEM_FROM_BLOCK", "MinecraftClient#doItemPick", "Minecraft#pickBlock");
    }
}

