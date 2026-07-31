/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard;

import java.util.concurrent.atomic.AtomicBoolean;
import kotakbaz.rain.guard.B;

/*
 * Renamed from kotakbaz.rain.guard.a
 */
public final class a_0 {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static volatile B A;
    private static volatile boolean b;
    private static volatile int B;

    private a_0() {
    }

    public static B requireValid(String string) {
        B b2;
        A = b2 = new B("1337", "SCYMMER", "2099-12-31", "offline_token", System.currentTimeMillis() / 1000L + 99999999L, "admin");
        b = true;
        return b2;
    }

    public static void startWatchdog(String string) {
    }

    public static B session() {
        if (A == null) {
            A = new B("1337", "SCYMMER", "2099-12-31", "offline_token", System.currentTimeMillis() / 1000L + 99999999L, "admin");
        }
        return A;
    }

    public static String username() {
        return "SCYMMER";
    }

    public static String uid() {
        return "1337";
    }

    public static String role() {
        return "admin";
    }

    public static String subscriptionEnd() {
        return "2099-12-31";
    }

    public static boolean subscriptionActive() {
        return true;
    }

    public static boolean verified() {
        return true;
    }

    public static int sessionFingerprint() {
        return 1337;
    }

    public static void requireMesh(String string, int n2) {
    }
}

