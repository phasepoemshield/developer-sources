/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.FloatTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.LongArrayTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.storage.HashedItemConverterStorage
 *  com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.storage.HorseDataStorage
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.data.entity.TrackedEntity
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.PaintingVariant
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk1_18
 *  com.viaversion.viaversion.api.minecraft.chunks.Heightmap
 *  com.viaversion.viaversion.api.minecraft.codec.hash.Hasher
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimMaterial
 *  com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks
 *  com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks$DamageReduction
 *  com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks$ItemDamageFunction
 *  com.viaversion.viaversion.api.minecraft.item.data.Equippable
 *  com.viaversion.viaversion.api.minecraft.item.data.ProvidesTrimMaterial
 *  com.viaversion.viaversion.api.minecraft.item.data.ToolProperties
 *  com.viaversion.viaversion.api.minecraft.item.data.TooltipDisplay
 *  com.viaversion.viaversion.api.minecraft.item.data.TropicalFishPattern
 *  com.viaversion.viaversion.api.minecraft.item.data.Weapon
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkBiomesType1_19_4
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkBiomesType1_21_5
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.data.item.ItemHasherBase
 *  com.viaversion.viaversion.data.item.OriginalHashedItem
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArrayList
 *  com.viaversion.viaversion.libs.fastutil.ints.IntLinkedOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSortedSet
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPacket1_21_4
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.BlockItemPacketRewriter1_21_5
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.util.Either
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Limit
 *  com.viaversion.viaversion.util.MathUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.FloatTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.LongArrayTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.Protocol1_21_5To1_21_4;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.rewriter.ComponentRewriter1_21_5;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.storage.HashedItemConverterStorage;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.storage.HorseDataStorage;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.entity.TrackedEntity;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.PaintingVariant;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk1_18;
import com.viaversion.viaversion.api.minecraft.chunks.Heightmap;
import com.viaversion.viaversion.api.minecraft.codec.hash.Hasher;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_5;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimMaterial;
import com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks;
import com.viaversion.viaversion.api.minecraft.item.data.Equippable;
import com.viaversion.viaversion.api.minecraft.item.data.ProvidesTrimMaterial;
import com.viaversion.viaversion.api.minecraft.item.data.ToolProperties;
import com.viaversion.viaversion.api.minecraft.item.data.TooltipDisplay;
import com.viaversion.viaversion.api.minecraft.item.data.TropicalFishPattern;
import com.viaversion.viaversion.api.minecraft.item.data.Weapon;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkBiomesType1_19_4;
import com.viaversion.viaversion.api.type.types.chunk.ChunkBiomesType1_21_5;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.data.item.ItemHasherBase;
import com.viaversion.viaversion.data.item.OriginalHashedItem;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrayList;
import com.viaversion.viaversion.libs.fastutil.ints.IntLinkedOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSortedSet;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPacket1_21_4;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.util.Either;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Limit;
import com.viaversion.viaversion.util.MathUtil;
import java.util.ArrayList;
import java.util.HashMap;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class BlockItemPacketRewriter1_21_5
extends BackwardsStructuredItemRewriter<ClientboundPacket1_21_5, ServerboundPacket1_21_4, Protocol1_21_5To1_21_4> {
    private static final int SADDLE_EQUIPMENT_SLOT = 7;
    static final byte SADDLED_FLAG = 4;

    public BlockItemPacketRewriter1_21_5(Protocol1_21_5To1_21_4 protocol) {
        super((BackwardsProtocol)protocol);
    }

    protected void backupInconvertibleData(UserConnection connection, Item item, StructuredDataContainer dataContainer, CompoundTag backupTag) {
        TropicalFishPattern tropicalFishPattern;
        TooltipDisplay tooltipDisplay;
        BlocksAttacks blocksAttacks;
        ProvidesTrimMaterial providesTrimMaterial;
        Weapon weapon;
        Equippable equippable;
        super.backupInconvertibleData(connection, item, dataContainer, backupTag);
        ToolProperties toolProperties = (ToolProperties)dataContainer.get(StructuredDataKey.TOOL1_21_5);
        if (toolProperties != null && toolProperties.canDestroyBlocksInCreative()) {
            backupTag.putBoolean("tool", true);
        }
        if ((equippable = (Equippable)dataContainer.get(StructuredDataKey.EQUIPPABLE1_21_5)) != null && equippable.equipOnInteract()) {
            backupTag.putBoolean("equippable", true);
        }
        if ((weapon = (Weapon)dataContainer.get(StructuredDataKey.WEAPON)) != null) {
            CompoundTag weaponTag = new CompoundTag();
            backupTag.put("weapon", (Tag)weaponTag);
            weaponTag.putInt("item_damage_per_attack", weapon.itemDamagePerAttack());
            weaponTag.putFloat("disable_blocking_for_seconds", weapon.disableBlockingForSeconds());
        }
        if ((providesTrimMaterial = (ProvidesTrimMaterial)dataContainer.get(StructuredDataKey.PROVIDES_TRIM_MATERIAL1_21_5)) != null) {
            Tag materialTag = this.eitherHolderToTag(providesTrimMaterial.material(), (material, tag) -> {
                tag.putString("asset_name", material.assetName());
                tag.putInt("item_id", material.itemId());
                tag.putFloat("item_model_index", material.itemModelIndex());
                CompoundTag overrideArmorMaterials = new CompoundTag();
                material.overrideArmorMaterials().forEach((arg_0, arg_1) -> ((CompoundTag)overrideArmorMaterials).putString(arg_0, arg_1));
                tag.put("override_armor_materials", (Tag)overrideArmorMaterials);
                tag.put("description", material.description());
            });
            backupTag.put("provides_trim_material", materialTag);
        }
        if ((blocksAttacks = (BlocksAttacks)dataContainer.get(StructuredDataKey.BLOCKS_ATTACKS1_21_5)) != null) {
            CompoundTag blocksAttackTag = new CompoundTag();
            backupTag.put("blocks_attack", (Tag)blocksAttackTag);
            blocksAttackTag.putFloat("block_delay_seconds", blocksAttacks.blockDelaySeconds());
            blocksAttackTag.putFloat("disable_cooldown_scale", blocksAttacks.disableCooldownScale());
            ListTag damageReductions = new ListTag(CompoundTag.class);
            blocksAttackTag.put("damage_reductions", (Tag)damageReductions);
            for (BlocksAttacks.DamageReduction damageReduction : blocksAttacks.damageReductions()) {
                CompoundTag damageReductionTag = new CompoundTag();
                damageReductionTag.putFloat("horizontal_blocking_angle", damageReduction.horizontalBlockingAngle());
                if (damageReduction.type() != null) {
                    damageReductionTag.put("type", this.holderSetToTag(damageReduction.type()));
                }
                damageReductionTag.putFloat("base", damageReduction.base());
                damageReductionTag.putFloat("factor", damageReduction.factor());
                damageReductions.add((Tag)damageReductionTag);
            }
            CompoundTag itemDamageTag = new CompoundTag();
            blocksAttackTag.put("item_damage", (Tag)itemDamageTag);
            itemDamageTag.putFloat("threshold", blocksAttacks.itemDamage().threshold());
            itemDamageTag.putFloat("base", blocksAttacks.itemDamage().base());
            itemDamageTag.putFloat("factor", blocksAttacks.itemDamage().factor());
            if (blocksAttacks.bypassedBy() != null) {
                itemDamageTag.putString("bypassed_by", blocksAttacks.bypassedBy().tagKey());
            }
            if (blocksAttacks.blockSound() != null) {
                blocksAttackTag.put("block_sound", this.holderToTag(blocksAttacks.blockSound(), (x$0, x$1) -> this.saveSoundEvent((SoundEvent)x$0, (CompoundTag)x$1)));
            }
            if (blocksAttacks.disableSound() != null) {
                blocksAttackTag.put("disable_sound", this.holderToTag(blocksAttacks.disableSound(), (x$0, x$1) -> this.saveSoundEvent((SoundEvent)x$0, (CompoundTag)x$1)));
            }
        }
        if ((tooltipDisplay = (TooltipDisplay)dataContainer.get(StructuredDataKey.TOOLTIP_DISPLAY)) != null) {
            backupTag.put("hidden_components", (Tag)new IntArrayTag(tooltipDisplay.hiddenComponents().toIntArray()));
        }
        if ((tropicalFishPattern = (TropicalFishPattern)dataContainer.get(StructuredDataKey.TROPICAL_FISH_PATTERN)) != null) {
            backupTag.putInt("tropical_fish_pattern", tropicalFishPattern.packedId());
        }
        this.saveKeyData(StructuredDataKey.PROVIDES_BANNER_PATTERNS1_21_5, dataContainer, backupTag);
        this.saveFloatData(StructuredDataKey.POTION_DURATION_SCALE, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.VILLAGER_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.FOX_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.SALMON_SIZE, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.PARROT_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.TROPICAL_FISH_BASE_COLOR, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.TROPICAL_FISH_PATTERN_COLOR, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.MOOSHROOM_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.RABBIT_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.FROG_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.HORSE_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.LLAMA_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.AXOLOTL_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.CAT_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.CAT_COLLAR, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.SHEEP_COLOR, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.SHULKER_COLOR, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.WOLF_SOUND_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.COW_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.PIG_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.WOLF_VARIANT, dataContainer, backupTag);
        Either chickenVariant = (Either)dataContainer.get(StructuredDataKey.CHICKEN_VARIANT1_21_5);
        if (chickenVariant != null) {
            if (chickenVariant.isLeft()) {
                backupTag.putInt("chicken_variant", ((Integer)chickenVariant.left()).intValue());
            } else {
                backupTag.putString("chicken_variant", (String)chickenVariant.right());
            }
        }
        this.saveHolderData(StructuredDataKey.PAINTING_VARIANT, dataContainer, backupTag, (paintingVariant, tag) -> {
            tag.putInt("width", paintingVariant.width());
            tag.putInt("height", paintingVariant.height());
            tag.putString("asset_id", paintingVariant.assetId());
            if (paintingVariant.title() != null) {
                tag.put("title", paintingVariant.title());
            }
            if (paintingVariant.author() != null) {
                tag.put("author", paintingVariant.author());
            }
        });
        this.saveHolderData(StructuredDataKey.BREAK_SOUND, dataContainer, backupTag, (x$0, x$1) -> this.saveSoundEvent((SoundEvent)x$0, (CompoundTag)x$1));
    }

    protected void handleItemDataComponentsToServer(UserConnection connection, Item item, StructuredDataContainer container) {
        super.handleItemDataComponentsToServer(connection, item, container);
        com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.BlockItemPacketRewriter1_21_5.updateItemData((Item)item);
    }

    protected void handleItemDataComponentsToClient(UserConnection connection, Item item, StructuredDataContainer dataContainer) {
        super.handleItemDataComponentsToClient(connection, item, dataContainer);
        com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.BlockItemPacketRewriter1_21_5.downgradeItemData((Item)item);
    }

    protected void restoreBackupData(Item item, StructuredDataContainer data, CompoundTag customData) {
        IntTag chickenVariant;
        CompoundTag blocksAttackTag;
        Tag materialTag;
        CompoundTag weaponTag;
        super.restoreBackupData(item, data, customData);
        Tag tag2 = customData.remove(this.nbtTagName("backup"));
        if (!(tag2 instanceof CompoundTag)) {
            return;
        }
        CompoundTag backupTag = (CompoundTag)tag2;
        IntArrayTag hiddenComponentsTag = backupTag.getIntArrayTag("hidden_components");
        if (hiddenComponentsTag != null) {
            data.set(StructuredDataKey.TOOLTIP_DISPLAY, (Object)new TooltipDisplay(data.has(StructuredDataKey.HIDE_TOOLTIP), (IntSortedSet)new IntLinkedOpenHashSet(hiddenComponentsTag.getValue())));
        }
        if (backupTag.getBoolean("tool")) {
            data.replace(StructuredDataKey.TOOL1_20_5, StructuredDataKey.TOOL1_21_5, t -> new ToolProperties(t.rules(), t.defaultMiningSpeed(), t.damagePerBlock(), true));
        }
        if (backupTag.getBoolean("equippable")) {
            data.replace(StructuredDataKey.EQUIPPABLE1_21_2, StructuredDataKey.EQUIPPABLE1_21_5, e -> new Equippable(e.equipmentSlot(), e.soundEvent(), e.model(), e.cameraOverlay(), e.allowedEntities(), e.dispensable(), e.swappable(), e.damageOnHurt(), true));
        }
        if ((weaponTag = backupTag.getCompoundTag("weapon")) != null) {
            data.set(StructuredDataKey.WEAPON, (Object)new Weapon(weaponTag.getInt("item_damage_per_attack"), weaponTag.getFloat("disable_blocking_for_seconds")));
        }
        if ((materialTag = backupTag.get("provides_trim_material")) != null) {
            data.set(StructuredDataKey.PROVIDES_TRIM_MATERIAL1_21_5, (Object)new ProvidesTrimMaterial(this.restoreEitherHolder(backupTag, "provides_trim_material", tag -> {
                String assetName = tag.getString("asset_name");
                int itemId = tag.getInt("item_id");
                float itemModelIndex = tag.getFloat("item_model_index");
                CompoundTag overrideArmorMaterialsTag = tag.getCompoundTag("override_armor_materials");
                HashMap<String, String> overrideArmorMaterials = new HashMap<String, String>();
                for (String key : overrideArmorMaterialsTag.keySet()) {
                    overrideArmorMaterials.put(key, overrideArmorMaterialsTag.getString(key));
                }
                Tag description = tag.get("description");
                return new ArmorTrimMaterial(assetName, itemId, itemModelIndex, overrideArmorMaterials, description);
            })));
        }
        if ((blocksAttackTag = backupTag.getCompoundTag("blocks_attack")) != null) {
            float blockDelaySeconds = blocksAttackTag.getFloat("block_delay_seconds");
            float disableCooldownScale = blocksAttackTag.getFloat("disable_cooldown_scale");
            CompoundTag itemDamageTag = blocksAttackTag.getCompoundTag("item_damage");
            BlocksAttacks.ItemDamageFunction itemDamage = new BlocksAttacks.ItemDamageFunction(itemDamageTag.getFloat("threshold"), itemDamageTag.getFloat("base"), itemDamageTag.getFloat("factor"));
            String bypassedBy = blocksAttackTag.getString("bypassed_by");
            Holder blockSound = blocksAttackTag.contains("block_sound") ? this.restoreHolder(blocksAttackTag, "block_sound", this::tagToSound) : null;
            Holder disableSound = blocksAttackTag.contains("disable_sound") ? this.restoreHolder(blocksAttackTag, "disable_sound", this::tagToSound) : null;
            ArrayList<BlocksAttacks.DamageReduction> damageReductions = new ArrayList<BlocksAttacks.DamageReduction>();
            for (CompoundTag damageReductionTag : blocksAttackTag.getListTag("damage_reductions", CompoundTag.class)) {
                float horizontalBlockingAngle = damageReductionTag.getFloat("horizontal_blocking_angle");
                HolderSet type = damageReductionTag.contains("type") ? this.restoreHolderSet(damageReductionTag, "type") : null;
                float base = damageReductionTag.getFloat("base");
                float factor = damageReductionTag.getFloat("factor");
                damageReductions.add(new BlocksAttacks.DamageReduction(horizontalBlockingAngle, type, base, factor));
            }
            data.set(StructuredDataKey.BLOCKS_ATTACKS1_21_5, (Object)new BlocksAttacks(blockDelaySeconds, disableCooldownScale, damageReductions.toArray(new BlocksAttacks.DamageReduction[0]), itemDamage, bypassedBy != null ? HolderSet.of((String)bypassedBy) : null, blockSound, disableSound));
        }
        if ((chickenVariant = backupTag.getIntTag("chicken_variant")) != null) {
            data.set(StructuredDataKey.CHICKEN_VARIANT1_21_5, (Object)Either.left((Object)chickenVariant.asInt()));
        } else {
            String chickenVariantKey = backupTag.getString("chicken_variant");
            if (chickenVariantKey != null) {
                data.set(StructuredDataKey.CHICKEN_VARIANT1_21_5, (Object)Either.right((Object)chickenVariantKey));
            }
        }
        IntTag tropicalFishPattern = backupTag.getIntTag("tropical_fish_pattern");
        if (tropicalFishPattern != null) {
            data.set(StructuredDataKey.TROPICAL_FISH_PATTERN, (Object)new TropicalFishPattern(tropicalFishPattern.asInt()));
        }
        this.restoreKeyData(StructuredDataKey.PROVIDES_BANNER_PATTERNS1_21_5, data, backupTag);
        this.restoreFloatData(StructuredDataKey.POTION_DURATION_SCALE, data, backupTag);
        this.restoreIntData(StructuredDataKey.VILLAGER_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.FOX_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.SALMON_SIZE, data, backupTag);
        this.restoreIntData(StructuredDataKey.PARROT_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.TROPICAL_FISH_BASE_COLOR, data, backupTag);
        this.restoreIntData(StructuredDataKey.TROPICAL_FISH_PATTERN_COLOR, data, backupTag);
        this.restoreIntData(StructuredDataKey.MOOSHROOM_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.RABBIT_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.FROG_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.HORSE_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.LLAMA_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.AXOLOTL_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.CAT_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.CAT_COLLAR, data, backupTag);
        this.restoreIntData(StructuredDataKey.SHEEP_COLOR, data, backupTag);
        this.restoreIntData(StructuredDataKey.SHULKER_COLOR, data, backupTag);
        this.restoreIntData(StructuredDataKey.WOLF_SOUND_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.COW_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.PIG_VARIANT, data, backupTag);
        this.restoreIntData(StructuredDataKey.WOLF_VARIANT, data, backupTag);
        this.restoreHolderData(StructuredDataKey.BREAK_SOUND, data, backupTag, this::tagToSound);
        this.restoreHolderData(StructuredDataKey.PAINTING_VARIANT, data, backupTag, tag -> {
            int width = tag.getInt("width");
            int height = tag.getInt("height");
            String assetId = tag.getString("asset_id");
            Tag title = tag.get("title");
            Tag author = tag.get("author");
            return new PaintingVariant(width, height, assetId, title, author);
        });
        this.removeCustomTag(data, customData);
    }

    public void registerPackets() {
        ((Protocol1_21_5To1_21_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_5.LEVEL_CHUNK_WITH_LIGHT, wrapper -> {
            EntityTracker tracker = ((Protocol1_21_5To1_21_4)this.protocol).getEntityRewriter().tracker(wrapper.user());
            Mappings blockStateMappings = ((Protocol1_21_5To1_21_4)this.protocol).getMappingData().getBlockStateMappings();
            ChunkType1_21_5 chunkType = new ChunkType1_21_5(tracker.currentWorldSectionHeight(), MathUtil.ceilLog2((int)blockStateMappings.size()), MathUtil.ceilLog2((int)tracker.biomesSent()));
            Chunk chunk = (Chunk)wrapper.read((Type)chunkType);
            ((Protocol1_21_5To1_21_4)this.protocol).getBlockRewriter().handleChunk(chunk);
            ((Protocol1_21_5To1_21_4)this.protocol).getBlockRewriter().handleBlockEntities(chunk, wrapper.user());
            ChunkType1_20_2 newChunkType = new ChunkType1_20_2(tracker.currentWorldSectionHeight(), MathUtil.ceilLog2((int)blockStateMappings.mappedSize()), MathUtil.ceilLog2((int)tracker.biomesSent()));
            CompoundTag heightmapTag = new CompoundTag();
            for (Heightmap heightmap : chunk.heightmaps()) {
                String typeKey = this.heightmapType(heightmap.type());
                if (typeKey == null) {
                    ((Protocol1_21_5To1_21_4)this.protocol).getLogger().warning("Unknown heightmap type id: " + heightmap.type());
                    continue;
                }
                heightmapTag.put(typeKey, (Tag)new LongArrayTag(heightmap.data()));
            }
            Chunk1_18 mappedChunk = new Chunk1_18(chunk.getX(), chunk.getZ(), chunk.getSections(), heightmapTag, chunk.blockEntities());
            wrapper.write((Type)newChunkType, (Object)mappedChunk);
        });
        ((Protocol1_21_5To1_21_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_5.CHUNKS_BIOMES, wrapper -> {
            EntityTracker tracker = ((Protocol1_21_5To1_21_4)this.protocol).getEntityRewriter().tracker(wrapper.user());
            int globalPaletteBiomeBits = MathUtil.ceilLog2((int)tracker.biomesSent());
            ChunkBiomesType1_21_5 biomesType = new ChunkBiomesType1_21_5(tracker.currentWorldSectionHeight(), globalPaletteBiomeBits);
            ChunkBiomesType1_19_4 newBiomesType = new ChunkBiomesType1_19_4(tracker.currentWorldSectionHeight(), globalPaletteBiomeBits);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.CHUNK_POSITION);
                wrapper.passthroughAndMap((Type)biomesType, (Type)newBiomesType);
            }
        });
        ((Protocol1_21_5To1_21_4)this.protocol).replaceServerbound((ServerboundPacketType)ServerboundPackets1_21_4.SET_CREATIVE_MODE_SLOT, wrapper -> {
            wrapper.passthrough((Type)Types.SHORT);
            Item item = this.handleItemToServer(wrapper.user(), (Item)wrapper.read(this.mappedItemType()));
            wrapper.write(VersionedTypes.V1_21_5.lengthPrefixedItem(), (Object)item);
        });
        ((Protocol1_21_5To1_21_4)this.protocol).replaceServerbound((ServerboundPacketType)ServerboundPackets1_21_4.CONTAINER_CLICK, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.SHORT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            HashedItemConverterStorage hashedItemConverter = (HashedItemConverterStorage)wrapper.user().get(HashedItemConverterStorage.class);
            int affectedItems = Limit.max((int)((Integer)wrapper.passthrough((Type)Types.VAR_INT)), (int)128);
            for (int i = 0; i < affectedItems; ++i) {
                wrapper.passthrough((Type)Types.SHORT);
                this.itemToHashedItem(wrapper, hashedItemConverter);
            }
            this.itemToHashedItem(wrapper, hashedItemConverter);
        });
        ((Protocol1_21_5To1_21_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_5.SET_EQUIPMENT, wrapper -> {
            byte value;
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            TrackedEntity trackedEntity = ((Protocol1_21_5To1_21_4)this.protocol).getEntityRewriter().tracker(wrapper.user()).entity(entityId);
            IntArrayList keptSlots = new IntArrayList();
            ArrayList<Item> keptItems = new ArrayList<Item>();
            do {
                value = (Byte)wrapper.read((Type)Types.BYTE);
                int equipmentSlot = value & 0x7F;
                Item item = (Item)wrapper.read(this.itemType());
                if (equipmentSlot == 7) {
                    if (trackedEntity == null || !trackedEntity.entityType().isOrHasParent((EntityType)EntityTypes1_21_5.ABSTRACT_HORSE) && !trackedEntity.entityType().isOrHasParent((EntityType)EntityTypes1_21_5.PIG) && !trackedEntity.entityType().isOrHasParent((EntityType)EntityTypes1_21_5.STRIDER)) continue;
                    this.sendSaddledEntityData(wrapper.user(), trackedEntity, entityId, item.identifier() == 800);
                    continue;
                }
                keptSlots.add(equipmentSlot);
                keptItems.add(this.handleItemToClient(wrapper.user(), item));
            } while (value < 0);
            if (keptSlots.isEmpty()) {
                wrapper.cancel();
                return;
            }
            for (int i = 0; i < keptSlots.size(); ++i) {
                int slot = keptSlots.getInt(i);
                boolean more = i < keptSlots.size() - 1;
                wrapper.write((Type)Types.BYTE, (Object)((byte)(more ? slot | 0xFFFFFF80 : slot)));
                wrapper.write(this.mappedItemType(), (Object)((Item)keptItems.get(i)));
            }
        });
        ((Protocol1_21_5To1_21_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_5.UPDATE_ADVANCEMENTS, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    Tag title = (Tag)wrapper.passthrough(Types.TRUSTED_TAG);
                    Tag description = (Tag)wrapper.passthrough(Types.TRUSTED_TAG);
                    ComponentRewriter1_21_5 componentRewriter = ((Protocol1_21_5To1_21_4)this.protocol).getComponentRewriter();
                    if (componentRewriter != null) {
                        componentRewriter.processTag(wrapper.user(), title);
                        componentRewriter.processTag(wrapper.user(), description);
                    }
                    this.passthroughClientboundItem(wrapper);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    int flags = (Integer)wrapper.passthrough((Type)Types.INT);
                    if ((flags & 1) != 0) {
                        this.convertClientAsset(wrapper);
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
            wrapper.passthrough(Types.STRING_ARRAY);
            int progressSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < progressSize; ++i) {
                wrapper.passthrough(Types.STRING);
                int criterionSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int j = 0; j < criterionSize; ++j) {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough(Types.OPTIONAL_LONG);
                }
            }
            wrapper.read((Type)Types.BOOLEAN);
        });
    }

    private void convertClientAsset(PacketWrapper wrapper) {
        String background = (String)wrapper.read(Types.STRING);
        String namespace = Key.namespace((String)background);
        String path = Key.stripNamespace((String)background);
        wrapper.write(Types.STRING, (Object)(namespace + ":textures/" + path + ".png"));
    }

    private String heightmapType(int id) {
        return switch (id) {
            case 0 -> "WORLD_SURFACE_WG";
            case 1 -> "WORLD_SURFACE";
            case 2 -> "OCEAN_FLOOR_WG";
            case 3 -> "OCEAN_FLOOR";
            case 4 -> "MOTION_BLOCKING";
            case 5 -> "MOTION_BLOCKING_NO_LEAVES";
            default -> null;
        };
    }

    private void itemToHashedItem(PacketWrapper wrapper, HashedItemConverterStorage hashedItemConverter) {
        Item item = (Item)wrapper.read(this.mappedItemType());
        OriginalHashedItem originalHash = this.originalHashedItemFromBackup(item);
        if (originalHash != null) {
            wrapper.write(Types.HASHED_ITEM, (Object)originalHash);
        } else {
            Item serverItem = this.handleItemToServer(wrapper.user(), item);
            wrapper.write(Types.HASHED_ITEM, (Object)ItemHasherBase.toHashedItem((Hasher)hashedItemConverter.hasher(), (Item)serverItem));
        }
    }

    private void sendSaddledEntityData(UserConnection connection, TrackedEntity trackedEntity, int entityId, boolean saddled) {
        EntityData entityData = null;
        if (trackedEntity.entityType().isOrHasParent((EntityType)EntityTypes1_21_5.ABSTRACT_HORSE)) {
            HorseDataStorage horseDataStorage;
            byte data = 0;
            if (trackedEntity.hasData() && (horseDataStorage = (HorseDataStorage)trackedEntity.data().get(HorseDataStorage.class)) != null) {
                if (horseDataStorage.saddled() == saddled) {
                    return;
                }
                data = horseDataStorage.data();
            }
            trackedEntity.data().put((Object)new HorseDataStorage(data, saddled));
            if (saddled) {
                data = (byte)(data | 4);
            }
            entityData = new EntityData(17, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).byteType, (Object)data);
        } else if (trackedEntity.entityType().isOrHasParent((EntityType)EntityTypes1_21_5.PIG)) {
            entityData = new EntityData(17, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).booleanType, (Object)saddled);
        } else if (trackedEntity.entityType().isOrHasParent((EntityType)EntityTypes1_21_5.STRIDER)) {
            entityData = new EntityData(19, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).booleanType, (Object)saddled);
        }
        if (entityData != null) {
            PacketWrapper entityDataPacket = PacketWrapper.create((PacketType)ClientboundPackets1_21_2.SET_ENTITY_DATA, (UserConnection)connection);
            ArrayList<EntityData> entityDataList = new ArrayList<EntityData>();
            entityDataList.add(entityData);
            entityDataPacket.write((Type)Types.VAR_INT, (Object)entityId);
            entityDataPacket.write(VersionedTypes.V1_21_4.entityDataList, entityDataList);
            entityDataPacket.send(Protocol1_21_5To1_21_4.class);
        }
    }

    private SoundEvent tagToSound(CompoundTag tag) {
        String identifier = tag.getString("identifier");
        FloatTag fixedRangeTag = tag.getFloatTag("fixed_range");
        return new SoundEvent(identifier, fixedRangeTag != null ? Float.valueOf(fixedRangeTag.asFloat()) : null);
    }

    private @Nullable OriginalHashedItem originalHashedItemFromBackup(Item item) {
        CompoundTag originalHashes;
        CompoundTag customData = (CompoundTag)item.dataContainer().get(StructuredDataKey.CUSTOM_DATA);
        if (customData == null || (originalHashes = customData.getCompoundTag("VV|original_hashes")) == null) {
            return null;
        }
        return this.backedUpOriginalHashes(originalHashes, item);
    }
}

