/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 *  minecraft.class00167
 *  minecraft.class01894
 *  minecraft.class04237
 *  minecraft.class05001
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.UnbakedModelDeserializer
 */
package net.fabricmc.fabric.impl.client.model.loading;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import minecraft.class00167;
import minecraft.class01894;
import minecraft.class04237;
import minecraft.class05001;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.UnbakedModelDeserializer;

@Environment(value=EnvType.CLIENT)
public class UnbakedModelJsonDeserializer
implements JsonDeserializer<class00167> {
    private static final String TYPE_KEY = "fabric:type";
    private static final String TYPE_ID_KEY = "id";
    private static final String TYPE_OPTIONAL_KEY = "optional";

    public class00167 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        if (jsonObject.has(TYPE_KEY)) {
            JsonObject jsonObject2;
            boolean bl;
            String string;
            JsonElement jsonElement2 = jsonObject.get(TYPE_KEY);
            if (jsonElement2.isJsonPrimitive()) {
                string = jsonElement2.getAsString();
                bl = false;
            } else if (jsonElement2.isJsonObject()) {
                jsonObject2 = jsonElement2.getAsJsonObject();
                string = class05001.Z((JsonObject)jsonObject2, (String)TYPE_ID_KEY);
                bl = class05001.N((JsonObject)jsonObject2, (String)TYPE_OPTIONAL_KEY, (boolean)false);
            } else {
                throw new JsonSyntaxException("Expected fabric:type to be a string or object, was " + class05001.u((JsonElement)jsonElement2));
            }
            jsonObject2 = class01894.N((String)string);
            UnbakedModelDeserializer unbakedModelDeserializer = UnbakedModelDeserializer.get((class01894)jsonObject2);
            if (unbakedModelDeserializer != null) {
                return unbakedModelDeserializer.deserialize(jsonObject, jsonDeserializationContext);
            }
            if (!bl) {
                throw new JsonParseException("Cannot deserialize custom unbaked model of unknown type '" + String.valueOf(jsonObject2) + "'");
            }
        }
        return (class00167)jsonDeserializationContext.deserialize(jsonElement, class04237.class);
    }
}

