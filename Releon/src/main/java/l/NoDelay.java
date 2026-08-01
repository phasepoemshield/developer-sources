package l;

public class NoDelay extends Helper242 {
   public final Setting8 ignoreSetting = new Setting8("Тип", "Разрешает выбранные вами действия").method2585("Jump", "Right Click", "Break CoolDown");

   public static NoDelay method2451() {
      return Helper222.method1979(NoDelay.class);
   }

   public NoDelay() {
      super("NoDelay", "No Delay", Helper269.PLAYER);
      this.setup(new Helper264[]{this.ignoreSetting});
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (this.ignoreSetting.method2588("Break CoolDown")) {
         mc.interactionManager.blockBreakingCooldown = 0;
      }

      if (this.ignoreSetting.method2588("Jump")) {
         mc.player.jumpingCooldown = 0;
      }

      if (this.ignoreSetting.method2588("Right Click")) {
         mc.itemUseCooldown = 0;
      }
   }
}
