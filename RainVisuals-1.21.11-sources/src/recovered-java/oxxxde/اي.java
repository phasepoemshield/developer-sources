/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u0628\u0652;
import oxxxde.\u062a\u0642;

public final class \u0627\u064a
extends Enum<\u0627\u064a> {
    public final \u0628\u0652 gifDecompiler;
    public static final /* enum */ \u0627\u064a DELTAS = new \u0627\u064a(\u062a\u0642::decompileDeltas);
    private static final /* synthetic */ \u0627\u064a[] $VALUES;
    public static final /* enum */ \u0627\u064a FULL = new \u0627\u064a(\u062a\u0642::decompileFull);

    public static \u0627\u064a valueOf(String name) {
        return Enum.valueOf(\u0627\u064a.class, name);
    }

    private static /* synthetic */ \u0627\u064a[] $values() {
        \u0627\u064a[] \u0627\u064aArray = new \u0627\u064a[2];
        \u0627\u064aArray[0] = DELTAS;
        \u0627\u064aArray[1] = FULL;
        return \u0627\u064aArray;
    }

    private \u0627\u064a(\u0628\u0652 gifDecompiler) {
        this.gifDecompiler = gifDecompiler;
    }

    static {
        $VALUES = \u0627\u064a.$values();
    }

    public static \u0627\u064a[] values() {
        return (\u0627\u064a[])$VALUES.clone();
    }
}

