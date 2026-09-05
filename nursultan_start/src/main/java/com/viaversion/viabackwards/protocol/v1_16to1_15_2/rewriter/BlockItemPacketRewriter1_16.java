/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.LongArrayTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viabackwards.api.rewriters.EnchantmentRewriter
 *  com.viaversion.viabackwards.api.rewriters.MapColorRewriter
 *  com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.storage.BiomeStorage
 *  com.viaversion.viabackwards.protocol.v1_16to1_15_2.rewriter.BlockItemPacketRewriter1_16$EquipmentData
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_15
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_16
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.rewriter.ItemPacketRewriter1_16
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.util.CompactArrayUtil
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.UUIDUtil
 */
package com.viaversion.viabackwards.protocol.v1_16to1_15_2.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.LongArrayTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.api.rewriters.EnchantmentRewriter;
import com.viaversion.viabackwards.api.rewriters.MapColorRewriter;
import com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.storage.BiomeStorage;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.Protocol1_16To1_15_2;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.data.MapColorMappings1_15_2;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.rewriter.BlockItemPacketRewriter1_16;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_15;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_16;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.rewriter.ItemPacketRewriter1_16;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.util.CompactArrayUtil;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.UUIDUtil;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

public class BlockItemPacketRewriter1_16
extends BackwardsItemRewriter<ClientboundPackets1_16, ServerboundPackets1_14, Protocol1_16To1_15_2> {
    private EnchantmentRewriter enchantmentRewriter;

    public BlockItemPacketRewriter1_16(Protocol1_16To1_15_2 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        ListTag pagesTag;
        IntArrayTag idTag;
        CompoundTag ownerTag;
        if (item == null) {
            return null;
        }
        item = super.handleItemToClient(connection, item);
        CompoundTag tag = item.tag();
        if (item.identifier() == 771 && tag != null && (ownerTag = tag.getCompoundTag("SkullOwner")) != null && (idTag = ownerTag.getIntArrayTag("Id")) != null) {
            UUID ownerUuid = UUIDUtil.fromIntArray((int[])idTag.getValue());
            ownerTag.putString("Id", ownerUuid.toString());
        }
        if (item.identifier() == 759 && tag != null && (pagesTag = tag.getListTag("pages", StringTag.class)) != null) {
            for (StringTag page : pagesTag) {
                JsonElement jsonElement = ((Protocol1_16To1_15_2)this.protocol).getComponentRewriter().processText(connection, page.getValue());
                page.setValue(jsonElement.toString());
            }
        }
        ItemPacketRewriter1_16.newToOldAttributes((Item)item);
        this.enchantmentRewriter.handleToClient(item);
        return item;
    }

    protected void registerRewrites() {
        this.enchantmentRewriter = new EnchantmentRewriter((BackwardsItemRewriter)this);
        this.enchantmentRewriter.registerEnchantment("minecraft:soul_speed", "\u00a77Soul Speed");
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        StringTag idTag;
        CompoundTag ownerTag;
        if (item == null) {
            return null;
        }
        int identifier = item.identifier();
        item = super.handleItemToServer(connection, item);
        CompoundTag tag = item.tag();
        if (identifier == 771 && tag != null && (ownerTag = tag.getCompoundTag("SkullOwner")) != null && (idTag = ownerTag.getStringTag("Id")) != null) {
            UUID ownerUuid = UUID.fromString(idTag.getValue());
            ownerTag.put("Id", (Tag)new IntArrayTag(UUIDUtil.toIntArray((UUID)ownerUuid)));
        }
        ItemPacketRewriter1_16.oldToNewAttributes((Item)item);
        this.enchantmentRewriter.handleToServer(item);
        return item;
    }

    private void handleBlockEntity(CompoundTag tag) {
        String id = tag.getString("id");
        if (id == null) {
            return;
        }
        if ((id = Key.namespaced((String)id)).equals("minecraft:conduit")) {
            Tag targetUuidTag = tag.remove("Target");
            if (!(targetUuidTag instanceof IntArrayTag)) {
                return;
            }
            UUID targetUuid = UUIDUtil.fromIntArray((int[])((int[])targetUuidTag.getValue()));
            tag.putString("target_uuid", targetUuid.toString());
        } else if (id.equals("minecraft:skull")) {
            Tag targetUuid = tag.remove("SkullOwner");
            if (!(targetUuid instanceof CompoundTag)) {
                return;
            }
            CompoundTag skullOwnerTag = (CompoundTag)targetUuid;
            Tag tag2 = skullOwnerTag.remove("Id");
            if (tag2 instanceof IntArrayTag) {
                IntArrayTag ownerUuidTag = (IntArrayTag)tag2;
                UUID ownerUuid = UUIDUtil.fromIntArray((int[])ownerUuidTag.getValue());
                skullOwnerTag.putString("Id", ownerUuid.toString());
            }
            CompoundTag ownerTag = new CompoundTag();
            for (Map.Entry entry : skullOwnerTag) {
                ownerTag.put((String)entry.getKey(), (Tag)entry.getValue());
            }
            tag.put("Owner", (Tag)ownerTag);
        }
    }

    protected void registerPackets() {
        RecipeRewriter recipeRewriter = new RecipeRewriter(this.protocol);
        ((Protocol1_16To1_15_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16.UPDATE_RECIPES, wrapper -> {
            int size;
            int newSize = size = ((Integer)wrapper.passthrough((Type)Types.VAR_INT)).intValue();
            for (int i = 0; i < size; ++i) {
                String originalType = (String)wrapper.read(Types.STRING);
                String type = Key.stripMinecraftNamespace((String)originalType);
                if (type.equals("smithing")) {
                    --newSize;
                    wrapper.read(Types.STRING);
                    wrapper.read(Types.ITEM1_13_2_ARRAY);
                    wrapper.read(Types.ITEM1_13_2_ARRAY);
                    wrapper.read(Types.ITEM1_13_2);
                    continue;
                }
                wrapper.write(Types.STRING, (Object)originalType);
                wrapper.passthrough(Types.STRING);
                recipeRewriter.handleRecipeType(wrapper, type);
            }
            wrapper.set((Type)Types.VAR_INT, 0, (Object)newSize);
        });
        ((Protocol1_16To1_15_2)this.protocol).getBlockRewriter().registerLevelChunk((ClientboundPacketType)ClientboundPackets1_16.LEVEL_CHUNK, ChunkType1_16.TYPE, ChunkType1_15.TYPE, (connection, chunk) -> {
            CompoundTag heightMaps = chunk.getHeightMap();
            for (Tag heightMapTag : heightMaps.values()) {
                if (!(heightMapTag instanceof LongArrayTag)) continue;
                LongArrayTag heightMap = (LongArrayTag)heightMapTag;
                int[] heightMapData = new int[256];
                CompactArrayUtil.iterateCompactArrayWithPadding((int)9, (int)heightMapData.length, (long[])heightMap.getValue(), (i, v) -> {
                    heightMapData[i] = v;
                });
                heightMap.setValue(CompactArrayUtil.createCompactArray((int)9, (int)heightMapData.length, i -> heightMapData[i]));
            }
            if (chunk.isBiomeData()) {
                if (connection.getProtocolInfo().serverProtocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_16_2)) {
                    BiomeStorage biomeStorage = (BiomeStorage)connection.get(BiomeStorage.class);
                    for (int i2 = 0; i2 < 1024; ++i2) {
                        int biome = chunk.getBiomeData()[i2];
                        int legacyBiome = biomeStorage.legacyBiome(biome);
                        if (legacyBiome == -1) {
                            ((Protocol1_16To1_15_2)this.protocol).getLogger().warning("Biome sent that does not exist in the biome registry: " + biome);
                            legacyBiome = 1;
                        }
                        chunk.getBiomeData()[i2] = legacyBiome;
                    }
                } else {
                    for (int i3 = 0; i3 < 1024; ++i3) {
                        int biome = chunk.getBiomeData()[i3];
                        switch (biome) {
                            case 170: 
                            case 171: 
                            case 172: 
                            case 173: {
                                chunk.getBiomeData()[i3] = 8;
                            }
                        }
                    }
                }
            }
            if (chunk.getBlockEntities() == null) {
                return;
            }
            for (CompoundTag blockEntity : chunk.getBlockEntities()) {
                this.handleBlockEntity(blockEntity);
            }
        });
        ((Protocol1_16To1_15_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16.SET_EQUIPMENT, (ClientboundPacketType)ClientboundPackets1_15.SET_EQUIPPED_ITEM, wrapper -> {
            byte slot;
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            ArrayList<EquipmentData> equipmentData = new ArrayList<EquipmentData>();
            do {
                slot = (Byte)wrapper.read((Type)Types.BYTE);
                Item item = this.handleItemToClient(wrapper.user(), (Item)wrapper.read(Types.ITEM1_13_2));
                int rawSlot = slot & 0x7F;
                equipmentData.add(new EquipmentData(rawSlot, item));
            } while ((slot & 0xFFFFFF80) != 0);
            EquipmentData firstData = (EquipmentData)equipmentData.get(0);
            wrapper.write((Type)Types.VAR_INT, (Object)firstData.slot);
            wrapper.write(Types.ITEM1_13_2, (Object)firstData.item);
            for (int i = 1; i < equipmentData.size(); ++i) {
                PacketWrapper equipmentPacket = wrapper.create((PacketType)ClientboundPackets1_15.SET_EQUIPPED_ITEM);
                EquipmentData data = (EquipmentData)equipmentData.get(i);
                equipmentPacket.write((Type)Types.VAR_INT, (Object)entityId);
                equipmentPacket.write((Type)Types.VAR_INT, (Object)data.slot);
                equipmentPacket.write(Types.ITEM1_13_2, (Object)data.item);
                equipmentPacket.send(Protocol1_16To1_15_2.class);
            }
        });
        ((Protocol1_16To1_15_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16.LIGHT_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.read((Type)Types.BOOLEAN);
            }
        });
        ((Protocol1_16To1_15_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16.CONTAINER_SET_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> {
                    short property = (Short)wrapper.get((Type)Types.SHORT, 0);
                    if (property >= 4 && property <= 6) {
                        short enchantmentId = (Short)wrapper.get((Type)Types.SHORT, 1);
                        if (enchantmentId > 11) {
                            enchantmentId = (short)(enchantmentId - 1);
                            wrapper.set((Type)Types.SHORT, 1, (Object)enchantmentId);
                        } else if (enchantmentId == 11) {
                            wrapper.set((Type)Types.SHORT, 1, (Object)9);
                        }
                    }
                });
            }
        });
        ((Protocol1_16To1_15_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16.MAP_ITEM_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.handler(MapColorRewriter.getRewriteHandler(MapColorMappings1_15_2::getMappedColor));
            }
        });
        ((Protocol1_16To1_15_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16.BLOCK_ENTITY_DATA, wrapper -> {
            wrapper.passthrough(Types.BLOCK_POSITION1_14);
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            CompoundTag tag = (CompoundTag)wrapper.passthrough(Types.NAMED_COMPOUND_TAG);
            this.handleBlockEntity(tag);
        });
        ((Protocol1_16To1_15_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_14.EDIT_BOOK, wrapper -> this.handleItemToServer(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2)));
    }
}

