/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.FloatTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.storage.CurrentContainer
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.minecraft.item.data.ItemModel
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Limit
 */
package com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.rewriter;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.FloatTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaaprilfools.api.minecraft.item.ItemExchangeValue;
import com.viaversion.viaaprilfools.api.minecraft.item.LodestoneTracker25w14craftmine;
import com.viaversion.viaaprilfools.api.minecraft.item.MobTrophyInfo;
import com.viaversion.viaaprilfools.api.minecraft.item.RoomerinoComponentino;
import com.viaversion.viaaprilfools.api.minecraft.item.StructuredDataKeys25w14craftmine;
import com.viaversion.viaaprilfools.api.minecraft.item.WorldModifiers;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.Protocol25w14craftmineTo1_21_5;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.storage.CurrentContainer;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundPacket25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundPackets25w14craftmine;
import com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.minecraft.item.data.ItemModel;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Limit;

public final class BlockItemPacketRewriter25w14craftmine
extends BackwardsStructuredItemRewriter<ClientboundPacket25w14craftmine, ServerboundPacket1_21_5, Protocol25w14craftmineTo1_21_5> {
    static final int INVENTORY_ROW_WIDTH = 9;
    static final int SECOND_ROW_END = 18;
    static final int GENERIC_9X6_SIZE = 54;
    static final int TO_UNLOCK_EFFECTS_START = 51;
    static final int TO_DISCOVER_EFFECTS_START = 159;
    static final int SUPER_CHARGE_LEVEL = 4;

    public BlockItemPacketRewriter25w14craftmine(Protocol25w14craftmineTo1_21_5 protocol) {
        super(protocol);
    }

    @Override
    protected void backupInconvertibleData(UserConnection connection, Item item, StructuredDataContainer dataContainer, CompoundTag backupTag) {
        MobTrophyInfo mobTrophyInfo;
        RoomerinoComponentino roomerinoComponentino;
        WorldModifiers worldModifiers;
        Boolean mineCompleted;
        ItemExchangeValue exchangeValue;
        LodestoneTracker25w14craftmine lodestoneTracker;
        super.backupInconvertibleData(connection, item, dataContainer, backupTag);
        this.rewriteWorldModifiers(connection, dataContainer);
        this.saveIntData(StructuredDataKeys25w14craftmine.SPECIAL_MINE, dataContainer, backupTag);
        this.saveIntData(StructuredDataKeys25w14craftmine.SKY, dataContainer, backupTag);
        this.saveStringData(StructuredDataKeys25w14craftmine.TROPHY_TYPE, dataContainer, backupTag);
        this.saveStringData(StructuredDataKeys25w14craftmine.DIMENSION_ID, dataContainer, backupTag);
        if (dataContainer.has(StructuredDataKeys25w14craftmine.WORLD_EFFECT_UNLOCK)) {
            backupTag.putBoolean("world_effect_unlock", true);
        }
        if (dataContainer.has(StructuredDataKeys25w14craftmine.WORLD_EFFECT_HINT)) {
            backupTag.putBoolean("world_effect_hint", true);
        }
        if (dataContainer.has(StructuredDataKeys25w14craftmine.MINE_ACTIVE)) {
            backupTag.putBoolean("mine_active", true);
        }
        if ((lodestoneTracker = (LodestoneTracker25w14craftmine)((Object)dataContainer.get(StructuredDataKeys25w14craftmine.LODESTONE_TRACKER))) != null) {
            backupTag.putBoolean("lodestone_tracker|exits", lodestoneTracker.exits());
        }
        if ((exchangeValue = (ItemExchangeValue)((Object)dataContainer.get(StructuredDataKeys25w14craftmine.ITEM_EXCHANGE_VALUE))) != null) {
            backupTag.putFloat("item_exchange_value", exchangeValue.value());
        }
        if ((mineCompleted = (Boolean)dataContainer.get(StructuredDataKeys25w14craftmine.MINE_COMPLETED)) != null) {
            backupTag.putBoolean("mine_completed", mineCompleted.booleanValue());
        }
        if ((worldModifiers = (WorldModifiers)((Object)dataContainer.get(StructuredDataKeys25w14craftmine.WORLD_MODIFIERS))) != null) {
            CompoundTag worldModifiersTag = new CompoundTag();
            worldModifiersTag.put("effects", (Tag)new IntArrayTag(worldModifiers.effects()));
            worldModifiersTag.putBoolean("include_description", worldModifiers.includeDescription());
            backupTag.put("world_modifiers", (Tag)worldModifiersTag);
        }
        if ((roomerinoComponentino = (RoomerinoComponentino)((Object)dataContainer.get(StructuredDataKeys25w14craftmine.ROOM))) != null) {
            backupTag.putString("room", roomerinoComponentino.id());
        }
        if ((mobTrophyInfo = (MobTrophyInfo)((Object)dataContainer.get(StructuredDataKeys25w14craftmine.MOB_TROPHY_TYPE))) != null) {
            CompoundTag mobTrophyInfoTag = new CompoundTag();
            mobTrophyInfoTag.put("type", this.holderToTag(mobTrophyInfo.type(), (s, tag) -> tag.putString("id", s)));
            mobTrophyInfoTag.putBoolean("shiny", mobTrophyInfo.shiny());
            backupTag.put("mob_trophy/type", (Tag)mobTrophyInfoTag);
        }
        if (!backupTag.isEmpty()) {
            this.saveTag(this.createCustomTag(item), (Tag)backupTag, "backup");
        }
    }

    protected void handleItemDataComponentsToServer(UserConnection connection, Item item, StructuredDataContainer container) {
        super.handleItemDataComponentsToServer(connection, item, container);
        com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.BlockItemPacketRewriter25w14craftmine.upgradeItemData(item, container);
    }

    protected void handleItemDataComponentsToClient(UserConnection connection, Item item, StructuredDataContainer container) {
        super.handleItemDataComponentsToClient(connection, item, container);
        com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.BlockItemPacketRewriter25w14craftmine.downgradeItemData(item, container);
    }

    @Override
    protected void restoreBackupData(Item item, StructuredDataContainer container, CompoundTag customData) {
        CompoundTag mobTrophyInfoTag;
        StringTag roomerinoComponentinoTag;
        IntArrayTag effectsTag;
        CompoundTag worldModifiersTag;
        ByteTag mineCompletedTag;
        super.restoreBackupData(item, container, customData);
        Tag tag = customData.remove(this.nbtTagName("backup"));
        if (!(tag instanceof CompoundTag)) {
            return;
        }
        CompoundTag backupTag = (CompoundTag)tag;
        this.restoreIntData(StructuredDataKeys25w14craftmine.SPECIAL_MINE, container, customData);
        this.restoreIntData(StructuredDataKeys25w14craftmine.SKY, container, customData);
        this.restoreStringData(StructuredDataKeys25w14craftmine.TROPHY_TYPE, container, customData);
        this.restoreStringData(StructuredDataKeys25w14craftmine.DIMENSION_ID, container, customData);
        if (backupTag.getBoolean("world_effect_unlock")) {
            container.set(StructuredDataKeys25w14craftmine.WORLD_EFFECT_UNLOCK);
        }
        if (backupTag.getBoolean("world_effect_hint")) {
            container.set(StructuredDataKeys25w14craftmine.WORLD_EFFECT_HINT);
        }
        if (backupTag.getBoolean("mine_active")) {
            container.set(StructuredDataKeys25w14craftmine.MINE_ACTIVE);
        }
        boolean lodestoneTrackerExits = backupTag.getBoolean("lodestone_tracker|exits");
        container.replace(StructuredDataKey.LODESTONE_TRACKER, StructuredDataKeys25w14craftmine.LODESTONE_TRACKER, tracker -> new LodestoneTracker25w14craftmine(tracker.position(), tracker.tracked(), lodestoneTrackerExits));
        FloatTag itemExchangeValueTag = backupTag.getFloatTag("item_exchange_value");
        if (itemExchangeValueTag != null) {
            container.set(StructuredDataKeys25w14craftmine.ITEM_EXCHANGE_VALUE, (Object)new ItemExchangeValue(itemExchangeValueTag.asFloat()));
        }
        if ((mineCompletedTag = backupTag.getByteTag("mine_completed")) != null) {
            container.set(StructuredDataKeys25w14craftmine.MINE_COMPLETED, (Object)mineCompletedTag.asBoolean());
        }
        if ((worldModifiersTag = backupTag.getCompoundTag("world_modifiers")) != null && (effectsTag = worldModifiersTag.getIntArrayTag("effects")) != null) {
            int[] effects = effectsTag.getValue();
            boolean includeDescription = worldModifiersTag.getBoolean("include_description");
            container.set(StructuredDataKeys25w14craftmine.WORLD_MODIFIERS, (Object)new WorldModifiers(effects, includeDescription));
        }
        if ((roomerinoComponentinoTag = backupTag.getStringTag("room")) != null) {
            container.set(StructuredDataKeys25w14craftmine.ROOM, (Object)new RoomerinoComponentino(roomerinoComponentinoTag.getValue()));
        }
        if ((mobTrophyInfoTag = backupTag.getCompoundTag("mob_trophy/type")) != null) {
            Holder<String> type = this.restoreHolder(mobTrophyInfoTag, "tag", s -> s.getString("id"));
            boolean shiny = mobTrophyInfoTag.getBoolean("shiny");
            container.set(StructuredDataKeys25w14craftmine.MOB_TROPHY_TYPE, (Object)new MobTrophyInfo(type, shiny));
        }
        this.removeCustomTag(container, customData);
    }

    public void registerPackets() {
        BlockRewriter blockRewriter = BlockRewriter.for1_20_2((Protocol)this.protocol, ChunkType1_21_5::new);
        blockRewriter.registerBlockEvent((ClientboundPacketType)ClientboundPackets25w14craftmine.BLOCK_EVENT);
        blockRewriter.registerBlockUpdate((ClientboundPacketType)ClientboundPackets25w14craftmine.BLOCK_UPDATE);
        blockRewriter.registerSectionBlocksUpdate1_20((ClientboundPacketType)ClientboundPackets25w14craftmine.SECTION_BLOCKS_UPDATE);
        blockRewriter.registerLevelEvent1_21((ClientboundPacketType)ClientboundPackets25w14craftmine.LEVEL_EVENT);
        blockRewriter.registerLevelChunk1_18((ClientboundPacketType)ClientboundPackets25w14craftmine.LEVEL_CHUNK_WITH_LIGHT);
        blockRewriter.registerBlockEntityData1_18((ClientboundPacketType)ClientboundPackets25w14craftmine.BLOCK_ENTITY_DATA);
        ((Protocol25w14craftmineTo1_21_5)this.protocol).registerClientbound(ClientboundPackets25w14craftmine.SET_CURSOR_ITEM, x$0 -> this.passthroughClientboundItem(x$0));
        this.registerCooldown1_21_2(ClientboundPackets25w14craftmine.COOLDOWN);
        this.registerSetEquipment(ClientboundPackets25w14craftmine.SET_EQUIPMENT);
        this.registerMerchantOffers1_20_5(ClientboundPackets25w14craftmine.MERCHANT_OFFERS);
        RecipeDisplayRewriter1_21_5 recipeRewriter = new RecipeDisplayRewriter1_21_5(this.protocol);
        recipeRewriter.registerUpdateRecipes((ClientboundPacketType)ClientboundPackets25w14craftmine.UPDATE_RECIPES);
        recipeRewriter.registerRecipeBookAdd((ClientboundPacketType)ClientboundPackets25w14craftmine.RECIPE_BOOK_ADD);
        recipeRewriter.registerPlaceGhostRecipe((ClientboundPacketType)ClientboundPackets25w14craftmine.PLACE_GHOST_RECIPE);
        ((Protocol25w14craftmineTo1_21_5)this.protocol).registerClientbound(ClientboundPackets25w14craftmine.SET_PLAYER_INVENTORY, wrapper -> {
            int slot = (Integer)wrapper.read((Type)Types.VAR_INT);
            slot = com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.BlockItemPacketRewriter25w14craftmine.removeCraftingSlot(slot);
            wrapper.write((Type)Types.VAR_INT, (Object)slot);
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol25w14craftmineTo1_21_5)this.protocol).registerClientbound(ClientboundPackets25w14craftmine.CONTAINER_SET_CONTENT, wrapper -> {
            int containerId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            Item[] items = (Item[])wrapper.read(this.itemArrayType());
            for (int i = 0; i < items.length; ++i) {
                items[i] = this.handleItemToClient(wrapper.user(), items[i]);
            }
            CurrentContainer currentContainer = (CurrentContainer)wrapper.user().get(CurrentContainer.class);
            if (containerId == 0) {
                Item[] mappedItems = new Item[items.length - 5];
                for (int i = 0; i < items.length; ++i) {
                    mappedItems[com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.BlockItemPacketRewriter25w14craftmine.removeCraftingSlot((int)i)] = items[i];
                }
                wrapper.write(this.mappedItemArrayType(), (Object)mappedItems);
            } else if (currentContainer.isOpen(20, containerId)) {
                Item[] mappedItems = StructuredItem.emptyArray((int)54);
                for (int i = 0; i < items.length; ++i) {
                    int actualSlot = this.removeMapMakingContainerSlot(i);
                    if (actualSlot == -1) continue;
                    mappedItems[actualSlot] = items[i];
                }
                wrapper.write(this.mappedItemArrayType(), (Object)mappedItems);
            } else {
                wrapper.write(this.mappedItemArrayType(), (Object)items);
            }
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol25w14craftmineTo1_21_5)this.protocol).registerClientbound(ClientboundPackets25w14craftmine.CONTAINER_SET_SLOT, wrapper -> {
            CurrentContainer currentContainer = (CurrentContainer)wrapper.user().get(CurrentContainer.class);
            int containerId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            if (containerId == 0) {
                com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.BlockItemPacketRewriter25w14craftmine.removeCraftingSlots(wrapper);
            } else if (currentContainer.isOpen(20, containerId)) {
                this.removeMapMakingContainerSlots(wrapper);
            } else {
                wrapper.passthrough((Type)Types.SHORT);
            }
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol25w14craftmineTo1_21_5)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_5.SET_CREATIVE_MODE_SLOT, wrapper -> {
            if (!((Protocol25w14craftmineTo1_21_5)this.protocol).getEntityRewriter().tracker(wrapper.user()).canInstaBuild()) {
                wrapper.cancel();
                return;
            }
            com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.BlockItemPacketRewriter25w14craftmine.addCraftingSlots(wrapper);
            this.passthroughLengthPrefixedItem(wrapper);
        });
        ((Protocol25w14craftmineTo1_21_5)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_5.CONTAINER_CLICK, wrapper -> {
            CurrentContainer currentContainer = (CurrentContainer)wrapper.user().get(CurrentContainer.class);
            int containerId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            if (containerId == 0) {
                com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.BlockItemPacketRewriter25w14craftmine.addCraftingSlots(wrapper);
            } else if (currentContainer.isOpen(20, containerId)) {
                this.addMapMakingContainerSlots(wrapper);
            } else {
                wrapper.passthrough((Type)Types.SHORT);
            }
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            int affectedItems = Limit.max((int)((Integer)wrapper.passthrough((Type)Types.VAR_INT)), (int)128);
            for (int i = 0; i < affectedItems; ++i) {
                if (containerId == 0) {
                    com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.BlockItemPacketRewriter25w14craftmine.addCraftingSlots(wrapper);
                } else if (currentContainer.isOpen(20, containerId)) {
                    this.addMapMakingContainerSlots(wrapper);
                } else {
                    wrapper.passthrough((Type)Types.SHORT);
                }
                this.passthroughHashedItem(wrapper);
            }
            this.passthroughHashedItem(wrapper);
        });
        ((Protocol25w14craftmineTo1_21_5)this.protocol).registerClientbound(ClientboundPackets25w14craftmine.CONTAINER_SET_DATA, wrapper -> {
            int containerId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            short property = (Short)wrapper.passthrough((Type)Types.SHORT);
            CurrentContainer currentContainer = (CurrentContainer)wrapper.user().get(CurrentContainer.class);
            if ((currentContainer.isOpen(14, containerId) || currentContainer.isOpen(10, containerId)) && property == 4) {
                wrapper.cancel();
            }
        });
        ((Protocol25w14craftmineTo1_21_5)this.protocol).registerClientbound(ClientboundPackets25w14craftmine.UPDATE_ADVANCEMENTS, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    Tag title = (Tag)wrapper.passthrough(Types.TAG);
                    Tag description = (Tag)wrapper.passthrough(Types.TAG);
                    ((Protocol25w14craftmineTo1_21_5)this.protocol).getComponentRewriter().processTag(wrapper.user(), title);
                    ((Protocol25w14craftmineTo1_21_5)this.protocol).getComponentRewriter().processTag(wrapper.user(), description);
                    wrapper.read(Types.TAG);
                    this.passthroughClientboundItem(wrapper);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    int flags = (Integer)wrapper.passthrough((Type)Types.INT);
                    if ((flags & 1) != 0) {
                        wrapper.passthrough(Types.STRING);
                    }
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.FLOAT);
                }
                int requirements = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int array = 0; array < requirements; ++array) {
                    wrapper.passthrough(Types.STRING_ARRAY);
                }
                wrapper.passthrough((Type)Types.BOOLEAN);
            }
        });
        this.registerOpenScreen(ClientboundPackets25w14craftmine.OPEN_SCREEN);
        ((Protocol25w14craftmineTo1_21_5)this.protocol).appendClientbound(ClientboundPackets25w14craftmine.OPEN_SCREEN, wrapper -> {
            int containerId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
            int containerTypeId = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
            CurrentContainer currentContainer = (CurrentContainer)wrapper.user().get(CurrentContainer.class);
            currentContainer.openContainer(containerId, containerTypeId);
            int size = (Integer)wrapper.read((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.read((Type)Types.INT);
            }
        });
        ((Protocol25w14craftmineTo1_21_5)this.protocol).cancelClientbound(ClientboundPackets25w14craftmine.UPDATE_SCREEN);
    }

    private void addMapMakingContainerSlots(PacketWrapper wrapper) {
        short slot = (Short)wrapper.read((Type)Types.SHORT);
        slot = (short)this.addMapMakingContainerSlot(slot);
        wrapper.write((Type)Types.SHORT, (Object)slot);
    }

    private void rewriteWorldModifiers(UserConnection connection, StructuredDataContainer dataContainer) {
        WorldModifiers worldModifiers = (WorldModifiers)((Object)dataContainer.get(StructuredDataKeys25w14craftmine.WORLD_MODIFIERS));
        if (worldModifiers == null) {
            return;
        }
        for (int effect : worldModifiers.effects()) {
            String itemModel;
            CompoundTag effectData = ((Protocol25w14craftmineTo1_21_5)this.protocol).getMappingData().getWorldEffect(effect);
            if (effectData == null || (itemModel = effectData.getString("item_model")) == null) continue;
            Tag name = effectData.get("name");
            Tag description = effectData.get("description");
            ((Protocol25w14craftmineTo1_21_5)this.protocol).getComponentRewriter().processTag(connection, name);
            ((Protocol25w14craftmineTo1_21_5)this.protocol).getComponentRewriter().processTag(connection, description);
            dataContainer.set(StructuredDataKey.CUSTOM_NAME, (Object)name);
            dataContainer.set(StructuredDataKey.LORE, (Object)new Tag[]{description});
            dataContainer.set(StructuredDataKey.ITEM_MODEL, (Object)new ItemModel(Key.of((String)itemModel)));
            break;
        }
    }

    private int addMapMakingContainerSlot(int slot) {
        if (slot == 8) {
            return 0;
        }
        if (slot < 9) {
            return slot + 1;
        }
        if (slot >= 18 && slot < 54) {
            return 51 + (slot - 18);
        }
        return -1;
    }

    private void removeMapMakingContainerSlots(PacketWrapper wrapper) {
        short slot = (Short)wrapper.read((Type)Types.SHORT);
        slot = (short)this.removeMapMakingContainerSlot(slot);
        wrapper.write((Type)Types.SHORT, (Object)slot);
    }

    private int removeMapMakingContainerSlot(int slot) {
        if (slot == 0) {
            return 8;
        }
        if (slot < 51) {
            return slot - 1;
        }
        if (slot < 159) {
            int slotIndex = 18 + (slot - 51);
            if (slotIndex >= 54) {
                return -1;
            }
            return slotIndex;
        }
        return -1;
    }
}

