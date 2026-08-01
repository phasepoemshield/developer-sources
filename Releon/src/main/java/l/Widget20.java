package l;

import fat.releon.Releon;
import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;

public class Widget20 extends Helper296 {
   public static boolean typing = false;
   private boolean dragging;
   private int cursorPosition = 0;
   private int selectionStart = -1;
   private int selectionEnd = -1;
   private long lastClickTime = 0L;
   private float xOffset = 0.0F;
   private String text = "";

   public Widget20() {
   }

   public void method3045(String var1) {
      this.text = var1;
      this.cursorPosition = 0;
      this.method3057();
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      Widget16 var5 = Widget16.INSTANCE;
      if (var5.method2892()) {
         this.width = 80.0F;
         this.height = 17.0F;
         this.x = var5.x + (var5.width - this.width) / 2.0F;
         this.y = var5.y + var5.height + 10;
      } else {
         this.x = var5.x - 10;
         this.y = var5.y + 7;
         this.width = 80.0F;
         this.height = 15.0F;
      }

      MatrixStack var6 = var1.getMatrices();
      Helper175 var7 = Helper103.method926(12);
      this.method3059(var7, this.cursorPosition);
      rectangle.method677(
         Helper80.method841(var6, this.x, this.y, this.width, this.height)
            .method826(5.0F)
            .method834(2.0F)
            .method835(0.5F)
            .method839(new Color(18, 19, 20, 225).getRGB())
            .method825(
               new Color(0, 0, 0, 155).getRGB(), new Color(0, 0, 0, 155).getRGB(), new Color(25, 26, 27, 155).getRGB(), new Color(18, 19, 20, 155).getRGB()
            )
            .method840()
      );
      Helper103.method927(25, Helper101.ICONS).method1474(var1.getMatrices(), "U", this.x + this.width - 15.0F, this.y + 3.5F, typing ? -1 : -7894892);
      String var8 = this.text.equalsIgnoreCase("") && !typing ? "Поиск" : this.text;
      Helper140 var9 = Releon.method71().method30();
      var9.method1209(var6.peek().getPositionMatrix(), this.x + 1.0F, this.y, this.width - 3.0F, this.height);
      if (typing && this.selectionStart != -1 && this.selectionEnd != -1 && this.selectionStart != this.selectionEnd) {
         int var10 = Math.max(0, Math.min(this.method3055(), this.text.length()));
         int var11 = Math.max(0, Math.min(this.method3056(), this.text.length()));
         if (var10 < var11) {
            float var12 = this.x + 4.0F - this.xOffset + var7.method1479(this.text.substring(0, var10));
            float var13 = this.x + 4.0F - this.xOffset + var7.method1479(this.text.substring(0, var11));
            float var14 = var13 - var12;
            rectangle.method677(Helper80.method841(var6, var12, this.y + this.height / 2.0F - 4.0F, var14, 8.0).method823(-11172376).method840());
         }
      }

      var7.method1474(var1.getMatrices(), var8, this.x + 4.0F - this.xOffset, this.y + this.height / 2.0F - 1.0F, typing ? -1 : -7894892);
      var9.method1210();
      long var15 = System.currentTimeMillis();
      boolean var16 = typing && var15 % 1000L < 500L;
      if (var16 && (this.selectionStart == -1 || this.selectionStart == this.selectionEnd)) {
         float var17 = var7.method1479(this.text.substring(0, this.cursorPosition));
         rectangle.method677(
            Helper80.method841(var6, this.x + 4.0F - this.xOffset + var17, this.y + this.height / 2.0F - 3.5F, 0.5, 7.0).method823(-1).method840()
         );
      }

      if (this.dragging) {
         double[] var18 = this.method3046(var2, var3);
         this.cursorPosition = this.method3058(var18[0]);
         if (this.selectionStart == -1) {
            this.selectionStart = this.cursorPosition;
         }

         this.selectionEnd = this.cursorPosition;
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      double[] var6 = this.method3046(var1, var3);
      boolean var7 = Helper147.method1224(var6[0], var6[1], this.x, this.y, this.width, this.height);
      if (var7 && var5 == 0) {
         long var8 = System.currentTimeMillis();
         if (var8 - this.lastClickTime < 250L) {
            this.selectionStart = 0;
            this.selectionEnd = this.text.length();
         } else {
            typing = true;
            this.dragging = true;
            this.lastClickTime = var8;
            this.cursorPosition = this.method3058(var6[0]);
            this.selectionStart = this.cursorPosition;
            this.selectionEnd = this.cursorPosition;
         }
      } else if (!var7) {
         typing = false;
         this.method3057();
      }

      return super.method247(var1, var3, var5);
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.dragging = false;
      }

      return super.method248(var1, var3, var5);
   }

   @Override
   public boolean method251(char var1, int var2) {
      if (typing && Helper103.method926(12).method1479(this.text) < 55.0F) {
         this.method3060();
         this.text = this.text.substring(0, this.cursorPosition) + var1 + this.text.substring(this.cursorPosition);
         this.cursorPosition++;
         this.method3057();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      if (typing) {
         if (Screen.hasControlDown()) {
            switch (var1) {
               case 65:
                  this.method3049();
                  break;
               case 67:
                  this.method3048();
                  break;
               case 86:
                  this.method3047();
            }
         } else {
            switch (var1) {
               case 257:
               case 259:
                  this.method3050(var1);
               case 258:
               case 260:
               case 261:
               default:
                  break;
               case 262:
               case 263:
                  this.method3051(var1);
            }
         }
      }

      return super.method250(var1, var2, var3);
   }

   private double[] method3046(double var1, double var3) {
      Widget16 var5 = Widget16.INSTANCE;
      float var6 = var5.method2890();
      float var7 = var5.x + var5.width / 2.0F;
      float var8 = var5.y + var5.height / 2.0F;
      double var9 = (var1 - var7) / var6 + var7;
      double var11 = (var3 - var8) / var6 + var8;
      return new double[]{var9, var11};
   }

   private void method3047() {
      String var1 = GLFW.glfwGetClipboardString(window.getHandle());
      if (var1 != null) {
         this.method3060();
         this.method3052(this.cursorPosition, this.cursorPosition, var1);
      }
   }

   private void method3048() {
      if (this.method3053()) {
         GLFW.glfwSetClipboardString(window.getHandle(), this.method3054());
      }
   }

   private void method3049() {
      this.selectionStart = 0;
      this.selectionEnd = this.text.length();
      this.cursorPosition = this.text.length();
   }

   private void method3050(int var1) {
      if (var1 == 259) {
         if (this.method3053()) {
            this.method3052(this.method3055(), this.method3056(), "");
         } else if (this.cursorPosition > 0) {
            this.method3052(this.cursorPosition - 1, this.cursorPosition, "");
         }
      } else if (var1 == 257) {
         typing = false;
         this.method3057();
      }
   }

   private void method3051(int var1) {
      if (Screen.hasShiftDown()) {
         if (this.selectionStart == -1) {
            this.selectionStart = this.cursorPosition;
         }
      } else {
         this.method3057();
      }

      if (var1 == 263 && this.cursorPosition > 0) {
         this.cursorPosition--;
      } else if (var1 == 262 && this.cursorPosition < this.text.length()) {
         this.cursorPosition++;
      }

      if (Screen.hasShiftDown()) {
         this.selectionEnd = this.cursorPosition;
      }
   }

   private void method3052(int var1, int var2, String var3) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > this.text.length()) {
         var2 = this.text.length();
      }

      if (var1 > var2) {
         int var4 = var1;
         var1 = var2;
         var2 = var4;
      }

      this.text = this.text.substring(0, var1) + var3 + this.text.substring(var2);
      this.cursorPosition = var1 + var3.length();
      this.method3057();
   }

   private boolean method3053() {
      return this.selectionStart != -1 && this.selectionEnd != -1 && this.selectionStart != this.selectionEnd;
   }

   private String method3054() {
      return this.text.substring(this.method3055(), this.method3056());
   }

   private int method3055() {
      return Math.min(this.selectionStart, this.selectionEnd);
   }

   private int method3056() {
      return Math.max(this.selectionStart, this.selectionEnd);
   }

   private void method3057() {
      this.selectionStart = -1;
      this.selectionEnd = -1;
   }

   private int method3058(double var1) {
      Helper175 var3 = Helper103.method926(12);
      float var4 = (float)var1 - this.x - 4.0F + this.xOffset;

      int var5;
      for (var5 = 0; var5 < this.text.length(); var5++) {
         float var6 = var3.method1479(this.text.substring(var5, var5 + 1));
         float var7 = var3.method1479(this.text.substring(0, var5));
         if (var7 + var6 / 2.0F > var4) {
            break;
         }
      }

      return Math.max(0, Math.min(var5, this.text.length()));
   }

   private void method3059(Helper175 var1, int var2) {
      float var3 = var1.method1479(this.text.substring(0, Math.min(var2, this.text.length())));
      float var4 = this.width - 8.0F;
      if (var3 < this.xOffset) {
         this.xOffset = Math.max(0.0F, var3 - 10.0F);
      } else if (var3 - this.xOffset > var4) {
         this.xOffset = var3 - var4 + 10.0F;
      }

      if (this.xOffset < 0.0F) {
         this.xOffset = 0.0F;
      }
   }

   private void method3060() {
      if (this.method3053()) {
         this.method3052(this.method3055(), this.method3056(), "");
      }
   }

   public String method3061() {
      return this.text;
   }
}
