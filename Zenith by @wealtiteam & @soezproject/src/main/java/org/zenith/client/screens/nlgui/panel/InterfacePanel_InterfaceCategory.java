package org.zenith.client.screens.nlgui.panel;

import org.zenith.client.screens.nlgui.panel.api.Panel;

import org.zenith.core.EmotePlayback;













public enum InterfacePanel_InterfaceCategory {
   THEME("Theme"),
   HUD("Hud");

   final String name;

   private InterfacePanel_InterfaceCategory(String var3) {
      this.name = var3;
   }

   public String getName() {
      return this.name;
   }
}
