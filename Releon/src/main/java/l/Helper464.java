package l;

import fat.releon.Releon;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.joml.Matrix4f;

public class Helper464 {
   private static final List<Helper463> purchases = new CopyOnWriteArrayList<>();
   private static final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
   private static final float HEADER_HEIGHT = 28.0F;
   private static final float PADDING = 7.0F;
   private static final float ROW_HEIGHT = 34.0F;
   private static final float ROW_GAP = 4.0F;
   private static final float ICON_SIZE = 0.9F;
   private float scroll = 0.0F;
   private float smoothedScroll = 0.0F;
   private boolean scrollbarDragging = false;
   private float scrollbarDragOffset = 0.0F;
   private boolean panelDragging = false;
   private float panelOffsetX = 0.0F;
   private float panelOffsetY = 0.0F;
   private float panelDragOffsetX = 0.0F;
   private float panelDragOffsetY = 0.0F;
   private final MinecraftClient mc = MinecraftClient.getInstance();

   public Helper464() {
   }

   public static void method4958(Helper465 var0, int var1) {
      String var2 = var0.method364();
      long var3 = System.currentTimeMillis();

      for (Helper463 var6 : purchases) {
         if (var6.itemName.equals(var2) && var6.price == var1 && var3 - var6.timestamp < 1000L) {
            return;
         }
      }

      ItemStack var7 = var0.method365();
      var7.setCount(1);
      purchases.add(0, new Helper463(var7, var2, var1, var0.method368().method3594(), var3));
   }

   public static void method4959(String var0, int var1) {
      String var2 = var0;
      long var3 = System.currentTimeMillis();

      for (Helper463 var6 : purchases) {
         if (var6.itemName.equals(var2) && var6.price == var1 && var3 - var6.timestamp < 1000L) {
            return;
         }
      }

      purchases.add(0, new Helper463(null, var2, var1, 1, var3));
   }

   public static void method4960(ItemStack var0, String var1, int var2, int var3) {
      String var4 = var1 == null ? "" : var1;
      long var5 = System.currentTimeMillis();

      for (Helper463 var8 : purchases) {
         if (var8.itemName.equals(var4) && var8.price == var2 && var5 - var8.timestamp < 1000L) {
            return;
         }
      }

      ItemStack var9 = var0 == null ? null : var0.copy();
      if (var9 != null && !var9.isEmpty()) {
         var9.setCount(1);
      }

      purchases.add(0, new Helper463(var9, var4, var2, Math.max(1, var3), var5));
   }

   public void method4961(DrawContext var1, int var2, int var3, float var4, int var5, int var6, int var7, int var8) {
      float var9 = this.method4969(var5, var7);
      float var10 = this.method4970(var6, var8);
      float var11 = 180.0F;
      float var12 = var8;
      var1.getMatrices().push();
      Helper160.rectangle
         .method677(
            Helper80.method841(var1.getMatrices(), var9, var10, var11, var12)
               .method826(6.0F)
               .method835(2.0F)
               .method839(new Color(54, 54, 56, 255).getRGB())
               .method823(new Color(12, 12, 12, 200).getRGB())
               .method840()
         );
      Helper103.method927(14, Helper101.SEMI)
         .method1474(var1.getMatrices(), "История покупок", var9 + 8.0F, var10 + 7.0F, new Color(255, 255, 255, 255).getRGB());
      if (!purchases.isEmpty()) {
         MatrixStack var13 = var1.getMatrices();
         Matrix4f var14 = var13.peek().getPositionMatrix();
         float var15 = var9 + 7.0F;
         float var16 = var10 + 28.0F;
         float var17 = var11 - 14.0F;
         float var18 = var12 - 28.0F - 7.0F;
         float var19 = purchases.size() * 38.0F;
         float var20 = Math.max(0.0F, var19 - var18);
         this.scroll = Math.min(0.0F, Math.max(this.scroll, -var20));
         this.smoothedScroll = this.smoothedScroll + (this.scroll - this.smoothedScroll) * 0.15F;
         ArrayList var21 = new ArrayList<>(purchases);
         Helper140 var22 = Releon.method71().method30();
         var22.method1209(var14, var15, var16, var17 - 5.0F, var18);

         for (int var23 = 0; var23 < var21.size(); var23++) {
            Helper463 var24 = (Helper463)var21.get(var23);
            float var25 = var16 + var23 * 38.0F + this.smoothedScroll;
            if (!(var25 + 34.0F < var16) && !(var25 > var10 + var12 - 7.0F)) {
               Helper160.rectangle
                  .method677(
                     Helper80.method841(var1.getMatrices(), var15, var25, var17, 34.0)
                        .method826(4.0F)
                        .method835(0.5F)
                        .method839(new Color(42, 42, 45, 190).getRGB())
                        .method823(new Color(18, 18, 20, 185).getRGB())
                        .method840()
                  );
               if (var24.itemStack != null && !var24.itemStack.isEmpty()) {
                  Helper178.method1502(var1, var24.itemStack, var15 + 5.0F, var25 + 6.0F, false, false, 0.9F);
               }

               float var26 = var15 + 25.0F;
               String var27 = this.method4972(var24.itemName, var17 - 33.0F, 11);
               Helper103.method927(13, Helper101.BOLD).method1474(var1.getMatrices(), var27, var26, var25 + 6.0F, new Color(240, 240, 240, 255).getRGB());
               String var28 = "$" + this.method4973(var24.price);
               if (var24.quantity > 1) {
                  var28 = var28 + " x" + var24.quantity;
               }

               Helper103.method927(12, Helper101.DEFAULT)
                  .method1474(var1.getMatrices(), var28, var26, var25 + 15.0F, new Color(95, 255, 125, 255).getRGB());
               String var29 = timeFormat.format(new Date(var24.timestamp));
               float var30 = Helper103.method927(10, Helper101.INST).method1479(var29);
               Helper103.method927(10, Helper101.REGULAR)
                  .method1474(var1.getMatrices(), var29, var15 + var17 - var30 - 5.0F, var25 + 15.0F, new Color(255, 255, 255, 255).getRGB());
            }
         }

         var22.method1210();
         if (var20 > 0.0F) {
            float var31 = Math.max(20.0F, var18 * var18 / var19);
            float var32 = -this.smoothedScroll / var20;
            float var33 = var16 + var32 * (var18 - var31);
            Helper160.rectangle
               .method677(
                  Helper80.method841(var1.getMatrices(), var9 + var11 - 6.0F, var16, 3.0, var18)
                     .method826(1.0F)
                     .method823(new Color(30, 30, 30, 100).getRGB())
                     .method840()
               );
            Helper160.rectangle
               .method677(
                  Helper80.method841(var1.getMatrices(), var9 + var11 - 6.0F, var33, 3.0, var31)
                     .method826(1.5F)
                     .method823(new Color(100, 100, 100, 180).getRGB())
                     .method840()
               );
         }
      } else {
         Helper103.method927(13, Helper101.REGULAR)
            .method1474(var1.getMatrices(), "Покупки отсутствуют", var9 + var11 / 2.0F - 35.0F, var10 + 105.0F, new Color(150, 150, 150, 255).getRGB());
      }

      var1.getMatrices().pop();
   }

   public boolean method4962(double var1, double var3, double var5, int var7, int var8, int var9, int var10) {
      if (purchases.isEmpty()) {
         return false;
      } else if (this.method4966(var1, var3, var7, var8, var9, var10)) {
         this.scroll = (float)(this.scroll + var5 * 20.0);
         return true;
      } else {
         return false;
      }
   }

   public boolean method4963(double var1, double var3, int var5, int var6, int var7, int var8, int var9) {
      if (var5 != 0) {
         return false;
      } else {
         float var10 = this.method4969(var6, var8);
         float var11 = this.method4970(var7, var9);
         if (var1 >= var10 && var1 <= var10 + 180.0F && var3 >= var11 && var3 <= var11 + 28.0F) {
            this.panelDragging = true;
            this.panelDragOffsetX = (float)var1 - var10;
            this.panelDragOffsetY = (float)var3 - var11;
            return true;
         } else if (purchases.isEmpty()) {
            return this.method4966(var1, var3, var6, var7, var8, var9);
         } else {
            Helper462 var12 = this.method4967(var6, var7, var8, var9);
            if (var12.maxScroll <= 0.0F) {
               return false;
            } else if (var1 >= var12.x - 3.0F && var1 <= var12.x + 6.0F && var3 >= var12.y && var3 <= var12.y + var12.height) {
               this.scrollbarDragging = true;
               this.scrollbarDragOffset = var3 >= var12.thumbY && var3 <= var12.thumbY + var12.thumbHeight
                  ? (float)var3 - var12.thumbY
                  : var12.thumbHeight / 2.0F;
               this.method4968((float)var3, var12);
               return true;
            } else {
               return this.method4966(var1, var3, var6, var7, var8, var9);
            }
         }
      }
   }

   public boolean method4964(double var1, double var3, int var5, int var6, int var7, int var8, int var9) {
      if (var5 != 0) {
         return false;
      } else if (this.panelDragging) {
         this.panelOffsetX = (float)var1 - this.panelDragOffsetX - ((var6 - var8) / 2.0F - 185.0F);
         this.panelOffsetY = (float)var3 - this.panelDragOffsetY - (var7 - var9) / 2.0F;
         return true;
      } else if (!this.scrollbarDragging) {
         return false;
      } else {
         Helper462 var10 = this.method4967(var6, var7, var8, var9);
         this.method4968((float)var3, var10);
         return true;
      }
   }

   public boolean method4965(double var1, double var3, int var5) {
      if (var5 != 0 || !this.scrollbarDragging && !this.panelDragging) {
         return false;
      } else {
         this.scrollbarDragging = false;
         this.panelDragging = false;
         return true;
      }
   }

   private boolean method4966(double var1, double var3, int var5, int var6, int var7, int var8) {
      float var9 = this.method4969(var5, var7);
      float var10 = this.method4970(var6, var8);
      return var1 >= var9 && var1 <= var9 + 180.0F && var3 >= var10 && var3 <= var10 + var8;
   }

   private Helper462 method4967(int var1, int var2, int var3, int var4) {
      float var5 = this.method4969(var1, var3);
      float var6 = this.method4970(var2, var4);
      float var7 = 180.0F;
      float var8 = var6 + 28.0F;
      float var9 = var4 - 28.0F - 7.0F;
      float var10 = purchases.size() * 38.0F;
      float var11 = Math.max(0.0F, var10 - var9);
      float var12 = var11 <= 0.0F ? var9 : Math.max(20.0F, var9 * var9 / var10);
      float var13 = var11 <= 0.0F ? 0.0F : -this.scroll / var11;
      float var14 = var8 + var13 * (var9 - var12);
      return new Helper462(var5 + var7 - 6.0F, var8, var9, var14, var12, var11);
   }

   private void method4968(float var1, Helper462 var2) {
      float var3 = Math.max(1.0F, var2.height - var2.thumbHeight);
      float var4 = this.method4971(var1 - this.scrollbarDragOffset, var2.y, var2.y + var3);
      float var5 = (var4 - var2.y) / var3;
      this.scroll = -var2.maxScroll * var5;
      this.smoothedScroll = this.scroll;
   }

   private float method4969(int var1, int var2) {
      return (var1 - var2) / 2.0F - 185.0F + this.panelOffsetX;
   }

   private float method4970(int var1, int var2) {
      return (var1 - var2) / 2.0F + this.panelOffsetY;
   }

   private float method4971(float var1, float var2, float var3) {
      return Math.max(var2, Math.min(var3, var1));
   }

   private String method4972(String var1, float var2, int var3) {
      String var4 = var1 != null && !var1.isBlank() ? var1 : "Unknown item";
      if (Helper103.method927(var3, Helper101.SEMI).method1479(var4) <= var2) {
         return var4;
      } else {
         String var5 = "...";
         String var6 = var4;

         while (!var6.isEmpty() && Helper103.method927(var3, Helper101.SEMI).method1479(var6 + var5) > var2) {
            var6 = var6.substring(0, var6.length() - 1);
         }

         return var6 + var5;
      }
   }

   private String method4973(int var1) {
      if (var1 >= 1000000) {
         return String.format("%.1fM", var1 / 1000000.0);
      } else {
         return var1 >= 1000 ? String.format("%.1fK", var1 / 1000.0) : String.valueOf(var1);
      }
   }

   public static void method4974() {
      purchases.clear();
   }
}
