package l;

public class BetterMinecraft extends Helper242 {
   private final Setting3 betterButton = new Setting3("Кастомные кнопки", "").method2201(true);
   private final Setting3 tabVanishButton = new Setting3("Спектаторы в табе", "").method2201(true);

   public static BetterMinecraft method2760() {
      return Helper222.method1979(BetterMinecraft.class);
   }

   public BetterMinecraft() {
      super("BetterMinecraft", "Better Minecraft", Helper269.RENDER);
      this.setup(new Helper264[]{this.betterButton, this.tabVanishButton});
   }

   public Setting3 method2761() {
      return this.betterButton;
   }

   public Setting3 method2762() {
      return this.tabVanishButton;
   }
}
