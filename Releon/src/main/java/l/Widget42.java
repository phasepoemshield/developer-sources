package l;

import fat.releon.Releon;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;

public class Widget42 extends Helper296 {
   private static final float PANEL_WIDTH = 100.0F;
   private static final float PANEL_HEIGHT = 120.0F;
   private static final float HEADER_HEIGHT = 16.0F;
   private static final float CONFIG_ITEM_HEIGHT = 13.0F;
   private static final float INPUT_HEIGHT = 13.0F;
   private static final float PADDING = 4.0F;
   private static final float SCROLL_STEP = 10.0F;
   private final List<String> configs = new ArrayList<>();
   private float scroll = 0.0F;
   private float smoothedScroll = 0.0F;
   public static boolean typing = false;
   private String inputText = "";
   private int cursorPosition = 0;
   private int selectionStart = -1;
   private int selectionEnd = -1;
   private boolean dragging = false;
   private long lastClickTime = 0L;
   private float xOffset = 0.0F;

   public Widget42() {
      this.method4887();
   }

   public void method4887() {
      this.configs.clear();
      File var1 = new File(Releon.method71().method31().method3927(), "Custom");
      if (!var1.exists()) {
         var1.mkdirs();
      }

      File[] var2 = var1.listFiles();
      if (var2 != null) {
         for (File var6 : var2) {
            if (var6.isFile() && var6.getName().endsWith(".clysm")) {
               this.configs.add(var6.getName().replace(".clysm", ""));
            }
         }
      }
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      Matrix4f var6 = var5.peek().getPositionMatrix();
      blur.method677(
         Helper80.method841(var5, this.x, this.y, 100.0, 120.0)
            .method826(7.5F)
            .method838(32.0F)
            .method834(25.0F)
            .method823(Widget16.INSTANCE.method2913().method351())
            .method840()
      );
      rectangle.method677(
         Helper80.method841(var5, this.x, this.y + 16.0F, 100.0, 0.5)
            .method825(
               new Color(55, 55, 70, 180).getRGB(), new Color(55, 55, 70, 15).getRGB(), new Color(55, 55, 70, 180).getRGB(), new Color(55, 55, 70, 15).getRGB()
            )
            .method840()
      );
      int var7 = Hud.method1824().colorSetting.method2553();
      Helper175 var8 = Helper103.method927(20, Helper101.ICONSCATEGORY);
      Helper175 var9 = Helper103.method927(15, Helper101.DEFAULT);
      String var10 = "m";
      String var11 = "CONFIGS";
      float var12 = var8.method1479(var10);
      float var13 = var9.method1479(var11);
      float var14 = var12 + 4.0F + var13;
      float var15 = this.x + (100.0F - var14) / 2.0F;
      float var16 = this.y + 6.4F;
      var8.method1474(var5, var10, var15, var16 + 1.0F, var7);
      var9.method1474(var5, var11, var15 + var12 + 4.0F, var16 + 1.5F, var7);
      float var17 = this.y + 16.0F + 4.0F;
      float var18 = 79.0F;
      Helper140 var19 = Releon.method71().method30();
      var19.method1209(var6, this.x + 4.0F, var17, 92.0F, var18);
      float var20 = 0.0F;
      float var21 = 0.0F;
      float var22 = Math.round(this.smoothedScroll);

      for (int var23 = 0; var23 < this.configs.size(); var23++) {
         String var24 = this.configs.get(var23);
         float var25 = var17 + var20 + var22;
         this.method4888(var5, var24, this.x + 4.0F, var25, 92.0F, 13.0F, var2, var3);
         var20 += 15.0F;
         var21 += 15.0F;
      }

      var19.method1210();
      float var26 = Math.max(0.0F, var21 - var18);
      this.scroll = MathHelper.clamp(this.scroll, -var26, 0.0F);
      this.smoothedScroll = Helper147.method1250(2.0, this.smoothedScroll, this.scroll);
      float var27 = this.y + 120.0F - 13.0F - 4.0F;
      this.method4889(var1, this.x + 4.0F, var27, 92.0F, 13.0F, var2, var3);
   }

   private void method4888(MatrixStack var1, String var2, float var3, float var4, float var5, float var6, int var7, int var8) {
      Helper175 var9 = Helper103.method927(18, Helper101.ICONSCATEGORY);
      Helper175 var10 = Helper103.method927(14, Helper101.ICONSCATEGORY);
      Helper175 var11 = Helper103.method927(11, Helper101.DEFAULT);
      boolean var12 = Helper147.method1224(var7, var8, var3, var4, var5, var6);
      rectangle.method677(
         Helper80.method841(var1, var3, var4, var5, var6)
            .method826(4.0F)
            .method823(var12 ? new Color(40, 40, 50, 120).getRGB() : new Color(25, 25, 35, 80).getRGB())
            .method840()
      );
      var9.method1474(var1, "h", var3 + 2.0F, var4 + (var6 - 13.0F) / 2.0F + 5.0F, -2828575);
      String var13 = var2;
      float var14 = var5 - 50.0F;
      if (var11.method1479(var2) > var14) {
         while (var11.method1479(var13 + "...") > var14 && var13.length() > 0) {
            var13 = var13.substring(0, var13.length() - 1);
         }

         var13 = var13 + "...";
      }

      var11.method1474(var1, var13, var3 + 18.0F, var4 + (var6 - 8.0F) / 2.0F + 3.0F, -2828575);
      float var15 = var3 + var5 - 28.0F;
      boolean var16 = Helper147.method1224(var7, var8, var15, var4 + 1.0F, 13.0, var6 - 2.0F);
      var10.method1474(var1, "j", var15, var4 + (var6 - 10.0F) / 2.0F + 4.0F, var16 ? -8650885 : -7894892);
      float var17 = var3 + var5 - 13.0F;
      boolean var18 = Helper147.method1224(var7, var8, var17, var4 + 1.0F, 13.0, var6 - 2.0F);
      var10.method1474(var1, "l", var17, var4 + (var6 - 10.0F) / 2.0F + 4.0F, var18 ? -33925 : -7894892);
   }

   private void method4889(DrawContext var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      MatrixStack var8 = var1.getMatrices();
      Helper175 var9 = Helper103.method927(10, Helper101.DEFAULT);
      Helper175 var10 = Helper103.method927(14, Helper101.ICONSCATEGORY);
      this.method4906(var9, this.cursorPosition);
      float var11 = var4 - 18.0F;
      rectangle.method677(Helper80.method841(var8, var2, var3, var11, var5).method826(4.0F).method823(new Color(25, 25, 35, 120).getRGB()).method840());
      Helper140 var12 = Releon.method71().method30();
      var12.method1209(var8.peek().getPositionMatrix(), var2 + 2.0F, var3, var11 - 4.0F, var5);
      String var13 = this.inputText.isEmpty() && !typing ? "Name..." : this.inputText;
      if (typing && this.selectionStart != -1 && this.selectionEnd != -1 && this.selectionStart != this.selectionEnd) {
         int var14 = Math.max(0, Math.min(this.method4902(), this.inputText.length()));
         int var15 = Math.max(0, Math.min(this.method4903(), this.inputText.length()));
         if (var14 < var15) {
            float var16 = var2 + 4.0F - this.xOffset + var9.method1479(this.inputText.substring(0, var14));
            float var17 = var2 + 4.0F - this.xOffset + var9.method1479(this.inputText.substring(0, var15));
            float var18 = var17 - var16;
            rectangle.method677(Helper80.method841(var8, var16, var3 + var5 / 2.0F - 4.0F, var18, 8.0).method823(-11172376).method840());
         }
      }

      var9.method1474(var8, var13, var2 + 4.0F - this.xOffset, var3 + var5 / 2.0F - 2.0F, typing ? -1 : -7894892);
      long var21 = System.currentTimeMillis();
      boolean var22 = typing && var21 % 1000L < 500L;
      if (var22 && (this.selectionStart == -1 || this.selectionStart == this.selectionEnd)) {
         float var23 = var9.method1479(this.inputText.substring(0, this.cursorPosition));
         rectangle.method677(Helper80.method841(var8, var2 + 4.0F - this.xOffset + var23, var3 + var5 / 2.0F - 4.0F, 0.5, 8.0).method823(-1).method840());
      }

      var12.method1210();
      float var24 = var2 + var11 + 2.0F;
      boolean var25 = Helper147.method1224(var6, var7, var24, var3, 14.0, var5);
      rectangle.method677(
         Helper80.method841(var8, var24, var3, 14.0, var5)
            .method826(3.0F)
            .method823(var25 ? new Color(50, 50, 60, 150).getRGB() : new Color(35, 35, 45, 120).getRGB())
            .method840()
      );
      float var19 = var10.method1479("z");
      var10.method1474(var8, "z", var24 + (14.0F - var19) / 2.0F, var3 + (var5 - 10.0F) / 2.0F + 3.0F, var25 ? -8650885 : -2828575);
      if (this.dragging) {
         double[] var20 = this.method4893(var6, var7);
         this.cursorPosition = this.method4905(var20[0], var2);
         if (this.selectionStart == -1) {
            this.selectionStart = this.cursorPosition;
         }

         this.selectionEnd = this.cursorPosition;
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (!Helper147.method1224(var1, var3, this.x, this.y, 100.0, 120.0)) {
         typing = false;
         this.method4904();
         return false;
      } else {
         float var6 = this.y + 16.0F + 4.0F;
         float var7 = 79.0F;
         float var8 = this.y + 120.0F - 13.0F - 4.0F;
         float var9 = 92.0F;
         float var10 = var9 - 20.0F;
         if (Helper147.method1224(var1, var3, this.x + 4.0F, var8, var10, 13.0) && var5 == 0) {
            long var20 = System.currentTimeMillis();
            if (var20 - this.lastClickTime < 250L) {
               this.selectionStart = 0;
               this.selectionEnd = this.inputText.length();
            } else {
               typing = true;
               this.dragging = true;
               this.lastClickTime = var20;
               double[] var21 = this.method4893(var1, var3);
               this.cursorPosition = this.method4905(var21[0], this.x + 4.0F);
               this.selectionStart = this.cursorPosition;
               this.selectionEnd = this.cursorPosition;
            }

            return true;
         } else {
            float var11 = this.x + 4.0F + var10 + 4.0F;
            if (Helper147.method1224(var1, var3, var11, var8, 16.0, 13.0) && var5 == 0) {
               this.method4890();
               return true;
            } else {
               if (Helper147.method1224(var1, var3, this.x + 4.0F, var6, 92.0, var7)) {
                  float var12 = 0.0F;
                  float var13 = Math.round(this.smoothedScroll);

                  for (int var14 = 0; var14 < this.configs.size(); var14++) {
                     String var15 = this.configs.get(var14);
                     float var16 = var6 + var12 + var13;
                     float var17 = 92.0F;
                     if (Helper147.method1224(var1, var3, this.x + 4.0F, var16, var17, 13.0)) {
                        float var18 = this.x + 4.0F + var17 - 28.0F;
                        if (Helper147.method1224(var1, var3, var18, var16 + 1.0F, 13.0, 11.0)) {
                           this.method4891(var15);
                           return true;
                        }

                        float var19 = this.x + 4.0F + var17 - 13.0F;
                        if (Helper147.method1224(var1, var3, var19, var16 + 1.0F, 13.0, 11.0)) {
                           this.method4892(var15);
                           return true;
                        }
                     }

                     var12 += 15.0F;
                  }
               }

               typing = false;
               this.method4904();
               return true;
            }
         }
      }
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.dragging = false;
      }

      return false;
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      if (Helper147.method1224(var1, var3, this.x, this.y, 100.0, 120.0)) {
         this.scroll = (float)(this.scroll + var5 * 10.0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method251(char var1, int var2) {
      if (typing) {
         float var3 = Math.max(0.0F, 62.0F);
         if (Helper103.method926(11).method1479(this.inputText) < var3) {
            this.method4907();
            this.inputText = this.inputText.substring(0, this.cursorPosition) + var1 + this.inputText.substring(this.cursorPosition);
            this.cursorPosition++;
            this.method4904();
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      if (typing) {
         if (Screen.hasControlDown()) {
            switch (var1) {
               case 65:
                  this.method4896();
                  break;
               case 67:
                  this.method4895();
                  break;
               case 86:
                  this.method4894();
            }
         } else {
            switch (var1) {
               case 257:
                  this.method4890();
                  typing = false;
               case 258:
               case 260:
               case 261:
               default:
                  break;
               case 259:
                  this.method4897();
                  break;
               case 262:
               case 263:
                  this.method4898(var1);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void method4890() {
      if (!this.inputText.isEmpty()) {
         try {
            File var1 = new File(Releon.method71().method31().method3927(), "Custom");
            if (!var1.exists()) {
               var1.mkdirs();
            }

            AutoCfg var2 = new AutoCfg(Releon.method71().method17(), Releon.method71().method26());
            var2.method879(var1, this.inputText + ".clysm");
            Helper56.method645(Helper56.ENABLE_MODULE);
            this.inputText = "";
            this.cursorPosition = 0;
            this.method4904();
            this.method4887();
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }
   }

   private void method4891(String var1) {
      try {
         File var2 = new File(Releon.method71().method31().method3927(), "Custom");
         File var3 = new File(var2, var1 + ".clysm");
         if (var3.exists() && var3.length() > 0L) {
            AutoCfg var4 = new AutoCfg(Releon.method71().method17(), Releon.method71().method26());
            var4.method880(var2, var1 + ".clysm");
            Helper56.method645(Helper56.ENABLE_MODULE);
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   private void method4892(String var1) {
      try {
         File var2 = new File(Releon.method71().method31().method3927(), "Custom");
         File var3 = new File(var2, var1 + ".clysm");
         if (var3.exists()) {
            var3.delete();
            this.method4887();
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   private double[] method4893(double var1, double var3) {
      Widget16 var5 = Widget16.INSTANCE;
      float var6 = var5.method2890();
      float var7 = var5.x + var5.width / 2.0F;
      float var8 = var5.y + var5.height / 2.0F;
      double var9 = (var1 - var7) / var6 + var7;
      double var11 = (var3 - var8) / var6 + var8;
      return new double[]{var9, var11};
   }

   private void method4894() {
      String var1 = GLFW.glfwGetClipboardString(window.getHandle());
      if (var1 != null) {
         this.method4907();
         this.method4899(this.cursorPosition, this.cursorPosition, var1);
      }
   }

   private void method4895() {
      if (this.method4900()) {
         GLFW.glfwSetClipboardString(window.getHandle(), this.method4901());
      }
   }

   private void method4896() {
      this.selectionStart = 0;
      this.selectionEnd = this.inputText.length();
      this.cursorPosition = this.inputText.length();
   }

   private void method4897() {
      if (this.method4900()) {
         this.method4899(this.method4902(), this.method4903(), "");
      } else if (this.cursorPosition > 0) {
         this.method4899(this.cursorPosition - 1, this.cursorPosition, "");
      }
   }

   private void method4898(int var1) {
      if (Screen.hasShiftDown()) {
         if (this.selectionStart == -1) {
            this.selectionStart = this.cursorPosition;
         }
      } else {
         this.method4904();
      }

      if (var1 == 263 && this.cursorPosition > 0) {
         this.cursorPosition--;
      } else if (var1 == 262 && this.cursorPosition < this.inputText.length()) {
         this.cursorPosition++;
      }

      if (Screen.hasShiftDown()) {
         this.selectionEnd = this.cursorPosition;
      }
   }

   private void method4899(int var1, int var2, String var3) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > this.inputText.length()) {
         var2 = this.inputText.length();
      }

      if (var1 > var2) {
         int var4 = var1;
         var1 = var2;
         var2 = var4;
      }

      this.inputText = this.inputText.substring(0, var1) + var3 + this.inputText.substring(var2);
      this.cursorPosition = var1 + var3.length();
      this.method4904();
   }

   private boolean method4900() {
      return this.selectionStart != -1 && this.selectionEnd != -1 && this.selectionStart != this.selectionEnd;
   }

   private String method4901() {
      return this.inputText.substring(this.method4902(), this.method4903());
   }

   private int method4902() {
      return Math.min(this.selectionStart, this.selectionEnd);
   }

   private int method4903() {
      return Math.max(this.selectionStart, this.selectionEnd);
   }

   private void method4904() {
      this.selectionStart = -1;
      this.selectionEnd = -1;
   }

   private int method4905(double var1, float var3) {
      Helper175 var4 = Helper103.method926(11);
      float var5 = (float)var1 - var3 - 4.0F + this.xOffset;

      int var6;
      for (var6 = 0; var6 < this.inputText.length(); var6++) {
         float var7 = var4.method1479(this.inputText.substring(var6, var6 + 1));
         float var8 = var4.method1479(this.inputText.substring(0, var6));
         if (var8 + var7 / 2.0F > var5) {
            break;
         }
      }

      return Math.max(0, Math.min(var6, this.inputText.length()));
   }

   private void method4906(Helper175 var1, int var2) {
      float var3 = var1.method1479(this.inputText.substring(0, Math.min(var2, this.inputText.length())));
      float var4 = 62.0F;
      if (var3 < this.xOffset) {
         this.xOffset = Math.max(0.0F, var3 - 10.0F);
      } else if (var3 - this.xOffset > var4) {
         this.xOffset = var3 - var4 + 10.0F;
      }

      if (this.xOffset < 0.0F) {
         this.xOffset = 0.0F;
      }
   }

   private void method4907() {
      if (this.method4900()) {
         this.method4899(this.method4902(), this.method4903(), "");
      }
   }
}
