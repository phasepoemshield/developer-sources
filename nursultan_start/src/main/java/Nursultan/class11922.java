/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11930
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  minecraft.class04585
 */
package Nursultan;

import Nursultan.class11930;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import minecraft.class04585;

public class class11922 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;

    private static void L() {
        N_0 = null;
        N_1 = null;
        N_2 = null;
        N_3 = "ip";
        N_4 = "expired";
        N_5 = "-1";
    }

    private class11922() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11922.L();
        N_0 = new ArrayList();
        N_1 = new Gson();
        N_2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    }

    private static String y(JsonObject jsonObject) {
        if (!jsonObject.has("ip") || jsonObject.get("ip").isJsonNull()) {
            return null;
        }
        return jsonObject.get("ip").getAsString();
    }

    private static LocalDate N(JsonObject jsonObject) {
        if (!jsonObject.has("expired") || jsonObject.get("expired").isJsonNull()) {
            return null;
        }
        String string = jsonObject.get("expired").getAsString();
        if ("-1".equals(string)) {
            return null;
        }
        return LocalDate.parse(string, (DateTimeFormatter)N_2);
    }

    private static boolean N(LocalDate localDate) {
        return localDate == null || LocalDate.now().isBefore(localDate);
    }

    private static void N(String string, String string2) {
        class11930 class119302 = new class11930(string, string2, class04585.field_45611);
        ((List)N_0).remove(class119302);
        ((List)N_0).add(class119302);
    }

    public static void N(String string) {
        for (Map.Entry entry : ((JsonObject)((Gson)N_1).fromJson(string, JsonObject.class)).entrySet()) {
            String string2 = (String)entry.getKey();
            JsonObject jsonObject = ((JsonElement)entry.getValue()).getAsJsonObject();
            String string3 = class11922.y(jsonObject);
            if (string3 == null || string3.isEmpty() || !class11922.N(class11922.N(jsonObject))) continue;
            class11922.N(string2, string3);
        }
    }
}

