/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09177
 *  Nursultan.class11487
 */
package Nursultan;

import Nursultan.class09177;
import Nursultan.class11487;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class class11723 {
    private static String[] y;
    private static byte[] L;
    public static Object[] N;

    public static void L(UUID uUID) {
        ((Map)N[1]).remove(uUID);
    }

    private class11723() {
        throw new UnsupportedOperationException(y[1]);
    }

    static {
        class11723.u();
        class11723.y();
        class11723.N();
        class11723.N[0] = new class11487(class09177.staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_0, null);
        class11723.N[1] = new ConcurrentHashMap();
    }

    private static void u() {
        L = new byte[1];
        class11723.L[0] = 2;
    }

    public static class11487 y(UUID uUID) {
        return ((Map)N[1]).getOrDefault(uUID, (class11487)N[0]);
    }

    private static void y() {
        y = new String[2];
        class11723.y[0] = "account.modal.microsoft.processing";
        class11723.y[1] = "This is a utility class and cannot be instantiated";
    }

    public static void N(UUID uUID, String string) {
        ((Map)N[1]).put(uUID, new class11487(class09177.staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_2, string));
    }

    private static void N() {
        N = new Object[L[0]];
    }

    public static void N(UUID uUID) {
        ((Map)N[1]).put(uUID, new class11487(class09177.staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_1, y[0]));
    }
}

