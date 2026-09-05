/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 *  net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation
 *  org.apache.commons.codec.binary.Hex
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.data.fingerprint;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import minecraft.class06202;
import net.caffeinemc.mods.sodium.client.data.fingerprint.HashedFingerprint;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import org.apache.commons.codec.binary.Hex;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record FingerprintMeasure(@NonNull String uuid, @NonNull String path) {
    private static final int SALT_LENGTH = 64;

    public static @Nullable FingerprintMeasure create() {
        UUID uUID = class06202.Nq().Ny().y();
        Path path = PlatformRuntimeInformation.getInstance().getGameDirectory();
        if (uUID == null || path == null) {
            return null;
        }
        return new FingerprintMeasure(uUID.toString(), path.toAbsolutePath().toString());
    }

    private static String sha512(@NonNull String string, @NonNull String string2) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(Hex.decodeHex((String)string));
            messageDigest.update(string2.getBytes(StandardCharsets.UTF_8));
        }
        catch (Throwable throwable) {
            throw new RuntimeException("Failed to hash value", throwable);
        }
        return Hex.encodeHexString((byte[])messageDigest.digest());
    }

    private static String createSalt() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] byArray = new byte[64];
        secureRandom.nextBytes(byArray);
        return Hex.encodeHexString((byte[])byArray);
    }

    public HashedFingerprint hashed() {
        Instant instant = Instant.now();
        String string = FingerprintMeasure.createSalt();
        String string2 = FingerprintMeasure.sha512(string, this.uuid());
        String string3 = FingerprintMeasure.sha512(string, this.path());
        return new HashedFingerprint(1, string, string2, string3, instant.getEpochSecond());
    }

    public boolean looselyMatches(HashedFingerprint hashedFingerprint) {
        String string = FingerprintMeasure.sha512(hashedFingerprint.saltHex(), this.uuid());
        String string2 = FingerprintMeasure.sha512(hashedFingerprint.saltHex(), this.path());
        return Objects.equals(string, hashedFingerprint.uuidHashHex()) || Objects.equals(string2, hashedFingerprint.pathHashHex());
    }
}

