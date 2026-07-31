package l;

import antidaunleak.api.annotation.Native;
import net.minecraft.entity.effect.StatusEffects;

public class AutoSprint extends Helper242 {
   public static int tickStop;
   private Setting8 settings = new Setting8("Игнорировать", "Не дает спринтиться при эффектах").method2585("Slowness", "Blindness");

   public static AutoSprint method4403() {
      return Helper222.method1979(AutoSprint.class);
   }

   public AutoSprint() {
      super("AutoSprint", "Auto Sprint", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.settings});
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.options != null) {
         if (!this.method4404()) {
            mc.player.setSprinting(false);
         } else if (!mc.options.sprintKey.isPressed()) {
            mc.player.setSprinting(true);
         }

         tickStop--;
      }
   }

   public boolean method4404() {
      if (this.state && mc.player != null && mc.options != null) {
         boolean var1 = mc.player.hasStatusEffect(StatusEffects.SLOWNESS);
         boolean var2 = mc.player.hasStatusEffect(StatusEffects.BLINDNESS);
         boolean var3 = var1 && !this.settings.method2588("Slowness");
         boolean var4 = var2 && !this.settings.method2588("Blindness");
         boolean var5 = mc.player.horizontalCollision && !mc.player.collidedSoftly;
         boolean var6 = mc.player.isSneaking() && !mc.player.isSwimming();
         return tickStop <= 0 && !var6 && !var3 && !var4 && !var5 && mc.player.forwardSpeed > 0.0F;
      } else {
         return false;
      }
   }
}
