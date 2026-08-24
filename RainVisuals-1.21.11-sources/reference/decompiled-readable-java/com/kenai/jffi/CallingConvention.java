/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

public final class CallingConvention
extends Enum<CallingConvention> {
    public static final /* enum */ CallingConvention STDCALL;
    public static final /* enum */ CallingConvention DEFAULT;
    private static final /* synthetic */ CallingConvention[] $VALUES;

    public static CallingConvention valueOf(String name) {
        return Enum.valueOf(CallingConvention.class, name);
    }

    private static /* synthetic */ CallingConvention[] $values() {
        CallingConvention[] callingConventionArray = new CallingConvention[2];
        callingConventionArray[0] = DEFAULT;
        callingConventionArray[1] = STDCALL;
        return callingConventionArray;
    }

    public static CallingConvention[] values() {
        return (CallingConvention[])$VALUES.clone();
    }

    static {
        DEFAULT = new CallingConvention();
        STDCALL = new CallingConvention();
        $VALUES = CallingConvention.$values();
    }
}

