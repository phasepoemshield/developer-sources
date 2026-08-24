/*
 * Decompiled with CFR 0.152.
 */
package eu.donyka.discord.enums;

public final class RPCState
extends Enum<RPCState> {
    private static final /* synthetic */ RPCState[] $VALUES;
    public static final /* enum */ RPCState SENT_HANDSHAKE;
    public static final /* enum */ RPCState CONNECTED;
    public static final /* enum */ RPCState DISCONNECTED;

    public static RPCState[] values() {
        return (RPCState[])$VALUES.clone();
    }

    static {
        DISCONNECTED = new RPCState();
        SENT_HANDSHAKE = new RPCState();
        CONNECTED = new RPCState();
        RPCState[] rPCStateArray = new RPCState[3];
        rPCStateArray[0] = DISCONNECTED;
        rPCStateArray[1] = SENT_HANDSHAKE;
        rPCStateArray[2] = CONNECTED;
        $VALUES = rPCStateArray;
    }

    public static RPCState valueOf(String name) {
        return Enum.valueOf(RPCState.class, name);
    }
}

