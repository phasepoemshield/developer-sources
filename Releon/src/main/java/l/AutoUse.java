package l;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;

public class AutoUse extends Helper242 {
   private final Helper159 script = new Helper159();
   private final Setting8 multiSetting = new Setting8("Авто использование", "Выберите, что будет использоваться").method2585("Еды", "Невидимости");

   public AutoUse() {
      super("AutoUse", "AutoUse", Helper269.PLAYER);
      this.setup(new Helper264[]{this.multiSetting});
   }

   @Override
   public void deactivate() {
      this.script.method1314();
      super.deactivate();
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         for (String var3 : this.multiSetting.method2590()) {
            switch (var3) {
               case "Еды":
                  if (!mc.player.getHungerManager().isNotFull()) {
                     mc.options.useKey.setPressed(false);
                     return;
                  }

                  if (mc.player.isUsingItem()) {
                     mc.options.useKey.setPressed(true);
                     return;
                  }

                  Slot var7 = Helper66.method710();
                  if (var7 != null && this.method2863(var7)) {
                     this.method2862();
                     mc.options.useKey.setPressed(true);
                     mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
                     return;
                  }
                  break;
               case "Невидимости":
                  Slot var6 = Helper66.method712(StatusEffects.INVISIBILITY);
                  if (var6 != null && !Helper38.method538(StatusEffects.INVISIBILITY) && this.method2863(var6)) {
                     this.method2862();
                     if (mc.player.isUsingItem()) {
                        mc.options.useKey.setPressed(true);
                        return;
                     }

                     mc.options.useKey.setPressed(true);
                     mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
                     return;
                  }
            }
         }

         this.script.method1315();
      }
   }

   private void method2862() {
      if (mc.options != null) {
         mc.options.forwardKey.setPressed(false);
         mc.options.backKey.setPressed(false);
         mc.options.leftKey.setPressed(false);
         mc.options.rightKey.setPressed(false);
         mc.options.jumpKey.setPressed(false);
         mc.options.sneakKey.setPressed(false);
         mc.options.sprintKey.setPressed(false);
      }
   }

   public boolean method2863(Slot var1) {
      if (mc.player != null && var1 != null) {
         ItemStack var2 = var1.getStack();
         if (!var2.isEmpty() && !mc.player.getItemCooldownManager().isCoolingDown(var2)) {
            if (!ItemStack.areItemsAndComponentsEqual(mc.player.getOffHandStack(), var2)) {
               if (Helper59.script.method1317()) {
                  Helper66.method691(var1, Hand.OFF_HAND, true, true);
                  this.script.method1314().method1307(0, () -> Helper66.method691(var1, Hand.OFF_HAND, true, true));
               }
            } else {
               Helper187.INSTANCE.method1614(Hand.OFF_HAND);
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
