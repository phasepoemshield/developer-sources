/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.net.SocketException;
import java.util.Locale;

public class class10639 {
    private static String[] y;

    private class10639() {
    }

    static {
        class10639.N();
    }

    private static void N() {
        y = new String[1];
        class10639.y[0] = "connection reset";
    }

    public static boolean N(Throwable throwable) {
        if (!(throwable instanceof SocketException)) {
            return false;
        }
        SocketException socketException = (SocketException)throwable;
        String string = socketException.getMessage();
        return string != null && string.toLowerCase(Locale.ROOT).contains(y[0]);
    }
}

