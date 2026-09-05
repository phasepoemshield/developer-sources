/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09867
extends Enum<class09867> {
    public static final /* enum */ class09867 POINTER_MOVE = new class09867(true, true);
    public static final /* enum */ class09867 POINTER_DOWN = new class09867(true, true);
    public static final /* enum */ class09867 POINTER_UP = new class09867(true, true);
    public static final /* enum */ class09867 CLICK = new class09867(true, true);
    public static final /* enum */ class09867 WHEEL = new class09867(true, true);
    public static final /* enum */ class09867 KEY_DOWN = new class09867(true, true);
    public static final /* enum */ class09867 KEY_UP = new class09867(true, true);
    public static final /* enum */ class09867 TEXT_INPUT = new class09867(true, true);
    public static final /* enum */ class09867 INPUT = new class09867(true, true);
    public static final /* enum */ class09867 CHANGE = new class09867(true, true);
    public static final /* enum */ class09867 FOCUS = new class09867(false, false);
    public static final /* enum */ class09867 BLUR = new class09867(false, false);
    public static final /* enum */ class09867 HOVER_ENTER = new class09867(false, false);
    public static final /* enum */ class09867 HOVER_LEAVE = new class09867(false, false);
    public static final /* enum */ class09867 TRANSITION_END = new class09867(false, false);
    private final boolean bubbles;
    private final boolean cancelable;
    private static final /* synthetic */ class09867[] $VALUES;

    private static /* synthetic */ class09867[] L() {
        return new class09867[]{POINTER_MOVE, POINTER_DOWN, POINTER_UP, CLICK, WHEEL, KEY_DOWN, KEY_UP, TEXT_INPUT, INPUT, CHANGE, FOCUS, BLUR, HOVER_ENTER, HOVER_LEAVE, TRANSITION_END};
    }

    private class09867(boolean bl, boolean bl2) {
        this.bubbles = bl;
        this.cancelable = bl2;
    }

    static {
        $VALUES = class09867.L();
    }

    public static class09867[] values() {
        return (class09867[])$VALUES.clone();
    }

    public static class09867 valueOf(String string) {
        return Enum.valueOf(class09867.class, string);
    }

    public boolean y() {
        return this.cancelable;
    }

    public boolean N() {
        return this.bubbles;
    }
}

