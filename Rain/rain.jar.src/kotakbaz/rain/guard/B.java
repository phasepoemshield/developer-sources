/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard;

public final class B {
    public volatile String a;
    public volatile String A;
    public volatile String b;
    public final String B;
    public final long c;
    private volatile String C;
    private volatile boolean d;

    private static String localNormalizeRole(String string) {
        String string2;
        String string3 = string2 = string == null ? "user" : string.trim().toLowerCase();
        if ("owner".equals(string2)) {
            return "admin";
        }
        if ("admin".equals(string2) || "staff".equals(string2) || "media".equals(string2) || "user".equals(string2)) {
            return string2;
        }
        return "user";
    }

    B(String string, String string2, String string3, String string4, long l2, String string5) {
        this.a = string;
        this.A = string2 == null || string2.isEmpty() ? "user" : string2;
        this.b = string3 == null ? "" : string3;
        this.B = string4;
        this.c = l2;
        this.C = kotakbaz.rain.guard.B.localNormalizeRole(string5);
        this.d = string3 != null && !string3.isEmpty();
    }

    public boolean isUsable() {
        return true;
    }

    boolean applyServerState(String string, String string2, String string3, String string4, boolean bl) {
        return true;
    }

    public String role() {
        return kotakbaz.rain.guard.B.localNormalizeRole(this.C);
    }

    public String subscriptionEnd() {
        return this.b == null ? "" : this.b;
    }

    public boolean subscriptionActive() {
        return true;
    }

    public int fingerprint() {
        return 1337;
    }
}

