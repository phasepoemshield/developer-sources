/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Locale;

public final class class03752
extends Enum<class03752> {
    public static final /* enum */ class03752 field_46064 = new class03752("chat");
    public static final /* enum */ class03752 field_46065 = new class03752("skin");
    public static final /* enum */ class03752 field_46066 = new class03752("username");
    private final String field_46067;
    private static final /* synthetic */ class03752[] field_46068;

    private class03752(String string2) {
        this.field_46067 = string2.toUpperCase(Locale.ROOT);
    }

    static {
        field_46068 = class03752.y();
    }

    public static class03752[] values() {
        return (class03752[])field_46068.clone();
    }

    public static class03752 valueOf(String string) {
        return Enum.valueOf(class03752.class, string);
    }

    private static /* synthetic */ class03752[] y() {
        return new class03752[]{field_46064, field_46065, field_46066};
    }

    public String N() {
        return this.field_46067;
    }
}

