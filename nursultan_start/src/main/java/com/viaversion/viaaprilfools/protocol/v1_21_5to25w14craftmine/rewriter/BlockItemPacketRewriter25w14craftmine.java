/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.minecraft.item.data.LodestoneTracker
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.StructuredItemRewriter
 *  com.viaversion.viaversion.util.Limit
 */
package com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaaprilfools.api.minecraft.item.LodestoneTracker25w14craftmine;
import com.viaversion.viaaprilfools.api.minecraft.item.StructuredDataKeys25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.Protocol1_21_5To_25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ServerboundPacket25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ServerboundPackets25w14craftmine;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.minecraft.item.data.LodestoneTracker;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.StructuredItemRewriter;
import com.viaversion.viaversion.util.Limit;
import java.util.List;

public final class BlockItemPacketRewriter25w14craftmine
extends StructuredItemRewriter<ClientboundPacket1_21_5, ServerboundPacket25w14craftmine, Protocol1_21_5To_25w14craftmine> {
    public static final List<StructuredDataKey<?>> NEW_DATA_TO_REMOVE = List.of(StructuredDataKeys25w14craftmine.ITEM_EXCHANGE_VALUE, StructuredDataKeys25w14craftmine.WORLD_EFFECT_UNLOCK, StructuredDataKeys25w14craftmine.WORLD_EFFECT_HINT, StructuredDataKeys25w14craftmine.MINE_ACTIVE, StructuredDataKeys25w14craftmine.SPECIAL_MINE, StructuredDataKeys25w14craftmine.MINE_COMPLETED, StructuredDataKeys25w14craftmine.WORLD_MODIFIERS, StructuredDataKeys25w14craftmine.DIMENSION_ID, StructuredDataKeys25w14craftmine.ROOM, StructuredDataKeys25w14craftmine.SKY, StructuredDataKeys25w14craftmine.TROPHY_TYPE, StructuredDataKeys25w14craftmine.MOB_TROPHY_TYPE);
    public static final int NEW_CRAFTING_SLOTS = 5;
    public static final int PLAYER_INVENTORY_ID = 0;
    static final int THIRD_CRAFTING_SLOT = 3;
    static final int FOURTH_CRAFTING_SLOT = 4;
    static final int FIFTH_CRAFTING_SLOT = 5;
    static final int SIXTH_CRAFTING_SLOT = 6;
    static final int SEVENTH_CRAFTING_SLOT = 7;
    static final int EIGHTH_CRAFTING_SLOT = 8;
    static final int NINTH_CRAFTING_SLOT = 9;

    public BlockItemPacketRewriter25w14craftmine(Protocol1_21_5To_25w14craftmine protocol) {
        super((Protocol)protocol);
    }

    public void registerPackets() {
        BlockRewriter blockRewriter = BlockRewriter.for1_20_2((Protocol)this.protocol, ChunkType1_21_5::new);
        blockRewriter.registerBlockEvent((ClientboundPacketType)ClientboundPackets1_21_5.BLOCK_EVENT);
        blockRewriter.registerBlockUpdate((ClientboundPacketType)ClientboundPackets1_21_5.BLOCK_UPDATE);
        blockRewriter.registerSectionBlocksUpdate1_20((ClientboundPacketType)ClientboundPackets1_21_5.SECTION_BLOCKS_UPDATE);
        blockRewriter.registerLevelEvent1_21((ClientboundPacketType)ClientboundPackets1_21_5.LEVEL_EVENT);
        blockRewriter.registerLevelChunk1_18((ClientboundPacketType)ClientboundPackets1_21_5.LEVEL_CHUNK_WITH_LIGHT);
        blockRewriter.registerBlockEntityData1_18((ClientboundPacketType)ClientboundPackets1_21_5.BLOCK_ENTITY_DATA);
        ((Protocol1_21_5To_25w14craftmine)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_5.SET_CURSOR_ITEM, x$0 -> this.passthroughClientboundItem(x$0));
        this.registerCooldown1_21_2((ClientboundPacketType)ClientboundPackets1_21_5.COOLDOWN);
        this.registerSetEquipment((ClientboundPacketType)ClientboundPackets1_21_5.SET_EQUIPMENT);
        this.registerMerchantOffers1_20_5((ClientboundPacketType)ClientboundPackets1_21_5.MERCHANT_OFFERS);
        RecipeDisplayRewriter1_21_5 recipeRewriter = new RecipeDisplayRewriter1_21_5(this.protocol);
        recipeRewriter.registerUpdateRecipes((ClientboundPacketType)ClientboundPackets1_21_5.UPDATE_RECIPES);
        recipeRewriter.registerRecipeBookAdd((ClientboundPacketType)ClientboundPackets1_21_5.RECIPE_BOOK_ADD);
        recipeRewriter.registerPlaceGhostRecipe((ClientboundPacketType)ClientboundPackets1_21_5.PLACE_GHOST_RECIPE);
        ((Protocol1_21_5To_25w14craftmine)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_5.SET_PLAYER_INVENTORY, wrapper -> {
            int slot = (Integer)wrapper.read((Type)Types.VAR_INT);
            slot = BlockItemPacketRewriter25w14craftmine.addCraftingSlot(slot);
            wrapper.write((Type)Types.VAR_INT, (Object)slot);
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol1_21_5To_25w14craftmine)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_5.CONTAINER_SET_CONTENT, wrapper -> {
            int containerId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            if (containerId == 0) {
                Item[] items = (Item[])wrapper.read(this.itemArrayType());
                for (int i = 0; i < items.length; ++i) {
                    items[i] = this.handleItemToClient(wrapper.user(), items[i]);
                }
                Item[] mappedItems = new Item[items.length + 5];
                mappedItems[3] = StructuredItem.empty();
                mappedItems[6] = StructuredItem.empty();
                mappedItems[7] = StructuredItem.empty();
                mappedItems[8] = StructuredItem.empty();
                mappedItems[9] = StructuredItem.empty();
                for (int i = 0; i < items.length; ++i) {
                    mappedItems[BlockItemPacketRewriter25w14craftmine.addCraftingSlot((int)i)] = items[i];
                }
                wrapper.write(this.mappedItemArrayType(), (Object)mappedItems);
            } else {
                Item[] items = (Item[])wrapper.passthroughAndMap(this.itemArrayType(), this.mappedItemArrayType());
                for (int i = 0; i < items.length; ++i) {
                    items[i] = this.handleItemToClient(wrapper.user(), items[i]);
                }
            }
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol1_21_5To_25w14craftmine)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_5.CONTAINER_SET_SLOT, wrapper -> {
            int containerId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            if (containerId == 0) {
                BlockItemPacketRewriter25w14craftmine.addCraftingSlots(wrapper);
            } else {
                wrapper.passthrough((Type)Types.SHORT);
            }
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol1_21_5To_25w14craftmine)this.protocol).registerServerbound(ServerboundPackets25w14craftmine.SET_CREATIVE_MODE_SLOT, wrapper -> {
            if (!((Protocol1_21_5To_25w14craftmine)this.protocol).getEntityRewriter().tracker(wrapper.user()).canInstaBuild()) {
                wrapper.cancel();
                return;
            }
            BlockItemPacketRewriter25w14craftmine.removeCraftingSlots(wrapper);
            this.passthroughLengthPrefixedItem(wrapper);
        });
        ((Protocol1_21_5To_25w14craftmine)this.protocol).registerServerbound(ServerboundPackets25w14craftmine.CONTAINER_CLICK, wrapper -> {
            int containerId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            if (containerId == 0) {
                BlockItemPacketRewriter25w14craftmine.removeCraftingSlots(wrapper);
            } else {
                wrapper.passthrough((Type)Types.SHORT);
            }
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            int affectedItems = Limit.max((int)((Integer)wrapper.passthrough((Type)Types.VAR_INT)), (int)128);
            for (int i = 0; i < affectedItems; ++i) {
                if (containerId == 0) {
                    BlockItemPacketRewriter25w14craftmine.removeCraftingSlots(wrapper);
                } else {
                    wrapper.passthrough((Type)Types.SHORT);
                }
                this.passthroughHashedItem(wrapper);
            }
            this.passthroughHashedItem(wrapper);
        });
        ((Protocol1_21_5To_25w14craftmine)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_5.UPDATE_ADVANCEMENTS, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    Tag title = (Tag)wrapper.passthrough(Types.TAG);
                    Tag description = (Tag)wrapper.passthrough(Types.TAG);
                    ((Protocol1_21_5To_25w14craftmine)this.protocol).getComponentRewriter().processTag(wrapper.user(), title);
                    ((Protocol1_21_5To_25w14craftmine)this.protocol).getComponentRewriter().processTag(wrapper.user(), description);
                    CompoundTag hint = new CompoundTag();
                    hint.putString("text", "");
                    wrapper.write(Types.TAG, (Object)hint);
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
        this.registerOpenScreen((ClientboundPacketType)ClientboundPackets1_21_5.OPEN_SCREEN);
        ((Protocol1_21_5To_25w14craftmine)this.protocol).appendClientbound((ClientboundPacketType)ClientboundPackets1_21_5.OPEN_SCREEN, wrapper -> wrapper.write((Type)Types.VAR_INT, (Object)0));
    }

    public static void addCraftingSlots(PacketWrapper wrapper) {
        short slot = (Short)wrapper.read((Type)Types.SHORT);
        slot = (short)BlockItemPacketRewriter25w14craftmine.addCraftingSlot(slot);
        wrapper.write((Type)Types.SHORT, (Object)slot);
    }

    public static int addCraftingSlot(int slot) {
        if (slot == 3) {
            return 4;
        }
        if (slot == 4) {
            return 5;
        }
        if (slot >= 5) {
            return slot + 5;
        }
        return slot;
    }

    public static void removeCraftingSlots(PacketWrapper wrapper) {
        short slot = (Short)wrapper.read((Type)Types.SHORT);
        slot = (short)BlockItemPacketRewriter25w14craftmine.removeCraftingSlot(slot);
        wrapper.write((Type)Types.SHORT, (Object)slot);
    }

    public static int removeCraftingSlot(int slot) {
        if (slot == 4) {
            return 3;
        }
        if (slot == 5) {
            return 4;
        }
        if (slot >= 10) {
            return slot - 5;
        }
        return slot;
    }

    protected void handleItemDataComponentsToClient(UserConnection connection, Item item, StructuredDataContainer container) {
        super.handleItemDataComponentsToClient(connection, item, container);
        BlockItemPacketRewriter25w14craftmine.upgradeItemData(item, container);
    }

    public static void upgradeItemData(Item item, StructuredDataContainer container) {
        container.replace(StructuredDataKey.LODESTONE_TRACKER, StructuredDataKeys25w14craftmine.LODESTONE_TRACKER, tracker -> new LodestoneTracker25w14craftmine(tracker.position(), tracker.tracked(), false));
    }

    protected void handleItemDataComponentsToServer(UserConnection connection, Item item, StructuredDataContainer container) {
        super.handleItemDataComponentsToServer(connection, item, container);
        BlockItemPacketRewriter25w14craftmine.downgradeItemData(item, container);
    }

    public static void downgradeItemData(Item item, StructuredDataContainer container) {
        container.replace(StructuredDataKeys25w14craftmine.LODESTONE_TRACKER, StructuredDataKey.LODESTONE_TRACKER, tracker -> new LodestoneTracker(tracker.position(), tracker.tracked()));
        container.remove(NEW_DATA_TO_REMOVE);
    }
}

