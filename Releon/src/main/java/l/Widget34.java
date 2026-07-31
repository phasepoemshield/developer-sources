package l;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.DrawContext;

public class Widget34 extends Helper296 {
   private final List<Widget35> windows = new ArrayList<>();

   public Widget34() {
   }

   public void method4818(Widget35 var1) {
      this.windows.add(var1);
   }

   public void method4819(Widget35 var1) {
      var1.method4830();
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      ArrayList var5 = new ArrayList();
      this.windows.forEach(var5x -> {
         var5x.method246(var1, var2, var3, var4);
         if (var5x.method4831()) {
            var5.add(var5x);
         }
      });
      this.windows.removeAll(var5);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      boolean var6 = false;
      ArrayList var7 = new ArrayList<>(this.windows);

      for (int var8 = var7.size() - 1; var8 >= 0; var8--) {
         Widget35 var9 = (Widget35)var7.get(var8);
         if (var9.method4829(var1, var3) || this.method285(var1, var3)) {
            var6 = true;
            var9.method247(var1, var3, var5);
            break;
         }
      }

      if (var6) {
         return var6;
      } else {
         for (Widget35 var11 : this.windows) {
            var11.method4830();
         }

         return false;
      }
   }

   @Override
   public boolean method285(double var1, double var3) {
      this.windows.forEach(var4 -> var4.method4829(var1, var3));

      for (Widget35 var6 : this.windows) {
         if (var6.method285(var1, var3)) {
            return true;
         }
      }

      return super.method285(var1, var3);
   }

   @Override
   public boolean method251(char var1, int var2) {
      this.windows.forEach(var2x -> var2x.method251(var1, var2));
      return super.method251(var1, var2);
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      for (Widget35 var8 : this.windows) {
         if (var8.method249(var1, var3, var5)) {
            return true;
         }
      }

      return super.method249(var1, var3, var5);
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      this.windows.forEach(var3x -> var3x.method250(var1, var2, var3));
      return super.method250(var1, var2, var3);
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.windows.forEach(var5x -> var5x.method248(var1, var3, var5));
      return super.method248(var1, var3, var5);
   }

   public List<Widget35> method4820() {
      return this.windows;
   }
}
