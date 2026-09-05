/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 */
package com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaaprilfools.api.data.VAFBackwardsMappingData;
import com.viaversion.viaaprilfools.api.data.VAFMappingDataLoader;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.Protocol1_21_5To_25w14craftmine;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;

public final class MappingData25w14craftmine
extends VAFBackwardsMappingData {
    private final Map<String, String> TRANSLATIONS = new HashMap<String, String>();
    private CompoundTag[] WORLD_EFFECTS;

    @Override
    protected void loadExtras(CompoundTag data) {
        super.loadExtras(data);
        JsonObject jsonObject = VAFMappingDataLoader.INSTANCE.loadFromDataDir("translations-25w14craftmine.json");
        for (Map.Entry entry : jsonObject.entrySet()) {
            this.TRANSLATIONS.put((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
        }
        CompoundTag worldEffects = VAFMappingDataLoader.INSTANCE.loadNBTFromFile("world-effects-25w14craftmine.nbt");
        this.WORLD_EFFECTS = new CompoundTag[worldEffects.size()];
        for (Map.Entry effect : worldEffects) {
            int index = Integer.parseInt((String)effect.getKey());
            this.WORLD_EFFECTS[index] = (CompoundTag)effect.getValue();
        }
    }

    public MappingData25w14craftmine() {
        super("25w14craftmine", "1.21.5", Protocol1_21_5To_25w14craftmine.class);
    }

    public String getTranslation(String key) {
        return this.TRANSLATIONS.getOrDefault(key, null);
    }

    public CompoundTag getWorldEffect(int id) {
        if (id < 0 || id >= this.WORLD_EFFECTS.length) {
            return null;
        }
        return this.WORLD_EFFECTS[id].copy();
    }
}

