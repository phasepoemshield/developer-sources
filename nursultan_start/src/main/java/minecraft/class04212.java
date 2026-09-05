/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  minecraft.class00140
 *  minecraft.class01894
 *  minecraft.class02081
 *  minecraft.class03702
 *  minecraft.class04237
 *  minecraft.class05001
 *  minecraft.class08505
 *  minecraft.class08534
 *  minecraft.class08814
 *  minecraft.class08838
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import minecraft.class00140;
import minecraft.class01894;
import minecraft.class02081;
import minecraft.class03702;
import minecraft.class04237;
import minecraft.class05001;
import minecraft.class08505;
import minecraft.class08534;
import minecraft.class08814;
import minecraft.class08838;
import org.jspecify.annotations.Nullable;

public class class04212
implements JsonDeserializer<class04237> {
    private String L(JsonObject jsonObject) {
        return class05001.N((JsonObject)jsonObject, (String)"parent", (String)"");
    }

    private class08814 y(JsonObject jsonObject) {
        if (jsonObject.has("textures")) {
            return class08838.N((JsonObject)class05001.n((JsonObject)jsonObject, (String)"textures"));
        }
        return class08814.y;
    }

    public class04237 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject;
        JsonObject jsonObject2 = jsonElement.getAsJsonObject();
        class08534 class085342 = this.N(jsonDeserializationContext, jsonObject2);
        String string = this.L(jsonObject2);
        class08814 class088142 = this.y(jsonObject2);
        Boolean bl = this.N(jsonObject2);
        class03702 class037022 = null;
        if (jsonObject2.has("display")) {
            jsonObject = class05001.n((JsonObject)jsonObject2, (String)"display");
            class037022 = (class03702)jsonDeserializationContext.deserialize((JsonElement)jsonObject, class03702.class);
        }
        jsonObject = null;
        if (jsonObject2.has("gui_light")) {
            jsonObject = class00140.N((String)class05001.Z((JsonObject)jsonObject2, (String)"gui_light"));
        }
        class01894 class018942 = string.isEmpty() ? null : class01894.N((String)string);
        return new class04237(class085342, (class00140)jsonObject, bl, class037022, class088142, class018942);
    }

    protected @Nullable class08534 N(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        if (jsonObject.has("elements")) {
            ArrayList<class02081> arrayList = new ArrayList<class02081>();
            for (JsonElement jsonElement : class05001.t((JsonObject)jsonObject, (String)"elements")) {
                arrayList.add((class02081)jsonDeserializationContext.deserialize(jsonElement, class02081.class));
            }
            return new class08505(arrayList);
        }
        return null;
    }

    protected @Nullable Boolean N(JsonObject jsonObject) {
        if (jsonObject.has("ambientocclusion")) {
            return class05001.U((JsonObject)jsonObject, (String)"ambientocclusion");
        }
        return null;
    }
}

