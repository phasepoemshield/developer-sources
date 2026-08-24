/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package oxxxde;

import lombok.Generated;

public final class \u0638\u062d
extends Enum<\u0638\u062d> {
    public static final /* enum */ \u0638\u062d SHADER_STORAGE_BUFFER;
    public static final /* enum */ \u0638\u062d TRANSFORM_FEEDBACK_BUFFER;
    public static final /* enum */ \u0638\u062d TEXTURE_BUFFER;
    public static final /* enum */ \u0638\u062d ELEMENT_ARRAY_BUFFER;
    public static final /* enum */ \u0638\u062d PIXEL_PACK_BUFFER;
    public static final /* enum */ \u0638\u062d COPY_READ_BUFFER;
    public static final /* enum */ \u0638\u062d UNIFORM_BUFFER;
    public static final /* enum */ \u0638\u062d ATOMIC_COUNTER_BUFFER;
    public final int glId;
    public static final /* enum */ \u0638\u062d PARAMETER_BUFFER_ARB;
    public static final /* enum */ \u0638\u062d COPY_WRITE_BUFFER;
    public static final /* enum */ \u0638\u062d PIXEL_UNPACK_BUFFER;
    public static final /* enum */ \u0638\u062d DRAW_INDIRECT_BUFFER;
    private static final /* synthetic */ \u0638\u062d[] $VALUES;
    public static final /* enum */ \u0638\u062d ARRAY_BUFFER;
    public static final /* enum */ \u0638\u062d DISPATCH_INDIRECT_BUFFER;

    public static \u0638\u062d valueOf(String name) {
        return Enum.valueOf(\u0638\u062d.class, name);
    }

    private static /* synthetic */ \u0638\u062d[] $values() {
        \u0638\u062d[] \u0638\u062dArray = new \u0638\u062d[14];
        \u0638\u062dArray[0] = ARRAY_BUFFER;
        \u0638\u062dArray[1] = ELEMENT_ARRAY_BUFFER;
        \u0638\u062dArray[2] = PIXEL_PACK_BUFFER;
        \u0638\u062dArray[3] = PIXEL_UNPACK_BUFFER;
        \u0638\u062dArray[4] = TRANSFORM_FEEDBACK_BUFFER;
        \u0638\u062dArray[5] = UNIFORM_BUFFER;
        \u0638\u062dArray[6] = TEXTURE_BUFFER;
        \u0638\u062dArray[7] = COPY_READ_BUFFER;
        \u0638\u062dArray[8] = COPY_WRITE_BUFFER;
        \u0638\u062dArray[9] = DRAW_INDIRECT_BUFFER;
        \u0638\u062dArray[10] = ATOMIC_COUNTER_BUFFER;
        \u0638\u062dArray[11] = DISPATCH_INDIRECT_BUFFER;
        \u0638\u062dArray[12] = SHADER_STORAGE_BUFFER;
        \u0638\u062dArray[13] = PARAMETER_BUFFER_ARB;
        return \u0638\u062dArray;
    }

    static {
        ARRAY_BUFFER = new \u0638\u062d(34962);
        ELEMENT_ARRAY_BUFFER = new \u0638\u062d(34963);
        PIXEL_PACK_BUFFER = new \u0638\u062d(35051);
        PIXEL_UNPACK_BUFFER = new \u0638\u062d(35052);
        TRANSFORM_FEEDBACK_BUFFER = new \u0638\u062d(35982);
        UNIFORM_BUFFER = new \u0638\u062d(35345);
        TEXTURE_BUFFER = new \u0638\u062d(35882);
        COPY_READ_BUFFER = new \u0638\u062d(36662);
        COPY_WRITE_BUFFER = new \u0638\u062d(36663);
        DRAW_INDIRECT_BUFFER = new \u0638\u062d(36671);
        ATOMIC_COUNTER_BUFFER = new \u0638\u062d(37568);
        DISPATCH_INDIRECT_BUFFER = new \u0638\u062d(37102);
        SHADER_STORAGE_BUFFER = new \u0638\u062d(37074);
        PARAMETER_BUFFER_ARB = new \u0638\u062d(33006);
        $VALUES = \u0638\u062d.$values();
    }

    public static \u0638\u062d[] values() {
        return (\u0638\u062d[])$VALUES.clone();
    }

    @Generated
    private \u0638\u062d(int glId) {
        this.glId = glId;
    }
}

