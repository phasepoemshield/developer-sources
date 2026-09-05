/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.io.CharStreams
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.data.BiMappings
 *  com.viaversion.viaversion.api.data.Int2IntMapBiMappings
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.MappingDataLoader
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.reflect.TypeToken
 *  com.viaversion.viaversion.util.GsonUtil
 *  com.viaversion.viaversion.util.Int2IntBiHashMap
 *  com.viaversion.viaversion.util.Int2IntBiMap
 *  com.viaversion.viaversion.util.Key
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.data;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.io.CharStreams;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.data.BiMappings;
import com.viaversion.viaversion.api.data.Int2IntMapBiMappings;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.reflect.TypeToken;
import com.viaversion.viaversion.util.GsonUtil;
import com.viaversion.viaversion.util.Int2IntBiHashMap;
import com.viaversion.viaversion.util.Int2IntBiMap;
import com.viaversion.viaversion.util.Key;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

public class MappingData1_13
extends MappingDataBase {
    private final Map<String, int[]> blockTags = new HashMap<String, int[]>();
    private final Map<String, int[]> itemTags = new HashMap<String, int[]>();
    private final Map<String, int[]> fluidTags = new HashMap<String, int[]>();
    private final BiMap<Short, String> oldEnchantmentsIds = HashBiMap.create();
    private final Map<String, String> translateMapping = new HashMap<String, String>();
    private final Map<String, String> mojangTranslation = new HashMap<String, String>();
    private final BiMap<String, String> channelMappings = HashBiMap.create();

    private void loadTags(Map<String, int[]> output, CompoundTag newTags) {
        for (Map.Entry entry : newTags.entrySet()) {
            IntArrayTag ids = (IntArrayTag)entry.getValue();
            output.put(Key.namespaced((String)((String)entry.getKey())), ids.getValue());
        }
    }

    protected void loadExtras(CompoundTag data) {
        String[] unmappedTranslationLines;
        JsonObject object;
        this.loadTags(this.blockTags, data.getCompoundTag("block_tags"));
        this.loadTags(this.itemTags, data.getCompoundTag("item_tags"));
        this.loadTags(this.fluidTags, data.getCompoundTag("fluid_tags"));
        CompoundTag legacyEnchantments = data.getCompoundTag("legacy_enchantments");
        this.loadEnchantments((Map<Short, String>)this.oldEnchantmentsIds, legacyEnchantments);
        if (Via.getConfig().isSnowCollisionFix()) {
            this.blockMappings.setNewId(1248, 3416);
        }
        if (Via.getConfig().isInfestedBlocksFix()) {
            this.blockMappings.setNewId(1552, 1);
            this.blockMappings.setNewId(1553, 14);
            this.blockMappings.setNewId(1554, 3983);
            this.blockMappings.setNewId(1555, 3984);
            this.blockMappings.setNewId(1556, 3985);
            this.blockMappings.setNewId(1557, 3986);
        }
        if ((object = MappingDataLoader.INSTANCE.loadFromDataDir("channelmappings-1.13.json")) != null) {
            for (Map.Entry entry : object.entrySet()) {
                String oldChannel = (String)entry.getKey();
                String newChannel = ((JsonElement)entry.getValue()).getAsString();
                if (!Key.isValid((String)newChannel)) {
                    this.getLogger().warning("Channel '" + newChannel + "' is not a valid 1.13 plugin channel, please check your configuration!");
                    continue;
                }
                this.channelMappings.put((Object)oldChannel, (Object)newChannel);
            }
        }
        Map translationMappingData = (Map)GsonUtil.getGson().fromJson((Reader)new InputStreamReader(MappingData1_13.class.getClassLoader().getResourceAsStream("assets/viaversion/data/mapping-lang-1.12-1.13.json")), new TypeToken<Map<String, String>>(){}.getType());
        try (InputStreamReader reader = new InputStreamReader(MappingData1_13.class.getClassLoader().getResourceAsStream("assets/viaversion/data/en_US.properties"), StandardCharsets.UTF_8);){
            unmappedTranslationLines = CharStreams.toString((Readable)reader).split("\n");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String line : unmappedTranslationLines) {
            String[] keyAndTranslation;
            if (line.isEmpty() || (keyAndTranslation = line.split("=", 2)).length != 2) continue;
            String key = keyAndTranslation[0];
            String translation = keyAndTranslation[1].replaceAll("%(\\d\\$)?d", "%$1s").trim();
            this.mojangTranslation.put(key, translation);
            if (!translationMappingData.containsKey(key)) continue;
            String mappedKey = (String)translationMappingData.get(key);
            this.translateMapping.put(key, mappedKey != null ? mappedKey : key);
        }
    }

    public MappingData1_13() {
        super("1.12", "1.13");
    }

    protected @Nullable Mappings loadMappings(CompoundTag data, String key) {
        if (key.equals("blocks")) {
            return super.loadMappings(data, "blockstates");
        }
        if (key.equals("blockstates")) {
            return null;
        }
        return super.loadMappings(data, key);
    }

    public Map<String, String> getTranslateMapping() {
        return this.translateMapping;
    }

    public BiMap<Short, String> getOldEnchantmentsIds() {
        return this.oldEnchantmentsIds;
    }

    public Map<String, String> getMojangTranslation() {
        return this.mojangTranslation;
    }

    protected @Nullable BiMappings loadBiMappings(CompoundTag data, String key) {
        if (key.equals("items")) {
            return (BiMappings)MappingDataLoader.INSTANCE.loadMappings(data, "items", size -> {
                Int2IntBiHashMap map = new Int2IntBiHashMap(size);
                map.defaultReturnValue(-1);
                return map;
            }, Int2IntBiHashMap::put, (v, mappedSize) -> Int2IntMapBiMappings.of((Int2IntBiMap)v));
        }
        return super.loadBiMappings(data, key);
    }

    private void loadEnchantments(Map<Short, String> output, CompoundTag enchantments) {
        for (Map.Entry enty : enchantments.entrySet()) {
            output.put(Short.parseShort((String)enty.getKey()), ((StringTag)enty.getValue()).getValue());
        }
    }

    public static String validateNewChannel(String newId) {
        if (!Key.isValid((String)newId)) {
            return null;
        }
        return Key.namespaced((String)newId);
    }

    public Map<String, int[]> getItemTags() {
        return this.itemTags;
    }

    public BiMap<String, String> getChannelMappings() {
        return this.channelMappings;
    }

    public Map<String, int[]> getBlockTags() {
        return this.blockTags;
    }

    public Map<String, int[]> getFluidTags() {
        return this.fluidTags;
    }
}

