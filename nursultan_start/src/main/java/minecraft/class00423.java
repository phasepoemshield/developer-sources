/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class00423
extends Enum<class00423> {
    public static final /* enum */ class00423 field_11941 = new class00423("serverbound");
    public static final /* enum */ class00423 field_11942 = new class00423("clientbound");
    private final String field_48613;
    private static final /* synthetic */ class00423[] field_11940;

    private static /* synthetic */ class00423[] L() {
        return new class00423[]{field_11941, field_11942};
    }

    private class00423(String string2) {
        this.field_48613 = string2;
    }

    public static class00423[] values() {
        return (class00423[])field_11940.clone();
    }

    public static class00423 valueOf(String string) {
        return Enum.valueOf(class00423.class, string);
    }

    public String y() {
        return this.field_48613;
    }

    public class00423 N() {
        return this == field_11942 ? field_11941 : field_11942;
    }

    static {
        field_11940 = class00423.L();
    }
}

