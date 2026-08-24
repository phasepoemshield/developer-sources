/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package oxxxde;

import lombok.Generated;

public final class \u0627\u064b
extends Enum<\u0627\u064b> {
    public static final /* enum */ \u0627\u064b STREAM_COPY;
    public static final /* enum */ \u0627\u064b STATIC_READ;
    public static final /* enum */ \u0627\u064b STATIC_COPY;
    public final int glId;
    public static final /* enum */ \u0627\u064b DYNAMIC_DRAW;
    public static final /* enum */ \u0627\u064b STREAM_READ;
    public static final /* enum */ \u0627\u064b STREAM_DRAW;
    public static final /* enum */ \u0627\u064b DYNAMIC_COPY;
    private static final /* synthetic */ \u0627\u064b[] $VALUES;
    public static final /* enum */ \u0627\u064b STATIC_DRAW;
    public static final /* enum */ \u0627\u064b DYNAMIC_READ;

    public static \u0627\u064b valueOf(String name) {
        return Enum.valueOf(\u0627\u064b.class, name);
    }

    private static /* synthetic */ \u0627\u064b[] $values() {
        \u0627\u064b[] \u0627\u064bArray = new \u0627\u064b[9];
        \u0627\u064bArray[0] = STREAM_DRAW;
        \u0627\u064bArray[1] = STATIC_DRAW;
        \u0627\u064bArray[2] = DYNAMIC_DRAW;
        \u0627\u064bArray[3] = STREAM_READ;
        \u0627\u064bArray[4] = STATIC_READ;
        \u0627\u064bArray[5] = DYNAMIC_READ;
        \u0627\u064bArray[6] = STREAM_COPY;
        \u0627\u064bArray[7] = STATIC_COPY;
        \u0627\u064bArray[8] = DYNAMIC_COPY;
        return \u0627\u064bArray;
    }

    @Generated
    private \u0627\u064b(int glId) {
        this.glId = glId;
    }

    static {
        STREAM_DRAW = new \u0627\u064b(35040);
        STATIC_DRAW = new \u0627\u064b(35044);
        DYNAMIC_DRAW = new \u0627\u064b(35048);
        STREAM_READ = new \u0627\u064b(35041);
        STATIC_READ = new \u0627\u064b(35045);
        DYNAMIC_READ = new \u0627\u064b(35049);
        STREAM_COPY = new \u0627\u064b(35042);
        STATIC_COPY = new \u0627\u064b(35046);
        DYNAMIC_COPY = new \u0627\u064b(35050);
        $VALUES = \u0627\u064b.$values();
    }

    public static \u0627\u064b[] values() {
        return (\u0627\u064b[])$VALUES.clone();
    }
}

