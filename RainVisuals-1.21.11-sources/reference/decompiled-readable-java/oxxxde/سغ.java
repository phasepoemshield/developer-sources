/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package oxxxde;

import lombok.Generated;

public final class \u0633\u063a
extends Enum<\u0633\u063a> {
    private static final /* synthetic */ \u0633\u063a[] $VALUES;
    public final int bytes;
    public static final /* enum */ \u0633\u063a INT;
    public final int glId;
    public static final /* enum */ \u0633\u063a SHORT;

    public static \u0633\u063a[] values() {
        return (\u0633\u063a[])$VALUES.clone();
    }

    @Generated
    private \u0633\u063a(int bytes, int glId) {
        this.bytes = bytes;
        this.glId = glId;
    }

    public static \u0633\u063a valueOf(String name) {
        return Enum.valueOf(\u0633\u063a.class, name);
    }

    public static \u0633\u063a smallestFor(int i) {
        return (i & 0xFFFF0000) != 0 ? INT : SHORT;
    }

    static {
        SHORT = new \u0633\u063a(2, 5123);
        INT = new \u0633\u063a(4, 5125);
        $VALUES = \u0633\u063a.$values();
    }

    private static /* synthetic */ \u0633\u063a[] $values() {
        \u0633\u063a[] \u0633\u063aArray = new \u0633\u063a[2];
        \u0633\u063aArray[0] = SHORT;
        \u0633\u063aArray[1] = INT;
        return \u0633\u063aArray;
    }
}

