package l;

import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class WindJump extends Helper242 {
   private final Helper336 rot = new Helper336(0.0F, 0.0F);
   private final Setting9 windChargeBind = new Setting9("Заряд ветра", "Бросить заряд ветра");
   private final Helper339 stopWatch = new Helper339();
   private final Helper159 script = new Helper159();

   public WindJump() {
      super("WindJump", "Wind Jump", Helper269.MISC);
      this.setup(new Helper264[]{this.windChargeBind});
   }

   @Helper104
   public void method4523(Helper399 var1) {
      if (!this.script.method1317()) {
         var1.method582();
      }
   }

   @Helper104
   public void method4524(Helper428 var1) {
      if (!this.script.method1317()) {
         var1.method582();
      }
   }

   @Helper104
   public void method4525(Event17 var1) {
      if (var1.method3905(this.windChargeBind.getKey()) && this.stopWatch.method3356(0.0)) {
         Helper66.method694(Items.WIND_CHARGE);
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (Helper38.method543(this.windChargeBind)) {
         this.rot.method3335(mc.player.getYaw());
         this.rot.method3336(90.0F);
         Helper351.INSTANCE.method3502(this.rot, Helper334.DEFAULT, Helper153.LOW_PRIORITY, this);
         ItemStack var2 = Items.WIND_CHARGE.getDefaultStack();
         Predictions.method2289().method2290(var1.method3708(), List.of(var2), Helper349.method3473());
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (!this.script.method1317() && this.stopWatch.method3357(250.0)) {
         this.script.method1315();
      }
   }
}
