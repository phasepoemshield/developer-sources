/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jnr.x86asm;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@Deprecated
public final class SEGMENT
extends Enum<SEGMENT> {
    public static final /* enum */ SEGMENT SEGMENT_SS;
    public static final /* enum */ SEGMENT SEGMENT_GS;
    private final int prefix;
    public static final /* enum */ SEGMENT SEGMENT_FS;
    private static final /* synthetic */ SEGMENT[] $VALUES;
    public static final /* enum */ SEGMENT SEGMENT_NONE;
    public static final /* enum */ SEGMENT SEGMENT_ES;
    public static final /* enum */ SEGMENT SEGMENT_CS;
    public static final /* enum */ SEGMENT SEGMENT_DS;

    public final int prefix() {
        return this.prefix;
    }

    static {
        SEGMENT_NONE = new SEGMENT(0);
        SEGMENT_CS = new SEGMENT(46);
        SEGMENT_SS = new SEGMENT(54);
        SEGMENT_DS = new SEGMENT(62);
        SEGMENT_ES = new SEGMENT(38);
        SEGMENT_FS = new SEGMENT(100);
        SEGMENT_GS = new SEGMENT(100);
        SEGMENT[] sEGMENTArray = new SEGMENT[7];
        sEGMENTArray[0] = SEGMENT_NONE;
        sEGMENTArray[1] = SEGMENT_CS;
        sEGMENTArray[2] = SEGMENT_SS;
        sEGMENTArray[3] = SEGMENT_DS;
        sEGMENTArray[4] = SEGMENT_ES;
        sEGMENTArray[5] = SEGMENT_FS;
        sEGMENTArray[6] = SEGMENT_GS;
        $VALUES = sEGMENTArray;
    }

    public static SEGMENT[] values() {
        return (SEGMENT[])$VALUES.clone();
    }

    private SEGMENT(int prefix) {
        this.prefix = prefix;
    }

    public static SEGMENT valueOf(String name) {
        return Enum.valueOf(SEGMENT.class, name);
    }
}

