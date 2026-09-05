/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class10067;

final class class10027 {
    private class10027() {
    }

    static String N(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        return string.replace("\r\n", " ").replace('\r', ' ').replace('\n', ' ');
    }

    static String N(String string, int n, int n2, String string2) {
        String string3 = string == null ? "" : string;
        int n3 = class10067.N(string3, n, n2);
        int n4 = class10067.y(string3, n, n2);
        String string4 = string2 == null ? "" : string2;
        return string3.substring(0, n3) + string4 + string3.substring(n4);
    }
}

