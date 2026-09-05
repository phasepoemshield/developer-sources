/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viafabricplus.util.NotificationUtil
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.Protocol1_16_4To1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.viaversion.viaversion.protocols.v1_16_4to1_17.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viafabricplus.util.NotificationUtil;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.Protocol1_16_4To1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class ItemPacketRewriter1_17
extends ItemRewriter<ClientboundPackets1_16_2, ServerboundPackets1_17, Protocol1_16_4To1_17> {
    public ItemPacketRewriter1_17(Protocol1_16_4To1_17 protocol1_16_4To1_17) {
        super((Protocol)protocol1_16_4To1_17, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    public Item handleItemToClient(UserConnection userConnection, Item item) {
        if (item == null) {
            return null;
        }
        CompoundTag compoundTag = item.tag();
        if (item.identifier() == 733) {
            if (compoundTag == null) {
                compoundTag = new CompoundTag();
                item.setTag(compoundTag);
            }
            if (compoundTag.getNumberTag("map") == null) {
                compoundTag.put("map", (Tag)new IntTag(0));
            }
        }
        item.setIdentifier(((Protocol1_16_4To1_17)this.protocol).getMappingData().getNewItemId(item.identifier()));
        return item;
    }

    public void registerPackets() {
        new RecipeRewriter(this.protocol).register((ClientboundPacketType)ClientboundPackets1_16_2.UPDATE_RECIPES);
        ((Protocol1_16_4To1_17)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_17.EDIT_BOOK, packetWrapper -> this.handleItemToServer(packetWrapper.user(), (Item)packetWrapper.passthrough(Types.ITEM1_13_2)));
        ((Protocol1_16_4To1_17)this.protocol).replaceServerbound((ServerboundPacketType)ServerboundPackets1_17.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ ItemPacketRewriter1_17 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> wrapper.write((Type)Types.SHORT, (Object)0));
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int length = (Integer)wrapper.read((Type)Types.VAR_INT);
                    for (int i = 0; i < length; ++i) {
                        wrapper.read((Type)Types.SHORT);
                        wrapper.read(Types.ITEM1_13_2);
                    }
                    Item item = (Item)wrapper.read(Types.ITEM1_13_2);
                    int action = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (action == 5 || action == 1) {
                        item = null;
                    } else {
                        this.this$0.handleItemToServer(wrapper.user(), item);
                    }
                    wrapper.write(Types.ITEM1_13_2, (Object)item);
                });
            }
        });
        ((Protocol1_16_4To1_17)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16_2.CONTAINER_ACK, null, packetWrapper -> {
            short s = (Short)packetWrapper.read((Type)Types.UNSIGNED_BYTE);
            short s2 = (Short)packetWrapper.read((Type)Types.SHORT);
            boolean bl = (Boolean)packetWrapper.read((Type)Types.BOOLEAN);
            if (!bl) {
                int n = 0x40000000 | s << 16 | s2 & 0xFFFF;
                PacketWrapper packetWrapper2 = packetWrapper.create((PacketType)ClientboundPackets1_17.PING);
                packetWrapper2.write((Type)Types.INT, (Object)n);
                packetWrapper2.send(Protocol1_16_4To1_17.class);
            }
            packetWrapper.cancel();
        });
        ((Protocol1_16_4To1_17)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_17.PONG, null, packetWrapper -> {
            int n = (Integer)packetWrapper.read((Type)Types.INT);
            if ((n & 0x40000000) != 0) {
                byte by = (byte)(n >> 16 & 0xFF);
                short s = (short)(n & 0xFFFF);
                PacketWrapper packetWrapper2 = packetWrapper.create((PacketType)ServerboundPackets1_16_2.CONTAINER_ACK);
                packetWrapper2.write((Type)Types.BYTE, (Object)by);
                packetWrapper2.write((Type)Types.SHORT, (Object)s);
                packetWrapper2.write((Type)Types.BOOLEAN, (Object)true);
                packetWrapper2.sendToServer(Protocol1_16_4To1_17.class);
            }
            packetWrapper.cancel();
        });
        this.handler$dip001$viafabricplus$removeContainerClickHandler(null);
    }

    private void handler$dip001$viafabricplus$removeContainerClickHandler(CallbackInfo callbackInfo) {
        ((Protocol1_16_4To1_17)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_17.CONTAINER_CLICK, (ServerboundPacketType)ServerboundPackets1_16_2.CONTAINER_CLICK, packetWrapper -> {
            NotificationUtil.warnIncompatibilityPacket((String)"1.17", (String)"CONTAINER_CLICK", (String)"ClientPlayerInteractionManager#clickSlot", (String)"MultiPlayerGameMode#handleInventoryMouseClick");
            packetWrapper.cancel();
        }, true);
    }
}

