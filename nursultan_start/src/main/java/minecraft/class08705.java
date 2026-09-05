/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.event.Level
 */
package minecraft;

import org.slf4j.event.Level;

class class08705 {
    static final /* synthetic */ int[] N;

    static {
        N = new int[Level.values().length];
        try {
            class08705.N[Level.DEBUG.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class08705.N[Level.WARN.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class08705.N[Level.ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

