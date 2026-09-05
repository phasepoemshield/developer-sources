/*
 * Decompiled with CFR 0.152.
 */
package baritone.command.defaults;

import java.util.Arrays;
import java.util.HashSet;

enum SelCommand$Action {
    POS1("pos1", "p1", "1"),
    POS2("pos2", "p2", "2"),
    CLEAR("clear", "c"),
    UNDO("undo", "u"),
    SET("set", "fill", "s", "f"),
    WALLS("walls", "w"),
    SHELL("shell", "shl"),
    SPHERE("sphere", "sph"),
    HSPHERE("hsphere", "hsph"),
    CYLINDER("cylinder", "cyl"),
    HCYLINDER("hcylinder", "hcyl"),
    CLEARAREA("cleararea", "ca"),
    REPLACE("replace", "r"),
    EXPAND("expand", "ex"),
    COPY("copy", "cp"),
    PASTE("paste", "p"),
    CONTRACT("contract", "ct"),
    SHIFT("shift", "sh");

    private final String[] names;

    private SelCommand$Action(String ... stringArray) {
        this.names = stringArray;
    }

    public static SelCommand$Action getByName(String string) {
        for (SelCommand$Action selCommand$Action : SelCommand$Action.values()) {
            for (String string2 : selCommand$Action.names) {
                if (!string2.equalsIgnoreCase(string)) continue;
                return selCommand$Action;
            }
        }
        return null;
    }

    public static String[] getAllNames() {
        HashSet<String> hashSet = new HashSet<String>();
        for (SelCommand$Action selCommand$Action : SelCommand$Action.values()) {
            hashSet.addAll(Arrays.asList(selCommand$Action.names));
        }
        return hashSet.toArray(new String[0]);
    }

    public final boolean isFillAction() {
        return this == SET || this == WALLS || this == SHELL || this == SPHERE || this == HSPHERE || this == CYLINDER || this == HCYLINDER || this == CLEARAREA || this == REPLACE;
    }
}

