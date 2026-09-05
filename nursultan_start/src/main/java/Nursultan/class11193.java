/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11172;
import Nursultan.class11198;
import java.util.regex.Pattern;

public class class11193 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;

    class11193(String string, String string2) {
        this.y();
        this.y_0 = string;
        this.y_1 = string2;
    }

    static {
        class11193.i();
        N_0 = Pattern.compile("^(\\s*)#\\s*define\\s+([A-Za-z_][A-Za-z0-9_]*)\\s+__ARG_(FLOAT_ARRAY|FLOAT|INT|BOOL|VEC2|VEC3|VEC4)(?:_([1-9][0-9]*))?__(.*)$", 8);
    }

    private static void i() {
        N_0 = null;
    }

    private void y() {
    }

    public static class11172 N(String string) {
        return new class11172(string);
    }

    public class11198 N() {
        return new class11198(this);
    }
}

