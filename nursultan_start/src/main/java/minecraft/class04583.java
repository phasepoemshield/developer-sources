/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import org.jspecify.annotations.Nullable;

public class class04583 {
    private static byte @Nullable [] N;

    public static void y() {
        if (N != null) {
            N = null;
            try {
                System.gc();
                System.gc();
                System.gc();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    public static void N() {
        N = new byte[0xA00000];
    }
}

