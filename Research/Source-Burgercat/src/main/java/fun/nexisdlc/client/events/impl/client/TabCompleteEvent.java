package fun.nexisdlc.client.events.impl.client;

import fun.nexisdlc.client.events.api.Event;

public class TabCompleteEvent extends Event {
    public final String prefix;
    public String[] completions;

    public TabCompleteEvent(String prefix) {
        this.prefix = prefix;
        this.completions = null;
    }
}