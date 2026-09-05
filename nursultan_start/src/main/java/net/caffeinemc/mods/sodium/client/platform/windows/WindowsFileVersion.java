/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.platform.windows;

import net.caffeinemc.mods.sodium.client.platform.windows.api.version.VersionFixedFileInfoStruct;
import org.jspecify.annotations.NonNull;

public record WindowsFileVersion(int x, int y, int z, int w) {
    public String toString() {
        return "%s.%s.%s.%s".formatted(new Object[]{this.x, this.y, this.z, this.w});
    }

    public static @NonNull WindowsFileVersion fromFileVersion(VersionFixedFileInfoStruct versionFixedFileInfoStruct) {
        int n = versionFixedFileInfoStruct.getFileVersionMostSignificantBits() >>> 16 & 0xFFFF;
        int n2 = versionFixedFileInfoStruct.getFileVersionMostSignificantBits() >>> 0 & 0xFFFF;
        int n3 = versionFixedFileInfoStruct.getFileVersionLeastSignificantBits() >>> 16 & 0xFFFF;
        int n4 = versionFixedFileInfoStruct.getFileVersionLeastSignificantBits() >>> 0 & 0xFFFF;
        return new WindowsFileVersion(n, n2, n3, n4);
    }
}

