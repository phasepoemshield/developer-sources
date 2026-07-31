package l;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.DrawContext;

public class Widget43 extends Helper296 {
   private final List<Widget12> categoryComponents = new ArrayList<>();

   public Widget43() {
   }

   public void method4908() {
      this.categoryComponents.clear();

      for (Helper269 var3 : List.of(Helper269.COMBAT, Helper269.MOVEMENT, Helper269.RENDER, Helper269.PLAYER, Helper269.MISC)) {
         this.categoryComponents.add(new Widget12(var3));
      }
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      float var5 = 0.0F;

      for (Widget12 var7 : this.categoryComponents) {
         var7.x = this.x + 6.0F;
         var7.y = this.y + 40.0F + var5;
         var7.width = 73.0F;
         var7.height = 17.0F;
         var7.method246(var1, var2, var3, var4);
         var5 += var7.height + 12.0F;
      }
   }

   @Override
   public void method2930() {
      if (!Helper470.typing && !Widget20.typing) {
         Helper59.method663();
      } else {
         Helper59.method662();
      }

      this.categoryComponents.forEach(Helper296::method2930);
      super.method2930();
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      this.categoryComponents.forEach(var5x -> var5x.method247(var1, var3, var5));
      return super.method247(var1, var3, var5);
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.categoryComponents.forEach(var5x -> var5x.method248(var1, var3, var5));
      return super.method248(var1, var3, var5);
   }

   @Override
   public boolean method2931(double var1, double var3, int var5, double var6, double var8) {
      this.categoryComponents.forEach(var9 -> var9.method2931(var1, var3, var5, var6, var8));
      return super.method2931(var1, var3, var5, var6, var8);
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      this.categoryComponents.forEach(var6 -> var6.method249(var1, var3, var5));
      return super.method249(var1, var3, var5);
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      this.categoryComponents.forEach(var3x -> var3x.method250(var1, var2, var3));
      return super.method250(var1, var2, var3);
   }

   @Override
   public boolean method251(char var1, int var2) {
      this.categoryComponents.forEach(var2x -> var2x.method251(var1, var2));
      return super.method251(var1, var2);
   }
}
