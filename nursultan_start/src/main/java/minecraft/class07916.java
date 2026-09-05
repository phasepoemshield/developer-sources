/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  minecraft.class01894
 *  minecraft.class05001
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import minecraft.class01894;
import minecraft.class05001;
import org.jspecify.annotations.Nullable;

public class class07916 {
    public static final String N = "2.0";
    public static final String y = "1.3.2";

    public static @Nullable JsonElement L(JsonObject jsonObject) {
        return jsonObject.get("params");
    }

    public static @Nullable JsonObject i(JsonObject jsonObject) {
        return class05001.N((JsonObject)jsonObject, (String)"error", null);
    }

    public static @Nullable JsonElement u(JsonObject jsonObject) {
        return jsonObject.get("result");
    }

    public static @Nullable String y(JsonObject jsonObject) {
        return class05001.N((JsonObject)jsonObject, (String)"method", null);
    }

    public static JsonObject N(JsonElement jsonElement, JsonElement jsonElement2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("jsonrpc", N);
        jsonObject.add("id", jsonElement);
        jsonObject.add("result", jsonElement2);
        return jsonObject;
    }

    public static @Nullable JsonElement N(JsonObject jsonObject) {
        return jsonObject.get("id");
    }

    public static JsonObject N(@Nullable Integer n, class01894 class018942, List<JsonElement> list) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("jsonrpc", N);
        if (n != null) {
            jsonObject.addProperty("id", (Number)n);
        }
        jsonObject.addProperty("method", class018942.toString());
        if (!list.isEmpty()) {
            JsonArray jsonArray = new JsonArray(list.size());
            for (JsonElement jsonElement : list) {
                jsonArray.add(jsonElement);
            }
            jsonObject.add("params", (JsonElement)jsonArray);
        }
        return jsonObject;
    }

    public static JsonObject N(JsonElement jsonElement, String string, int n, @Nullable String string2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("jsonrpc", N);
        jsonObject.add("id", jsonElement);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("code", (Number)n);
        jsonObject2.addProperty("message", string);
        if (string2 != null && !string2.isBlank()) {
            jsonObject2.addProperty("data", string2);
        }
        jsonObject.add("error", (JsonElement)jsonObject2);
        return jsonObject;
    }
}

