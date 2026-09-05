/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class05001
 *  minecraft.class08314
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import minecraft.class00392;
import minecraft.class05001;
import minecraft.class05124;
import minecraft.class05128;
import minecraft.class05136;
import minecraft.class08314;
import org.slf4j.Logger;

public interface class05108 {
    public static final class00392 N = class00392.L((String)"mco.errorMessage.noDetails");
    public static final Logger y = LogUtils.getLogger();

    public String L();

    public class00392 y();

    public static class05108 N(int n, String string) {
        if (n == 429) {
            return class05124.L;
        }
        if (Strings.isNullOrEmpty((String)string)) {
            return class05124.y(n);
        }
        try {
            JsonObject jsonObject = class08314.N((String)string).getAsJsonObject();
            String string2 = class05001.N((JsonObject)jsonObject, (String)"reason", null);
            String string3 = class05001.N((JsonObject)jsonObject, (String)"errorMsg", null);
            int n2 = class05001.N((JsonObject)jsonObject, (String)"errorCode", (int)-1);
            if (string3 != null || string2 != null || n2 != -1) {
                return new class05136(n, n2 != -1 ? n2 : n, string2, string3);
            }
        }
        catch (Exception exception) {
            y.error("Could not parse RealmsError", (Throwable)exception);
        }
        return new class05128(n, string);
    }

    public int N();
}

