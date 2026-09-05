/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.protocol;

public enum OpCode {
    HANDSHAKE(0),
    FRAME(1),
    CLOSE(2),
    PING(3),
    PONG(4);

    private final int code;

    private OpCode(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static OpCode fromCode(int code) {
        for (OpCode op : OpCode.values()) {
            if (op.code != code) continue;
            return op;
        }
        return null;
    }
}

