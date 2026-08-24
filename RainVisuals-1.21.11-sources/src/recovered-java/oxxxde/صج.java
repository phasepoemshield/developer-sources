/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package oxxxde;

import lombok.Generated;

public final class \u0635\u062c
extends Enum<\u0635\u062c> {
    public static final /* enum */ \u0635\u062c FAILURE;
    private static final /* synthetic */ \u0635\u062c[] $VALUES;
    public static final /* enum */ \u0635\u062c SUCCESSFUL;
    public final int id;

    @Generated
    private \u0635\u062c(int id) {
        this.id = id;
    }

    /*
     * WARNING - void declaration
     */
    public static \u0635\u062c fromStatusId(int id) {
        \u0635\u062c[] \u0635\u062cArray = \u0635\u062c.values();
        int n = \u0635\u062cArray.length;
        for (int i = 0; i < n; ++i) {
            void var4_4;
            \u0635\u062c compileStatus = \u0635\u062cArray[i];
            if (compileStatus.id != id) continue;
            return var4_4;
        }
        return null;
    }

    private static /* synthetic */ \u0635\u062c[] $values() {
        \u0635\u062c[] \u0635\u062cArray = new \u0635\u062c[2];
        \u0635\u062cArray[0] = SUCCESSFUL;
        \u0635\u062cArray[1] = FAILURE;
        return \u0635\u062cArray;
    }

    public static \u0635\u062c[] values() {
        return (\u0635\u062c[])$VALUES.clone();
    }

    public static \u0635\u062c valueOf(String name) {
        return Enum.valueOf(\u0635\u062c.class, name);
    }

    static {
        SUCCESSFUL = new \u0635\u062c(1);
        FAILURE = new \u0635\u062c(0);
        $VALUES = \u0635\u062c.$values();
    }
}

