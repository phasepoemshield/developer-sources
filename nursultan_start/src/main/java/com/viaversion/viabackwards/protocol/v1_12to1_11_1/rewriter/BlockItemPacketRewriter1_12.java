/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.LongArrayTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.LegacyBlockItemRewriter
 *  com.viaversion.viabackwards.protocol.v1_12to1_11_1.data.MapColorMappings1_11_1
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ClientboundPackets1_12
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ServerboundPackets1_12
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.SerializerVersion
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_12to1_11_1.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.LongArrayTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.LegacyBlockItemRewriter;
import com.viaversion.viabackwards.protocol.v1_12to1_11_1.Protocol1_12To1_11_1;
import com.viaversion.viabackwards.protocol.v1_12to1_11_1.data.MapColorMappings1_11_1;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ClientboundPackets1_12;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ServerboundPackets1_12;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.SerializerVersion;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

public class BlockItemPacketRewriter1_12
extends LegacyBlockItemRewriter<ClientboundPackets1_12, ServerboundPackets1_9_3, Protocol1_12To1_11_1> {
    public BlockItemPacketRewriter1_12(Protocol1_12To1_11_1 protocol) {
        super((BackwardsProtocol)protocol, "1.12");
    }

    public @Nullable Item handleItemToClient(UserConnection connection, Item item) {
        if (item == null) {
            return null;
        }
        super.handleItemToClient(connection, item);
        if (item.tag() != null) {
            CompoundTag backupTag = new CompoundTag();
            if (this.handleNbtToClient(item.tag(), backupTag)) {
                item.tag().put("Via|LongArrayTags", (Tag)backupTag);
            }
        }
        return item;
    }

    public @Nullable Item handleItemToServer(UserConnection connection, Item item) {
        Tag tag;
        if (item == null) {
            return null;
        }
        if ((item = super.handleItemToServer(connection, item)).tag() != null && (tag = item.tag().remove("Via|LongArrayTags")) instanceof CompoundTag) {
            CompoundTag tag2 = (CompoundTag)tag;
            this.handleNbtToServer(item.tag(), tag2);
        }
        return item;
    }

    protected void registerPackets() {
        this.registerBlockChange((ClientboundPacketType)ClientboundPackets1_12.BLOCK_UPDATE);
        this.registerMultiBlockChange((ClientboundPacketType)ClientboundPackets1_12.CHUNK_BLOCKS_UPDATE);
        ((Protocol1_12To1_11_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_12.MAP_ITEM_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    int count = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                    for (int i = 0; i < count * 3; ++i) {
                        wrapper.passthrough((Type)Types.BYTE);
                    }
                });
                this.handler(wrapper -> {
                    short columns = (Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
                    if (columns <= 0) {
                        return;
                    }
                    wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
                    wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
                    wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
                    byte[] data = (byte[])wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                    for (int i = 0; i < data.length; ++i) {
                        short color = (short)(data[i] & 0xFF);
                        if (color <= 143) continue;
                        color = (short)MapColorMappings1_11_1.getNearestOldColor((int)color);
                        data[i] = (byte)color;
                    }
                    wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)data);
                });
            }
        });
        this.registerSetSlot((ClientboundPacketType)ClientboundPackets1_12.CONTAINER_SET_SLOT);
        this.registerSetContent((ClientboundPacketType)ClientboundPackets1_12.CONTAINER_SET_CONTENT);
        this.registerSetEquippedItem((ClientboundPacketType)ClientboundPackets1_12.SET_EQUIPPED_ITEM);
        this.registerCustomPayloadTradeList((ClientboundPacketType)ClientboundPackets1_12.CUSTOM_PAYLOAD);
        ((Protocol1_12To1_11_1)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_9_3.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.VAR_INT);
                this.map(Types.ITEM1_8);
                this.handler(wrapper -> {
                    if ((Integer)wrapper.get((Type)Types.VAR_INT, 0) == 1) {
                        wrapper.set(Types.ITEM1_8, 0, null);
                        PacketWrapper confirm = wrapper.create((PacketType)ServerboundPackets1_12.CONTAINER_ACK);
                        confirm.write((Type)Types.BYTE, (Object)((Byte)wrapper.get((Type)Types.BYTE, 0)));
                        confirm.write((Type)Types.SHORT, (Object)((Short)wrapper.get((Type)Types.SHORT, 1)));
                        confirm.write((Type)Types.BOOLEAN, (Object)true);
                        wrapper.sendToServer(Protocol1_12To1_11_1.class);
                        wrapper.cancel();
                        confirm.sendToServer(Protocol1_12To1_11_1.class);
                        return;
                    }
                    Item item = (Item)wrapper.get(Types.ITEM1_8, 0);
                    BlockItemPacketRewriter1_12.this.handleItemToServer(wrapper.user(), item);
                });
            }
        });
        this.registerSetCreativeModeSlot((ServerboundPacketType)ServerboundPackets1_9_3.SET_CREATIVE_MODE_SLOT);
        ((Protocol1_12To1_11_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_12.LEVEL_CHUNK, wrapper -> {
            ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_12To1_11_1.class);
            ChunkType1_9_3 type = ChunkType1_9_3.forEnvironment((Environment)clientWorld.getEnvironment());
            Chunk chunk = (Chunk)wrapper.passthrough((Type)type);
            this.handleChunk(chunk);
            for (CompoundTag tag : chunk.getBlockEntities()) {
                String id = tag.getString("id");
                if (id == null || !Key.stripMinecraftNamespace((String)id).equals("sign")) continue;
                this.handleSignText(tag);
            }
        });
        ((Protocol1_12To1_11_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_12.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.handler(wrapper -> {
                    short type = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    if (type == 9) {
                        CompoundTag tag = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                        BlockItemPacketRewriter1_12.this.handleSignText(tag);
                    } else if (type == 11) {
                        wrapper.cancel();
                    }
                });
            }
        });
        ((Protocol1_12To1_11_1)this.protocol).getEntityRewriter().filter().handler((event, data) -> {
            if (data.dataType().type().equals(Types.ITEM1_8)) {
                data.setValue((Object)this.handleItemToClient(event.user(), (Item)data.getValue()));
            }
        });
        ((Protocol1_12To1_11_1)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_9_3.CLIENT_COMMAND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    if ((Integer)wrapper.get((Type)Types.VAR_INT, 0) == 2) {
                        wrapper.cancel();
                    }
                });
            }
        });
    }

    private IntArrayTag fromLongArrayTag(LongArrayTag tag) {
        int[] intArray = new int[tag.length() * 2];
        long[] longArray = tag.getValue();
        int i = 0;
        for (long l : longArray) {
            intArray[i++] = (int)(l >> 32);
            intArray[i++] = (int)l;
        }
        return new IntArrayTag(intArray);
    }

    private void handleNbtToServer(CompoundTag compoundTag, CompoundTag backupTag) {
        for (Map.Entry entry : backupTag) {
            if (entry.getValue() instanceof CompoundTag) {
                CompoundTag nestedTag = compoundTag.getCompoundTag((String)entry.getKey());
                this.handleNbtToServer(nestedTag, (CompoundTag)entry.getValue());
                continue;
            }
            compoundTag.put((String)entry.getKey(), (Tag)this.fromIntArrayTag((IntArrayTag)entry.getValue()));
        }
    }

    private LongArrayTag fromIntArrayTag(IntArrayTag tag) {
        long[] longArray = new long[tag.length() / 2];
        int[] intArray = tag.getValue();
        int i = 0;
        int j = 0;
        while (i < intArray.length) {
            longArray[j] = (long)intArray[i] << 32 | (long)intArray[i + 1] & 0xFFFFFFFFL;
            i += 2;
            ++j;
        }
        return new LongArrayTag(longArray);
    }

    private void handleSignText(CompoundTag tag) {
        for (int i = 0; i < 4; ++i) {
            StringTag lineTag = tag.getStringTag("Text" + (i + 1));
            if (lineTag == null) continue;
            lineTag.setValue(ComponentUtil.convertJsonOrEmpty((String)lineTag.getValue(), (SerializerVersion)SerializerVersion.V1_12, (SerializerVersion)SerializerVersion.V1_9).toString());
        }
    }

    private boolean handleNbtToClient(CompoundTag compoundTag, CompoundTag backupTag) {
        Iterator iterator = compoundTag.iterator();
        boolean hasLongArrayTag = false;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Object v = entry.getValue();
            if (v instanceof CompoundTag) {
                CompoundTag tag = (CompoundTag)v;
                CompoundTag nestedBackupTag = new CompoundTag();
                backupTag.put((String)entry.getKey(), (Tag)nestedBackupTag);
                hasLongArrayTag |= this.handleNbtToClient(tag, nestedBackupTag);
                continue;
            }
            v = entry.getValue();
            if (!(v instanceof LongArrayTag)) continue;
            LongArrayTag tag = (LongArrayTag)v;
            backupTag.put((String)entry.getKey(), (Tag)this.fromLongArrayTag(tag));
            iterator.remove();
            hasLongArrayTag = true;
        }
        return hasLongArrayTag;
    }
}

