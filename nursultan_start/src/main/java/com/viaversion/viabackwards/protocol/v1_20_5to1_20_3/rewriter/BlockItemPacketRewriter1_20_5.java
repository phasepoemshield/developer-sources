/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter
 *  com.viaversion.viabackwards.api.rewriters.StructuredEnchantmentRewriter
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.item.ItemHasher
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.Particle$ParticleData
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.minecraft.item.data.FireworkExplosion
 *  com.viaversion.viaversion.api.minecraft.item.data.Fireworks
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_3
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPacket1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter.RecipeRewriter1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.Protocol1_20_3To1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.StructuredDataConverter
 *  com.viaversion.viaversion.util.Key
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter;
import com.viaversion.viabackwards.api.rewriters.StructuredEnchantmentRewriter;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.Protocol1_20_5To1_20_3;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.item.ItemHasher;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.minecraft.item.data.FireworkExplosion;
import com.viaversion.viaversion.api.minecraft.item.data.Fireworks;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_20_3;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter.RecipeRewriter1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.Protocol1_20_3To1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.StructuredDataConverter;
import com.viaversion.viaversion.util.Key;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class BlockItemPacketRewriter1_20_5
extends BackwardsStructuredItemRewriter<ClientboundPacket1_20_5, ServerboundPacket1_20_3, Protocol1_20_5To1_20_3> {
    private static final StructuredDataConverter DATA_CONVERTER = new StructuredDataConverter(true);
    private final Protocol1_20_3To1_20_5 vvProtocol = (Protocol1_20_3To1_20_5)Via.getManager().getProtocolManager().getProtocol(Protocol1_20_3To1_20_5.class);
    private final StructuredEnchantmentRewriter enchantmentRewriter = new StructuredEnchantmentRewriter((BackwardsStructuredItemRewriter)this);

    public BlockItemPacketRewriter1_20_5(Protocol1_20_5To1_20_3 protocol) {
        super((BackwardsProtocol)protocol);
        this.enchantmentRewriter.setRewriteIds(false);
    }

    protected void handleRewritablesToServer(UserConnection connection, StructuredDataContainer container) {
    }

    protected void handleRewritablesToClient(UserConnection connection, StructuredDataContainer container, @Nullable ItemHasher itemHasher) {
    }

    protected void handleItemDataComponentsToServer(UserConnection connection, Item item, StructuredDataContainer container) {
    }

    protected void handleItemDataComponentsToClient(UserConnection connection, Item item, StructuredDataContainer container) {
    }

    public @Nullable Item handleItemToClient(UserConnection connection, Item item) {
        CompoundTag customData;
        if (item.isEmpty()) {
            return null;
        }
        StructuredDataContainer data = item.dataContainer();
        item.dataContainer().setIdLookup(this.protocol, true);
        this.enchantmentRewriter.handleToClient(item);
        item = super.handleItemToClient(connection, item);
        this.updateTextComponent(connection, item, StructuredDataKey.ITEM_NAME, "item_name");
        this.updateTextComponent(connection, item, StructuredDataKey.CUSTOM_NAME, "custom_name");
        Tag[] lore = (Tag[])data.get(StructuredDataKey.LORE);
        if (lore != null) {
            for (Tag tag : lore) {
                ((Protocol1_20_5To1_20_3)this.protocol).getComponentRewriter().processTag(connection, tag);
            }
        }
        if (item.identifier() == 1105 && !data.has(StructuredDataKey.FIREWORKS)) {
            data.set(StructuredDataKey.FIREWORKS, (Object)new Fireworks(1, new FireworkExplosion[0]));
        }
        if ((customData = (CompoundTag)data.get(StructuredDataKey.CUSTOM_DATA)) != null) {
            customData = customData.copy();
        }
        Item oldItem = this.vvProtocol.getItemRewriter().toOldItem(connection, item, DATA_CONVERTER);
        if (customData != null) {
            if (oldItem.tag() == null) {
                oldItem.setTag(new CompoundTag());
            }
            oldItem.tag().put(this.nbtTagName(), (Tag)customData);
        } else if (oldItem.tag() != null && oldItem.tag().isEmpty()) {
            oldItem.setTag(null);
        }
        return oldItem;
    }

    public Item handleItemToServer(UserConnection connection, @Nullable Item item) {
        Tag tag;
        if (item == null) {
            return StructuredItem.empty();
        }
        Item structuredItem = this.vvProtocol.getItemRewriter().toStructuredItem(connection, item);
        if (item.tag() != null && (tag = item.tag().get(this.nbtTagName())) instanceof CompoundTag) {
            CompoundTag tag2 = (CompoundTag)tag;
            structuredItem.dataContainer().set(StructuredDataKey.CUSTOM_DATA, (Object)tag2);
        }
        structuredItem.dataContainer().setIdLookup(this.protocol, false);
        this.enchantmentRewriter.handleToServer(structuredItem);
        return super.handleItemToServer(connection, structuredItem);
    }

    public void registerPackets() {
        ((Protocol1_20_5To1_20_3)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_5.BLOCK_ENTITY_DATA, wrapper -> {
            wrapper.passthrough(Types.BLOCK_POSITION1_14);
            wrapper.passthrough((Type)Types.VAR_INT);
            CompoundTag tag = (CompoundTag)wrapper.passthrough(Types.TRUSTED_COMPOUND_TAG);
            ((Protocol1_20_5To1_20_3)this.protocol).getBlockRewriter().updateBlockEntityTag(tag);
        });
        ((Protocol1_20_5To1_20_3)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_3.CONTAINER_BUTTON_CLICK, wrapper -> {
            int containerId = (Byte)wrapper.read((Type)Types.BYTE) & 0xFF;
            int buttonId = (Byte)wrapper.read((Type)Types.BYTE) & 0xFF;
            wrapper.write((Type)Types.VAR_INT, (Object)containerId);
            wrapper.write((Type)Types.VAR_INT, (Object)buttonId);
        });
        ((Protocol1_20_5To1_20_3)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_5.LEVEL_PARTICLES, wrapper -> {
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            float data = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
            wrapper.passthrough((Type)Types.INT);
            Particle particle = (Particle)wrapper.read((Type)VersionedTypes.V1_20_5.particle());
            ((Protocol1_20_5To1_20_3)this.protocol).getParticleRewriter().rewriteParticle(wrapper.user(), particle);
            if (particle.id() == ((Protocol1_20_5To1_20_3)this.protocol).getMappingData().getParticleMappings().mappedId("entity_effect")) {
                int color = (Integer)particle.removeArgument(0).getValue();
                if (data == 0.0f) {
                    wrapper.set((Type)Types.FLOAT, 3, (Object)Float.valueOf(color));
                }
            } else if (particle.id() == ((Protocol1_20_5To1_20_3)this.protocol).getMappingData().getParticleMappings().mappedId("dust_color_transition")) {
                particle.add(3, (Type)Types.FLOAT, (Object)((Float)particle.removeArgument(6).getValue()));
            }
            wrapper.set((Type)Types.VAR_INT, 0, (Object)particle.id());
            for (Particle.ParticleData argument : particle.getArguments()) {
                argument.write(wrapper);
            }
        });
        ((Protocol1_20_5To1_20_3)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_5.EXPLODE, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.FLOAT);
            int blocks = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < blocks; ++i) {
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough((Type)Types.BYTE);
            }
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.VAR_INT);
            Particle smallExplosionParticle = (Particle)wrapper.passthroughAndMap((Type)VersionedTypes.V1_20_5.particle(), (Type)Types1_20_3.PARTICLE);
            Particle largeExplosionParticle = (Particle)wrapper.passthroughAndMap((Type)VersionedTypes.V1_20_5.particle(), (Type)Types1_20_3.PARTICLE);
            ((Protocol1_20_5To1_20_3)this.protocol).getParticleRewriter().rewriteParticle(wrapper.user(), smallExplosionParticle);
            ((Protocol1_20_5To1_20_3)this.protocol).getParticleRewriter().rewriteParticle(wrapper.user(), largeExplosionParticle);
            Holder soundEventHolder = (Holder)wrapper.read((Type)Types.SOUND_EVENT);
            if (soundEventHolder.isDirect()) {
                SoundEvent soundEvent = (SoundEvent)soundEventHolder.value();
                wrapper.write(Types.STRING, (Object)soundEvent.identifier());
                wrapper.write((Type)Types.OPTIONAL_FLOAT, (Object)soundEvent.fixedRange());
            } else {
                int soundId = ((Protocol1_20_5To1_20_3)this.protocol).getMappingData().getSoundMappings().getNewId(soundEventHolder.id());
                String soundKey = Protocol1_20_3To1_20_5.MAPPINGS.soundName(soundId);
                wrapper.write(Types.STRING, (Object)(soundKey != null ? soundKey : "minecraft:entity.generic.explode"));
                wrapper.write((Type)Types.OPTIONAL_FLOAT, null);
            }
        });
        ((Protocol1_20_5To1_20_3)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_5.MERCHANT_OFFERS, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                Item input = this.handleItemToClient(wrapper.user(), (Item)wrapper.read(VersionedTypes.V1_20_5.itemCost()));
                this.cleanInput(input);
                wrapper.write(Types.ITEM1_20_2, (Object)input);
                Item result = this.handleItemToClient(wrapper.user(), (Item)wrapper.read(VersionedTypes.V1_20_5.item()));
                wrapper.write(Types.ITEM1_20_2, (Object)result);
                Item secondInput = (Item)wrapper.read(VersionedTypes.V1_20_5.optionalItemCost());
                if (secondInput != null) {
                    secondInput = this.handleItemToClient(wrapper.user(), secondInput);
                    this.cleanInput(secondInput);
                }
                wrapper.write(Types.ITEM1_20_2, (Object)secondInput);
                wrapper.passthrough((Type)Types.BOOLEAN);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.FLOAT);
                wrapper.passthrough((Type)Types.INT);
            }
        });
        ((Protocol1_20_5To1_20_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_5.MAP_ITEM_DATA, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BOOLEAN);
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                int icons = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int i = 0; i < icons; ++i) {
                    int decorationType = (Integer)wrapper.read((Type)Types.VAR_INT);
                    wrapper.write((Type)Types.VAR_INT, (Object)(decorationType == 34 ? 32 : decorationType));
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG);
                }
            }
        });
        RecipeRewriter1_20_3 recipeRewriter = new RecipeRewriter1_20_3(this.protocol);
        ((Protocol1_20_5To1_20_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_5.UPDATE_RECIPES, wrapper -> {
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                String recipeIdentifier = (String)wrapper.read(Types.STRING);
                int serializerTypeId = (Integer)wrapper.read((Type)Types.VAR_INT);
                String serializerType = ((Protocol1_20_5To1_20_3)this.protocol).getMappingData().getRecipeSerializerMappings().mappedIdentifier(serializerTypeId);
                wrapper.write(Types.STRING, (Object)serializerType);
                wrapper.write(Types.STRING, (Object)recipeIdentifier);
                recipeRewriter.handleRecipeType(wrapper, Key.stripMinecraftNamespace((String)serializerType));
            }
        });
    }

    private void removeEmptyList(CompoundTag tag, String key) {
        ListTag list = tag.getListTag(key);
        if (list != null && list.isEmpty()) {
            tag.remove(key);
        }
    }

    private void cleanInput(@Nullable Item item) {
        if (item == null || item.tag() == null) {
            return;
        }
        CompoundTag tag = item.tag();
        StructuredDataConverter.removeBackupTag((CompoundTag)tag);
        CompoundTag display = tag.getCompoundTag("display");
        if (display != null) {
            this.removeEmptyList(display, "Lore");
            if (display.isEmpty()) {
                tag.remove("display");
            }
        }
        this.removeEmptyList(tag, "Enchantments");
        this.removeEmptyList(tag, "AttributeModifiers");
        if (tag.getInt("RepairCost", -1) == 0) {
            tag.remove("RepairCost");
        }
        if (tag.isEmpty()) {
            item.setTag(null);
        }
    }
}

