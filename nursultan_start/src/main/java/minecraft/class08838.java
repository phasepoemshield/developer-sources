/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  minecraft.class00183
 *  minecraft.class01894
 *  minecraft.class05913
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Map;
import minecraft.class00183;
import minecraft.class01894;
import minecraft.class05913;
import minecraft.class08814;
import minecraft.class08823;
import org.jspecify.annotations.Nullable;

public class class08838 {
    public static final class08838 N = new class08838(Map.of());
    private static final char y = '#';
    private final Map<String, class05913> L;

    class08838(Map<String, class05913> map) {
        this.L = map;
    }

    private static boolean y(String string) {
        return string.charAt(0) == '#';
    }

    public static class08814 N(JsonObject jsonObject) {
        class08823 class088232 = new class08823();
        for (Map.Entry entry : jsonObject.entrySet()) {
            class08838.N((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString(), class088232);
        }
        return class088232.N();
    }

    private static void N(String string, String string2, class08823 class088232) {
        if (class08838.y(string2)) {
            class088232.N(string, string2.substring(1));
        } else {
            class01894 class018942 = class01894.L((String)string2);
            if (class018942 == null) {
                throw new JsonParseException(string2 + " is not valid resource location");
            }
            class088232.N(string, new class05913(class00183.N, class018942));
        }
    }

    public @Nullable class05913 N(String string) {
        if (class08838.y(string)) {
            string = string.substring(1);
        }
        return this.L.get(string);
    }
}

