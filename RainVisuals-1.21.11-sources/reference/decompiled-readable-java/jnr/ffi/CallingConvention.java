/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi;

public final class CallingConvention
extends Enum<CallingConvention> {
    public static final /* enum */ CallingConvention DEFAULT = new CallingConvention();
    private static final /* synthetic */ CallingConvention[] $VALUES;
    public static final /* enum */ CallingConvention STDCALL = new CallingConvention();

    public static CallingConvention valueOf(String name) {
        return Enum.valueOf(CallingConvention.class, name);
    }

    public static CallingConvention[] values() {
        return (CallingConvention[])$VALUES.clone();
    }

    static {
        $VALUES = CallingConvention.$values();
    }

    private static /* synthetic */ CallingConvention[] $values() {
        CallingConvention[] callingConventionArray = new CallingConvention[2];
        callingConventionArray[0] = DEFAULT;
        callingConventionArray[1] = STDCALL;
        return callingConventionArray;
    }
}

