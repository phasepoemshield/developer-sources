/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ChunkPosition
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimMaterial
 *  com.viaversion.viaversion.api.minecraft.item.data.Consumable1_21_2
 *  com.viaversion.viaversion.api.minecraft.item.data.Consumable1_21_2$ApplyStatusEffects
 *  com.viaversion.viaversion.api.minecraft.item.data.Consumable1_21_2$ConsumeEffect
 *  com.viaversion.viaversion.api.minecraft.item.data.DamageResistant1_21_2
 *  com.viaversion.viaversion.api.minecraft.item.data.Enchantments
 *  com.viaversion.viaversion.api.minecraft.item.data.FoodProperties1_20_5
 *  com.viaversion.viaversion.api.minecraft.item.data.FoodProperties1_20_5$FoodEffect
 *  com.viaversion.viaversion.api.minecraft.item.data.FoodProperties1_21_2
 *  com.viaversion.viaversion.api.minecraft.item.data.Instrument1_20_5
 *  com.viaversion.viaversion.api.minecraft.item.data.Instrument1_21_2
 *  com.viaversion.viaversion.api.minecraft.item.data.LockCode
 *  com.viaversion.viaversion.api.minecraft.item.data.PotionEffect
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap$Entry
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArrayList
 *  com.viaversion.viaversion.libs.fastutil.ints.IntList
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.Protocol1_21To1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.RecipeRewriter1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.RecipeRewriter1_21_2$Recipe
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.BundleStateTracker
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ChunkLoadTracker
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.LastExplosionPowerStorage
 *  com.viaversion.viaversion.rewriter.StructuredItemRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Limit
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.TagUtil
 *  com.viaversion.viaversion.util.Unit
 */
package com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ChunkPosition;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimMaterial;
import com.viaversion.viaversion.api.minecraft.item.data.Consumable1_21_2;
import com.viaversion.viaversion.api.minecraft.item.data.DamageResistant1_21_2;
import com.viaversion.viaversion.api.minecraft.item.data.Enchantments;
import com.viaversion.viaversion.api.minecraft.item.data.FoodProperties1_20_5;
import com.viaversion.viaversion.api.minecraft.item.data.FoodProperties1_21_2;
import com.viaversion.viaversion.api.minecraft.item.data.Instrument1_20_5;
import com.viaversion.viaversion.api.minecraft.item.data.Instrument1_21_2;
import com.viaversion.viaversion.api.minecraft.item.data.LockCode;
import com.viaversion.viaversion.api.minecraft.item.data.PotionEffect;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrayList;
import com.viaversion.viaversion.libs.fastutil.ints.IntList;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.Protocol1_21To1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.RecipeRewriter1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.BundleStateTracker;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ChunkLoadTracker;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.LastExplosionPowerStorage;
import com.viaversion.viaversion.rewriter.StructuredItemRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Limit;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.TagUtil;
import com.viaversion.viaversion.util.Unit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class BlockItemPacketRewriter1_21_2
extends StructuredItemRewriter<ClientboundPacket1_21, ServerboundPacket1_21_2, Protocol1_21To1_21_2> {
    public static final List<StructuredDataKey<?>> NEW_DATA_TO_REMOVE = List.of(StructuredDataKey.REPAIRABLE, StructuredDataKey.ENCHANTABLE, StructuredDataKey.CONSUMABLE1_21_2, StructuredDataKey.V1_21_2.useRemainder, StructuredDataKey.USE_COOLDOWN, StructuredDataKey.ITEM_MODEL, StructuredDataKey.EQUIPPABLE1_21_2, StructuredDataKey.GLIDER, StructuredDataKey.TOOLTIP_STYLE, StructuredDataKey.DEATH_PROTECTION);
    private static final int RECIPE_NOTIFICATION_FLAG = 1;
    private static final int RECIPE_HIGHLIGHT_FLAG = 2;
    private static final int RECIPE_INIT = 0;
    private static final int RECIPE_ADD = 1;
    private static final int RECIPE_REMOVE = 2;

    public BlockItemPacketRewriter1_21_2(Protocol1_21To1_21_2 protocol) {
        super((Protocol)protocol);
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        Tag itemName;
        int identifier;
        if (item.isEmpty()) {
            return item;
        }
        super.handleItemToClient(connection, item);
        StructuredDataContainer data = item.dataContainer();
        FoodProperties1_20_5 food = (FoodProperties1_20_5)data.get(StructuredDataKey.FOOD1_21);
        if (food != null && food.usingConvertsTo() != null) {
            this.handleItemToClient(connection, food.usingConvertsTo());
        }
        BlockItemPacketRewriter1_21_2.updateItemData(item);
        Enchantments enchantments = (Enchantments)data.get(StructuredDataKey.ENCHANTMENTS1_20_5);
        if (enchantments != null && enchantments.size() != 0) {
            IntArrayList enchantmentIds = new IntArrayList();
            enchantments.enchantments().int2IntEntrySet().removeIf(arg_0 -> BlockItemPacketRewriter1_21_2.lambda$handleItemToClient$13((IntList)enchantmentIds, arg_0));
            if (!enchantmentIds.isEmpty()) {
                IntArrayTag enchantmentIdsTag = new IntArrayTag(enchantmentIds.toIntArray());
                this.saveTag(this.createCustomTag(item), (Tag)enchantmentIdsTag, "0_enchants");
            }
            if (enchantments.size() == 0 && !data.has(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE)) {
                data.set(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, (Object)true);
                this.saveTag(this.createCustomTag(item), (Tag)new ByteTag(true), "remove_glint");
            }
        }
        if (!((identifier = item.identifier()) != 952 && identifier != 1147 && identifier != 1039 && identifier != 1203 && identifier != 1200 && identifier != 1204 && identifier != 1202 || (itemName = (Tag)data.get(StructuredDataKey.ITEM_NAME)) == null || data.has(StructuredDataKey.CUSTOM_NAME))) {
            CompoundTag name = new CompoundTag();
            name.putBoolean("italic", false);
            name.putString("text", "");
            name.put("extra", (Tag)new ListTag(Collections.singletonList(itemName)));
            data.set(StructuredDataKey.CUSTOM_NAME, (Object)name);
            this.saveTag(this.createCustomTag(item), (Tag)new ByteTag(true), "remove_custom_name");
        }
        return item;
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        IntArrayTag emptyEnchantments;
        if (item.isEmpty()) {
            return item;
        }
        super.handleItemToServer(connection, item);
        BlockItemPacketRewriter1_21_2.downgradeItemData(item);
        StructuredDataContainer dataContainer = item.dataContainer();
        CompoundTag customData = (CompoundTag)dataContainer.get(StructuredDataKey.CUSTOM_DATA);
        if (customData == null) {
            return item;
        }
        if (customData.remove(this.nbtTagName("remove_custom_name")) != null) {
            dataContainer.remove(StructuredDataKey.CUSTOM_NAME);
            this.removeCustomTag(dataContainer, customData);
        }
        if ((emptyEnchantments = customData.getIntArrayTag(this.nbtTagName("0_enchants"))) != null) {
            Enchantments enchantments = (Enchantments)dataContainer.get(StructuredDataKey.ENCHANTMENTS1_20_5);
            if (enchantments == null) {
                enchantments = new Enchantments(true);
                dataContainer.set(StructuredDataKey.ENCHANTMENTS1_20_5, (Object)enchantments);
            }
            for (int enchantmentId : emptyEnchantments.getValue()) {
                enchantments.enchantments().put(enchantmentId, 0);
            }
            customData.remove(this.nbtTagName("0_enchants"));
            if (customData.remove(this.nbtTagName("remove_glint")) != null) {
                dataContainer.remove(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE);
            }
            this.removeCustomTag(dataContainer, customData);
        }
        return item;
    }

    public void registerPackets() {
        ((Protocol1_21To1_21_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21.COOLDOWN, wrapper -> {
            MappingData mappingData = ((Protocol1_21To1_21_2)this.protocol).getMappingData();
            int itemId = (Integer)wrapper.read((Type)Types.VAR_INT);
            int mappedItemId = mappingData.getNewItemId(itemId);
            wrapper.write(Types.STRING, (Object)mappingData.getFullItemMappings().mappedIdentifier(mappedItemId));
        });
        ((Protocol1_21To1_21_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21.CONTAINER_SET_CONTENT, wrapper -> {
            this.unsignedByteToVarInt(wrapper);
            wrapper.passthrough((Type)Types.VAR_INT);
            Item[] items = (Item[])wrapper.read(this.itemArrayType());
            wrapper.write(this.mappedItemArrayType(), (Object)items);
            for (int i = 0; i < items.length; ++i) {
                items[i] = this.handleItemToClient(wrapper.user(), items[i]);
            }
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol1_21To1_21_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21.CONTAINER_SET_SLOT, wrapper -> {
            this.byteToVarInt(wrapper);
            int containerId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
            if (containerId == -1) {
                wrapper.setPacketType((PacketType)ClientboundPackets1_21_2.SET_CURSOR_ITEM);
                wrapper.resetReader();
                wrapper.read((Type)Types.VAR_INT);
                wrapper.read((Type)Types.VAR_INT);
                wrapper.read((Type)Types.SHORT);
            } else if (containerId == -2) {
                wrapper.setPacketType((PacketType)ClientboundPackets1_21_2.SET_PLAYER_INVENTORY);
                wrapper.resetReader();
                wrapper.read((Type)Types.VAR_INT);
                wrapper.read((Type)Types.VAR_INT);
                wrapper.write((Type)Types.VAR_INT, (Object)((Short)wrapper.read((Type)Types.SHORT)));
            } else {
                wrapper.passthrough((Type)Types.VAR_INT);
                wrapper.passthrough((Type)Types.SHORT);
            }
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.CONTAINER_CLOSE, this::unsignedByteToVarInt);
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.CONTAINER_SET_DATA, this::unsignedByteToVarInt);
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.HORSE_SCREEN_OPEN, this::unsignedByteToVarInt);
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.SET_CARRIED_ITEM, (ClientboundPacketType)ClientboundPackets1_21_2.SET_HELD_SLOT);
        ((Protocol1_21To1_21_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.CONTAINER_CLOSE, this::varIntToByte);
        ((Protocol1_21To1_21_2)this.protocol).replaceServerbound((ServerboundPacketType)ServerboundPackets1_21_2.CONTAINER_CLICK, wrapper -> {
            this.varIntToByte(wrapper);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.SHORT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            int length = Limit.max((int)((Integer)wrapper.passthrough((Type)Types.VAR_INT)), (int)128);
            for (int i = 0; i < length; ++i) {
                wrapper.passthrough((Type)Types.SHORT);
                wrapper.write(this.itemType(), (Object)this.handleItemToServer(wrapper.user(), (Item)wrapper.read(this.mappedItemType())));
            }
            wrapper.write(this.itemType(), (Object)this.handleItemToServer(wrapper.user(), (Item)wrapper.read(this.mappedItemType())));
        });
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.PLACE_GHOST_RECIPE, wrapper -> {
            this.byteToVarInt(wrapper);
            String recipeKey = (String)wrapper.read(Types.STRING);
            RecipeRewriter1_21_2.Recipe recipe = ((RecipeRewriter1_21_2)wrapper.user().get(RecipeRewriter1_21_2.class)).recipe(recipeKey);
            if (recipe == null) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)recipe.recipeDisplayId());
            recipe.writeRecipeDisplay(wrapper);
        });
        ((Protocol1_21To1_21_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.PLACE_RECIPE, wrapper -> {
            this.varIntToByte(wrapper);
            this.convertServerboundRecipeDisplayId(wrapper);
        });
        ((Protocol1_21To1_21_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.RECIPE_BOOK_SEEN_RECIPE, this::convertServerboundRecipeDisplayId);
        ((Protocol1_21To1_21_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.USE_ITEM_ON, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.BLOCK_POSITION1_14);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
        });
        ((Protocol1_21To1_21_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21.EXPLODE, wrapper -> {
            int centerX = (int)Math.floor((Double)wrapper.passthrough((Type)Types.DOUBLE));
            int centerY = (int)Math.floor((Double)wrapper.passthrough((Type)Types.DOUBLE));
            int centerZ = (int)Math.floor((Double)wrapper.passthrough((Type)Types.DOUBLE));
            float power = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            ArrayList<BlockPosition> affectedBlocks = new ArrayList<BlockPosition>();
            int blocks = (Integer)wrapper.read((Type)Types.VAR_INT);
            for (int i = 0; i < blocks; ++i) {
                int x = centerX + (Byte)wrapper.read((Type)Types.BYTE);
                int y = centerY + (Byte)wrapper.read((Type)Types.BYTE);
                int z = centerZ + (Byte)wrapper.read((Type)Types.BYTE);
                affectedBlocks.add(new BlockPosition(x, y, z));
            }
            LastExplosionPowerStorage lastExplosionPowerStorage = (LastExplosionPowerStorage)wrapper.user().get(LastExplosionPowerStorage.class);
            if (lastExplosionPowerStorage != null) {
                lastExplosionPowerStorage.setPower(power);
                lastExplosionPowerStorage.setAffectedBlocks(affectedBlocks.size());
            }
            float knockbackX = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float knockbackY = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float knockbackZ = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            if (knockbackX != 0.0f || knockbackY != 0.0f || knockbackZ != 0.0f) {
                wrapper.write((Type)Types.BOOLEAN, (Object)true);
                wrapper.write((Type)Types.DOUBLE, (Object)knockbackX);
                wrapper.write((Type)Types.DOUBLE, (Object)knockbackY);
                wrapper.write((Type)Types.DOUBLE, (Object)knockbackZ);
            } else {
                wrapper.write((Type)Types.BOOLEAN, (Object)false);
            }
            int blockInteractionMode = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (blockInteractionMode == 1 || blockInteractionMode == 2) {
                for (BlockPosition affectedBlock : affectedBlocks) {
                    PacketWrapper blockUpdate = PacketWrapper.create((PacketType)ClientboundPackets1_21_2.BLOCK_UPDATE, (UserConnection)wrapper.user());
                    blockUpdate.write(Types.BLOCK_POSITION1_14, (Object)affectedBlock);
                    blockUpdate.write((Type)Types.VAR_INT, (Object)0);
                    blockUpdate.send(Protocol1_21To1_21_2.class);
                }
            }
            Particle smallExplosionParticle = (Particle)wrapper.read((Type)VersionedTypes.V1_21.particle);
            Particle largeExplosionParticle = (Particle)wrapper.read((Type)VersionedTypes.V1_21.particle);
            if (power >= 2.0f && blockInteractionMode != 0) {
                ((Protocol1_21To1_21_2)this.protocol).getParticleRewriter().rewriteParticle(wrapper.user(), largeExplosionParticle);
                wrapper.write((Type)VersionedTypes.V1_21_2.particle, (Object)largeExplosionParticle);
            } else {
                ((Protocol1_21To1_21_2)this.protocol).getParticleRewriter().rewriteParticle(wrapper.user(), smallExplosionParticle);
                wrapper.write((Type)VersionedTypes.V1_21_2.particle, (Object)smallExplosionParticle);
            }
            ((Protocol1_21To1_21_2)this.protocol).getSoundRewriter().soundHolderHandler().handle(wrapper);
        });
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.UPDATE_RECIPES, wrapper -> {
            FullMappings recipeSerializerMappings = ((Protocol1_21To1_21_2)this.protocol).getMappingData().getRecipeSerializerMappings();
            RecipeRewriter1_21_2 rewriter = new RecipeRewriter1_21_2(this.protocol);
            wrapper.user().put((StorableObject)rewriter);
            int size = (Integer)wrapper.read((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                String recipeIdentifier = (String)wrapper.read(Types.STRING);
                int serializerTypeId = (Integer)wrapper.read((Type)Types.VAR_INT);
                String serializerTypeIdentifier = recipeSerializerMappings.identifier(serializerTypeId);
                rewriter.setCurrentRecipeIdentifier(recipeIdentifier);
                rewriter.handleRecipeType(wrapper, serializerTypeIdentifier);
            }
            rewriter.finalizeRecipes();
            rewriter.writeUpdateRecipeInputs(wrapper);
        });
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.RECIPE, (ClientboundPacketType)ClientboundPackets1_21_2.RECIPE_BOOK_ADD, wrapper -> {
            RecipeRewriter1_21_2 recipeRewriter;
            int state = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            PacketWrapper settingsPacket = wrapper.create((PacketType)ClientboundPackets1_21_2.RECIPE_BOOK_SETTINGS);
            for (int i = 0; i < 8; ++i) {
                settingsPacket.write((Type)Types.BOOLEAN, (Object)((Boolean)wrapper.read((Type)Types.BOOLEAN)));
            }
            settingsPacket.send(Protocol1_21To1_21_2.class);
            String[] recipes = (String[])wrapper.read(Types.STRING_ARRAY);
            Set<Object> toHighlight = Set.of();
            if (state == 0) {
                String[] highlightRecipes = (String[])wrapper.read(Types.STRING_ARRAY);
                toHighlight = Set.of(highlightRecipes);
            }
            if ((recipeRewriter = (RecipeRewriter1_21_2)wrapper.user().get(RecipeRewriter1_21_2.class)) == null) {
                ((Protocol1_21To1_21_2)this.protocol).getLogger().severe("Recipes not yet sent for recipe add packet");
                wrapper.cancel();
                return;
            }
            wrapper.clearPacket();
            if (state == 2) {
                wrapper.setPacketType((PacketType)ClientboundPackets1_21_2.RECIPE_BOOK_REMOVE);
                int[] ids = new int[recipes.length];
                for (int i = 0; i < recipes.length; ++i) {
                    String recipeKey = recipes[i];
                    RecipeRewriter1_21_2.Recipe recipe = recipeRewriter.recipe(recipeKey);
                    if (recipe == null) {
                        ((Protocol1_21To1_21_2)this.protocol).getLogger().severe("Recipe not found for key " + recipeKey);
                        wrapper.cancel();
                        return;
                    }
                    ids[i] = recipe.index();
                }
                wrapper.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)ids);
                return;
            }
            int size = recipes.length;
            wrapper.write((Type)Types.VAR_INT, (Object)size);
            for (String recipeKey : recipes) {
                RecipeRewriter1_21_2.Recipe recipe = recipeRewriter.recipe(recipeKey);
                if (recipe == null) {
                    --size;
                    continue;
                }
                wrapper.write((Type)Types.VAR_INT, (Object)recipe.index());
                wrapper.write((Type)Types.VAR_INT, (Object)recipe.recipeDisplayId());
                recipe.writeRecipeDisplay(wrapper);
                wrapper.write((Type)Types.OPTIONAL_VAR_INT, recipe.group() != -1 ? Integer.valueOf(recipe.group()) : null);
                wrapper.write((Type)Types.VAR_INT, (Object)recipe.category());
                Item[][] ingredients = recipe.ingredients();
                if (ingredients != null) {
                    wrapper.write((Type)Types.BOOLEAN, (Object)true);
                    List filteredIngredients = Arrays.stream(ingredients).filter(ingredient -> ((Item[])ingredient).length > 0).map(arg_0 -> ((RecipeRewriter1_21_2)recipeRewriter).toHolderSet(arg_0)).toList();
                    wrapper.write((Type)Types.VAR_INT, (Object)filteredIngredients.size());
                    for (HolderSet ingredient2 : filteredIngredients) {
                        wrapper.write(Types.HOLDER_SET, (Object)ingredient2);
                    }
                } else {
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                }
                byte flags = 0;
                if (state == 1) {
                    if (recipe.showNotification()) {
                        flags = (byte)(flags | 1);
                    }
                    flags = (byte)(flags | 2);
                } else if (toHighlight.contains(recipeKey)) {
                    flags = (byte)(flags | 2);
                }
                wrapper.write((Type)Types.BYTE, (Object)flags);
            }
            wrapper.set((Type)Types.VAR_INT, 0, (Object)size);
            wrapper.write((Type)Types.BOOLEAN, (Object)(state == 0 ? 1 : 0));
        });
        ((Protocol1_21To1_21_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21.LEVEL_CHUNK_WITH_LIGHT, wrapper -> {
            ChunkLoadTracker chunkLoadTracker;
            Chunk chunk = ((Protocol1_21To1_21_2)this.protocol).getBlockRewriter().handleChunk1_18(wrapper);
            FullMappings blockEntityMappings = ((Protocol1_21To1_21_2)this.protocol).getMappingData().getBlockEntityMappings();
            if (blockEntityMappings != null) {
                List blockEntities = chunk.blockEntities();
                for (int i = 0; i < blockEntities.size(); ++i) {
                    int mappedId;
                    BlockEntity blockEntity = (BlockEntity)blockEntities.get(i);
                    int id = blockEntity.typeId();
                    if (id == (mappedId = blockEntityMappings.getNewIdOrDefault(id, id))) continue;
                    blockEntities.set(i, blockEntity.withTypeId(mappedId));
                }
            }
            if ((chunkLoadTracker = (ChunkLoadTracker)wrapper.user().get(ChunkLoadTracker.class)) == null) {
                return;
            }
            if (chunkLoadTracker.isChunkLoaded(chunk.getX(), chunk.getZ())) {
                boolean isBundling = ((BundleStateTracker)wrapper.user().get(BundleStateTracker.class)).isBundling();
                if (!isBundling) {
                    PacketWrapper bundleStart = wrapper.create((PacketType)ClientboundPackets1_21_2.BUNDLE_DELIMITER);
                    bundleStart.send(Protocol1_21To1_21_2.class);
                }
                PacketWrapper forgetLevelChunk = wrapper.create((PacketType)ClientboundPackets1_21_2.FORGET_LEVEL_CHUNK);
                forgetLevelChunk.write(Types.CHUNK_POSITION, (Object)new ChunkPosition(chunk.getX(), chunk.getZ()));
                forgetLevelChunk.send(Protocol1_21To1_21_2.class);
                wrapper.send(Protocol1_21To1_21_2.class);
                wrapper.cancel();
                if (!isBundling) {
                    PacketWrapper bundleEnd = wrapper.create((PacketType)ClientboundPackets1_21_2.BUNDLE_DELIMITER);
                    bundleEnd.send(Protocol1_21To1_21_2.class);
                }
            } else {
                chunkLoadTracker.addChunk(chunk.getX(), chunk.getZ());
            }
        });
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.FORGET_LEVEL_CHUNK, wrapper -> {
            ChunkPosition chunkPosition = (ChunkPosition)wrapper.passthrough(Types.CHUNK_POSITION);
            ChunkLoadTracker chunkLoadTracker = (ChunkLoadTracker)wrapper.user().get(ChunkLoadTracker.class);
            if (chunkLoadTracker != null) {
                chunkLoadTracker.removeChunk(chunkPosition.chunkX(), chunkPosition.chunkZ());
            }
        });
    }

    public static void updateItemData(Item item) {
        StructuredDataContainer dataContainer = item.dataContainer();
        dataContainer.replace(StructuredDataKey.INSTRUMENT1_20_5, StructuredDataKey.INSTRUMENT1_21_2, instrument -> {
            if (instrument.hasId()) {
                return Holder.of((int)instrument.id());
            }
            Instrument1_20_5 value = (Instrument1_20_5)instrument.value();
            return Holder.of((Object)new Instrument1_21_2(value.soundEvent(), (float)value.useDuration() / 20.0f, value.range(), (Tag)new StringTag("")));
        });
        dataContainer.replace(StructuredDataKey.FOOD1_21, StructuredDataKey.FOOD1_21_2, food -> {
            Holder sound = Holder.of((Object)new SoundEvent("minecraft:entity.generic.eat", null));
            Consumable1_21_2.ConsumeEffect[] consumeEffects = new Consumable1_21_2.ConsumeEffect[food.possibleEffects().length];
            for (int i = 0; i < consumeEffects.length; ++i) {
                FoodProperties1_20_5.FoodEffect effect = food.possibleEffects()[i];
                Consumable1_21_2.ApplyStatusEffects applyStatusEffects = new Consumable1_21_2.ApplyStatusEffects(new PotionEffect[]{effect.effect()}, effect.probability());
                consumeEffects[i] = new Consumable1_21_2.ConsumeEffect(0, Consumable1_21_2.ApplyStatusEffects.TYPE, (Object)applyStatusEffects);
            }
            dataContainer.set(StructuredDataKey.CONSUMABLE1_21_2, (Object)new Consumable1_21_2(food.eatSeconds(), 1, sound, true, consumeEffects));
            if (food.usingConvertsTo() != null) {
                dataContainer.set(StructuredDataKey.V1_21_2.useRemainder, (Object)food.usingConvertsTo());
            }
            return new FoodProperties1_21_2(food.nutrition(), food.saturationModifier(), food.canAlwaysEat());
        }, () -> {
            dataContainer.setEmpty(StructuredDataKey.CONSUMABLE1_21_2);
            dataContainer.setEmpty(StructuredDataKey.V1_21_2.useRemainder);
        });
        dataContainer.replaceKey(StructuredDataKey.POTION_CONTENTS1_20_5, StructuredDataKey.POTION_CONTENTS1_21_2);
        dataContainer.replace(StructuredDataKey.FIRE_RESISTANT, StructuredDataKey.DAMAGE_RESISTANT1_21_2, fireResistant -> new DamageResistant1_21_2(Key.of((String)"minecraft:is_fire")));
        dataContainer.replace(StructuredDataKey.LOCK1_20_5, StructuredDataKey.LOCK1_21_2, tag -> {
            String lock = ((StringTag)tag).getValue();
            CompoundTag predicateTag = new CompoundTag();
            CompoundTag itemComponentsTag = new CompoundTag();
            predicateTag.put("components", (Tag)itemComponentsTag);
            itemComponentsTag.putString("custom_name", ComponentUtil.plainToJson((String)lock).toString());
            return new LockCode(predicateTag);
        });
        dataContainer.replace(StructuredDataKey.TRIM1_20_5, StructuredDataKey.TRIM1_21_2, trim -> {
            if (trim.material().isDirect()) {
                ((ArmorTrimMaterial)trim.material().value()).overrideArmorMaterials().clear();
            }
            return trim;
        });
    }

    public static void downgradeItemData(Item item) {
        StructuredDataContainer dataContainer = item.dataContainer();
        dataContainer.replace(StructuredDataKey.LOCK1_21_2, StructuredDataKey.LOCK1_20_5, lock -> {
            CompoundTag predicateTag = lock.tag();
            CompoundTag itemComponentsTag = predicateTag.getCompoundTag("components");
            if (itemComponentsTag == null) {
                return null;
            }
            StringTag customName = TagUtil.getNamespacedStringTag((CompoundTag)itemComponentsTag, (String)"custom_name");
            if (customName == null) {
                return null;
            }
            return new StringTag(SerializerVersion.V1_20_5.toComponent(customName.getValue()).asUnformattedString());
        });
        dataContainer.replace(StructuredDataKey.INSTRUMENT1_21_2, StructuredDataKey.INSTRUMENT1_20_5, instrument -> {
            if (instrument.hasId()) {
                return Holder.of((int)instrument.id());
            }
            Instrument1_21_2 value = (Instrument1_21_2)instrument.value();
            return Holder.of((Object)new Instrument1_20_5(value.soundEvent(), (int)(value.useDuration() * 20.0f), value.range()));
        });
        dataContainer.replace(StructuredDataKey.FOOD1_21_2, StructuredDataKey.FOOD1_21, food -> {
            Consumable1_21_2 consumableData = (Consumable1_21_2)dataContainer.get(StructuredDataKey.CONSUMABLE1_21_2);
            Item useRemainderData = (Item)dataContainer.get(StructuredDataKey.V1_21_2.useRemainder);
            float eatSeconds = consumableData != null ? consumableData.consumeSeconds() : 1.6f;
            ArrayList<FoodProperties1_20_5.FoodEffect> foodEffects = new ArrayList<FoodProperties1_20_5.FoodEffect>();
            if (consumableData != null) {
                for (Consumable1_21_2.ConsumeEffect consumeEffect : consumableData.consumeEffects()) {
                    Object patt32239$temp = consumeEffect.value();
                    if (!(patt32239$temp instanceof Consumable1_21_2.ApplyStatusEffects)) continue;
                    Consumable1_21_2.ApplyStatusEffects applyStatusEffects = (Consumable1_21_2.ApplyStatusEffects)patt32239$temp;
                    for (PotionEffect effect : applyStatusEffects.effects()) {
                        foodEffects.add(new FoodProperties1_20_5.FoodEffect(effect, applyStatusEffects.probability()));
                    }
                }
            }
            return new FoodProperties1_20_5(food.nutrition(), food.saturationModifier(), food.canAlwaysEat(), eatSeconds, useRemainderData, foodEffects.toArray(new FoodProperties1_20_5.FoodEffect[0]));
        });
        dataContainer.replace(StructuredDataKey.TRIM1_21_2, StructuredDataKey.TRIM1_20_5, trim -> {
            if (trim.material().isDirect()) {
                ((ArmorTrimMaterial)trim.material().value()).overrideArmorMaterials().clear();
            }
            return trim;
        });
        dataContainer.replaceKey(StructuredDataKey.POTION_CONTENTS1_21_2, StructuredDataKey.POTION_CONTENTS1_20_5);
        dataContainer.replace(StructuredDataKey.DAMAGE_RESISTANT1_21_2, StructuredDataKey.FIRE_RESISTANT, damageResistant -> {
            if (damageResistant.typesTagKey().equals("is_fire")) {
                return Unit.INSTANCE;
            }
            return null;
        });
        dataContainer.remove(NEW_DATA_TO_REMOVE);
    }

    private void byteToVarInt(PacketWrapper wrapper) {
        byte containerId = (Byte)wrapper.read((Type)Types.BYTE);
        wrapper.write((Type)Types.VAR_INT, (Object)containerId);
    }

    private void varIntToByte(PacketWrapper wrapper) {
        int containerId = (Integer)wrapper.read((Type)Types.VAR_INT);
        wrapper.write((Type)Types.BYTE, (Object)((byte)containerId));
    }

    private void unsignedByteToVarInt(PacketWrapper wrapper) {
        short containerId = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
        wrapper.write((Type)Types.VAR_INT, (Object)containerId);
    }

    private static /* synthetic */ boolean lambda$handleItemToClient$13(IntList enchantmentIds, Int2IntMap.Entry entry) {
        if (entry.getIntValue() == 0) {
            enchantmentIds.add(entry.getIntKey());
            return true;
        }
        return false;
    }

    private void convertServerboundRecipeDisplayId(PacketWrapper wrapper) {
        int recipeDisplayId = (Integer)wrapper.read((Type)Types.VAR_INT);
        RecipeRewriter1_21_2.Recipe recipe = ((RecipeRewriter1_21_2)wrapper.user().get(RecipeRewriter1_21_2.class)).recipe(recipeDisplayId);
        if (recipe == null) {
            wrapper.cancel();
            return;
        }
        wrapper.write(Types.STRING, (Object)recipe.identifier());
    }
}

