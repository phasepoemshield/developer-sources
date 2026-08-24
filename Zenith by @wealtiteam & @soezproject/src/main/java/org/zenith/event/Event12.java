package org.zenith.event;

import org.zenith.module.Module;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;

import com.darkmagician6.eventapi.events.Event;

public class Event12 implements Event {
   public final Module module;
   public final boolean boolean48;

   public Event12(Module var1, boolean var2) {
      this.module = var1;
      this.boolean48 = var2;
   }

   public Module getModule() {
      return this.module;
   }

   public boolean isEnabled() {
      return this.boolean48;
   }
}
