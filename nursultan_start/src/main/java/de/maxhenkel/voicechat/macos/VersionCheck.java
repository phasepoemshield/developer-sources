/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Platform
 *  de.maxhenkel.voicechat.util.Version
 */
package de.maxhenkel.voicechat.macos;

import com.sun.jna.Platform;
import de.maxhenkel.voicechat.util.Version;

public class VersionCheck {
    private static final Version VERSION_13 = new Version(13, 0, 0);
    private static Boolean isMacOSNativeCompatible;

    public static boolean isMacOSNativeCompatible() {
        if (isMacOSNativeCompatible == null) {
            isMacOSNativeCompatible = VersionCheck.checkIsMacOSNativeCompatible();
        }
        return isMacOSNativeCompatible;
    }

    private static boolean checkIsMacOSNativeCompatible() {
        if (!Platform.isMac()) {
            return false;
        }
        String string = System.getProperty("os.version");
        if (string == null) {
            return false;
        }
        Version version = Version.fromVersionString((String)string);
        if (version == null) {
            return false;
        }
        return version.compareTo(VERSION_13) >= 0;
    }
}

