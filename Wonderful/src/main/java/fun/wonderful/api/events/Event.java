package fun.wonderful.api.events;

import fun.wonderful.api.events.EventInvoker;
import lombok.Generated;

public class Event {
    private boolean cancelled;

    public void cancel() {
        this.cancelled = true;
    }

    public void call() {
        EventInvoker.invokeQuiet(this);
    }

    @Generated
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Generated
    public boolean isCancelled() {
        return this.cancelled;
    }
}