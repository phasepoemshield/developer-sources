/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class04206
 */
package baritone.api.utils;

import java.util.HashMap;
import java.util.Map;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;

public class BlockUtils {
    private static transient Map<String, class00891> resourceCache = new HashMap<String, class00891>();

    private BlockUtils() {
    }

    public static String blockToString(class00891 class008912) {
        class01894 class018942 = class04206.i.y((Object)class008912);
        String string = class018942.N();
        if (!class018942.y().equals("minecraft")) {
            string = class018942.toString();
        }
        return string;
    }

    public static class00891 stringToBlockNullable(String string) {
        class00891 class008912 = resourceCache.get(string);
        if (class008912 != null) {
            return class008912;
        }
        if (resourceCache.containsKey(string)) {
            return null;
        }
        class008912 = class04206.i.y(class01894.L((String)(string.contains(":") ? string : "minecraft:" + string))).orElse(null);
        HashMap<String, class00891> hashMap = new HashMap<String, class00891>(resourceCache);
        hashMap.put(string, class008912);
        resourceCache = hashMap;
        return class008912;
    }

    public static class00891 stringToBlockRequired(String string) {
        class00891 class008912 = BlockUtils.stringToBlockNullable(string);
        if (class008912 == null) {
            throw new IllegalArgumentException(String.format("Invalid block name %s", string));
        }
        return class008912;
    }
}

