/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package eu.donyka.discord.enums;

import lombok.Generated;

public final class OpCode
extends Enum<OpCode> {
    public static final /* enum */ OpCode FRAME;
    private static final /* synthetic */ OpCode[] $VALUES;
    public static final /* enum */ OpCode PING;
    public static final /* enum */ OpCode PONG;
    private final int id;
    public static final /* enum */ OpCode HANDSHAKE;
    public static final /* enum */ OpCode CLOSE;

    public static OpCode valueOf(String name) {
        return Enum.valueOf(OpCode.class, name);
    }

    public static OpCode[] values() {
        return (OpCode[])$VALUES.clone();
    }

    private OpCode(int id) {
        this.id = id;
    }

    @Generated
    public int getId() {
        return this.id;
    }

    static {
        HANDSHAKE = new OpCode(0);
        FRAME = new OpCode(1);
        CLOSE = new OpCode(2);
        PING = new OpCode(3);
        PONG = new OpCode(4);
        OpCode[] opCodeArray = new OpCode[5];
        opCodeArray[0] = HANDSHAKE;
        opCodeArray[1] = FRAME;
        opCodeArray[2] = CLOSE;
        opCodeArray[3] = PING;
        opCodeArray[4] = PONG;
        $VALUES = opCodeArray;
    }
}

