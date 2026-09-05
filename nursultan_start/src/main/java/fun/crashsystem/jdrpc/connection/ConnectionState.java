/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.entity.DiscordBuild
 *  fun.crashsystem.jdrpc.entity.User
 */
package fun.crashsystem.jdrpc.connection;

import fun.crashsystem.jdrpc.connection.FailureInfo;
import fun.crashsystem.jdrpc.entity.DiscordBuild;
import fun.crashsystem.jdrpc.entity.User;

/*
 * Uses 'sealed' constructs - enablewith --sealed true
 */
public interface ConnectionState {

    public record Connected(User user, DiscordBuild build) implements ConnectionState
    {
    }

    public record Connecting() implements ConnectionState
    {
    }

    public record Disconnected() implements ConnectionState
    {
    }

    public record Reconnecting(int attempt, FailureInfo failure) implements ConnectionState
    {
    }
}

