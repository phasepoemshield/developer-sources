/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.activity;

public enum ActivityType {
    PLAYING(0),
    STREAMING(1),
    LISTENING(2),
    WATCHING(3),
    COMPETING(5);

    private final int value;

    private ActivityType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public static ActivityType fromValue(int value) {
        for (ActivityType t : ActivityType.values()) {
            if (t.value != value) continue;
            return t;
        }
        throw new IllegalArgumentException("Unknown activity type: " + value);
    }
}

