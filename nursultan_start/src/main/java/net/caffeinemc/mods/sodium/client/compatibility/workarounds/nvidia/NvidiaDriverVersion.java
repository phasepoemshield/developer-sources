/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.platform.windows.WindowsFileVersion
 */
package net.caffeinemc.mods.sodium.client.compatibility.workarounds.nvidia;

import net.caffeinemc.mods.sodium.client.platform.windows.WindowsFileVersion;

public record NvidiaDriverVersion(int major, int minor) {
    public String toString() {
        return "%d.%d".formatted(new Object[]{this.major, this.minor});
    }

    public static NvidiaDriverVersion parse(WindowsFileVersion windowsFileVersion) {
        int n = (windowsFileVersion.z() - 10) * 10000 + windowsFileVersion.w();
        int n2 = n / 100;
        int n3 = n % 100;
        return new NvidiaDriverVersion(n2, n3);
    }
}

