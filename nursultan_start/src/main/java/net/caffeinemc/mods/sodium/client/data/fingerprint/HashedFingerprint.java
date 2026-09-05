/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 *  net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation
 *  net.caffeinemc.mods.sodium.client.util.FileUtil
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.data.fingerprint;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Objects;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import net.caffeinemc.mods.sodium.client.util.FileUtil;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record HashedFingerprint(@SerializedName(value="v") int version, @SerializedName(value="s") @NonNull String saltHex, @SerializedName(value="u") @NonNull String uuidHashHex, @SerializedName(value="p") @NonNull String pathHashHex, @SerializedName(value="t") long timestamp) {
    public static final int CURRENT_VERSION = 1;

    public static void writeToDisk(@NonNull HashedFingerprint hashedFingerprint) {
        Objects.requireNonNull(hashedFingerprint);
        try {
            FileUtil.writeTextRobustly((String)new Gson().toJson((Object)hashedFingerprint), (Path)HashedFingerprint.getFilePath());
        }
        catch (IOException iOException) {
            throw new RuntimeException("Failed to save data file", iOException);
        }
    }

    public static @Nullable HashedFingerprint loadFromDisk() {
        HashedFingerprint hashedFingerprint;
        Path path = HashedFingerprint.getFilePath();
        if (!Files.exists(path, new LinkOption[0])) {
            return null;
        }
        try {
            hashedFingerprint = (HashedFingerprint)((Object)new Gson().fromJson(Files.readString(path), HashedFingerprint.class));
        }
        catch (IOException iOException) {
            throw new RuntimeException("Failed to load data file", iOException);
        }
        if (hashedFingerprint.version() != 1) {
            return null;
        }
        return hashedFingerprint;
    }

    private static Path getFilePath() {
        return PlatformRuntimeInformation.getInstance().getConfigDirectory().resolve("sodium-fingerprint.json");
    }
}

