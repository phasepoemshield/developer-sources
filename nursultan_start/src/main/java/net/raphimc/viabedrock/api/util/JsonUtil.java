/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonPrimitive
 */
package net.raphimc.viabedrock.api.util;

import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class JsonUtil {
    public static Object getValue(JsonElement element) {
        if (element.isJsonPrimitive()) {
            JsonPrimitive primitive = element.getAsJsonPrimitive();
            if (primitive.isBoolean()) {
                return primitive.getAsBoolean();
            }
            if (primitive.isNumber()) {
                return primitive.getAsNumber();
            }
            return primitive.getAsString();
        }
        if (element.isJsonArray()) {
            JsonArray array = element.getAsJsonArray();
            ArrayList<Object> list = new ArrayList<Object>();
            for (int i = 0; i < array.size(); ++i) {
                list.add(JsonUtil.getValue(array.get(i)));
            }
            return list;
        }
        if (element.isJsonObject()) {
            JsonObject object = element.getAsJsonObject();
            HashMap<String, Object> map = new HashMap<String, Object>();
            for (Map.Entry entry : object.entrySet()) {
                map.put((String)entry.getKey(), JsonUtil.getValue((JsonElement)entry.getValue()));
            }
            return map;
        }
        return null;
    }

    public static void merge(JsonObject target, JsonObject source) {
        for (Map.Entry entry : source.entrySet()) {
            JsonElement targetElement = target.get((String)entry.getKey());
            if (targetElement == null) {
                target.add((String)entry.getKey(), ((JsonElement)entry.getValue()).deepCopy());
                continue;
            }
            if (!targetElement.isJsonObject() || !((JsonElement)entry.getValue()).isJsonObject()) continue;
            JsonUtil.merge(targetElement.getAsJsonObject(), ((JsonElement)entry.getValue()).getAsJsonObject());
        }
    }

    public static <T extends JsonElement> T sort(T element, Comparator<String> comparator) {
        if (element == null) {
            return null;
        }
        if (element.isJsonArray()) {
            JsonArray array = element.getAsJsonArray();
            for (int i = 0; i < array.size(); ++i) {
                array.set(i, JsonUtil.sort(array.get(i), comparator));
            }
            return (T)array;
        }
        if (element.isJsonObject()) {
            JsonObject object = element.getAsJsonObject();
            JsonObject sorted = new JsonObject();
            ArrayList<String> keys = new ArrayList<String>(object.keySet());
            keys.sort(comparator);
            for (String key : keys) {
                sorted.add(key, JsonUtil.sort(object.get(key), comparator));
            }
            return (T)sorted;
        }
        return element;
    }
}

