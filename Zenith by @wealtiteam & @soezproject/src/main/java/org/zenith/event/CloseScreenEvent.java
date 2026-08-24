package org.zenith.event;

import org.zenith.event.Event18;
import org.zenith.core.BotFeatureRegistry;


import net.minecraft.client.gui.screen.Screen;

public class CloseScreenEvent extends Event18 {
   public final Screen screen;

   public CloseScreenEvent(Screen var1) {
      this.screen = var1;
   }

   public Screen screen() {
      return this.screen;
   }
}
