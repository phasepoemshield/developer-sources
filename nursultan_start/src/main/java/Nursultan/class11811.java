/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11788
 *  Nursultan.class11790
 */
package Nursultan;

import Nursultan.class11788;
import Nursultan.class11790;
import Nursultan.class11823;
import java.util.Set;
import java.util.regex.Pattern;

public class class11811 {
    private class11811() {
    }

    public static void y(long l) {
        if (l >= 50L) {
            throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_5);
        }
    }

    public static void N(byte[] byArray) {
        if (byArray == null || byArray.length == 0) {
            throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_3);
        }
        if (byArray.length > 0x100000) {
            throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_4);
        }
    }

    public static void N(int n) {
        if (!((Set)class11823.N_6).contains(n)) {
            throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_3);
        }
    }

    public static String N(String string) {
        if (string == null) {
            throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_2);
        }
        String string2 = string.strip();
        if (string2.length() < 3 || string2.length() > 32) {
            throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_2);
        }
        if (!((Pattern)class11823.N_5).matcher(string2).matches()) {
            throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_2);
        }
        return string2;
    }

    public static void N(long l) {
        if (l > 0x400000L) {
            throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_4);
        }
    }
}

