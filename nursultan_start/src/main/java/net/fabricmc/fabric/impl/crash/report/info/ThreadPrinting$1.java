/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.impl.crash.report.info;

class ThreadPrinting$1 {
    static final /* synthetic */ int[] $SwitchMap$java$lang$Thread$State;

    static {
        $SwitchMap$java$lang$Thread$State = new int[Thread.State.values().length];
        try {
            ThreadPrinting$1.$SwitchMap$java$lang$Thread$State[Thread.State.BLOCKED.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ThreadPrinting$1.$SwitchMap$java$lang$Thread$State[Thread.State.WAITING.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ThreadPrinting$1.$SwitchMap$java$lang$Thread$State[Thread.State.TIMED_WAITING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

