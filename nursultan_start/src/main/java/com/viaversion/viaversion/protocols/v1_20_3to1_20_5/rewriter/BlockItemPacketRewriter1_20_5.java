/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viafabricplus.api.events.LoadingCycleCallback$LoadingCycle
 *  com.viaversion.viafabricplus.base.Events
 *  com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.ParticleMappings
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.GameProfile
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  com.viaversion.viaversion.api.minecraft.GlobalBlockPosition
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
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
 *  com.viaversion.viaversion.api.minecraft.item.data.SuspiciousStewEffect
 *  com.viaversion.viaversion.api.minecraft.item.data.ToolProperties
 *  com.viaversion.viaversion.api.minecraft.item.data.ToolRule
 *  com.viaversion.viaversion.api.minecraft.item.data.Unbreakable
 *  com.viaversion.viaversion.api.minecraft.item.data.WritableBook
 *  com.viaversion.viaversion.api.minecraft.item.data.WrittenBook
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_3
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap
 *  com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectArrayMap
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Attributes1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.BannerPatterns1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.DyeColors
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Enchantments1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.EquipmentSlots1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Instruments1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.MapDecorations1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.MaxStackSize1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.PotionEffects1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Potions1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ArmorTrimStorage
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.BannerPatternStorage
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.TagKeys
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.Either
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.MathUtil
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.UUIDUtil
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.checkerframework.checker.nullness.qual.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viafabricplus.api.events.LoadingCycleCallback;
import com.viaversion.viafabricplus.base.Events;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.minecraft.GlobalBlockPosition;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
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
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_20_3;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectArrayMap;
import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.Protocol1_20_3To1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Attributes1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.BannerPatterns1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.DyeColors;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Enchantments1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.EquipmentSlots1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Instruments1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.MapDecorations1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.MaxStackSize1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.PotionEffects1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Potions1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.EntityPacketRewriter1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.RecipeRewriter1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.StructuredDataConverter;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ArmorTrimStorage;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.BannerPatternStorage;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.TagKeys;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Either;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.MathUtil;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.UUIDUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class BlockItemPacketRewriter1_20_5
extends ItemRewriter<ClientboundPacket1_20_3, ServerboundPacket1_20_5, Protocol1_20_3To1_20_5> {
    public static final String[] MOB_TAGS = new String[]{"NoAI", "Silent", "NoGravity", "Glowing", "Invulnerable", "Health", "Age", "Variant", "HuntingCooldown", "BucketVariantTag"};
    public static final String[] ATTRIBUTE_OPERATIONS = new String[]{"add_value", "add_multiplied_base", "add_multiplied_total"};
    private static final StructuredDataConverter DATA_CONVERTER = new StructuredDataConverter(false);
    private static final GameProfile.Property[] EMPTY_PROPERTIES = new GameProfile.Property[0];
    private static final StatePropertyMatcher[] EMPTY_PROPERTY_MATCHERS = new StatePropertyMatcher[0];
    private final Set viaFabricPlus$foodItems_b1_7_3 = new HashSet();
    private final Map viaFabricPlus$armorMaxDamage_b1_8_1 = new HashMap();
    private final Map viaFabricPlus$toolDataChanges = new LinkedHashMap();

    public BlockItemPacketRewriter1_20_5(Protocol1_20_3To1_20_5 protocol1_20_3To1_20_5) {
        super((Protocol)protocol1_20_3To1_20_5, Types.ITEM1_20_2, Types.ITEM1_20_2_ARRAY, VersionedTypes.V1_20_5.item, VersionedTypes.V1_20_5.itemArray);
        this.handler$dka000$viafabricplus$loadItemMappings(protocol1_20_3To1_20_5, null);
    }

    private @Nullable String limit(@Nullable String string, int n) {
        if (string == null) {
            return null;
        }
        return string.length() > n ? string.substring(0, n) : string;
    }

    public Item handleItemToClient(UserConnection userConnection, @Nullable Item item) {
        if (item == null) {
            return StructuredItem.empty();
        }
        CompoundTag compoundTag = item.tag();
        Item item2 = this.toStructuredItem(userConnection, item);
        if (compoundTag != null) {
            compoundTag.putBoolean(this.nbtTagName(), true);
            item2.dataContainer().set(StructuredDataKey.CUSTOM_DATA, (Object)compoundTag);
        }
        this.appendItemDataFixComponents(userConnection, item2);
        if (Via.getConfig().handleInvalidItemCount() && item2.amount() > MaxStackSize1_20_3.getMaxStackSize((int)item2.identifier())) {
            item2.dataContainer().set(StructuredDataKey.MAX_STACK_SIZE, (Object)item2.amount());
        }
        return super.handleItemToClient(userConnection, item2);
    }

    public @Nullable Item handleItemToServer(UserConnection userConnection, Item item) {
        if (item.isEmpty()) {
            return null;
        }
        super.handleItemToServer(userConnection, item);
        return this.toOldItem(userConnection, item, DATA_CONVERTER);
    }

    public void registerPackets() {
        ((Protocol1_20_3To1_20_5)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.LEVEL_CHUNK_WITH_LIGHT, packetWrapper -> {
            Chunk chunk = ((Protocol1_20_3To1_20_5)this.protocol).getBlockRewriter().handleChunk1_18(packetWrapper);
            for (int i = 0; i < chunk.blockEntities().size(); ++i) {
                BlockEntity blockEntity = (BlockEntity)chunk.blockEntities().get(i);
                if (this.isUnknownBlockEntity(blockEntity.typeId())) {
                    chunk.blockEntities().remove(i--);
                    continue;
                }
                this.updateBlockEntityTag(packetWrapper.user(), null, blockEntity.tag());
            }
        });
        ((Protocol1_20_3To1_20_5)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.BLOCK_ENTITY_DATA, packetWrapper -> {
            packetWrapper.passthrough(Types.BLOCK_POSITION1_14);
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            if (this.isUnknownBlockEntity(n)) {
                packetWrapper.cancel();
                return;
            }
            CompoundTag compoundTag = (CompoundTag)packetWrapper.read(Types.TRUSTED_COMPOUND_TAG);
            if (compoundTag != null) {
                this.updateBlockEntityTag(packetWrapper.user(), null, compoundTag);
            } else {
                compoundTag = new CompoundTag();
            }
            packetWrapper.write(Types.TRUSTED_COMPOUND_TAG, (Object)compoundTag);
        });
        ((Protocol1_20_3To1_20_5)this.protocol).registerServerbound(ServerboundPackets1_20_5.CONTAINER_BUTTON_CLICK, packetWrapper -> {
            byte by = ((Integer)packetWrapper.read((Type)Types.VAR_INT)).byteValue();
            byte by2 = ((Integer)packetWrapper.read((Type)Types.VAR_INT)).byteValue();
            packetWrapper.write((Type)Types.BYTE, (Object)by);
            packetWrapper.write((Type)Types.BYTE, (Object)by2);
        });
        ((Protocol1_20_3To1_20_5)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.UPDATE_ADVANCEMENTS, packetWrapper -> {
            packetWrapper.passthrough((Type)Types.BOOLEAN);
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < n; ++i) {
                int n2;
                packetWrapper.passthrough(Types.STRING);
                packetWrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)packetWrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    packetWrapper.passthrough(Types.TRUSTED_TAG);
                    packetWrapper.passthrough(Types.TRUSTED_TAG);
                    Item item = this.handleNonEmptyItemToClient(packetWrapper.user(), (Item)packetWrapper.read(this.itemType()));
                    packetWrapper.write(this.mappedItemType(), (Object)item);
                    packetWrapper.passthrough((Type)Types.VAR_INT);
                    n2 = (Integer)packetWrapper.passthrough((Type)Types.INT);
                    if ((n2 & 1) != 0) {
                        packetWrapper.passthrough(Types.STRING);
                    }
                    packetWrapper.passthrough((Type)Types.FLOAT);
                    packetWrapper.passthrough((Type)Types.FLOAT);
                }
                int n3 = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
                for (n2 = 0; n2 < n3; ++n2) {
                    packetWrapper.passthrough(Types.STRING_ARRAY);
                }
                packetWrapper.passthrough((Type)Types.BOOLEAN);
            }
        });
        ((Protocol1_20_3To1_20_5)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.LEVEL_PARTICLES, packetWrapper -> {
            int n = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            packetWrapper.passthrough((Type)Types.BOOLEAN);
            packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.passthrough((Type)Types.DOUBLE);
            float f = ((Float)packetWrapper.passthrough((Type)Types.FLOAT)).floatValue();
            float f2 = ((Float)packetWrapper.passthrough((Type)Types.FLOAT)).floatValue();
            float f3 = ((Float)packetWrapper.passthrough((Type)Types.FLOAT)).floatValue();
            float f4 = ((Float)packetWrapper.passthrough((Type)Types.FLOAT)).floatValue();
            int n2 = (Integer)packetWrapper.passthrough((Type)Types.INT);
            ParticleMappings particleMappings = ((Protocol1_20_3To1_20_5)this.protocol).getMappingData().getParticleMappings();
            int n3 = particleMappings.getNewId(n);
            Particle particle = new Particle(n3);
            if (n3 == particleMappings.mappedId("entity_effect")) {
                int n4;
                if (f4 == 0.0f) {
                    n4 = 0;
                } else if (n2 != 0) {
                    n4 = ThreadLocalRandom.current().nextInt();
                } else {
                    int n5 = Math.round(f * 255.0f);
                    int n6 = Math.round(f2 * 255.0f);
                    int n7 = Math.round(f3 * 255.0f);
                    n4 = n5 << 16 | n6 << 8 | n7;
                }
                particle.add((Type)Types.INT, (Object)EntityPacketRewriter1_20_5.withAlpha(n4));
            } else if (n == particleMappings.id("dust_color_transition")) {
                for (int i = 0; i < 7; ++i) {
                    particle.add((Type)Types.FLOAT, (Object)((Float)packetWrapper.read((Type)Types.FLOAT)));
                }
                particle.add((Type)Types.FLOAT, (Object)((Float)particle.removeArgument(3).getValue()));
            } else if (particleMappings.isBlockParticle(n)) {
                int n8 = (Integer)packetWrapper.read((Type)Types.VAR_INT);
                particle.add((Type)Types.VAR_INT, (Object)((Protocol1_20_3To1_20_5)this.protocol).getMappingData().getNewBlockStateId(n8));
            } else if (particleMappings.isItemParticle(n)) {
                Item item = this.handleNonEmptyItemToClient(packetWrapper.user(), (Item)packetWrapper.read(Types.ITEM1_20_2));
                particle.add(VersionedTypes.V1_20_5.item, (Object)item);
            } else if (n == particleMappings.id("dust")) {
                for (int i = 0; i < 4; ++i) {
                    particle.add((Type)Types.FLOAT, (Object)((Float)packetWrapper.read((Type)Types.FLOAT)));
                }
            } else if (n == particleMappings.id("vibration")) {
                int n9 = (Integer)packetWrapper.read((Type)Types.VAR_INT);
                particle.add((Type)Types.VAR_INT, (Object)n9);
                if (n9 == 0) {
                    particle.add(Types.BLOCK_POSITION1_14, (Object)((BlockPosition)packetWrapper.read(Types.BLOCK_POSITION1_14)));
                } else if (n9 == 1) {
                    particle.add((Type)Types.VAR_INT, (Object)((Integer)packetWrapper.read((Type)Types.VAR_INT)));
                    particle.add((Type)Types.FLOAT, (Object)((Float)packetWrapper.read((Type)Types.FLOAT)));
                } else {
                    ((Protocol1_20_3To1_20_5)this.protocol).getLogger().warning("Unknown vibration path position source type: " + n9);
                }
                particle.add((Type)Types.VAR_INT, (Object)((Integer)packetWrapper.read((Type)Types.VAR_INT)));
            } else if (n == particleMappings.id("sculk_charge")) {
                particle.add((Type)Types.FLOAT, (Object)((Float)packetWrapper.read((Type)Types.FLOAT)));
            } else if (n == particleMappings.id("shriek")) {
                particle.add((Type)Types.VAR_INT, (Object)((Integer)packetWrapper.read((Type)Types.VAR_INT)));
            }
            packetWrapper.write((Type)VersionedTypes.V1_20_5.particle, (Object)particle);
        });
        ((Protocol1_20_3To1_20_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.EXPLODE, packetWrapper -> {
            packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.passthrough((Type)Types.FLOAT);
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < n; ++i) {
                packetWrapper.passthrough((Type)Types.BYTE);
                packetWrapper.passthrough((Type)Types.BYTE);
                packetWrapper.passthrough((Type)Types.BYTE);
            }
            packetWrapper.passthrough((Type)Types.FLOAT);
            packetWrapper.passthrough((Type)Types.FLOAT);
            packetWrapper.passthrough((Type)Types.FLOAT);
            packetWrapper.passthrough((Type)Types.VAR_INT);
            Particle particle = (Particle)packetWrapper.passthroughAndMap((Type)Types1_20_3.PARTICLE, (Type)VersionedTypes.V1_20_5.particle);
            Particle particle2 = (Particle)packetWrapper.passthroughAndMap((Type)Types1_20_3.PARTICLE, (Type)VersionedTypes.V1_20_5.particle);
            ((Protocol1_20_3To1_20_5)this.protocol).getParticleRewriter().rewriteParticle(packetWrapper.user(), particle);
            ((Protocol1_20_3To1_20_5)this.protocol).getParticleRewriter().rewriteParticle(packetWrapper.user(), particle2);
            String string = (String)packetWrapper.read(Types.STRING);
            Float f = (Float)packetWrapper.read((Type)Types.OPTIONAL_FLOAT);
            packetWrapper.write((Type)Types.SOUND_EVENT, (Object)Holder.of((Object)new SoundEvent(string, f)));
        });
        ((Protocol1_20_3To1_20_5)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.MERCHANT_OFFERS, packetWrapper -> {
            packetWrapper.passthrough((Type)Types.VAR_INT);
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < n; ++i) {
                Item item = this.handleNonEmptyItemToClient(packetWrapper.user(), (Item)packetWrapper.read(Types.ITEM1_20_2));
                packetWrapper.write(VersionedTypes.V1_20_5.itemCost, (Object)item);
                Item item2 = this.handleNonEmptyItemToClient(packetWrapper.user(), (Item)packetWrapper.read(Types.ITEM1_20_2));
                packetWrapper.write(VersionedTypes.V1_20_5.item, (Object)item2);
                Item item3 = (Item)packetWrapper.read(Types.ITEM1_20_2);
                if (item3 != null && (item3 = this.handleItemToClient(packetWrapper.user(), item3)).isEmpty()) {
                    item3 = null;
                }
                packetWrapper.write(VersionedTypes.V1_20_5.optionalItemCost, (Object)item3);
                packetWrapper.passthrough((Type)Types.BOOLEAN);
                packetWrapper.passthrough((Type)Types.INT);
                packetWrapper.passthrough((Type)Types.INT);
                packetWrapper.passthrough((Type)Types.INT);
                packetWrapper.passthrough((Type)Types.INT);
                packetWrapper.passthrough((Type)Types.FLOAT);
                packetWrapper.passthrough((Type)Types.INT);
            }
        });
        RecipeRewriter1_20_5 recipeRewriter1_20_5 = new RecipeRewriter1_20_5(this.protocol);
        ((Protocol1_20_3To1_20_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.UPDATE_RECIPES, packetWrapper -> {
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < n; ++i) {
                String string = (String)packetWrapper.read(Types.STRING);
                packetWrapper.passthrough(Types.STRING);
                packetWrapper.write((Type)Types.VAR_INT, (Object)((Protocol1_20_3To1_20_5)this.protocol).getMappingData().getRecipeSerializerMappings().mappedId(string));
                recipeRewriter1_20_5.handleRecipeType(packetWrapper, string);
            }
        });
        ((Protocol1_20_3To1_20_5)this.protocol).replaceServerbound(ServerboundPackets1_20_5.SET_CREATIVE_MODE_SLOT, packetWrapper -> {
            if (!((Protocol1_20_3To1_20_5)this.protocol).getEntityRewriter().tracker(packetWrapper.user()).canInstaBuild()) {
                packetWrapper.cancel();
                return;
            }
            packetWrapper.passthrough((Type)Types.SHORT);
            packetWrapper.write(this.itemType(), (Object)this.handleItemToServer(packetWrapper.user(), (Item)packetWrapper.read(this.mappedItemType())));
        });
    }

    private boolean isValidName(String string) {
        if (string.length() > 16) {
            return false;
        }
        int n = string.length();
        for (int i = 0; i < n; ++i) {
            char c = string.charAt(i);
            if (c >= '!' && c <= '~') continue;
            return false;
        }
        return true;
    }

    private void handler$dka000$viafabricplus$loadItemMappings(Protocol1_20_3To1_20_5 protocol1_20_3To1_20_5, CallbackInfo callbackInfo) {
        this.viaFabricPlus$foodItems_b1_7_3.add("minecraft:apple");
        this.viaFabricPlus$foodItems_b1_7_3.add("minecraft:mushroom_stew");
        this.viaFabricPlus$foodItems_b1_7_3.add("minecraft:bread");
        this.viaFabricPlus$foodItems_b1_7_3.add("minecraft:porkchop");
        this.viaFabricPlus$foodItems_b1_7_3.add("minecraft:cooked_porkchop");
        this.viaFabricPlus$foodItems_b1_7_3.add("minecraft:golden_apple");
        this.viaFabricPlus$foodItems_b1_7_3.add("minecraft:cod");
        this.viaFabricPlus$foodItems_b1_7_3.add("minecraft:cooked_cod");
        this.viaFabricPlus$foodItems_b1_7_3.add("minecraft:cookie");
        JsonObject jsonObject = ViaFabricPlusMappingDataLoader.INSTANCE.loadData("armor-damages-b1.8.1.json");
        for (Map.Entry entry : jsonObject.entrySet()) {
            this.viaFabricPlus$armorMaxDamage_b1_8_1.put((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsInt());
        }
        Events.LOADING_CYCLE.register(loadingCycle -> {
            if (loadingCycle != LoadingCycleCallback.LoadingCycle.POST_VIAVERSION_LOAD) {
                return;
            }
            JsonObject jsonObject = ViaFabricPlusMappingDataLoader.INSTANCE.loadData("item-tool-components.json");
            for (Map.Entry entry : jsonObject.entrySet()) {
                ProtocolVersion protocolVersion = ProtocolVersion.getClosest((String)((String)entry.getKey()));
                if (protocolVersion == null) {
                    throw new IllegalStateException("Unknown protocol version: " + (String)entry.getKey());
                }
                HashMap<String, ToolProperties> hashMap = new HashMap<String, ToolProperties>();
                JsonArray jsonArray = ((JsonElement)entry.getValue()).getAsJsonArray();
                for (JsonElement jsonElement : jsonArray) {
                    JsonObject jsonObject2 = jsonElement.getAsJsonObject();
                    String string = jsonObject2.get("item").getAsString();
                    float f = jsonObject2.get("default_mining_speed").getAsFloat();
                    int n = jsonObject2.get("damage_per_block").getAsInt();
                    int[] nArray = this.viaFabricPlus$blockJsonArrayToIds(protocolVersion, jsonObject2.getAsJsonArray("suitable_for"));
                    ArrayList<ToolRule> arrayList = new ArrayList<ToolRule>();
                    JsonArray jsonArray2 = jsonObject2.getAsJsonArray("mining_speeds");
                    for (JsonElement jsonElement2 : jsonArray2) {
                        JsonObject jsonObject3 = jsonElement2.getAsJsonObject();
                        int[] nArray2 = this.viaFabricPlus$blockJsonArrayToIds(protocolVersion, jsonObject3.getAsJsonArray("blocks"));
                        float f2 = jsonObject3.get("speed").getAsFloat();
                        arrayList.add(new ToolRule(HolderSet.of((int[])nArray2), Float.valueOf(f2), null));
                    }
                    if (nArray.length > 0) {
                        arrayList.add(new ToolRule(HolderSet.of((int[])nArray), null, Boolean.valueOf(true)));
                    }
                    hashMap.put(string, new ToolProperties(arrayList.toArray(new ToolRule[0]), f, n));
                }
                this.viaFabricPlus$toolDataChanges.put(protocolVersion, hashMap);
            }
        });
    }

    private boolean isUnknownBlockEntity(int n) {
        return n < 0 || n > 42;
    }

    private void updateWritableBookPages(StructuredDataContainer structuredDataContainer, CompoundTag compoundTag) {
        ListTag listTag = compoundTag.getListTag("pages", StringTag.class);
        CompoundTag compoundTag2 = compoundTag.getCompoundTag("filtered_pages");
        if (listTag == null) {
            return;
        }
        ArrayList<FilterableString> arrayList = new ArrayList<FilterableString>();
        for (int i = 0; i < listTag.size(); ++i) {
            StringTag stringTag;
            StringTag stringTag2 = (StringTag)listTag.get(i);
            String string = null;
            if (compoundTag2 != null && (stringTag = compoundTag2.getStringTag(String.valueOf(i))) != null) {
                string = this.limit(stringTag.getValue(), 1024);
            }
            arrayList.add(new FilterableString(this.limit(stringTag2.getValue(), 1024), string));
            if (arrayList.size() == 100) break;
        }
        structuredDataContainer.set(StructuredDataKey.WRITABLE_BOOK_CONTENT, (Object)new WritableBook(arrayList.toArray(new FilterableString[0])));
    }

    private void updateBlockEntityTag(UserConnection userConnection, @Nullable StructuredDataContainer structuredDataContainer, CompoundTag compoundTag) {
        BannerPatternLayer[] bannerPatternLayerArray;
        CompoundTag compoundTag2;
        StringTag stringTag;
        StringTag stringTag2;
        if (compoundTag == null) {
            return;
        }
        if (structuredDataContainer != null) {
            Object object;
            Object object2;
            Object object3;
            stringTag2 = compoundTag.getStringTag("Lock");
            if (stringTag2 != null) {
                structuredDataContainer.set(StructuredDataKey.LOCK1_20_5, (Object)stringTag2);
            }
            if ((stringTag = compoundTag.getListTag("Bees", CompoundTag.class)) != null) {
                this.updateBees(structuredDataContainer, (ListTag<CompoundTag>)stringTag);
                this.addBlockEntityId(compoundTag, "beehive");
            }
            if ((compoundTag2 = compoundTag.getListTag("sherds", StringTag.class)) != null && compoundTag2.size() == 4) {
                bannerPatternLayerArray = ((StringTag)compoundTag2.get(0)).getValue();
                object3 = ((StringTag)compoundTag2.get(1)).getValue();
                object2 = ((StringTag)compoundTag2.get(2)).getValue();
                object = ((StringTag)compoundTag2.get(3)).getValue();
                structuredDataContainer.set(StructuredDataKey.POT_DECORATIONS, (Object)new PotDecorations(this.toMappedItemId((String)bannerPatternLayerArray), this.toMappedItemId((String)object3), this.toMappedItemId((String)object2), this.toMappedItemId((String)object)));
                this.addBlockEntityId(compoundTag, "decorated_pot");
            }
            if ((bannerPatternLayerArray = compoundTag.getStringTag("note_block_sound")) != null) {
                structuredDataContainer.set(StructuredDataKey.NOTE_BLOCK_SOUND, (Object)Key.of((String)bannerPatternLayerArray.getValue()));
                this.addBlockEntityId(compoundTag, "player_head");
            }
            if ((object3 = compoundTag.getStringTag("LootTable")) != null) {
                long l = compoundTag.getLong("LootTableSeed");
                CompoundTag compoundTag3 = new CompoundTag();
                compoundTag3.putString("loot_table", object3.getValue());
                compoundTag3.putLong("loot_table_seed", l);
                structuredDataContainer.set(StructuredDataKey.CONTAINER_LOOT, (Object)compoundTag3);
            }
            if ((object2 = compoundTag.remove("Base")) instanceof NumberTag) {
                object = (NumberTag)object2;
                structuredDataContainer.set(StructuredDataKey.BASE_COLOR, (Object)object.asInt());
            }
            if ((object = compoundTag.getListTag("Items", CompoundTag.class)) != null) {
                byte by;
                Item item;
                int n = 0;
                int n2 = Math.min(object.size(), 256);
                for (int i = 0; i < n2; ++i) {
                    CompoundTag compoundTag4 = (CompoundTag)object.get(i);
                    item = this.itemFromTag(userConnection, compoundTag4);
                    if (item.isEmpty()) continue;
                    by = compoundTag4.getByte("Slot");
                    n = MathUtil.clamp((int)by, (int)n, (int)255);
                }
                Object[] objectArray = new Item[n + 1];
                Arrays.fill(objectArray, StructuredItem.empty());
                for (CompoundTag compoundTag4 : object) {
                    item = this.itemFromTag(userConnection, compoundTag4);
                    if (item.isEmpty() || (by = compoundTag4.getByte("Slot")) < 0 || by >= objectArray.length) continue;
                    objectArray[by] = item;
                }
                structuredDataContainer.set(StructuredDataKey.V1_20_5.container, (Object)objectArray);
                this.addBlockEntityId(compoundTag, "shulker_box");
            }
        }
        if ((stringTag2 = compoundTag.remove("SkullOwner")) instanceof StringTag) {
            stringTag = stringTag2;
            bannerPatternLayerArray = new CompoundTag();
            bannerPatternLayerArray.putString("name", stringTag.getValue());
            compoundTag.put("profile", (Tag)bannerPatternLayerArray);
        } else if (stringTag2 instanceof CompoundTag) {
            compoundTag2 = (CompoundTag)stringTag2;
            this.updateSkullOwnerTag(compoundTag, compoundTag2);
        }
        stringTag = compoundTag.getListTag("Patterns", CompoundTag.class);
        if (stringTag != null) {
            compoundTag2 = (BannerPatternStorage)userConnection.get(BannerPatternStorage.class);
            bannerPatternLayerArray = (BannerPatternLayer[])stringTag.stream().map(arg_0 -> BlockItemPacketRewriter1_20_5.lambda$updateBlockEntityTag$22((BannerPatternStorage)compoundTag2, arg_0)).filter(Objects::nonNull).toArray(BannerPatternLayer[]::new);
            compoundTag.remove("Patterns");
            compoundTag.put("patterns", (Tag)stringTag);
            this.addBlockEntityId(compoundTag, "banner");
            if (structuredDataContainer != null) {
                structuredDataContainer.set(StructuredDataKey.BANNER_PATTERNS, (Object)bannerPatternLayerArray);
            }
        }
        this.removeEmptyItem(compoundTag, "item");
        this.removeEmptyItem(compoundTag, "RecordItem");
        this.removeEmptyItem(compoundTag, "Book");
    }

    private void restoreToolFromBackup(CompoundTag compoundTag, StructuredDataContainer structuredDataContainer) {
        ListTag listTag = compoundTag.getListTag("rules", CompoundTag.class);
        if (listTag == null) {
            return;
        }
        ArrayList<ToolRule> arrayList = new ArrayList<ToolRule>();
        for (CompoundTag compoundTag2 : listTag) {
            HolderSet holderSet = null;
            Tag tag = compoundTag2.get("blocks");
            if (tag instanceof StringTag) {
                StringTag stringTag = (StringTag)tag;
                holderSet = HolderSet.of((String)stringTag.getValue());
            } else {
                tag = compoundTag2.getIntArrayTag("blocks");
                if (tag != null) {
                    holderSet = HolderSet.of((int[])tag.getValue());
                }
            }
            if (holderSet == null) continue;
            arrayList.add(new ToolRule(holderSet, compoundTag2.contains("speed") ? Float.valueOf(compoundTag2.getFloat("speed")) : null, compoundTag2.contains("correct_for_drops") ? Boolean.valueOf(compoundTag2.getBoolean("correct_for_drops")) : null));
        }
        structuredDataContainer.set(StructuredDataKey.TOOL1_20_5, (Object)new ToolProperties(arrayList.toArray(new ToolRule[0]), compoundTag.getFloat("default_mining_speed"), compoundTag.getInt("damage_per_block")));
    }

    private PotionEffectData readPotionEffectData(CompoundTag compoundTag) {
        byte by = compoundTag.getByte("amplifier");
        int n = compoundTag.getInt("duration");
        boolean bl = compoundTag.getBoolean("ambient");
        boolean bl2 = compoundTag.getBoolean("show_particles");
        boolean bl3 = compoundTag.getBoolean("show_icon");
        PotionEffectData potionEffectData = null;
        CompoundTag compoundTag2 = compoundTag.getCompoundTag("hidden_effect");
        if (compoundTag2 != null) {
            potionEffectData = this.readPotionEffectData(compoundTag2);
        }
        return new PotionEffectData((int)by, n, bl, bl2, bl3, potionEffectData);
    }

    private AdventureModePredicate updateBlockPredicates(UserConnection userConnection, ListTag<StringTag> listTag, boolean bl) {
        BlockPredicate[] blockPredicateArray = (BlockPredicate[])listTag.stream().map(StringTag::getValue).map(string -> this.deserializeBlockPredicate(userConnection, (String)string)).filter(Objects::nonNull).toArray(BlockPredicate[]::new);
        return new AdventureModePredicate(blockPredicateArray, bl);
    }

    public Item handleNonEmptyItemToClient(UserConnection userConnection, @Nullable Item item) {
        if ((item = this.handleItemToClient(userConnection, item)).isEmpty()) {
            return new StructuredItem(1, 1);
        }
        return item;
    }

    private void updateLodestoneTracker(boolean bl, CompoundTag compoundTag, String string, StructuredDataContainer structuredDataContainer) {
        GlobalBlockPosition globalBlockPosition = null;
        if (compoundTag != null && string != null) {
            int n = compoundTag.getInt("X");
            int n2 = compoundTag.getInt("Y");
            int n3 = compoundTag.getInt("Z");
            globalBlockPosition = new GlobalBlockPosition(string, n, n2, n3);
        }
        structuredDataContainer.set(StructuredDataKey.LODESTONE_TRACKER, (Object)new LodestoneTracker(globalBlockPosition, bl));
    }

    private void restoreFromBackupTag(CompoundTag compoundTag, StructuredDataContainer structuredDataContainer) {
        ListTag listTag;
        IntTag intTag;
        CompoundTag compoundTag2;
        CompoundTag compoundTag3;
        IntTag intTag2;
        IntTag intTag3;
        IntTag intTag4;
        Tag tag;
        ByteTag byteTag;
        IntArrayTag intArrayTag;
        CompoundTag compoundTag4 = compoundTag.getCompoundTag("instrument");
        if (compoundTag4 != null) {
            this.restoreInstrumentFromBackup(compoundTag4, structuredDataContainer);
        }
        if ((intArrayTag = compoundTag.getIntArrayTag("pot_decorations")) != null && intArrayTag.getValue().length == 4) {
            structuredDataContainer.set(StructuredDataKey.POT_DECORATIONS, (Object)new PotDecorations(intArrayTag.getValue()));
        }
        if ((byteTag = compoundTag.getByteTag("enchantment_glint_override")) != null) {
            structuredDataContainer.set(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, (Object)byteTag.asBoolean());
        }
        if (compoundTag.contains("hide_tooltip")) {
            structuredDataContainer.set(StructuredDataKey.HIDE_TOOLTIP);
        }
        if ((tag = compoundTag.get("intangible_projectile")) != null) {
            structuredDataContainer.set(StructuredDataKey.INTANGIBLE_PROJECTILE, (Object)tag);
        }
        if ((intTag4 = compoundTag.getIntTag("max_stack_size")) != null) {
            structuredDataContainer.set(StructuredDataKey.MAX_STACK_SIZE, (Object)MathUtil.clamp((int)intTag4.asInt(), (int)1, (int)99));
        }
        if ((intTag3 = compoundTag.getIntTag("max_damage")) != null) {
            structuredDataContainer.set(StructuredDataKey.MAX_DAMAGE, (Object)Math.max(intTag3.asInt(), 1));
        }
        if ((intTag2 = compoundTag.getIntTag("rarity")) != null) {
            structuredDataContainer.set(StructuredDataKey.RARITY, (Object)intTag2.asInt());
        }
        if ((compoundTag3 = compoundTag.getCompoundTag("food")) != null) {
            this.restoreFoodFromBackup(compoundTag3, structuredDataContainer);
        }
        if (compoundTag.contains("fire_resistant")) {
            structuredDataContainer.set(StructuredDataKey.FIRE_RESISTANT);
        }
        if ((compoundTag2 = compoundTag.getCompoundTag("tool")) != null) {
            this.restoreToolFromBackup(compoundTag2, structuredDataContainer);
        }
        if ((intTag = compoundTag.getIntTag("ominous_bottle_amplifier")) != null) {
            structuredDataContainer.set(StructuredDataKey.OMINOUS_BOTTLE_AMPLIFIER, (Object)MathUtil.clamp((int)intTag.asInt(), (int)0, (int)4));
        }
        if ((listTag = compoundTag.getListTag("banner_patterns", CompoundTag.class)) != null) {
            this.restoreBannerPatternsFromBackup((ListTag<CompoundTag>)listTag, structuredDataContainer);
        }
    }

    private void restoreFoodFromBackup(CompoundTag compoundTag, StructuredDataContainer structuredDataContainer) {
        int n = compoundTag.getInt("nutrition");
        float f = compoundTag.getFloat("saturation");
        boolean bl = compoundTag.getBoolean("can_always_eat");
        float f2 = compoundTag.getFloat("eat_seconds");
        ListTag listTag = compoundTag.getListTag("possible_effects", CompoundTag.class);
        if (listTag == null) {
            return;
        }
        ArrayList<FoodProperties1_20_5.FoodEffect> arrayList = new ArrayList<FoodProperties1_20_5.FoodEffect>();
        for (CompoundTag compoundTag2 : listTag) {
            CompoundTag compoundTag3 = compoundTag2.getCompoundTag("effect");
            if (compoundTag3 == null) continue;
            arrayList.add(new FoodProperties1_20_5.FoodEffect(new PotionEffect(compoundTag3.getInt("effect"), this.readPotionEffectData(compoundTag3)), compoundTag2.getFloat("probability")));
        }
        structuredDataContainer.set(StructuredDataKey.FOOD1_20_5, (Object)new FoodProperties1_20_5(n, f, bl, f2, null, arrayList.toArray(new FoodProperties1_20_5.FoodEffect[0])));
    }

    private void updateWrittenBookPages(UserConnection userConnection, StructuredDataContainer structuredDataContainer, CompoundTag compoundTag) {
        Tag tag;
        int n;
        Object object2;
        boolean bl;
        String string = compoundTag.getString("title");
        String string2 = compoundTag.getString("author");
        ListTag listTag = compoundTag.getListTag("pages", StringTag.class);
        boolean bl2 = bl = string2 != null && string != null && string.length() <= 32 && listTag != null;
        if (bl) {
            for (Object object2 : listTag) {
                if (object2.getValue().length() <= Short.MAX_VALUE) continue;
                bl = false;
                break;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (bl) {
            object2 = compoundTag.getCompoundTag("filtered_pages");
            for (n = 0; n < listTag.size(); ++n) {
                StringTag stringTag;
                StringTag stringTag2 = (StringTag)listTag.get(n);
                tag = null;
                if (object2 != null && (stringTag = object2.getStringTag(String.valueOf(n))) != null) {
                    try {
                        tag = this.jsonToTag(userConnection, stringTag);
                    }
                    catch (Exception exception) {
                        continue;
                    }
                }
                try {
                    stringTag = this.jsonToTag(userConnection, stringTag2);
                }
                catch (Exception exception) {
                    continue;
                }
                arrayList.add(new FilterableComponent((Tag)stringTag, tag));
            }
        } else {
            object2 = new CompoundTag();
            object2.putString("text", "* Invalid book tag *");
            object2.putString("color", "#AA0000");
            arrayList.add(new FilterableComponent((Tag)object2, null));
        }
        object2 = compoundTag.getString("filtered_title");
        n = compoundTag.getInt("generation");
        boolean bl3 = compoundTag.getBoolean("resolved");
        tag = new WrittenBook(new FilterableString(this.limit(string == null ? "" : string, 32), this.limit((String)object2, 32)), string2 == null ? "" : string2, MathUtil.clamp((int)n, (int)0, (int)3), arrayList.toArray(new FilterableComponent[0]), bl3);
        structuredDataContainer.set(StructuredDataKey.WRITTEN_BOOK_CONTENT, (Object)tag);
    }

    private void updateSkullOwnerTag(CompoundTag compoundTag, CompoundTag compoundTag2) {
        Tag tag;
        IntArrayTag intArrayTag;
        CompoundTag compoundTag3 = new CompoundTag();
        compoundTag.put("profile", (Tag)compoundTag3);
        String string = compoundTag2.getString("Name");
        if (string != null && this.isValidName(string)) {
            compoundTag3.putString("name", string);
        }
        if ((intArrayTag = compoundTag2.getIntArrayTag("Id")) != null) {
            compoundTag3.put("id", (Tag)intArrayTag);
        }
        if (!((tag = compoundTag2.remove("Properties")) instanceof CompoundTag)) {
            return;
        }
        CompoundTag compoundTag4 = (CompoundTag)tag;
        tag = new ListTag(CompoundTag.class);
        for (Map.Entry entry : compoundTag4.entrySet()) {
            Object object = entry.getValue();
            if (!(object instanceof ListTag)) continue;
            ListTag listTag = (ListTag)object;
            for (Tag tag2 : listTag) {
                if (!(tag2 instanceof CompoundTag)) continue;
                CompoundTag compoundTag5 = (CompoundTag)tag2;
                CompoundTag compoundTag6 = new CompoundTag();
                String string2 = compoundTag5.getString("Value", "");
                String string3 = compoundTag5.getString("Signature");
                compoundTag6.putString("name", (String)entry.getKey());
                compoundTag6.putString("value", string2);
                if (string3 != null) {
                    compoundTag6.putString("signature", string3);
                }
                tag.add((Tag)compoundTag6);
            }
        }
        compoundTag3.put("properties", tag);
    }

    private @Nullable BlockPredicate deserializeBlockPredicate(UserConnection userConnection, String string) {
        CompoundTag compoundTag;
        ArrayList<StatePropertyMatcher> arrayList;
        HolderSet holderSet;
        block11: {
            int n;
            String string2;
            int n2 = string.indexOf(91);
            int n3 = string.indexOf(123);
            int n4 = string.length();
            if (n2 != -1) {
                n4 = n2;
            }
            if (n3 != -1) {
                int n5 = n4 = n2 != -1 ? Math.min(n2, n3) : n3;
            }
            if (!(string2 = string.substring(0, n4)).startsWith("#")) {
                n = Protocol1_20_3To1_20_5.MAPPINGS.blockId(string2);
                if (n == -1) {
                    return null;
                }
                holderSet = HolderSet.of((int[])new int[]{n});
            } else {
                String string3 = string2.substring(1);
                if (!((TagKeys)userConnection.get(TagKeys.class)).isValidIdentifier(string3)) {
                    return null;
                }
                holderSet = HolderSet.of((String)string3);
            }
            n = string.indexOf(93);
            arrayList = new ArrayList<StatePropertyMatcher>();
            if (n2 != -1 && n != -1) {
                for (String string4 : string.substring(n2 + 1, n).split(",")) {
                    int n6 = string4.indexOf(61);
                    if (n6 == -1) continue;
                    String string5 = string4.substring(0, n6).trim();
                    String string6 = string4.substring(n6 + 1).trim();
                    arrayList.add(new StatePropertyMatcher(string5, Either.left((Object)string6)));
                }
            }
            int n7 = string.indexOf(125);
            compoundTag = null;
            if (n3 != -1 && n7 != -1) {
                try {
                    compoundTag = (CompoundTag)SerializerVersion.V1_20_3.toTag(string.substring(n3, n7 + 1));
                }
                catch (Exception exception) {
                    if (!Via.getManager().isDebug()) break block11;
                    Protocol1_20_3To1_20_5.LOGGER.log(Level.SEVERE, "Failed to parse block predicate tag: " + string.substring(n3, n7 + 1), (Throwable)exception);
                }
            }
        }
        return new BlockPredicate(holderSet, arrayList.isEmpty() ? null : arrayList.toArray(EMPTY_PROPERTY_MATCHERS), compoundTag);
    }

    private void updateMapDecorations(StructuredDataContainer structuredDataContainer, ListTag<CompoundTag> listTag) {
        CompoundTag compoundTag = new CompoundTag();
        for (CompoundTag compoundTag2 : listTag) {
            String string = compoundTag2.getString("id", "");
            int n = compoundTag2.getInt("type");
            double d = compoundTag2.getDouble("x");
            double d2 = compoundTag2.getDouble("z");
            float f = compoundTag2.getFloat("rot");
            CompoundTag compoundTag3 = new CompoundTag();
            compoundTag3.putString("type", MapDecorations1_20_5.idToKey((int)n));
            compoundTag3.putDouble("x", d);
            compoundTag3.putDouble("z", d2);
            compoundTag3.putFloat("rotation", f);
            compoundTag.put(string, (Tag)compoundTag3);
        }
        structuredDataContainer.set(StructuredDataKey.MAP_DECORATIONS, (Object)compoundTag);
    }

    private void handler$dka000$viafabricplus$appendItemDataFixComponents(UserConnection userConnection, Item item, CallbackInfo callbackInfo) {
        StructuredDataContainer structuredDataContainer = item.dataContainer();
        String string = ((Protocol1_20_3To1_20_5)this.protocol).getMappingData().getFullItemMappings().identifier(item.identifier());
        if (userConnection.getProtocolInfo().serverProtocolVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1) && this.viaFabricPlus$armorMaxDamage_b1_8_1.containsKey(string)) {
            structuredDataContainer.set(StructuredDataKey.MAX_DAMAGE, (Object)((Integer)this.viaFabricPlus$armorMaxDamage_b1_8_1.get(string)));
        }
        if (userConnection.getProtocolInfo().serverProtocolVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_7tob1_7_3) && this.viaFabricPlus$foodItems_b1_7_3.contains(string)) {
            structuredDataContainer.set(StructuredDataKey.MAX_STACK_SIZE, (Object)1);
            structuredDataContainer.setEmpty(StructuredDataKey.FOOD1_20_5);
        }
        for (Map.Entry entry : this.viaFabricPlus$toolDataChanges.entrySet()) {
            ToolProperties toolProperties;
            if (!userConnection.getProtocolInfo().serverProtocolVersion().olderThanOrEqualTo((ProtocolVersion)entry.getKey()) || (toolProperties = (ToolProperties)((Map)entry.getValue()).get(string)) == null) continue;
            structuredDataContainer.set(StructuredDataKey.TOOL1_20_5, (Object)toolProperties);
            break;
        }
    }

    private Tag jsonToTag(UserConnection userConnection, StringTag stringTag) {
        Tag tag = ComponentUtil.jsonStringToTag((String)stringTag.getValue(), (SerializerVersion)SerializerVersion.V1_20_3, (SerializerVersion)SerializerVersion.V1_20_3);
        ((Protocol1_20_3To1_20_5)this.protocol).getComponentRewriter().processTag(userConnection, tag);
        return tag;
    }

    public Item toOldItem(UserConnection userConnection, Item item, StructuredDataConverter structuredDataConverter) {
        StructuredDataContainer structuredDataContainer = item.dataContainer();
        structuredDataContainer.setIdLookup(this.protocol, true);
        StructuredData structuredData = structuredDataContainer.getNonEmptyData(StructuredDataKey.CUSTOM_DATA);
        CompoundTag compoundTag = structuredData != null ? (CompoundTag)structuredData.value() : new CompoundTag();
        DataItem dataItem = new DataItem(item.identifier(), (byte)item.amount(), compoundTag);
        if (!structuredDataConverter.backupInconvertibleData() && structuredData != null && compoundTag.remove(this.nbtTagName()) != null) {
            return dataItem;
        }
        for (StructuredData structuredData2 : structuredDataContainer.data().values()) {
            structuredDataConverter.writeToTag(userConnection, structuredData2, compoundTag);
        }
        if (compoundTag.isEmpty()) {
            dataItem.setTag(null);
        }
        return dataItem;
    }

    private void updateBees(StructuredDataContainer structuredDataContainer, ListTag<CompoundTag> listTag) {
        Bee[] beeArray = (Bee[])listTag.stream().map(compoundTag -> {
            CompoundTag compoundTag2 = compoundTag.getCompoundTag("EntityData");
            if (compoundTag2 == null) {
                return null;
            }
            int n = compoundTag.getInt("TicksInHive");
            int n2 = compoundTag.getInt("MinOccupationTicks");
            return new Bee(compoundTag2, n, n2);
        }).filter(Objects::nonNull).toArray(Bee[]::new);
        structuredDataContainer.set(StructuredDataKey.BEES1_20_5, (Object)beeArray);
    }

    private int[] viaFabricPlus$blockJsonArrayToIds(ProtocolVersion protocolVersion, JsonArray jsonArray) {
        IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
        for (JsonElement jsonElement : jsonArray) {
            String string = jsonElement.getAsString();
            if (string.startsWith("#")) {
                String string2 = string.substring(1);
                block1: for (Map.Entry entry : ViaFabricPlusMappingDataLoader.BLOCK_MATERIALS.entrySet()) {
                    for (Map.Entry entry2 : ((Map)entry.getValue()).entrySet()) {
                        if (!protocolVersion.olderThanOrEqualTo((ProtocolVersion)entry2.getKey()) || !((String)entry2.getValue()).equals(string2)) continue;
                        intOpenHashSet.add(((Protocol1_20_3To1_20_5)this.protocol).getMappingData().blockId((String)entry.getKey()));
                        continue block1;
                    }
                }
                continue;
            }
            if (string.startsWith("-")) {
                intOpenHashSet.remove(((Protocol1_20_3To1_20_5)this.protocol).getMappingData().blockId(string.substring(1)));
                continue;
            }
            intOpenHashSet.add(((Protocol1_20_3To1_20_5)this.protocol).getMappingData().blockId(string));
        }
        return intOpenHashSet.toIntArray();
    }

    private void appendItemDataFixComponents(UserConnection userConnection, Item item) {
        ProtocolVersion protocolVersion = userConnection.getProtocolInfo().serverProtocolVersion();
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_17_1)) {
            if (item.identifier() == 1182) {
                item.dataContainer().set(StructuredDataKey.MAX_DAMAGE, (Object)326);
            }
        }
        this.handler$dka000$viafabricplus$appendItemDataFixComponents(userConnection, item, null);
    }

    private void restoreInstrumentFromBackup(CompoundTag compoundTag, StructuredDataContainer structuredDataContainer) {
        Holder holder;
        int n = compoundTag.getInt("use_duration");
        float f = compoundTag.getFloat("range");
        CompoundTag compoundTag2 = compoundTag.getCompoundTag("sound_event");
        if (compoundTag2 != null) {
            StringTag stringTag = compoundTag2.getStringTag("identifier");
            if (stringTag == null) {
                return;
            }
            holder = Holder.of((Object)new SoundEvent(stringTag.getValue(), compoundTag2.contains("fixed_range") ? Float.valueOf(compoundTag2.getFloat("fixed_range")) : null));
        } else {
            holder = Holder.of((int)compoundTag.getInt("sound_event"));
        }
        structuredDataContainer.set(StructuredDataKey.INSTRUMENT1_20_5, (Object)Holder.of((Object)new Instrument1_20_5(holder, n, f)));
    }

    private void restoreBannerPatternsFromBackup(ListTag<CompoundTag> listTag, StructuredDataContainer structuredDataContainer) {
        ArrayList<BannerPatternLayer> arrayList = new ArrayList<BannerPatternLayer>();
        for (CompoundTag compoundTag : listTag) {
            Holder holder;
            CompoundTag compoundTag2 = compoundTag.getCompoundTag("pattern");
            if (compoundTag2 != null) {
                String string = compoundTag2.getString("asset_id");
                String string2 = compoundTag2.getString("translation_key");
                holder = Holder.of((Object)new BannerPattern(string, string2));
            } else {
                holder = Holder.of((int)compoundTag.getInt("pattern"));
            }
            int n = compoundTag.getInt("dye_color");
            arrayList.add(new BannerPatternLayer(holder, n));
        }
        structuredDataContainer.set(StructuredDataKey.BANNER_PATTERNS, (Object)arrayList.toArray(new BannerPatternLayer[0]));
    }

    private static /* synthetic */ BannerPatternLayer lambda$updateBlockEntityTag$22(BannerPatternStorage bannerPatternStorage, CompoundTag compoundTag) {
        String string = compoundTag.getString("Pattern", "");
        int n = compoundTag.getInt("Color", -1);
        String string2 = BannerPatterns1_20_5.compactToFullId((String)string);
        if (string2 == null || n == -1) {
            return null;
        }
        compoundTag.remove("Pattern");
        compoundTag.remove("Color");
        compoundTag.putString("pattern", string2);
        compoundTag.putString("color", DyeColors.idToKey((int)n));
        int n2 = bannerPatternStorage != null ? bannerPatternStorage.bannerPatterns().keyToId(string2) : BannerPatterns1_20_5.keyToId((String)string2);
        return n2 != -1 ? new BannerPatternLayer(Holder.of((int)n2), n) : null;
    }

    private void updateEffects(ListTag<CompoundTag> listTag, StructuredDataContainer structuredDataContainer) {
        ArrayList<SuspiciousStewEffect> arrayList = new ArrayList<SuspiciousStewEffect>();
        for (int i = 0; i < listTag.size(); ++i) {
            CompoundTag compoundTag = (CompoundTag)listTag.get(i);
            String string = compoundTag.getString("id", "luck");
            int n = compoundTag.getInt("duration");
            int n2 = PotionEffects1_20_5.keyToId((String)string);
            if (n2 == -1) continue;
            SuspiciousStewEffect suspiciousStewEffect = new SuspiciousStewEffect(n2, n);
            arrayList.add(suspiciousStewEffect);
        }
        structuredDataContainer.set(StructuredDataKey.SUSPICIOUS_STEW_EFFECTS, (Object)((SuspiciousStewEffect[])arrayList.toArray(SuspiciousStewEffect[]::new)));
    }

    private int unmappedItemId(String string) {
        return ((Protocol1_20_3To1_20_5)this.protocol).getMappingData().getFullItemMappings().id(string);
    }

    private void updateDisplay(UserConnection userConnection, StructuredDataContainer structuredDataContainer, CompoundTag compoundTag, int n) {
        NumberTag numberTag;
        ListTag listTag;
        StringTag stringTag2;
        if (compoundTag == null) {
            return;
        }
        NumberTag numberTag2 = compoundTag.getNumberTag("MapColor");
        if (numberTag2 != null) {
            structuredDataContainer.set(StructuredDataKey.MAP_COLOR, (Object)numberTag2.asInt());
        }
        if ((stringTag2 = compoundTag.getStringTag("Name")) != null) {
            try {
                listTag = this.jsonToTag(userConnection, stringTag2);
                structuredDataContainer.set(StructuredDataKey.CUSTOM_NAME, (Object)listTag);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if ((listTag = compoundTag.getListTag("Lore", StringTag.class)) != null) {
            try {
                structuredDataContainer.set(StructuredDataKey.LORE, (Object)((Tag[])listTag.stream().limit(256L).map(stringTag -> this.jsonToTag(userConnection, (StringTag)stringTag)).toArray(Tag[]::new)));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if ((numberTag = compoundTag.getNumberTag("color")) != null) {
            structuredDataContainer.set(StructuredDataKey.DYED_COLOR1_20_5, (Object)new DyedColor(numberTag.asInt(), (n & 0x40) == 0));
        }
    }

    private void updateBlockState(StructuredDataContainer structuredDataContainer, CompoundTag compoundTag) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (Map.Entry entry : compoundTag.entrySet()) {
            Tag tag = (Tag)entry.getValue();
            if (tag instanceof StringTag) {
                StringTag stringTag = (StringTag)tag;
                hashMap.put((String)entry.getKey(), stringTag.getValue());
                continue;
            }
            if (!(tag instanceof IntTag)) continue;
            IntTag intTag = (IntTag)tag;
            hashMap.put((String)entry.getKey(), Integer.toString(intTag.asInt()));
        }
        structuredDataContainer.set(StructuredDataKey.BLOCK_STATE, (Object)new BlockStateProperties(hashMap));
    }

    private void addBlockEntityId(CompoundTag compoundTag, String string) {
        if (!compoundTag.contains("id")) {
            compoundTag.putString("id", string);
        }
    }

    private void updateArmorTrim(UserConnection userConnection, StructuredDataContainer structuredDataContainer, CompoundTag compoundTag, boolean bl) {
        Holder holder;
        Object2ObjectArrayMap object2ObjectArrayMap;
        Object object;
        Object object2;
        StringTag stringTag;
        Holder holder2;
        StringTag stringTag2;
        Tag tag = compoundTag.get("material");
        ArmorTrimStorage armorTrimStorage = (ArmorTrimStorage)userConnection.get(ArmorTrimStorage.class);
        if (tag instanceof StringTag) {
            stringTag2 = (StringTag)tag;
            int n = armorTrimStorage.trimMaterials().keyToId(stringTag2.getValue());
            if (n == -1) {
                return;
            }
            holder2 = Holder.of((int)n);
        } else if (tag instanceof CompoundTag) {
            CompoundTag compoundTag2 = (CompoundTag)tag;
            StringTag stringTag3 = compoundTag2.getStringTag("asset_name");
            stringTag = compoundTag2.getStringTag("ingredient");
            if (stringTag3 == null || stringTag == null) {
                return;
            }
            int n = StructuredDataConverter.removeItemBackupTag(compoundTag2, this.toMappedItemId(stringTag.getValue()));
            if (n == -1) {
                return;
            }
            object2 = compoundTag2.getNumberTag("item_model_index");
            object = compoundTag2.getCompoundTag("override_armor_materials");
            Tag tag2 = compoundTag2.get("description");
            object2ObjectArrayMap = new Object2ObjectArrayMap();
            if (object != null) {
                for (Map.Entry entry : object.entrySet()) {
                    Object v = entry.getValue();
                    if (!(v instanceof StringTag)) continue;
                    StringTag stringTag4 = (StringTag)v;
                    object2ObjectArrayMap.put((String)entry.getKey(), stringTag4.getValue());
                }
            }
            holder2 = Holder.of((Object)new ArmorTrimMaterial(stringTag3.getValue(), n, object2 != null ? object2.asFloat() : 0.0f, (Map)object2ObjectArrayMap, tag2));
        } else {
            return;
        }
        stringTag2 = compoundTag.get("pattern");
        if (stringTag2 instanceof StringTag) {
            StringTag stringTag5 = stringTag2;
            int n = armorTrimStorage.trimPatterns().keyToId(stringTag5.getValue());
            if (n == -1) {
                return;
            }
            holder = Holder.of((int)n);
        } else if (stringTag2 instanceof CompoundTag) {
            stringTag = (CompoundTag)stringTag2;
            object2 = stringTag.getString("assetId");
            object = stringTag.getString("templateItem");
            if (object2 == null || object == null) {
                return;
            }
            int n = StructuredDataConverter.removeItemBackupTag((CompoundTag)stringTag, this.toMappedItemId((String)object));
            if (n == -1) {
                return;
            }
            object2ObjectArrayMap = stringTag.get("description");
            boolean bl2 = stringTag.getBoolean("decal");
            holder = Holder.of((Object)new ArmorTrimPattern((String)object2, n, (Tag)object2ObjectArrayMap, bl2));
        } else {
            return;
        }
        structuredDataContainer.set(StructuredDataKey.TRIM1_20_5, (Object)new ArmorTrim(holder2, holder, bl));
    }

    private FireworkExplosion readExplosion(CompoundTag compoundTag) {
        int n = compoundTag.getInt("Type");
        IntArrayTag intArrayTag = compoundTag.getIntArrayTag("Colors");
        IntArrayTag intArrayTag2 = compoundTag.getIntArrayTag("FadeColors");
        boolean bl = compoundTag.getBoolean("Trail");
        boolean bl2 = compoundTag.getBoolean("Flicker");
        return new FireworkExplosion(n, intArrayTag != null ? intArrayTag.getValue() : new int[]{}, intArrayTag2 != null ? intArrayTag2.getValue() : new int[]{}, bl, bl2);
    }

    private void updateAttributes(StructuredDataContainer structuredDataContainer, ListTag<CompoundTag> listTag, boolean bl) {
        ArrayList<AttributeModifiers1_20_5.AttributeModifier> arrayList = new ArrayList<AttributeModifiers1_20_5.AttributeModifier>();
        for (int i = 0; i < listTag.size(); ++i) {
            int n;
            int n2;
            int n3;
            CompoundTag compoundTag = (CompoundTag)listTag.get(i);
            String string = compoundTag.getString("AttributeName");
            String string2 = compoundTag.getString("Name");
            NumberTag numberTag = compoundTag.getNumberTag("Amount");
            IntArrayTag intArrayTag = compoundTag.getIntArrayTag("UUID");
            String string3 = compoundTag.getString("Slot", "any");
            if (string2 == null || string == null || numberTag == null || intArrayTag == null || (n3 = EquipmentSlots1_20_5.keyToId((String)string3)) == -1 || (n2 = compoundTag.getInt("Operation")) < 0 || n2 > 2 || (n = Attributes1_20_5.keyToId((String)string)) == -1) continue;
            arrayList.add(new AttributeModifiers1_20_5.AttributeModifier(n, new AttributeModifiers1_20_5.ModifierData(UUIDUtil.fromIntArray((int[])intArrayTag.getValue()), string2, numberTag.asDouble(), n2), n3));
        }
        structuredDataContainer.set(StructuredDataKey.ATTRIBUTE_MODIFIERS1_20_5, (Object)new AttributeModifiers1_20_5(arrayList.toArray(new AttributeModifiers1_20_5.AttributeModifier[0]), bl));
    }

    private void updateMobTags(StructuredDataContainer structuredDataContainer, CompoundTag compoundTag) {
        CompoundTag compoundTag2 = new CompoundTag();
        for (String string : MOB_TAGS) {
            Tag tag = compoundTag.get(string);
            if (tag == null) continue;
            compoundTag2.put(string, tag);
        }
        if (!compoundTag2.isEmpty()) {
            structuredDataContainer.set(StructuredDataKey.BUCKET_ENTITY_DATA, (Object)compoundTag2);
        }
    }

    private void updateItemList(UserConnection userConnection, StructuredDataContainer structuredDataContainer, CompoundTag compoundTag2, String string, StructuredDataKey<Item[]> structuredDataKey) {
        ListTag listTag = compoundTag2.getListTag(string, CompoundTag.class);
        if (listTag != null) {
            Item[] itemArray = (Item[])listTag.stream().limit(256L).map(compoundTag -> this.itemFromTag(userConnection, (CompoundTag)compoundTag)).filter(item -> !item.isEmpty()).toArray(Item[]::new);
            structuredDataContainer.set(structuredDataKey, (Object)itemArray);
        }
    }

    private void updateEnchantments(StructuredDataContainer structuredDataContainer, CompoundTag compoundTag, String string, StructuredDataKey<Enchantments> structuredDataKey, boolean bl) {
        ListTag listTag = compoundTag.getListTag(string, CompoundTag.class);
        if (listTag == null) {
            return;
        }
        Enchantments enchantments = new Enchantments((Int2IntMap)new Int2IntOpenHashMap(), bl);
        for (CompoundTag compoundTag2 : listTag) {
            int n;
            String string2 = compoundTag2.getString("id");
            NumberTag numberTag = compoundTag2.getNumberTag("lvl");
            if (string2 == null || numberTag == null) continue;
            if (Key.stripMinecraftNamespace((String)string2).equals("sweeping")) {
                string2 = Key.namespaced((String)"sweeping_edge");
            }
            if ((n = Enchantments1_20_5.keyToId((String)string2)) == -1) continue;
            enchantments.enchantments().put(n, MathUtil.clamp((int)numberTag.asInt(), (int)0, (int)255));
        }
        structuredDataContainer.set(structuredDataKey, (Object)enchantments);
        if (!listTag.isEmpty() && enchantments.size() == 0) {
            structuredDataContainer.set(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, (Object)true);
        }
    }

    private void updatePotionTags(StructuredDataContainer structuredDataContainer, CompoundTag compoundTag2) {
        int n;
        String string = compoundTag2.getString("Potion");
        Integer n2 = null;
        if (string != null && (n = Potions1_20_5.keyToId((String)string)) != -1) {
            n2 = n;
        }
        NumberTag numberTag = compoundTag2.getNumberTag("CustomPotionColor");
        ListTag listTag = compoundTag2.getListTag("custom_potion_effects", CompoundTag.class);
        PotionEffect[] potionEffectArray = null;
        if (listTag != null) {
            potionEffectArray = (PotionEffect[])listTag.stream().map(compoundTag -> {
                String string = compoundTag.getString("id");
                if (string == null) {
                    return null;
                }
                int n = PotionEffects1_20_5.keyToId((String)string);
                if (n == -1) {
                    return null;
                }
                return new PotionEffect(n, this.readPotionEffectData((CompoundTag)compoundTag));
            }).filter(Objects::nonNull).toArray(PotionEffect[]::new);
        }
        if (n2 != null || numberTag != null || potionEffectArray != null) {
            structuredDataContainer.set(StructuredDataKey.POTION_CONTENTS1_20_5, (Object)new PotionContents(n2, numberTag != null ? Integer.valueOf(numberTag.asInt()) : null, potionEffectArray != null ? potionEffectArray : new PotionEffect[]{}));
        }
    }

    public Item toStructuredItem(UserConnection userConnection, Item item) {
        CompoundTag compoundTag;
        ListTag listTag;
        ListTag listTag2;
        ListTag listTag3;
        boolean bl;
        int n;
        String string;
        CompoundTag compoundTag2;
        NumberTag numberTag;
        ListTag listTag4;
        CompoundTag compoundTag3;
        CompoundTag compoundTag4;
        NumberTag numberTag2;
        CompoundTag compoundTag5;
        CompoundTag compoundTag6;
        CompoundTag compoundTag7;
        CompoundTag compoundTag8;
        NumberTag numberTag3;
        NumberTag numberTag4;
        CompoundTag compoundTag9 = item.tag();
        StructuredItem structuredItem = new StructuredItem(item.identifier(), (int)((byte)item.amount()), new StructuredDataContainer());
        StructuredDataContainer structuredDataContainer = structuredItem.dataContainer();
        structuredDataContainer.setIdLookup(this.protocol, true);
        if (compoundTag9 == null) {
            return structuredItem;
        }
        int n2 = compoundTag9.getInt("HideFlags");
        if ((n2 & 0x20) != 0) {
            structuredDataContainer.set(StructuredDataKey.HIDE_ADDITIONAL_TOOLTIP);
        }
        this.updateDisplay(userConnection, structuredDataContainer, compoundTag9.getCompoundTag("display"), n2);
        NumberTag numberTag5 = compoundTag9.getNumberTag("Damage");
        if (numberTag5 != null && numberTag5.asInt() > 0) {
            structuredDataContainer.set(StructuredDataKey.DAMAGE, (Object)numberTag5.asInt());
        }
        if ((numberTag4 = compoundTag9.getNumberTag("RepairCost")) != null && numberTag4.asInt() > 0) {
            structuredDataContainer.set(StructuredDataKey.REPAIR_COST, (Object)numberTag4.asInt());
        }
        if ((numberTag3 = compoundTag9.getNumberTag("CustomModelData")) != null) {
            structuredDataContainer.set(StructuredDataKey.CUSTOM_MODEL_DATA1_20_5, (Object)numberTag3.asInt());
        }
        if ((compoundTag8 = compoundTag9.getCompoundTag("BlockStateTag")) != null) {
            this.updateBlockState(structuredDataContainer, compoundTag8);
        }
        if ((compoundTag7 = compoundTag9.getCompoundTag("EntityTag")) != null) {
            if ((compoundTag7 = compoundTag7.copy()).contains("variant")) {
                compoundTag7.putString("id", "minecraft:painting");
            }
            if (compoundTag7.contains("id")) {
                structuredDataContainer.set(StructuredDataKey.ENTITY_DATA1_20_5, (Object)compoundTag7);
            }
        }
        if ((compoundTag6 = compoundTag9.getCompoundTag("BlockEntityTag")) != null) {
            compoundTag5 = compoundTag6.copy();
            this.updateBlockEntityTag(userConnection, structuredDataContainer, compoundTag5);
            numberTag2 = compoundTag5.getCompoundTag("SpawnData");
            if (numberTag2 == null) {
                numberTag2 = compoundTag5.getCompoundTag("spawn_data");
            }
            if (numberTag2 != null && (compoundTag4 = numberTag2.getCompoundTag("entity")) != null && compoundTag4.getString("id") != null) {
                this.addBlockEntityId(compoundTag5, compoundTag5.contains("SpawnData") ? "mob_spawner" : "trial_spawner");
            }
            if (compoundTag5.contains("id")) {
                structuredItem.dataContainer().set(StructuredDataKey.BLOCK_ENTITY_DATA1_20_5, (Object)compoundTag5);
            }
        }
        if ((compoundTag5 = compoundTag9.getCompoundTag("DebugProperty")) != null) {
            structuredDataContainer.set(StructuredDataKey.DEBUG_STICK_STATE, (Object)new DebugStickState(compoundTag5.copy()));
        }
        if ((numberTag2 = compoundTag9.getNumberTag("Unbreakable")) != null && numberTag2.asBoolean()) {
            structuredDataContainer.set(StructuredDataKey.UNBREAKABLE1_20_5, (Object)new Unbreakable((n2 & 4) == 0));
        }
        if ((compoundTag4 = compoundTag9.getCompoundTag("Trim")) != null) {
            this.updateArmorTrim(userConnection, structuredDataContainer, compoundTag4, (n2 & 0x80) == 0);
        }
        if ((compoundTag3 = compoundTag9.getCompoundTag("Explosion")) != null) {
            structuredDataContainer.set(StructuredDataKey.FIREWORK_EXPLOSION, (Object)this.readExplosion(compoundTag3));
        }
        if ((listTag4 = compoundTag9.getListTag("Recipes", StringTag.class)) != null) {
            structuredDataContainer.set(StructuredDataKey.RECIPES, (Object)listTag4);
        }
        if ((numberTag = compoundTag9.getNumberTag("LodestoneTracked")) != null) {
            compoundTag2 = compoundTag9.getCompoundTag("LodestonePos");
            string = compoundTag9.getString("LodestoneDimension");
            this.updateLodestoneTracker(numberTag.asBoolean(), compoundTag2, string, structuredDataContainer);
        }
        if ((compoundTag2 = compoundTag9.getListTag("effects", CompoundTag.class)) != null) {
            this.updateEffects((ListTag<CompoundTag>)compoundTag2, structuredDataContainer);
        }
        if ((string = compoundTag9.getString("instrument")) != null && (n = Instruments1_20_3.keyToId((String)string)) != -1) {
            structuredDataContainer.set(StructuredDataKey.INSTRUMENT1_20_5, (Object)Holder.of((int)n));
        }
        ListTag listTag5 = compoundTag9.getListTag("AttributeModifiers", CompoundTag.class);
        boolean bl2 = bl = (n2 & 2) == 0;
        if (listTag5 != null) {
            this.updateAttributes(structuredDataContainer, (ListTag<CompoundTag>)listTag5, bl);
        } else if (!bl) {
            structuredDataContainer.set(StructuredDataKey.ATTRIBUTE_MODIFIERS1_20_5, (Object)new AttributeModifiers1_20_5(new AttributeModifiers1_20_5.AttributeModifier[0], false));
        }
        CompoundTag compoundTag10 = compoundTag9.getCompoundTag("Fireworks");
        if (compoundTag10 != null) {
            listTag3 = compoundTag10.getListTag("Explosions", CompoundTag.class);
            this.updateFireworks(structuredDataContainer, compoundTag10, (ListTag<CompoundTag>)listTag3);
        }
        if (item.identifier() == 1085) {
            this.updateWritableBookPages(structuredDataContainer, compoundTag9);
        } else if (item.identifier() == 1086) {
            this.updateWrittenBookPages(userConnection, structuredDataContainer, compoundTag9);
        }
        this.updatePotionTags(structuredDataContainer, compoundTag9);
        this.updateMobTags(structuredDataContainer, compoundTag9);
        this.updateItemList(userConnection, structuredDataContainer, compoundTag9, "ChargedProjectiles", (StructuredDataKey<Item[]>)StructuredDataKey.V1_20_5.chargedProjectiles);
        if (item.identifier() == 927) {
            this.updateItemList(userConnection, structuredDataContainer, compoundTag9, "Items", (StructuredDataKey<Item[]>)StructuredDataKey.V1_20_5.bundleContents);
        }
        this.updateEnchantments(structuredDataContainer, compoundTag9, "Enchantments", (StructuredDataKey<Enchantments>)StructuredDataKey.ENCHANTMENTS1_20_5, (n2 & 1) == 0);
        this.updateEnchantments(structuredDataContainer, compoundTag9, "StoredEnchantments", (StructuredDataKey<Enchantments>)StructuredDataKey.STORED_ENCHANTMENTS1_20_5, (n2 & 0x20) == 0);
        listTag3 = compoundTag9.getNumberTag("map");
        if (listTag3 != null) {
            structuredDataContainer.set(StructuredDataKey.MAP_ID, (Object)listTag3.asInt());
        }
        if ((listTag2 = compoundTag9.getListTag("Decorations", CompoundTag.class)) != null) {
            this.updateMapDecorations(structuredDataContainer, (ListTag<CompoundTag>)listTag2);
        }
        this.updateProfile(structuredDataContainer, compoundTag9.get("SkullOwner"));
        ListTag listTag6 = compoundTag9.getListTag("CanPlaceOn", StringTag.class);
        if (listTag6 != null) {
            structuredDataContainer.set(StructuredDataKey.CAN_PLACE_ON1_20_5, (Object)this.updateBlockPredicates(userConnection, (ListTag<StringTag>)listTag6, (n2 & 0x10) == 0));
        }
        if ((listTag = compoundTag9.getListTag("CanDestroy", StringTag.class)) != null) {
            structuredDataContainer.set(StructuredDataKey.CAN_BREAK1_20_5, (Object)this.updateBlockPredicates(userConnection, (ListTag<StringTag>)listTag, (n2 & 8) == 0));
        }
        if ((compoundTag = StructuredDataConverter.removeBackupTag(compoundTag9)) != null) {
            this.restoreFromBackupTag(compoundTag, structuredDataContainer);
        }
        return structuredItem;
    }

    private void updateProfile(StructuredDataContainer structuredDataContainer, Tag tag) {
        if (tag instanceof StringTag) {
            StringTag stringTag = (StringTag)tag;
            String string = stringTag.getValue();
            if (this.isValidName(string)) {
                structuredDataContainer.set(StructuredDataKey.PROFILE1_20_5, (Object)new GameProfile(string, null, EMPTY_PROPERTIES));
            }
        } else if (tag instanceof CompoundTag) {
            CompoundTag compoundTag = (CompoundTag)tag;
            String string = compoundTag.getString("Name", "");
            if (!this.isValidName(string)) {
                string = null;
            }
            IntArrayTag intArrayTag = compoundTag.getIntArrayTag("Id");
            UUID uUID = null;
            if (intArrayTag != null) {
                uUID = UUIDUtil.fromIntArray((int[])intArrayTag.getValue());
            }
            ArrayList<GameProfile.Property> arrayList = new ArrayList<GameProfile.Property>(1);
            CompoundTag compoundTag2 = compoundTag.getCompoundTag("Properties");
            if (compoundTag2 != null) {
                this.updateProperties(compoundTag2, arrayList);
            }
            structuredDataContainer.set(StructuredDataKey.PROFILE1_20_5, (Object)new GameProfile(string, uUID, arrayList.toArray(EMPTY_PROPERTIES)));
        }
    }

    private void updateFireworks(StructuredDataContainer structuredDataContainer, CompoundTag compoundTag, ListTag<CompoundTag> listTag) {
        byte by = compoundTag.getByte("Flight");
        Fireworks fireworks = new Fireworks((int)by, listTag != null ? (FireworkExplosion[])listTag.stream().limit(256L).map(this::readExplosion).toArray(FireworkExplosion[]::new) : new FireworkExplosion[]{});
        structuredDataContainer.set(StructuredDataKey.FIREWORKS, (Object)fireworks);
    }

    private Item itemFromTag(UserConnection userConnection, CompoundTag compoundTag) {
        String string = compoundTag.getString("id");
        if (string == null) {
            return StructuredItem.empty();
        }
        int n = StructuredDataConverter.removeItemBackupTag(compoundTag, this.unmappedItemId(string));
        if (n == -1) {
            return StructuredItem.empty();
        }
        byte by = compoundTag.getByte("Count", (byte)1);
        CompoundTag compoundTag2 = compoundTag.getCompoundTag("tag");
        return this.handleItemToClient(userConnection, (Item)new DataItem(n, by, compoundTag2));
    }

    private void removeEmptyItem(CompoundTag compoundTag, String string) {
        int n;
        CompoundTag compoundTag2 = compoundTag.getCompoundTag(string);
        if (compoundTag2 != null && (n = compoundTag2.getInt("id")) == 0) {
            compoundTag.remove(string);
        }
    }

    private int toMappedItemId(String string) {
        int n = this.unmappedItemId(string);
        return n != -1 ? ((Protocol1_20_3To1_20_5)this.protocol).getMappingData().getNewItemId(n) : -1;
    }

    private void updateProperties(CompoundTag compoundTag, List<GameProfile.Property> list) {
        for (Map.Entry entry : compoundTag.entrySet()) {
            Object object = entry.getValue();
            if (!(object instanceof ListTag)) continue;
            ListTag listTag = (ListTag)object;
            for (Tag tag : listTag) {
                if (!(tag instanceof CompoundTag)) continue;
                CompoundTag compoundTag2 = (CompoundTag)tag;
                String string = compoundTag2.getString("Value", "");
                String string2 = compoundTag2.getString("Signature");
                list.add(new GameProfile.Property(this.limit((String)entry.getKey(), 64), string, this.limit(string2, 1024)));
                if (list.size() != 16) continue;
                return;
            }
        }
    }
}

