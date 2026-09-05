/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class04719
 *  minecraft.class08314
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class03580;
import minecraft.class03605;
import minecraft.class04719;
import minecraft.class08314;
import org.slf4j.Logger;

public class class03576 {
    static final Logger N = LogUtils.getLogger();
    private static final String M = "notificationUuid";
    private static final String B = "dismissable";
    private static final String Z = "seen";
    private static final String z = "type";
    private static final String U = "visitUrl";
    private static final String E = "infoPopup";
    static final class00392 y = class00392.L((String)"mco.notification.visitUrl.buttonText.default");
    final UUID L;
    final boolean u;
    final boolean i;
    final String R;

    public UUID L() {
        return this.L;
    }

    class03576(UUID uUID, boolean bl, boolean bl2, String string) {
        this.L = uUID;
        this.u = bl;
        this.i = bl2;
        this.R = string;
    }

    public boolean y() {
        return this.u;
    }

    public boolean N() {
        return this.i;
    }

    private static class03576 N(JsonObject jsonObject) {
        UUID uUID = class04719.N((String)M, (JsonObject)jsonObject, null);
        if (uUID == null) {
            throw new IllegalStateException("Missing required property notificationUuid");
        }
        boolean bl = class04719.N((String)B, (JsonObject)jsonObject, (boolean)true);
        boolean bl2 = class04719.N((String)Z, (JsonObject)jsonObject, (boolean)false);
        String string = class04719.N((String)z, (JsonObject)jsonObject);
        class03576 class035762 = new class03576(uUID, bl, bl2, string);
        return switch (string) {
            case U -> class03605.N(class035762, jsonObject);
            case E -> class03580.N(class035762, jsonObject);
            default -> class035762;
        };
    }

    public static List<class03576> N(String string) {
        ArrayList<class03576> arrayList = new ArrayList<class03576>();
        try {
            JsonArray jsonArray = class08314.N((String)string).getAsJsonObject().get("notifications").getAsJsonArray();
            for (JsonElement jsonElement : jsonArray) {
                arrayList.add(class03576.N(jsonElement.getAsJsonObject()));
            }
        }
        catch (Exception exception) {
            N.error("Could not parse list of RealmsNotifications", (Throwable)exception);
        }
        return arrayList;
    }
}

