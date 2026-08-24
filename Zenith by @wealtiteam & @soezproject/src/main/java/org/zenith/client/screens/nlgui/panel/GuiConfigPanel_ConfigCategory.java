package org.zenith.client.screens.nlgui.panel;

import org.zenith.client.screens.nlgui.panel.api.Panel;

import org.zenith.core.EmotePlayback;













enum GuiConfigPanel_ConfigCategory {
   LOCAL("Local"),
   LIBRARY("Library"),
   PUBLIC_HUB("Public Hub");

   public final String label;

   private GuiConfigPanel_ConfigCategory(String var3) {
      this.label = var3;
   }
}
