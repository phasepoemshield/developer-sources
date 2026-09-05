/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.nio.file.AccessMode;

class class02983 {
    static final /* synthetic */ int[] N;

    static {
        N = new int[AccessMode.values().length];
        try {
            class02983.N[AccessMode.READ.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class02983.N[AccessMode.EXECUTE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class02983.N[AccessMode.WRITE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

