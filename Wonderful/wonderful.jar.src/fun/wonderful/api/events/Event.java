package fun.wonderful.api.events;

import fun.wonderful.api.events.EventInvoker;
import java.lang.reflect.InvocationTargetException;
import lombok.Generated;

public class Event {
    private boolean cancelled;

    public void cancel() {
        this.cancelled = true;
    }

    public void call() {
        try {
            EventInvoker.invoke(this);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
        }
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