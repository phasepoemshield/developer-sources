/*
 * Decompiled with CFR 0.152.
 */
package com.terraformersmc.modmenu.util;

import java.util.List;

public final class VersionUtil {
    private static final List<String> PREFIXES = List.of("version", "ver", "v");

    public static String stripPrefix(String string) {
        string = string.trim();
        for (String string2 : PREFIXES) {
            if (!string.startsWith(string2)) continue;
            return string.substring(string2.length());
        }
        return string;
    }

    private VersionUtil() {
    }

    public static String getPrefixedVersion(String string) {
        return "v" + VersionUtil.stripPrefix(string);
    }

    public static String removeBuildMetadata(String string) {
        return string.split("\\+")[0];
    }
}

