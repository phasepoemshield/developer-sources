package org.zenith.core;

import org.zenith.event.Event14;
import org.zenith.event.EventUpdateHealth2;

class HudInfoBoxPrimaryState {
   public final String string19;
   public final boolean boolean61;

   public HudInfoBoxPrimaryState(String var1, boolean var2) {
      this.string19 = var1;
      this.boolean61 = var2;
   }

   public static HudInfoBoxPrimaryState Event14(String var0) {
      return new HudInfoBoxPrimaryState(var0, false);
   }

   public static HudInfoBoxPrimaryState EventUpdateHealth2(String var0) {
      return new HudInfoBoxPrimaryState(var0, true);
   }
}
