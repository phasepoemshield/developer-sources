package l;

public class ElytraTarget extends Helper242 {
   public Setting2 elytraFindRange = new Setting2("Дистанция наводки", "Дальность поиска цели во время полета на элитре")
      .method2086(32.0F)
      .method2078(6.0F, 64.0F);
   public Setting2 elytraForward = new Setting2("Значение перегона", "заебался").method2086(3.0F).method2078(0.0F, 6.0F);
   final Setting9 forward = new Setting9("Кнопка вкл/выкл перегона", "ужас");
   public static boolean shouldElytraTarget = false;

   public static ElytraTarget method4451() {
      return Helper222.method1979(ElytraTarget.class);
   }

   public ElytraTarget() {
      super("ElytraTarget", "Elytra Target", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.elytraFindRange, this.elytraForward, this.forward});
   }

   @Helper104
   private void method4452(Event17 var1) {
      if (var1.method3903(this.forward.getKey())) {
         float var2 = Hud.method1824().method1825();
         shouldElytraTarget = !shouldElytraTarget;
         Notifications.method1666().method1670("Elytra Forward " + (shouldElytraTarget ? "enabled!" : "disabled"), 1500L, null);
         Helper56.method646(shouldElytraTarget ? Helper56.ENABLE_MODULE : Helper56.DISABLE_MODULE, var2, 1.0F);
      }
   }
}
