/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.data.BiMappings
 *  com.viaversion.viaversion.api.data.IdentityMappings
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectArrayMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.api.data;

import com.google.common.base.Preconditions;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingDataLoader;
import com.viaversion.viabackwards.api.data.ItemMappings;
import com.viaversion.viabackwards.api.data.MappedItem;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.data.BiMappings;
import com.viaversion.viaversion.api.data.IdentityMappings;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectArrayMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

public class BackwardsMappingData
extends MappingDataBase {
    private final Class<? extends Protocol<?, ?, ?, ?>> vvProtocolClass;
    protected Int2ObjectMap<MappedItem> backwardsItemMappings;
    private Map<String, String> entityNames;
    private Int2ObjectMap<String> enchantmentNames;

    protected void loadExtras(CompoundTag data) {
        CompoundTag itemNames = data.getCompoundTag("itemnames");
        if (itemNames != null) {
            Preconditions.checkNotNull((Object)this.itemMappings);
            this.backwardsItemMappings = new Int2ObjectOpenHashMap(itemNames.size());
            CompoundTag extraItemData = data.getCompoundTag("itemdata");
            for (Map.Entry entry : itemNames.entrySet()) {
                StringTag name = (StringTag)entry.getValue();
                int id = Integer.parseInt((String)entry.getKey());
                Integer customModelData = null;
                if (extraItemData != null && extraItemData.contains((String)entry.getKey())) {
                    CompoundTag entryTag = extraItemData.getCompoundTag((String)entry.getKey());
                    NumberTag customModelDataTag = entryTag.getNumberTag("custom_model_data");
                    customModelData = customModelDataTag != null ? Integer.valueOf(customModelDataTag.asInt()) : null;
                }
                this.backwardsItemMappings.put(id, (Object)new MappedItem(this.getNewItemId(id), name.getValue(), customModelData));
            }
        }
        this.entityNames = this.loadNameByStringMappings(data, "entitynames");
        this.enchantmentNames = this.loadNameByIdMappings(data, "enchantmentnames");
    }

    public BackwardsMappingData(String unmappedVersion, String mappedVersion) {
        this(unmappedVersion, mappedVersion, null);
    }

    public BackwardsMappingData(String unmappedVersion, String mappedVersion, @Nullable Class<? extends Protocol<?, ?, ?, ?>> vvProtocolClass) {
        super(unmappedVersion, mappedVersion);
        Preconditions.checkArgument((vvProtocolClass == null || !BackwardsProtocol.class.isAssignableFrom(vvProtocolClass) ? 1 : 0) != 0);
        this.vvProtocolClass = vvProtocolClass;
    }

    protected Logger getLogger() {
        return ViaBackwards.getPlatform().getLogger();
    }

    public int getOldItemId(int id) {
        return this.checkValidity(id, this.itemMappings.inverse().getNewId(id), "item");
    }

    public int getNewItemId(int id) {
        return this.itemMappings.getNewId(id);
    }

    public int getNewBlockId(int id) {
        return this.blockMappings.getNewId(id);
    }

    public @Nullable String mappedEntityName(String entityName) {
        if (this.entityNames == null) {
            this.getLogger().log(Level.SEVERE, "No entity mappings found when requesting them for " + entityName, new RuntimeException());
            return null;
        }
        return this.entityNames.get(entityName);
    }

    public @Nullable MappedItem getMappedItem(int id) {
        return this.backwardsItemMappings != null ? (MappedItem)this.backwardsItemMappings.get(id) : null;
    }

    protected @Nullable BiMappings loadBiMappings(CompoundTag data, String key) {
        if (key.equals("items") && this.vvProtocolClass != null) {
            Mappings mappings = super.loadMappings(data, key);
            MappingData mappingData = Via.getManager().getProtocolManager().getProtocol(this.vvProtocolClass).getMappingData();
            if (mappingData != null && mappingData.getItemMappings() != null) {
                BiMappings vvItemMappings = mappingData.getItemMappings();
                if (mappings == null) {
                    mappings = new IdentityMappings(vvItemMappings.mappedSize(), vvItemMappings.size());
                }
                return ItemMappings.of(mappings, (Mappings)vvItemMappings);
            }
        }
        return super.loadBiMappings(data, key);
    }

    protected @Nullable CompoundTag readMappingsFile(String name) {
        return BackwardsMappingDataLoader.INSTANCE.loadNBTFromDir(name);
    }

    public int getNewAttributeId(int id) {
        return this.attributeMappings.getNewId(id);
    }

    public @Nullable String mappedEnchantmentName(int enchantmentId) {
        if (this.enchantmentNames == null) {
            ViaBackwards.getPlatform().getLogger().log(Level.SEVERE, "No enchantment name mappings found when requesting " + enchantmentId, new RuntimeException());
            return null;
        }
        return (String)this.enchantmentNames.get(enchantmentId);
    }

    public @Nullable String getMappedNamedSound(String id) {
        return this.getFullSoundMappings().mappedIdentifier(id);
    }

    public @Nullable Int2ObjectMap<MappedItem> getBackwardsItemMappings() {
        return this.backwardsItemMappings;
    }

    public @Nullable Class<? extends Protocol<?, ?, ?, ?>> getViaVersionProtocolClass() {
        return this.vvProtocolClass;
    }

    private @Nullable Map<String, String> loadNameByStringMappings(CompoundTag data, String key) {
        CompoundTag nameMappings = data.getCompoundTag(key);
        if (nameMappings == null) {
            return null;
        }
        HashMap<String, String> map = new HashMap<String, String>(nameMappings.size());
        for (Map.Entry entry : nameMappings.entrySet()) {
            StringTag mappedTag = (StringTag)entry.getValue();
            map.put((String)entry.getKey(), mappedTag.getValue());
        }
        return map;
    }

    private @Nullable Int2ObjectMap<String> loadNameByIdMappings(CompoundTag data, String key) {
        CompoundTag nameMappings = data.getCompoundTag(key);
        if (nameMappings == null) {
            return null;
        }
        Int2ObjectArrayMap map = new Int2ObjectArrayMap(nameMappings.size());
        for (Map.Entry entry : nameMappings.entrySet()) {
            StringTag mappedTag = (StringTag)entry.getValue();
            map.put(Integer.parseInt((String)entry.getKey()), (Object)mappedTag.getValue());
        }
        return map;
    }
}

