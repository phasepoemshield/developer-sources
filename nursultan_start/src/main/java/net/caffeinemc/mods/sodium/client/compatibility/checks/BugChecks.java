/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.compatibility.checks;

class BugChecks {
    public static final boolean ISSUE_899 = BugChecks.configureCheck("issue899", true);
    public static final boolean ISSUE_1486 = BugChecks.configureCheck("issue1486", true);
    public static final boolean ISSUE_2048 = BugChecks.configureCheck("issue2048", true);
    public static final boolean ISSUE_2561 = BugChecks.configureCheck("issue2561", true);
    public static final boolean ISSUE_2637 = BugChecks.configureCheck("issue2637", true);

    BugChecks() {
    }

    private static boolean configureCheck(String string, boolean bl) {
        String string2 = System.getProperty(BugChecks.getPropertyKey(string), null);
        if (string2 == null) {
            return bl;
        }
        return Boolean.parseBoolean(string2);
    }

    private static String getPropertyKey(String string) {
        return "sodium.checks." + string;
    }
}

