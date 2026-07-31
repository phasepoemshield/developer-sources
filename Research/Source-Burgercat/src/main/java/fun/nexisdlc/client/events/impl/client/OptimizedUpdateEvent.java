package fun.nexisdlc.client.events.impl.client;

public class OptimizedUpdateEvent {

    private final long deltaMs;

    public OptimizedUpdateEvent(long deltaMs) {
        this.deltaMs = deltaMs;
    }

    public long getDeltaMs() {
        return deltaMs;
    }
}