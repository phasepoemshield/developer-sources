/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.quiltmc.loader.api.ModContainer
 *  org.quiltmc.loader.api.QuiltLoader
 *  org.quiltmc.loader.api.Version$Semantic
 *  org.quiltmc.loader.api.VersionFormatException
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.terraformersmc.modmenu.util.mod.quilt;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.terraformersmc.modmenu.api.UpdateChannel;
import com.terraformersmc.modmenu.api.UpdateChecker;
import com.terraformersmc.modmenu.api.UpdateInfo;
import com.terraformersmc.modmenu.util.HttpUtil;
import com.terraformersmc.modmenu.util.JsonUtil;
import com.terraformersmc.modmenu.util.mod.quilt.QuiltLoaderUpdateChecker$QuiltLoaderUpdateInfo;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Iterator;
import java.util.Optional;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.QuiltLoader;
import org.quiltmc.loader.api.Version;
import org.quiltmc.loader.api.VersionFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuiltLoaderUpdateChecker
implements UpdateChecker {
    public static final Logger LOGGER = LoggerFactory.getLogger((String)"Mod Menu/Quilt Update Checker");
    private static final URI LOADER_VERSIONS = URI.create("https://meta.quiltmc.org/v3/versions/loader");

    @Override
    public UpdateInfo checkForUpdates() {
        UpdateInfo updateInfo = null;
        try {
            updateInfo = QuiltLoaderUpdateChecker.checkForUpdates0();
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
        catch (IOException iOException) {
            LOGGER.error("Failed Quilt Loader update check!", (Throwable)iOException);
        }
        return updateInfo;
    }

    static boolean isStableOrBeta(String string) {
        return string.isEmpty() || string.startsWith("beta") || string.startsWith("pre") || string.startsWith("rc");
    }

    private static UpdateInfo checkForUpdates0() throws IOException, InterruptedException {
        UpdateChannel updateChannel = UpdateChannel.getUserPreference();
        HttpRequest.Builder builder = HttpRequest.newBuilder().GET().uri(LOADER_VERSIONS);
        HttpResponse<String> httpResponse = HttpUtil.request(builder, HttpResponse.BodyHandlers.ofString());
        int n = httpResponse.statusCode();
        if (n != 200) {
            LOGGER.warn("Quilt Meta responded with a non-200 status: {}!", (Object)n);
            return null;
        }
        Optional<String> optional = httpResponse.headers().firstValue("Content-Type");
        if (optional.isEmpty() || !optional.get().contains("application/json")) {
            LOGGER.warn("Quilt Meta responded with a non-json content type, aborting loader update check!");
            return null;
        }
        JsonElement jsonElement = JsonParser.parseString((String)httpResponse.body());
        if (!jsonElement.isJsonArray()) {
            LOGGER.warn("Received invalid data from Quilt Meta, aborting loader update check!");
            return null;
        }
        Version.Semantic semantic = null;
        for (JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
            Version.Semantic semantic2;
            JsonObject jsonObject;
            Optional<String> optional2;
            if (!jsonElement2.isJsonObject() || (optional2 = JsonUtil.getString(jsonObject = jsonElement2.getAsJsonObject(), "version")).isEmpty()) continue;
            try {
                semantic2 = Version.Semantic.of((String)optional2.get());
            }
            catch (VersionFormatException versionFormatException) {
                continue;
            }
            if (updateChannel == UpdateChannel.RELEASE && !semantic2.preRelease().isEmpty() || updateChannel == UpdateChannel.BETA && !QuiltLoaderUpdateChecker.isStableOrBeta(semantic2.preRelease()) || semantic != null && !QuiltLoaderUpdateChecker.isNewer(semantic2, semantic)) continue;
            semantic = semantic2;
        }
        Iterator iterator = QuiltLoaderUpdateChecker.getCurrentVersion();
        if (semantic == null || !QuiltLoaderUpdateChecker.isNewer(semantic, (Version.Semantic)iterator)) {
            LOGGER.debug("Quilt Loader is up to date.");
            return null;
        }
        LOGGER.debug("Quilt Loader has a matching update available!");
        return new QuiltLoaderUpdateChecker$QuiltLoaderUpdateInfo(semantic);
    }

    private static Version.Semantic getCurrentVersion() {
        return ((ModContainer)QuiltLoader.getModContainer((String)"quilt_loader").get()).metadata().version().semantic();
    }

    private static boolean isNewer(Version.Semantic semantic, Version.Semantic semantic2) {
        return semantic.compareTo(semantic2) > 0;
    }
}

