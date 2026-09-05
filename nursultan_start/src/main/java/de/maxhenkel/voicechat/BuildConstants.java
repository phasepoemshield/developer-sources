/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat;

public class BuildConstants {
    public static final int COMPATIBILITY_VERSION;
    public static final String MINECRAFT_VERSION = "1.21.11";
    public static final String MOD_COMPATIBLE_VERSION = "2.6.x";

    static {
        int compatibilityVersion;
        String compatibilityVersionString = "20";
        try {
            compatibilityVersion = Integer.parseInt(compatibilityVersionString);
        }
        catch (NumberFormatException e1) {
            try {
                compatibilityVersion = Integer.parseInt(System.getenv("COMPATIBILITY_VERSION"));
            }
            catch (NumberFormatException e2) {
                compatibilityVersion = -1;
            }
        }
        COMPATIBILITY_VERSION = compatibilityVersion;
    }
}

