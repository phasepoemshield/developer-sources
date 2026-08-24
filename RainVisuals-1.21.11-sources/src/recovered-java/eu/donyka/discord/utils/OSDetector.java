/*
 * Decompiled with CFR 0.152.
 */
package eu.donyka.discord.utils;

public class OSDetector {
    public static final OSDetector INSTANCE = new OSDetector();

    public OSType detectOs() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            return OSType.WINDOWS;
        }
        if (osName.contains("nix") || osName.contains("nux") || osName.contains("aix")) {
            return OSType.LINUX;
        }
        if (osName.contains("mac")) {
            return OSType.MACOS;
        }
        return OSType.UNKNOWN;
    }

    public static final class OSType
    extends Enum<OSType> {
        public static final /* enum */ OSType WINDOWS = new OSType();
        public static final /* enum */ OSType UNKNOWN;
        public static final /* enum */ OSType MACOS;
        public static final /* enum */ OSType LINUX;
        private static final /* synthetic */ OSType[] $VALUES;

        public boolean isWindows() {
            return this == WINDOWS;
        }

        public boolean isLinux() {
            return this == LINUX;
        }

        public static OSType[] values() {
            return (OSType[])$VALUES.clone();
        }

        public boolean isMac() {
            return this == MACOS;
        }

        public static OSType valueOf(String name) {
            return Enum.valueOf(OSType.class, name);
        }

        static {
            LINUX = new OSType();
            MACOS = new OSType();
            UNKNOWN = new OSType();
            OSType[] oSTypeArray = new OSType[4];
            oSTypeArray[0] = WINDOWS;
            oSTypeArray[1] = LINUX;
            oSTypeArray[2] = MACOS;
            oSTypeArray[3] = UNKNOWN;
            $VALUES = oSTypeArray;
        }
    }
}

