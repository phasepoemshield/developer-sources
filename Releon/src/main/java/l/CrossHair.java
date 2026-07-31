package l;

import net.minecraft.util.hit.EntityHitResult;

public class CrossHair extends Helper242 {
   private float red = 0.0F;
   private final Setting2 attackSetting = new Setting2("Отступ кулдауна", "Отступ для кулдауна предмета").method2086(10.0F).method2079(0, 20);
   private final Setting2 indentSetting = new Setting2("Отступ", "Отступ от центра экрана").method2086(0.0F).method2079(0, 5);
   private final Setting2 size1Setting = new Setting2("Ширина", "Ширина прицела").method2086(4.0F).method2079(2, 10);
   private final Setting2 size2Setting = new Setting2("Высота", "Высота прицела").method2086(1.0F).method2079(1, 4);
   public Setting7 colorSetting = new Setting7("Цвет", "Выберите цвет").method2555(-39623).method2551(-9659651, -7569409, -23178, -33925);

   public static CrossHair method1760() {
      return Helper222.method1979(CrossHair.class);
   }

   public CrossHair() {
      super("CrossHair", "Cross Hair", Helper269.RENDER);
      this.setup(new Helper264[]{this.attackSetting, this.indentSetting, this.size1Setting, this.size2Setting, this.colorSetting});
   }

   public void method1761() {
      this.red = Helper147.method1250(2.0, this.red, mc.crosshairTarget instanceof EntityHitResult ? 5.0F : 1.0F);
      int var1 = this.colorSetting.method2553();
      int var2 = this.colorSetting.method2553();
      float var3 = window.getScaledWidth() / 2.0F;
      float var4 = window.getScaledHeight() / 2.0F;
      float var5 = this.attackSetting.method2080() - this.attackSetting.method2080() * mc.player.getAttackCooldownProgress(tickCounter.getTickDelta(false));
      float var6 = this.size1Setting.method2082();
      float var7 = this.size2Setting.method2082();
      float var8 = var7 / 2.0F;
      float var9 = this.indentSetting.method2080() + var5;
      this.method1762(var3, var4, var6, var7, 1.0F, var9, var8, var2);
      this.method1762(var3, var4, var6, var7, 0.0F, var9, var8, var1);
   }

   private void method1762(float var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      Helper178.method1516(var1 - var7 - var5 / 2.0F, var2 - var3 - var6 - var5 / 2.0F, var4 + var5, var3 + var5, var8);
      Helper178.method1516(var1 - var7 - var5 / 2.0F, var2 + var6 - var5 / 2.0F, var4 + var5, var3 + var5, var8);
      Helper178.method1516(var1 - var3 - var6 - var5 / 2.0F, var2 - var7 - var5 / 2.0F, var3 + var5, var4 + var5, var8);
      Helper178.method1516(var1 + var6 - var5 / 2.0F, var2 - var7 - var5 / 2.0F, var3 + var5, var4 + var5, var8);
   }
}
