/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.ShortTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.rewriters.LegacyBlockItemRewriter$Pos
 *  com.viaversion.viabackwards.protocol.v1_12to1_11_1.data.BlockColors1_11_1
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_12$ObjectType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonPrimitive
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.IdAndData
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.api.rewriters;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.ShortTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingDataLoader;
import com.viaversion.viabackwards.api.data.MappedLegacyBlockItem;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriterBase;
import com.viaversion.viabackwards.api.rewriters.LegacyBlockItemRewriter;
import com.viaversion.viabackwards.protocol.v1_12to1_11_1.data.BlockColors1_11_1;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_12;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.IdAndData;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class LegacyBlockItemRewriter<C extends ClientboundPacketType, S extends ServerboundPacketType, T extends BackwardsProtocol<C, ?, ?, S>>
extends BackwardsItemRewriterBase<C, S, T> {
    protected final Int2ObjectMap<MappedLegacyBlockItem> itemReplacements = new Int2ObjectOpenHashMap(8);
    protected final Int2ObjectMap<MappedLegacyBlockItem> blockReplacements = new Int2ObjectOpenHashMap(8);

    protected LegacyBlockItemRewriter(T protocol, String name) {
        this(protocol, name, (Type<Item>)Types.ITEM1_8, (Type<Item[]>)Types.ITEM1_8_SHORT_ARRAY);
    }

    protected LegacyBlockItemRewriter(T protocol, String name, Type<Item> itemType, Type<Item[]> itemArrayType) {
        this(protocol, name, itemType, itemArrayType, itemType, itemArrayType);
    }

    protected LegacyBlockItemRewriter(T protocol, String name, Type<Item> itemType, Type<Item[]> itemArrayType, Type<Item> mappedItemType, Type<Item[]> mappedItemArrayType) {
        super(protocol, itemType, itemArrayType, mappedItemType, mappedItemArrayType, false);
        Int2ObjectOpenHashMap blockItemReplacements = new Int2ObjectOpenHashMap(8);
        JsonObject jsonObject = this.readMappingsFile("item-mappings-" + name + ".json");
        this.addMappings(MappedLegacyBlockItem.Type.ITEM, jsonObject, this.itemReplacements);
        this.addMappings(MappedLegacyBlockItem.Type.BLOCK_ITEM, jsonObject, (Int2ObjectMap<MappedLegacyBlockItem>)blockItemReplacements);
        this.addMappings(MappedLegacyBlockItem.Type.BLOCK, jsonObject, this.blockReplacements);
        this.blockReplacements.putAll((Map)blockItemReplacements);
        this.itemReplacements.putAll((Map)blockItemReplacements);
    }

    protected int compress(int id, int data) {
        return id << 16 | data & 0xFFFF;
    }

    public @Nullable Item handleItemToClient(UserConnection connection, @Nullable Item item) {
        if (item == null) {
            return null;
        }
        MappedLegacyBlockItem data = this.getMappedItem(item.identifier(), item.data());
        if (data == null) {
            return super.handleItemToClient(connection, item);
        }
        if (item.tag() == null) {
            item.setTag(new CompoundTag());
        }
        short originalData = item.data();
        item.tag().putInt(this.nbtTagName("id"), item.identifier());
        item.setIdentifier(data.getId());
        if (data.getData() != -1) {
            item.setData(data.getData());
            item.tag().putShort(this.nbtTagName("data"), originalData);
        }
        if (data.getName() != null) {
            String value;
            StringTag nameTag;
            CompoundTag display = item.tag().getCompoundTag("display");
            if (display == null) {
                display = new CompoundTag();
                item.tag().put("display", (Tag)display);
            }
            if ((nameTag = display.getStringTag("Name")) == null) {
                nameTag = new StringTag(data.getName());
                display.put("Name", (Tag)nameTag);
                display.put(this.nbtTagName("customName"), (Tag)new ByteTag(false));
            }
            if ((value = nameTag.getValue()).contains("%vb_color%")) {
                display.putString("Name", value.replace("%vb_color%", BlockColors1_11_1.get((int)originalData)));
            }
        }
        return item;
    }

    @Override
    public @Nullable Item handleItemToServer(UserConnection connection, @Nullable Item item) {
        if (item == null) {
            return null;
        }
        if ((item = super.handleItemToServer(connection, item)).tag() != null) {
            Tag originalData;
            Tag originalId = item.tag().remove(this.nbtTagName("id"));
            if (originalId instanceof IntTag) {
                item.setIdentifier(((NumberTag)originalId).asInt());
            }
            if ((originalData = item.tag().remove(this.nbtTagName("data"))) instanceof ShortTag) {
                item.setData(((NumberTag)originalData).asShort());
            }
        }
        return item;
    }

    public void handleChunk(Chunk chunk) {
        int block;
        MappedLegacyBlockItem settings;
        HashMap<Pos, CompoundTag> tags = new HashMap<Pos, CompoundTag>();
        for (CompoundTag tag : chunk.getBlockEntities()) {
            ChunkSection section;
            NumberTag zTag;
            NumberTag yTag;
            NumberTag xTag = tag.getNumberTag("x");
            if (xTag == null || (yTag = tag.getNumberTag("y")) == null || (zTag = tag.getNumberTag("z")) == null) continue;
            Pos pos = new Pos(xTag.asInt() & 0xF, yTag.asInt(), zTag.asInt() & 0xF);
            tags.put(pos, tag);
            if (pos.y() < 0 || pos.y() > 255 || (section = chunk.getSections()[pos.y() >> 4]) == null || (settings = this.getMappedBlock(block = section.palette(PaletteType.BLOCKS).idAt(pos.x(), pos.y() & 0xF, pos.z()))) == null || !settings.hasBlockEntityHandler()) continue;
            settings.getBlockEntityHandler().handleCompoundTag(block, tag);
        }
        for (int i = 0; i < chunk.getSections().length; ++i) {
            ChunkSection section = chunk.getSections()[i];
            if (section == null) continue;
            boolean hasBlockEntityHandler = false;
            DataPalette palette = section.palette(PaletteType.BLOCKS);
            for (int j = 0; j < palette.size(); ++j) {
                MappedLegacyBlockItem settings2;
                int meta;
                int block2 = palette.idByIndex(j);
                int btype = block2 >> 4;
                IdAndData b = this.handleBlock(btype, meta = block2 & 0xF);
                if (b != null) {
                    palette.setIdByIndex(j, IdAndData.toRawData((int)b.getId(), (int)b.getData()));
                }
                if (hasBlockEntityHandler || (settings2 = this.getMappedBlock(block2)) == null || !settings2.hasBlockEntityHandler()) continue;
                hasBlockEntityHandler = true;
            }
            if (!hasBlockEntityHandler) continue;
            for (int x = 0; x < 16; ++x) {
                for (int y = 0; y < 16; ++y) {
                    for (int z = 0; z < 16; ++z) {
                        Pos pos;
                        block = palette.idAt(x, y, z);
                        settings = this.getMappedBlock(block);
                        if (settings == null || !settings.hasBlockEntityHandler() || tags.containsKey(pos = new Pos(x, y + (i << 4), z))) continue;
                        CompoundTag tag = new CompoundTag();
                        tag.putInt("x", x + (chunk.getX() << 4));
                        tag.putInt("y", y + (i << 4));
                        tag.putInt("z", z + (chunk.getZ() << 4));
                        settings.getBlockEntityHandler().handleCompoundTag(block, tag);
                        chunk.getBlockEntities().add(tag);
                    }
                }
            }
        }
    }

    private void addMapping(String key, JsonObject object, MappedLegacyBlockItem.Type type, Int2ObjectMap<MappedLegacyBlockItem> mappings) {
        String name;
        int id = object.getAsJsonPrimitive("id").getAsInt();
        JsonPrimitive jsonData = object.getAsJsonPrimitive("data");
        short data = jsonData != null ? jsonData.getAsShort() : (short)0;
        String string = name = type != MappedLegacyBlockItem.Type.BLOCK ? object.getAsJsonPrimitive("name").getAsString() : null;
        if (key.indexOf(45) == -1) {
            int unmappedId;
            int dataSeparatorIndex = key.indexOf(58);
            if (dataSeparatorIndex != -1) {
                short unmappedData = Short.parseShort(key.substring(dataSeparatorIndex + 1));
                unmappedId = Integer.parseInt(key.substring(0, dataSeparatorIndex));
                unmappedId = this.compress(unmappedId, unmappedData);
            } else {
                unmappedId = this.compress(Integer.parseInt(key), -1);
            }
            mappings.put(unmappedId, (Object)new MappedLegacyBlockItem(id, data, name, type));
            return;
        }
        String[] split = key.split("-", 2);
        int from = Integer.parseInt(split[0]);
        int to = Integer.parseInt(split[1]);
        if (name != null && name.contains("%color%")) {
            for (int i = from; i <= to; ++i) {
                mappings.put(this.compress(i, -1), (Object)new MappedLegacyBlockItem(id, data, name.replace("%color%", BlockColors1_11_1.get((int)(i - from))), type));
            }
        } else {
            MappedLegacyBlockItem mappedBlockItem = new MappedLegacyBlockItem(id, data, name, type);
            for (int i = from; i <= to; ++i) {
                mappings.put(this.compress(i, -1), (Object)mappedBlockItem);
            }
        }
    }

    private @Nullable MappedLegacyBlockItem getMappedBlock(int rawId) {
        int id = IdAndData.getId((int)rawId);
        int data = IdAndData.getData((int)rawId);
        return this.getMappedBlock(id, data);
    }

    private @Nullable MappedLegacyBlockItem getMappedBlock(int id, int data) {
        MappedLegacyBlockItem mapping = (MappedLegacyBlockItem)this.blockReplacements.get(this.compress(id, data));
        return mapping != null ? mapping : (MappedLegacyBlockItem)this.blockReplacements.get(this.compress(id, -1));
    }

    public int handleBlockId(int rawId) {
        int data;
        int id = IdAndData.getId((int)rawId);
        IdAndData mappedBlock = this.handleBlock(id, data = IdAndData.getData((int)rawId));
        if (mappedBlock == null) {
            return rawId;
        }
        return IdAndData.toRawData((int)mappedBlock.getId(), (int)mappedBlock.getData());
    }

    protected CompoundTag getNamedTag(String text) {
        CompoundTag tag = new CompoundTag();
        CompoundTag displayTag = new CompoundTag();
        tag.put("display", (Tag)displayTag);
        text = "\u00a7r" + (String)text;
        displayTag.putString("Name", (String)(this.jsonNameFormat ? ComponentUtil.legacyToJsonString((String)text) : text));
        return tag;
    }

    public @Nullable IdAndData handleBlock(int blockId, int data) {
        MappedLegacyBlockItem settings = this.getMappedBlock(blockId, data);
        if (settings == null) {
            return null;
        }
        IdAndData block = settings.getBlock();
        if (block.getData() == -1) {
            return block.withData(data);
        }
        return block;
    }

    private @Nullable MappedLegacyBlockItem getMappedItem(int id, int data) {
        MappedLegacyBlockItem mapping = (MappedLegacyBlockItem)this.itemReplacements.get(this.compress(id, data));
        return mapping != null ? mapping : (MappedLegacyBlockItem)this.itemReplacements.get(this.compress(id, -1));
    }

    private void addMappings(MappedLegacyBlockItem.Type type, JsonObject object, Int2ObjectMap<MappedLegacyBlockItem> mappings) {
        if (object.has(type.getName())) {
            JsonObject mappingsObject = object.getAsJsonObject(type.getName());
            for (Map.Entry dataEntry : mappingsObject.entrySet()) {
                this.addMapping((String)dataEntry.getKey(), ((JsonElement)dataEntry.getValue()).getAsJsonObject(), type, mappings);
            }
        }
    }

    protected JsonObject readMappingsFile(String name) {
        return BackwardsMappingDataLoader.INSTANCE.loadFromDataDir(name);
    }

    public void registerBlockChange(C packetType) {
        ((BackwardsProtocol)this.protocol).registerClientbound((ClientboundPacketType)packetType, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int idx = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    wrapper.set((Type)Types.VAR_INT, 0, (Object)LegacyBlockItemRewriter.this.handleBlockId(idx));
                });
            }
        });
    }

    public void registerMultiBlockChange(C packetType) {
        ((BackwardsProtocol)this.protocol).registerClientbound((ClientboundPacketType)packetType, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_CHANGE_ARRAY);
                this.handler(wrapper -> {
                    for (BlockChangeRecord record : (BlockChangeRecord[])wrapper.get(Types.BLOCK_CHANGE_ARRAY, 0)) {
                        record.setBlockId(LegacyBlockItemRewriter.this.handleBlockId(record.getBlockId()));
                    }
                });
            }
        });
    }

    public PacketHandler getFallingBlockHandler() {
        return wrapper -> {
            int objectData = (Integer)wrapper.get((Type)Types.INT, 0);
            EntityTypes1_12.ObjectType type = EntityTypes1_12.ObjectType.findById((int)((Byte)wrapper.get((Type)Types.BYTE, 0)).byteValue(), (int)objectData);
            if (type == EntityTypes1_12.ObjectType.FALLING_BLOCK) {
                IdAndData block = this.handleBlock(objectData & 0xFFF, objectData >> 12 & 0xF);
                if (block == null) {
                    return;
                }
                wrapper.set((Type)Types.INT, 0, (Object)(block.getId() | block.getData() << 12));
            }
        };
    }
}

