/*
 * Decompiled with CFR 0.152.
 */
package baritone.command.defaults;

import java.util.Arrays;
import java.util.HashSet;

enum WaypointsCommand$Action {
    LIST("list", "get", "l"),
    CLEAR("clear", "c"),
    SAVE("save", "s"),
    INFO("info", "show", "i"),
    DELETE("delete", "d"),
    RESTORE("restore"),
    GOAL("goal", "g"),
    GOTO("goto");

    final String[] names;

    private WaypointsCommand$Action(String ... stringArray) {
        this.names = stringArray;
    }

    public static WaypointsCommand$Action getByName(String string) {
        for (WaypointsCommand$Action waypointsCommand$Action : WaypointsCommand$Action.values()) {
            for (String string2 : waypointsCommand$Action.names) {
                if (!string2.equalsIgnoreCase(string)) continue;
                return waypointsCommand$Action;
            }
        }
        return null;
    }

    public static String[] getAllNames() {
        HashSet<String> hashSet = new HashSet<String>();
        for (WaypointsCommand$Action waypointsCommand$Action : WaypointsCommand$Action.values()) {
            hashSet.addAll(Arrays.asList(waypointsCommand$Action.names));
        }
        return hashSet.toArray(new String[0]);
    }
}

