/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.primitives.Ints
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.data.SoundSource1_12_2
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.data.SpawnEggMappings1_13
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.IdAndData
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.rewriter;

import com.google.common.base.Joiner;
import com.google.common.primitives.Ints;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.BlockIdData;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.MappingData1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.SoundSource1_12_2;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.SpawnEggMappings1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.IdAndData;
import com.viaversion.viaversion.util.Key;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Optional;

public class ItemPacketRewriter1_13
extends ItemRewriter<ClientboundPackets1_12_1, ServerboundPackets1_13, Protocol1_12_2To1_13> {
    public ItemPacketRewriter1_13(Protocol1_12_2To1_13 protocol) {
        super((Protocol)protocol, Types.ITEM1_8, Types.ITEM1_8_SHORT_ARRAY, Types.ITEM1_13, Types.ITEM1_13_SHORT_ARRAY);
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        if (item == null) {
            return null;
        }
        CompoundTag tag = item.tag();
        int originalId = item.identifier() << 16 | item.data() & 0xFFFF;
        int rawId = IdAndData.toRawData((int)item.identifier(), (int)item.data());
        if (ItemPacketRewriter1_13.isDamageable(item.identifier())) {
            if (tag == null) {
                tag = new CompoundTag();
                item.setTag(tag);
            }
            tag.put("Damage", (Tag)new IntTag((int)item.data()));
        }
        if (item.identifier() == 358) {
            if (tag == null) {
                tag = new CompoundTag();
                item.setTag(tag);
            }
            tag.put("map", (Tag)new IntTag((int)item.data()));
        }
        if (tag != null) {
            ListTag canDestroyTag;
            ListTag canPlaceOnTag;
            NumberTag idTag;
            ListTag storedEnch;
            ListTag ench;
            StringTag name;
            CompoundTag display;
            CompoundTag blockEntityTag;
            boolean banner;
            boolean bl = banner = item.identifier() == 425;
            if ((banner || item.identifier() == 442) && (blockEntityTag = tag.getCompoundTag("BlockEntityTag")) != null) {
                ListTag patternsTag;
                NumberTag baseTag = blockEntityTag.getNumberTag("Base");
                if (baseTag != null) {
                    if (banner) {
                        rawId = 6800 + baseTag.asInt();
                    }
                    blockEntityTag.putInt("Base", 15 - baseTag.asInt());
                }
                if ((patternsTag = blockEntityTag.getListTag("Patterns", CompoundTag.class)) != null) {
                    for (CompoundTag pattern : patternsTag) {
                        NumberTag colorTag = pattern.getNumberTag("Color");
                        if (colorTag == null) continue;
                        pattern.putInt("Color", 15 - colorTag.asInt());
                    }
                }
            }
            if ((display = tag.getCompoundTag("display")) != null && (name = display.getStringTag("Name")) != null) {
                display.putString(this.nbtTagName("Name"), name.getValue());
                name.setValue(ComponentUtil.legacyToJsonString((String)name.getValue(), (boolean)true));
            }
            if ((ench = tag.getListTag("ench", CompoundTag.class)) != null) {
                ListTag enchantments = new ListTag(CompoundTag.class);
                for (Object enchEntry : ench) {
                    short oldId = enchEntry.getShort("id", (short)0);
                    CompoundTag enchantmentEntry = new CompoundTag();
                    Object newId = (String)Protocol1_12_2To1_13.MAPPINGS.getOldEnchantmentsIds().get((Object)oldId);
                    if (newId == null) {
                        newId = "viaversion:legacy/" + oldId;
                    }
                    enchantmentEntry.putString("id", (String)newId);
                    enchantmentEntry.putShort("lvl", enchEntry.getShort("lvl", (short)0));
                    enchantments.add((Tag)enchantmentEntry);
                }
                tag.remove("ench");
                tag.put("Enchantments", (Tag)enchantments);
            }
            if ((storedEnch = tag.getListTag("StoredEnchantments", CompoundTag.class)) != null) {
                ListTag newStoredEnch = new ListTag(CompoundTag.class);
                for (CompoundTag enchEntry : storedEnch) {
                    idTag = enchEntry.getNumberTag("id");
                    if (idTag == null) continue;
                    CompoundTag enchantmentEntry = new CompoundTag();
                    short oldId = idTag.asShort();
                    Object newId = (String)Protocol1_12_2To1_13.MAPPINGS.getOldEnchantmentsIds().get((Object)oldId);
                    if (newId == null) {
                        newId = "viaversion:legacy/" + oldId;
                    }
                    enchantmentEntry.putString("id", (String)newId);
                    NumberTag levelTag = enchEntry.getNumberTag("lvl");
                    if (levelTag != null) {
                        enchantmentEntry.putShort("lvl", levelTag.asShort());
                    }
                    newStoredEnch.add((Tag)enchantmentEntry);
                }
                tag.put("StoredEnchantments", (Tag)newStoredEnch);
            }
            if ((canPlaceOnTag = tag.getListTag("CanPlaceOn")) != null) {
                ListTag newCanPlaceOn = new ListTag(StringTag.class);
                tag.put(this.nbtTagName("CanPlaceOn"), (Tag)canPlaceOnTag.copy());
                for (Iterator oldTag : canPlaceOnTag) {
                    String[] newValues;
                    Object value = oldTag.getValue();
                    String oldId = Key.stripMinecraftNamespace((String)value.toString());
                    String numberConverted = (String)BlockIdData.numberIdToString.get((Object)Ints.tryParse((String)oldId));
                    if (numberConverted != null) {
                        oldId = numberConverted;
                    }
                    if ((newValues = BlockIdData.blockIdMapping.get(oldId.toLowerCase(Locale.ROOT))) != null) {
                        for (String newValue : newValues) {
                            newCanPlaceOn.add((Tag)new StringTag(newValue));
                        }
                        continue;
                    }
                    newCanPlaceOn.add((Tag)new StringTag(oldId.toLowerCase(Locale.ROOT)));
                }
                tag.put("CanPlaceOn", (Tag)newCanPlaceOn);
            }
            if ((canDestroyTag = tag.getListTag("CanDestroy")) != null) {
                ListTag newCanDestroy = new ListTag(StringTag.class);
                tag.put(this.nbtTagName("CanDestroy"), (Tag)canDestroyTag.copy());
                for (Tag oldTag : canDestroyTag) {
                    String[] newValues;
                    Object value = oldTag.getValue();
                    String oldId = Key.stripMinecraftNamespace((String)value.toString());
                    String numberConverted = (String)BlockIdData.numberIdToString.get((Object)Ints.tryParse((String)oldId));
                    if (numberConverted != null) {
                        oldId = numberConverted;
                    }
                    if ((newValues = BlockIdData.blockIdMapping.get(oldId.toLowerCase(Locale.ROOT))) != null) {
                        for (String newValue : newValues) {
                            newCanDestroy.add((Tag)new StringTag(newValue));
                        }
                        continue;
                    }
                    newCanDestroy.add((Tag)new StringTag(oldId.toLowerCase(Locale.ROOT)));
                }
                tag.put("CanDestroy", (Tag)newCanDestroy);
            }
            if (item.identifier() == 383) {
                CompoundTag entityTag = tag.getCompoundTag("EntityTag");
                if (entityTag != null) {
                    idTag = entityTag.getStringTag("id");
                    if (idTag != null) {
                        rawId = SpawnEggMappings1_13.getSpawnEggId((String)idTag.getValue());
                        if (rawId == -1) {
                            rawId = 25100288;
                        } else {
                            entityTag.remove("id");
                            if (entityTag.isEmpty()) {
                                tag.remove("EntityTag");
                            }
                        }
                    } else {
                        rawId = 25100288;
                    }
                } else {
                    rawId = 25100288;
                }
            }
            if (tag.isEmpty()) {
                tag = null;
                item.setTag(null);
            }
        }
        if (Protocol1_12_2To1_13.MAPPINGS.getItemMappings().getNewId(rawId) == -1) {
            if (!ItemPacketRewriter1_13.isDamageable(item.identifier()) && item.identifier() != 358) {
                if (tag == null) {
                    tag = new CompoundTag();
                    item.setTag(tag);
                }
                tag.put(this.nbtTagName(), (Tag)new IntTag(originalId));
            }
            if (item.identifier() == 31 && item.data() == 0) {
                rawId = IdAndData.toRawData((int)32);
            } else if (Protocol1_12_2To1_13.MAPPINGS.getItemMappings().getNewId(IdAndData.removeData((int)rawId)) != -1) {
                rawId = IdAndData.removeData((int)rawId);
            } else {
                if (Via.getConfig().logOtherConversionWarnings()) {
                    ((Protocol1_12_2To1_13)this.protocol).getLogger().warning("Failed to get new item for " + item.identifier());
                }
                rawId = 16;
            }
        }
        item.setIdentifier(Protocol1_12_2To1_13.MAPPINGS.getItemMappings().getNewId(rawId));
        item.setData((short)0);
        return item;
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        int oldId;
        NumberTag viaTag;
        if (item == null) {
            return null;
        }
        Integer rawId = null;
        boolean gotRawIdFromTag = false;
        CompoundTag tag = item.tag();
        if (tag != null && (viaTag = tag.getNumberTag(this.nbtTagName())) != null) {
            rawId = viaTag.asInt();
            tag.remove(this.nbtTagName());
            gotRawIdFromTag = true;
        }
        if (rawId == null && (oldId = Protocol1_12_2To1_13.MAPPINGS.getItemMappings().inverse().getNewId(item.identifier())) != -1) {
            Optional eggEntityId = SpawnEggMappings1_13.getEntityId((int)oldId);
            if (eggEntityId.isPresent()) {
                rawId = 25100288;
                if (tag == null) {
                    tag = new CompoundTag();
                    item.setTag(tag);
                }
                if (!tag.contains("EntityTag")) {
                    CompoundTag entityTag = new CompoundTag();
                    entityTag.put("id", (Tag)new StringTag((String)eggEntityId.get()));
                    tag.put("EntityTag", (Tag)entityTag);
                }
            } else {
                rawId = IdAndData.getId((int)oldId) << 16 | oldId & 0xF;
            }
        }
        if (rawId == null) {
            if (Via.getConfig().logOtherConversionWarnings()) {
                ((Protocol1_12_2To1_13)this.protocol).getLogger().warning("Failed to get old item for " + item.identifier());
            }
            rawId = 65536;
        }
        item.setIdentifier((int)((short)(rawId >> 16)));
        item.setData((short)(rawId & 0xFFFF));
        if (tag != null) {
            String[] newValues;
            Object value;
            ListTag old;
            ListTag storedEnch;
            ListTag enchantments;
            StringTag name;
            CompoundTag display;
            CompoundTag blockEntityTag;
            NumberTag mapTag;
            NumberTag damageTag;
            if (ItemPacketRewriter1_13.isDamageable(item.identifier()) && (damageTag = tag.getNumberTag("Damage")) != null) {
                if (!gotRawIdFromTag) {
                    item.setData(damageTag.asShort());
                }
                tag.remove("Damage");
            }
            if (item.identifier() == 358 && (mapTag = tag.getNumberTag("map")) != null) {
                if (!gotRawIdFromTag) {
                    item.setData(mapTag.asShort());
                }
                tag.remove("map");
            }
            if ((item.identifier() == 442 || item.identifier() == 425) && (blockEntityTag = tag.getCompoundTag("BlockEntityTag")) != null) {
                ListTag patternsTag;
                NumberTag baseTag = blockEntityTag.getNumberTag("Base");
                if (baseTag != null) {
                    blockEntityTag.putInt("Base", 15 - baseTag.asInt());
                }
                if ((patternsTag = blockEntityTag.getListTag("Patterns", CompoundTag.class)) != null) {
                    for (CompoundTag pattern : patternsTag) {
                        NumberTag colorTag = pattern.getNumberTag("Color");
                        pattern.putInt("Color", 15 - colorTag.asInt());
                    }
                }
            }
            if ((display = tag.getCompoundTag("display")) != null && (name = display.getStringTag("Name")) != null) {
                Tag via = display.remove(this.nbtTagName("Name"));
                name.setValue(via instanceof StringTag ? (String)via.getValue() : ComponentUtil.jsonToLegacy((String)name.getValue()));
            }
            if ((enchantments = tag.getListTag("Enchantments", CompoundTag.class)) != null) {
                ListTag ench = new ListTag(CompoundTag.class);
                for (Object enchantmentEntry : enchantments) {
                    StringTag idTag = enchantmentEntry.getStringTag("id");
                    if (idTag == null) continue;
                    CompoundTag enchEntry = new CompoundTag();
                    String newId = idTag.getValue();
                    Short oldId2 = (Short)Protocol1_12_2To1_13.MAPPINGS.getOldEnchantmentsIds().inverse().get((Object)newId);
                    if (oldId2 == null && newId.startsWith("viaversion:legacy/")) {
                        oldId2 = Short.valueOf(newId.substring(18));
                    }
                    if (oldId2 == null) continue;
                    enchEntry.putShort("id", oldId2.shortValue());
                    enchEntry.putShort("lvl", enchantmentEntry.getShort("lvl", (short)0));
                    ench.add((Tag)enchEntry);
                }
                tag.remove("Enchantments");
                tag.put("ench", (Tag)ench);
            }
            if ((storedEnch = tag.getListTag("StoredEnchantments", CompoundTag.class)) != null) {
                ListTag newStoredEnch = new ListTag(CompoundTag.class);
                for (CompoundTag enchantmentEntry : storedEnch) {
                    StringTag idTag = enchantmentEntry.getStringTag("id");
                    if (idTag == null) continue;
                    CompoundTag enchEntry = new CompoundTag();
                    String newId = idTag.getValue();
                    Short oldId3 = (Short)Protocol1_12_2To1_13.MAPPINGS.getOldEnchantmentsIds().inverse().get((Object)newId);
                    if (oldId3 == null && newId.startsWith("viaversion:legacy/")) {
                        oldId3 = Short.valueOf(newId.substring(18));
                    }
                    if (oldId3 == null) continue;
                    enchEntry.putShort("id", oldId3.shortValue());
                    NumberTag levelTag = enchantmentEntry.getNumberTag("lvl");
                    if (levelTag != null) {
                        enchEntry.putShort("lvl", levelTag.asShort());
                    }
                    newStoredEnch.add((Tag)enchEntry);
                }
                tag.put("StoredEnchantments", (Tag)newStoredEnch);
            }
            if (tag.getListTag(this.nbtTagName("CanPlaceOn")) != null) {
                tag.put("CanPlaceOn", tag.remove(this.nbtTagName("CanPlaceOn")));
            } else if (tag.getListTag("CanPlaceOn") != null) {
                old = tag.getListTag("CanPlaceOn");
                ListTag newCanPlaceOn = new ListTag(StringTag.class);
                for (Tag oldTag : old) {
                    value = oldTag.getValue();
                    newValues = BlockIdData.fallbackReverseMapping.get(value instanceof String ? Key.stripMinecraftNamespace((String)((String)value)) : null);
                    if (newValues != null) {
                        for (String newValue : newValues) {
                            newCanPlaceOn.add((Tag)new StringTag(newValue));
                        }
                        continue;
                    }
                    newCanPlaceOn.add((Tag)new StringTag(value.toString()));
                }
                tag.put("CanPlaceOn", (Tag)newCanPlaceOn);
            }
            if (tag.getListTag(this.nbtTagName("CanDestroy")) != null) {
                tag.put("CanDestroy", tag.remove(this.nbtTagName("CanDestroy")));
            } else if (tag.getListTag("CanDestroy") != null) {
                old = tag.getListTag("CanDestroy");
                ListTag newCanDestroy = new ListTag(StringTag.class);
                for (Tag oldTag : old) {
                    value = oldTag.getValue();
                    newValues = BlockIdData.fallbackReverseMapping.get(value instanceof String ? Key.stripMinecraftNamespace((String)((String)value)) : null);
                    if (newValues != null) {
                        for (String newValue : newValues) {
                            newCanDestroy.add((Tag)new StringTag(newValue));
                        }
                        continue;
                    }
                    newCanDestroy.add((Tag)new StringTag(oldTag.getValue().toString()));
                }
                tag.put("CanDestroy", (Tag)newCanDestroy);
            }
        }
        return item;
    }

    public void registerPackets() {
        ((Protocol1_12_2To1_13)this.protocol).registerClientbound(ClientboundPackets1_12_1.CONTAINER_SET_SLOT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map(Types.ITEM1_8, Types.ITEM1_13);
                this.handler(wrapper -> ItemPacketRewriter1_13.this.handleItemToClient(wrapper.user(), (Item)wrapper.get(Types.ITEM1_13, 0)));
            }
        });
        ((Protocol1_12_2To1_13)this.protocol).registerClientbound(ClientboundPackets1_12_1.CONTAINER_SET_CONTENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.ITEM1_8_SHORT_ARRAY, Types.ITEM1_13_SHORT_ARRAY);
                this.handler(wrapper -> {
                    Item[] items;
                    for (Item item : items = (Item[])wrapper.get(Types.ITEM1_13_SHORT_ARRAY, 0)) {
                        ItemPacketRewriter1_13.this.handleItemToClient(wrapper.user(), item);
                    }
                });
            }
        });
        ((Protocol1_12_2To1_13)this.protocol).registerClientbound(ClientboundPackets1_12_1.CONTAINER_SET_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> {
                    short property = (Short)wrapper.get((Type)Types.SHORT, 0);
                    if (property >= 4 && property <= 6) {
                        wrapper.set((Type)Types.SHORT, 1, (Object)((short)((Protocol1_12_2To1_13)ItemPacketRewriter1_13.this.protocol).getMappingData().getEnchantmentMappings().getNewId((int)((Short)wrapper.get((Type)Types.SHORT, 1)).shortValue())));
                    }
                });
            }
        });
        ((Protocol1_12_2To1_13)this.protocol).registerClientbound(ClientboundPackets1_12_1.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handlerSoftFail(wrapper -> {
                    String channel = (String)wrapper.get(Types.STRING, 0);
                    if (channel.equals("MC|StopSound")) {
                        String originalSource = (String)wrapper.read(Types.STRING);
                        String originalSound = (String)wrapper.read(Types.STRING);
                        wrapper.clearPacket();
                        wrapper.setPacketType((PacketType)ClientboundPackets1_13.STOP_SOUND);
                        byte flags = 0;
                        wrapper.write((Type)Types.BYTE, (Object)flags);
                        if (!originalSource.isEmpty()) {
                            flags = (byte)(flags | 1);
                            Optional<SoundSource1_12_2> finalSource = SoundSource1_12_2.findBySource((String)originalSource);
                            if (finalSource.isEmpty()) {
                                if (Via.getConfig().logOtherConversionWarnings()) {
                                    Protocol1_12_2To1_13.LOGGER.warning("Could not handle unknown sound source " + originalSource + " falling back to default: master");
                                }
                                finalSource = Optional.of(SoundSource1_12_2.MASTER);
                            }
                            wrapper.write((Type)Types.VAR_INT, (Object)((SoundSource1_12_2)finalSource.get()).getId());
                        }
                        if (!originalSound.isEmpty()) {
                            flags = (byte)(flags | 2);
                            wrapper.write(Types.STRING, (Object)originalSound);
                        }
                        wrapper.set((Type)Types.BYTE, 0, (Object)flags);
                        return;
                    }
                    if (channel.equals("MC|TrList")) {
                        channel = "minecraft:trader_list";
                        ItemPacketRewriter1_13.this.handleTradeList(wrapper);
                    } else {
                        String old = channel;
                        if ((channel = ItemPacketRewriter1_13.getNewPluginChannelId(channel)) == null) {
                            if (Via.getConfig().logOtherConversionWarnings()) {
                                ((Protocol1_12_2To1_13)ItemPacketRewriter1_13.this.protocol).getLogger().warning("Ignoring clientbound plugin message with channel: " + old);
                            }
                            wrapper.cancel();
                            return;
                        }
                        if (channel.equals("minecraft:register") || channel.equals("minecraft:unregister")) {
                            String[] channels = new String((byte[])wrapper.read(Types.REMAINING_BYTES), StandardCharsets.UTF_8).split("\u0000");
                            ArrayList<String> rewrittenChannels = new ArrayList<String>();
                            for (String s : channels) {
                                String rewritten = ItemPacketRewriter1_13.getNewPluginChannelId(s);
                                if (rewritten != null) {
                                    rewrittenChannels.add(rewritten);
                                    continue;
                                }
                                if (!Via.getConfig().logOtherConversionWarnings()) continue;
                                ((Protocol1_12_2To1_13)ItemPacketRewriter1_13.this.protocol).getLogger().warning("Ignoring plugin channel in clientbound " + Key.stripMinecraftNamespace((String)channel).toUpperCase(Locale.ROOT) + ": " + s);
                            }
                            if (!rewrittenChannels.isEmpty()) {
                                wrapper.write(Types.REMAINING_BYTES, (Object)Joiner.on((char)'\u0000').join(rewrittenChannels).getBytes(StandardCharsets.UTF_8));
                            } else {
                                wrapper.cancel();
                                return;
                            }
                        }
                    }
                    wrapper.set(Types.STRING, 0, (Object)channel);
                });
            }
        });
        ((Protocol1_12_2To1_13)this.protocol).registerClientbound(ClientboundPackets1_12_1.SET_EQUIPPED_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map(Types.ITEM1_8, Types.ITEM1_13);
                this.handler(wrapper -> ItemPacketRewriter1_13.this.handleItemToClient(wrapper.user(), (Item)wrapper.get(Types.ITEM1_13, 0)));
            }
        });
        ((Protocol1_12_2To1_13)this.protocol).registerServerbound(ServerboundPackets1_13.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.VAR_INT);
                this.map(Types.ITEM1_13, Types.ITEM1_8);
                this.handler(wrapper -> ItemPacketRewriter1_13.this.handleItemToServer(wrapper.user(), (Item)wrapper.get(Types.ITEM1_8, 0)));
            }
        });
        ((Protocol1_12_2To1_13)this.protocol).registerServerbound(ServerboundPackets1_13.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    String channel;
                    String old = channel = (String)wrapper.get(Types.STRING, 0);
                    if ((channel = ItemPacketRewriter1_13.getOldPluginChannelId(channel)) == null) {
                        if (Via.getManager().isDebug()) {
                            ((Protocol1_12_2To1_13)ItemPacketRewriter1_13.this.protocol).getLogger().warning("Ignoring serverbound plugin message with channel: " + old);
                        }
                        wrapper.cancel();
                        return;
                    }
                    if (channel.equals("REGISTER") || channel.equals("UNREGISTER")) {
                        String[] channels = new String((byte[])wrapper.read(Types.SERVERBOUND_CUSTOM_PAYLOAD_DATA), StandardCharsets.UTF_8).split("\u0000");
                        ArrayList<String> rewrittenChannels = new ArrayList<String>();
                        for (String s : channels) {
                            String rewritten = ItemPacketRewriter1_13.getOldPluginChannelId(s);
                            if (rewritten != null) {
                                rewrittenChannels.add(rewritten);
                                continue;
                            }
                            if (!Via.getManager().isDebug()) continue;
                            ((Protocol1_12_2To1_13)ItemPacketRewriter1_13.this.protocol).getLogger().warning("Ignoring plugin channel in serverbound " + channel + ": " + s);
                        }
                        wrapper.write(Types.SERVERBOUND_CUSTOM_PAYLOAD_DATA, (Object)Joiner.on((char)'\u0000').join(rewrittenChannels).getBytes(StandardCharsets.UTF_8));
                    }
                    wrapper.set(Types.STRING, 0, (Object)channel);
                });
            }
        });
        ((Protocol1_12_2To1_13)this.protocol).registerServerbound(ServerboundPackets1_13.SET_CREATIVE_MODE_SLOT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.SHORT);
                this.map(Types.ITEM1_13, Types.ITEM1_8);
                this.handler(wrapper -> ItemPacketRewriter1_13.this.handleItemToServer(wrapper.user(), (Item)wrapper.get(Types.ITEM1_8, 0)));
            }
        });
    }

    public static String getOldPluginChannelId(String newId) {
        if ((newId = MappingData1_13.validateNewChannel(newId)) == null) {
            return null;
        }
        return switch (newId) {
            case "minecraft:trader_list" -> "MC|TrList";
            case "minecraft:book_open" -> "MC|BOpen";
            case "minecraft:debug/paths" -> "MC|DebugPath";
            case "minecraft:debug/neighbors_update" -> "MC|DebugNeighborsUpdate";
            case "minecraft:register" -> "REGISTER";
            case "minecraft:unregister" -> "UNREGISTER";
            case "minecraft:brand" -> "MC|Brand";
            case "bungeecord:main" -> "BungeeCord";
            default -> {
                String mappedChannel = (String)Protocol1_12_2To1_13.MAPPINGS.getChannelMappings().inverse().get((Object)newId);
                if (mappedChannel != null) {
                    yield mappedChannel;
                }
                if (newId.length() > 20) {
                    yield newId.substring(0, 20);
                }
                yield newId;
            }
        };
    }

    public static String getNewPluginChannelId(String old) {
        return switch (old) {
            case "MC|TrList" -> "minecraft:trader_list";
            case "MC|Brand" -> "minecraft:brand";
            case "MC|BOpen" -> "minecraft:book_open";
            case "MC|DebugPath" -> "minecraft:debug/paths";
            case "MC|DebugNeighborsUpdate" -> "minecraft:debug/neighbors_update";
            case "REGISTER" -> "minecraft:register";
            case "UNREGISTER" -> "minecraft:unregister";
            case "BungeeCord" -> "bungeecord:main";
            case "bungeecord:main" -> null;
            default -> {
                String mappedChannel = (String)Protocol1_12_2To1_13.MAPPINGS.getChannelMappings().get((Object)old);
                if (mappedChannel != null) {
                    yield mappedChannel;
                }
                yield MappingData1_13.validateNewChannel(old);
            }
        };
    }

    public static boolean isDamageable(int id) {
        return id >= 256 && id <= 259 || id == 261 || id >= 267 && id <= 279 || id >= 283 && id <= 286 || id >= 290 && id <= 294 || id >= 298 && id <= 317 || id == 346 || id == 359 || id == 398 || id == 442 || id == 443;
    }
}

