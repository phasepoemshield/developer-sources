/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter
 *  com.viaversion.viabackwards.api.rewriters.StructuredEnchantmentRewriter
 *  com.viaversion.viabackwards.api.rewriters.StructuredEnchantmentRewriter$DescriptionSupplier
 *  com.viaversion.viabackwards.protocol.v1_21to1_20_5.rewriter.BlockItemPacketRewriter1_21$PendingIdChange
 *  com.viaversion.viabackwards.protocol.v1_21to1_20_5.storage.EnchantmentsPaintingsStorage
 *  com.viaversion.viabackwards.protocol.v1_21to1_20_5.storage.OpenScreenStorage
 *  com.viaversion.viabackwards.protocol.v1_21to1_20_5.storage.PlayerRotationStorage
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.EitherHolder
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21$AttributeModifier
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21$ModifierData
 *  com.viaversion.viaversion.api.minecraft.item.data.Enchantments
 *  com.viaversion.viaversion.api.minecraft.item.data.JukeboxPlayable
 *  com.viaversion.viaversion.api.minecraft.item.data.JukeboxPlayable$JukeboxSong
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap$Entry
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.TextFormatting
 *  com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter.RecipeRewriter1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Enchantments1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.rewriter.BlockItemPacketRewriter1_21
 *  com.viaversion.viaversion.rewriter.IdRewriteFunction
 *  com.viaversion.viaversion.util.SerializerVersion
 */
package com.viaversion.viabackwards.protocol.v1_21to1_20_5.rewriter;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter;
import com.viaversion.viabackwards.api.rewriters.StructuredEnchantmentRewriter;
import com.viaversion.viabackwards.protocol.v1_21to1_20_5.Protocol1_21To1_20_5;
import com.viaversion.viabackwards.protocol.v1_21to1_20_5.rewriter.BlockItemPacketRewriter1_21;
import com.viaversion.viabackwards.protocol.v1_21to1_20_5.storage.EnchantmentsPaintingsStorage;
import com.viaversion.viabackwards.protocol.v1_21to1_20_5.storage.OpenScreenStorage;
import com.viaversion.viabackwards.protocol.v1_21to1_20_5.storage.PlayerRotationStorage;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.EitherHolder;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21;
import com.viaversion.viaversion.api.minecraft.item.data.Enchantments;
import com.viaversion.viaversion.api.minecraft.item.data.JukeboxPlayable;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.TextFormatting;
import com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter.RecipeRewriter1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Enchantments1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.rewriter.IdRewriteFunction;
import com.viaversion.viaversion.util.SerializerVersion;
import java.util.ArrayList;

public final class BlockItemPacketRewriter1_21
extends BackwardsStructuredItemRewriter<ClientboundPacket1_21, ServerboundPacket1_20_5, Protocol1_21To1_20_5> {
    private final StructuredEnchantmentRewriter enchantmentRewriter = new StructuredEnchantmentRewriter((BackwardsStructuredItemRewriter)this);

    public BlockItemPacketRewriter1_21(Protocol1_21To1_20_5 protocol) {
        super((BackwardsProtocol)protocol);
    }

    private void backupInconvertibleData(Item item) {
        AttributeModifiers1_21 attributeModifiers;
        StructuredDataContainer data = item.dataContainer();
        data.setIdLookup(this.protocol, true);
        CompoundTag backupTag = new CompoundTag();
        JukeboxPlayable jukeboxPlayable = (JukeboxPlayable)data.get(StructuredDataKey.JUKEBOX_PLAYABLE1_21);
        if (jukeboxPlayable != null) {
            CompoundTag tag = new CompoundTag();
            if (jukeboxPlayable.song().hasHolder()) {
                Holder songHolder = jukeboxPlayable.song().holder();
                tag.put("song", this.holderToTag(songHolder, (song, songTag) -> {
                    this.saveSoundEventHolder((CompoundTag)songTag, song.soundEvent());
                    songTag.put("description", song.description());
                    songTag.putFloat("length_in_seconds", song.lengthInSeconds());
                    songTag.putInt("comparator_output", song.comparatorOutput());
                }));
            } else {
                tag.putString("song_identifier", jukeboxPlayable.song().key());
            }
            tag.putBoolean("show_in_tooltip", jukeboxPlayable.showInTooltip());
            backupTag.put("jukebox_playable", (Tag)tag);
        }
        if ((attributeModifiers = (AttributeModifiers1_21)data.get(StructuredDataKey.ATTRIBUTE_MODIFIERS1_21)) != null) {
            ListTag attributeIds = new ListTag(StringTag.class);
            for (AttributeModifiers1_21.AttributeModifier modifier : attributeModifiers.modifiers()) {
                attributeIds.add((Tag)new StringTag(modifier.modifier().id()));
            }
            backupTag.put("attribute_modifiers", (Tag)attributeIds);
        }
        if (!backupTag.isEmpty()) {
            this.saveTag(this.createCustomTag(item), (Tag)backupTag, "inconvertible_data");
        }
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        boolean trident;
        if (item.isEmpty()) {
            return item;
        }
        StructuredDataContainer data = item.dataContainer();
        data.setIdLookup(this.protocol, true);
        EnchantmentsPaintingsStorage storage = (EnchantmentsPaintingsStorage)connection.get(EnchantmentsPaintingsStorage.class);
        IdRewriteFunction idRewriteFunction = id -> {
            String key = storage.enchantments().idToKey(id);
            return key != null ? Enchantments1_20_5.keyToId((String)key) : -1;
        };
        StructuredEnchantmentRewriter.DescriptionSupplier descriptionSupplier = (id, level) -> {
            Tag description = storage.enchantmentDescription(id);
            if (description == null) {
                return new StringTag("Unknown enchantment");
            }
            TextComponent component = SerializerVersion.V1_20_5.toComponent(description);
            component.getStyle().setItalic(Boolean.valueOf(false));
            component.getStyle().setFormatting(TextFormatting.GRAY);
            if (level != 1 || storage.enchantmentMaxLevel(id) != 1) {
                component.getSiblings().add(new StringComponent(" "));
                component.getSiblings().add(new TranslationComponent("enchantment.level.%s".formatted(new Object[]{level}), new Object[0]));
            }
            return SerializerVersion.V1_20_5.toTag(component);
        };
        this.enchantmentRewriter.rewriteEnchantmentsToClient(data, StructuredDataKey.ENCHANTMENTS1_20_5, idRewriteFunction, descriptionSupplier, false);
        this.enchantmentRewriter.rewriteEnchantmentsToClient(data, StructuredDataKey.STORED_ENCHANTMENTS1_20_5, idRewriteFunction, descriptionSupplier, true);
        int identifier = item.identifier();
        this.backupInconvertibleData(item);
        item = super.handleItemToClient(connection, item);
        com.viaversion.viaversion.protocols.v1_20_5to1_21.rewriter.BlockItemPacketRewriter1_21.downgradeItemData((Item)item);
        if (data.has(StructuredDataKey.RARITY)) {
            return item;
        }
        boolean bl = trident = identifier == 1188;
        if (trident || identifier == 1200) {
            data.set(StructuredDataKey.RARITY, (Object)(trident ? 3 : 1));
            this.saveTag(this.createCustomTag(item), (Tag)new ByteTag(true), "rarity");
        }
        return item;
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        if (item.isEmpty()) {
            return item;
        }
        StructuredDataContainer data = item.dataContainer();
        data.setIdLookup(this.protocol, false);
        EnchantmentsPaintingsStorage storage = (EnchantmentsPaintingsStorage)connection.get(EnchantmentsPaintingsStorage.class);
        this.rewriteEnchantmentToServer(storage, item, (StructuredDataKey<Enchantments>)StructuredDataKey.ENCHANTMENTS1_20_5);
        this.rewriteEnchantmentToServer(storage, item, (StructuredDataKey<Enchantments>)StructuredDataKey.STORED_ENCHANTMENTS1_20_5);
        this.enchantmentRewriter.handleToServer(item);
        item = super.handleItemToServer(connection, item);
        com.viaversion.viaversion.protocols.v1_20_5to1_21.rewriter.BlockItemPacketRewriter1_21.updateItemData((Item)item);
        this.restoreInconvertibleData(item);
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
        ((Protocol1_21To1_20_5)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21.OPEN_SCREEN, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int menuType = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            ((OpenScreenStorage)wrapper.user().get(OpenScreenStorage.class)).setMenuType(menuType);
            ((Protocol1_21To1_20_5)this.protocol).getComponentRewriter().passthroughAndProcess(wrapper);
        });
        ((Protocol1_21To1_20_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.CONTAINER_SET_DATA, wrapper -> {
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            short property = (Short)wrapper.passthrough((Type)Types.SHORT);
            if (property >= 4 && property <= 6) {
                OpenScreenStorage openScreenStorage = (OpenScreenStorage)wrapper.user().get(OpenScreenStorage.class);
                if (openScreenStorage.menuType() != 13) {
                    return;
                }
                short enchantmentId = (Short)wrapper.read((Type)Types.SHORT);
                EnchantmentsPaintingsStorage storage = (EnchantmentsPaintingsStorage)wrapper.user().get(EnchantmentsPaintingsStorage.class);
                String key = storage.enchantments().idToKey((int)enchantmentId);
                int mappedId = key != null ? Enchantments1_20_5.keyToId((String)key) : -1;
                wrapper.write((Type)Types.SHORT, (Object)((short)mappedId));
            }
        });
        ((Protocol1_21To1_20_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.HORSE_SCREEN_OPEN, wrapper -> {
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            int columns = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)(columns * 3 + 1));
        });
        ((Protocol1_21To1_20_5)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21.LEVEL_EVENT, wrapper -> {
            int event = (Integer)wrapper.passthrough((Type)Types.INT);
            wrapper.passthrough(Types.BLOCK_POSITION1_14);
            int data = (Integer)wrapper.read((Type)Types.INT);
            if (event == 1010) {
                int itemId = ((EnchantmentsPaintingsStorage)wrapper.user().get(EnchantmentsPaintingsStorage.class)).jubeboxSongToItem(data);
                if (itemId == -1) {
                    wrapper.cancel();
                    return;
                }
                wrapper.write((Type)Types.INT, (Object)itemId);
            } else if (event == 2001) {
                wrapper.write((Type)Types.INT, (Object)((Protocol1_21To1_20_5)this.protocol).getMappingData().getNewBlockStateId(data));
            } else {
                wrapper.write((Type)Types.INT, (Object)data);
            }
        });
        ((Protocol1_21To1_20_5)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.USE_ITEM, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            PlayerRotationStorage rotation = (PlayerRotationStorage)wrapper.user().get(PlayerRotationStorage.class);
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(rotation.yaw()));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(rotation.pitch()));
        });
        new RecipeRewriter1_20_3(this.protocol).register1_20_5((ClientboundPacketType)ClientboundPackets1_21.UPDATE_RECIPES);
    }

    private void restoreInconvertibleData(Item item) {
        Tag tag;
        StructuredDataContainer data = item.dataContainer();
        CompoundTag customData = (CompoundTag)data.get(StructuredDataKey.CUSTOM_DATA);
        if (customData == null || !((tag = customData.remove(this.nbtTagName("inconvertible_data"))) instanceof CompoundTag)) {
            return;
        }
        CompoundTag tag2 = (CompoundTag)tag;
        CompoundTag jukeboxPlayableTag = tag2.getCompoundTag("jukebox_playable");
        if (jukeboxPlayableTag != null) {
            String songIdentifier = tag2.getString("song_identifier");
            EitherHolder song = songIdentifier != null ? EitherHolder.of((String)songIdentifier) : EitherHolder.of((Holder)this.restoreHolder(jukeboxPlayableTag, "song", songTag -> {
                Holder soundEvent = this.restoreSoundEventHolder((CompoundTag)songTag);
                Tag description = songTag.get("description");
                float lengthInSeconds = songTag.getFloat("length_in_seconds");
                int comparatorOutput = songTag.getInt("comparator_output");
                return new JukeboxPlayable.JukeboxSong(soundEvent, description, lengthInSeconds, comparatorOutput);
            }));
            JukeboxPlayable jukeboxPlayable = new JukeboxPlayable(song, tag2.getBoolean("show_in_tooltip"));
            data.set(StructuredDataKey.JUKEBOX_PLAYABLE1_21, (Object)jukeboxPlayable);
        }
        ListTag attributeIds = tag2.getListTag("attribute_modifiers", StringTag.class);
        AttributeModifiers1_21 attributeModifiers = (AttributeModifiers1_21)data.get(StructuredDataKey.ATTRIBUTE_MODIFIERS1_21);
        if (attributeIds != null && attributeModifiers != null && attributeIds.size() == attributeModifiers.modifiers().length) {
            for (int i = 0; i < attributeIds.size(); ++i) {
                String id = ((StringTag)attributeIds.get(i)).getValue();
                AttributeModifiers1_21.AttributeModifier modifier = attributeModifiers.modifiers()[i];
                AttributeModifiers1_21.ModifierData updatedModifierData = new AttributeModifiers1_21.ModifierData(id, modifier.modifier().amount(), modifier.modifier().operation());
                attributeModifiers.modifiers()[i] = new AttributeModifiers1_21.AttributeModifier(modifier.attribute(), updatedModifierData, modifier.slotType());
            }
        }
        this.removeCustomTag(data, customData);
    }

    private void rewriteEnchantmentToServer(EnchantmentsPaintingsStorage storage, Item item, StructuredDataKey<Enchantments> key) {
        Enchantments enchantments = (Enchantments)item.dataContainer().get(key);
        if (enchantments == null) {
            return;
        }
        ArrayList<PendingIdChange> updatedIds = new ArrayList<PendingIdChange>();
        for (Int2IntMap.Entry entry : enchantments.enchantments().int2IntEntrySet()) {
            int mappedId;
            int id = entry.getIntKey();
            String enchantmentKey = Enchantments1_20_5.idToKey((int)id);
            if (enchantmentKey == null || id == (mappedId = storage.enchantments().keyToId(enchantmentKey))) continue;
            int level = entry.getIntValue();
            updatedIds.add(new PendingIdChange(id, mappedId, level));
        }
        for (PendingIdChange change : updatedIds) {
            enchantments.remove(change.id);
        }
        for (PendingIdChange change : updatedIds) {
            enchantments.add(change.mappedId, change.level);
        }
    }
}

