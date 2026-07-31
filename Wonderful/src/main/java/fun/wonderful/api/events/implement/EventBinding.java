package fun.wonderful.api.events.implement;

import fun.wonderful.api.events.Event;
import lombok.Generated;

public class EventBinding
extends Event {
    private final int key;
    private final BindType bindType;

    public boolean isKeyDown(int button) {
        return this.key == button;
    }

    @Generated
    public EventBinding(int key, BindType bindType) {
        this.key = key;
        this.bindType = bindType;
    }

    @Generated
    public int getKey() {
        return this.key;
    }

    @Generated
    public BindType getBindType() {
        return this.bindType;
    }

    public static enum BindType {
        KEYBOARD,
        MOUSE;

    }
}