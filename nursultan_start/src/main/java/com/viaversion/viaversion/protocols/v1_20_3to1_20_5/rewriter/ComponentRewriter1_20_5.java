/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.FloatTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.GameProfile
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  com.viaversion.viaversion.api.minecraft.GlobalBlockPosition
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.data.StructuredData
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.minecraft.item.data.AdventureModePredicate
 *  com.viaversion.viaversion.api.minecraft.item.data.ArmorTrim
 *  com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimMaterial
 *  com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimPattern
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_20_5
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_20_5$AttributeModifier
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_20_5$ModifierData
 *  com.viaversion.viaversion.api.minecraft.item.data.BannerPattern
 *  com.viaversion.viaversion.api.minecraft.item.data.BannerPatternLayer
 *  com.viaversion.viaversion.api.minecraft.item.data.Bee
 *  com.viaversion.viaversion.api.minecraft.item.data.BlockPredicate
 *  com.viaversion.viaversion.api.minecraft.item.data.BlockStateProperties
 *  com.viaversion.viaversion.api.minecraft.item.data.DebugStickState
 *  com.viaversion.viaversion.api.minecraft.item.data.DyedColor
 *  com.viaversion.viaversion.api.minecraft.item.data.Enchantments
 *  com.viaversion.viaversion.api.minecraft.item.data.FilterableComponent
 *  com.viaversion.viaversion.api.minecraft.item.data.FilterableString
 *  com.viaversion.viaversion.api.minecraft.item.data.FireworkExplosion
 *  com.viaversion.viaversion.api.minecraft.item.data.Fireworks
 *  com.viaversion.viaversion.api.minecraft.item.data.FoodProperties1_20_5
 *  com.viaversion.viaversion.api.minecraft.item.data.FoodProperties1_20_5$FoodEffect
 *  com.viaversion.viaversion.api.minecraft.item.data.Instrument1_20_5
 *  com.viaversion.viaversion.api.minecraft.item.data.LodestoneTracker
 *  com.viaversion.viaversion.api.minecraft.item.data.PotDecorations
 *  com.viaversion.viaversion.api.minecraft.item.data.PotionContents
 *  com.viaversion.viaversion.api.minecraft.item.data.PotionEffect
 *  com.viaversion.viaversion.api.minecraft.item.data.PotionEffectData
 *  com.viaversion.viaversion.api.minecraft.item.data.StatePropertyMatcher
 *  com.viaversion.viaversion.api.minecraft.item.data.StatePropertyMatcher$RangedMatcher
 *  com.viaversion.viaversion.api.minecraft.item.data.SuspiciousStewEffect
 *  com.viaversion.viaversion.api.minecraft.item.data.ToolProperties
 *  com.viaversion.viaversion.api.minecraft.item.data.ToolRule
 *  com.viaversion.viaversion.api.minecraft.item.data.Unbreakable
 *  com.viaversion.viaversion.api.minecraft.item.data.WritableBook
 *  com.viaversion.viaversion.api.minecraft.item.data.WrittenBook
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.types.item.StructuredDataType
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap$Entry
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectOpenHashMap
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.ArmorMaterials1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Attributes1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.BannerPatterns1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.DyeColors
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Enchantments1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.EquipmentSlots1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Instruments1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.PotionEffects1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Potions1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ArmorTrimStorage
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.util.Either
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.MathUtil
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.StringUtil
 *  com.viaversion.viaversion.util.UUIDUtil
 *  com.viaversion.viaversion.util.Unit
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter;

import com.google.common.base.Preconditions;
import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.FloatTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.minecraft.GlobalBlockPosition;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.data.StructuredData;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.minecraft.item.data.AdventureModePredicate;
import com.viaversion.viaversion.api.minecraft.item.data.ArmorTrim;
import com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimMaterial;
import com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimPattern;
import com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_20_5;
import com.viaversion.viaversion.api.minecraft.item.data.BannerPattern;
import com.viaversion.viaversion.api.minecraft.item.data.BannerPatternLayer;
import com.viaversion.viaversion.api.minecraft.item.data.Bee;
import com.viaversion.viaversion.api.minecraft.item.data.BlockPredicate;
import com.viaversion.viaversion.api.minecraft.item.data.BlockStateProperties;
import com.viaversion.viaversion.api.minecraft.item.data.DebugStickState;
import com.viaversion.viaversion.api.minecraft.item.data.DyedColor;
import com.viaversion.viaversion.api.minecraft.item.data.Enchantments;
import com.viaversion.viaversion.api.minecraft.item.data.FilterableComponent;
import com.viaversion.viaversion.api.minecraft.item.data.FilterableString;
import com.viaversion.viaversion.api.minecraft.item.data.FireworkExplosion;
import com.viaversion.viaversion.api.minecraft.item.data.Fireworks;
import com.viaversion.viaversion.api.minecraft.item.data.FoodProperties1_20_5;
import com.viaversion.viaversion.api.minecraft.item.data.Instrument1_20_5;
import com.viaversion.viaversion.api.minecraft.item.data.LodestoneTracker;
import com.viaversion.viaversion.api.minecraft.item.data.PotDecorations;
import com.viaversion.viaversion.api.minecraft.item.data.PotionContents;
import com.viaversion.viaversion.api.minecraft.item.data.PotionEffect;
import com.viaversion.viaversion.api.minecraft.item.data.PotionEffectData;
import com.viaversion.viaversion.api.minecraft.item.data.StatePropertyMatcher;
import com.viaversion.viaversion.api.minecraft.item.data.SuspiciousStewEffect;
import com.viaversion.viaversion.api.minecraft.item.data.ToolProperties;
import com.viaversion.viaversion.api.minecraft.item.data.ToolRule;
import com.viaversion.viaversion.api.minecraft.item.data.Unbreakable;
import com.viaversion.viaversion.api.minecraft.item.data.WritableBook;
import com.viaversion.viaversion.api.minecraft.item.data.WrittenBook;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.types.item.StructuredDataType;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectOpenHashMap;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.Protocol1_20_3To1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.ArmorMaterials1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Attributes1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.BannerPatterns1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.DyeColors;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Enchantments1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.EquipmentSlots1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Instruments1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.PotionEffects1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Potions1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.BlockItemPacketRewriter1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ArmorTrimStorage;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.util.Either;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.MathUtil;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.StringUtil;
import com.viaversion.viaversion.util.UUIDUtil;
import com.viaversion.viaversion.util.Unit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import org.checkerframework.checker.nullness.qual.Nullable;

public class ComponentRewriter1_20_5<C extends ClientboundPacketType>
extends JsonNBTComponentRewriter<C> {
    protected final Map<StructuredDataKey<?>, ConverterPair<?>> converters = new Reference2ObjectOpenHashMap();
    protected final StructuredDataType structuredDataType;

    protected ByteTag enchantmentGlintOverrideToTag(Boolean value) {
        return new ByteTag(value.booleanValue());
    }

    public CompoundTag toTag(UserConnection connection, Map<StructuredDataKey<?>, StructuredData<?>> data) {
        CompoundTag tag = new CompoundTag();
        for (Map.Entry<StructuredDataKey<?>, StructuredData<?>> entry : data.entrySet()) {
            StructuredDataKey<?> key = entry.getKey();
            String identifier = key.identifier();
            ConverterPair<?> converter = this.converters.get(key);
            if (converter == null) {
                Via.getPlatform().getLogger().severe("No converter found for data component: " + identifier);
                continue;
            }
            StructuredData<?> value = entry.getValue();
            if (value.isEmpty()) {
                tag.put("!" + identifier, (Tag)new CompoundTag());
                continue;
            }
            Tag valueTag = converter.dataConverter.convert(connection, value.value());
            if (valueTag == null) continue;
            tag.put(identifier, valueTag);
        }
        return tag;
    }

    public ComponentRewriter1_20_5(Protocol<C, ?, ?, ?> protocol, StructuredDataType structuredDataType) {
        super(protocol, ComponentRewriterBase.ReadType.NBT);
        this.structuredDataType = structuredDataType;
        this.register(StructuredDataKey.CUSTOM_DATA, this::customDataToTag, this::customDataFromTag);
        this.register(StructuredDataKey.MAX_STACK_SIZE, this::maxStackSizeToTag, this::maxStackSizeFromTag);
        this.register(StructuredDataKey.MAX_DAMAGE, this::maxDamageToTag, this::maxDamageFromTag);
        this.register(StructuredDataKey.DAMAGE, this::damageToTag, this::damageFromTag);
        this.register(StructuredDataKey.UNBREAKABLE1_20_5, this::unbreakableToTag, this::unbreakableFromTag);
        this.register(StructuredDataKey.CUSTOM_NAME, this::customNameToTag, this::customNameFromTag);
        this.register(StructuredDataKey.ITEM_NAME, this::itemNameToTag, this::itemNameFromTag);
        this.register(StructuredDataKey.LORE, this::loreToTag, this::loreFromTag);
        this.register(StructuredDataKey.RARITY, this::rarityToTag, this::rarityFromTag);
        this.register(StructuredDataKey.ENCHANTMENTS1_20_5, this::enchantmentsToTag, this::enchantmentsFromTag);
        this.register(StructuredDataKey.CAN_PLACE_ON1_20_5, this::canPlaceOnToTag, this::canPlaceOnFromTag);
        this.register(StructuredDataKey.CAN_BREAK1_20_5, this::canBreakToTag, this::canBreakFromTag);
        this.register(StructuredDataKey.ATTRIBUTE_MODIFIERS1_20_5, this::attributeModifiersToTag, this::attributeModifiersFromTag);
        this.register(StructuredDataKey.CUSTOM_MODEL_DATA1_20_5, this::customModelDataToTag, this::customModelDataFromTag);
        this.register(StructuredDataKey.HIDE_ADDITIONAL_TOOLTIP, this::hideAdditionalTooltipToTag, this::hideAdditionalTooltipFromTag);
        this.register(StructuredDataKey.HIDE_TOOLTIP, this::hideTooltipToTag, this::hideTooltipFromTag);
        this.register(StructuredDataKey.REPAIR_COST, this::repairCostToTag, this::repairCostFromTag);
        this.register(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, this::enchantmentGlintOverrideToTag, this::enchantmentGlintOverrideFromTag);
        this.registerEmpty(StructuredDataKey.CREATIVE_SLOT_LOCK);
        this.register(StructuredDataKey.INTANGIBLE_PROJECTILE, this::intangibleProjectileToTag, this::intangibleProjectileFromTag);
        this.register(StructuredDataKey.FOOD1_20_5, this::foodToTag, this::foodFromTag);
        this.register(StructuredDataKey.FIRE_RESISTANT, this::fireResistantToTag, this::fireResistantFromTag);
        this.register(StructuredDataKey.TOOL1_20_5, this::toolToTag, this::toolFromTag);
        this.register(StructuredDataKey.STORED_ENCHANTMENTS1_20_5, this::storedEnchantmentsToTag, this::storedEnchantmentsFromTag);
        this.register(StructuredDataKey.DYED_COLOR1_20_5, this::dyedColorToTag, this::dyedColorFromTag);
        this.register(StructuredDataKey.MAP_COLOR, this::mapColorToTag, this::mapColorFromTag);
        this.register(StructuredDataKey.MAP_ID, this::mapIdToTag, this::mapIdFromTag);
        this.register(StructuredDataKey.MAP_DECORATIONS, this::mapDecorationsToTag, this::mapDecorationsFromTag);
        this.registerEmpty(StructuredDataKey.MAP_POST_PROCESSING);
        this.register(StructuredDataKey.V1_20_5.chargedProjectiles, this::chargedProjectilesToTag, this::chargedProjectilesFromTag);
        this.register(StructuredDataKey.V1_20_5.bundleContents, this::bundleContentsToTag, this::bundleContentsFromTag);
        this.register(StructuredDataKey.POTION_CONTENTS1_20_5, this::potionContentsToTag, this::potionContentsFromTag);
        this.register(StructuredDataKey.SUSPICIOUS_STEW_EFFECTS, this::suspiciousStewEffectsToTag, this::suspiciousStewEffectsFromTag);
        this.register(StructuredDataKey.WRITABLE_BOOK_CONTENT, this::writableBookContentToTag, this::writableBookContentFromTag);
        this.register(StructuredDataKey.WRITTEN_BOOK_CONTENT, this::writtenBookContentToTag, this::writtenBookContentFromTag);
        this.register(StructuredDataKey.TRIM1_20_5, this::trimToTag, this::trimFromTag);
        this.register(StructuredDataKey.DEBUG_STICK_STATE, this::debugStickStateToTag, this::debugStickStateFromTag);
        this.register(StructuredDataKey.ENTITY_DATA1_20_5, this::entityDataToTag, this::entityDataFromTag);
        this.register(StructuredDataKey.BUCKET_ENTITY_DATA, this::bucketEntityDataToTag, this::bucketEntityDataFromTag);
        this.register(StructuredDataKey.BLOCK_ENTITY_DATA1_20_5, this::blockEntityDataToTag, this::blockEntityDataFromTag);
        this.register(StructuredDataKey.INSTRUMENT1_20_5, this::instrumentToTag, this::instrumentFromTag);
        this.register(StructuredDataKey.OMINOUS_BOTTLE_AMPLIFIER, this::ominousBottleAmplifierToTag, this::ominousBottleAmplifierFromTag);
        this.register(StructuredDataKey.RECIPES, this::recipesToTag, this::recipesFromTag);
        this.register(StructuredDataKey.LODESTONE_TRACKER, this::lodestoneTrackerToTag, this::lodestoneTrackerFromTag);
        this.register(StructuredDataKey.FIREWORK_EXPLOSION, this::fireworkExplosionToTag, this::fireworkExplosionFromTag);
        this.register(StructuredDataKey.FIREWORKS, this::fireworksToTag, this::fireworksFromTag);
        this.register(StructuredDataKey.PROFILE1_20_5, this::profileToTag, this::profileFromTag);
        this.register(StructuredDataKey.NOTE_BLOCK_SOUND, this::noteBlockSoundToTag, this::noteBlockSoundFromTag);
        this.register(StructuredDataKey.BANNER_PATTERNS, this::bannerPatternsToTag, this::bannerPatternsFromTag);
        this.register(StructuredDataKey.BASE_COLOR, this::baseColorToTag, this::baseColorFromTag);
        this.register(StructuredDataKey.POT_DECORATIONS, this::potDecorationsToTag, this::potDecorationsFromTag);
        this.register(StructuredDataKey.V1_20_5.container, this::containerToTag, this::containerFromTag);
        this.register(StructuredDataKey.BLOCK_STATE, this::blockStateToTag, this::blockStateFromTag);
        this.register(StructuredDataKey.BEES1_20_5, this::beesToTag, this::beesFromTag);
        this.register(StructuredDataKey.LOCK1_20_5, this::lockToTag, this::lockFromTag);
        this.register(StructuredDataKey.CONTAINER_LOOT, this::containerLootToTag, this::containerLootFromTag);
    }

    protected <T> void register(StructuredDataKey<T> key, DataConverter<T> dataConverter, TagConverter<T> tagConverter) {
        this.converters.put(key, new ConverterPair<T>(dataConverter, tagConverter));
    }

    protected <T> void register(StructuredDataKey<T> key, SimpleDataConverter<T> dataConverter, SimpleTagConverter<T> tagConverter) {
        DataConverter<Object> converter = ($, value) -> dataConverter.convert(value);
        this.converters.put(key, new ConverterPair<Object>(converter, (connection, tag) -> tagConverter.convert(tag)));
    }

    private String mappedIdentifier(int id) {
        return Protocol1_20_3To1_20_5.MAPPINGS.getFullItemMappings().mappedIdentifier(id);
    }

    protected void handleHoverEvent(UserConnection connection, CompoundTag hoverEventTag) {
        super.handleHoverEvent(connection, hoverEventTag);
        StringTag actionTag = hoverEventTag.getStringTag("action");
        if (actionTag == null) {
            return;
        }
        if (actionTag.getValue().equals("show_entity")) {
            CompoundTag contentsTag = hoverEventTag.getCompoundTag("contents");
            if (contentsTag == null) {
                return;
            }
            if (this.protocol.getMappingData().getEntityMappings().mappedId(contentsTag.getString("type")) == -1) {
                contentsTag.put("type", (Tag)new StringTag("pig"));
            }
        }
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, @Nullable CompoundTag componentsTag) {
        Item structuredItem;
        CompoundTag tagTag;
        super.handleShowItem(connection, itemTag, componentsTag);
        StringTag idTag = itemTag.getStringTag("id");
        if (idTag == null) {
            return;
        }
        int itemId = Protocol1_20_3To1_20_5.MAPPINGS.getFullItemMappings().id(idTag.getValue());
        if (itemId == -1) {
            itemId = 1;
        }
        StringTag tag = (StringTag)itemTag.remove("tag");
        try {
            tagTag = tag != null ? (CompoundTag)this.inputSerializerVersion().toTag(tag.getValue()) : null;
        }
        catch (Exception e) {
            if (Via.getConfig().logTextComponentConversionErrors()) {
                this.protocol.getLogger().log(Level.WARNING, "Error reading NBT in show_item: " + StringUtil.forLogging((Object)itemTag), (Throwable)e);
            }
            return;
        }
        DataItem dataItem = new DataItem();
        dataItem.setIdentifier(itemId);
        if (tagTag != null) {
            dataItem.setTag(tagTag);
        }
        if ((structuredItem = this.protocol.getItemRewriter().handleItemToClient(connection, (Item)dataItem)).amount() < 1) {
            structuredItem.setAmount(1);
        }
        if (structuredItem.identifier() != 0) {
            String identifier = this.mappedIdentifier(structuredItem.identifier());
            if (identifier != null) {
                itemTag.putString("id", identifier);
            }
        } else {
            itemTag.putString("id", "minecraft:stone");
        }
        Map data = structuredItem.dataContainer().data();
        if (!data.isEmpty()) {
            CompoundTag components;
            try {
                components = this.toTag(connection, data);
            }
            catch (Exception e) {
                if (Via.getConfig().logTextComponentConversionErrors()) {
                    this.protocol.getLogger().log(Level.WARNING, "Error writing components in show_item!", (Throwable)e);
                }
                return;
            }
            itemTag.put("components", (Tag)components);
        }
    }

    protected Unit hideAdditionalTooltipFromTag(Tag value) {
        return Unit.INSTANCE;
    }

    protected Integer asInt(Tag tag) {
        return ((NumberTag)tag).asInt();
    }

    protected Boolean asBoolean(Tag tag) {
        return ((ByteTag)tag).asByte() != 0;
    }

    protected @Nullable SerializerVersion inputSerializerVersion() {
        return SerializerVersion.V1_20_3;
    }

    protected @Nullable SerializerVersion outputSerializerVersion() {
        return SerializerVersion.V1_20_5;
    }

    protected SuspiciousStewEffect[] suspiciousStewEffectsFromTag(Tag tag) {
        ListTag value = (ListTag)tag;
        ArrayList<SuspiciousStewEffect> list = new ArrayList<SuspiciousStewEffect>();
        for (CompoundTag effectTag : value) {
            int id = PotionEffects1_20_5.keyToId((String)effectTag.getString("id", ""));
            int duration = effectTag.getInt("duration", 160);
            list.add(new SuspiciousStewEffect(id, duration));
        }
        return (SuspiciousStewEffect[])list.toArray(SuspiciousStewEffect[]::new);
    }

    protected Integer ominousBottleAmplifierFromTag(Tag value) {
        return this.checkIntRange(0, 4, this.asInt(value));
    }

    protected Boolean enchantmentGlintOverrideFromTag(Tag value) {
        return this.asBoolean(value);
    }

    protected Tag intangibleProjectileFromTag(Tag value) {
        return value;
    }

    protected IntTag ominousBottleAmplifierToTag(Integer value) {
        return this.intRangeToTag(value, 0, 4);
    }

    protected Integer customModelDataFromTag(Tag value) {
        return this.asInt(value);
    }

    protected CompoundTag hideAdditionalTooltipToTag(Unit value) {
        return this.unitToTag();
    }

    protected CompoundTag intangibleProjectileToTag(Tag value) {
        return this.unitToTag();
    }

    protected Enchantments enchantmentsFromTag(Tag tag) {
        CompoundTag compoundTag = (CompoundTag)tag;
        Int2IntOpenHashMap enchantments = new Int2IntOpenHashMap();
        CompoundTag levels = compoundTag.getCompoundTag("levels");
        if (levels == null) {
            return null;
        }
        for (Map.Entry level : levels) {
            int id = Enchantments1_20_5.keyToId((String)((String)level.getKey()));
            if (id == -1) continue;
            enchantments.put(id, this.checkIntRange(0, 255, this.asInt((Tag)level.getValue())));
        }
        return new Enchantments((Int2IntMap)enchantments, compoundTag.getBoolean("show_in_tooltip", true));
    }

    protected CompoundTag attributeModifiersToTag(AttributeModifiers1_20_5 value) {
        CompoundTag tag = new CompoundTag();
        ListTag modifiers = new ListTag(CompoundTag.class);
        for (AttributeModifiers1_20_5.AttributeModifier modifier : value.modifiers()) {
            CompoundTag modifierTag = new CompoundTag();
            String type = Attributes1_20_5.idToKey((int)modifier.attribute());
            if (type == null) {
                throw new IllegalArgumentException("Unknown attribute type: " + modifier.attribute());
            }
            modifierTag.putString("type", type);
            this.modifierDataToTag(modifierTag, modifier.modifier());
            if (modifier.slotType() != 0) {
                String slotType = EquipmentSlots1_20_5.idToKey((int)modifier.slotType());
                Preconditions.checkNotNull((Object)slotType, (String)"Unknown slot type %s", (Object[])new Object[]{modifier.slotType()});
                modifierTag.putString("slot", slotType);
            }
            modifiers.add((Tag)modifierTag);
        }
        tag.put("modifiers", (Tag)modifiers);
        if (!value.showInTooltip()) {
            tag.putBoolean("show_in_tooltip", false);
        }
        return tag;
    }

    protected AttributeModifiers1_20_5 attributeModifiersFromTag(Tag tag) {
        CompoundTag value = (CompoundTag)tag;
        boolean showInTooltip = value.getBoolean("show_in_tooltip", true);
        ListTag modifiers = value.getListTag("modifiers", CompoundTag.class);
        ArrayList<AttributeModifiers1_20_5.AttributeModifier> list = new ArrayList<AttributeModifiers1_20_5.AttributeModifier>();
        if (modifiers != null) {
            for (CompoundTag modifierTag : modifiers) {
                int type = Attributes1_20_5.keyToId((String)modifierTag.getString("type"));
                AttributeModifiers1_20_5.ModifierData modifier = this.modifierDataFromTag(modifierTag);
                int slotType = EquipmentSlots1_20_5.keyToId((String)modifierTag.getString("slot", "any"));
                list.add(new AttributeModifiers1_20_5.AttributeModifier(type, modifier, slotType));
            }
        }
        return new AttributeModifiers1_20_5((AttributeModifiers1_20_5.AttributeModifier[])list.toArray(AttributeModifiers1_20_5.AttributeModifier[]::new), showInTooltip);
    }

    protected IntTag customModelDataToTag(Integer value) {
        return new IntTag(value.intValue());
    }

    protected Integer maxStackSizeFromTag(Tag value) {
        return this.checkIntRange(1, 99, this.asInt(value));
    }

    protected ListTag<StringTag> loreToTag(Tag[] value) {
        return this.componentsToTag(value, 256);
    }

    protected CompoundTag foodToTag(FoodProperties1_20_5 value) {
        CompoundTag tag = new CompoundTag();
        tag.put("nutrition", (Tag)this.nonNegativeIntToTag(value.nutrition()));
        tag.putFloat("saturation", value.saturationModifier());
        if (value.canAlwaysEat()) {
            tag.putBoolean("can_always_eat", true);
        }
        if (value.eatSeconds() != 1.6f) {
            tag.put("eat_seconds", (Tag)this.positiveFloatToTag(Float.valueOf(value.eatSeconds())));
        }
        if (value.possibleEffects().length > 0) {
            ListTag effects = new ListTag(CompoundTag.class);
            for (FoodProperties1_20_5.FoodEffect foodEffect : value.possibleEffects()) {
                CompoundTag effectTag = new CompoundTag();
                CompoundTag potionEffectTag = new CompoundTag();
                this.potionEffectToTag(potionEffectTag, foodEffect.effect());
                effectTag.put("effect", (Tag)potionEffectTag);
                if (foodEffect.probability() == 1.0f) continue;
                effectTag.putFloat("probability", foodEffect.probability());
            }
            tag.put("effects", (Tag)effects);
        }
        return tag;
    }

    protected CompoundTag toolToTag(ToolProperties value) {
        CompoundTag tag = new CompoundTag();
        ListTag rules = new ListTag(CompoundTag.class);
        for (ToolRule rule : value.rules()) {
            CompoundTag ruleTag = new CompoundTag();
            this.holderSetToTag(ruleTag, "blocks", rule.blocks());
            if (rule.speed() != null) {
                ruleTag.putFloat("speed", rule.speed().floatValue());
            }
            if (rule.correctForDrops() != null) {
                ruleTag.putBoolean("correct_for_drops", rule.correctForDrops().booleanValue());
            }
            rules.add((Tag)ruleTag);
        }
        tag.put("rules", (Tag)rules);
        if (value.defaultMiningSpeed() != 1.0f) {
            tag.putFloat("default_mining_speed", value.defaultMiningSpeed());
        }
        if (value.damagePerBlock() != 1) {
            tag.put("damage_per_block", (Tag)this.nonNegativeIntToTag(value.damagePerBlock()));
        }
        return tag;
    }

    protected CompoundTag trimToTag(UserConnection connection, ArmorTrim value) {
        CompoundTag tag = new CompoundTag();
        Holder material = value.material();
        ArmorTrimStorage trimStorage = (ArmorTrimStorage)connection.get(ArmorTrimStorage.class);
        if (material.hasId()) {
            String trimMaterial = trimStorage.trimMaterials().idToKey(material.id());
            tag.putString("material", trimMaterial);
        } else {
            ArmorTrimMaterial armorTrimMaterial = (ArmorTrimMaterial)material.value();
            CompoundTag materialTag = new CompoundTag();
            String ingredient = Protocol1_20_3To1_20_5.MAPPINGS.getFullItemMappings().identifier(armorTrimMaterial.itemId());
            if (ingredient == null) {
                throw new IllegalArgumentException("Unknown item: " + armorTrimMaterial.itemId());
            }
            CompoundTag overrideArmorMaterialsTag = new CompoundTag();
            for (Map.Entry entry : armorTrimMaterial.overrideArmorMaterials().entrySet()) {
                String materialKey = ArmorMaterials1_20_5.idToKey((int)Integer.parseInt((String)entry.getKey()));
                if (materialKey == null) continue;
                overrideArmorMaterialsTag.putString(materialKey, (String)entry.getValue());
            }
            materialTag.putString("asset_name", armorTrimMaterial.assetName());
            materialTag.putString("ingredient", ingredient);
            materialTag.putFloat("item_model_index", armorTrimMaterial.itemModelIndex());
            materialTag.put("override_armor_materials", (Tag)overrideArmorMaterialsTag);
            materialTag.put("description", armorTrimMaterial.description());
            tag.put("material", (Tag)materialTag);
        }
        Holder pattern = value.pattern();
        if (pattern.hasId()) {
            tag.putString("pattern", trimStorage.trimPatterns().idToKey(pattern.id()));
        } else {
            ArmorTrimPattern armorTrimPattern = (ArmorTrimPattern)pattern.value();
            CompoundTag patternTag = new CompoundTag();
            String templateItem = Protocol1_20_3To1_20_5.MAPPINGS.getFullItemMappings().identifier(armorTrimPattern.itemId());
            if (templateItem == null) {
                throw new IllegalArgumentException("Unknown item: " + armorTrimPattern.itemId());
            }
            patternTag.put("asset_id", (Tag)this.identifierToTag(armorTrimPattern.assetName()));
            patternTag.putString("template_item", templateItem);
            patternTag.put("description", armorTrimPattern.description());
            if (armorTrimPattern.decal()) {
                patternTag.putBoolean("decal", true);
            }
            tag.put("pattern", (Tag)patternTag);
        }
        if (!value.showInTooltip()) {
            tag.putBoolean("show_in_tooltip", false);
        }
        return tag;
    }

    protected ListTag<CompoundTag> beesToTag(Bee[] value) {
        ListTag tag = new ListTag(CompoundTag.class);
        for (Bee bee : value) {
            CompoundTag beeTag = new CompoundTag();
            if (!bee.entityData().tag().isEmpty()) {
                beeTag.put("entity_data", (Tag)this.nbtToTag(bee.entityData().tag()));
            }
            beeTag.putInt("ticks_in_hive", bee.ticksInHive());
            beeTag.putInt("min_ticks_in_hive", bee.minTicksInHive());
        }
        return tag;
    }

    protected IntTag mapIdToTag(Integer value) {
        return new IntTag(value.intValue());
    }

    protected StringTag lockToTag(Tag value) {
        return (StringTag)value;
    }

    protected CompoundTag unitToTag() {
        return new CompoundTag();
    }

    protected StatePropertyMatcher @Nullable [] fromState(CompoundTag value) {
        if (value == null) {
            return null;
        }
        ArrayList<StatePropertyMatcher> list = new ArrayList<StatePropertyMatcher>();
        for (Map.Entry entry : value.entrySet()) {
            String name = (String)entry.getKey();
            Tag tag = (Tag)entry.getValue();
            if (tag instanceof StringTag) {
                StringTag stringTag = (StringTag)tag;
                list.add(new StatePropertyMatcher(name, Either.left((Object)stringTag.getValue())));
                continue;
            }
            if (!(tag instanceof CompoundTag)) continue;
            CompoundTag compoundTag = (CompoundTag)tag;
            String min = compoundTag.getString("min");
            String max = compoundTag.getString("max");
            list.add(new StatePropertyMatcher(name, Either.right((Object)new StatePropertyMatcher.RangedMatcher(min, max))));
        }
        return (StatePropertyMatcher[])list.toArray(StatePropertyMatcher[]::new);
    }

    public List<StructuredData<?>> toData(UserConnection connection, CompoundTag tag) {
        ArrayList list = new ArrayList();
        if (tag != null) {
            for (Map.Entry entry : tag.entrySet()) {
                StructuredData<?> data = this.readFromTag(connection, (String)entry.getKey(), (Tag)entry.getValue());
                list.add(data);
            }
        }
        return list;
    }

    protected CompoundTag nbtToTag(CompoundTag tag) {
        return tag;
    }

    protected float checkFloatRange(float min, float max, float value) {
        Preconditions.checkArgument((value >= min && value <= max ? 1 : 0) != 0, (Object)("Value out of range: " + value));
        return value;
    }

    protected FloatTag floatRangeToTag(Float value, float min, float max) {
        return new FloatTag(this.checkFloatRange(min, max, value.floatValue()));
    }

    protected StringTag stringToTag(String value, int min, int max) {
        return new StringTag(this.checkStringRange(min, max, value));
    }

    protected String checkStringRange(int min, int max, String value) {
        int length = value.length();
        Preconditions.checkArgument((length >= min && length <= max ? 1 : 0) != 0, (Object)("Value out of range: " + value));
        return value;
    }

    protected Short asUnsignedByte(Tag tag) {
        return ((ByteTag)tag).asShort();
    }

    protected void itemToTag(UserConnection connection, CompoundTag tag, Item item) {
        String identifier = this.mappedIdentifier(item.identifier());
        if (identifier == null) {
            throw new IllegalArgumentException("Unknown item: " + item.identifier());
        }
        tag.putString("id", identifier);
        try {
            tag.put("count", (Tag)this.positiveIntToTag(item.amount()));
        }
        catch (IllegalArgumentException ignored) {
            tag.putInt("count", 1);
        }
        Map components = item.dataContainer().data();
        CompoundTag componentsTag = this.toTag(connection, components);
        if (!componentsTag.isEmpty()) {
            tag.put("components", (Tag)componentsTag);
        }
    }

    protected FilterableComponent filterableComponentFromTag(CompoundTag tag) {
        if (tag == null) {
            return null;
        }
        Tag raw = this.componentFromTag(tag.get("raw"));
        Tag filtered = this.componentFromTag(tag.get("filtered"));
        return new FilterableComponent(raw, filtered);
    }

    protected PotionEffectData potionEffectDataFromTag(CompoundTag tag) {
        int amplifier = tag.getInt("amplifier", 0);
        int duration = tag.getInt("duration", 0);
        boolean ambient = tag.getBoolean("ambient", false);
        boolean showParticles = tag.getBoolean("show_particles", true);
        boolean showIcon = tag.getBoolean("show_icon", true);
        CompoundTag hiddenEffectTag = tag.getCompoundTag("hidden_effect");
        PotionEffectData hiddenEffect = hiddenEffectTag != null ? this.potionEffectDataFromTag(hiddenEffectTag) : null;
        return new PotionEffectData(amplifier, duration, ambient, showParticles, showIcon, hiddenEffect);
    }

    protected CompoundTag blockPredicateToTag(AdventureModePredicate value) {
        CompoundTag tag = new CompoundTag();
        ListTag predicates = new ListTag(CompoundTag.class);
        for (BlockPredicate predicate : value.predicates()) {
            CompoundTag predicateTag = new CompoundTag();
            if (predicate.holderSet() != null) {
                this.holderSetToTag(predicateTag, "blocks", predicate.holderSet());
            }
            if (predicate.propertyMatchers() != null) {
                predicateTag.put("state", (Tag)this.createState(predicate));
            }
            if (predicate.tag() != null) {
                predicateTag.put("nbt", (Tag)predicate.tag());
            }
            predicates.add((Tag)predicateTag);
        }
        tag.put("predicates", (Tag)predicates);
        if (!value.showInTooltip()) {
            tag.putBoolean("show_in_tooltip", false);
        }
        return tag;
    }

    protected void potionEffectDataToTag(CompoundTag tag, PotionEffectData data) {
        if (data.amplifier() != 0) {
            tag.putInt("amplifier", data.amplifier());
        }
        if (data.duration() != 0) {
            tag.putInt("duration", data.duration());
        }
        if (data.ambient()) {
            tag.putBoolean("ambient", true);
        }
        if (!data.showParticles()) {
            tag.putBoolean("show_particles", false);
        }
        tag.putBoolean("show_icon", data.showIcon());
        if (data.hiddenEffect() != null) {
            CompoundTag hiddenEffect = new CompoundTag();
            this.potionEffectDataToTag(hiddenEffect, data.hiddenEffect());
            tag.put("hidden_effect", (Tag)hiddenEffect);
        }
    }

    protected Holder<BannerPattern> bannerPatternFromTag(Tag tag) {
        if (tag instanceof StringTag) {
            StringTag stringTag = (StringTag)tag;
            return Holder.of((int)BannerPatterns1_20_5.keyToId((String)stringTag.getValue()));
        }
        if (tag instanceof CompoundTag) {
            CompoundTag compoundTag = (CompoundTag)tag;
            String assetId = this.identifierFromTag(compoundTag.getStringTag("asset_id"));
            String translationKey = compoundTag.getString("translation_key");
            return Holder.of((Object)new BannerPattern(assetId, translationKey));
        }
        return null;
    }

    protected FilterableString filterableStringFromTag(CompoundTag tag) {
        if (tag == null) {
            return null;
        }
        String raw = this.checkStringRange(0, 1024, tag.getString("raw"));
        StringTag filteredTag = tag.getStringTag("filtered");
        if (filteredTag == null) {
            return new FilterableString(raw, null);
        }
        return new FilterableString(raw, this.checkStringRange(0, 1024, filteredTag.getValue()));
    }

    protected PotionEffect potionEffectFromTag(CompoundTag tag) {
        int id = PotionEffects1_20_5.keyToId((String)tag.getString("id"));
        if (id == -1) {
            return null;
        }
        PotionEffectData data = this.potionEffectDataFromTag(tag);
        return new PotionEffect(id, data);
    }

    protected void filterableComponentToTag(CompoundTag tag, FilterableComponent component) {
        tag.put("raw", (Tag)this.componentToTag((Tag)component.raw()));
        if (component.filtered() != null) {
            tag.put("filtered", (Tag)this.componentToTag((Tag)component.filtered()));
        }
    }

    protected AdventureModePredicate blockPredicateFromTag(Tag tag) {
        CompoundTag value = (CompoundTag)tag;
        boolean showInTooltip = value.getBoolean("show_in_tooltip", true);
        ListTag predicates = value.getListTag("predicates", CompoundTag.class);
        ArrayList<BlockPredicate> list = new ArrayList<BlockPredicate>();
        if (predicates != null) {
            for (CompoundTag predicateTag : predicates) {
                HolderSet holderSet = this.holderSetFromTag(predicateTag, "blocks");
                StatePropertyMatcher[] state = this.fromState(predicateTag.getCompoundTag("state"));
                list.add(new BlockPredicate(holderSet, state, predicateTag.getCompoundTag("nbt")));
            }
        }
        return new AdventureModePredicate((BlockPredicate[])list.toArray(BlockPredicate[]::new), showInTooltip);
    }

    protected void filterableStringToTag(CompoundTag tag, FilterableString string, int max) {
        tag.put("raw", (Tag)this.stringToTag((String)string.raw(), 0, max));
        if (string.filtered() != null) {
            tag.put("filtered", (Tag)this.stringToTag((String)string.filtered(), 0, max));
        }
    }

    protected AttributeModifiers1_20_5.ModifierData modifierDataFromTag(CompoundTag tag) {
        int operation;
        UUID uuid = UUIDUtil.fromIntArray((int[])tag.getIntArrayTag("uuid").getValue());
        String name = tag.getString("name");
        double amount = tag.getDouble("amount");
        String operationName = tag.getString("operation");
        for (operation = 0; operation < BlockItemPacketRewriter1_20_5.ATTRIBUTE_OPERATIONS.length && !BlockItemPacketRewriter1_20_5.ATTRIBUTE_OPERATIONS[operation].equals(operationName); ++operation) {
        }
        return new AttributeModifiers1_20_5.ModifierData(uuid, name, amount, operation);
    }

    protected CompoundTag bucketEntityDataToTag(CompoundTag value) {
        return this.nbtToTag(value);
    }

    protected Key noteBlockSoundFromTag(Tag value) {
        return Key.of((String)((StringTag)value).getValue());
    }

    protected ListTag<CompoundTag> bundleContentsToTag(UserConnection connection, Item[] value) {
        return this.itemArrayToTag(connection, value);
    }

    protected CompoundTag containerLootFromTag(Tag value) {
        return (CompoundTag)value;
    }

    protected Unit fireResistantFromTag(Tag value) {
        return Unit.INSTANCE;
    }

    protected Item[] bundleContentsFromTag(UserConnection connection, Tag tag) {
        ListTag value = (ListTag)tag;
        return this.itemArrayFromTag(connection, (ListTag<CompoundTag>)value);
    }

    protected PotionContents potionContentsFromTag(Tag tag) {
        CompoundTag value = (CompoundTag)tag;
        int potion = Potions1_20_5.keyToId((String)value.getString("potion", ""));
        IntTag customColor = value.getIntTag("custom_color");
        ListTag customEffects = value.getListTag("custom_effects", CompoundTag.class);
        ArrayList<PotionEffect> list = new ArrayList<PotionEffect>();
        if (customEffects != null) {
            for (CompoundTag effectTag : customEffects) {
                list.add(this.potionEffectFromTag(effectTag));
            }
        }
        return new PotionContents(potion != -1 ? Integer.valueOf(potion) : null, customColor != null ? Integer.valueOf(customColor.asInt()) : null, (PotionEffect[])list.toArray(PotionEffect[]::new));
    }

    protected Enchantments storedEnchantmentsFromTag(Tag tag) {
        return this.enchantmentsFromTag(tag);
    }

    protected WrittenBook writtenBookContentFromTag(Tag tag) {
        CompoundTag value = (CompoundTag)tag;
        FilterableString title = this.filterableStringFromTag(value.getCompoundTag("title"));
        String author = value.getString("author");
        int generation = this.checkIntRange(0, 3, value.getInt("generation", 0));
        ListTag pagesTag = value.getListTag("pages", CompoundTag.class);
        ArrayList<FilterableComponent> pages = new ArrayList<FilterableComponent>();
        if (pagesTag != null) {
            for (CompoundTag pageTag : pagesTag) {
                pages.add(this.filterableComponentFromTag(pageTag));
            }
        }
        boolean resolved = value.getBoolean("resolved", false);
        return new WrittenBook(title, author, generation, (FilterableComponent[])pages.toArray(FilterableComponent[]::new), resolved);
    }

    protected CompoundTag debugStickStateToTag(DebugStickState value) {
        return value.tag();
    }

    protected IntTag nonNegativeIntToTag(Integer value) {
        return this.intRangeToTag(value, 0, Integer.MAX_VALUE);
    }

    protected DebugStickState debugStickStateFromTag(Tag value) {
        return new DebugStickState((CompoundTag)value);
    }

    protected CompoundTag lodestoneTrackerToTag(LodestoneTracker value) {
        CompoundTag tag = new CompoundTag();
        if (value.position() != null) {
            this.globalPosToTag(tag, value.position());
        }
        if (!value.tracked()) {
            tag.putBoolean("tracked", false);
        }
        return tag;
    }

    protected ListTag<CompoundTag> chargedProjectilesToTag(UserConnection connection, Item[] value) {
        return this.itemArrayToTag(connection, value);
    }

    protected StringTag noteBlockSoundToTag(Key value) {
        return new StringTag(value.original());
    }

    protected CompoundTag storedEnchantmentsToTag(Enchantments value) {
        return this.enchantmentsToTag(value);
    }

    protected FireworkExplosion fireworkExplosionFromTag(Tag tag) {
        CompoundTag value = (CompoundTag)tag;
        int shape = this.enumEntryFromTag(value.getStringTag("shape"), "small_ball", "large_ball", "star", "creeper", "burst");
        IntArrayTag colors = value.getIntArrayTag("colors");
        IntArrayTag fadeColors = value.getIntArrayTag("fade_colors");
        boolean trail = value.getBoolean("trail", false);
        boolean twinkle = value.getBoolean("twinkle", false);
        return new FireworkExplosion(shape, colors == null ? new int[]{} : colors.getValue(), fadeColors == null ? new int[]{} : fadeColors.getValue(), trail, twinkle);
    }

    protected ListTag<StringTag> potDecorationsToTag(PotDecorations value) {
        ListTag tag = new ListTag(StringTag.class);
        for (int decoration : value.itemIds()) {
            String identifier = this.mappedIdentifier(decoration);
            if (identifier == null) {
                throw new IllegalArgumentException("Unknown item: " + decoration);
            }
            tag.add((Tag)new StringTag(identifier));
        }
        return tag;
    }

    protected PotDecorations potDecorationsFromTag(Tag tag) {
        ListTag value = (ListTag)tag;
        int[] itemIds = new int[value.size()];
        for (int i = 0; i < value.size(); ++i) {
            String identifier = ((StringTag)value.get(i)).getValue();
            int id = this.mappedId(identifier);
            if (id == -1) {
                throw new IllegalArgumentException("Unknown item: " + identifier);
            }
            itemIds[i] = id;
        }
        return new PotDecorations(itemIds);
    }

    protected Integer checkNonNegativeInt(Integer value) {
        return this.checkIntRange(0, Integer.MAX_VALUE, value);
    }

    protected CompoundTag mapDecorationsFromTag(Tag tag) {
        return (CompoundTag)tag;
    }

    protected Item[] chargedProjectilesFromTag(UserConnection connection, Tag tag) {
        ListTag value = (ListTag)tag;
        return this.itemArrayFromTag(connection, (ListTag<CompoundTag>)value);
    }

    protected CompoundTag potionContentsToTag(PotionContents value) {
        String potion;
        CompoundTag tag = new CompoundTag();
        if (value.potion() != null && (potion = Potions1_20_5.idToKey((int)value.potion())) != null) {
            tag.putString("potion", potion);
        }
        if (value.customColor() != null) {
            tag.putInt("custom_color", value.customColor().intValue());
        }
        ListTag customEffects = new ListTag(CompoundTag.class);
        for (PotionEffect effect : value.customEffects()) {
            CompoundTag effectTag = new CompoundTag();
            this.potionEffectToTag(effectTag, effect);
            customEffects.add((Tag)effectTag);
        }
        if (!customEffects.isEmpty()) {
            tag.put("custom_effects", (Tag)customEffects);
        }
        if (value.customName() != null) {
            tag.putString("custom_name", value.customName());
        }
        return tag;
    }

    protected ListTag<CompoundTag> suspiciousStewEffectsToTag(SuspiciousStewEffect[] value) {
        ListTag tag = new ListTag(CompoundTag.class);
        for (SuspiciousStewEffect effect : value) {
            CompoundTag effectTag = new CompoundTag();
            String id = PotionEffects1_20_5.idToKey((int)effect.mobEffect());
            if (id != null) {
                effectTag.putString("id", id);
            }
            if (effect.duration() != 160) {
                effectTag.putInt("duration", effect.duration());
            }
            tag.add((Tag)effectTag);
        }
        return tag;
    }

    protected CompoundTag bucketEntityDataFromTag(Tag value) {
        return (CompoundTag)value;
    }

    protected LodestoneTracker lodestoneTrackerFromTag(Tag tag) {
        CompoundTag value = (CompoundTag)tag;
        GlobalBlockPosition position = this.globalPosFromTag(value);
        boolean tracked = value.getBoolean("tracked", true);
        return new LodestoneTracker(position, tracked);
    }

    protected CompoundTag fireworkExplosionToTag(FireworkExplosion value) {
        CompoundTag tag = new CompoundTag();
        tag.put("shape", (Tag)this.enumEntryToTag(value.shape(), "small_ball", "large_ball", "star", "creeper", "burst"));
        if (value.colors().length > 0) {
            tag.put("colors", (Tag)new IntArrayTag(value.colors()));
        }
        if (value.fadeColors().length > 0) {
            tag.put("fade_colors", (Tag)new IntArrayTag(value.fadeColors()));
        }
        if (value.hasTrail()) {
            tag.putBoolean("trail", true);
        }
        if (value.hasTwinkle()) {
            tag.putBoolean("twinkle", true);
        }
        return tag;
    }

    protected CompoundTag writableBookContentToTag(WritableBook value) {
        CompoundTag tag = new CompoundTag();
        if (value == null) {
            return tag;
        }
        if (value.pages().length > 100) {
            throw new IllegalArgumentException("Too many pages: " + value.pages().length);
        }
        ListTag pagesTag = new ListTag(CompoundTag.class);
        for (FilterableString page : value.pages()) {
            CompoundTag pageTag = new CompoundTag();
            this.filterableStringToTag(pageTag, page, 1024);
            pagesTag.add((Tag)pageTag);
        }
        tag.put("pages", (Tag)pagesTag);
        return tag;
    }

    protected ListTag<CompoundTag> bannerPatternsToTag(BannerPatternLayer[] value) {
        ListTag tag = new ListTag(CompoundTag.class);
        for (BannerPatternLayer layer : value) {
            CompoundTag layerTag = new CompoundTag();
            this.bannerPatternToTag(layerTag, (Holder<BannerPattern>)layer.pattern());
            layerTag.put("color", (Tag)this.dyeColorToTag(layer.dyeColor()));
            tag.add((Tag)layerTag);
        }
        return tag;
    }

    protected CompoundTag mapDecorationsToTag(CompoundTag value) {
        return value;
    }

    protected WritableBook writableBookContentFromTag(Tag tag) {
        CompoundTag value = (CompoundTag)tag;
        ListTag pagesTag = value.getListTag("pages", CompoundTag.class);
        if (pagesTag == null) {
            return null;
        }
        FilterableString[] pages = new FilterableString[pagesTag.size()];
        for (int i = 0; i < pagesTag.size(); ++i) {
            pages[i] = this.filterableStringFromTag((CompoundTag)pagesTag.get(i));
        }
        return new WritableBook(pages);
    }

    protected CompoundTag writtenBookContentToTag(WrittenBook value) {
        CompoundTag tag = new CompoundTag();
        CompoundTag title = new CompoundTag();
        this.filterableStringToTag(title, value.title(), 32);
        tag.put("title", (Tag)title);
        tag.putString("author", value.author());
        if (value.generation() != 0) {
            tag.put("generation", (Tag)this.intRangeToTag(value.generation(), 0, 3));
        }
        ListTag pagesTag = new ListTag(CompoundTag.class);
        for (FilterableComponent page : value.pages()) {
            CompoundTag pageTag = new CompoundTag();
            this.filterableComponentToTag(pageTag, page);
            pagesTag.add((Tag)pageTag);
        }
        if (!pagesTag.isEmpty()) {
            tag.put("pages", (Tag)pagesTag);
        }
        if (value.resolved()) {
            tag.putBoolean("resolved", true);
        }
        return tag;
    }

    protected CompoundTag blockEntityDataToTag(CompoundTag value) {
        return this.nbtWithIdToTag(value);
    }

    protected CompoundTag blockEntityDataFromTag(Tag value) {
        return (CompoundTag)value;
    }

    protected BannerPatternLayer[] bannerPatternsFromTag(Tag tag) {
        ListTag value = (ListTag)tag;
        BannerPatternLayer[] layers = new BannerPatternLayer[value.size()];
        for (int i = 0; i < value.size(); ++i) {
            CompoundTag layerTag = (CompoundTag)value.get(i);
            Holder<BannerPattern> pattern = this.bannerPatternFromTag(layerTag.get("pattern"));
            int color = this.dyeColorFromTag(layerTag.get("color"));
            layers[i] = new BannerPatternLayer(pattern, color);
        }
        return layers;
    }

    private int mappedId(String identifier) {
        return Protocol1_20_3To1_20_5.MAPPINGS.getFullItemMappings().mappedId(identifier);
    }

    protected CompoundTag unbreakableToTag(Unbreakable value) {
        CompoundTag tag = new CompoundTag();
        if (!value.showInTooltip()) {
            tag.putBoolean("show_in_tooltip", false);
        }
        return tag;
    }

    protected CompoundTag entityDataFromTag(Tag value) {
        return (CompoundTag)value;
    }

    protected Unbreakable unbreakableFromTag(Tag tag) {
        if (tag instanceof CompoundTag) {
            CompoundTag compoundTag = (CompoundTag)tag;
            return new Unbreakable(compoundTag.getBoolean("show_in_tooltip", true));
        }
        return null;
    }

    protected IntTag maxStackSizeToTag(Integer value) {
        return this.intRangeToTag(value, 1, 99);
    }

    protected AdventureModePredicate canBreakFromTag(Tag tag) {
        return this.blockPredicateFromTag(tag);
    }

    protected DyedColor dyedColorFromTag(Tag tag) {
        CompoundTag value = (CompoundTag)tag;
        int rgb = value.getInt("rgb");
        boolean showInTooltip = value.getBoolean("show_in_tooltip", true);
        return new DyedColor(rgb, showInTooltip);
    }

    protected Integer damageFromTag(Tag value) {
        return this.checkNonNegativeInt(this.asInt(value));
    }

    protected Tag customNameFromTag(Tag value) {
        return this.componentFromTag(value);
    }

    protected StringTag rarityToTag(Integer value) {
        return this.enumEntryToTag(value, "common", "uncommon", "rare", "epic");
    }

    protected IntTag mapColorToTag(Integer value) {
        return new IntTag(value.intValue());
    }

    protected <T> void registerEmpty(StructuredDataKey<T> key) {
        this.converters.put(key, new ConverterPair(null, null));
    }

    protected IntTag maxDamageToTag(Integer value) {
        return this.positiveIntToTag(value);
    }

    protected Tag[] loreFromTag(Tag value) {
        return this.componentsFromTag(value, 256);
    }

    protected CompoundTag hideTooltipToTag(Unit value) {
        return this.unitToTag();
    }

    protected IntTag repairCostToTag(Integer value) {
        return this.intRangeToTag(value, 0, Integer.MAX_VALUE);
    }

    protected StringTag customNameToTag(Tag value) {
        return this.componentToTag(value);
    }

    protected AdventureModePredicate canPlaceOnFromTag(Tag tag) {
        return this.blockPredicateFromTag(tag);
    }

    protected Integer repairCostFromTag(Tag value) {
        return this.checkIntRange(0, Integer.MAX_VALUE, this.asInt(value));
    }

    protected CompoundTag dyedColorToTag(DyedColor value) {
        CompoundTag tag = new CompoundTag();
        tag.putInt("rgb", value.rgb());
        if (!value.showInTooltip()) {
            tag.putBoolean("show_in_tooltip", false);
        }
        return tag;
    }

    protected CompoundTag canPlaceOnToTag(AdventureModePredicate value) {
        return this.blockPredicateToTag(value);
    }

    protected Integer rarityFromTag(Tag value) {
        if (value instanceof StringTag) {
            StringTag stringTag = (StringTag)value;
            return this.enumEntryFromTag(stringTag, "common", "uncommon", "rare", "epic");
        }
        return null;
    }

    protected Integer maxDamageFromTag(Tag value) {
        return this.checkPositiveInt(this.asInt(value));
    }

    protected Unit hideTooltipFromTag(Tag value) {
        return Unit.INSTANCE;
    }

    protected ToolProperties toolFromTag(Tag tag) {
        CompoundTag value = (CompoundTag)tag;
        ListTag rules = value.getListTag("rules", CompoundTag.class);
        ArrayList<ToolRule> list = new ArrayList<ToolRule>();
        if (rules != null) {
            for (CompoundTag ruleTag : rules) {
                HolderSet blocks = this.holderSetFromTag(ruleTag, "blocks");
                Float speed = Float.valueOf(ruleTag.getFloat("speed", 0.0f));
                Boolean correctForDrops = ruleTag.getBoolean("correct_for_drops", false);
                list.add(new ToolRule(blocks, speed, correctForDrops));
            }
        }
        float defaultMiningSpeed = value.getFloat("default_mining_speed", 1.0f);
        int damagePerBlock = this.checkNonNegativeInt(value.getInt("damage_per_block", 1));
        return new ToolProperties((ToolRule[])list.toArray(ToolRule[]::new), defaultMiningSpeed, damagePerBlock);
    }

    protected CompoundTag customDataToTag(CompoundTag value) {
        return value;
    }

    protected IntTag damageToTag(Integer value) {
        return this.nonNegativeIntToTag(value);
    }

    protected StringTag itemNameToTag(Tag value) {
        return this.componentToTag(value);
    }

    protected CompoundTag enchantmentsToTag(Enchantments value) {
        CompoundTag tag = new CompoundTag();
        CompoundTag levels = new CompoundTag();
        for (Int2IntMap.Entry entry : value.enchantments().int2IntEntrySet()) {
            int level = this.checkIntRange(0, 255, entry.getIntValue());
            levels.putInt(Enchantments1_20_5.idToKey((int)entry.getIntKey()), level);
        }
        tag.put("levels", (Tag)levels);
        if (!value.showInTooltip()) {
            tag.putBoolean("show_in_tooltip", false);
        }
        return tag;
    }

    protected CompoundTag canBreakToTag(AdventureModePredicate value) {
        return this.blockPredicateToTag(value);
    }

    protected Tag itemNameFromTag(Tag value) {
        return this.componentFromTag(value);
    }

    protected CompoundTag fireResistantToTag(Unit value) {
        return this.unitToTag();
    }

    protected Integer mapColorFromTag(Tag tag) {
        return this.asInt(tag);
    }

    protected Integer mapIdFromTag(Tag tag) {
        return this.asInt(tag);
    }

    protected ArmorTrim trimFromTag(UserConnection connection, Tag tag) {
        Holder pattern;
        Holder material;
        CompoundTag value = (CompoundTag)tag;
        Tag materialTag = value.get("material");
        ArmorTrimStorage trimStorage = (ArmorTrimStorage)connection.get(ArmorTrimStorage.class);
        if (materialTag instanceof StringTag) {
            StringTag stringTag = (StringTag)materialTag;
            material = Holder.of((int)trimStorage.trimMaterials().keyToId(stringTag.getValue()));
        } else {
            CompoundTag materialValue = (CompoundTag)materialTag;
            String assetName = this.identifierFromTag(materialValue.getStringTag("asset_name"));
            int ingredient = Protocol1_20_3To1_20_5.MAPPINGS.getFullItemMappings().mappedId(materialValue.getString("ingredient"));
            float itemModelIndex = materialValue.getFloat("item_model_index");
            HashMap<String, String> overrideArmorMaterials = new HashMap<String, String>();
            CompoundTag overrideArmorMaterialsTag = materialValue.getCompoundTag("override_armor_materials");
            if (overrideArmorMaterialsTag != null) {
                for (Map.Entry entry : overrideArmorMaterialsTag.entrySet()) {
                    overrideArmorMaterials.put((String)entry.getKey(), ((StringTag)entry.getValue()).getValue());
                }
            }
            Tag description = materialValue.get("description");
            material = Holder.of((Object)new ArmorTrimMaterial(assetName, ingredient, itemModelIndex, overrideArmorMaterials, description));
        }
        Tag patternTag = value.get("pattern");
        if (patternTag instanceof StringTag) {
            StringTag stringTag = (StringTag)patternTag;
            pattern = Holder.of((int)trimStorage.trimPatterns().keyToId(stringTag.getValue()));
        } else {
            CompoundTag patternValue = (CompoundTag)patternTag;
            String assetName = this.identifierFromTag(patternValue.getStringTag("asset_id"));
            int templateItem = Protocol1_20_3To1_20_5.MAPPINGS.getFullItemMappings().mappedId(patternValue.getString("template_item"));
            Tag description = patternValue.get("description");
            boolean decal = patternValue.getBoolean("decal", false);
            pattern = Holder.of((Object)new ArmorTrimPattern(assetName, templateItem, description, decal));
        }
        boolean showInTooltip = value.getBoolean("show_in_tooltip", true);
        return new ArmorTrim(material, pattern, showInTooltip);
    }

    protected CompoundTag entityDataToTag(CompoundTag value) {
        return this.nbtWithIdToTag(value);
    }

    protected CompoundTag customDataFromTag(Tag value) {
        return (CompoundTag)value;
    }

    protected FoodProperties1_20_5 foodFromTag(Tag tag) {
        CompoundTag value = (CompoundTag)tag;
        int nutrition = this.checkNonNegativeInt(value.getInt("nutrition"));
        float saturation = value.getFloat("saturation");
        boolean canAlwaysEat = value.getBoolean("can_always_eat", false);
        float eatSeconds = this.checkPositiveFloat(Float.valueOf(value.getFloat("eat_seconds", 1.6f))).floatValue();
        ListTag effects = value.getListTag("effects", CompoundTag.class);
        ArrayList<FoodProperties1_20_5.FoodEffect> list = new ArrayList<FoodProperties1_20_5.FoodEffect>();
        if (effects != null) {
            for (CompoundTag effectTag : effects) {
                PotionEffect effect = this.potionEffectFromTag(effectTag.getCompoundTag("effect"));
                float probability = effectTag.getFloat("probability", 1.0f);
                list.add(new FoodProperties1_20_5.FoodEffect(effect, probability));
            }
        }
        return new FoodProperties1_20_5(nutrition, saturation, canAlwaysEat, eatSeconds, null, (FoodProperties1_20_5.FoodEffect[])list.toArray(FoodProperties1_20_5.FoodEffect[]::new));
    }

    protected Bee[] beesFromTag(Tag tag) {
        ListTag value = (ListTag)tag;
        Bee[] bees = new Bee[value.size()];
        for (int i = 0; i < value.size(); ++i) {
            CompoundTag beeTag = (CompoundTag)value.get(i);
            CompoundTag entityData = beeTag.getCompoundTag("entity_data");
            int ticksInHive = beeTag.getInt("ticks_in_hive");
            int minTicksInHive = beeTag.getInt("min_ticks_in_hive");
            bees[i] = new Bee(entityData != null ? entityData : new CompoundTag(), ticksInHive, minTicksInHive);
        }
        return bees;
    }

    protected IntTag intRangeToTag(Integer value, int min, int max) {
        return new IntTag(this.checkIntRange(min, max, value));
    }

    protected Integer checkPositiveInt(Integer value) {
        return this.checkIntRange(1, Integer.MAX_VALUE, value);
    }

    protected Tag componentFromTag(Tag value, int max) {
        if (value instanceof StringTag) {
            StringTag stringTag = (StringTag)value;
            String input = this.checkStringRange(0, max, stringTag.getValue());
            return this.inputSerializerVersion().toTag(this.inputSerializerVersion().toComponent(input));
        }
        return null;
    }

    protected Tag componentFromTag(Tag value) {
        return this.componentFromTag(value, Integer.MAX_VALUE);
    }

    protected GlobalBlockPosition globalPosFromTag(CompoundTag tag) {
        CompoundTag posTag = tag.getCompoundTag("target");
        if (posTag == null) {
            return null;
        }
        String dimension = posTag.getString("dimension");
        int[] pos = posTag.getIntArrayTag("pos").getValue();
        return new GlobalBlockPosition(dimension, pos[0], pos[1], pos[2]);
    }

    protected void potionEffectToTag(CompoundTag tag, PotionEffect effect) {
        String id = PotionEffects1_20_5.idToKey((int)effect.effect());
        if (id == null) {
            throw new IllegalArgumentException("Unknown potion effect: " + effect.effect());
        }
        tag.putString("id", id);
        this.potionEffectDataToTag(tag, effect.effectData());
    }

    protected FloatTag positiveFloatToTag(Float value) {
        return this.floatRangeToTag(value, 0.0f, Float.MAX_VALUE);
    }

    protected StringTag baseColorToTag(Integer value) {
        return this.dyeColorToTag(value);
    }

    protected ListTag<CompoundTag> containerToTag(UserConnection connection, Item[] value) {
        ListTag tag = new ListTag(CompoundTag.class);
        for (int i = 0; i < value.length; ++i) {
            Item item = value[i];
            if (item.isEmpty()) continue;
            CompoundTag slotTag = new CompoundTag();
            CompoundTag itemTag = new CompoundTag();
            this.itemToTag(connection, itemTag, item);
            slotTag.putInt("slot", i);
            slotTag.put("item", (Tag)itemTag);
            tag.add((Tag)slotTag);
        }
        return tag;
    }

    protected Integer enumEntryFromTag(StringTag value, String ... values) {
        String string = value.getValue();
        for (int i = 0; i < values.length; ++i) {
            if (!values[i].equals(string)) continue;
            return i;
        }
        throw new IllegalArgumentException("Unknown enum value: " + string);
    }

    protected Item[] itemArrayFromTag(UserConnection connection, ListTag<CompoundTag> tag) {
        Item[] items = new Item[tag.size()];
        for (int i = 0; i < tag.size(); ++i) {
            items[i] = this.itemFromTag(connection, (CompoundTag)tag.get(i));
        }
        return items;
    }

    protected CompoundTag fireworksToTag(Fireworks value) {
        CompoundTag tag = new CompoundTag();
        if (value.flightDuration() != 0) {
            tag.put("flight_duration", (Tag)this.unsignedByteToTag((byte)value.flightDuration()));
        }
        ListTag explosions = new ListTag(CompoundTag.class);
        if (value.explosions().length > 256) {
            throw new IllegalArgumentException("Too many explosions: " + value.explosions().length);
        }
        for (FireworkExplosion explosion : value.explosions()) {
            explosions.add((Tag)this.fireworkExplosionToTag(explosion));
        }
        tag.put("explosions", (Tag)explosions);
        return tag;
    }

    protected <T> @Nullable DataConverter<T> dataConverter(StructuredDataKey<T> key) {
        ConverterPair<?> converters = this.converters.get(key);
        return converters != null ? converters.dataConverter : null;
    }

    protected Tag instrumentToTag(Holder<Instrument1_20_5> value) {
        if (value.hasId()) {
            return new StringTag(Instruments1_20_3.idToKey((int)value.id()));
        }
        Instrument1_20_5 instrument = (Instrument1_20_5)value.value();
        CompoundTag tag = new CompoundTag();
        Holder sound = instrument.soundEvent();
        if (sound.hasId()) {
            tag.putString("sound_event", Protocol1_20_3To1_20_5.MAPPINGS.soundName(sound.id()));
        } else {
            SoundEvent soundEvent = (SoundEvent)sound.value();
            CompoundTag soundEventTag = new CompoundTag();
            soundEventTag.put("sound_id", (Tag)this.identifierToTag(soundEvent.identifier()));
            if (soundEvent.fixedRange() != null) {
                soundEventTag.putFloat("range", soundEvent.fixedRange().floatValue());
            }
            tag.put("sound_event", (Tag)soundEventTag);
        }
        tag.put("use_duration", (Tag)this.positiveIntToTag(instrument.useDuration()));
        tag.put("range", (Tag)this.positiveFloatToTag(Float.valueOf(instrument.range())));
        return tag;
    }

    protected Tag recipesFromTag(Tag value) {
        return value;
    }

    protected Float checkPositiveFloat(Float value) {
        return Float.valueOf(this.checkFloatRange(0.0f, Float.MAX_VALUE, value.floatValue()));
    }

    protected Item[] containerFromTag(UserConnection connection, Tag tag) {
        int slot;
        Item item;
        ListTag value = (ListTag)tag;
        int highestSlot = 0;
        int size = Math.min(value.size(), 256);
        for (int i = 0; i < size; ++i) {
            CompoundTag itemTag = (CompoundTag)value.get(i);
            item = this.itemFromTag(connection, itemTag);
            if (item.isEmpty()) continue;
            slot = itemTag.getInt("slot");
            highestSlot = MathUtil.clamp((int)slot, (int)highestSlot, (int)255);
        }
        Item[] filteredItems = new Item[highestSlot + 1];
        for (CompoundTag itemTag : value) {
            item = this.itemFromTag(connection, itemTag.getCompoundTag("item"));
            if (item.isEmpty() || (slot = itemTag.getInt("slot")) < 0 || slot >= filteredItems.length) continue;
            filteredItems[slot] = item;
        }
        return filteredItems;
    }

    protected Tag lockFromTag(Tag value) {
        return value;
    }

    private StructuredData<?> readFromTag(UserConnection connection, String identifier, Tag tag) {
        int id;
        boolean removed = identifier.startsWith("!");
        if (removed) {
            identifier = identifier.substring(1);
        }
        Preconditions.checkArgument(((id = this.protocol.getMappingData().getDataComponentSerializerMappings().mappedId(identifier)) != -1 ? 1 : 0) != 0, (String)"Unknown data component: %s", (Object[])new Object[]{identifier});
        StructuredDataKey key = this.structuredDataType.key(id);
        if (removed) {
            return StructuredData.empty((StructuredDataKey)key, (int)id);
        }
        return this.readFromTag(connection, key, id, tag);
    }

    protected <T> StructuredData<T> readFromTag(UserConnection connection, StructuredDataKey<T> key, int id, Tag tag) {
        TagConverter<T> converter = this.tagConverter(key);
        Preconditions.checkNotNull(converter, (String)"No converter found for: %s", (Object[])new Object[]{key});
        return StructuredData.of(key, converter.convert(connection, tag), (int)id);
    }

    protected Holder<Instrument1_20_5> instrumentFromTag(Tag tag) {
        if (tag instanceof StringTag) {
            StringTag stringTag = (StringTag)tag;
            return Holder.of((int)Instruments1_20_3.keyToId((String)stringTag.getValue()));
        }
        CompoundTag value = (CompoundTag)tag;
        Holder soundEvent = null;
        Tag soundEventTag = value.get("sound_event");
        if (soundEventTag instanceof StringTag) {
            StringTag stringTag = (StringTag)soundEventTag;
            soundEvent = Holder.of((int)Protocol1_20_3To1_20_5.MAPPINGS.soundId(stringTag.getValue()));
        } else if (soundEventTag instanceof CompoundTag) {
            CompoundTag compoundTag = (CompoundTag)soundEventTag;
            String soundId = this.identifierFromTag(compoundTag.getStringTag("sound_id"));
            Float range = Float.valueOf(compoundTag.getFloat("range", 0.0f));
            soundEvent = Holder.of((Object)new SoundEvent(soundId, range));
        }
        int useDuration = this.checkPositiveInt(value.getInt("use_duration"));
        float range = this.checkPositiveFloat(Float.valueOf(value.getFloat("range"))).floatValue();
        return Holder.of((Object)new Instrument1_20_5(soundEvent, useDuration, range));
    }

    protected BlockStateProperties blockStateFromTag(Tag tag) {
        CompoundTag value = (CompoundTag)tag;
        HashMap<String, String> properties = new HashMap<String, String>();
        for (Map.Entry entry : value.entrySet()) {
            properties.put((String)entry.getKey(), ((StringTag)entry.getValue()).getValue());
        }
        return new BlockStateProperties(properties);
    }

    protected Integer baseColorFromTag(Tag tag) {
        return this.dyeColorFromTag(tag);
    }

    protected CompoundTag profileToTag(GameProfile value) {
        CompoundTag tag = new CompoundTag();
        if (value.name() != null) {
            tag.putString("name", value.name());
        }
        if (value.id() != null) {
            tag.put("id", (Tag)new IntArrayTag(UUIDUtil.toIntArray((UUID)value.id())));
        }
        if (value.properties().length > 0) {
            this.propertiesToTag(tag, value.properties());
        }
        return tag;
    }

    protected StringTag componentToTag(Tag value, int max) {
        String json = this.outputSerializerVersion().toString(this.outputSerializerVersion().toComponent(value));
        return new StringTag(this.checkStringRange(0, max, json));
    }

    protected StringTag componentToTag(Tag value) {
        return this.componentToTag(value, Integer.MAX_VALUE);
    }

    protected StringTag enumEntryToTag(Integer value, String ... values) {
        Preconditions.checkArgument((value >= 0 && value < values.length ? 1 : 0) != 0, (Object)("Enum value out of range: " + value));
        return new StringTag(values[value]);
    }

    protected ListTag<CompoundTag> itemArrayToTag(UserConnection connection, Item[] value) {
        ListTag tag = new ListTag(CompoundTag.class);
        for (Item item : value) {
            CompoundTag itemTag = new CompoundTag();
            this.itemToTag(connection, itemTag, item);
            tag.add((Tag)itemTag);
        }
        return tag;
    }

    protected String identifierFromTag(StringTag tag) {
        String value = tag.getValue();
        if (!Key.isValid((String)value)) {
            throw new IllegalArgumentException("Invalid identifier: " + value);
        }
        return value;
    }

    protected CompoundTag nbtWithIdToTag(CompoundTag tag) {
        if (tag.getStringTag("id") == null) {
            throw new IllegalArgumentException("Missing id tag in nbt: " + String.valueOf(tag));
        }
        return tag;
    }

    protected void globalPosToTag(CompoundTag tag, GlobalBlockPosition position) {
        CompoundTag posTag = new CompoundTag();
        posTag.putString("dimension", position.dimension());
        posTag.put("pos", (Tag)new IntArrayTag(new int[]{position.x(), position.y(), position.z()}));
        tag.put("target", (Tag)posTag);
    }

    protected Fireworks fireworksFromTag(Tag value) {
        CompoundTag tag = (CompoundTag)value;
        short flightDuration = tag.getShort("flight_duration");
        ListTag explosions = tag.getListTag("explosions", CompoundTag.class);
        FireworkExplosion[] list = new FireworkExplosion[explosions != null ? explosions.size() : 0];
        for (int i = 0; i < list.length; ++i) {
            list[i] = this.fireworkExplosionFromTag(explosions.get(i));
        }
        return new Fireworks((int)flightDuration, list);
    }

    protected ByteTag unsignedByteToTag(byte value) {
        if (value > 255) {
            throw new IllegalArgumentException("Value out of range: " + value);
        }
        return new ByteTag(value);
    }

    protected CompoundTag containerLootToTag(CompoundTag value) {
        return value;
    }

    protected Tag[] componentsFromTag(Tag value, int maxLength) {
        ListTag listTag = (ListTag)value;
        this.checkIntRange(0, maxLength, listTag.size());
        Tag[] components = new Tag[listTag.size()];
        for (int i = 0; i < listTag.size(); ++i) {
            components[i] = this.inputSerializerVersion().toTag(this.inputSerializerVersion().toComponent(((StringTag)listTag.get(i)).getValue()));
        }
        return components;
    }

    protected void holderSetToTag(CompoundTag tag, String name, HolderSet set) {
        if (set.hasTagKey()) {
            tag.putString(name, set.tagKey());
        } else {
            ListTag identifiers = new ListTag(StringTag.class);
            for (int id : set.ids()) {
                String identifier = Protocol1_20_3To1_20_5.MAPPINGS.blockName(id);
                if (identifier == null) continue;
                identifiers.add((Tag)new StringTag(identifier));
            }
            tag.put(name, (Tag)identifiers);
        }
    }

    protected CompoundTag createState(BlockPredicate predicate) {
        CompoundTag state = new CompoundTag();
        for (StatePropertyMatcher matcher : predicate.propertyMatchers()) {
            Either match = matcher.matcher();
            if (match.isLeft()) {
                state.putString(matcher.name(), (String)match.left());
                continue;
            }
            StatePropertyMatcher.RangedMatcher range = (StatePropertyMatcher.RangedMatcher)match.right();
            CompoundTag rangeTag = new CompoundTag();
            if (range.minValue() != null) {
                rangeTag.putString("min", range.minValue());
            }
            if (range.maxValue() != null) {
                rangeTag.putString("max", range.maxValue());
            }
            state.put(matcher.name(), (Tag)rangeTag);
        }
        return state;
    }

    protected HolderSet holderSetFromTag(CompoundTag tag, String name) {
        Tag value = tag.get(name);
        if (value instanceof StringTag) {
            StringTag stringTag = (StringTag)value;
            return HolderSet.of((String)stringTag.getValue());
        }
        if (value instanceof ListTag) {
            ListTag listTag;
            ListTag identifiers = listTag = (ListTag)value;
            int[] ids = new int[identifiers.size()];
            for (int i = 0; i < identifiers.size(); ++i) {
                String identifier = ((StringTag)identifiers.get(i)).getValue();
                int id = Protocol1_20_3To1_20_5.MAPPINGS.blockId(identifier);
                if (id == -1) continue;
                ids[i] = id;
            }
            return HolderSet.of((int[])ids);
        }
        return null;
    }

    protected Tag recipesToTag(Tag value) {
        return value;
    }

    protected <T> @Nullable TagConverter<T> tagConverter(StructuredDataKey<T> key) {
        ConverterPair<?> converters = this.converters.get(key);
        return converters != null ? converters.tagConverter : null;
    }

    protected ListTag<StringTag> componentsToTag(Tag[] value, int maxLength) {
        this.checkIntRange(0, maxLength, value.length);
        ListTag listTag = new ListTag(StringTag.class);
        for (Tag tag : value) {
            String json = this.outputSerializerVersion().toString(this.outputSerializerVersion().toComponent(tag));
            listTag.add((Tag)new StringTag(json));
        }
        return listTag;
    }

    protected StringTag identifierToTag(String value) {
        if (!Key.isValid((String)value)) {
            throw new IllegalArgumentException("Invalid identifier: " + value);
        }
        return new StringTag(value);
    }

    protected void propertiesToTag(CompoundTag tag, GameProfile.Property[] properties) {
        ListTag propertiesTag = new ListTag(CompoundTag.class);
        for (GameProfile.Property property : properties) {
            CompoundTag propertyTag = new CompoundTag();
            propertyTag.putString("name", property.name());
            propertyTag.putString("value", property.value());
            if (property.signature() != null) {
                propertyTag.putString("signature", property.signature());
            }
            propertiesTag.add((Tag)propertyTag);
        }
        tag.put("properties", (Tag)propertiesTag);
    }

    protected CompoundTag blockStateToTag(BlockStateProperties value) {
        CompoundTag tag = new CompoundTag();
        for (Map.Entry entry : value.properties().entrySet()) {
            tag.putString((String)entry.getKey(), (String)entry.getValue());
        }
        return tag;
    }

    protected GameProfile.Property[] propertiesFromTag(CompoundTag tag) {
        ListTag propertiesTag = tag.getListTag("properties", CompoundTag.class);
        if (propertiesTag == null) {
            return new GameProfile.Property[0];
        }
        GameProfile.Property[] properties = new GameProfile.Property[propertiesTag.size()];
        for (int i = 0; i < propertiesTag.size(); ++i) {
            CompoundTag propertyTag = (CompoundTag)propertiesTag.get(i);
            String name = propertyTag.getString("name");
            String value = propertyTag.getString("value");
            String signature = propertyTag.getString("signature", null);
            properties[i] = new GameProfile.Property(name, value, signature);
        }
        return properties;
    }

    protected IntTag positiveIntToTag(Integer value) {
        return this.intRangeToTag(value, 1, Integer.MAX_VALUE);
    }

    protected int checkIntRange(int min, int max, int value) {
        Preconditions.checkArgument((value >= min && value <= max ? 1 : 0) != 0, (Object)("Value out of range: " + value));
        return value;
    }

    protected void bannerPatternToTag(CompoundTag tag, Holder<BannerPattern> pattern) {
        if (pattern.hasId()) {
            tag.putString("pattern", BannerPatterns1_20_5.idToKey((int)pattern.id()));
            return;
        }
        BannerPattern bannerPattern = (BannerPattern)pattern.value();
        CompoundTag patternTag = new CompoundTag();
        patternTag.put("asset_id", (Tag)this.identifierToTag(bannerPattern.assetId()));
        patternTag.putString("translation_key", bannerPattern.translationKey());
        tag.put("pattern", (Tag)patternTag);
    }

    protected GameProfile profileFromTag(Tag tag) {
        CompoundTag value = (CompoundTag)tag;
        String name = value.getString("name");
        IntArrayTag idTag = value.getIntArrayTag("id");
        UUID id = idTag == null ? null : UUIDUtil.fromIntArray((int[])idTag.getValue());
        GameProfile.Property[] properties = this.propertiesFromTag(value);
        return new GameProfile(name, id, properties);
    }

    protected void modifierDataToTag(CompoundTag tag, AttributeModifiers1_20_5.ModifierData data) {
        tag.put("uuid", (Tag)new IntArrayTag(UUIDUtil.toIntArray((UUID)data.uuid())));
        tag.putString("name", data.name());
        tag.putDouble("amount", data.amount());
        tag.putString("operation", BlockItemPacketRewriter1_20_5.ATTRIBUTE_OPERATIONS[data.operation()]);
    }

    protected StringTag dyeColorToTag(Integer value) {
        return new StringTag(DyeColors.idToKey((int)value));
    }

    protected Item itemFromTag(UserConnection connection, CompoundTag tag) {
        int id = this.mappedId(tag.getString("id", ""));
        int amount = this.checkPositiveInt(tag.getInt("count", 1));
        List<StructuredData<?>> components = this.toData(connection, tag.getCompoundTag("components"));
        return new StructuredItem(id, amount, new StructuredDataContainer((StructuredData[])components.toArray(StructuredData[]::new)));
    }

    protected Integer dyeColorFromTag(Tag tag) {
        return DyeColors.keyToId((String)((StringTag)tag).getValue());
    }

    @FunctionalInterface
    protected static interface SimpleDataConverter<T> {
        public Tag convert(T var1);
    }

    @FunctionalInterface
    protected static interface SimpleTagConverter<T> {
        public T convert(Tag var1);
    }

    @FunctionalInterface
    protected static interface DataConverter<T> {
        public Tag convert(UserConnection var1, T var2);
    }

    @FunctionalInterface
    protected static interface TagConverter<T> {
        public T convert(UserConnection var1, Tag var2);
    }

    protected record ConverterPair<T>(DataConverter<T> dataConverter, TagConverter<T> tagConverter) {
    }
}

