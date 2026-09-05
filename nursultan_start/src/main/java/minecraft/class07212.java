/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class07212
extends Enum<class07212> {
    public static final /* enum */ class07212 field_11056 = new class07212(1, "Towards positive");
    public static final /* enum */ class07212 field_11060 = new class07212(-1, "Towards negative");
    private final int field_11059;
    private final String field_11057;
    private static final /* synthetic */ class07212[] field_11058;

    public class07212 L() {
        return this == field_11056 ? field_11060 : field_11056;
    }

    private class07212(int n2, String string2) {
        this.field_11059 = n2;
        this.field_11057 = string2;
    }

    public String toString() {
        return this.field_11057;
    }

    public static class07212[] values() {
        return (class07212[])field_11058.clone();
    }

    public static class07212 valueOf(String string) {
        return Enum.valueOf(class07212.class, string);
    }

    private static /* synthetic */ class07212[] u() {
        return new class07212[]{field_11056, field_11060};
    }

    public String y() {
        return this.field_11057;
    }

    public int N() {
        return this.field_11059;
    }

    static {
        field_11058 = class07212.u();
    }
}

