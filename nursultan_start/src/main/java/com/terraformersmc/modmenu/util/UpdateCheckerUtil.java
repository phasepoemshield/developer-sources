/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  minecraft.class00392
 *  minecraft.class04680
 *  minecraft.class06095
 *  minecraft.class06132
 *  minecraft.class06202
 *  minecraft.class07529
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.terraformersmc.modmenu.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.api.UpdateChannel;
import com.terraformersmc.modmenu.api.UpdateChecker;
import com.terraformersmc.modmenu.api.UpdateInfo;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.util.HttpUtil;
import com.terraformersmc.modmenu.util.UpdateCheckerUtil$CurrentVersionsFromHashes;
import com.terraformersmc.modmenu.util.UpdateCheckerUtil$LatestVersionsFromHashesBody;
import com.terraformersmc.modmenu.util.UpdateCheckerUtil$VersionUpdate;
import com.terraformersmc.modmenu.util.mod.Mod;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import minecraft.class00392;
import minecraft.class04680;
import minecraft.class06095;
import minecraft.class06132;
import minecraft.class06202;
import minecraft.class07529;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateCheckerUtil {
    public static Logger LOGGER = LoggerFactory.getLogger((String)"Mod Menu/Update Checker");
    private static boolean modrinthApiV2Deprecated = false;

    public static void checkForUpdates() {
    }

    private static UpdateChannel getUpdateChannel(String string) {
        try {
            return UpdateChannel.valueOf(string.toUpperCase(Locale.ROOT));
        }
        catch (IllegalArgumentException | NullPointerException runtimeException) {
            return UpdateChannel.RELEASE;
        }
    }

    private static boolean allowsUpdateChecks(Mod mod) {
        return mod.allowsUpdateChecks();
    }

    private static Map<String, Instant> getCurrentVersions(Collection<String> collection) {
        String string2 = ModMenu.GSON_MINIFIED.toJson((Object)new UpdateCheckerUtil$CurrentVersionsFromHashes(collection));
        HttpRequest.Builder builder = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(string2)).header("Content-Type", "application/json").uri(URI.create("https://api.modrinth.com/v2/version_files"));
        try {
            HttpResponse<String> httpResponse = HttpUtil.request(builder, HttpResponse.BodyHandlers.ofString());
            if (httpResponse.statusCode() == 410) {
                modrinthApiV2Deprecated = true;
                LOGGER.warn("Modrinth API v2 is deprecated, unable to check for mod updates.");
            } else if (httpResponse.statusCode() == 200) {
                HashMap<String, Instant> hashMap = new HashMap<String, Instant>();
                JsonObject jsonObject = JsonParser.parseString((String)httpResponse.body()).getAsJsonObject();
                jsonObject.asMap().forEach((string, jsonElement) -> {
                    Instant instant;
                    JsonObject jsonObject = jsonElement.getAsJsonObject();
                    try {
                        instant = Instant.parse(jsonObject.get("date_published").getAsString());
                    }
                    catch (DateTimeParseException dateTimeParseException) {
                        return;
                    }
                    hashMap.put((String)string, instant);
                });
                return hashMap;
            }
        }
        catch (IOException | InterruptedException exception) {
            LOGGER.error("Error checking for versions: ", (Throwable)exception);
        }
        return null;
    }

    private static Map<String, UpdateCheckerUtil$VersionUpdate> getUpdatedVersions(Collection<String> collection) {
        String string2 = class07529.y().comp_4025();
        List<String> list = ModMenu.RUNNING_QUILT ? List.of("fabric", "quilt") : List.of("fabric");
        UpdateChannel updateChannel = UpdateChannel.getUserPreference();
        List<UpdateChannel> list2 = updateChannel == UpdateChannel.RELEASE ? List.of(UpdateChannel.RELEASE) : (updateChannel == UpdateChannel.BETA ? List.of(UpdateChannel.BETA, UpdateChannel.RELEASE) : List.of(UpdateChannel.ALPHA, UpdateChannel.BETA, UpdateChannel.RELEASE));
        String string3 = ModMenu.GSON_MINIFIED.toJson((Object)new UpdateCheckerUtil$LatestVersionsFromHashesBody(collection, list, string2, list2));
        LOGGER.debug("Body: {}", (Object)string3);
        HttpRequest.Builder builder = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(string3)).header("Content-Type", "application/json").uri(URI.create("https://api.modrinth.com/v2/version_files/update"));
        try {
            HttpResponse<String> httpResponse = HttpUtil.request(builder, HttpResponse.BodyHandlers.ofString());
            int n = httpResponse.statusCode();
            LOGGER.debug("Status: {}", (Object)n);
            if (n == 410) {
                modrinthApiV2Deprecated = true;
                LOGGER.warn("Modrinth API v2 is deprecated, unable to check for mod updates.");
            } else if (n == 200) {
                HashMap<String, UpdateCheckerUtil$VersionUpdate> hashMap = new HashMap<String, UpdateCheckerUtil$VersionUpdate>();
                JsonObject jsonObject = JsonParser.parseString((String)httpResponse.body()).getAsJsonObject();
                LOGGER.debug(String.valueOf(jsonObject));
                jsonObject.asMap().forEach((string, jsonElement2) -> {
                    Instant instant;
                    JsonObject jsonObject = jsonElement2.getAsJsonObject();
                    String string2 = jsonObject.get("project_id").getAsString();
                    String string3 = jsonObject.get("version_type").getAsString();
                    String string4 = jsonObject.get("version_number").getAsString();
                    String string5 = jsonObject.get("id").getAsString();
                    Optional<JsonElement> optional = jsonObject.get("files").getAsJsonArray().asList().stream().filter(jsonElement -> jsonElement.getAsJsonObject().get("primary").getAsBoolean()).findFirst();
                    if (optional.isEmpty()) {
                        return;
                    }
                    try {
                        instant = Instant.parse(jsonObject.get("date_published").getAsString());
                    }
                    catch (DateTimeParseException dateTimeParseException) {
                        return;
                    }
                    UpdateChannel updateChannel = UpdateCheckerUtil.getUpdateChannel(string3);
                    String string6 = optional.get().getAsJsonObject().get("hashes").getAsJsonObject().get("sha512").getAsString();
                    hashMap.put((String)string, new UpdateCheckerUtil$VersionUpdate(string2, string5, string4, instant, updateChannel, string6));
                });
                return hashMap;
            }
        }
        catch (IOException | InterruptedException exception) {
            LOGGER.error("Error checking for updates: ", (Throwable)exception);
        }
        return null;
    }

    private static /* synthetic */ void lambda$checkForUpdates0$0(Mod mod, UpdateChecker updateChecker) {
        Thread.currentThread().setName("ModMenu/Update Checker/%s".formatted(new Object[]{mod.getName()}));
        UpdateInfo updateInfo = updateChecker.checkForUpdates();
        mod.setUpdateInfo(updateInfo);
        if (updateInfo != null && updateInfo.isUpdateAvailable()) {
            LOGGER.info("Update available for '{}@{}'", (Object)mod.getId(), (Object)mod.getVersion());
        }
    }

    private static /* synthetic */ Map lambda$checkForUpdates0$1(Map map) throws Exception {
        return UpdateCheckerUtil.getCurrentVersions(map.keySet());
    }

    public static void triggerV2DeprecatedToast() {
        if (modrinthApiV2Deprecated && ModMenuConfig.UPDATE_CHECKER.getValue()) {
            class06202.Nq().m().N((class04680)new class06132(class06095.M, (class00392)class00392.L((String)"modmenu.modrinth.v2_deprecated.title"), (class00392)class00392.L((String)"modmenu.modrinth.v2_deprecated.description")));
        }
    }

    private static /* synthetic */ Map lambda$checkForUpdates0$2(Map map) throws Exception {
        return UpdateCheckerUtil.getUpdatedVersions(map.keySet());
    }

    private static void checkForUpdates0() {
    }

    private static Map<String, Set<Mod>> getModHashes(Collection<Mod> collection) {
        HashMap<String, Set<Mod>> hashMap = new HashMap<String, Set<Mod>>();
        for (Mod mod : collection) {
            String string = mod.getId();
            try {
                String string2 = mod.getSha512Hash();
                if (string2 == null) continue;
                LOGGER.debug("Hash for {} is {}", (Object)string, (Object)string2);
                hashMap.putIfAbsent(string2, new HashSet());
                ((Set)hashMap.get(string2)).add(mod);
            }
            catch (IOException iOException) {
                LOGGER.error("Error getting mod hash for mod {}: ", (Object)string, (Object)iOException);
            }
        }
        return hashMap;
    }
}

