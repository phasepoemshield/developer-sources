/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07018
 */
package minecraft;

import java.util.IllegalFormatException;
import java.util.Locale;
import minecraft.class07018;

public class class08392 {
    private static volatile class07018 N = class07018.y();

    private class08392() {
    }

    static void N(class07018 class070182) {
        N = class070182;
    }

    public static boolean N(String string) {
        return N.N(string);
    }

    public static String N(String string, Object ... objectArray) {
        String string2 = N.y(string);
        try {
            return String.format(Locale.ROOT, string2, objectArray);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }
}

