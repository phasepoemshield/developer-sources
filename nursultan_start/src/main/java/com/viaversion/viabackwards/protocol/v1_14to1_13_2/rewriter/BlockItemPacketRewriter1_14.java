/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.TranslatableMappings
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viabackwards.api.rewriters.EnchantmentRewriter
 *  com.viaversion.viabackwards.item.DataItemWithExtras
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.Protocol1_14To1_13_2
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.ChunkLightStorage
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.ChunkLightStorage$ChunkLight
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionLight
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionLightImpl
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_13
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_14
 *  com.viaversion.viaversion.exception.InformativeException
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonParseException
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.utils.TextUtils
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.Protocol1_13_2To1_14
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.SerializerVersion
 */
package com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter;

import com.google.common.collect.ImmutableSet;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.TranslatableMappings;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.api.rewriters.EnchantmentRewriter;
import com.viaversion.viabackwards.item.DataItemWithExtras;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.Protocol1_14To1_13_2;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.ChunkLightStorage;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionLight;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionLightImpl;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_13;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_14;
import com.viaversion.viaversion.exception.InformativeException;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonParseException;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.utils.TextUtils;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.Protocol1_13_2To1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.SerializerVersion;
import java.util.List;
import java.util.Set;

public class BlockItemPacketRewriter1_14
extends BackwardsItemRewriter<ClientboundPackets1_14, ServerboundPackets1_13, Protocol1_14To1_13_2> {
    private EnchantmentRewriter enchantmentRewriter;

    static /* synthetic */ void access$000(BlockItemPacketRewriter1_14 x0, PacketWrapper x1) {
        x0.passthroughClientboundItem(x1);
    }

    public BlockItemPacketRewriter1_14(Protocol1_14To1_13_2 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    private static /* synthetic */ void lambda$registerPackets$5(Set removedTypes, RecipeRewriter recipeHandler, PacketWrapper wrapper) throws InformativeException {
        int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
        int deleted = 0;
        for (int i = 0; i < size; ++i) {
            String type = (String)wrapper.read(Types.STRING);
            String id = (String)wrapper.read(Types.STRING);
            if (removedTypes.contains(type = Key.stripMinecraftNamespace((String)type))) {
                switch (type) {
                    case "blasting": 
                    case "smoking": 
                    case "campfire_cooking": {
                        wrapper.read(Types.STRING);
                        wrapper.read(Types.ITEM1_13_2_ARRAY);
                        wrapper.read(Types.ITEM1_13_2);
                        wrapper.read((Type)Types.FLOAT);
                        wrapper.read((Type)Types.VAR_INT);
                        break;
                    }
                    case "stonecutting": {
                        wrapper.read(Types.STRING);
                        wrapper.read(Types.ITEM1_13_2_ARRAY);
                        wrapper.read(Types.ITEM1_13_2);
                    }
                }
                ++deleted;
                continue;
            }
            wrapper.write(Types.STRING, (Object)id);
            wrapper.write(Types.STRING, (Object)type);
            recipeHandler.handleRecipeType(wrapper, type);
        }
        wrapper.set((Type)Types.VAR_INT, 0, (Object)(size - deleted));
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        DataItemWithExtras fullItem;
        CompoundTag display;
        if (item == null) {
            return null;
        }
        CompoundTag compoundTag = display = (item = super.handleItemToClient(connection, item)).tag() != null ? item.tag().getCompoundTag("display") : null;
        if (display != null && item instanceof DataItemWithExtras && (fullItem = (DataItemWithExtras)item).lore() != null) {
            List lore = fullItem.lore();
            ListTag loreTag = fullItem.rawLore();
            this.saveListTag(display, loreTag, "Lore");
            try {
                for (int i = 0; i < lore.size(); ++i) {
                    JsonElement loreEntry = (JsonElement)lore.get(i);
                    TextComponent component = SerializerVersion.V1_12.toComponent(loreEntry);
                    if (component == null) {
                        lore.remove(i);
                        loreTag.remove(i);
                        --i;
                        continue;
                    }
                    TextUtils.setTranslator((TextComponent)component, s -> Protocol1_12_2To1_13.MAPPINGS.getMojangTranslation().getOrDefault(s, (String)TranslatableMappings.getTranslatableMappings((String)"1.14").get(s)));
                    ((StringTag)loreTag.get(i)).setValue(component.asLegacyFormatString());
                }
            }
            catch (JsonParseException e) {
                display.remove("Lore");
            }
        }
        if (item instanceof DataItemWithExtras) {
            item = new DataItem(item.identifier(), (byte)item.amount(), item.data(), item.tag());
        }
        this.enchantmentRewriter.handleToClient(item);
        return item;
    }

    protected void registerRewrites() {
        this.enchantmentRewriter = new EnchantmentRewriter((BackwardsItemRewriter)this, false);
        this.enchantmentRewriter.registerEnchantment("minecraft:multishot", "\u00a77Multishot");
        this.enchantmentRewriter.registerEnchantment("minecraft:quick_charge", "\u00a77Quick Charge");
        this.enchantmentRewriter.registerEnchantment("minecraft:piercing", "\u00a77Piercing");
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        ListTag lore;
        CompoundTag display;
        if (item == null) {
            return null;
        }
        CompoundTag tag = item.tag();
        if (tag != null && (display = tag.getCompoundTag("display")) != null && (lore = display.getListTag("Lore", StringTag.class)) != null && !this.hasBackupTag(display, "Lore")) {
            for (StringTag loreEntry : lore) {
                loreEntry.setValue(ComponentUtil.legacyToJsonString((String)loreEntry.getValue()));
            }
        }
        this.enchantmentRewriter.handleToServer(item);
        item = super.handleItemToServer(connection, item);
        return item;
    }

    protected void registerPackets() {
        ((Protocol1_14To1_13_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_13.EDIT_BOOK, wrapper -> this.handleItemToServer(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2)));
        ((Protocol1_14To1_13_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_14.OPEN_SCREEN, wrapper -> {
            JsonObject object;
            int windowId = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)windowId));
            int type = (Integer)wrapper.read((Type)Types.VAR_INT);
            String stringType = null;
            String containerTitle = null;
            int slotSize = 0;
            if (type < 6) {
                if (type == 2) {
                    containerTitle = "Barrel";
                }
                stringType = "minecraft:container";
                slotSize = (type + 1) * 9;
            } else {
                switch (type) {
                    case 11: {
                        stringType = "minecraft:crafting_table";
                        break;
                    }
                    case 9: 
                    case 13: 
                    case 14: 
                    case 20: {
                        if (type == 9) {
                            containerTitle = "Blast Furnace";
                        } else if (type == 20) {
                            containerTitle = "Smoker";
                        } else if (type == 14) {
                            containerTitle = "Grindstone";
                        }
                        stringType = "minecraft:furnace";
                        slotSize = 3;
                        break;
                    }
                    case 6: {
                        stringType = "minecraft:dropper";
                        slotSize = 9;
                        break;
                    }
                    case 12: {
                        stringType = "minecraft:enchanting_table";
                        break;
                    }
                    case 10: {
                        stringType = "minecraft:brewing_stand";
                        slotSize = 5;
                        break;
                    }
                    case 18: {
                        stringType = "minecraft:villager";
                        break;
                    }
                    case 8: {
                        stringType = "minecraft:beacon";
                        slotSize = 1;
                        break;
                    }
                    case 7: 
                    case 21: {
                        if (type == 21) {
                            containerTitle = "Cartography Table";
                        }
                        stringType = "minecraft:anvil";
                        break;
                    }
                    case 15: {
                        stringType = "minecraft:hopper";
                        slotSize = 5;
                        break;
                    }
                    case 19: {
                        stringType = "minecraft:shulker_box";
                        slotSize = 27;
                    }
                }
            }
            if (stringType == null) {
                ((Protocol1_14To1_13_2)this.protocol).getLogger().warning("Can't open inventory for player! Type: " + type);
                wrapper.cancel();
                return;
            }
            wrapper.write(Types.STRING, (Object)stringType);
            JsonElement title = (JsonElement)wrapper.read(Types.COMPONENT);
            if (containerTitle != null && title.isJsonObject() && (object = title.getAsJsonObject()).has("translate") && (type != 2 || object.getAsJsonPrimitive("translate").getAsString().equals("container.barrel"))) {
                title = ComponentUtil.legacyToJson((String)containerTitle);
            }
            wrapper.write(Types.COMPONENT, (Object)title);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)slotSize));
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.HORSE_SCREEN_OPEN, (ClientboundPacketType)ClientboundPackets1_13.OPEN_SCREEN, wrapper -> {
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            wrapper.write(Types.STRING, (Object)"EntityHorse");
            JsonObject object = new JsonObject();
            object.addProperty("translate", "minecraft.horse");
            wrapper.write(Types.COMPONENT, (Object)object);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((Integer)wrapper.read((Type)Types.VAR_INT)).shortValue());
            wrapper.passthrough((Type)Types.INT);
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.MERCHANT_OFFERS, (ClientboundPacketType)ClientboundPackets1_13.CUSTOM_PAYLOAD, wrapper -> {
            wrapper.write(Types.STRING, (Object)"minecraft:trader_list");
            int windowId = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.INT, (Object)windowId);
            int size = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
            for (int i = 0; i < size; ++i) {
                Item input = (Item)wrapper.read(Types.ITEM1_13_2);
                input = this.handleItemToClient(wrapper.user(), input);
                wrapper.write(Types.ITEM1_13_2, (Object)input);
                Item output = (Item)wrapper.read(Types.ITEM1_13_2);
                output = this.handleItemToClient(wrapper.user(), output);
                wrapper.write(Types.ITEM1_13_2, (Object)output);
                boolean secondItem = (Boolean)wrapper.passthrough((Type)Types.BOOLEAN);
                if (secondItem) {
                    Item second = (Item)wrapper.read(Types.ITEM1_13_2);
                    second = this.handleItemToClient(wrapper.user(), second);
                    wrapper.write(Types.ITEM1_13_2, (Object)second);
                }
                wrapper.passthrough((Type)Types.BOOLEAN);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.read((Type)Types.INT);
                wrapper.read((Type)Types.INT);
                wrapper.read((Type)Types.FLOAT);
            }
            wrapper.read((Type)Types.VAR_INT);
            wrapper.read((Type)Types.VAR_INT);
            wrapper.read((Type)Types.BOOLEAN);
        }, true);
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.OPEN_BOOK, (ClientboundPacketType)ClientboundPackets1_13.CUSTOM_PAYLOAD, wrapper -> {
            wrapper.write(Types.STRING, (Object)"minecraft:book_open");
            wrapper.passthrough((Type)Types.VAR_INT);
        });
        ((Protocol1_14To1_13_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_14.SET_EQUIPPED_ITEM, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        RecipeRewriter recipeHandler = new RecipeRewriter(this.protocol);
        ImmutableSet removedTypes = ImmutableSet.of((Object)"crafting_special_suspiciousstew", (Object)"blasting", (Object)"smoking", (Object)"campfire_cooking", (Object)"stonecutting");
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.UPDATE_RECIPES, arg_0 -> BlockItemPacketRewriter1_14.lambda$registerPackets$5((Set)removedTypes, recipeHandler, arg_0));
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.BLOCK_DESTRUCTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
                this.map((Type)Types.BYTE);
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_14.BLOCK_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int mappedId = ((Protocol1_14To1_13_2)BlockItemPacketRewriter1_14.this.protocol).getMappingData().getNewBlockId(((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue());
                    if (mappedId == -1) {
                        wrapper.cancel();
                        return;
                    }
                    wrapper.set((Type)Types.VAR_INT, 0, (Object)mappedId);
                });
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_14.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    wrapper.set((Type)Types.VAR_INT, 0, (Object)((Protocol1_14To1_13_2)BlockItemPacketRewriter1_14.this.protocol).getMappingData().getNewBlockStateId(id));
                });
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.EXPLODE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.handler(wrapper -> {
                    for (int i = 0; i < 3; ++i) {
                        float coord = ((Float)wrapper.get((Type)Types.FLOAT, i)).floatValue();
                        if (!(coord < 0.0f)) continue;
                        coord = (float)Math.floor(coord);
                        wrapper.set((Type)Types.FLOAT, i, (Object)Float.valueOf(coord));
                    }
                });
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.LEVEL_CHUNK, wrapper -> {
            ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_14To1_13_2.class);
            Chunk chunk = (Chunk)wrapper.read(ChunkType1_14.TYPE);
            wrapper.write((Type)ChunkType1_13.forEnvironment((Environment)clientWorld.getEnvironment()), (Object)chunk);
            ChunkLightStorage.ChunkLight chunkLight = ((ChunkLightStorage)wrapper.user().get(ChunkLightStorage.class)).getStoredLight(chunk.getX(), chunk.getZ());
            for (int i = 0; i < chunk.getSections().length; ++i) {
                ChunkSection section = chunk.getSections()[i];
                if (section == null) continue;
                ChunkSectionLight sectionLight = ChunkSectionLightImpl.createWithBlockLight();
                section.setLight(sectionLight);
                if (chunkLight == null) {
                    sectionLight.setBlockLight(ChunkLightStorage.FULL_LIGHT);
                    if (clientWorld.getEnvironment() == Environment.NORMAL) {
                        sectionLight.setSkyLight(ChunkLightStorage.FULL_LIGHT);
                    }
                } else {
                    byte[] blockLight = chunkLight.blockLight()[i];
                    sectionLight.setBlockLight(blockLight != null ? blockLight : ChunkLightStorage.FULL_LIGHT);
                    if (clientWorld.getEnvironment() == Environment.NORMAL) {
                        byte[] skyLight = chunkLight.skyLight()[i];
                        sectionLight.setSkyLight(skyLight != null ? skyLight : ChunkLightStorage.FULL_LIGHT);
                    }
                }
                DataPalette palette = section.palette(PaletteType.BLOCKS);
                if (Via.getConfig().isNonFullBlockLightFix() && section.getNonAirBlocksCount() != 0 && sectionLight.hasBlockLight()) {
                    for (int x = 0; x < 16; ++x) {
                        for (int y = 0; y < 16; ++y) {
                            for (int z = 0; z < 16; ++z) {
                                int id = palette.idAt(x, y, z);
                                if (!Protocol1_13_2To1_14.MAPPINGS.getNonFullBlocks().contains(id)) continue;
                                sectionLight.getBlockLightNibbleArray().set(x, y, z, 0);
                            }
                        }
                    }
                }
                for (int j = 0; j < palette.size(); ++j) {
                    int mappedBlockStateId = ((Protocol1_14To1_13_2)this.protocol).getMappingData().getNewBlockStateId(palette.idByIndex(j));
                    palette.setIdByIndex(j, mappedBlockStateId);
                }
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.FORGET_LEVEL_CHUNK, wrapper -> {
            int x = (Integer)wrapper.passthrough((Type)Types.INT);
            int z = (Integer)wrapper.passthrough((Type)Types.INT);
            ((ChunkLightStorage)wrapper.user().get(ChunkLightStorage.class)).unloadChunk(x, z);
        });
        ((Protocol1_14To1_13_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_14.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    int data = (Integer)wrapper.get((Type)Types.INT, 1);
                    if (id == 1010) {
                        wrapper.set((Type)Types.INT, 1, (Object)((Protocol1_14To1_13_2)BlockItemPacketRewriter1_14.this.protocol).getMappingData().getNewItemId(data));
                    } else if (id == 2001) {
                        wrapper.set((Type)Types.INT, 1, (Object)((Protocol1_14To1_13_2)BlockItemPacketRewriter1_14.this.protocol).getMappingData().getNewBlockStateId(data));
                    }
                });
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.MAP_ITEM_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.read((Type)Types.BOOLEAN);
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.SET_DEFAULT_SPAWN_POSITION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
            }
        });
    }
}

