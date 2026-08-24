/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

public final class JavaVersion {
    private static final int majorJavaVersion = JavaVersion.determineMajorJavaVersion();

    public static int getMajorJavaVersion() {
        return majorJavaVersion;
    }

    public static boolean isJava9OrLater() {
        return majorJavaVersion >= 9;
    }

    /*
     * WARNING - void declaration
     */
    static int getMajorJavaVersion(String javaVersion) {
        void var1_1;
        int version = JavaVersion.parseDotted(javaVersion);
        if (version == -1) {
            version = JavaVersion.extractBeginningInt(javaVersion);
        }
        if (version == -1) {
            return 6;
        }
        return (int)var1_1;
    }

    private JavaVersion() {
    }

    private static int determineMajorJavaVersion() {
        String javaVersion = System.getProperty("java.version");
        return JavaVersion.getMajorJavaVersion(javaVersion);
    }

    /*
     * WARNING - void declaration
     */
    private static int extractBeginningInt(String javaVersion) {
        try {
            StringBuilder num = new StringBuilder();
            int i = 0;
            while (i < javaVersion.length()) {
                void var2_3;
                void var3_4;
                char c = javaVersion.charAt(i);
                if (!Character.isDigit(c)) break;
                num.append((char)var3_4);
                ++var2_3;
            }
            return Integer.parseInt(num.toString());
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static int parseDotted(String javaVersion) {
        try {
            void var2_3;
            String[] parts = javaVersion.split("[._]");
            int firstVer = Integer.parseInt(parts[0]);
            if (firstVer == 1) {
                if (parts.length > 1) {
                    return Integer.parseInt(parts[1]);
                }
            }
            return (int)var2_3;
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }
}

