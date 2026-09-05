/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

class class00441 {
    private final boolean N;
    private final String y;
    private final boolean L;

    public String L() {
        return this.y;
    }

    private class00441(boolean bl, String string, boolean bl2) {
        this.N = bl;
        this.y = string;
        this.L = bl2;
    }

    public boolean u() {
        return this.L;
    }

    public boolean y() {
        return this.N;
    }

    public static class00441 N(String string) {
        return new class00441(false, string, false);
    }

    public static class00441 N() {
        return new class00441(true, null, false);
    }

    public static class00441 N(boolean bl) {
        return new class00441(true, null, bl);
    }
}

