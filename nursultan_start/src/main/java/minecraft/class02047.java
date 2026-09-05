/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  minecraft.class02067
 *  minecraft.class05001
 *  minecraft.class07211
 *  minecraft.class08511
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import minecraft.class02052;
import minecraft.class02067;
import minecraft.class05001;
import minecraft.class07211;
import minecraft.class08511;
import org.jspecify.annotations.Nullable;

public class class02047
implements JsonDeserializer<class02067> {
    private static final int N = -1;
    private static final int y = 0;

    private static @Nullable class07211 L(JsonObject jsonObject) {
        return class07211.N((String)class05001.N((JsonObject)jsonObject, (String)"cullface", (String)""));
    }

    private static @Nullable class02052 i(JsonObject jsonObject) {
        if (!jsonObject.has("uv")) {
            return null;
        }
        JsonArray jsonArray = class05001.t((JsonObject)jsonObject, (String)"uv");
        if (jsonArray.size() != 4) {
            throw new JsonParseException("Expected 4 uv values, found: " + jsonArray.size());
        }
        float f = class05001.i((JsonElement)jsonArray.get(0), (String)"minU");
        float f2 = class05001.i((JsonElement)jsonArray.get(1), (String)"minV");
        float f3 = class05001.i((JsonElement)jsonArray.get(2), (String)"maxU");
        float f4 = class05001.i((JsonElement)jsonArray.get(3), (String)"maxV");
        return new class02052(f, f2, f3, f4);
    }

    private static class08511 u(JsonObject jsonObject) {
        return class08511.N((int)class05001.N((JsonObject)jsonObject, (String)"rotation", (int)0));
    }

    private static String y(JsonObject jsonObject) {
        return class05001.Z((JsonObject)jsonObject, (String)"texture");
    }

    public class02067 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        class07211 class072112 = class02047.L(jsonObject);
        int n = class02047.N(jsonObject);
        String string = class02047.y(jsonObject);
        class02052 class020522 = class02047.i(jsonObject);
        class08511 class085112 = class02047.u(jsonObject);
        return new class02067(class072112, n, string, class020522, class085112);
    }

    private static int N(JsonObject jsonObject) {
        return class05001.N((JsonObject)jsonObject, (String)"tintindex", (int)-1);
    }
}

