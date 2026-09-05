/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.util.GsonUtil
 *  net.raphimc.viabedrock.ViaBedrock
 */
package net.raphimc.viabedrock.api.item;

import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.util.GsonUtil;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.util.FileSystemUtil;

public class ItemUpgrader {
    private final Map<String, Int2ObjectMap<String>> remappedMetas = new HashMap<String, Int2ObjectMap<String>>();

    public ItemUpgrader() {
        try {
            for (byte[] data : FileSystemUtil.getFilesInDirectory("assets/viabedrock/item_upgrade_schema").values()) {
                JsonObject json = (JsonObject)GsonUtil.getGson().fromJson(new String(data, StandardCharsets.UTF_8), JsonObject.class);
                if (!json.has("remappedMetas")) continue;
                JsonObject remappedMetas = json.getAsJsonObject("remappedMetas");
                for (Map.Entry entry : remappedMetas.entrySet()) {
                    Int2ObjectMap metaMap = this.remappedMetas.computeIfAbsent((String)entry.getKey(), k -> new Int2ObjectOpenHashMap());
                    for (Map.Entry metaEntry : ((JsonElement)entry.getValue()).getAsJsonObject().entrySet()) {
                        metaMap.put(Integer.parseInt((String)metaEntry.getKey()), (Object)((JsonElement)metaEntry.getValue()).getAsString());
                    }
                }
            }
        }
        catch (Throwable e) {
            ViaBedrock.getPlatform().getLogger().log(Level.SEVERE, "Failed to load item upgrade schema", e);
            this.remappedMetas.clear();
        }
    }

    public String upgradeMetaItem(String identifier, int data) {
        Int2ObjectMap<String> metas = this.remappedMetas.get(identifier);
        if (metas == null) {
            return null;
        }
        return (String)metas.get(data);
    }
}

