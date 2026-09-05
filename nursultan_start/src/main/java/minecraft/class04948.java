/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  minecraft.class04719
 *  minecraft.class05105
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;
import minecraft.class04719;
import minecraft.class05105;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04948
extends class05105 {
    private static final Logger M = LogUtils.getLogger();
    public final String N;
    public final Instant y;
    public final long L;
    public boolean u;
    public final Map<String, String> i;
    public final Map<String, String> R = new HashMap<String, String>();

    private class04948(String string, Instant instant, long l, Map<String, String> map) {
        this.N = string;
        this.y = instant;
        this.L = l;
        this.i = map;
    }

    public ZonedDateTime N() {
        return ZonedDateTime.ofInstant(this.y, ZoneId.systemDefault());
    }

    public static @Nullable class04948 N(JsonElement jsonElement) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        try {
            String string = class04719.N((String)"backupId", (JsonObject)jsonObject, (String)"");
            Instant instant = class04719.y((String)"lastModifiedDate", (JsonObject)jsonObject);
            long l = class04719.N((String)"size", (JsonObject)jsonObject, (long)0L);
            HashMap<String, String> hashMap = new HashMap<String, String>();
            if (jsonObject.has("metadata")) {
                for (Map.Entry entry : jsonObject.getAsJsonObject("metadata").entrySet()) {
                    if (((JsonElement)entry.getValue()).isJsonNull()) continue;
                    hashMap.put((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
                }
            }
            return new class04948(string, instant, l, hashMap);
        }
        catch (Exception exception) {
            M.error("Could not parse Backup", (Throwable)exception);
            return null;
        }
    }
}

