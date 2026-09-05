/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.FloatTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.EitherHolder
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.CustomModelData1_21_4
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.rewriter.StructuredItemRewriter
 *  com.viaversion.viaversion.util.ArrayUtil
 *  com.viaversion.viaversion.util.Key
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.api.rewriters;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.FloatTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.data.MappedItem;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.EitherHolder;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.CustomModelData1_21_4;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.rewriter.StructuredItemRewriter;
import com.viaversion.viaversion.util.ArrayUtil;
import com.viaversion.viaversion.util.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.Nullable;

public class BackwardsStructuredItemRewriter<C extends ClientboundPacketType, S extends ServerboundPacketType, T extends BackwardsProtocol<C, ?, ?, S>>
extends StructuredItemRewriter<C, S, T> {
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final String GLOBAL_MODEL_DATA_MARKER = "VB|injected_cmd";
    private final String nbtTagName;

    public BackwardsStructuredItemRewriter(T protocol) {
        super(protocol);
        this.nbtTagName = "VB|" + protocol.getClass().getSimpleName();
    }

    protected void backupInconvertibleData(UserConnection connection, Item item, StructuredDataContainer dataContainer, CompoundTag backupTag) {
        MappedItem mappedItem;
        super.backupInconvertibleData(connection, item, dataContainer, backupTag);
        BackwardsMappingData mappingData = ((BackwardsProtocol)this.protocol).getMappingData();
        MappedItem mappedItem2 = mappedItem = mappingData != null ? mappingData.getMappedItem(item.identifier()) : null;
        if (mappedItem == null) {
            return;
        }
        CompoundTag customTag = this.createCustomTag(item);
        customTag.putInt(this.nbtTagName("id"), item.identifier());
        boolean addOriginalIdentifier = ViaBackwards.getConfig().passOriginalItemNameToResourcePacks();
        if (mappedItem.customModelData() != null || addOriginalIdentifier) {
            if (connection.getProtocolInfo().protocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_4)) {
                this.addCustomModelData(item, addOriginalIdentifier, mappedItem, customTag);
            } else if (mappedItem.customModelData() != null && !dataContainer.has(StructuredDataKey.CUSTOM_MODEL_DATA1_20_5)) {
                dataContainer.set(StructuredDataKey.CUSTOM_MODEL_DATA1_20_5, (Object)mappedItem.customModelData());
            }
        }
        if (!dataContainer.has(StructuredDataKey.CUSTOM_NAME)) {
            dataContainer.set(StructuredDataKey.CUSTOM_NAME, (Object)mappedItem.tagName());
            customTag.putBoolean(this.nbtTagName("added_custom_name"), true);
        }
    }

    protected void restoreBackupData(Item item, StructuredDataContainer container, CompoundTag customData) {
        super.restoreBackupData(item, container, customData);
        Tag tag = this.removeBackupTag(customData, "id");
        if (tag instanceof IntTag) {
            IntTag originalTag = (IntTag)tag;
            item.setIdentifier(originalTag.asInt());
            this.removeCustomTag(container, customData);
        }
        if ((tag = this.removeBackupTag(customData, "injected_custom_model_data")) instanceof StringTag) {
            StringTag injectedCustomModelData = (StringTag)tag;
            customData.remove(GLOBAL_MODEL_DATA_MARKER);
            container.replace(StructuredDataKey.CUSTOM_MODEL_DATA1_21_4, customModelData -> {
                String target = injectedCustomModelData.getValue();
                Object[] strings = customModelData.strings();
                for (int i = 0; i < strings.length; ++i) {
                    if (!strings[i].equals(target)) continue;
                    String[] filteredStrings = (String[])ArrayUtil.remove((Object[])strings, (int)i);
                    return new CustomModelData1_21_4(customModelData.floats(), customModelData.booleans(), filteredStrings, customModelData.colors());
                }
                return customModelData;
            });
        } else if (this.removeBackupTag(customData, "added_custom_model_data") != null) {
            customData.remove(GLOBAL_MODEL_DATA_MARKER);
            container.remove(StructuredDataKey.CUSTOM_MODEL_DATA1_21_4);
        }
    }

    public String nbtTagName() {
        return this.nbtTagName;
    }

    protected void saveListTag(CompoundTag tag, ListTag<?> original, String name) {
        String backupName = this.nbtTagName(name);
        if (!tag.contains(backupName)) {
            tag.put(backupName, (Tag)original.copy());
        }
    }

    protected void saveSoundEvent(SoundEvent soundEvent, CompoundTag tag) {
        tag.putString("identifier", soundEvent.identifier());
        if (soundEvent.fixedRange() != null) {
            tag.putFloat("fixed_range", soundEvent.fixedRange().floatValue());
        }
    }

    protected void restoreIntData(StructuredDataKey<Integer> key, StructuredDataContainer data, CompoundTag backupTag) {
        IntTag variant = backupTag.getIntTag(key.identifier());
        if (variant != null) {
            data.set(key, (Object)variant.asInt());
        }
    }

    protected void saveFloatData(StructuredDataKey<Float> key, StructuredDataContainer data, CompoundTag backupTag) {
        Float variant = (Float)data.get(key);
        if (variant != null) {
            backupTag.putFloat(key.identifier(), variant.floatValue());
        }
    }

    protected void saveKeyData(StructuredDataKey<Key> key, StructuredDataContainer data, CompoundTag backupTag) {
        Key value = (Key)data.get(key);
        if (value != null) {
            backupTag.putString(key.identifier(), value.original());
        }
    }

    protected <V> Holder<V> restoreHolder(CompoundTag tag, String key, Function<CompoundTag, V> valueRestoreFunction) {
        Tag savedTag = tag.get(key);
        if (savedTag == null) {
            return Holder.of((int)0);
        }
        if (savedTag instanceof IntTag) {
            IntTag idTag = (IntTag)savedTag;
            return Holder.of((int)idTag.asInt());
        }
        if (savedTag instanceof CompoundTag) {
            CompoundTag compoundTag = (CompoundTag)savedTag;
            return Holder.of(valueRestoreFunction.apply(compoundTag));
        }
        return Holder.of((int)0);
    }

    protected <V> void restoreHolderData(StructuredDataKey<Holder<V>> key, StructuredDataContainer data, CompoundTag backupTag, Function<CompoundTag, V> valueRestoreFunction) {
        if (backupTag.contains(key.identifier())) {
            data.set(key, this.restoreHolder(backupTag, key.identifier(), valueRestoreFunction));
        }
    }

    protected void saveStringData(StructuredDataKey<String> key, StructuredDataContainer data, CompoundTag backupTag) {
        String value = (String)data.get(key);
        if (value != null) {
            backupTag.putString(key.identifier(), value);
        }
    }

    protected void restoreStringData(StructuredDataKey<String> key, StructuredDataContainer data, CompoundTag backupTag) {
        String value = backupTag.getString(key.identifier());
        if (value != null) {
            data.set(key, (Object)value);
        }
    }

    protected void saveIntData(StructuredDataKey<Integer> key, StructuredDataContainer data, CompoundTag backupTag) {
        Integer variant = (Integer)data.get(key);
        if (variant != null) {
            backupTag.putInt(key.identifier(), variant.intValue());
        }
    }

    protected <V> Tag eitherHolderToTag(EitherHolder<V> holder, BiConsumer<V, CompoundTag> valueSaveFunction) {
        if (holder.hasKey()) {
            return new StringTag(holder.key());
        }
        return this.holderToTag(holder.holder(), valueSaveFunction);
    }

    private void addCustomModelData(Item item, boolean addOriginalIdentifier, MappedItem mappedItem, CompoundTag customTag) {
        StructuredDataContainer dataContainer = item.dataContainer();
        CustomModelData1_21_4 customModelData = (CustomModelData1_21_4)dataContainer.get(StructuredDataKey.CUSTOM_MODEL_DATA1_21_4);
        if (customModelData == null) {
            float[] fArray;
            String[] strings;
            if (addOriginalIdentifier) {
                String[] stringArray = new String[1];
                v1 = stringArray;
                stringArray[0] = ((BackwardsProtocol)this.protocol).getMappingData().getFullItemMappings().identifier(item.identifier());
            } else {
                v1 = strings = new String[]{};
            }
            if (mappedItem.customModelData() != null) {
                float[] fArray2 = new float[1];
                fArray = fArray2;
                fArray2[0] = mappedItem.customModelData().floatValue();
            } else {
                fArray = new float[]{};
            }
            customModelData = new CustomModelData1_21_4(fArray, new boolean[0], strings, EMPTY_INT_ARRAY);
            dataContainer.set(StructuredDataKey.CUSTOM_MODEL_DATA1_21_4, (Object)customModelData);
            customTag.putBoolean(GLOBAL_MODEL_DATA_MARKER, true);
            customTag.putBoolean(this.nbtTagName("added_custom_model_data"), true);
        } else if (addOriginalIdentifier && !customTag.contains(GLOBAL_MODEL_DATA_MARKER)) {
            String identifier = ((BackwardsProtocol)this.protocol).getMappingData().getFullItemMappings().identifier(item.identifier());
            dataContainer.set(StructuredDataKey.CUSTOM_MODEL_DATA1_21_4, (Object)new CustomModelData1_21_4(customModelData.floats(), customModelData.booleans(), (String[])ArrayUtil.add((Object[])customModelData.strings(), (Object)identifier), customModelData.colors()));
            customTag.putBoolean(GLOBAL_MODEL_DATA_MARKER, true);
            customTag.putString(this.nbtTagName("injected_custom_model_data"), identifier);
        }
    }

    protected void saveGenericTagList(CompoundTag tag, List<Tag> original, String name) {
        String backupName = this.nbtTagName(name);
        if (!tag.contains(backupName)) {
            CompoundTag output = new CompoundTag();
            for (int i = 0; i < original.size(); ++i) {
                output.put(Integer.toString(i), original.get(i));
            }
            tag.put(backupName, (Tag)output);
        }
    }

    protected void restoreFloatData(StructuredDataKey<Float> key, StructuredDataContainer data, CompoundTag backupTag) {
        FloatTag variant = backupTag.getFloatTag(key.identifier());
        if (variant != null) {
            data.set(key, (Object)Float.valueOf(variant.asFloat()));
        }
    }

    public <T extends Tag> @Nullable ListTag<T> removeListTag(CompoundTag tag, String tagName, Class<T> tagType) {
        String backupName = this.nbtTagName(tagName);
        ListTag data = tag.getListTag(backupName, tagType);
        if (data == null) {
            return null;
        }
        tag.remove(backupName);
        return data;
    }

    protected HolderSet restoreHolderSet(CompoundTag tag, String key) {
        Tag savedTag = tag.get(key);
        if (savedTag == null) {
            return HolderSet.of((int[])EMPTY_INT_ARRAY);
        }
        if (savedTag instanceof StringTag) {
            StringTag tagKey = (StringTag)savedTag;
            return HolderSet.of((String)tagKey.getValue());
        }
        if (savedTag instanceof IntArrayTag) {
            IntArrayTag idsTag = (IntArrayTag)savedTag;
            return HolderSet.of((int[])idsTag.getValue());
        }
        return HolderSet.of((int[])EMPTY_INT_ARRAY);
    }

    protected <V> Tag holderToTag(Holder<V> holder, BiConsumer<V, CompoundTag> valueSaveFunction) {
        if (holder.hasId()) {
            return new IntTag(holder.id());
        }
        CompoundTag savedTag = new CompoundTag();
        valueSaveFunction.accept(holder.value(), savedTag);
        return savedTag;
    }

    protected <V> void saveHolderData(StructuredDataKey<Holder<V>> key, StructuredDataContainer data, CompoundTag backupTag, BiConsumer<V, CompoundTag> valueSaveFunction) {
        Holder holder = (Holder)data.get(key);
        if (holder != null) {
            backupTag.put(key.identifier(), this.holderToTag(holder, valueSaveFunction));
        }
    }

    protected void restoreKeyData(StructuredDataKey<Key> key, StructuredDataContainer data, CompoundTag backupTag) {
        String value = backupTag.getString(key.identifier());
        if (value != null) {
            data.set(key, (Object)Key.of((String)value));
        }
    }

    protected List<Tag> removeGenericTagList(CompoundTag tag, String name) {
        String backupName = this.nbtTagName(name);
        CompoundTag data = tag.getCompoundTag(backupName);
        if (data == null) {
            return null;
        }
        tag.remove(backupName);
        return new ArrayList<Tag>(data.values());
    }

    protected <V> void saveEitherHolderData(StructuredDataKey<EitherHolder<V>> key, StructuredDataContainer data, CompoundTag backupTag, BiConsumer<V, CompoundTag> valueSaveFunction) {
        EitherHolder holder = (EitherHolder)data.get(key);
        if (holder != null) {
            backupTag.put(key.identifier(), this.eitherHolderToTag(holder, valueSaveFunction));
        }
    }

    protected void saveSoundEventHolder(CompoundTag tag, Holder<SoundEvent> holder) {
        tag.put("sound_event", this.holderToTag(holder, this::saveSoundEvent));
    }

    protected <V> EitherHolder<V> restoreEitherHolder(CompoundTag tag, String key, Function<CompoundTag, V> valueRestoreFunction) {
        Tag savedTag = tag.get(key);
        if (savedTag == null) {
            return EitherHolder.of((Holder)Holder.of((int)0));
        }
        if (savedTag instanceof StringTag) {
            StringTag keyTag = (StringTag)savedTag;
            return EitherHolder.of((String)keyTag.getValue());
        }
        return EitherHolder.of(this.restoreHolder(tag, key, valueRestoreFunction));
    }

    protected Holder<SoundEvent> restoreSoundEventHolder(CompoundTag tag) {
        return this.restoreSoundEventHolder(tag, "sound_event");
    }

    protected Holder<SoundEvent> restoreSoundEventHolder(CompoundTag tag, String key) {
        return this.restoreHolder(tag, key, soundEventTag -> {
            String identifier = soundEventTag.getString("identifier");
            FloatTag fixedRange = soundEventTag.getFloatTag("fixed_range");
            return new SoundEvent(identifier, fixedRange != null ? Float.valueOf(fixedRange.asFloat()) : null);
        });
    }

    protected Tag holderSetToTag(HolderSet set) {
        if (set.hasIds()) {
            return new IntArrayTag(set.ids());
        }
        return new StringTag(set.tagKey());
    }
}

