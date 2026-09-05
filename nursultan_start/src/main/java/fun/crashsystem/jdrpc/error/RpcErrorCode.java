/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.error;

public enum RpcErrorCode {
    UNKNOWN_ERROR(1000),
    SERVICE_UNAVAILABLE(1001),
    TRANSACTION_ABORTED(1002),
    INVALID_PAYLOAD(4000),
    INVALID_COMMAND(4002),
    INVALID_GUILD(4003),
    INVALID_EVENT(4004),
    INVALID_CHANNEL(4005),
    INVALID_PERMISSIONS(4006),
    INVALID_CLIENT_ID(4007),
    INVALID_ORIGIN(4008),
    INVALID_TOKEN(4009),
    INVALID_USER(4010),
    OAUTH2_ERROR(5000),
    SELECT_CHANNEL_TIMED_OUT(5001),
    GET_GUILD_TIMED_OUT(5002),
    SELECT_VOICE_FORCE_REQUIRED(5003),
    CAPTURE_SHORTCUT_ALREADY_LISTENING(5004);

    private final int code;

    private RpcErrorCode(int n2) {
        this.code = n2;
    }

    public int code() {
        return this.code;
    }

    public static RpcErrorCode fromCode(int n) {
        for (RpcErrorCode rpcErrorCode : RpcErrorCode.values()) {
            if (rpcErrorCode.code != n) continue;
            return rpcErrorCode;
        }
        return UNKNOWN_ERROR;
    }
}

