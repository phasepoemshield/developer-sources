package l;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import net.minecraft.client.gui.DrawContext;

public class Widget2 extends Helper296 {
   private static final float PANEL_WIDTH = 110.0F;
   private static final float PANEL_HEIGHT = 240.0F;
   private static final float PANEL_GAP = 20.0F;
   private static final float PRICES_PANEL_WIDTH = 110.0F;
   private static final float TOP_PADDING = 6.0F;
   private final List<Widget1> panels = new ArrayList<>();
   private final Widget11 pricesPanel = new Widget11();

   public Widget2() {
      this.method255();
   }

   public void method255() {
      this.panels.clear();

      for (Helper269 var2 : EnumSet.of(Helper269.COMBAT, Helper269.MOVEMENT, Helper269.RENDER, Helper269.PLAYER, Helper269.MISC)) {
         this.panels.add(new Widget1(var2));
      }
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      float var5 = this.panels.size() * 110.0F + this.panels.size() * 20.0F + 110.0F;
      float var6 = this.x + (this.width - var5) / 2.0F;
      float var7 = this.y + 6.0F;

      for (int var8 = 0; var8 < this.panels.size(); var8++) {
         Widget1 var9 = this.panels.get(var8);
         var9.method294(var6 + var8 * 130.0F, var7).method1960(110.0F, 240.0F);
         var9.method246(var1, var2, var3, var4);
      }

      this.pricesPanel.method294(var6 + this.panels.size() * 130.0F, var7).method1960(110.0F, 240.0F);
      this.pricesPanel.method246(var1, var2, var3, var4);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (this.pricesPanel.method247(var1, var3, var5)) {
         return true;
      } else {
         for (Widget1 var7 : this.panels) {
            if (var7.method247(var1, var3, var5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.pricesPanel.method248(var1, var3, var5);

      for (Widget1 var7 : this.panels) {
         if (var7.method248(var1, var3, var5)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      if (this.pricesPanel.method249(var1, var3, var5)) {
         return true;
      } else {
         for (Widget1 var8 : this.panels) {
            if (var8.method249(var1, var3, var5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      if (this.pricesPanel.method250(var1, var2, var3)) {
         return true;
      } else {
         for (Widget1 var5 : this.panels) {
            if (var5.method250(var1, var2, var3)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean method251(char var1, int var2) {
      if (this.pricesPanel.method251(var1, var2)) {
         return true;
      } else {
         for (Widget1 var4 : this.panels) {
            if (var4.method251(var1, var2)) {
               return true;
            }
         }

         return false;
      }
   }
}
