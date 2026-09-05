/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class00140
extends Enum<class00140> {
    public static final /* enum */ class00140 field_21858 = new class00140("front");
    public static final /* enum */ class00140 field_21859 = new class00140("side");
    private final String field_21860;
    private static final /* synthetic */ class00140[] field_21861;

    private class00140(String string2) {
        this.field_21860 = string2;
    }

    public static class00140[] values() {
        return (class00140[])field_21861.clone();
    }

    public static class00140 valueOf(String string) {
        return Enum.valueOf(class00140.class, string);
    }

    private static /* synthetic */ class00140[] y() {
        return new class00140[]{field_21858, field_21859};
    }

    public boolean N() {
        return this == field_21859;
    }

    public static class00140 N(String string) {
        for (class00140 class001402 : class00140.values()) {
            if (!class001402.field_21860.equals(string)) continue;
            return class001402;
        }
        throw new IllegalArgumentException("Invalid gui light: " + string);
    }

    static {
        field_21861 = class00140.y();
    }
}

