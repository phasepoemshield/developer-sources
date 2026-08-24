/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

public final class \u062d\u0622
extends Enum<\u062d\u0622> {
    public static final /* enum */ \u062d\u0622 Vertex = new \u062d\u0622(35633);
    public static final /* enum */ \u062d\u0622 Compute;
    public static final /* enum */ \u062d\u0622 TessellateEvaluation;
    public static final /* enum */ \u062d\u0622 Geometry;
    private static final /* synthetic */ \u062d\u0622[] $VALUES;
    public final int glId;
    public static final /* enum */ \u062d\u0622 Fragment;
    public static final /* enum */ \u062d\u0622 TessellateControl;

    static {
        Fragment = new \u062d\u0622(35632);
        Geometry = new \u062d\u0622(36313);
        TessellateEvaluation = new \u062d\u0622(36487);
        TessellateControl = new \u062d\u0622(36488);
        Compute = new \u062d\u0622(37305);
        $VALUES = \u062d\u0622.$values();
    }

    public static \u062d\u0622[] values() {
        return (\u062d\u0622[])$VALUES.clone();
    }

    private \u062d\u0622(int glId) {
        this.glId = glId;
    }

    public static \u062d\u0622 valueOf(String name) {
        return Enum.valueOf(\u062d\u0622.class, name);
    }

    private static /* synthetic */ \u062d\u0622[] $values() {
        \u062d\u0622[] \u062d\u0622Array = new \u062d\u0622[6];
        \u062d\u0622Array[0] = Vertex;
        \u062d\u0622Array[1] = Fragment;
        \u062d\u0622Array[2] = Geometry;
        \u062d\u0622Array[3] = TessellateEvaluation;
        \u062d\u0622Array[4] = TessellateControl;
        \u062d\u0622Array[5] = Compute;
        return \u062d\u0622Array;
    }
}

