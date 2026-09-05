/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.compatibility.environment;

import java.util.Locale;
import net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils$OperatingSystem;

public class OsUtils {
    private static final OsUtils$OperatingSystem OS = OsUtils.determineOs();

    public static OsUtils$OperatingSystem determineOs() {
        String string = System.getProperty("os.name");
        if (string != null) {
            String string2 = string.toLowerCase(Locale.ROOT);
            if (string2.startsWith("windows")) {
                return OsUtils$OperatingSystem.WIN;
            }
            if (string2.startsWith("mac")) {
                return OsUtils$OperatingSystem.MAC;
            }
            if (string2.startsWith("linux")) {
                return OsUtils$OperatingSystem.LINUX;
            }
        }
        return OsUtils$OperatingSystem.UNKNOWN;
    }

    public static OsUtils$OperatingSystem getOs() {
        return OS;
    }
}

