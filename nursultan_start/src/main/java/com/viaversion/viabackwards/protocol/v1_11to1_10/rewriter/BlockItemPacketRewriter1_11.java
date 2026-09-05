/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.MappedLegacyBlockItem
 *  com.viaversion.viabackwards.api.rewriters.LegacyBlockItemRewriter
 *  com.viaversion.viabackwards.api.rewriters.LegacyEnchantmentRewriter
 *  com.viaversion.viabackwards.protocol.v1_11to1_10.storage.ChestedHorseStorage
 *  com.viaversion.viabackwards.protocol.v1_11to1_10.storage.WindowTracker
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.data.entity.StoredEntityData
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11$EntityType
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_10to1_11.data.EntityMappings1_11
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 *  com.viaversion.viaversion.util.IdAndData
 */
package com.viaversion.viabackwards.protocol.v1_11to1_10.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.MappedLegacyBlockItem;
import com.viaversion.viabackwards.api.rewriters.LegacyBlockItemRewriter;
import com.viaversion.viabackwards.api.rewriters.LegacyEnchantmentRewriter;
import com.viaversion.viabackwards.protocol.v1_11to1_10.Protocol1_11To1_10;
import com.viaversion.viabackwards.protocol.v1_11to1_10.storage.ChestedHorseStorage;
import com.viaversion.viabackwards.protocol.v1_11to1_10.storage.WindowTracker;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.entity.StoredEntityData;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_10to1_11.data.EntityMappings1_11;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import com.viaversion.viaversion.util.IdAndData;
import java.util.Arrays;
import java.util.Optional;

public class BlockItemPacketRewriter1_11
extends LegacyBlockItemRewriter<ClientboundPackets1_9_3, ServerboundPackets1_9_3, Protocol1_11To1_10> {
    private LegacyEnchantmentRewriter enchantmentRewriter;

    public BlockItemPacketRewriter1_11(Protocol1_11To1_10 protocol) {
        super((BackwardsProtocol)protocol, "1.11");
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        if (item == null) {
            return null;
        }
        super.handleItemToClient(connection, item);
        CompoundTag tag = item.tag();
        if (tag == null) {
            return item;
        }
        EntityMappings1_11.toClientItem((Item)item, (boolean)true);
        this.enchantmentRewriter.handleToClient(item);
        return item;
    }

    protected void registerRewrites() {
        MappedLegacyBlockItem data = (MappedLegacyBlockItem)this.itemReplacements.computeIfAbsent(IdAndData.toRawData((int)52), s -> new MappedLegacyBlockItem(52));
        data.setBlockEntityHandler((b, tag) -> EntityMappings1_11.toClientSpawner((CompoundTag)tag, (boolean)true));
        this.enchantmentRewriter = new LegacyEnchantmentRewriter(this.nbtTagName());
        this.enchantmentRewriter.registerEnchantment(71, "\u00a7cCurse of Vanishing");
        this.enchantmentRewriter.registerEnchantment(10, "\u00a7cCurse of Binding");
        this.enchantmentRewriter.setHideLevelForEnchants(new int[]{71, 10});
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        if (item == null) {
            return null;
        }
        CompoundTag tag = (item = super.handleItemToServer(connection, item)).tag();
        if (tag == null) {
            return item;
        }
        EntityMappings1_11.toServerItem((Item)item, (boolean)true);
        this.enchantmentRewriter.handleToServer(item);
        return item;
    }

    protected void registerPackets() {
        this.registerBlockChange((ClientboundPacketType)ClientboundPackets1_9_3.BLOCK_UPDATE);
        this.registerMultiBlockChange((ClientboundPacketType)ClientboundPackets1_9_3.CHUNK_BLOCKS_UPDATE);
        ((Protocol1_11To1_10)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.CONTAINER_SET_SLOT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map(Types.ITEM1_8);
                this.handler(wrapper -> BlockItemPacketRewriter1_11.this.handleItemToClient(wrapper.user(), (Item)wrapper.get(Types.ITEM1_8, 0)));
                this.handler(wrapper -> {
                    if (BlockItemPacketRewriter1_11.this.isLlama(wrapper.user())) {
                        Optional<ChestedHorseStorage> horse = BlockItemPacketRewriter1_11.this.getChestedHorse(wrapper.user());
                        if (horse.isEmpty()) {
                            return;
                        }
                        ChestedHorseStorage storage = horse.get();
                        int currentSlot = ((Short)wrapper.get((Type)Types.SHORT, 0)).shortValue();
                        currentSlot = BlockItemPacketRewriter1_11.this.getNewSlotId(storage, currentSlot);
                        wrapper.set((Type)Types.SHORT, 0, (Object)Integer.valueOf(currentSlot).shortValue());
                        wrapper.set(Types.ITEM1_8, 0, (Object)BlockItemPacketRewriter1_11.this.getNewItem(storage, currentSlot, (Item)wrapper.get(Types.ITEM1_8, 0)));
                    }
                });
            }
        });
        ((Protocol1_11To1_10)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.CONTAINER_SET_CONTENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.ITEM1_8_SHORT_ARRAY);
                this.handler(wrapper -> {
                    Item[] stacks = (Item[])wrapper.get(Types.ITEM1_8_SHORT_ARRAY, 0);
                    for (int i = 0; i < stacks.length; ++i) {
                        stacks[i] = BlockItemPacketRewriter1_11.this.handleItemToClient(wrapper.user(), stacks[i]);
                    }
                    if (BlockItemPacketRewriter1_11.this.isLlama(wrapper.user())) {
                        Optional<ChestedHorseStorage> horse = BlockItemPacketRewriter1_11.this.getChestedHorse(wrapper.user());
                        if (horse.isEmpty()) {
                            return;
                        }
                        ChestedHorseStorage storage = horse.get();
                        stacks = Arrays.copyOf(stacks, !storage.isChested() ? 38 : 53);
                        for (int i = stacks.length - 1; i >= 0; --i) {
                            stacks[BlockItemPacketRewriter1_11.this.getNewSlotId((ChestedHorseStorage)storage, (int)i)] = stacks[i];
                            stacks[i] = BlockItemPacketRewriter1_11.this.getNewItem(storage, i, stacks[i]);
                        }
                        wrapper.set(Types.ITEM1_8_SHORT_ARRAY, 0, (Object)stacks);
                    }
                });
            }
        });
        this.registerSetEquippedItem((ClientboundPacketType)ClientboundPackets1_9_3.SET_EQUIPPED_ITEM);
        this.registerCustomPayloadTradeList((ClientboundPacketType)ClientboundPackets1_9_3.CUSTOM_PAYLOAD);
        ((Protocol1_11To1_10)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_9_3.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.VAR_INT);
                this.map(Types.ITEM1_8);
                this.handler(wrapper -> BlockItemPacketRewriter1_11.this.handleItemToServer(wrapper.user(), (Item)wrapper.get(Types.ITEM1_8, 0)));
                this.handler(wrapper -> {
                    if (BlockItemPacketRewriter1_11.this.isLlama(wrapper.user())) {
                        Optional<ChestedHorseStorage> horse = BlockItemPacketRewriter1_11.this.getChestedHorse(wrapper.user());
                        if (horse.isEmpty()) {
                            return;
                        }
                        ChestedHorseStorage storage = horse.get();
                        short clickSlot = (Short)wrapper.get((Type)Types.SHORT, 0);
                        int correctSlot = BlockItemPacketRewriter1_11.this.getOldSlotId(storage, clickSlot);
                        wrapper.set((Type)Types.SHORT, 0, (Object)Integer.valueOf(correctSlot).shortValue());
                    }
                });
            }
        });
        this.registerSetCreativeModeSlot((ServerboundPacketType)ServerboundPackets1_9_3.SET_CREATIVE_MODE_SLOT);
        ((Protocol1_11To1_10)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.LEVEL_CHUNK, wrapper -> {
            ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_11To1_10.class);
            ChunkType1_9_3 type = ChunkType1_9_3.forEnvironment((Environment)clientWorld.getEnvironment());
            Chunk chunk = (Chunk)wrapper.passthrough((Type)type);
            this.handleChunk(chunk);
            for (CompoundTag tag : chunk.getBlockEntities()) {
                String id;
                StringTag idTag = tag.getStringTag("id");
                if (idTag == null || !(id = idTag.getValue()).equals("minecraft:sign")) continue;
                idTag.setValue("Sign");
            }
        });
        ((Protocol1_11To1_10)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.handler(wrapper -> {
                    if ((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0) == 10) {
                        wrapper.cancel();
                    }
                    if ((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0) == 1) {
                        CompoundTag tag = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                        EntityMappings1_11.toClientSpawner((CompoundTag)tag, (boolean)true);
                    }
                });
            }
        });
        ((Protocol1_11To1_10)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.OPEN_SCREEN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.STRING);
                this.map(Types.COMPONENT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    int entityId = -1;
                    if (((String)wrapper.get(Types.STRING, 0)).equals("EntityHorse")) {
                        entityId = (Integer)wrapper.passthrough((Type)Types.INT);
                    }
                    ((Protocol1_11To1_10)BlockItemPacketRewriter1_11.this.protocol).getComponentRewriter().processText(wrapper.user(), (JsonElement)wrapper.get(Types.COMPONENT, 0));
                    String inventory = (String)wrapper.get(Types.STRING, 0);
                    WindowTracker windowTracker = (WindowTracker)wrapper.user().get(WindowTracker.class);
                    windowTracker.setInventory(inventory);
                    windowTracker.setEntityId(entityId);
                    if (BlockItemPacketRewriter1_11.this.isLlama(wrapper.user())) {
                        wrapper.set((Type)Types.UNSIGNED_BYTE, 1, (Object)17);
                    }
                });
            }
        });
        ((Protocol1_11To1_10)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.CONTAINER_CLOSE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    WindowTracker windowTracker = (WindowTracker)wrapper.user().get(WindowTracker.class);
                    windowTracker.setInventory(null);
                    windowTracker.setEntityId(-1);
                });
            }
        });
        ((Protocol1_11To1_10)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_9_3.CONTAINER_CLOSE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    WindowTracker windowTracker = (WindowTracker)wrapper.user().get(WindowTracker.class);
                    windowTracker.setInventory(null);
                    windowTracker.setEntityId(-1);
                });
            }
        });
        ((Protocol1_11To1_10)this.protocol).getEntityRewriter().filter().handler((event, data) -> {
            if (data.dataType().type().equals(Types.ITEM1_8)) {
                data.setValue((Object)this.handleItemToClient(event.user(), (Item)data.getValue()));
            }
        });
    }

    private int getNewSlotId(ChestedHorseStorage storage, int slotId) {
        int totalSlots = !storage.isChested() ? 38 : 53;
        int strength = storage.isChested() ? storage.getLiamaStrength() : 0;
        int startNonExistingFormula = 2 + 3 * strength;
        int offsetForm = 15 - 3 * strength;
        if (slotId >= startNonExistingFormula && totalSlots > slotId + offsetForm) {
            return offsetForm + slotId;
        }
        if (slotId == 1) {
            return 0;
        }
        return slotId;
    }

    private Optional<ChestedHorseStorage> getChestedHorse(UserConnection user) {
        EntityTracker entTracker;
        StoredEntityData entityData;
        WindowTracker tracker = (WindowTracker)user.get(WindowTracker.class);
        if (tracker.getInventory() != null && tracker.getInventory().equals("EntityHorse") && (entityData = (entTracker = user.getEntityTracker(Protocol1_11To1_10.class)).entityData(tracker.getEntityId())) != null) {
            return Optional.of((ChestedHorseStorage)entityData.get(ChestedHorseStorage.class));
        }
        return Optional.empty();
    }

    private int getOldSlotId(ChestedHorseStorage storage, int slotId) {
        int strength = storage.isChested() ? storage.getLiamaStrength() : 0;
        int startNonExistingFormula = 2 + 3 * strength;
        int endNonExistingFormula = 2 + 3 * (storage.isChested() ? 5 : 0);
        int offsetForm = endNonExistingFormula - startNonExistingFormula;
        if (slotId == 1 || slotId >= startNonExistingFormula && slotId < endNonExistingFormula) {
            return 0;
        }
        if (slotId >= endNonExistingFormula) {
            return slotId - offsetForm;
        }
        if (slotId == 0) {
            return 1;
        }
        return slotId;
    }

    private boolean isLlama(UserConnection user) {
        WindowTracker tracker = (WindowTracker)user.get(WindowTracker.class);
        if (tracker.getInventory() != null && tracker.getInventory().equals("EntityHorse")) {
            EntityTracker entTracker = user.getEntityTracker(Protocol1_11To1_10.class);
            StoredEntityData entityData = entTracker.entityData(tracker.getEntityId());
            return entityData != null && entityData.type().is((EntityType)EntityTypes1_11.EntityType.LLAMA);
        }
        return false;
    }

    private Item getNewItem(ChestedHorseStorage storage, int slotId, Item current) {
        int strength = storage.isChested() ? storage.getLiamaStrength() : 0;
        int startNonExistingFormula = 2 + 3 * strength;
        int endNonExistingFormula = 2 + 3 * (storage.isChested() ? 5 : 0);
        if (slotId >= startNonExistingFormula && slotId < endNonExistingFormula) {
            return new DataItem(166, 1, 0, this.getNamedTag("\u00a74SLOT DISABLED"));
        }
        if (slotId == 1) {
            return null;
        }
        return current;
    }
}

