/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09798;
import Nursultan.class10021;
import java.util.Objects;

final class class09800 {
    private class09800() {
    }

    private static String y(class10021 class100212) {
        return class100212 == null ? null : class09800.N(class100212.N());
    }

    private static String y(class09798 class097982) {
        return class097982 == null ? null : class09800.N(class097982.N());
    }

    private static boolean y(String string) {
        return string != null && !string.isBlank();
    }

    static boolean N(class10021 class100212, class09798 class097982) {
        if (class100212 == null || class097982 == null || class100212.y() != class097982.y()) {
            return false;
        }
        return Objects.equals(class09800.y(class100212), class09800.y(class097982));
    }

    private static String N(String string) {
        return class09800.y(string) ? string : null;
    }

    static String N(class10021 class100212) {
        if (class100212 == null) {
            return null;
        }
        return class09800.y(class100212);
    }

    static String N(class09798 class097982) {
        if (class097982 == null) {
            return null;
        }
        return class09800.y(class097982);
    }
}

