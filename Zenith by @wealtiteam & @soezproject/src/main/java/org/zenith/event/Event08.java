package org.zenith.event;

import org.zenith.core.BotFeatureRegistry;

import com.darkmagician6.eventapi.events.Event;
import com.darkmagician6.eventapi.events.Typed;

public abstract class Event08 implements Event, Typed {
   public final byte byteField;

   protected Event08(byte var1) {
      this.byteField = var1;
   }

   public byte getType() {
      return this.byteField;
   }
}
