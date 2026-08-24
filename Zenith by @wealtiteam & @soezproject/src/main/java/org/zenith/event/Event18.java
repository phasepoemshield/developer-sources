package org.zenith.event;

import org.zenith.core.BotFeatureRegistry;

import com.darkmagician6.eventapi.events.Cancellable;
import com.darkmagician6.eventapi.events.Event;

public abstract class Event18 implements Cancellable, Event {
   public boolean cancelled;

   protected Event18() {
   }

   public boolean isCancelled() {
      return this.cancelled;
   }

   public void setCancelled(boolean var1) {
      this.cancelled = var1;
   }

   public void cancel() {
      this.cancelled = true;
   }
}
