/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.error;

import fun.crashsystem.jdrpc.error.DiscordIPCException;

public class ConnectionException
extends DiscordIPCException {
    public ConnectionException(String message) {
        super(message);
    }

    public ConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}

