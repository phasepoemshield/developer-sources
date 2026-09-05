/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class05001
 *  minecraft.class08314
 *  minecraft.class08326
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import minecraft.class05001;
import minecraft.class08314;
import minecraft.class08326;

public class class03731 {
    private static final String N = class03731.N("");

    public static String L(String string) {
        if (string.isEmpty() || string.equals("null")) {
            return N;
        }
        char c = string.charAt(0);
        char c2 = string.charAt(string.length() - 1);
        if (c == '\"' && c2 == '\"' || c == '{' && c2 == '}' || c == '[' && c2 == ']') {
            try {
                JsonElement jsonElement = class08314.N((String)string);
                if (jsonElement.isJsonPrimitive()) {
                    return class03731.N(jsonElement.getAsString());
                }
                return class05001.i((JsonElement)jsonElement);
            }
            catch (JsonParseException jsonParseException) {
                // empty catch block
            }
        }
        return class03731.N(string);
    }

    public static Optional<String> u(String string) {
        try {
            JsonElement jsonElement;
            JsonElement jsonElement2 = class08314.N((String)string);
            if (jsonElement2.isJsonObject() && (jsonElement = jsonElement2.getAsJsonObject().get("translate")) != null && jsonElement.isJsonPrimitive()) {
                return Optional.of(jsonElement.getAsString());
            }
        }
        catch (JsonParseException jsonParseException) {
            // empty catch block
        }
        return Optional.empty();
    }

    public static <T> Dynamic<T> y(DynamicOps<T> dynamicOps, String string) {
        String string2 = class03731.y(string);
        return new Dynamic(dynamicOps, dynamicOps.createString(string2));
    }

    public static String y(String string) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("translate", string);
        return class05001.i((JsonElement)jsonObject);
    }

    public static String N(String string) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("text", string);
        return class05001.i((JsonElement)jsonObject);
    }

    public static boolean N(Dynamic<?> dynamic) {
        return dynamic.asString().result().filter(string -> {
            try {
                class08326.N((String)string);
                return true;
            }
            catch (JsonParseException jsonParseException) {
                return false;
            }
        }).isPresent();
    }

    public static <T> Dynamic<T> N(DynamicOps<T> dynamicOps, String string) {
        String string2 = class03731.N(string);
        return new Dynamic(dynamicOps, dynamicOps.createString(string2));
    }

    public static <T> Dynamic<T> N(DynamicOps<T> dynamicOps) {
        return new Dynamic(dynamicOps, dynamicOps.createString(N));
    }
}

