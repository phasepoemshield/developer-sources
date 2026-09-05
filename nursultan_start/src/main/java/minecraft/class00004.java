/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  minecraft.class01894
 *  minecraft.class03621
 *  minecraft.class05001
 *  minecraft.class06042
 *  minecraft.class06052
 *  org.apache.commons.lang3.Validate
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class00002;
import minecraft.class00012;
import minecraft.class00022;
import minecraft.class01894;
import minecraft.class03621;
import minecraft.class05001;
import minecraft.class06042;
import minecraft.class06052;
import org.apache.commons.lang3.Validate;

public class class00004
implements JsonDeserializer<class00012> {
    private static final class06052 N = class06042.N((float)1.0f);

    private class00002 y(JsonObject jsonObject) {
        class01894 class018942 = class01894.N((String)class05001.Z((JsonObject)jsonObject, (String)"name"));
        class00022 class000222 = this.N(jsonObject, class00022.field_5474);
        float f = class05001.N((JsonObject)jsonObject, (String)"volume", (float)1.0f);
        Validate.isTrue((f > 0.0f ? 1 : 0) != 0, (String)"Invalid volume", (Object[])new Object[0]);
        float f2 = class05001.N((JsonObject)jsonObject, (String)"pitch", (float)1.0f);
        Validate.isTrue((f2 > 0.0f ? 1 : 0) != 0, (String)"Invalid pitch", (Object[])new Object[0]);
        int n = class05001.N((JsonObject)jsonObject, (String)"weight", (int)1);
        Validate.isTrue((n > 0 ? 1 : 0) != 0, (String)"Invalid weight", (Object[])new Object[0]);
        boolean bl = class05001.N((JsonObject)jsonObject, (String)"preload", (boolean)false);
        boolean bl2 = class05001.N((JsonObject)jsonObject, (String)"stream", (boolean)false);
        int n2 = class05001.N((JsonObject)jsonObject, (String)"attenuation_distance", (int)16);
        return new class00002(class018942, (class03621)class06042.N((float)f), (class03621)class06042.N((float)f2), n, class000222, bl2, bl, n2);
    }

    private List<class00002> N(JsonObject jsonObject) {
        ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("sounds")) {
            JsonArray jsonArray = class05001.t((JsonObject)jsonObject, (String)"sounds");
            for (int i = 0; i < jsonArray.size(); ++i) {
                JsonElement jsonElement = jsonArray.get(i);
                if (class05001.N((JsonElement)jsonElement)) {
                    class01894 class018942 = class01894.N((String)class05001.N((JsonElement)jsonElement, (String)"sound"));
                    arrayList.add(new class00002(class018942, (class03621)N, (class03621)N, 1, class00022.field_5474, false, false, 16));
                    continue;
                }
                arrayList.add(this.y(class05001.W((JsonElement)jsonElement, (String)"sound")));
            }
        }
        return arrayList;
    }

    public class00012 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = class05001.W((JsonElement)jsonElement, (String)"entry");
        boolean bl = class05001.N((JsonObject)jsonObject, (String)"replace", (boolean)false);
        String string = class05001.N((JsonObject)jsonObject, (String)"subtitle", null);
        List<class00002> var7 = this.N(jsonObject);
        return new class00012(var7, bl, string);
    }

    private class00022 N(JsonObject jsonObject, class00022 class000222) {
        class00022 class000223 = class000222;
        if (jsonObject.has("type")) {
            class000223 = class00022.N(class05001.Z((JsonObject)jsonObject, (String)"type"));
            Objects.requireNonNull(class000223, "Invalid type");
        }
        return class000223;
    }
}

