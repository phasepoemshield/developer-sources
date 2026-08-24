/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

public final class \u0636\u0648
extends Enum<\u0636\u0648> {
    private static final /* synthetic */ \u0636\u0648[] $VALUES;
    public final int glId;
    public static final /* enum */ \u0636\u0648 RGB = new \u0636\u0648(6407);
    public static final /* enum */ \u0636\u0648 RGBA = new \u0636\u0648(6408);

    public static \u0636\u0648 valueOf(String name) {
        return Enum.valueOf(\u0636\u0648.class, name);
    }

    private \u0636\u0648(int glId) {
        this.glId = glId;
    }

    private static /* synthetic */ \u0636\u0648[] $values() {
        \u0636\u0648[] \u0636\u0648Array = new \u0636\u0648[2];
        \u0636\u0648Array[0] = RGB;
        \u0636\u0648Array[1] = RGBA;
        return \u0636\u0648Array;
    }

    public static \u0636\u0648[] values() {
        return (\u0636\u0648[])$VALUES.clone();
    }

    static {
        $VALUES = \u0636\u0648.$values();
    }
}

