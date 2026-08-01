package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class Helper26 extends Widget14 {
   private boolean editing = false;
   private String inputText = "";

   public Helper26(Helper361 var1) {
      super(var1);
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      Helper103.method927(13, Helper101.SEMI).method1474(var5, "Покупать ниже:", this.x + 10.0F, this.y + 10.0F, Helper133.method1159(0.8F));
      String var6 = this.editing ? this.inputText + "_" : this.settings.method3592() + "$";
      float var7 = Helper103.method927(13, Helper101.DEFAULT).method1479(var6);
      rectangle.method677(
         Helper80.method841(var5, this.x + this.width - var7 - 16.0F, this.y + 5.0F, var7 + 9.0F, 12.0)
            .method826(3.0F)
            .method835(2.5F)
            .method839(this.editing ? new Color(41, 42, 40, 40).getRGB() : new Color(41, 42, 40, 140).getRGB())
            .method823(new Color(41, 42, 40, 40).getRGB())
            .method840()
      );
      Helper103.method927(13, Helper101.DEFAULT).method1474(var5, var6, this.x + this.width - var7 - 12.0F, this.y + 10.0F, Helper133.method1160());
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      String var6 = this.editing ? this.inputText + "_" : this.settings.method3592() + "$";
      float var7 = Helper103.method927(13, Helper101.DEFAULT).method1479(var6);
      if (Helper147.method1224(var1, var3, this.x + this.width - var7 - 20.0F, this.y + 5.0F, var7 + 15.0F, 15.0) && var5 == 0) {
         this.editing = true;
         this.inputText = String.valueOf(this.settings.method3592());
         return true;
      } else {
         return super.method247(var1, var3, var5);
      }
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      if (this.editing) {
         if (var1 == 257) {
            try {
               int var4 = Integer.parseInt(this.inputText);
               this.settings.method3597(Math.max(1, var4));
               Helper31.method477().method478(this.settings.method3596(), this.settings);
               Helper359.method3583();
            } catch (NumberFormatException var5) {
            }

            this.editing = false;
            return true;
         }

         if (var1 == 256) {
            this.editing = false;
            return true;
         }

         if (var1 == 259 && !this.inputText.isEmpty()) {
            this.inputText = this.inputText.substring(0, this.inputText.length() - 1);
            return true;
         }
      }

      return super.method250(var1, var2, var3);
   }

   @Override
   public boolean method251(char var1, int var2) {
      if (this.editing && Character.isDigit(var1) && this.inputText.length() < 9) {
         this.inputText = this.inputText + var1;
         return true;
      } else {
         return super.method251(var1, var2);
      }
   }

   @Override
   public boolean method285(double var1, double var3) {
      return Helper147.method1224(var1, var3, this.x, this.y, this.width, this.height);
   }
}
