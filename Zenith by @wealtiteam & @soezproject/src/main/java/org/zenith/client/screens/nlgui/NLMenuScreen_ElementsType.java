package org.zenith.client.screens.nlgui;

import org.zenith.client.screens.nlgui.panel.api.Panel;
import org.zenith.client.screens.nlgui.panel.CosmeticElementPanel;
import org.zenith.client.screens.nlgui.panel.GuiConfigPanel;
import org.zenith.client.screens.nlgui.panel.GuiFreindsPanel;
import org.zenith.client.screens.nlgui.panel.GuiModulePanel;
import org.zenith.client.screens.nlgui.panel.InterfacePanel;
import org.zenith.client.screens.nlgui.panel.ScriptsPanel;
import org.zenith.core.NbtEditor;
import org.zenith.module.Module;

import org.zenith.module.Interface;

import org.zenith.module.Category;
import org.zenith.client.screens.nlgui.panel.api.ElementPanel;
import org.zenith.module.Interface;
import org.zenith.ZenithClient;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
















import java.util.function.Supplier;

public enum NLMenuScreen_ElementsType {
   CATEGORY("Category", "0", () -> ZenithClient.on23().NbtEditor().guiModulePanel),
   FRIENDS("Friends", "8", () -> ZenithClient.on23().NbtEditor().guiFreindsPanel),
   CONFIGS("Configs", "9", () -> ZenithClient.on23().NbtEditor().guiConfigPanel),
   INTERFACE("Interface", ":", () -> ZenithClient.on23().NbtEditor().interfacePanel),
   COSMETICS("Cosmetics", ";", () -> ZenithClient.on23().NbtEditor().cosmeticElementPanel),
   SCRIPTS("Scripts", "<", () -> ZenithClient.on23().NbtEditor().scriptsPanel);

   final String name;
   final String icon;
   final Supplier<ElementPanel> panelSupplier;

   private NLMenuScreen_ElementsType(String var3, String var4, Supplier<ElementPanel> var5) {
      this.name = var3;
      this.icon = var4;
      this.panelSupplier = var5;
   }

   public String getName() {
      return this.name;
   }

   public String getIcon() {
      return this.icon;
   }

   public Supplier<ElementPanel> getPanelSupplier() {
      return this.panelSupplier;
   }
}
