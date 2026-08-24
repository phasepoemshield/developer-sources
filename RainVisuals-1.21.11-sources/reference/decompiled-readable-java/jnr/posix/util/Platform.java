/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix.util;

import java.util.HashMap;
import java.util.Map;

public class Platform {
    public static final boolean IS_BSD;
    private static final String WINDOWS = "windows";
    public static final boolean IS_FREEBSD;
    public static final boolean IS_WINDOWS_SERVER;
    public static final boolean IS_DRAGONFLY;
    private static final String LINUX = "linux";
    public static final boolean IS_WINDOWS_20X;
    public static final String OS_NAME_LC;
    private static final String WINDOWS_XP = "windows xp";
    private static final String MAC_OS = "mac os";
    private static final String WINDOWS_VISTA = "vista";
    private static final String OPENBSD = "openbsd";
    private static final String WINDOWS_9X = "windows 9";
    public static final boolean IS_WINDOWS_NT;
    public static final boolean IS_WINDOWS_XP;
    private static final String WINDOWS_20X = "windows 2";
    public static final boolean IS_MAC;
    private static final String WINDOWS_7 = "windows 7";
    public static final String ARCH;
    public static final boolean IS_LINUX;
    private static final String WINDOWS_NT = "nt";
    public static final Map<String, String> OS_NAMES;
    public static final boolean IS_OPENBSD;
    public static final boolean IS_WINDOWS;
    private static final String DARWIN = "darwin";
    private static final String DRAGONFLY = "dragonfly";
    public static final boolean IS_WINDOWS_7;
    public static final boolean IS_32_BIT;
    public static final boolean IS_SOLARIS;
    public static final String OS_NAME;
    public static final boolean IS_WINDOWS_VISTA;
    private static final String WINDOWS_SERVER = "server";
    private static final String FREEBSD = "freebsd";
    public static final boolean IS_64_BIT;
    private static final String SOLARIS = "sunos";
    public static final boolean IS_WINDOWS_9X;

    /*
     * Unable to fully structure code
     */
    static {
        Platform.OS_NAME = System.getProperty("os.name");
        Platform.OS_NAME_LC = Platform.OS_NAME.toLowerCase();
        Platform.IS_WINDOWS = Platform.OS_NAME_LC.indexOf("windows") != -1;
        Platform.IS_WINDOWS_9X = Platform.OS_NAME_LC.indexOf("windows 9") > -1;
        if (!Platform.IS_WINDOWS) ** GOTO lbl-1000
        if (Platform.OS_NAME_LC.indexOf("nt") > -1) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        Platform.IS_WINDOWS_NT = v0;
        Platform.IS_WINDOWS_20X = Platform.OS_NAME_LC.indexOf("windows 2") > -1;
        Platform.IS_WINDOWS_XP = Platform.OS_NAME_LC.indexOf("windows xp") > -1;
        if (!Platform.IS_WINDOWS) ** GOTO lbl-1000
        if (Platform.OS_NAME_LC.indexOf("vista") > -1) {
            v1 = true;
        } else lbl-1000:
        // 2 sources

        {
            v1 = false;
        }
        Platform.IS_WINDOWS_VISTA = v1;
        if (!Platform.IS_WINDOWS) ** GOTO lbl-1000
        if (Platform.OS_NAME_LC.indexOf("server") > -1) {
            v2 = true;
        } else lbl-1000:
        // 2 sources

        {
            v2 = false;
        }
        Platform.IS_WINDOWS_SERVER = v2;
        if (!Platform.IS_WINDOWS) ** GOTO lbl-1000
        if (Platform.OS_NAME_LC.indexOf("windows 7") > -1) {
            v3 = true;
        } else lbl-1000:
        // 2 sources

        {
            v3 = false;
        }
        Platform.IS_WINDOWS_7 = v3;
        Platform.IS_MAC = Platform.OS_NAME_LC.startsWith("mac os") || Platform.OS_NAME_LC.startsWith("darwin");
        Platform.IS_FREEBSD = Platform.OS_NAME_LC.startsWith("freebsd");
        Platform.IS_DRAGONFLY = Platform.OS_NAME_LC.startsWith("dragonfly");
        Platform.IS_OPENBSD = Platform.OS_NAME_LC.startsWith("openbsd");
        Platform.IS_LINUX = Platform.OS_NAME_LC.startsWith("linux");
        Platform.IS_SOLARIS = Platform.OS_NAME_LC.startsWith("sunos");
        Platform.IS_BSD = Platform.IS_MAC || Platform.IS_FREEBSD || Platform.IS_OPENBSD || Platform.IS_DRAGONFLY;
        Platform.IS_32_BIT = "32".equals(Platform.getProperty("sun.arch.data.model", "32"));
        Platform.IS_64_BIT = "64".equals(Platform.getProperty("sun.arch.data.model", "64"));
        var0 = System.getProperty("os.arch");
        if (var0.equals("amd64")) {
            var0 = "x86_64";
        }
        Platform.ARCH = var0;
        Platform.OS_NAMES = new HashMap<String, String>();
        Platform.OS_NAMES.put("Mac OS X", "darwin");
        Platform.OS_NAMES.put("Darwin", "darwin");
        Platform.OS_NAMES.put("Linux", "linux");
    }

    public static String getOSName() {
        String theOSName = OS_NAMES.get(OS_NAME);
        return theOSName == null ? OS_NAME : theOSName;
    }

    public static String getProperty(String property, String defValue) {
        try {
            return System.getProperty(property, defValue);
        }
        catch (SecurityException se) {
            return defValue;
        }
    }

    public static final String envCommand() {
        if (IS_WINDOWS) {
            if (IS_WINDOWS_9X) {
                return "command.com /c set";
            }
            if (IS_WINDOWS_NT || IS_WINDOWS_20X || IS_WINDOWS_XP || IS_WINDOWS_SERVER || IS_WINDOWS_VISTA || IS_WINDOWS_7) {
                return "cmd.exe /c set";
            }
        }
        return "env";
    }
}

