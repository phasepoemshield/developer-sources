package l;

import fat.releon.teremok.impl.combat.TriggerBot;

public class Helper327 implements Helper160 {
   Helper331 attackHandler = new Helper331();

   public Helper327() {
   }

   public void method3246() {
      this.attackHandler.method3273();
   }

   public void onPacket(Helper386 var1) {
      this.attackHandler.onPacket(var1);
   }

   public void method3247(Helper326 var1) {
      this.attackHandler.method3275(var1);
   }

   public void method3248(Helper326 var1, TriggerBot var2) {
      this.attackHandler.method3276(var1, var2);
   }

   public void method3249(Helper429 var1) {
      this.attackHandler.method3274(var1);
   }

   public Helper331 method3250() {
      return this.attackHandler;
   }
}
