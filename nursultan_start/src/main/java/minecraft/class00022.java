/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import org.jspecify.annotations.Nullable;

public final class class00022
extends Enum<class00022> {
    public static final /* enum */ class00022 field_5474 = new class00022("file");
    public static final /* enum */ class00022 field_5473 = new class00022("event");
    private final String field_5472;
    private static final /* synthetic */ class00022[] field_5471;

    private class00022(String string2) {
        this.field_5472 = string2;
    }

    public static class00022[] values() {
        return (class00022[])field_5471.clone();
    }

    public static class00022 valueOf(String string) {
        return Enum.valueOf(class00022.class, string);
    }

    private static /* synthetic */ class00022[] N() {
        return new class00022[]{field_5474, field_5473};
    }

    public static @Nullable class00022 N(String string) {
        for (class00022 class000222 : class00022.values()) {
            if (!class000222.field_5472.equals(string)) continue;
            return class000222;
        }
        return null;
    }

    static {
        field_5471 = class00022.N();
    }
}

