package pulse.events;

import meteordevelopment.orbit.ICancellable;

public abstract class CancellablePulseEvent extends PulseEvent implements ICancellable {
    private boolean cancelled;

    /** Clears cancellation. */
    public void a() {
        setCancelled(false);
    }

    /** Cancels the event. Call sites across Pulse use {@code event.b()}. */
    public void b() {
        setCancelled(true);
    }

    public boolean c() {
        return this.cancelled;
    }

    public void a(boolean z) {
        setCancelled(z);
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean z) {
        this.cancelled = z;
    }
}
