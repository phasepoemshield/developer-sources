package l;

public class NameProtect extends Helper242 {
   private final Setting6 nameSetting = new Setting6("Имя", "Никнейм, который будет заменен на ваш").method2407("Protected").method2409(32);
   private final Setting3 friendsSetting = new Setting3("Друзья", "Скрывает никнеймы друзей").method2201(true);

   public NameProtect() {
      super("NameProtect", "Name Protect", Helper269.PLAYER);
      this.setup(new Helper264[]{this.friendsSetting});
   }

   @Helper104
   public void method2208(Event7 var1) {
      if (this.isState() && !(mc.currentScreen instanceof Widget16)) {
         var1.method3674(mc.getSession().getUsername(), this.nameSetting.method2403());
         if (this.friendsSetting.method2200()) {
            Helper309.method3078().forEach(var2 -> var1.method3674(var2.getName(), this.nameSetting.method2403()));
         }
      }
   }
}
