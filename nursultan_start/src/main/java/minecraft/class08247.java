/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class08247
extends Enum<class08247> {
    public static final /* enum */ class08247 field_4997 = new class08247(4, true, true, true, false, true, 0, 8, 16, 255, 24, true);
    public static final /* enum */ class08247 field_5001 = new class08247(3, true, true, true, false, false, 0, 8, 16, 255, 255, true);
    public static final /* enum */ class08247 field_5002 = new class08247(2, false, false, false, true, true, 255, 255, 255, 0, 8, true);
    public static final /* enum */ class08247 field_4998 = new class08247(1, false, false, false, true, false, 0, 0, 0, 0, 255, true);
    final int field_4994;
    private final boolean field_5005;
    private final boolean field_5004;
    private final boolean field_5003;
    private final boolean field_5000;
    private final boolean field_4999;
    private final int field_5010;
    private final int field_5009;
    private final int field_5008;
    private final int field_5007;
    private final int field_5006;
    private final boolean field_4996;
    private static final /* synthetic */ class08247[] field_4995;

    public boolean L() {
        return this.field_5004;
    }

    public int M() {
        return this.field_5010;
    }

    public boolean P() {
        return this.field_5000 || this.field_4999;
    }

    public int T() {
        return this.field_5000 ? this.field_5007 : this.field_5009;
    }

    private class08247(int n2, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n3, int n4, int n5, int n6, int n7, boolean bl6) {
        this.field_4994 = n2;
        this.field_5005 = bl;
        this.field_5004 = bl2;
        this.field_5003 = bl3;
        this.field_5000 = bl4;
        this.field_4999 = bl5;
        this.field_5010 = n3;
        this.field_5009 = n4;
        this.field_5008 = n5;
        this.field_5007 = n6;
        this.field_5006 = n7;
        this.field_4996 = bl6;
    }

    public static class08247[] values() {
        return (class08247[])field_4995.clone();
    }

    public static class08247 valueOf(String string) {
        return Enum.valueOf(class08247.class, string);
    }

    public int B() {
        return this.field_5009;
    }

    public int Z() {
        return this.field_5008;
    }

    public boolean i() {
        return this.field_5000;
    }

    public int b() {
        return this.field_5000 ? this.field_5007 : this.field_5008;
    }

    public int s() {
        return this.field_5000 ? this.field_5007 : this.field_5010;
    }

    private static /* synthetic */ class08247[] n() {
        return new class08247[]{field_4997, field_5001, field_5002, field_4998};
    }

    public boolean m() {
        return this.field_5000 || this.field_5003;
    }

    public boolean v() {
        return this.field_4996;
    }

    public int j() {
        return this.field_5000 ? this.field_5007 : this.field_5006;
    }

    public int U() {
        return this.field_5006;
    }

    public int z() {
        return this.field_5007;
    }

    public boolean u() {
        return this.field_5003;
    }

    public boolean y() {
        return this.field_5005;
    }

    public boolean E() {
        return this.field_5000 || this.field_5005;
    }

    static class08247 N(int n) {
        switch (n) {
            case 1: {
                return field_4998;
            }
            case 2: {
                return field_5002;
            }
            case 3: {
                return field_5001;
            }
        }
        return field_4997;
    }

    public int N() {
        return this.field_4994;
    }

    public boolean W() {
        return this.field_5000 || this.field_5004;
    }

    public boolean R() {
        return this.field_4999;
    }

    static {
        field_4995 = class08247.n();
    }
}

