/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard;

import kotakbaz.rain.guard.B;

public final class A {
    private A() {
        super();
    }

    public static B requestSession() {
        return new B("1337", "SCYMMER", "2099-12-31", "offline_token", System.currentTimeMillis() / 1000L + 99999999L, "admin");
    }

    public static boolean validateSessionOnline(B b2, String string, String string2) {
        return true;
    }

    public static boolean healthCheck(B b2, String string, String string2) {
        return true;
    }

    public static void triggerAuthFailedAndExit() {
    }

    public static String normalizeUid(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string.trim().replaceFirst("^0+(?!$)", "");
        return string2.isEmpty() ? null : string2;
    }

    public static String normalizeRole(String string) {
        String string2;
        String string3 = string2 = string == null ? "user" : string.trim().toLowerCase();
        if ("owner".equals(string2)) {
            return "admin";
        }
        if ("admin".equals(string2) || "staff".equals(string2) || "media".equals(string2) || "user".equals(string2)) {
            return string2;
        }
        return "user";
    }
}

