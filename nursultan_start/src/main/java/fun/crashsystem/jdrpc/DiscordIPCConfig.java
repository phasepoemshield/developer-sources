/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.entity.DiscordBuild
 */
package fun.crashsystem.jdrpc;

import fun.crashsystem.jdrpc.entity.DiscordBuild;
import java.util.List;

public final class DiscordIPCConfig {
    private final long clientId;
    private final List<DiscordBuild> preferredBuilds;
    private final boolean reconnect;
    private final int maxReconnectAttempts;
    private final long reconnectBaseDelayMs;
    private final long reconnectMaxDelayMs;
    private final long commandTimeoutMs;
    private final int maxCommandsPerSecond;

    DiscordIPCConfig(long clientId, List<DiscordBuild> preferredBuilds, boolean reconnect, int maxReconnectAttempts, long reconnectBaseDelayMs, long reconnectMaxDelayMs, long commandTimeoutMs, int maxCommandsPerSecond) {
        this.clientId = clientId;
        this.preferredBuilds = preferredBuilds;
        this.reconnect = reconnect;
        this.maxReconnectAttempts = maxReconnectAttempts;
        this.reconnectBaseDelayMs = reconnectBaseDelayMs;
        this.reconnectMaxDelayMs = reconnectMaxDelayMs;
        this.commandTimeoutMs = commandTimeoutMs;
        this.maxCommandsPerSecond = maxCommandsPerSecond;
    }

    public static DiscordIPCConfigBuilder builder() {
        return new DiscordIPCConfigBuilder();
    }

    public long clientId() {
        return this.clientId;
    }

    public List<DiscordBuild> preferredBuilds() {
        return this.preferredBuilds;
    }

    public static boolean $default$reconnect() {
        return true;
    }

    public long commandTimeoutMs() {
        return this.commandTimeoutMs;
    }

    public boolean reconnect() {
        return this.reconnect;
    }

    public static int $default$maxCommandsPerSecond() {
        return 0;
    }

    public static int $default$maxReconnectAttempts() {
        return 0;
    }

    public static long $default$reconnectBaseDelayMs() {
        return 1000L;
    }

    public static long $default$reconnectMaxDelayMs() {
        return 60000L;
    }

    public int maxReconnectAttempts() {
        return this.maxReconnectAttempts;
    }

    public long reconnectMaxDelayMs() {
        return this.reconnectMaxDelayMs;
    }

    public int maxCommandsPerSecond() {
        return this.maxCommandsPerSecond;
    }

    public static long $default$commandTimeoutMs() {
        return 10000L;
    }

    public long reconnectBaseDelayMs() {
        return this.reconnectBaseDelayMs;
    }

    public static List<DiscordBuild> $default$preferredBuilds() {
        return List.of(DiscordBuild.STABLE, DiscordBuild.PTB, DiscordBuild.CANARY);
    }

    public class DiscordIPCConfigBuilder {
        private long clientId;
        private boolean preferredBuilds$set;
        private List<DiscordBuild> preferredBuilds$value;
        private boolean reconnect$set;
        private boolean reconnect$value;
        private boolean maxReconnectAttempts$set;
        private int maxReconnectAttempts$value;
        private boolean reconnectBaseDelayMs$set;
        private long reconnectBaseDelayMs$value;
        private boolean reconnectMaxDelayMs$set;
        private long reconnectMaxDelayMs$value;
        private boolean commandTimeoutMs$set;
        private long commandTimeoutMs$value;
        private boolean maxCommandsPerSecond$set;
        private int maxCommandsPerSecond$value;

        DiscordIPCConfigBuilder() {
        }

        public String toString() {
            return "DiscordIPCConfig.DiscordIPCConfigBuilder(clientId=" + this.clientId + ", preferredBuilds$value=" + String.valueOf(this.preferredBuilds$value) + ", reconnect$value=" + this.reconnect$value + ", maxReconnectAttempts$value=" + this.maxReconnectAttempts$value + ", reconnectBaseDelayMs$value=" + this.reconnectBaseDelayMs$value + ", reconnectMaxDelayMs$value=" + this.reconnectMaxDelayMs$value + ", commandTimeoutMs$value=" + this.commandTimeoutMs$value + ", maxCommandsPerSecond$value=" + this.maxCommandsPerSecond$value + ")";
        }

        public DiscordIPCConfig build() {
            List<DiscordBuild> preferredBuilds$value = this.preferredBuilds$value;
            if (!this.preferredBuilds$set) {
                preferredBuilds$value = DiscordIPCConfig.$default$preferredBuilds();
            }
            boolean reconnect$value = this.reconnect$value;
            if (!this.reconnect$set) {
                reconnect$value = DiscordIPCConfig.$default$reconnect();
            }
            int maxReconnectAttempts$value = this.maxReconnectAttempts$value;
            if (!this.maxReconnectAttempts$set) {
                maxReconnectAttempts$value = DiscordIPCConfig.$default$maxReconnectAttempts();
            }
            long reconnectBaseDelayMs$value = this.reconnectBaseDelayMs$value;
            if (!this.reconnectBaseDelayMs$set) {
                reconnectBaseDelayMs$value = DiscordIPCConfig.$default$reconnectBaseDelayMs();
            }
            long reconnectMaxDelayMs$value = this.reconnectMaxDelayMs$value;
            if (!this.reconnectMaxDelayMs$set) {
                reconnectMaxDelayMs$value = DiscordIPCConfig.$default$reconnectMaxDelayMs();
            }
            long commandTimeoutMs$value = this.commandTimeoutMs$value;
            if (!this.commandTimeoutMs$set) {
                commandTimeoutMs$value = DiscordIPCConfig.$default$commandTimeoutMs();
            }
            int maxCommandsPerSecond$value = this.maxCommandsPerSecond$value;
            if (!this.maxCommandsPerSecond$set) {
                maxCommandsPerSecond$value = DiscordIPCConfig.$default$maxCommandsPerSecond();
            }
            return new DiscordIPCConfig(this.clientId, preferredBuilds$value, reconnect$value, maxReconnectAttempts$value, reconnectBaseDelayMs$value, reconnectMaxDelayMs$value, commandTimeoutMs$value, maxCommandsPerSecond$value);
        }

        public DiscordIPCConfigBuilder clientId(long clientId) {
            this.clientId = clientId;
            return this;
        }

        public DiscordIPCConfigBuilder preferredBuilds(List<DiscordBuild> preferredBuilds) {
            this.preferredBuilds$value = preferredBuilds;
            this.preferredBuilds$set = true;
            return this;
        }

        public DiscordIPCConfigBuilder commandTimeoutMs(long commandTimeoutMs) {
            this.commandTimeoutMs$value = commandTimeoutMs;
            this.commandTimeoutMs$set = true;
            return this;
        }

        public DiscordIPCConfigBuilder reconnect(boolean reconnect) {
            this.reconnect$value = reconnect;
            this.reconnect$set = true;
            return this;
        }

        public DiscordIPCConfigBuilder maxReconnectAttempts(int maxReconnectAttempts) {
            this.maxReconnectAttempts$value = maxReconnectAttempts;
            this.maxReconnectAttempts$set = true;
            return this;
        }

        public DiscordIPCConfigBuilder reconnectMaxDelayMs(long reconnectMaxDelayMs) {
            this.reconnectMaxDelayMs$value = reconnectMaxDelayMs;
            this.reconnectMaxDelayMs$set = true;
            return this;
        }

        public DiscordIPCConfigBuilder maxCommandsPerSecond(int maxCommandsPerSecond) {
            this.maxCommandsPerSecond$value = maxCommandsPerSecond;
            this.maxCommandsPerSecond$set = true;
            return this;
        }

        public DiscordIPCConfigBuilder reconnectBaseDelayMs(long reconnectBaseDelayMs) {
            this.reconnectBaseDelayMs$value = reconnectBaseDelayMs;
            this.reconnectBaseDelayMs$set = true;
            return this;
        }
    }
}

