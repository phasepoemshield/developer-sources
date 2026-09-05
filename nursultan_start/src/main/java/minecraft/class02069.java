/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  minecraft.class04108
 *  minecraft.class04120
 *  minecraft.class04122
 *  minecraft.class04136
 *  minecraft.class05001
 *  minecraft.class07185
 *  minecraft.class07211
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import minecraft.class02067;
import minecraft.class02081;
import minecraft.class04108;
import minecraft.class04120;
import minecraft.class04122;
import minecraft.class04136;
import minecraft.class05001;
import minecraft.class07185;
import minecraft.class07211;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class02069
implements JsonDeserializer<class02081> {
    private static final boolean N = true;
    private static final int y = 0;
    private static final String L = "shade";
    private static final String u = "light_emission";
    private static final String i = "rotation";
    private static final String R = "origin";
    private static final String M = "angle";
    private static final String B = "x";
    private static final String Z = "y";
    private static final String z = "z";
    private static final String U = "axis";
    private static final String E = "rescale";
    private static final String W = "faces";
    private static final String m = "to";
    private static final String P = "from";

    private static Vector3f y(JsonObject jsonObject, String string) {
        JsonArray jsonArray = class05001.t((JsonObject)jsonObject, (String)string);
        if (jsonArray.size() != 3) {
            throw new JsonParseException("Expected 3 " + string + " values, found: " + jsonArray.size());
        }
        float[] fArray = new float[3];
        for (int i = 0; i < fArray.length; ++i) {
            fArray[i] = class05001.i((JsonElement)jsonArray.get(i), (String)(string + "[" + i + "]"));
        }
        return new Vector3f(fArray[0], fArray[1], fArray[2]);
    }

    private class07185 y(JsonObject jsonObject) {
        String string = class05001.Z((JsonObject)jsonObject, (String)U);
        class07185 class071852 = class07185.N((String)string.toLowerCase(Locale.ROOT));
        if (class071852 == null) {
            throw new JsonParseException("Invalid rotation axis: " + string);
        }
        return class071852;
    }

    private Map<class07211, class02067> y(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        EnumMap enumMap = Maps.newEnumMap(class07211.class);
        for (Map.Entry entry : class05001.n((JsonObject)jsonObject, (String)W).entrySet()) {
            class07211 class072112 = this.N((String)entry.getKey());
            enumMap.put(class072112, (class02067)((Object)jsonDeserializationContext.deserialize((JsonElement)entry.getValue(), class02067.class)));
        }
        return enumMap;
    }

    private static Vector3f N(JsonObject jsonObject, String string) {
        Vector3f vector3f = class02069.y(jsonObject, string);
        if (vector3f.x() < -16.0f || vector3f.y() < -16.0f || vector3f.z() < -16.0f || vector3f.x() > 32.0f || vector3f.y() > 32.0f || vector3f.z() > 32.0f) {
            throw new JsonParseException("'" + string + "' specifier exceeds the allowed boundaries: " + String.valueOf(vector3f));
        }
        return vector3f;
    }

    private @Nullable class04120 N(JsonObject jsonObject) {
        if (jsonObject.has(i)) {
            class04136 class041362;
            JsonObject jsonObject2 = class05001.n((JsonObject)jsonObject, (String)i);
            Vector3f vector3f = class02069.y(jsonObject2, R);
            vector3f.mul(0.0625f);
            if (jsonObject2.has(U) || jsonObject2.has(M)) {
                class07185 class071852 = this.y(jsonObject2);
                float f = class05001.W((JsonObject)jsonObject2, (String)M);
                class041362 = new class04136(class071852, f);
            } else if (jsonObject2.has(B) || jsonObject2.has(Z) || jsonObject2.has(z)) {
                float f = class05001.N((JsonObject)jsonObject2, (String)B, (float)0.0f);
                float f2 = class05001.N((JsonObject)jsonObject2, (String)Z, (float)0.0f);
                float f3 = class05001.N((JsonObject)jsonObject2, (String)z, (float)0.0f);
                class041362 = new class04108(f, f2, f3);
            } else {
                throw new JsonParseException("Missing rotation value, expected either 'axis' and 'angle' or 'x', 'y' and 'z'");
            }
            boolean bl = class05001.N((JsonObject)jsonObject2, (String)E, (boolean)false);
            return new class04120((Vector3fc)vector3f, (class04122)class041362, bl);
        }
        return null;
    }

    private class07211 N(String string) {
        class07211 class072112 = class07211.N((String)string);
        if (class072112 == null) {
            throw new JsonParseException("Unknown facing: " + string);
        }
        return class072112;
    }

    public class02081 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Vector3f vector3f = class02069.N(jsonObject, P);
        Vector3f vector3f2 = class02069.N(jsonObject, m);
        class04120 class041202 = this.N(jsonObject);
        Map<class07211, class02067> var8 = this.N(jsonDeserializationContext, jsonObject);
        if (jsonObject.has(L) && !class05001.L((JsonObject)jsonObject, (String)L)) {
            throw new JsonParseException("Expected 'shade' to be a Boolean");
        }
        boolean bl = class05001.N((JsonObject)jsonObject, (String)L, (boolean)true);
        int n = 0;
        if (jsonObject.has(u)) {
            boolean bl2 = class05001.y((JsonObject)jsonObject, (String)u);
            if (bl2) {
                n = class05001.P((JsonObject)jsonObject, (String)u);
            }
            if (!bl2 || n < 0 || n > 15) {
                throw new JsonParseException("Expected 'light_emission' to be an Integer between (inclusive) 0 and 15");
            }
        }
        return new class02081((Vector3fc)vector3f, (Vector3fc)vector3f2, var8, class041202, bl, n);
    }

    private Map<class07211, class02067> N(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        Map<class07211, class02067> var3 = this.y(jsonDeserializationContext, jsonObject);
        if (var3.isEmpty()) {
            throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
        }
        return var3;
    }
}

