package zenith.zov.client.screens.nlgui.panel;

public enum CosmeticElementPanel$CosmeticCategory {
   HEAD("Head"),
   MODELS("Models"),
   PETS("Pets"),
   SETTINGS("Settings");

   final String name;

   private CosmeticElementPanel$CosmeticCategory(String s1) {
      this.name = s1;
   }

   public String getName() {
      return this.name;
   }
}
