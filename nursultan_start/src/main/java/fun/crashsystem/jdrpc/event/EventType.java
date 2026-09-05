/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.event;

public enum EventType {
    READY("READY", false),
    ERROR("ERROR", false),
    GUILD_STATUS("GUILD_STATUS", true),
    GUILD_CREATE("GUILD_CREATE", true),
    CHANNEL_CREATE("CHANNEL_CREATE", true),
    VOICE_CHANNEL_SELECT("VOICE_CHANNEL_SELECT", true),
    VOICE_STATE_CREATE("VOICE_STATE_CREATE", true),
    VOICE_STATE_UPDATE("VOICE_STATE_UPDATE", true),
    VOICE_STATE_DELETE("VOICE_STATE_DELETE", true),
    VOICE_SETTINGS_UPDATE("VOICE_SETTINGS_UPDATE", true),
    VOICE_CONNECTION_STATUS("VOICE_CONNECTION_STATUS", true),
    SPEAKING_START("SPEAKING_START", true),
    SPEAKING_STOP("SPEAKING_STOP", true),
    MESSAGE_CREATE("MESSAGE_CREATE", true),
    MESSAGE_UPDATE("MESSAGE_UPDATE", true),
    MESSAGE_DELETE("MESSAGE_DELETE", true),
    NOTIFICATION_CREATE("NOTIFICATION_CREATE", true),
    ACTIVITY_JOIN("ACTIVITY_JOIN", true),
    ACTIVITY_SPECTATE("ACTIVITY_SPECTATE", true),
    ACTIVITY_JOIN_REQUEST("ACTIVITY_JOIN_REQUEST", true);

    private final String value;
    private final boolean subscribable;

    private EventType(String string2, boolean bl) {
        this.value = string2;
        this.subscribable = bl;
    }

    public String value() {
        return this.value;
    }

    public boolean subscribable() {
        return this.subscribable;
    }

    public static EventType fromValue(String string) {
        for (EventType eventType : EventType.values()) {
            if (!eventType.value.equals(string)) continue;
            return eventType;
        }
        return null;
    }
}

