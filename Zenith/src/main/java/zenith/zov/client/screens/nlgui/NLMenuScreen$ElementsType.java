package zenith.zov.client.screens.nlgui;

import java.util.function.Supplier;
import zenith.ZenithClient;
import zenith.zov.client.screens.nlgui.panel.api.ElementPanel;

public enum NLMenuScreen$ElementsType {
   CATEGORY("Category", "0", () -> ZenithClient.getInstance().ZenithInternal141().guiModulePanel),
   FRIENDS("Friends", "8", () -> ZenithClient.getInstance().ZenithInternal141().guiFreindsPanel),
   CONFIGS("Configs", "9", () -> ZenithClient.getInstance().ZenithInternal141().guiConfigPanel),
   INTERFACE("Interface", ":", () -> ZenithClient.getInstance().ZenithInternal141().interfacePanel),
   COSMETICS("Cosmetics", ";", () -> ZenithClient.getInstance().ZenithInternal141().cosmeticElementPanel);

   final String name;
   final String icon;
   final Supplier<ElementPanel> panelSupplier;

   private NLMenuScreen$ElementsType(String s1, String s2, Supplier<ElementPanel> supplier) {
      this.name = s1;
      this.icon = s2;
      this.panelSupplier = supplier;
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
