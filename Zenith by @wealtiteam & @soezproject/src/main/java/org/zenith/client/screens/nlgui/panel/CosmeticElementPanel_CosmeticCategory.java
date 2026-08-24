package org.zenith.client.screens.nlgui.panel;

import org.zenith.client.screens.nlgui.panel.api.Panel;

import org.zenith.addon.api.Settings;
import org.zenith.core.EmotePlayback;














public enum CosmeticElementPanel_CosmeticCategory {
   HEAD("Head"),
   MODELS("Models"),
   WEAPONS("Weapons"),
   PETS("Pets"),
   SETTINGS("Settings");

   final String name;

   private CosmeticElementPanel_CosmeticCategory(String var3) {
      this.name = var3;
   }

   public String getName() {
      return this.name;
   }
}
