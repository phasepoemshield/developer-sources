package l;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;

public class Helper347 {
   private Helper333 afkActionTimer = Helper333.method3308();
   private boolean wasInAfk = false;
   private boolean performingAfkAction = false;
   private int afkActionStep = 0;

   public Helper347() {
   }

   public void method3421() {
      this.afkActionTimer.method3309();
      this.wasInAfk = false;
      this.performingAfkAction = false;
      this.afkActionStep = 0;
   }

   public void method3422(MinecraftClient var1) {
      boolean var2 = this.method3424(var1);
      if (var2 && !this.wasInAfk) {
         this.performingAfkAction = true;
         this.afkActionStep = 0;
         this.afkActionTimer.method3309();
      }

      this.wasInAfk = var2;
      if (this.performingAfkAction && this.afkActionTimer.method3315(100L)) {
         this.method3423(var1);
      }
   }

   private void method3423(MinecraftClient var1) {
      switch (this.afkActionStep) {
         case 0:
            var1.options.forwardKey.setPressed(true);
            this.afkActionStep++;
            this.afkActionTimer.method3309();
            break;
         case 1:
            var1.options.forwardKey.setPressed(false);
            this.afkActionStep++;
            this.afkActionTimer.method3309();
            break;
         case 2:
            float var2 = var1.player.getYaw();
            var1.player.setYaw(var2 + 45.0F);
            this.afkActionStep++;
            this.afkActionTimer.method3309();
            break;
         case 3:
            this.performingAfkAction = false;
            this.afkActionStep = 0;
      }
   }

   private boolean method3424(MinecraftClient var1) {
      return var1.inGameHud == null
         ? false
         : var1.inGameHud
            .getBossBarHud()
            .bossBars
            .values()
            .stream()
            .map(var0 -> var0.getName().getString().toLowerCase())
            .anyMatch(var0 -> var0.contains("afk"));
   }

   public void method3425(GameOptions var1) {
      if (var1 != null) {
         var1.forwardKey.setPressed(false);
         var1.backKey.setPressed(false);
         var1.leftKey.setPressed(false);
         var1.rightKey.setPressed(false);
      }
   }

   public boolean method3426() {
      return this.performingAfkAction;
   }
}
