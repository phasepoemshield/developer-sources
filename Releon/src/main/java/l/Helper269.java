package l;

public enum Helper269 {
   COMBAT("Combat"),
   MOVEMENT("Movement"),
   RENDER("Render"),
   PLAYER("Player"),
   MISC("Misc"),
   AUTOBUY("AutoBuy"),
   CONFIGS("Configs");

   final String readableName;

   private Helper269(String var3) {
      this.readableName = var3;
   }

   public String method2734() {
      return this.readableName;
   }
}
