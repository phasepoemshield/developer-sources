/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viabackwards.api.rewriters.EnchantmentRewriter
 *  com.viaversion.viabackwards.protocol.v1_13to1_12_2.storage.BackwardsBlockStorage
 *  com.viaversion.viabackwards.protocol.v1_13to1_12_2.storage.NoteBlockStorage
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_13
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.data.BlockIdData
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.data.SpawnEggMappings1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1
 *  com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ServerboundPackets1_12_1
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.IdAndData
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Pair
 */
package com.viaversion.viabackwards.protocol.v1_13to1_12_2.rewriter;

import com.google.common.primitives.Ints;
import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.api.rewriters.EnchantmentRewriter;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.Protocol1_13To1_12_2;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.block_entity_handlers.FlowerPotHandler;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.provider.BackwardsBlockEntityProvider;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.storage.BackwardsBlockStorage;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.storage.NoteBlockStorage;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_13;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.BlockIdData;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.SpawnEggMappings1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ServerboundPackets1_12_1;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.IdAndData;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class BlockItemPacketRewriter1_13
extends BackwardsItemRewriter<ClientboundPackets1_13, ServerboundPackets1_12_1, Protocol1_13To1_12_2> {
    private final Map<String, String> enchantmentMappings = new HashMap<String, String>();
    private final String extraNbtTag = this.nbtTagName("2");

    public BlockItemPacketRewriter1_13(Protocol1_13To1_12_2 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_13, Types.ITEM1_13_SHORT_ARRAY, Types.ITEM1_8, Types.ITEM1_8_SHORT_ARRAY);
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        Tag originalIdTag;
        if (item == null) {
            return null;
        }
        int originalId = item.identifier();
        Integer rawId = null;
        boolean gotRawIdFromTag = false;
        CompoundTag tag = item.tag();
        if (tag != null && (originalIdTag = tag.remove(this.extraNbtTag)) instanceof NumberTag) {
            rawId = ((NumberTag)originalIdTag).asInt();
            gotRawIdFromTag = true;
        }
        if (rawId == null) {
            if ((item = super.handleItemToClient(connection, item)).identifier() == -1) {
                if (originalId == 362) {
                    rawId = 0xE50000;
                } else {
                    if (Via.getConfig().logOtherConversionWarnings()) {
                        ((Protocol1_13To1_12_2)this.protocol).getLogger().warning("Failed to get new item for " + originalId);
                    }
                    rawId = 65536;
                }
            } else {
                if (tag == null) {
                    tag = item.tag();
                }
                rawId = this.itemIdToRaw(item.identifier(), item, tag);
            }
        }
        item.setIdentifier(rawId >> 16);
        item.setData((short)(rawId & 0xFFFF));
        if (tag != null) {
            StringTag name;
            if (BlockItemPacketRewriter1_13.isDamageable(item.identifier())) {
                Tag damageTag = tag.remove("Damage");
                if (!gotRawIdFromTag && damageTag instanceof NumberTag) {
                    item.setData(((NumberTag)damageTag).asShort());
                }
            }
            if (item.identifier() == 358) {
                Tag mapTag = tag.remove("map");
                if (!gotRawIdFromTag && mapTag instanceof NumberTag) {
                    item.setData(((NumberTag)mapTag).asShort());
                }
            }
            this.invertShieldAndBannerId(item, tag);
            CompoundTag display = tag.getCompoundTag("display");
            if (display != null && (name = display.getStringTag("Name")) != null) {
                display.putString(this.extraNbtTag + "|Name", name.getValue());
                name.setValue(((Protocol1_13To1_12_2)this.protocol).jsonToLegacy(connection, name.getValue()));
            }
            this.rewriteEnchantmentsToClient(tag, false);
            this.rewriteEnchantmentsToClient(tag, true);
            this.rewriteCanPlaceToClient(tag, "CanPlaceOn");
            this.rewriteCanPlaceToClient(tag, "CanDestroy");
        }
        return item;
    }

    protected void registerRewrites() {
        this.enchantmentMappings.put("minecraft:loyalty", "\u00a77Loyalty");
        this.enchantmentMappings.put("minecraft:impaling", "\u00a77Impaling");
        this.enchantmentMappings.put("minecraft:riptide", "\u00a77Riptide");
        this.enchantmentMappings.put("minecraft:channeling", "\u00a77Channeling");
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        if (item == null) {
            return null;
        }
        CompoundTag tag = item.tag();
        int originalId = item.identifier() << 16 | item.data() & 0xFFFF;
        int rawId = IdAndData.toRawData((int)item.identifier(), (int)item.data());
        if (BlockItemPacketRewriter1_13.isDamageable(item.identifier())) {
            if (tag == null) {
                tag = new CompoundTag();
                item.setTag(tag);
            }
            tag.putInt("Damage", (int)item.data());
        }
        if (item.identifier() == 358) {
            if (tag == null) {
                tag = new CompoundTag();
                item.setTag(tag);
            }
            tag.putInt("map", (int)item.data());
        }
        if (tag != null) {
            StringTag name;
            this.invertShieldAndBannerId(item, tag);
            CompoundTag display = tag.getCompoundTag("display");
            if (display != null && (name = display.getStringTag("Name")) != null) {
                Tag via = display.remove(this.extraNbtTag + "|Name");
                name.setValue(via instanceof StringTag ? ((StringTag)via).getValue() : ComponentUtil.legacyToJsonString((String)name.getValue()));
            }
            this.rewriteEnchantmentsToServer(tag, false);
            this.rewriteEnchantmentsToServer(tag, true);
            this.rewriteCanPlaceToServer(tag, "CanPlaceOn");
            this.rewriteCanPlaceToServer(tag, "CanDestroy");
            if (item.identifier() == 383) {
                StringTag identifier;
                CompoundTag entityTag = tag.getCompoundTag("EntityTag");
                if (entityTag != null && (identifier = entityTag.getStringTag("id")) != null) {
                    rawId = SpawnEggMappings1_13.getSpawnEggId((String)identifier.getValue());
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
            }
            if (tag.isEmpty()) {
                tag = null;
                item.setTag(null);
            }
        }
        int identifier = item.identifier();
        item.setIdentifier(rawId);
        item = super.handleItemToServer(connection, item);
        if (item.identifier() != rawId && item.identifier() != -1) {
            return item;
        }
        item.setIdentifier(identifier);
        int newId = -1;
        if (((Protocol1_13To1_12_2)this.protocol).getMappingData().getItemMappings().inverse().getNewId(rawId) == -1) {
            if (!BlockItemPacketRewriter1_13.isDamageable(item.identifier()) && item.identifier() != 358) {
                if (tag == null) {
                    tag = new CompoundTag();
                    item.setTag(tag);
                }
                tag.putInt(this.extraNbtTag, originalId);
            }
            if (item.identifier() == 229) {
                newId = 362;
            } else if (item.identifier() == 31 && item.data() == 0) {
                rawId = IdAndData.toRawData((int)32);
            } else if (((Protocol1_13To1_12_2)this.protocol).getMappingData().getItemMappings().inverse().getNewId(rawId & 0xFFFFFFF0) != -1) {
                rawId &= 0xFFFFFFF0;
            } else {
                if (Via.getConfig().logOtherConversionWarnings()) {
                    ((Protocol1_13To1_12_2)this.protocol).getLogger().warning("Failed to get old item for " + item.identifier());
                }
                rawId = 16;
            }
        }
        if (newId == -1) {
            newId = ((Protocol1_13To1_12_2)this.protocol).getMappingData().getItemMappings().inverse().getNewId(rawId);
        }
        item.setIdentifier(newId);
        item.setData((short)0);
        return item;
    }

    private void rewriteEnchantmentsToClient(CompoundTag tag, boolean storedEnch) {
        String key = storedEnch ? "StoredEnchantments" : "Enchantments";
        ListTag enchantments = tag.getListTag(key, CompoundTag.class);
        if (enchantments == null) {
            return;
        }
        ListTag noMapped = new ListTag(CompoundTag.class);
        ListTag newEnchantments = new ListTag(CompoundTag.class);
        ArrayList<StringTag> lore = new ArrayList<StringTag>();
        boolean hasValidEnchants = false;
        for (CompoundTag enchantmentEntry : enchantments.copy()) {
            StringTag idTag = enchantmentEntry.getStringTag("id");
            if (idTag == null) continue;
            String newId = idTag.getValue();
            NumberTag levelTag = enchantmentEntry.getNumberTag("lvl");
            if (levelTag == null) continue;
            int levelValue = levelTag.asInt();
            int level = levelValue < Short.MAX_VALUE ? (int)levelValue : Short.MAX_VALUE;
            String mappedEnchantmentId = this.enchantmentMappings.get(newId);
            if (mappedEnchantmentId != null) {
                lore.add(new StringTag(mappedEnchantmentId + " " + EnchantmentRewriter.getRomanNumber((int)level)));
                noMapped.add((Tag)enchantmentEntry);
                continue;
            }
            if (newId.isEmpty()) continue;
            Short oldId = (Short)Protocol1_12_2To1_13.MAPPINGS.getOldEnchantmentsIds().inverse().get((Object)Key.stripMinecraftNamespace((String)newId));
            if (oldId == null) {
                if (!newId.startsWith("viaversion:legacy/")) {
                    noMapped.add((Tag)enchantmentEntry);
                    if (ViaBackwards.getConfig().addCustomEnchantsToLore()) {
                        Object name = newId;
                        int index = ((String)name).indexOf(58) + 1;
                        if (index != 0 && index != ((String)name).length()) {
                            name = ((String)name).substring(index);
                        }
                        name = "\u00a77" + Character.toUpperCase(((String)name).charAt(0)) + ((String)name).substring(1).toLowerCase(Locale.ENGLISH);
                        lore.add(new StringTag((String)name + " " + EnchantmentRewriter.getRomanNumber((int)level)));
                    }
                    if (!Via.getManager().isDebug()) continue;
                    ((Protocol1_13To1_12_2)this.protocol).getLogger().warning("Found unknown enchant: " + newId);
                    continue;
                }
                oldId = Short.valueOf(newId.substring(18));
            }
            if (level != 0) {
                hasValidEnchants = true;
            }
            CompoundTag newEntry = new CompoundTag();
            newEntry.putShort("id", oldId.shortValue());
            newEntry.putShort("lvl", (short)level);
            newEnchantments.add((Tag)newEntry);
        }
        if (!storedEnch && !hasValidEnchants) {
            NumberTag hideFlags = tag.getNumberTag("HideFlags");
            if (hideFlags == null) {
                hideFlags = new IntTag();
                tag.put(this.extraNbtTag + "|DummyEnchant", (Tag)new ByteTag(false));
            } else {
                tag.putInt(this.extraNbtTag + "|OldHideFlags", (int)hideFlags.asByte());
            }
            if (newEnchantments.isEmpty()) {
                CompoundTag enchEntry = new CompoundTag();
                enchEntry.putShort("id", (short)0);
                enchEntry.putShort("lvl", (short)0);
                newEnchantments.add((Tag)enchEntry);
            }
            int value = hideFlags.asByte() | 1;
            tag.putInt("HideFlags", value);
        }
        if (!noMapped.isEmpty()) {
            tag.put(this.extraNbtTag + "|" + key, (Tag)noMapped);
            if (!lore.isEmpty()) {
                ListTag loreTag;
                CompoundTag display = tag.getCompoundTag("display");
                if (display == null) {
                    display = new CompoundTag();
                    tag.put("display", (Tag)display);
                }
                if ((loreTag = display.getListTag("Lore", StringTag.class)) == null) {
                    loreTag = new ListTag(StringTag.class);
                    display.put("Lore", (Tag)loreTag);
                    tag.put(this.extraNbtTag + "|DummyLore", (Tag)new ByteTag(false));
                } else if (!loreTag.isEmpty()) {
                    ListTag oldLore = new ListTag(StringTag.class);
                    for (StringTag value : loreTag) {
                        oldLore.add((Tag)value.copy());
                    }
                    tag.put(this.extraNbtTag + "|OldLore", (Tag)oldLore);
                    lore.addAll(loreTag.getValue());
                }
                loreTag.setValue(lore);
            }
        }
        tag.remove("Enchantments");
        tag.put(storedEnch ? key : "ench", (Tag)newEnchantments);
    }

    private void rewriteEnchantmentsToServer(CompoundTag tag, boolean storedEnch) {
        ListTag oldLore;
        CompoundTag display;
        String key = storedEnch ? "StoredEnchantments" : "Enchantments";
        ListTag enchantments = tag.getListTag(storedEnch ? key : "ench", CompoundTag.class);
        if (enchantments == null) {
            return;
        }
        ListTag newEnchantments = new ListTag(CompoundTag.class);
        boolean dummyEnchant = false;
        if (!storedEnch) {
            Iterator hideFlags = tag.remove(this.extraNbtTag + "|OldHideFlags");
            if (hideFlags instanceof IntTag) {
                tag.putInt("HideFlags", (int)((NumberTag)hideFlags).asByte());
                dummyEnchant = true;
            } else if (tag.remove(this.extraNbtTag + "|DummyEnchant") != null) {
                tag.remove("HideFlags");
                dummyEnchant = true;
            }
        }
        for (Object entryTag : enchantments) {
            short level;
            NumberTag idTag = entryTag.getNumberTag("id");
            NumberTag levelTag = entryTag.getNumberTag("lvl");
            CompoundTag enchantmentEntry = new CompoundTag();
            short oldId = idTag != null ? idTag.asShort() : (short)0;
            short s = level = levelTag != null ? levelTag.asShort() : (short)0;
            if (dummyEnchant && oldId == 0 && level == 0) continue;
            Object newId = (String)Protocol1_12_2To1_13.MAPPINGS.getOldEnchantmentsIds().get((Object)oldId);
            if (newId == null) {
                newId = "viaversion:legacy/" + oldId;
            }
            enchantmentEntry.putString("id", (String)newId);
            enchantmentEntry.putShort("lvl", level);
            newEnchantments.add((Tag)enchantmentEntry);
        }
        ListTag noMapped = tag.getListTag(this.extraNbtTag + "|Enchantments", CompoundTag.class);
        if (noMapped != null) {
            for (CompoundTag value : noMapped) {
                newEnchantments.add((Tag)value);
            }
            tag.remove(this.extraNbtTag + "|Enchantments");
        }
        if ((display = tag.getCompoundTag("display")) == null) {
            display = new CompoundTag();
            tag.put("display", (Tag)display);
        }
        if ((oldLore = tag.getListTag(this.extraNbtTag + "|OldLore", StringTag.class)) != null) {
            ListTag lore = display.getListTag("Lore", StringTag.class);
            if (lore == null) {
                lore = new ListTag(StringTag.class);
                tag.put("Lore", (Tag)lore);
            }
            lore.setValue(oldLore.getValue());
            tag.remove(this.extraNbtTag + "|OldLore");
        } else if (tag.remove(this.extraNbtTag + "|DummyLore") != null) {
            display.remove("Lore");
            if (display.isEmpty()) {
                tag.remove("display");
            }
        }
        if (!storedEnch) {
            tag.remove("ench");
        }
        tag.put(key, (Tag)newEnchantments);
    }

    protected void registerPackets() {
        ((Protocol1_13To1_12_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_13.COOLDOWN, wrapper -> {
            int itemId = (Integer)wrapper.read((Type)Types.VAR_INT);
            int oldId = ((Protocol1_13To1_12_2)this.protocol).getMappingData().getItemMappings().getNewId(itemId);
            if (oldId == -1) {
                wrapper.cancel();
                return;
            }
            if (SpawnEggMappings1_13.getEntityId((int)oldId).isPresent()) {
                wrapper.write((Type)Types.VAR_INT, (Object)IdAndData.toRawData((int)383));
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)IdAndData.getId((int)oldId));
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.BLOCK_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    BlockPosition position;
                    NoteBlockStorage noteBlockStorage;
                    Pair update;
                    int blockId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (blockId == 73) {
                        blockId = 25;
                    } else if (blockId == 99) {
                        blockId = 33;
                    } else if (blockId == 92) {
                        blockId = 29;
                    } else if (blockId == 142) {
                        blockId = 54;
                    } else if (blockId == 305) {
                        blockId = 146;
                    } else if (blockId == 249) {
                        blockId = 130;
                    } else if (blockId == 257) {
                        blockId = 138;
                    } else if (blockId == 140) {
                        blockId = 52;
                    } else if (blockId == 472) {
                        blockId = 209;
                    } else if (blockId >= 483 && blockId <= 498) {
                        blockId = blockId - 483 + 219;
                    }
                    if (blockId == 25 && (update = (noteBlockStorage = (NoteBlockStorage)wrapper.user().get(NoteBlockStorage.class)).getNoteBlockUpdate(position = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0))) != null) {
                        wrapper.set((Type)Types.UNSIGNED_BYTE, 0, (Object)((Integer)update.key()).shortValue());
                        wrapper.set((Type)Types.UNSIGNED_BYTE, 1, (Object)((Integer)update.value()).shortValue());
                    }
                    wrapper.set((Type)Types.VAR_INT, 0, (Object)blockId);
                });
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.handler(wrapper -> {
                    BackwardsBlockEntityProvider provider = (BackwardsBlockEntityProvider)Via.getManager().getProviders().get(BackwardsBlockEntityProvider.class);
                    if ((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0) == 5) {
                        wrapper.cancel();
                    }
                    wrapper.set(Types.NAMED_COMPOUND_TAG, 0, (Object)provider.transform(wrapper.user(), (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0), (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0)));
                });
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.FORGET_LEVEL_CHUNK, wrapper -> {
            int chunkMinX = (Integer)wrapper.passthrough((Type)Types.INT) << 4;
            int chunkMinZ = (Integer)wrapper.passthrough((Type)Types.INT) << 4;
            int chunkMaxX = chunkMinX + 15;
            int chunkMaxZ = chunkMinZ + 15;
            BackwardsBlockStorage blockStorage = (BackwardsBlockStorage)wrapper.user().get(BackwardsBlockStorage.class);
            blockStorage.getBlocks().entrySet().removeIf(entry -> {
                BlockPosition position = (BlockPosition)entry.getKey();
                return position.x() >= chunkMinX && position.z() >= chunkMinZ && position.x() <= chunkMaxX && position.z() <= chunkMaxZ;
            });
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.handler(wrapper -> {
                    int blockState = (Integer)wrapper.read((Type)Types.VAR_INT);
                    BlockPosition position = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0);
                    if (blockState >= 249 && blockState <= 748) {
                        ((NoteBlockStorage)wrapper.user().get(NoteBlockStorage.class)).storeNoteBlockUpdate(position, blockState);
                    }
                    BackwardsBlockStorage storage = (BackwardsBlockStorage)wrapper.user().get(BackwardsBlockStorage.class);
                    storage.checkAndStore(position, blockState);
                    wrapper.write((Type)Types.VAR_INT, (Object)((Protocol1_13To1_12_2)BlockItemPacketRewriter1_13.this.protocol).getMappingData().getNewBlockStateId(blockState));
                    BlockItemPacketRewriter1_13.flowerPotSpecialTreatment(wrapper.user(), blockState, position);
                });
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.CHUNK_BLOCKS_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_CHANGE_ARRAY);
                this.handler(wrapper -> {
                    BackwardsBlockStorage storage = (BackwardsBlockStorage)wrapper.user().get(BackwardsBlockStorage.class);
                    for (BlockChangeRecord record : (BlockChangeRecord[])wrapper.get(Types.BLOCK_CHANGE_ARRAY, 0)) {
                        int chunkX = (Integer)wrapper.get((Type)Types.INT, 0);
                        int chunkZ = (Integer)wrapper.get((Type)Types.INT, 1);
                        int block = record.getBlockId();
                        BlockPosition position = new BlockPosition(record.getSectionX() + chunkX * 16, (int)record.getY(), record.getSectionZ() + chunkZ * 16);
                        storage.checkAndStore(position, block);
                        BlockItemPacketRewriter1_13.flowerPotSpecialTreatment(wrapper.user(), block, position);
                        record.setBlockId(((Protocol1_13To1_12_2)BlockItemPacketRewriter1_13.this.protocol).getMappingData().getNewBlockStateId(block));
                    }
                });
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.LEVEL_CHUNK, wrapper -> {
            int i;
            ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_13To1_12_2.class);
            ChunkType1_9_3 type_old = ChunkType1_9_3.forEnvironment((Environment)clientWorld.getEnvironment());
            ChunkType1_13 type = ChunkType1_13.forEnvironment((Environment)clientWorld.getEnvironment());
            Chunk chunk = (Chunk)wrapper.read((Type)type);
            BackwardsBlockEntityProvider provider = (BackwardsBlockEntityProvider)Via.getManager().getProviders().get(BackwardsBlockEntityProvider.class);
            BackwardsBlockStorage storage = (BackwardsBlockStorage)wrapper.user().get(BackwardsBlockStorage.class);
            for (CompoundTag tag : chunk.getBlockEntities()) {
                int sectionIndex;
                String id;
                StringTag idTag = tag.getStringTag("id");
                if (idTag == null || !provider.isHandled(id = idTag.getValue()) || (sectionIndex = tag.getNumberTag("y").asInt() >> 4) < 0 || sectionIndex > 15) continue;
                ChunkSection section = chunk.getSections()[sectionIndex];
                int x = tag.getNumberTag("x").asInt();
                short y = tag.getNumberTag("y").asShort();
                int z = tag.getNumberTag("z").asInt();
                BlockPosition position = new BlockPosition(x, (int)y, z);
                int block = section.palette(PaletteType.BLOCKS).idAt(x & 0xF, y & 0xF, z & 0xF);
                storage.checkAndStore(position, block);
                provider.transform(wrapper.user(), position, tag);
            }
            for (i = 0; i < chunk.getSections().length; ++i) {
                ChunkSection section = chunk.getSections()[i];
                if (section == null) continue;
                DataPalette palette = section.palette(PaletteType.BLOCKS);
                for (int y = 0; y < 16; ++y) {
                    for (int z = 0; z < 16; ++z) {
                        for (int x = 0; x < 16; ++x) {
                            int block = palette.idAt(x, y, z);
                            if (!FlowerPotHandler.isFlowah(block)) continue;
                            BlockPosition pos = new BlockPosition(x + (chunk.getX() << 4), (int)((short)(y + (i << 4))), z + (chunk.getZ() << 4));
                            storage.checkAndStore(pos, block);
                            CompoundTag nbt = provider.transform(wrapper.user(), pos, "minecraft:flower_pot");
                            chunk.getBlockEntities().add(nbt);
                        }
                    }
                }
                for (int j = 0; j < palette.size(); ++j) {
                    int mappedBlockStateId = ((Protocol1_13To1_12_2)this.protocol).getMappingData().getNewBlockStateId(palette.idByIndex(j));
                    palette.setIdByIndex(j, mappedBlockStateId);
                }
            }
            if (chunk.isBiomeData()) {
                for (i = 0; i < 256; ++i) {
                    int newId;
                    int biome = chunk.getBiomeData()[i];
                    switch (biome) {
                        case 40: 
                        case 41: 
                        case 42: 
                        case 43: {
                            int n = 9;
                            break;
                        }
                        case 47: 
                        case 48: 
                        case 49: {
                            int n = 24;
                            break;
                        }
                        case 50: {
                            int n = 10;
                            break;
                        }
                        case 44: 
                        case 45: 
                        case 46: {
                            int n = 0;
                            break;
                        }
                        default: {
                            int n = newId = -1;
                        }
                    }
                    if (newId == -1) continue;
                    chunk.getBiomeData()[i] = newId;
                }
            }
            wrapper.write((Type)type_old, (Object)chunk);
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    int data = (Integer)wrapper.get((Type)Types.INT, 1);
                    if (id == 1010) {
                        wrapper.set((Type)Types.INT, 1, (Object)(((Protocol1_13To1_12_2)BlockItemPacketRewriter1_13.this.protocol).getMappingData().getItemMappings().getNewId(data) >> 4));
                    } else if (id == 2001) {
                        data = ((Protocol1_13To1_12_2)BlockItemPacketRewriter1_13.this.protocol).getMappingData().getNewBlockStateId(data);
                        int blockId = data >> 4;
                        int blockData = data & 0xF;
                        wrapper.set((Type)Types.INT, 1, (Object)(blockId & 0xFFF | blockData << 12));
                    }
                });
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.MAP_ITEM_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    int iconCount = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                    for (int i = 0; i < iconCount; ++i) {
                        int type = (Integer)wrapper.read((Type)Types.VAR_INT);
                        byte x = (Byte)wrapper.read((Type)Types.BYTE);
                        byte z = (Byte)wrapper.read((Type)Types.BYTE);
                        byte direction = (Byte)wrapper.read((Type)Types.BYTE);
                        wrapper.read(Types.OPTIONAL_COMPONENT);
                        if (type > 9) {
                            wrapper.set((Type)Types.VAR_INT, 1, (Object)((Integer)wrapper.get((Type)Types.VAR_INT, 1) - 1));
                            continue;
                        }
                        wrapper.write((Type)Types.BYTE, (Object)((byte)(type << 4 | direction & 0xF)));
                        wrapper.write((Type)Types.BYTE, (Object)x);
                        wrapper.write((Type)Types.BYTE, (Object)z);
                    }
                });
            }
        });
    }

    private void invertShieldAndBannerId(Item item, CompoundTag tag) {
        ListTag patterns;
        if (item.identifier() != 442 && item.identifier() != 425) {
            return;
        }
        CompoundTag blockEntityTag = tag.getCompoundTag("BlockEntityTag");
        if (blockEntityTag == null) {
            return;
        }
        NumberTag base = blockEntityTag.getNumberTag("Base");
        if (base != null) {
            blockEntityTag.putInt("Base", 15 - base.asInt());
        }
        if ((patterns = blockEntityTag.getListTag("Patterns", CompoundTag.class)) != null) {
            for (CompoundTag pattern : patterns) {
                NumberTag colorTag = pattern.getNumberTag("Color");
                pattern.putInt("Color", 15 - colorTag.asInt());
            }
        }
    }

    private void rewriteCanPlaceToServer(CompoundTag tag, String tagName) {
        if (tag.getListTag(tagName) == null) {
            return;
        }
        ListTag blockTag = tag.getListTag(this.extraNbtTag + "|" + tagName);
        if (blockTag != null) {
            tag.remove(this.extraNbtTag + "|" + tagName);
            tag.put(tagName, (Tag)blockTag.copy());
        } else {
            blockTag = tag.getListTag(tagName);
            if (blockTag != null) {
                ListTag newCanPlaceOn = new ListTag(StringTag.class);
                for (Tag oldTag : blockTag) {
                    String lowerCaseId;
                    String[] newValues;
                    Object value = oldTag.getValue();
                    String oldId = Key.stripMinecraftNamespace((String)value.toString());
                    int key = Ints.tryParse((String)oldId);
                    String numberConverted = (String)BlockIdData.numberIdToString.get(key);
                    if (numberConverted != null) {
                        oldId = numberConverted;
                    }
                    if ((newValues = (String[])BlockIdData.blockIdMapping.get(lowerCaseId = oldId.toLowerCase(Locale.ROOT))) != null) {
                        for (String newValue : newValues) {
                            newCanPlaceOn.add((Tag)new StringTag(newValue));
                        }
                        continue;
                    }
                    newCanPlaceOn.add((Tag)new StringTag(lowerCaseId));
                }
                tag.put(tagName, (Tag)newCanPlaceOn);
            }
        }
    }

    private static void flowerPotSpecialTreatment(UserConnection user, int blockState, BlockPosition position) {
        if (FlowerPotHandler.isFlowah(blockState)) {
            BackwardsBlockEntityProvider beProvider = (BackwardsBlockEntityProvider)Via.getManager().getProviders().get(BackwardsBlockEntityProvider.class);
            CompoundTag nbt = beProvider.transform(user, position, "minecraft:flower_pot");
            PacketWrapper blockUpdateRemove = PacketWrapper.create((PacketType)ClientboundPackets1_12_1.BLOCK_UPDATE, (UserConnection)user);
            blockUpdateRemove.write(Types.BLOCK_POSITION1_8, (Object)position);
            blockUpdateRemove.write((Type)Types.VAR_INT, (Object)0);
            blockUpdateRemove.scheduleSend(Protocol1_13To1_12_2.class);
            PacketWrapper blockCreate = PacketWrapper.create((PacketType)ClientboundPackets1_12_1.BLOCK_UPDATE, (UserConnection)user);
            blockCreate.write(Types.BLOCK_POSITION1_8, (Object)position);
            blockCreate.write((Type)Types.VAR_INT, (Object)Protocol1_13To1_12_2.MAPPINGS.getNewBlockStateId(blockState));
            blockCreate.scheduleSend(Protocol1_13To1_12_2.class);
            PacketWrapper wrapper = PacketWrapper.create((PacketType)ClientboundPackets1_12_1.BLOCK_ENTITY_DATA, (UserConnection)user);
            wrapper.write(Types.BLOCK_POSITION1_8, (Object)position);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)5);
            wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)nbt);
            wrapper.scheduleSend(Protocol1_13To1_12_2.class);
        }
    }

    private void rewriteCanPlaceToClient(CompoundTag tag, String tagName) {
        ListTag blockTag = tag.getListTag(tagName);
        if (blockTag == null) {
            return;
        }
        ListTag newCanPlaceOn = new ListTag(StringTag.class);
        tag.put(this.extraNbtTag + "|" + tagName, (Tag)blockTag.copy());
        for (Tag oldTag : blockTag) {
            String[] newValues;
            Object value = oldTag.getValue();
            String[] stringArray = newValues = value instanceof String ? (String[])BlockIdData.fallbackReverseMapping.get(Key.stripMinecraftNamespace((String)((String)value))) : null;
            if (newValues != null) {
                for (String newValue : newValues) {
                    newCanPlaceOn.add((Tag)new StringTag(newValue));
                }
                continue;
            }
            newCanPlaceOn.add((Tag)new StringTag(oldTag.getValue().toString()));
        }
        tag.put(tagName, (Tag)newCanPlaceOn);
    }

    private int itemIdToRaw(int oldId, Item item, CompoundTag tag) {
        Optional eggEntityId = SpawnEggMappings1_13.getEntityId((int)oldId);
        if (eggEntityId.isPresent()) {
            if (tag == null) {
                tag = new CompoundTag();
                item.setTag(tag);
            }
            if (!tag.contains("EntityTag")) {
                CompoundTag entityTag = new CompoundTag();
                entityTag.putString("id", (String)eggEntityId.get());
                tag.put("EntityTag", (Tag)entityTag);
            }
            return 25100288;
        }
        return oldId >> 4 << 16 | oldId & 0xF;
    }

    public static boolean isDamageable(int id) {
        return id >= 256 && id <= 259 || id == 261 || id >= 267 && id <= 279 || id >= 283 && id <= 286 || id >= 290 && id <= 294 || id >= 298 && id <= 317 || id == 346 || id == 359 || id == 398 || id == 442 || id == 443;
    }
}

