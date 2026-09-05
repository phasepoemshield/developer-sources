/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_20_5
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_20_5$AttributeModifier
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_20_5$ModifierData
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21$AttributeModifier
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21$ModifierData
 *  com.viaversion.viaversion.api.minecraft.item.data.Enchantments
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.data.AttributeModifierMappings1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.EfficiencyAttributeStorage
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.EfficiencyAttributeStorage$ActiveEnchants
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.PlayerPositionStorage
 *  com.viaversion.viaversion.rewriter.StructuredItemRewriter
 */
package com.viaversion.viaversion.protocols.v1_20_5to1_21.rewriter;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_20_5;
import com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21;
import com.viaversion.viaversion.api.minecraft.item.data.Enchantments;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter.RecipeRewriter1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.Protocol1_20_5To1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.data.AttributeModifierMappings1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.EfficiencyAttributeStorage;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.PlayerPositionStorage;
import com.viaversion.viaversion.rewriter.StructuredItemRewriter;
import java.util.Arrays;
import java.util.List;

public final class BlockItemPacketRewriter1_21
extends StructuredItemRewriter<ClientboundPacket1_20_5, ServerboundPacket1_20_5, Protocol1_20_5To1_21> {
    private static final List<String> DISCS = List.of("11", "13", "5", "blocks", "cat", "chirp", "far", "mall", "mellohi", "otherside", "pigstep", "relic", "stal", "strad", "wait", "ward");
    private static final int HELMET_SLOT = 5;
    private static final int CHESTPLATE_SLOT = 6;
    private static final int LEGGINGS_SLOT = 7;
    private static final int BOOTS_SLOT = 8;
    private static final int AQUA_AFFINITY_ID = 6;
    private static final int DEPTH_STRIDER_ID = 8;
    private static final int SWIFT_SNEAK_ID = 12;

    public BlockItemPacketRewriter1_21(Protocol1_20_5To1_21 protocol) {
        super((Protocol)protocol);
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        if (item.isEmpty()) {
            return item;
        }
        super.handleItemToClient(connection, item);
        BlockItemPacketRewriter1_21.updateItemData(item);
        StructuredDataContainer data = item.dataContainer();
        if (data.has(StructuredDataKey.RARITY)) {
            return item;
        }
        if (item.identifier() == 1188 || item.identifier() == 1200) {
            data.set(StructuredDataKey.RARITY, (Object)0);
            this.saveTag(this.createCustomTag(item), (Tag)new ByteTag(true), "rarity");
        }
        return item;
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        if (item.isEmpty()) {
            return item;
        }
        super.handleItemToServer(connection, item);
        BlockItemPacketRewriter1_21.downgradeItemData(item);
        StructuredDataContainer data = item.dataContainer();
        CompoundTag customData = (CompoundTag)data.get(StructuredDataKey.CUSTOM_DATA);
        if (customData == null) {
            return item;
        }
        if (customData.remove(this.nbtTagName("rarity")) != null) {
            data.remove(StructuredDataKey.RARITY);
            this.removeCustomTag(data, customData);
        }
        return item;
    }

    public void registerPackets() {
        ((Protocol1_20_5To1_21)this.protocol).replaceClientbound(ClientboundPackets1_20_5.CONTAINER_SET_SLOT, wrapper -> {
            byte containerId = (Byte)wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            short slotId = (Short)wrapper.passthrough((Type)Types.SHORT);
            Item item = this.handleItemToClient(wrapper.user(), (Item)wrapper.read(this.itemType()));
            wrapper.write(this.mappedItemType(), (Object)item);
            if (containerId != 0 || slotId > 8 || slotId < 5 || slotId == 6) {
                return;
            }
            EfficiencyAttributeStorage storage = (EfficiencyAttributeStorage)wrapper.user().get(EfficiencyAttributeStorage.class);
            Enchantments enchants = (Enchantments)item.dataContainer().get(StructuredDataKey.ENCHANTMENTS1_20_5);
            EfficiencyAttributeStorage.ActiveEnchants active = storage.activeEnchants();
            active = switch (slotId) {
                case 5 -> active.aquaAffinity(enchants == null ? 0 : enchants.getLevel(6));
                case 7 -> active.swiftSneak(enchants == null ? 0 : enchants.getLevel(12));
                case 8 -> active.depthStrider(enchants == null ? 0 : enchants.getLevel(8));
                default -> active;
            };
            storage.setEnchants(-1, wrapper.user(), active);
        });
        ((Protocol1_20_5To1_21)this.protocol).registerClientbound(ClientboundPackets1_20_5.HORSE_SCREEN_OPEN, wrapper -> {
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            int size = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)Math.max(0, (size - 1) / 3));
        });
        ((Protocol1_20_5To1_21)this.protocol).replaceClientbound(ClientboundPackets1_20_5.LEVEL_EVENT, wrapper -> {
            int id = (Integer)wrapper.passthrough((Type)Types.INT);
            wrapper.passthrough(Types.BLOCK_POSITION1_14);
            int data = (Integer)wrapper.read((Type)Types.INT);
            if (id == 1010) {
                int jukeboxSong = this.itemToJubeboxSong(data);
                if (jukeboxSong == -1) {
                    wrapper.cancel();
                    return;
                }
                wrapper.write((Type)Types.INT, (Object)jukeboxSong);
            } else if (id == 2001) {
                wrapper.write((Type)Types.INT, (Object)((Protocol1_20_5To1_21)this.protocol).getMappingData().getNewBlockStateId(data));
            } else {
                wrapper.write((Type)Types.INT, (Object)data);
            }
        });
        ((Protocol1_20_5To1_21)this.protocol).registerServerbound(ServerboundPackets1_20_5.USE_ITEM, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            float yaw = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float pitch = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            if (!Via.getConfig().fix1_21PlacementRotation()) {
                return;
            }
            PlayerPositionStorage storage = (PlayerPositionStorage)wrapper.user().get(PlayerPositionStorage.class);
            PacketWrapper playerRotation = wrapper.create((PacketType)ServerboundPackets1_20_5.MOVE_PLAYER_POS_ROT);
            playerRotation.write((Type)Types.DOUBLE, (Object)storage.x());
            playerRotation.write((Type)Types.DOUBLE, (Object)storage.y());
            playerRotation.write((Type)Types.DOUBLE, (Object)storage.z());
            playerRotation.write((Type)Types.FLOAT, (Object)Float.valueOf(yaw));
            playerRotation.write((Type)Types.FLOAT, (Object)Float.valueOf(pitch));
            playerRotation.write((Type)Types.BOOLEAN, (Object)storage.onGround());
            playerRotation.sendToServer(Protocol1_20_5To1_21.class);
            wrapper.sendToServer(Protocol1_20_5To1_21.class);
            wrapper.cancel();
        });
        new RecipeRewriter1_20_3(this.protocol).register1_20_5(ClientboundPackets1_20_5.UPDATE_RECIPES);
    }

    public static void updateItemData(Item item) {
        StructuredDataContainer dataContainer = item.dataContainer();
        dataContainer.replaceKey(StructuredDataKey.FOOD1_20_5, StructuredDataKey.FOOD1_21);
        dataContainer.replace(StructuredDataKey.ATTRIBUTE_MODIFIERS1_20_5, StructuredDataKey.ATTRIBUTE_MODIFIERS1_21, attributeModifiers -> {
            AttributeModifiers1_21.AttributeModifier[] modifiers = (AttributeModifiers1_21.AttributeModifier[])Arrays.stream(attributeModifiers.modifiers()).map(modifier -> {
                AttributeModifiers1_20_5.ModifierData modData = modifier.modifier();
                AttributeModifiers1_21.ModifierData updatedModData = new AttributeModifiers1_21.ModifierData(Protocol1_20_5To1_21.mapAttributeUUID(modData.uuid(), modData.name()), modData.amount(), modData.operation());
                return new AttributeModifiers1_21.AttributeModifier(modifier.attribute(), updatedModData, modifier.slotType());
            }).toArray(AttributeModifiers1_21.AttributeModifier[]::new);
            return new AttributeModifiers1_21(modifiers, attributeModifiers.showInTooltip());
        });
    }

    public static void downgradeItemData(Item item) {
        StructuredDataContainer dataContainer = item.dataContainer();
        dataContainer.replaceKey(StructuredDataKey.FOOD1_21, StructuredDataKey.FOOD1_20_5);
        dataContainer.remove(StructuredDataKey.JUKEBOX_PLAYABLE1_21);
        dataContainer.replace(StructuredDataKey.ATTRIBUTE_MODIFIERS1_21, StructuredDataKey.ATTRIBUTE_MODIFIERS1_20_5, attributeModifiers -> {
            AttributeModifiers1_20_5.AttributeModifier[] modifiers = (AttributeModifiers1_20_5.AttributeModifier[])Arrays.stream(attributeModifiers.modifiers()).map(modifier -> {
                AttributeModifiers1_21.ModifierData modData = modifier.modifier();
                String name = AttributeModifierMappings1_21.idToName((String)modData.id());
                AttributeModifiers1_20_5.ModifierData updatedModData = new AttributeModifiers1_20_5.ModifierData(Protocol1_20_5To1_21.mapAttributeId(modData.id()), name != null ? name : modData.id(), modData.amount(), modData.operation());
                return new AttributeModifiers1_20_5.AttributeModifier(modifier.attribute(), updatedModData, modifier.slotType());
            }).toArray(AttributeModifiers1_20_5.AttributeModifier[]::new);
            return new AttributeModifiers1_20_5(modifiers, attributeModifiers.showInTooltip());
        });
    }

    private int itemToJubeboxSong(int id) {
        String identifier = Protocol1_20_5To1_21.MAPPINGS.getFullItemMappings().identifier(id);
        if (!identifier.contains("music_disc_")) {
            return -1;
        }
        identifier = identifier.substring("minecraft:music_disc_".length());
        return DISCS.indexOf(identifier);
    }
}

