/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.compatibility.environment.probe;

import java.util.regex.Pattern;
import net.caffeinemc.mods.sodium.client.compatibility.environment.GlContextInfo;
import org.jspecify.annotations.NonNull;

public enum GraphicsAdapterVendor {
    NVIDIA,
    AMD,
    INTEL,
    UNKNOWN;

    private static final Pattern INTEL_ICD_PATTERN;
    private static final Pattern NVIDIA_ICD_PATTERN;
    private static final Pattern AMD_ICD_PATTERN;

    static @NonNull GraphicsAdapterVendor fromPciVendorId(String string) {
        if (string.contains("0x1002")) {
            return AMD;
        }
        if (string.contains("0x10de")) {
            return NVIDIA;
        }
        if (string.contains("0x8086")) {
            return INTEL;
        }
        return UNKNOWN;
    }

    public static @NonNull GraphicsAdapterVendor fromIcdName(String string) {
        if (GraphicsAdapterVendor.matchesPattern(INTEL_ICD_PATTERN, string)) {
            return INTEL;
        }
        if (GraphicsAdapterVendor.matchesPattern(NVIDIA_ICD_PATTERN, string)) {
            return NVIDIA;
        }
        if (GraphicsAdapterVendor.matchesPattern(AMD_ICD_PATTERN, string)) {
            return AMD;
        }
        return UNKNOWN;
    }

    private static boolean matchesPattern(Pattern pattern, String string) {
        return pattern.matcher(string).matches();
    }

    public static @NonNull GraphicsAdapterVendor fromContext(GlContextInfo glContextInfo) {
        String string;
        return switch (string = glContextInfo.vendor()) {
            case "NVIDIA Corporation" -> NVIDIA;
            case "Intel", "Intel Open Source Technology Center" -> INTEL;
            case "AMD", "ATI Technologies Inc." -> AMD;
            default -> UNKNOWN;
        };
    }

    static {
        INTEL_ICD_PATTERN = Pattern.compile("ig(4|7|75|8|9|11|12|(xe2?(hpg?|lpg?)))icd(32|64)\\.dll", 2);
        NVIDIA_ICD_PATTERN = Pattern.compile("nvoglv(32|64)\\.dll", 2);
        AMD_ICD_PATTERN = Pattern.compile("(atiglpxx|atig6pxx)\\.dll", 2);
    }
}

