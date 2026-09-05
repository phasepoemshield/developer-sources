/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.Protocol1_11_1To1_12
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ServerboundPackets1_12
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.provider.InventoryQuickMoveProvider
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_11_1to1_12.rewriter;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.Protocol1_11_1To1_12;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ServerboundPackets1_12;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.provider.InventoryQuickMoveProvider;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import org.checkerframework.checker.nullness.qual.Nullable;

public class ItemPacketRewriter1_12
extends ItemRewriter<ClientboundPackets1_9_3, ServerboundPackets1_12, Protocol1_11_1To1_12> {
    public ItemPacketRewriter1_12(Protocol1_11_1To1_12 protocol) {
        super((Protocol)protocol, Types.ITEM1_8, Types.ITEM1_8_SHORT_ARRAY);
    }

    public @Nullable Item handleItemToClient(UserConnection connection, @Nullable Item item) {
        if (item == null) {
            return null;
        }
        if (item.identifier() == 355) {
            item.setData((short)14);
        }
        return item;
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        if (item == null) {
            return null;
        }
        if (item.identifier() == 355) {
            item.setData((short)0);
        }
        boolean newItem = item.identifier() >= 235 && item.identifier() <= 252;
        if (newItem |= item.identifier() == 453) {
            item.setIdentifier(1);
            item.setData((short)0);
        }
        return item;
    }

    public void registerPackets() {
        this.registerSetSlot((ClientboundPacketType)ClientboundPackets1_9_3.CONTAINER_SET_SLOT);
        this.registerSetContent((ClientboundPacketType)ClientboundPackets1_9_3.CONTAINER_SET_CONTENT);
        this.registerSetEquippedItem((ClientboundPacketType)ClientboundPackets1_9_3.SET_EQUIPPED_ITEM);
        this.registerCustomPayloadTradeList((ClientboundPacketType)ClientboundPackets1_9_3.CUSTOM_PAYLOAD);
        ((Protocol1_11_1To1_12)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_12.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.VAR_INT);
                this.map(Types.ITEM1_8);
                this.handler(wrapper -> {
                    Item item = (Item)wrapper.get(Types.ITEM1_8, 0);
                    if (!Via.getConfig().is1_12QuickMoveActionFix()) {
                        ItemPacketRewriter1_12.this.handleItemToServer(wrapper.user(), item);
                        return;
                    }
                    byte button = (Byte)wrapper.get((Type)Types.BYTE, 1);
                    int mode = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (mode == 1 && button == 0 && item == null) {
                        short windowId = ((Byte)wrapper.get((Type)Types.BYTE, 0)).byteValue();
                        short slotId = (Short)wrapper.get((Type)Types.SHORT, 0);
                        short actionId = (Short)wrapper.get((Type)Types.SHORT, 1);
                        InventoryQuickMoveProvider provider = (InventoryQuickMoveProvider)Via.getManager().getProviders().get(InventoryQuickMoveProvider.class);
                        boolean succeed = provider.registerQuickMoveAction(windowId, slotId, actionId, wrapper.user());
                        if (succeed) {
                            wrapper.cancel();
                        }
                    } else {
                        ItemPacketRewriter1_12.this.handleItemToServer(wrapper.user(), item);
                    }
                });
            }
        });
        this.registerSetCreativeModeSlot((ServerboundPacketType)ServerboundPackets1_12.SET_CREATIVE_MODE_SLOT);
    }
}

