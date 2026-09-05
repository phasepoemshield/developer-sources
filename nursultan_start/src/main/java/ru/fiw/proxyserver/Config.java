/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.google.gson.reflect.TypeToken
 *  minecraft.class06202
 *  org.apache.commons.io.FileUtils
 */
package ru.fiw.proxyserver;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import minecraft.class06202;
import org.apache.commons.io.FileUtils;
import ru.fiw.proxyserver.Proxy;
import ru.fiw.proxyserver.ProxyServer;

public class Config {
    private static final String CONFIG_PATH = class06202.Nq().l_1 + "/config/ProxyServerConfig.json";
    public static HashMap<String, Proxy> accounts = new HashMap();
    public static String lastPlayerName = "";

    public static void loadConfig() {
        File file = new File(CONFIG_PATH);
        try {
            if (!file.exists()) {
                Config.saveConfig();
                return;
            }
            String string = FileUtils.readFileToString((File)file, (Charset)StandardCharsets.UTF_8);
            if (!string.isEmpty()) {
                JsonObject jsonObject = JsonParser.parseString((String)string).getAsJsonObject();
                if (jsonObject.has("lastPlayerName")) {
                    lastPlayerName = jsonObject.get("lastPlayerName").getAsString();
                }
                if (jsonObject.has("proxy-enabled")) {
                    ProxyServer.proxyEnabled = jsonObject.get("proxy-enabled").getAsBoolean();
                }
                if (jsonObject.has("proxy")) {
                    ProxyServer.proxy = (Proxy)new Gson().fromJson(jsonObject.get("proxy"), Proxy.class);
                }
                Type type = new TypeToken<HashMap<String, Proxy>>(){}.getType();
                if (jsonObject.has("accounts")) {
                    accounts = (HashMap)new Gson().fromJson(jsonObject.get("accounts"), type);
                }
                if (accounts == null) {
                    accounts = new HashMap();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void saveConfig() {
        try {
            JsonObject jsonObject = new JsonObject();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            jsonObject.addProperty("lastPlayerName", lastPlayerName);
            jsonObject.addProperty("proxy-enabled", Boolean.valueOf(ProxyServer.proxyEnabled));
            jsonObject.add("proxy", gson.toJsonTree((Object)ProxyServer.proxy));
            jsonObject.add("accounts", gson.toJsonTree(accounts));
            FileUtils.write((File)new File(CONFIG_PATH), (CharSequence)gson.toJson((JsonElement)jsonObject), (Charset)StandardCharsets.UTF_8);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

