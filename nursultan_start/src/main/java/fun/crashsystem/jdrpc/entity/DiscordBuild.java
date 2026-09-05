/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.entity;

public enum DiscordBuild {
    STABLE("discord.com"),
    PTB("ptb.discord.com"),
    CANARY("canary.discord.com"),
    DEVELOPMENT(null),
    ANY(null);

    private final String endpoint;

    public String endpoint() {
        return this.endpoint;
    }

    private DiscordBuild(String endpoint) {
        this.endpoint = endpoint;
    }

    public static DiscordBuild fromEndpoint(String endpoint) {
        if (endpoint == null) {
            return ANY;
        }
        for (DiscordBuild b : DiscordBuild.values()) {
            if (b.endpoint == null || !endpoint.contains(b.endpoint)) continue;
            return b;
        }
        if (endpoint.contains("canary")) {
            return CANARY;
        }
        if (endpoint.contains("ptb")) {
            return PTB;
        }
        if (endpoint.contains("discord")) {
            return STABLE;
        }
        return ANY;
    }
}

