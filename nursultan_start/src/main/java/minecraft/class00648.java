/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class00648
extends Enum<class00648> {
    public static final /* enum */ class00648 field_20590 = new class00648("handshake");
    public static final /* enum */ class00648 field_20591 = new class00648("play");
    public static final /* enum */ class00648 field_20592 = new class00648("status");
    public static final /* enum */ class00648 field_20593 = new class00648("login");
    public static final /* enum */ class00648 field_45671 = new class00648("configuration");
    private final String field_20594;
    private static final /* synthetic */ class00648[] field_11694;

    private class00648(String string2) {
        this.field_20594 = string2;
    }

    public static class00648[] values() {
        return (class00648[])field_11694.clone();
    }

    public static class00648 valueOf(String string) {
        return Enum.valueOf(class00648.class, string);
    }

    private static /* synthetic */ class00648[] y() {
        return new class00648[]{field_20590, field_20591, field_20592, field_20593, field_45671};
    }

    public String N() {
        return this.field_20594;
    }

    static {
        field_11694 = class00648.y();
    }
}

