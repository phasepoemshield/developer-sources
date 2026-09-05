/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.SemanticVersion
 *  net.fabricmc.loader.api.Version
 *  net.fabricmc.loader.api.VersionParsingException
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.terraformersmc.modmenu.util.mod.fabric;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.terraformersmc.modmenu.api.UpdateChannel;
import com.terraformersmc.modmenu.api.UpdateChecker;
import com.terraformersmc.modmenu.api.UpdateInfo;
import com.terraformersmc.modmenu.util.HttpUtil;
import com.terraformersmc.modmenu.util.JsonUtil;
import com.terraformersmc.modmenu.util.OptionalUtil;
import com.terraformersmc.modmenu.util.mod.fabric.FabricLoaderUpdateChecker$FabricLoaderUpdateInfo;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Iterator;
import java.util.Optional;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.SemanticVersion;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.VersionParsingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricLoaderUpdateChecker
implements UpdateChecker {
    public static Logger LOGGER = LoggerFactory.getLogger((String)"Mod Menu/Fabric Update Checker");
    private static final URI LOADER_VERSIONS = URI.create("https://meta.fabricmc.net/v2/versions/loader");

    @Override
    public UpdateInfo checkForUpdates() {
        UpdateInfo updateInfo = null;
        try {
            updateInfo = FabricLoaderUpdateChecker.checkForUpdates0();
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
        catch (IOException iOException) {
            LOGGER.error("Failed Fabric Loader update check!", (Throwable)iOException);
        }
        return updateInfo;
    }

    private static UpdateInfo checkForUpdates0() throws IOException, InterruptedException {
        UpdateChannel updateChannel = UpdateChannel.getUserPreference();
        HttpRequest.Builder builder = HttpRequest.newBuilder().GET().uri(LOADER_VERSIONS);
        HttpResponse<String> httpResponse = HttpUtil.request(builder, HttpResponse.BodyHandlers.ofString());
        int n = httpResponse.statusCode();
        if (n != 200) {
            LOGGER.warn("Fabric Meta responded with a non-200 status: {}!", (Object)n);
            return null;
        }
        Optional<String> optional = httpResponse.headers().firstValue("Content-Type");
        if (optional.isEmpty() || !optional.get().contains("application/json")) {
            LOGGER.warn("Fabric Meta responded with a non-json content type, aborting loader update check!");
            return null;
        }
        JsonElement jsonElement = JsonParser.parseString((String)httpResponse.body());
        if (!jsonElement.isJsonArray()) {
            LOGGER.warn("Received invalid data from Fabric Meta, aborting loader update check!");
            return null;
        }
        SemanticVersion semanticVersion = null;
        boolean bl = true;
        for (JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
            SemanticVersion semanticVersion2;
            JsonObject jsonObject;
            Optional<String> optional2;
            if (!jsonElement2.isJsonObject() || (optional2 = JsonUtil.getString(jsonObject = jsonElement2.getAsJsonObject(), "version")).isEmpty()) continue;
            try {
                semanticVersion2 = SemanticVersion.parse((String)optional2.get());
            }
            catch (VersionParsingException versionParsingException) {
                continue;
            }
            boolean bl2 = OptionalUtil.isPresentAndTrue(JsonUtil.getBoolean(jsonObject, "stable"));
            if (updateChannel == UpdateChannel.RELEASE && !bl2 || semanticVersion != null && !FabricLoaderUpdateChecker.isNewer((Version)semanticVersion2, (Version)semanticVersion)) continue;
            semanticVersion = semanticVersion2;
            bl = bl2;
        }
        Iterator iterator = FabricLoaderUpdateChecker.getCurrentVersion();
        if (semanticVersion == null || !FabricLoaderUpdateChecker.isNewer(semanticVersion, (Version)iterator)) {
            LOGGER.debug("Fabric Loader is up to date.");
            return null;
        }
        LOGGER.debug("Fabric Loader has a matching update available!");
        return new FabricLoaderUpdateChecker$FabricLoaderUpdateInfo(semanticVersion.getFriendlyString(), bl);
    }

    private static Version getCurrentVersion() {
        return ((ModContainer)FabricLoader.getInstance().getModContainer("fabricloader").get()).getMetadata().getVersion();
    }

    private static boolean isNewer(Version version, Version version2) {
        return version.compareTo((Object)version2) > 0;
    }
}

