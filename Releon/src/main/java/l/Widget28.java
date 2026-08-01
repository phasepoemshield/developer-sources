package l;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.DrawContext;

public class Widget28 extends Helper296 {
   private final List<Widget37> colorPresetButtonList = new ArrayList<>();
   private final Setting7 setting;
   private float windowHeight;
   private float windowWidth;

   public Widget28(Setting7 var1) {
      this.setting = var1;

      for (int var5 : var1.method2560()) {
         this.colorPresetButtonList.add(new Widget37(var1, var5));
      }
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      if (!this.colorPresetButtonList.isEmpty()) {
         Helper103.method927(13, Helper101.DEFAULT).method1474(var1.getMatrices(), "Готовые цвета", this.x + 6.0F, this.y + 95.0F, -1);
      }

      byte var5 = 0;
      int var6 = 0;
      int var7 = 0;
      byte var8 = 13;

      for (Widget37 var10 : this.colorPresetButtonList) {
         var10.x = this.x + 6.0F + var5;
         var10.y = this.y + 103.0F + var6;
         var10.method246(var1, var2, var3, var4);
         var5 += var8;
         if (++var7 >= 11) {
            var7 = 0;
            var5 = 0;
            var6 += var8 - 1;
         }
      }

      this.windowHeight = this.colorPresetButtonList.isEmpty() ? 132.0F : 166 + var6 - var6 / 2.0F;
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      this.colorPresetButtonList.forEach(var5x -> var5x.method247(var1, var3, var5));
      return super.method247(var1, var3, var5);
   }

   public List<Widget37> method3965() {
      return this.colorPresetButtonList;
   }

   public Setting7 method3966() {
      return this.setting;
   }

   public float method3967() {
      return this.windowHeight;
   }

   public float method3968() {
      return this.windowWidth;
   }
}
