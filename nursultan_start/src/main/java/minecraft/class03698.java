/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  minecraft.class03265
 */
package minecraft;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import minecraft.class03265;
import minecraft.class03662;
import minecraft.class03702;

public class class03698
implements JsonDeserializer<class03702> {
    public class03702 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        class03265 class032652 = this.N(jsonDeserializationContext, jsonObject, class03662.field_4320);
        class03265 class032653 = this.N(jsonDeserializationContext, jsonObject, class03662.field_4323);
        if (class032653 == class03265.N) {
            class032653 = class032652;
        }
        class03265 class032654 = this.N(jsonDeserializationContext, jsonObject, class03662.field_4322);
        class03265 class032655 = this.N(jsonDeserializationContext, jsonObject, class03662.field_4321);
        if (class032655 == class03265.N) {
            class032655 = class032654;
        }
        class03265 class032656 = this.N(jsonDeserializationContext, jsonObject, class03662.field_4316);
        class03265 class032657 = this.N(jsonDeserializationContext, jsonObject, class03662.field_4317);
        class03265 class032658 = this.N(jsonDeserializationContext, jsonObject, class03662.field_4318);
        class03265 class032659 = this.N(jsonDeserializationContext, jsonObject, class03662.field_4319);
        class03265 class0326510 = this.N(jsonDeserializationContext, jsonObject, class03662.field_61988);
        return new class03702(class032653, class032652, class032655, class032654, class032656, class032657, class032658, class032659, class0326510);
    }

    private class03265 N(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, class03662 class036622) {
        String string = class036622.method_15434();
        if (jsonObject.has(string)) {
            return (class03265)jsonDeserializationContext.deserialize(jsonObject.get(string), class03265.class);
        }
        return class03265.N;
    }
}

