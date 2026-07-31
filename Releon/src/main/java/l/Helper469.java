package l;

import net.minecraft.client.gui.DrawContext;

public class Helper469 extends Widget8 {
   private final Widget3 buttonComponent = new Widget3();
   private final Setting4 setting;

   public Helper469(Setting4 var1) {
      super(var1);
      this.setting = var1;
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      this.height = 20.0F;
      Helper103.method927(14, Helper101.BOLD).method1474(var1.getMatrices(), this.method341(), this.x + 1119.0F, this.y + 1116.0F, -2828575);
      String var5 = this.setting.method2217() != null && !this.setting.method2217().isBlank()
         ? Helper300.method2976(this.setting.method2217())
         : Helper300.method2976("Click on me");
      ((Widget3)this.buttonComponent
            .method259(var5)
            .method260(this.setting.method2216())
            .method294(this.x + this.width - 9.0F - this.buttonComponent.width, this.y + 5.0F))
         .method246(var1, var2, var3, var4);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      this.buttonComponent.method247(var1, var3, var5);
      return super.method247(var1, var3, var5);
   }
}
