/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 *  minecraft.class00392
 *  minecraft.class00647
 *  minecraft.class00652
 *  minecraft.class05216
 *  minecraft.class05630
 *  minecraft.class06202
 *  net.irisshaders.iris.platform.IrisPlatformHelpers
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.time.DateUtils
 */
package net.irisshaders.iris;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import minecraft.class00392;
import minecraft.class00647;
import minecraft.class00652;
import minecraft.class05216;
import minecraft.class05630;
import minecraft.class06202;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.UpdateChecker$BetaInfo;
import net.irisshaders.iris.UpdateChecker$UpdateInfo;
import net.irisshaders.iris.config.IrisConfig;
import net.irisshaders.iris.gl.shader.StandardMacros;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.time.DateUtils;

public class UpdateChecker {
    private final String currentVersion;
    private CompletableFuture<UpdateChecker$UpdateInfo> info;
    private CompletableFuture<UpdateChecker$BetaInfo> betaInfo;
    private boolean shouldShowUpdateMessage;
    private boolean shouldShowBetaUpdateMessage;
    private boolean usedIrisInstaller;

    public void checkForUpdates(IrisConfig irisConfig) {
        if (irisConfig.shouldDisableUpdateMessage()) {
            this.shouldShowUpdateMessage = false;
            return;
        }
        this.info = CompletableFuture.supplyAsync(() -> {
            try {
                Object object;
                File file = IrisPlatformHelpers.getInstance().getGameDir().resolve("irisUpdateInfo.json").toFile();
                if (DateUtils.isSameDay((Date)new Date(), (Date)new Date(file.lastModified()))) {
                    Iris.logger.warn("[Iris Update Check] Cached update file detected, using that!");
                    try {
                        object = (UpdateChecker$UpdateInfo)new Gson().fromJson(FileUtils.readFileToString((File)file, (Charset)StandardCharsets.UTF_8), UpdateChecker$UpdateInfo.class);
                    }
                    catch (JsonSyntaxException | NullPointerException throwable) {
                        Iris.logger.error("[Iris Update Check] Cached file invalid, will delete!", throwable);
                        Files.delete(file.toPath());
                        return null;
                    }
                    try {
                        if (IrisPlatformHelpers.INSTANCE.compareVersions(this.currentVersion, ((UpdateChecker$UpdateInfo)object).semanticVersion) >= 0) return null;
                        this.shouldShowUpdateMessage = true;
                        Iris.logger.warn("[Iris Update Check] New update detected, showing update message!");
                        return object;
                    }
                    catch (Exception exception) {
                        Iris.logger.error("[Iris Update Check] Caught a VersionParsingException while parsing semantic versions!", exception);
                    }
                }
                object = new URL("https://github.com/IrisShaders/Iris-Update-Index/releases/latest/download/updateIndex.json").openStream();
                try {
                    String string;
                    try {
                        string = JsonParser.parseReader((Reader)new InputStreamReader((InputStream)object)).getAsJsonObject().get(StandardMacros.getMcVersion()).getAsString();
                    }
                    catch (NullPointerException nullPointerException) {
                        Iris.logger.warn("[Iris Update Check] This version doesn't have an update index, skipping.");
                        UpdateChecker$UpdateInfo updateChecker$UpdateInfo = null;
                        if (object == null) return updateChecker$UpdateInfo;
                        ((InputStream)object).close();
                        return updateChecker$UpdateInfo;
                    }
                    String string2 = IOUtils.toString((URL)new URL(string), (Charset)StandardCharsets.UTF_8);
                    UpdateChecker$UpdateInfo updateChecker$UpdateInfo = (UpdateChecker$UpdateInfo)new Gson().fromJson(string2, UpdateChecker$UpdateInfo.class);
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(string2);
                    bufferedWriter.close();
                    try {
                        if (IrisPlatformHelpers.INSTANCE.compareVersions(this.currentVersion, updateChecker$UpdateInfo.semanticVersion) < 0) {
                            this.shouldShowUpdateMessage = true;
                            Iris.logger.info("[Iris Update Check] New update detected, showing update message!");
                            UpdateChecker$UpdateInfo updateChecker$UpdateInfo2 = updateChecker$UpdateInfo;
                            return updateChecker$UpdateInfo2;
                        }
                        UpdateChecker$UpdateInfo updateChecker$UpdateInfo3 = null;
                        return updateChecker$UpdateInfo3;
                    }
                    catch (Exception exception) {
                        Iris.logger.error("[Iris Update Check] Caught a VersionParsingException while parsing semantic versions!", exception);
                        return null;
                    }
                }
                finally {
                    if (object != null) {
                        try {
                            ((InputStream)object).close();
                        }
                        catch (Throwable throwable) {
                            Throwable throwable2;
                            throwable2.addSuppressed(throwable);
                        }
                    }
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                Iris.logger.warn("[Iris Update Check] Unable to download " + fileNotFoundException.getMessage());
                return null;
            }
            catch (IOException iOException) {
                Iris.logger.warn("[Iris Update Check] Failed to get update info!", iOException);
            }
            return null;
        });
    }

    private void checkBetaUpdates() {
        this.betaInfo = CompletableFuture.supplyAsync(() -> {
            try (InputStream inputStream = URI.create("https://raw.githubusercontent.com/IrisShaders/Iris-Installer-Files/master/betaTag.json").toURL().openStream();){
                UpdateChecker$BetaInfo updateChecker$BetaInfo3 = (UpdateChecker$BetaInfo)new Gson().fromJson((JsonElement)JsonParser.parseReader((Reader)new InputStreamReader(inputStream)).getAsJsonObject(), UpdateChecker$BetaInfo.class);
                if (0 < updateChecker$BetaInfo3.betaVersion && "".equalsIgnoreCase(updateChecker$BetaInfo3.betaTag)) {
                    this.shouldShowUpdateMessage = true;
                    Iris.logger.info("[Iris Beta Update Check] New update detected, showing update message!");
                    UpdateChecker$BetaInfo updateChecker$BetaInfo2 = updateChecker$BetaInfo3;
                    return updateChecker$BetaInfo2;
                }
                UpdateChecker$BetaInfo updateChecker$BetaInfo = null;
                return updateChecker$BetaInfo;
            }
            catch (FileNotFoundException fileNotFoundException) {
                Iris.logger.warn("[Iris Beta Update Check] Unable to download " + fileNotFoundException.getMessage());
                return null;
            }
            catch (IOException iOException) {
                Iris.logger.warn("[Iris Beta Update Check] Failed to get update info!", iOException);
            }
            return null;
        });
    }

    public Optional<UpdateChecker$BetaInfo> getBetaInfo() {
        if (this.betaInfo != null && this.betaInfo.isDone()) {
            try {
                return Optional.ofNullable(this.betaInfo.get());
            }
            catch (InterruptedException | ExecutionException exception) {
                throw new RuntimeException(exception);
            }
        }
        return Optional.empty();
    }

    public UpdateChecker(String string) {
        this.currentVersion = string;
        if (Objects.equals(System.getProperty("iris.installer", "false"), "true")) {
            this.usedIrisInstaller = true;
        }
    }

    public UpdateChecker$UpdateInfo getUpdateInfo() {
        if (this.info != null && this.info.isDone()) {
            try {
                return this.info.get();
            }
            catch (InterruptedException | ExecutionException exception) {
                Iris.logger.error("Failed to get update info!", exception);
                return null;
            }
        }
        return null;
    }

    public Optional<class00392> getUpdateMessage() {
        if (this.shouldShowUpdateMessage) {
            UpdateChecker$UpdateInfo updateChecker$UpdateInfo = this.getUpdateInfo();
            if (updateChecker$UpdateInfo == null) {
                return Optional.empty();
            }
            String string = ((class05630)class06202.Nq().i_7).Nk.toLowerCase(Locale.ROOT);
            String string2 = updateChecker$UpdateInfo.updateInfo.containsKey(string) ? updateChecker$UpdateInfo.updateInfo.get(string) : updateChecker$UpdateInfo.updateInfo.get("en_us");
            String[] stringArray = string2.split("\\{link}");
            if (stringArray.length > 1) {
                class05216 class052162 = class00392.y((String)stringArray[0]);
                class05216 class052163 = class00392.y((String)stringArray[1]);
                class05216 class052164 = class00392.y((String)(this.usedIrisInstaller ? "the Iris Installer" : updateChecker$UpdateInfo.modHost)).N(class004052 -> class004052.N((class00647)new class00652(this.usedIrisInstaller ? updateChecker$UpdateInfo.installer : updateChecker$UpdateInfo.modDownload)).L(Boolean.valueOf(true)));
                return Optional.of(class052162.y((class00392)class052164).y((class00392)class052163));
            }
            class05216 class052165 = class00392.y((String)(this.usedIrisInstaller ? "the Iris Installer" : updateChecker$UpdateInfo.modHost)).N(class004052 -> class004052.N((class00647)new class00652(this.usedIrisInstaller ? updateChecker$UpdateInfo.installer : updateChecker$UpdateInfo.modDownload)).L(Boolean.valueOf(true)));
            return Optional.of(class00392.y((String)stringArray[0]).y((class00392)class052165));
        }
        return Optional.empty();
    }

    public Optional<URI> getUpdateLink() {
        if (this.shouldShowUpdateMessage) {
            UpdateChecker$UpdateInfo updateChecker$UpdateInfo = this.getUpdateInfo();
            return Optional.of(this.usedIrisInstaller ? updateChecker$UpdateInfo.installer : updateChecker$UpdateInfo.modDownload);
        }
        return Optional.empty();
    }
}

