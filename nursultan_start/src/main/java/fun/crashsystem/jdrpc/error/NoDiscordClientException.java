/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.error;

import fun.crashsystem.jdrpc.error.DiscordIPCException;

public class NoDiscordClientException
extends DiscordIPCException {
    public NoDiscordClientException() {
        super("No Discord client found");
    }

    public NoDiscordClientException(String string) {
        super(string);
    }
}

