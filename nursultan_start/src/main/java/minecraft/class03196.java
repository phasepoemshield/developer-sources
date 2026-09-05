/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import jdk.jfr.RecordingState;

public class class03196 {
    public static final /* synthetic */ int[] N;

    static {
        N = new int[RecordingState.values().length];
        try {
            class03196.N[RecordingState.STOPPED.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class03196.N[RecordingState.NEW.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class03196.N[RecordingState.DELAYED.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class03196.N[RecordingState.RUNNING.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class03196.N[RecordingState.CLOSED.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

