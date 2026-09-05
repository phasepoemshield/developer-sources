/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.InventoryStateIdStorage
 *  com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.RecipeStorage
 *  com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.SignStorage
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.Consumable1_21_2$ApplyStatusEffects
 *  com.viaversion.viaversion.api.minecraft.item.data.Consumable1_21_2$ConsumeEffect
 *  com.viaversion.viaversion.api.minecraft.item.data.DeathProtection
 *  com.viaversion.viaversion.api.minecraft.item.data.Enchantable
 *  com.viaversion.viaversion.api.minecraft.item.data.Enchantments
 *  com.viaversion.viaversion.api.minecraft.item.data.Equippable
 *  com.viaversion.viaversion.api.minecraft.item.data.FoodProperties1_20_5
 *  com.viaversion.viaversion.api.minecraft.item.data.Instrument1_21_2
 *  com.viaversion.viaversion.api.minecraft.item.data.ItemModel
 *  com.viaversion.viaversion.api.minecraft.item.data.PotionEffect
 *  com.viaversion.viaversion.api.minecraft.item.data.PotionEffectData
 *  com.viaversion.viaversion.api.minecraft.item.data.Repairable
 *  com.viaversion.viaversion.api.minecraft.item.data.UseCooldown
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.BlockItemPacketRewriter1_21_2
 *  com.viaversion.viaversion.rewriter.SoundRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Limit
 *  com.viaversion.viaversion.util.Unit
 */
package com.viaversion.viabackwards.protocol.v1_21_2to1_21.rewriter;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.Protocol1_21_2To1_21;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.InventoryStateIdStorage;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.RecipeStorage;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.SignStorage;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.Consumable1_21_2;
import com.viaversion.viaversion.api.minecraft.item.data.DeathProtection;
import com.viaversion.viaversion.api.minecraft.item.data.Enchantable;
import com.viaversion.viaversion.api.minecraft.item.data.Enchantments;
import com.viaversion.viaversion.api.minecraft.item.data.Equippable;
import com.viaversion.viaversion.api.minecraft.item.data.FoodProperties1_20_5;
import com.viaversion.viaversion.api.minecraft.item.data.Instrument1_21_2;
import com.viaversion.viaversion.api.minecraft.item.data.ItemModel;
import com.viaversion.viaversion.api.minecraft.item.data.PotionEffect;
import com.viaversion.viaversion.api.minecraft.item.data.PotionEffectData;
import com.viaversion.viaversion.api.minecraft.item.data.Repairable;
import com.viaversion.viaversion.api.minecraft.item.data.UseCooldown;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.rewriter.SoundRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Limit;
import com.viaversion.viaversion.util.Unit;

public final class BlockItemPacketRewriter1_21_2
extends BackwardsStructuredItemRewriter<ClientboundPacket1_21_2, ServerboundPacket1_20_5, Protocol1_21_2To1_21> {
    public BlockItemPacketRewriter1_21_2(Protocol1_21_2To1_21 protocol) {
        super((BackwardsProtocol)protocol);
    }

    private void backupInconvertibleData(Item item) {
        DeathProtection deathProtection;
        Key tooltipStyle;
        Unit glider;
        Equippable equippable;
        ItemModel itemModel;
        UseCooldown useCooldown;
        Enchantable enchantable;
        Repairable repairable;
        StructuredDataContainer data = item.dataContainer();
        data.setIdLookup(this.protocol, true);
        CompoundTag backupTag = new CompoundTag();
        Holder instrument = (Holder)data.get(StructuredDataKey.INSTRUMENT1_21_2);
        if (instrument != null && instrument.isDirect()) {
            backupTag.put("instrument_description", ((Instrument1_21_2)instrument.value()).description());
        }
        if ((repairable = (Repairable)data.get(StructuredDataKey.REPAIRABLE)) != null) {
            backupTag.put("repairable", this.holderSetToTag(repairable.items()));
        }
        if ((enchantable = (Enchantable)data.get(StructuredDataKey.ENCHANTABLE)) != null) {
            backupTag.putInt("enchantable", enchantable.value());
        }
        if ((useCooldown = (UseCooldown)data.get(StructuredDataKey.USE_COOLDOWN)) != null) {
            CompoundTag tag = new CompoundTag();
            tag.putFloat("seconds", useCooldown.seconds());
            if (useCooldown.cooldownGroup() != null) {
                tag.putString("cooldown_group", useCooldown.cooldownGroup());
            }
            backupTag.put("use_cooldown", (Tag)tag);
        }
        if ((itemModel = (ItemModel)data.get(StructuredDataKey.ITEM_MODEL)) != null) {
            backupTag.putString("item_model", itemModel.key().original());
        }
        if ((equippable = (Equippable)data.get(StructuredDataKey.EQUIPPABLE1_21_2)) != null) {
            String cameraOverlay;
            CompoundTag tag = new CompoundTag();
            tag.putInt("equipment_slot", equippable.equipmentSlot());
            this.saveSoundEventHolder(tag, equippable.soundEvent());
            String model = equippable.model();
            if (model != null) {
                tag.putString("model", model);
            }
            if ((cameraOverlay = equippable.cameraOverlay()) != null) {
                tag.putString("camera_overlay", cameraOverlay);
            }
            if (equippable.allowedEntities() != null) {
                tag.put("allowed_entities", this.holderSetToTag(equippable.allowedEntities()));
            }
            tag.putBoolean("dispensable", equippable.dispensable());
            tag.putBoolean("swappable", equippable.swappable());
            tag.putBoolean("damage_on_hurt", equippable.damageOnHurt());
            backupTag.put("equippable", (Tag)tag);
        }
        if ((glider = (Unit)data.get(StructuredDataKey.GLIDER)) != null) {
            backupTag.putBoolean("glider", true);
        }
        if ((tooltipStyle = (Key)data.get(StructuredDataKey.TOOLTIP_STYLE)) != null) {
            backupTag.putString("tooltip_style", tooltipStyle.original());
        }
        if ((deathProtection = (DeathProtection)data.get(StructuredDataKey.DEATH_PROTECTION)) != null) {
            ListTag tag = new ListTag(CompoundTag.class);
            for (Consumable1_21_2.ConsumeEffect effect : deathProtection.deathEffects()) {
                CompoundTag effectTag = new CompoundTag();
                this.convertConsumableEffect(effectTag, effect);
                tag.add((Tag)effectTag);
            }
            backupTag.put("death_protection", (Tag)tag);
        }
        if (!backupTag.isEmpty()) {
            this.saveTag(this.createCustomTag(item), (Tag)backupTag, "inconvertible_data");
        }
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        this.backupInconvertibleData(item);
        item = super.handleItemToClient(connection, item);
        com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.BlockItemPacketRewriter1_21_2.downgradeItemData((Item)item);
        return item;
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        Enchantments storedEnchantments;
        boolean removed;
        StructuredDataContainer data = (item = super.handleItemToServer(connection, item)).dataContainer();
        FoodProperties1_20_5 food = (FoodProperties1_20_5)data.get(StructuredDataKey.FOOD1_21);
        if (food != null && food.usingConvertsTo() != null) {
            this.handleItemToServer(connection, food.usingConvertsTo());
        }
        com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.BlockItemPacketRewriter1_21_2.updateItemData((Item)item);
        this.restoreInconvertibleData(item);
        Enchantments enchantments = (Enchantments)data.get(StructuredDataKey.ENCHANTMENTS1_20_5);
        if (enchantments != null && (removed = enchantments.enchantments().values().removeIf(level -> level == 0)) && enchantments.size() == 0) {
            data.set(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, (Object)true);
        }
        if ((storedEnchantments = (Enchantments)data.get(StructuredDataKey.STORED_ENCHANTMENTS1_20_5)) != null) {
            storedEnchantments.enchantments().values().removeIf(level -> level == 0);
        }
        return item;
    }

    public void registerPackets() {
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.LEVEL_CHUNK_WITH_LIGHT, wrapper -> {
            Chunk chunk = ((Protocol1_21_2To1_21)this.protocol).getBlockRewriter().handleChunk1_18(wrapper);
            ((Protocol1_21_2To1_21)this.protocol).getBlockRewriter().handleBlockEntities(chunk, wrapper.user());
            if (!wrapper.user().getProtocolInfo().protocolVersion().equalTo(ProtocolVersion.v1_21)) {
                return;
            }
            EntityTracker tracker = wrapper.user().getEntityTracker(Protocol1_21_2To1_21.class);
            SignStorage storage = (SignStorage)wrapper.user().get(SignStorage.class);
            storage.removeSigns(chunk.getX(), chunk.getZ());
            for (int i = 0; i < chunk.getSections().length; ++i) {
                int idx;
                ChunkSection section = chunk.getSections()[i];
                DataPalette blockPalette = section.palette(PaletteType.BLOCKS);
                boolean containsSign = false;
                for (idx = 0; idx < blockPalette.size(); ++idx) {
                    if (!this.signBlockState(blockPalette.idByIndex(idx))) continue;
                    containsSign = true;
                    break;
                }
                if (!containsSign) continue;
                for (idx = 0; idx < 4096; ++idx) {
                    if (!this.signBlockState(blockPalette.idAt(idx))) continue;
                    storage.addSign(new BlockPosition(ChunkSection.xFromIndex((int)idx) + (chunk.getX() << 4), ChunkSection.yFromIndex((int)idx) + tracker.currentMinY() + (i << 4), ChunkSection.zFromIndex((int)idx) + (chunk.getZ() << 4)));
                }
            }
        });
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.BLOCK_UPDATE, wrapper -> {
            BlockPosition position = (BlockPosition)wrapper.passthrough(Types.BLOCK_POSITION1_14);
            int blockId = (Integer)wrapper.read((Type)Types.VAR_INT);
            int mappedBlockId = ((Protocol1_21_2To1_21)this.protocol).getMappingData().getNewBlockStateId(blockId);
            wrapper.write((Type)Types.VAR_INT, (Object)mappedBlockId);
            if (!wrapper.user().getProtocolInfo().protocolVersion().equalTo(ProtocolVersion.v1_21)) {
                return;
            }
            SignStorage storage = (SignStorage)wrapper.user().get(SignStorage.class);
            storage.removeSign(position);
            if (this.signBlockState(mappedBlockId)) {
                storage.addSign(position);
            }
        });
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.SECTION_BLOCKS_UPDATE, wrapper -> {
            long position = (Long)wrapper.passthrough((Type)Types.LONG);
            int chunkX = (int)(position >> 42);
            int chunkY = (int)(position << 44 >> 44);
            int chunkZ = (int)(position << 22 >> 42);
            SignStorage signStorage = (SignStorage)wrapper.user().get(SignStorage.class);
            boolean equalToV1_21 = wrapper.user().getProtocolInfo().protocolVersion().equalTo(ProtocolVersion.v1_21);
            for (BlockChangeRecord record : (BlockChangeRecord[])wrapper.passthrough(Types.VAR_LONG_BLOCK_CHANGE_ARRAY)) {
                record.setBlockId(((Protocol1_21_2To1_21)this.protocol).getMappingData().getNewBlockStateId(record.getBlockId()));
                if (!equalToV1_21) continue;
                int x = record.getSectionX() + (chunkX << 4);
                int y = record.getSectionY() + (chunkY << 4);
                int z = record.getSectionZ() + (chunkZ << 4);
                BlockPosition pos = new BlockPosition(x, y, z);
                if (this.signBlockState(record.getBlockId())) {
                    signStorage.addSign(pos);
                    continue;
                }
                signStorage.removeSign(pos);
            }
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.OPEN_SIGN_EDITOR, wrapper -> {
            if (!wrapper.user().getProtocolInfo().protocolVersion().equalTo(ProtocolVersion.v1_21)) {
                return;
            }
            BlockPosition position = (BlockPosition)wrapper.passthrough(Types.BLOCK_POSITION1_14);
            if (!((SignStorage)wrapper.user().get(SignStorage.class)).isSign(position)) {
                wrapper.cancel();
            }
        });
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.COOLDOWN, wrapper -> {
            BackwardsMappingData mappingData = ((Protocol1_21_2To1_21)this.protocol).getMappingData();
            String itemIdentifier = (String)wrapper.read(Types.STRING);
            int id = mappingData.getFullItemMappings().id(itemIdentifier);
            if (id != -1) {
                int mappedId = mappingData.getFullItemMappings().getNewId(id);
                wrapper.write((Type)Types.VAR_INT, (Object)mappedId);
            } else {
                wrapper.cancel();
            }
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.SET_CURSOR_ITEM, (ClientboundPacketType)ClientboundPackets1_21.CONTAINER_SET_SLOT, wrapper -> {
            wrapper.write((Type)Types.BYTE, (Object)-1);
            wrapper.write((Type)Types.VAR_INT, (Object)((InventoryStateIdStorage)wrapper.user().get(InventoryStateIdStorage.class)).stateId());
            wrapper.write((Type)Types.SHORT, (Object)-1);
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.OPEN_SCREEN, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int containerType = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (containerType == 21) {
                ((InventoryStateIdStorage)wrapper.user().get(InventoryStateIdStorage.class)).setSmithingTableOpen(true);
            }
            ((Protocol1_21_2To1_21)this.protocol).getComponentRewriter().passthroughAndProcess(wrapper);
        });
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.CONTAINER_SET_CONTENT, wrapper -> {
            this.varIntToUnsignedByte(wrapper);
            int stateId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            ((InventoryStateIdStorage)wrapper.user().get(InventoryStateIdStorage.class)).setStateId(stateId);
            Item[] items = (Item[])wrapper.read(this.itemArrayType());
            wrapper.write(this.mappedItemArrayType(), (Object)items);
            for (int i = 0; i < items.length; ++i) {
                items[i] = this.handleItemToClient(wrapper.user(), items[i]);
            }
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.CONTAINER_SET_SLOT, wrapper -> {
            this.varIntToByte(wrapper);
            int stateId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            ((InventoryStateIdStorage)wrapper.user().get(InventoryStateIdStorage.class)).setStateId(stateId);
            wrapper.passthrough((Type)Types.SHORT);
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.CONTAINER_SET_DATA, wrapper -> {
            this.varIntToUnsignedByte(wrapper);
            if (((InventoryStateIdStorage)wrapper.user().get(InventoryStateIdStorage.class)).smithingTableOpen()) {
                wrapper.cancel();
            }
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.CONTAINER_CLOSE, wrapper -> {
            this.varIntToUnsignedByte(wrapper);
            ((InventoryStateIdStorage)wrapper.user().get(InventoryStateIdStorage.class)).setSmithingTableOpen(false);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.SET_HELD_SLOT, (ClientboundPacketType)ClientboundPackets1_21.SET_CARRIED_ITEM);
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.HORSE_SCREEN_OPEN, this::varIntToUnsignedByte);
        ((Protocol1_21_2To1_21)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.CONTAINER_CLOSE, wrapper -> {
            this.byteToVarInt(wrapper);
            ((InventoryStateIdStorage)wrapper.user().get(InventoryStateIdStorage.class)).setSmithingTableOpen(false);
        });
        ((Protocol1_21_2To1_21)this.protocol).replaceServerbound((ServerboundPacketType)ServerboundPackets1_20_5.CONTAINER_CLICK, wrapper -> {
            this.byteToVarInt(wrapper);
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
        ((Protocol1_21_2To1_21)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.USE_ITEM_ON, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.BLOCK_POSITION1_14);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
        });
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.EXPLODE, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            double knockbackX = 0.0;
            double knockbackY = 0.0;
            double knockbackZ = 0.0;
            if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                knockbackX = (Double)wrapper.read((Type)Types.DOUBLE);
                knockbackY = (Double)wrapper.read((Type)Types.DOUBLE);
                knockbackZ = (Double)wrapper.read((Type)Types.DOUBLE);
            }
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf((float)knockbackX));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf((float)knockbackY));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf((float)knockbackZ));
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            Particle explosionParticle = (Particle)wrapper.read((Type)VersionedTypes.V1_21.particle());
            ((Protocol1_21_2To1_21)this.protocol).getParticleRewriter().rewriteParticle(wrapper.user(), explosionParticle);
            wrapper.write((Type)VersionedTypes.V1_21_2.particle(), (Object)explosionParticle);
            wrapper.write((Type)VersionedTypes.V1_21_2.particle(), (Object)explosionParticle);
            new SoundRewriter(this.protocol).soundHolderHandler().handle(wrapper);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.RECIPE_BOOK_ADD, null, wrapper -> {
            RecipeStorage recipeStorage = (RecipeStorage)wrapper.user().get(RecipeStorage.class);
            int size = (Integer)wrapper.read((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                recipeStorage.readRecipe(wrapper);
            }
            boolean replace = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            if (replace) {
                recipeStorage.clearRecipes();
            }
            recipeStorage.sendRecipes(wrapper.user());
            wrapper.cancel();
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.RECIPE_BOOK_REMOVE, (ClientboundPacketType)ClientboundPackets1_21.RECIPE, wrapper -> {
            RecipeStorage recipeStorage = (RecipeStorage)wrapper.user().get(RecipeStorage.class);
            int[] ids = (int[])wrapper.read(Types.VAR_INT_ARRAY_PRIMITIVE);
            recipeStorage.lockRecipes(wrapper, ids);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.RECIPE_BOOK_SETTINGS, null, wrapper -> {
            RecipeStorage recipeStorage = (RecipeStorage)wrapper.user().get(RecipeStorage.class);
            boolean[] settings = new boolean[8];
            for (int i = 0; i < 8; ++i) {
                settings[i] = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            }
            recipeStorage.setRecipeBookSettings(settings);
            wrapper.cancel();
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.UPDATE_RECIPES, wrapper -> {
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.read(Types.STRING);
                wrapper.read(Types.VAR_INT_ARRAY_PRIMITIVE);
            }
            RecipeStorage recipeStorage = (RecipeStorage)wrapper.user().get(RecipeStorage.class);
            recipeStorage.readStoneCutterRecipes(wrapper);
            wrapper.cancel();
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.PLACE_GHOST_RECIPE, wrapper -> {
            this.varIntToByte(wrapper);
            wrapper.cancel();
        });
        ((Protocol1_21_2To1_21)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.PLACE_RECIPE, wrapper -> {
            this.byteToVarInt(wrapper);
            String recipe = Key.stripMinecraftNamespace((String)((String)wrapper.read(Types.STRING)));
            wrapper.write((Type)Types.VAR_INT, (Object)Integer.parseInt(recipe));
        });
        ((Protocol1_21_2To1_21)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.RECIPE_BOOK_SEEN_RECIPE, wrapper -> {
            String recipe = Key.stripMinecraftNamespace((String)((String)wrapper.read(Types.STRING)));
            wrapper.write((Type)Types.VAR_INT, (Object)Integer.parseInt(recipe));
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.SET_PLAYER_INVENTORY, (ClientboundPacketType)ClientboundPackets1_21.CONTAINER_SET_SLOT, wrapper -> {
            wrapper.write((Type)Types.BYTE, (Object)-2);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            int slot = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.SHORT, (Object)((short)slot));
            this.passthroughClientboundItem(wrapper);
        });
    }

    private PotionEffectData convertPotionEffectData(CompoundTag tag) {
        int amplifier = tag.getInt("amplifier");
        int duration = tag.getInt("duration");
        boolean ambient = tag.getBoolean("ambient");
        boolean showParticles = tag.getBoolean("show_particles");
        boolean showIcon = tag.getBoolean("show_icon");
        CompoundTag hiddenEffect = tag.getCompoundTag("hidden_effect");
        return new PotionEffectData(amplifier, duration, ambient, showParticles, showIcon, hiddenEffect != null ? this.convertPotionEffectData(hiddenEffect) : null);
    }

    private void convertPotionEffectData(CompoundTag tag, PotionEffectData data) {
        tag.putInt("amplifier", data.amplifier());
        tag.putInt("duration", data.duration());
        tag.putBoolean("ambient", data.ambient());
        tag.putBoolean("show_particles", data.showParticles());
        tag.putBoolean("show_icon", data.showIcon());
        if (data.hiddenEffect() != null) {
            CompoundTag hiddenEffect = new CompoundTag();
            this.convertPotionEffectData(hiddenEffect, data.hiddenEffect());
            tag.put("hidden_effect", (Tag)hiddenEffect);
        }
    }

    private void byteToVarInt(PacketWrapper wrapper) {
        byte containerId = (Byte)wrapper.read((Type)Types.BYTE);
        wrapper.write((Type)Types.VAR_INT, (Object)containerId);
    }

    private void varIntToByte(PacketWrapper wrapper) {
        int containerId = (Integer)wrapper.read((Type)Types.VAR_INT);
        wrapper.write((Type)Types.BYTE, (Object)((byte)containerId));
    }

    private boolean signBlockState(int blockStateId) {
        return blockStateId >= 4302 && blockStateId <= 4589 || blockStateId >= 4762 && blockStateId <= 5625 || blockStateId >= 19276 && blockStateId <= 19355;
    }

    private void restoreInconvertibleData(Item item) {
        ListTag deathProtection;
        String tooltipStyle;
        ByteTag glider;
        CompoundTag equippable;
        String itemModel;
        CompoundTag useCooldown;
        IntTag enchantable;
        Tag description;
        Tag tag;
        StructuredDataContainer data = item.dataContainer();
        CompoundTag customData = (CompoundTag)data.get(StructuredDataKey.CUSTOM_DATA);
        if (customData == null || !((tag = customData.remove(this.nbtTagName("inconvertible_data"))) instanceof CompoundTag)) {
            return;
        }
        CompoundTag backupTag = (CompoundTag)tag;
        Holder instrument = (Holder)data.get(StructuredDataKey.INSTRUMENT1_21_2);
        if (instrument != null && instrument.isDirect() && (description = backupTag.get("instrument_description")) != null) {
            Instrument1_21_2 delegate = (Instrument1_21_2)instrument.value();
            data.set(StructuredDataKey.INSTRUMENT1_21_2, (Object)Holder.of((Object)new Instrument1_21_2(delegate.soundEvent(), delegate.useDuration(), delegate.range(), description)));
        }
        if (backupTag.contains("repairable")) {
            data.set(StructuredDataKey.REPAIRABLE, (Object)new Repairable(this.restoreHolderSet(backupTag, "repairable")));
        }
        if ((enchantable = backupTag.getIntTag("enchantable")) != null) {
            data.set(StructuredDataKey.ENCHANTABLE, (Object)new Enchantable(enchantable.asInt()));
        }
        if ((useCooldown = backupTag.getCompoundTag("use_cooldown")) != null) {
            float seconds = useCooldown.getFloat("seconds");
            String cooldownGroup = useCooldown.getString("cooldown_group");
            data.set(StructuredDataKey.USE_COOLDOWN, (Object)new UseCooldown(seconds, cooldownGroup));
        }
        if ((itemModel = backupTag.getString("item_model")) != null) {
            data.set(StructuredDataKey.ITEM_MODEL, (Object)new ItemModel(Key.of((String)itemModel)));
        }
        if ((equippable = backupTag.getCompoundTag("equippable")) != null) {
            int equipmentSlot = equippable.getInt("equipment_slot");
            Holder soundEvent = this.restoreSoundEventHolder(equippable);
            String model = equippable.getString("model");
            String cameraOverlay = equippable.getString("camera_overlay");
            HolderSet allowedEntities = equippable.contains("allowed_entities") ? this.restoreHolderSet(equippable, "allowed_entities") : null;
            boolean dispensable = equippable.getBoolean("dispensable");
            boolean swappable = equippable.getBoolean("swappable");
            boolean damageOnHurt = equippable.getBoolean("damage_on_hurt");
            data.set(StructuredDataKey.EQUIPPABLE1_21_2, (Object)new Equippable(equipmentSlot, soundEvent, model, cameraOverlay, allowedEntities, dispensable, swappable, damageOnHurt));
        }
        if ((glider = backupTag.getByteTag("glider")) != null) {
            data.set(StructuredDataKey.GLIDER, (Object)Unit.INSTANCE);
        }
        if ((tooltipStyle = backupTag.getString("tooltip_style")) != null) {
            data.set(StructuredDataKey.TOOLTIP_STYLE, (Object)Key.of((String)tooltipStyle));
        }
        if ((deathProtection = backupTag.getListTag("death_protection", CompoundTag.class)) != null) {
            Consumable1_21_2.ConsumeEffect[] effects = new Consumable1_21_2.ConsumeEffect[deathProtection.size()];
            for (int i = 0; i < deathProtection.size(); ++i) {
                effects[i] = this.convertConsumableEffect((CompoundTag)deathProtection.get(i));
            }
            data.set(StructuredDataKey.DEATH_PROTECTION, (Object)new DeathProtection(effects));
        }
        this.removeCustomTag(data, customData);
    }

    private void varIntToUnsignedByte(PacketWrapper wrapper) {
        int containerId = (Integer)wrapper.read((Type)Types.VAR_INT);
        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)containerId));
    }

    private Consumable1_21_2.ConsumeEffect<?> convertConsumableEffect(CompoundTag tag) {
        int id = tag.getInt("id");
        String type = tag.getString("type");
        if ("apply_effects".equals(type)) {
            ListTag effects = tag.getListTag("effects", CompoundTag.class);
            PotionEffect[] potionEffects = new PotionEffect[effects.size()];
            for (int i = 0; i < effects.size(); ++i) {
                CompoundTag effectTag = (CompoundTag)effects.get(i);
                int effect = effectTag.getInt("effect");
                PotionEffectData data = this.convertPotionEffectData(effectTag);
                potionEffects[i] = new PotionEffect(effect, data);
            }
            float probability = tag.getFloat("probability");
            return new Consumable1_21_2.ConsumeEffect(id, Consumable1_21_2.ApplyStatusEffects.TYPE, (Object)new Consumable1_21_2.ApplyStatusEffects(potionEffects, probability));
        }
        if ("remove_effects".equals(type)) {
            HolderSet set = this.restoreHolderSet(tag, "remove_effects");
            return new Consumable1_21_2.ConsumeEffect(id, Types.HOLDER_SET, (Object)set);
        }
        if ("clear_all_effects".equals(type)) {
            return new Consumable1_21_2.ConsumeEffect(id, Types.EMPTY, (Object)Unit.INSTANCE);
        }
        if ("teleport_randomly".equals(type)) {
            float probability = tag.getFloat("probability");
            return new Consumable1_21_2.ConsumeEffect(id, (Type)Types.FLOAT, (Object)Float.valueOf(probability));
        }
        if ("play_sound".equals(type)) {
            Holder sound = this.restoreSoundEventHolder(tag);
            return new Consumable1_21_2.ConsumeEffect(id, (Type)Types.SOUND_EVENT, (Object)sound);
        }
        return null;
    }

    private void convertConsumableEffect(CompoundTag tag, Consumable1_21_2.ConsumeEffect<?> effect) {
        Object object;
        tag.putInt("id", effect.id());
        if (effect.type() == Consumable1_21_2.ApplyStatusEffects.TYPE && (object = effect.value()) instanceof Consumable1_21_2.ApplyStatusEffects) {
            Consumable1_21_2.ApplyStatusEffects value = (Consumable1_21_2.ApplyStatusEffects)object;
            tag.putString("type", "apply_effects");
            ListTag effects = new ListTag(CompoundTag.class);
            for (PotionEffect potionEffect : value.effects()) {
                CompoundTag effectTag = new CompoundTag();
                effectTag.putInt("effect", potionEffect.effect());
                this.convertPotionEffectData(effectTag, potionEffect.effectData());
                effects.add((Tag)effectTag);
            }
            tag.put("effects", (Tag)effects);
            tag.putFloat("probability", value.probability());
        } else if (effect.type() == Types.HOLDER_SET && (object = effect.value()) instanceof HolderSet) {
            HolderSet set = (HolderSet)object;
            tag.putString("type", "remove_effects");
            tag.put("remove_effects", this.holderSetToTag(set));
        } else if (effect.type() == Types.EMPTY) {
            tag.putString("type", "clear_all_effects");
        } else if (effect.type() == Types.FLOAT) {
            tag.putString("type", "teleport_randomly");
            tag.putFloat("probability", ((Float)effect.value()).floatValue());
        } else if (effect.type() == Types.SOUND_EVENT && (object = effect.value()) instanceof Holder) {
            Holder sound = (Holder)object;
            tag.putString("type", "play_sound");
            this.saveSoundEventHolder(tag, sound);
        }
    }
}

