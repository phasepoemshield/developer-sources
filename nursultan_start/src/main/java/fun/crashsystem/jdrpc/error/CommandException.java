/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.error;

import fun.crashsystem.jdrpc.error.DiscordIPCException;
import fun.crashsystem.jdrpc.error.RpcErrorCode;

public class CommandException
extends DiscordIPCException {
    private final RpcErrorCode errorCode;

    public CommandException(RpcErrorCode rpcErrorCode, String string) {
        super(string);
        this.errorCode = rpcErrorCode;
    }

    public RpcErrorCode errorCode() {
        return this.errorCode;
    }
}

