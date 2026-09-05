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
 *  minecraft.class04995
 *  minecraft.class05001
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import minecraft.class03265;
import minecraft.class04995;
import minecraft.class05001;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class class03273
implements JsonDeserializer<class03265> {
    private static final Vector3f L = new Vector3f(0.0f, 0.0f, 0.0f);
    private static final Vector3f u = new Vector3f(0.0f, 0.0f, 0.0f);
    private static final Vector3f i = new Vector3f(1.0f, 1.0f, 1.0f);
    public static final float N = 5.0f;
    public static final float y = 4.0f;

    public class03265 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Vector3f vector3f = this.N(jsonObject, "rotation", L);
        Vector3f vector3f2 = this.N(jsonObject, "translation", u);
        vector3f2.mul(0.0625f);
        vector3f2.set(class04995.N((float)vector3f2.x, (float)-5.0f, (float)5.0f), class04995.N((float)vector3f2.y, (float)-5.0f, (float)5.0f), class04995.N((float)vector3f2.z, (float)-5.0f, (float)5.0f));
        Vector3f vector3f3 = this.N(jsonObject, "scale", i);
        vector3f3.set(class04995.N((float)vector3f3.x, (float)-4.0f, (float)4.0f), class04995.N((float)vector3f3.y, (float)-4.0f, (float)4.0f), class04995.N((float)vector3f3.z, (float)-4.0f, (float)4.0f));
        return new class03265((Vector3fc)vector3f, (Vector3fc)vector3f2, (Vector3fc)vector3f3);
    }

    private Vector3f N(JsonObject jsonObject, String string, Vector3f vector3f) {
        if (!jsonObject.has(string)) {
            return vector3f;
        }
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
}

