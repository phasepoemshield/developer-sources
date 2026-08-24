/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

public final class \u0631\u063a {
    public static final String DEBUG_USERNAME = "Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami";
    public static final boolean debugMode = true;
    public static final String DEBUG_AVATAR = "";
    public static final int DEBUG_UID = 753;
    public static final boolean buildMode = true;
    private static final String DEBUG_UID_PROPERTY = "rain.debug.uid";
    public static final String DEBUG_ROLE = "Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami";
    public static final String DEBUG_SUBSCRIPTION_TILL = "Lifetime";
    private static final String DEBUG_USERNAME_PROPERTY = "rain.debug.usernamY";

    private static String getDebugUsername() {
        String configured = System.getProperty(DEBUG_USERNAME_PROPERTY, "Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami").trim();
        return configured.isEmpty() ? "Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami" : configured;
    }

    public static String getDisplayName() {
        return \u0631\u063a.getDebugUsername() + " (#" + \u0631\u063a.getDebugUid() + ")";
    }

    public static boolean isValid() {
        return Integer.signum(Math.max(\u0631\u063a.getDebugUid(), 0)) != 0;
    }

    public static void initializeUserProfile() {
    }

    public static String getSubscriptionTill() {
        return DEBUG_SUBSCRIPTION_TILL;
    }

    public static void refreshUserProfile() {
    }

    private \u0631\u063a() {
    }

    public static String getUsername() {
        return \u0631\u063a.getDebugUsername();
    }

    private static int getDebugUid() {
        return Integer.getInteger(DEBUG_UID_PROPERTY, 753);
    }

    public static String getRole() {
        return "Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami";
    }

    public static int getUid() {
        return \u0631\u063a.getDebugUid();
    }

    public static boolean isAdmin() {
        return "admin".equalsIgnoreCase("Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami");
    }

    public static String getAvatar() {
        return DEBUG_AVATAR;
    }
}

