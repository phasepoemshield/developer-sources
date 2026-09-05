/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  minecraft.class00392
 *  minecraft.class04719
 *  minecraft.class08392
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class04719;
import minecraft.class08392;
import org.jspecify.annotations.Nullable;

public class class03596 {
    private static final String N = "translationKey";
    private static final String y = "args";
    private final String L;
    private final String @Nullable [] u;

    private class03596(String string, String @Nullable [] stringArray) {
        this.L = string;
        this.u = stringArray;
    }

    public String toString() {
        return this.L;
    }

    public class00392 N(class00392 class003922) {
        return Objects.requireNonNullElse(this.N(), class003922);
    }

    public static class03596 N(JsonObject jsonObject) {
        String[] stringArray;
        String string = class04719.N((String)N, (JsonObject)jsonObject);
        JsonElement jsonElement = jsonObject.get(y);
        if (jsonElement == null || jsonElement.isJsonNull()) {
            stringArray = null;
        } else {
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            stringArray = new String[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); ++i) {
                stringArray[i] = jsonArray.get(i).getAsString();
            }
        }
        return new class03596(string, stringArray);
    }

    public @Nullable class00392 N() {
        if (!class08392.N((String)this.L)) {
            return null;
        }
        if (this.u == null) {
            return class00392.L((String)this.L);
        }
        return class00392.N((String)this.L, (Object[])this.u);
    }
}

