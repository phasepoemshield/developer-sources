package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "MotionBlur",
   O0000000000 = Category.Visuals,
   O000000000 = "Физически основанный MotionBlur, очень сильно повышает плавность картинки.",
   O00000000000 = {O0000000OO0OOO.NEW}
)
public final class MotionBlur extends Module {
   public final NumberSetting O000000000O = new NumberSetting("Плавность", 0.68F, 0.0F, 1.0F, 0.01F, true);

   public MotionBlur() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @Override
   public void O00000000() {
      O0000O0O000OO0.O00000000().O000000000();
      super.O00000000();
   }

   @Override
   public void O000000000() {
      super.O000000000();
      O0000O0O000OO0.O00000000().O000000000();
   }

   public O0000O0O000OO0.W395 O0000000000O0() {
      float var1 = Math.max(0.0F, Math.min(1.0F, this.O000000000O.O0000000000()));
      float var2 = var1 * var1 * (3.0F - 2.0F * var1);
      O0000O0O000OO0.W395 var3 = new O0000O0O000OO0.W395();
      var3.O00000000 = 0.38F + var2 * 0.92F;
      var3.O000000000 = 1.1F + var2 * 2.25F;
      var3.O0000000000 = 5 + Math.round(var2 * 7.0F);
      var3.O00000000000 = 24.0F + var2 * 82.0F;
      var3.O000000000000 = 0.3F + var2 * 0.42F;
      var3.O0000000000000 = 0.22F + var2 * 1.12F;
      var3.O000000000000O = 0.68F;
      var3.O00000000000O = 2.85F - var2 * 1.35F;
      var3.O00000000000O0 = 0.035F + (1.0F - var2) * 0.075F;
      return var3;
   }
}
