/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.DoubleTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viafabricplus.base.sync_tasks.SyncTasks
 *  com.viaversion.viafabricplus.protocoltranslator.translator.TextComponentTranslator
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
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
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.storage.EntityTracker1_14
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.ProtocolLogger
 *  minecraft.class00392
 *  minecraft.class03748
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class06026
 *  minecraft.class06202
 *  minecraft.class06695
 *  minecraft.class07075
 *  minecraft.class07490
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.viaversion.viaversion.protocols.v1_13_2to1_14.rewriter;

import com.google.common.collect.Sets;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.DoubleTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viafabricplus.base.sync_tasks.SyncTasks;
import com.viaversion.viafabricplus.protocoltranslator.translator.TextComponentTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
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
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.Protocol1_13_2To1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.storage.EntityTracker1_14;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.ProtocolLogger;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class06026;
import minecraft.class06202;
import minecraft.class06695;
import minecraft.class07075;
import minecraft.class07490;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class ItemPacketRewriter1_14
extends ItemRewriter<ClientboundPackets1_13, ServerboundPackets1_14, Protocol1_13_2To1_14> {
    private static final Set<String> REMOVED_RECIPE_TYPES = Sets.newHashSet((Object[])new String[]{"crafting_special_banneraddpattern", "crafting_special_repairitem"});
    private static final JsonNBTComponentRewriter<ClientboundPackets1_13> COMPONENT_REWRITER = new JsonNBTComponentRewriter<ClientboundPackets1_13>(null, ComponentRewriterBase.ReadType.JSON){

        protected void handleTranslate(JsonObject object, String translate) {
            super.handleTranslate(object, translate);
            if (translate.startsWith("block.") && translate.endsWith(".name")) {
                object.addProperty("translate", translate.substring(0, translate.length() - 5));
            }
        }
    };

    public ItemPacketRewriter1_14(Protocol1_13_2To1_14 protocol1_13_2To1_14) {
        super((Protocol)protocol1_13_2To1_14, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    private void handler$dlh000$viafabricplus$supportLargeContainers(PacketWrapper packetWrapper, CallbackInfo callbackInfo, Short s, String string, JsonElement jsonElement, Short s2) {
        if ((string.equals("minecraft:container") || string.equals("minecraft:chest")) && (s2 > 54 || s2 <= 0)) {
            callbackInfo.cancel();
            String string2 = SyncTasks.executeSyncTask(class042472 -> {
                class06202 class062022 = class06202.Nq();
                try {
                    class07490 class074902;
                    short s = class042472.readUnsignedByte();
                    short s2 = class042472.readUnsignedByte();
                    class00392 class003922 = (class00392)class03748.u.decode(class042472);
                    class07490 class074903 = class074902 = new class07490(null, (int)s, ((class04453)class062022.T_4).method_31548(), (class06695)new class07075((int)s2), class04995.u((float)((float)s2 / 9.0f)));
                    ((class04453)class062022.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = class074903;
                    class062022.N((class05096)new class06026(class074902, ((class04453)class062022.T_4).method_31548(), class003922));
                }
                catch (Throwable throwable) {
                    throw new RuntimeException("Failed to handle OpenWindow packet data", throwable);
                }
            });
            packetWrapper.clearPacket();
            packetWrapper.setPacketType((PacketType)ClientboundPackets1_14.CUSTOM_PAYLOAD);
            packetWrapper.write(Types.STRING, (Object)SyncTasks.PACKET_SYNC_IDENTIFIER);
            packetWrapper.write(Types.STRING, (Object)string2);
            packetWrapper.write((Type)Types.UNSIGNED_BYTE, (Object)s);
            packetWrapper.write((Type)Types.UNSIGNED_BYTE, (Object)s2);
            packetWrapper.write(Types.TAG, (Object)TextComponentTranslator.via1_14toViaLatest((JsonElement)jsonElement));
        }
    }

    public Item handleItemToClient(UserConnection userConnection, Item item) {
        ListTag listTag;
        if (item == null) {
            return null;
        }
        item.setIdentifier(Protocol1_13_2To1_14.MAPPINGS.getNewItemId(item.identifier()));
        if (item.tag() == null) {
            return item;
        }
        CompoundTag compoundTag = item.tag().getCompoundTag("display");
        if (compoundTag != null && (listTag = compoundTag.getListTag("Lore", StringTag.class)) != null) {
            compoundTag.put(this.nbtTagName("Lore"), (Tag)listTag.copy());
            for (StringTag stringTag : listTag) {
                String string = ComponentUtil.legacyToJsonString((String)stringTag.getValue(), (boolean)true);
                stringTag.setValue(string);
            }
        }
        return item;
    }

    public Item handleItemToServer(UserConnection userConnection, Item item) {
        ListTag listTag;
        if (item == null) {
            return null;
        }
        item.setIdentifier(Protocol1_13_2To1_14.MAPPINGS.getOldItemId(item.identifier()));
        if (item.tag() == null) {
            return item;
        }
        CompoundTag compoundTag = item.tag().getCompoundTag("display");
        if (compoundTag != null && (listTag = compoundTag.getListTag("Lore", StringTag.class)) != null) {
            Tag tag = compoundTag.remove(this.nbtTagName("Lore"));
            if (tag instanceof ListTag) {
                compoundTag.put("Lore", tag.copy());
            } else {
                for (StringTag stringTag : listTag) {
                    stringTag.setValue(ComponentUtil.jsonToLegacy((String)stringTag.getValue()));
                }
            }
        }
        return item;
    }

    public void registerPackets() {
        ((Protocol1_13_2To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.OPEN_SCREEN, null, packetWrapper -> {
            Short s = (Short)packetWrapper.read((Type)Types.UNSIGNED_BYTE);
            String string = (String)packetWrapper.read(Types.STRING);
            JsonElement jsonElement = (JsonElement)packetWrapper.read(Types.COMPONENT);
            COMPONENT_REWRITER.processText(packetWrapper.user(), jsonElement);
            Short s2 = (Short)packetWrapper.read((Type)Types.UNSIGNED_BYTE);
            if (string.equals("EntityHorse")) {
                packetWrapper.setPacketType((PacketType)ClientboundPackets1_14.HORSE_SCREEN_OPEN);
                int n = (Integer)packetWrapper.read((Type)Types.INT);
                packetWrapper.write((Type)Types.UNSIGNED_BYTE, (Object)s);
                packetWrapper.write((Type)Types.VAR_INT, (Object)s2.intValue());
                packetWrapper.write((Type)Types.INT, (Object)n);
            } else {
                packetWrapper.setPacketType((PacketType)ClientboundPackets1_14.OPEN_SCREEN);
                packetWrapper.write((Type)Types.VAR_INT, (Object)s.intValue());
                int n = -1;
                switch (string) {
                    case "minecraft:crafting_table": {
                        n = 11;
                        break;
                    }
                    case "minecraft:furnace": {
                        n = 13;
                        break;
                    }
                    case "minecraft:dropper": 
                    case "minecraft:dispenser": {
                        n = 6;
                        break;
                    }
                    case "minecraft:enchanting_table": {
                        n = 12;
                        break;
                    }
                    case "minecraft:brewing_stand": {
                        n = 10;
                        break;
                    }
                    case "minecraft:villager": {
                        n = 18;
                        break;
                    }
                    case "minecraft:beacon": {
                        n = 8;
                        break;
                    }
                    case "minecraft:anvil": {
                        n = 7;
                        break;
                    }
                    case "minecraft:hopper": {
                        n = 15;
                        break;
                    }
                    case "minecraft:shulker_box": {
                        n = 19;
                        break;
                    }
                    default: {
                        if (s2 <= 0 || s2 > 54) break;
                        n = s2 / 9 - 1;
                    }
                }
                if (n == -1) {
                    ProtocolLogger protocolLogger = ((Protocol1_13_2To1_14)this.protocol).getLogger();
                    String string2 = "Can't open inventory for player! Type: " + string + " Size: " + s2;
                    CallbackInfo callbackInfo = new CallbackInfo("", true);
                    this.handler$dlh000$viafabricplus$supportLargeContainers(packetWrapper, callbackInfo, s, string, jsonElement, s2);
                    if (callbackInfo.isCancelled()) {
                        return;
                    }
                    protocolLogger.warning(string2);
                }
                packetWrapper.write((Type)Types.VAR_INT, (Object)n);
                packetWrapper.write(Types.COMPONENT, (Object)jsonElement);
            }
        });
        ((Protocol1_13_2To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ ItemPacketRewriter1_14 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map(Types.STRING);
                this.handlerSoftFail(wrapper -> {
                    String channel = Key.namespaced((String)((String)wrapper.get(Types.STRING, 0)));
                    if (channel.equals("minecraft:trader_list")) {
                        wrapper.setPacketType((PacketType)ClientboundPackets1_14.MERCHANT_OFFERS);
                        wrapper.resetReader();
                        wrapper.read(Types.STRING);
                        int windowId = (Integer)wrapper.read((Type)Types.INT);
                        EntityTracker1_14 tracker = (EntityTracker1_14)wrapper.user().getEntityTracker(Protocol1_13_2To1_14.class);
                        tracker.setLatestTradeWindowId(windowId);
                        wrapper.write((Type)Types.VAR_INT, (Object)windowId);
                        int size = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
                        for (int i = 0; i < size; ++i) {
                            this.this$0.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                            this.this$0.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                            boolean secondItem = (Boolean)wrapper.passthrough((Type)Types.BOOLEAN);
                            if (secondItem) {
                                this.this$0.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                            }
                            wrapper.passthrough((Type)Types.BOOLEAN);
                            wrapper.passthrough((Type)Types.INT);
                            wrapper.passthrough((Type)Types.INT);
                            wrapper.write((Type)Types.INT, (Object)0);
                            wrapper.write((Type)Types.INT, (Object)0);
                            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
                        }
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                        wrapper.write((Type)Types.BOOLEAN, (Object)false);
                        wrapper.clearInputBuffer();
                    } else if (channel.equals("minecraft:book_open")) {
                        int hand = (Integer)wrapper.read((Type)Types.VAR_INT);
                        wrapper.clearPacket();
                        wrapper.setPacketType((PacketType)ClientboundPackets1_14.OPEN_BOOK);
                        wrapper.write((Type)Types.VAR_INT, (Object)hand);
                    }
                });
            }
        });
        RecipeRewriter recipeRewriter = new RecipeRewriter(this.protocol);
        ((Protocol1_13_2To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.UPDATE_RECIPES, packetWrapper -> {
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            int n2 = 0;
            for (int i = 0; i < n; ++i) {
                String string = (String)packetWrapper.read(Types.STRING);
                String string2 = (String)packetWrapper.read(Types.STRING);
                if (REMOVED_RECIPE_TYPES.contains(string2)) {
                    ++n2;
                    continue;
                }
                packetWrapper.write(Types.STRING, (Object)string2);
                packetWrapper.write(Types.STRING, (Object)string);
                recipeRewriter.handleRecipeType(packetWrapper, string2);
            }
            packetWrapper.set((Type)Types.VAR_INT, 0, (Object)(n - n2));
        });
        ((Protocol1_13_2To1_14)this.protocol).registerServerbound(ServerboundPackets1_14.SELECT_TRADE, packetWrapper -> {
            PacketWrapper packetWrapper2 = packetWrapper.create((PacketType)ServerboundPackets1_13.CONTAINER_CLICK);
            EntityTracker1_14 entityTracker1_14 = (EntityTracker1_14)packetWrapper.user().getEntityTracker(Protocol1_13_2To1_14.class);
            packetWrapper2.write((Type)Types.BYTE, (Object)((byte)entityTracker1_14.getLatestTradeWindowId()));
            packetWrapper2.write((Type)Types.SHORT, (Object)-999);
            packetWrapper2.write((Type)Types.BYTE, (Object)2);
            packetWrapper2.write((Type)Types.SHORT, (Object)((short)ThreadLocalRandom.current().nextInt()));
            packetWrapper2.write((Type)Types.VAR_INT, (Object)5);
            CompoundTag compoundTag = new CompoundTag();
            compoundTag.put("force_resync", (Tag)new DoubleTag(Double.NaN));
            packetWrapper2.write(Types.ITEM1_13_2, (Object)new DataItem(1, 1, compoundTag));
            packetWrapper2.scheduleSendToServer(Protocol1_13_2To1_14.class);
        });
        this.handler$dlh000$viafabricplus$dontResyncInventory(null);
    }

    private void handler$dlh000$viafabricplus$dontResyncInventory(CallbackInfo callbackInfo) {
        ((Protocol1_13_2To1_14)this.protocol).registerServerbound(ServerboundPackets1_14.SELECT_TRADE, (ServerboundPacketType)ServerboundPackets1_13.SELECT_TRADE, null, true);
    }
}

