package l;

import fat.releon.Releon;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;

public class Helper470 extends Widget8 {
   private static final float LABEL_X = 10.0F;
   private static final float LABEL_Y = 7.0F;
   private static final float DESCRIPTION_Y = 16.0F;
   private static final float SCISSOR_HEIGHT = 14.0F;
   private static final float FIELD_WIDTH = 53.0F;
   private static final float FIELD_HEIGHT = 12.0F;
   private static final float FIELD_RIGHT_OFFSET = 8.5F;
   private static final float FIELD_Y = 5.0F;
   private static final float LABEL_RIGHT_GAP = 8.0F;
   public static boolean typing;
   private static Helper470 activeComponent;
   private final Setting6 setting;
   private float rectX;
   private float rectY;
   private float rectWidth;
   private float rectHeight;
   private boolean dragging;
   private int cursorPosition = 0;
   private int selectionStart = -1;
   private int selectionEnd = -1;
   private long lastClickTime = 0L;
   private float xOffset = 0.0F;
   private String text = "";

   public Helper470(Setting6 var1) {
      super(var1);
      this.setting = var1;
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      String var6 = this.method341();
      String var7 = Helper209.method1792(this.method342(), 70, 12);
      Helper175 var8 = Helper103.method926(12);
      float var9 = var8.method1481(var7) / 3.0F;
      float var10 = Math.max(17.0F, 16.0F + var9);
      this.height = Math.max(24, (int)(var10 + 4.0F));
      this.rectWidth = 53.0F;
      this.rectHeight = 12.0F;
      this.rectX = this.x + this.width - this.rectWidth - 8.5F;
      this.rectY = this.y + 5.0F;
      rectangle.method677(
         Helper80.method841(var5, this.rectX, this.rectY - 3.5, this.rectWidth, this.rectHeight)
            .method826(4.0F)
            .method835(2.0F)
            .method839(Helper133.method1167())
            .method823(Helper133.method1155(1.0F))
            .method840()
      );
      float var11 = Math.max(24.0F, this.rectX - (this.x + 10.0F) - 8.0F);
      float var12 = Helper103.method927(12, Helper101.DEFAULT).method1479(var6);
      if (var12 > var11) {
         Helper140 var13 = Releon.method71().method30();
         var13.method1209(var5.peek().getPositionMatrix(), this.x + 10.0F, this.y + 7.0F - 3.0F, var11, 14.0F);
         Helper103.method927(12, Helper101.DEFAULT).method1473(var5, var6, this.x + 10.0F, this.y + 7.0F, var11, -1);
         var13.method1210();
      } else {
         Helper103.method927(12, Helper101.DEFAULT).method1474(var5, var6, this.x + 10.0F, this.y + 7.0F, -1);
      }

      var8.method1474(var1.getMatrices(), var7, this.x + 10.0F, this.y + 16.0F, -7894892);
      this.method5020(var8, this.cursorPosition);
      Helper140 var20 = Releon.method71().method30();
      var20.method1209(var5.peek().getPositionMatrix(), this.rectX + 1.0F, window.getScaledHeight() / 2.0F - 96.0F, this.rectWidth - 3.0F, 220.0F);
      if (this.method5026() && this.selectionStart != -1 && this.selectionEnd != -1 && this.selectionStart != this.selectionEnd) {
         int var14 = Math.min(this.method5016(), this.method5017());
         int var15 = Math.max(this.method5016(), this.method5017());
         if (var14 < var15) {
            float var16 = this.rectX + 3.0F - this.xOffset + var8.method1479(this.text.substring(0, var14));
            float var17 = this.rectX + 3.0F - this.xOffset + var8.method1479(this.text.substring(0, var15));
            float var18 = var17 - var16;
            rectangle.method677(Helper80.method841(var5, var16, this.rectY + this.rectHeight / 2.0F - 8.0F, var18, 8.0).method823(-11172376).method840());
         }
      }

      String var21 = this.method5026() ? this.text : this.setting.method2403();
      int var22 = this.method5026() ? -1 : -7894892;
      if (var21 == null) {
         var21 = "";
      }

      if (var21.isEmpty() && !this.method5026()) {
         var21 = this.method343("Enter text...");
         var22 = -7894892;
      }

      var8.method1474(var1.getMatrices(), var21, this.rectX + 3.0F - this.xOffset, this.rectY + this.rectHeight / 2.0F - 4.0F, var22);
      var20.method1210();
      long var23 = System.currentTimeMillis();
      boolean var24 = this.method5026() && var23 % 1000L < 500L;
      if (var24 && (this.selectionStart == -1 || this.selectionStart == this.selectionEnd)) {
         float var19 = var8.method1479(this.text.substring(0, this.cursorPosition));
         rectangle.method677(
            Helper80.method841(var5, this.rectX + 3.0F - this.xOffset + var19, this.rectY + this.rectHeight / 2.0F - 7.5F, 0.5, 7.0)
               .method823(-1)
               .method840()
         );
      }

      if (this.method5026() && this.dragging) {
         this.cursorPosition = this.method5019(var2);
         this.selectionEnd = this.cursorPosition;
      }
   }

   @Override
   public boolean method2931(double var1, double var3, int var5, double var6, double var8) {
      if (this.method5026()) {
         this.dragging = true;
      }

      return super.method2931(var1, var3, var5, var6, var8);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      boolean var6 = Helper147.method1224(var1, var3, this.rectX, this.rectY, this.rectWidth, this.rectHeight);
      if (var6 && var5 == 0) {
         if (!this.method5026()) {
            method5028(this);
            this.text = this.setting.method2403() == null ? "" : this.setting.method2403();
         }

         long var7 = System.currentTimeMillis();
         if (var7 - this.lastClickTime < 250L) {
            this.selectionStart = 0;
            this.selectionEnd = this.text.length();
            this.cursorPosition = this.text.length();
         } else {
            this.cursorPosition = this.method5019(var1);
            this.selectionStart = this.cursorPosition;
            this.selectionEnd = this.cursorPosition;
         }

         this.dragging = false;
         this.lastClickTime = var7;
         return true;
      } else {
         if (this.method5026()) {
            this.method5027();
            method5028(null);
         }

         this.method5018();
         return super.method247(var1, var3, var5);
      }
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.dragging = false;
      return super.method248(var1, var3, var5);
   }

   @Override
   public boolean method251(char var1, int var2) {
      if (this.method5026() && this.method5022(var1) && this.method5025(var1) && this.method5024() < this.setting.method2405()) {
         this.method5021();
         this.text = this.text.substring(0, this.cursorPosition) + var1 + this.text.substring(this.cursorPosition);
         this.cursorPosition++;
         this.method5018();
         return true;
      } else {
         return super.method251(var1, var2);
      }
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      if (!this.method5026()) {
         return super.method250(var1, var2, var3);
      } else if (Screen.hasControlDown()) {
         switch (var1) {
            case 65:
               this.method5009();
               return true;
            case 67:
               this.method5008();
               return true;
            case 86:
               this.method5007();
               return true;
            default:
               return super.method250(var1, var2, var3);
         }
      } else {
         switch (var1) {
            case 257:
            case 259:
               this.method5010(var1);
               return true;
            case 258:
            case 260:
            case 261:
            default:
               return super.method250(var1, var2, var3);
            case 262:
            case 263:
               this.method5011(var1);
               return true;
         }
      }
   }

   private void method5007() {
      String var1 = GLFW.glfwGetClipboardString(window.getHandle());
      if (var1 != null) {
         var1 = this.method5023(var1);
         if (var1.isEmpty()) {
            return;
         }

         int var2 = this.method5014() ? this.method5017() - this.method5016() : 0;
         if (this.text.length() - var2 + var1.length() <= this.setting.method2405()) {
            if (this.method5014()) {
               this.method5013(this.method5016(), this.method5017(), var1);
            } else {
               this.method5013(this.cursorPosition, this.cursorPosition, var1);
            }
         }
      }
   }

   private void method5008() {
      if (this.method5014()) {
         GLFW.glfwSetClipboardString(window.getHandle(), this.method5015());
      }
   }

   private void method5009() {
      this.selectionStart = 0;
      this.selectionEnd = this.text.length();
      this.cursorPosition = this.text.length();
   }

   private void method5010(int var1) {
      if (var1 == 259) {
         if (this.method5014()) {
            this.method5013(this.method5016(), this.method5017(), "");
         } else if (this.cursorPosition > 0) {
            this.method5013(this.cursorPosition - 1, this.cursorPosition, "");
         }
      } else if (var1 == 257) {
         this.method5027();
         method5028(null);
         this.method5018();
      }
   }

   private void method5011(int var1) {
      if (var1 == 263 && this.cursorPosition > 0) {
         this.cursorPosition--;
      } else if (var1 == 262 && this.cursorPosition < this.text.length()) {
         this.cursorPosition++;
      }

      this.method5012();
   }

   private void method5012() {
      if (Screen.hasShiftDown()) {
         if (this.selectionStart == -1) {
            this.selectionStart = this.cursorPosition;
         }

         this.selectionEnd = this.cursorPosition;
      } else {
         this.method5018();
      }
   }

   private void method5013(int var1, int var2, String var3) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > this.text.length()) {
         var2 = this.text.length();
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.text = this.text.substring(0, var1) + var3 + this.text.substring(var2);
      this.cursorPosition = var1 + var3.length();
      this.method5018();
   }

   private boolean method5014() {
      return this.selectionStart != -1 && this.selectionEnd != -1 && this.selectionStart != this.selectionEnd;
   }

   private String method5015() {
      return this.text.substring(this.method5016(), this.method5017());
   }

   private int method5016() {
      return Math.min(this.selectionStart, this.selectionEnd);
   }

   private int method5017() {
      return Math.max(this.selectionStart, this.selectionEnd);
   }

   private void method5018() {
      this.selectionStart = -1;
      this.selectionEnd = -1;
   }

   private int method5019(double var1) {
      Helper175 var3 = Helper103.method926(12);
      float var4 = (float)var1 - this.rectX - 3.0F + this.xOffset;

      int var5;
      for (var5 = 0; var5 < this.text.length(); var5++) {
         float var6 = var3.method1479(this.text.substring(0, var5 + 1));
         if (var6 > var4) {
            break;
         }
      }

      return var5;
   }

   private void method5020(Helper175 var1, int var2) {
      float var3 = var1.method1479(this.text.substring(0, var2));
      if (var3 < this.xOffset) {
         this.xOffset = var3;
      } else if (var3 - this.xOffset > this.rectWidth - 7.0F) {
         this.xOffset = var3 - (this.rectWidth - 7.0F);
      }
   }

   private void method5021() {
      if (this.method5014()) {
         this.method5013(this.method5016(), this.method5017(), "");
      }
   }

   private boolean method5022(char var1) {
      return var1 >= ' ' && var1 != 127 && var1 != '\n' && var1 != '\r';
   }

   private String method5023(String var1) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         if (this.method5022(var4) && this.method5025(var4)) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   private int method5024() {
      return !this.method5014() ? this.text.length() + 1 : this.text.length() - (this.method5017() - this.method5016()) + 1;
   }

   private boolean method5025(char var1) {
      return this.setting.method2406() == null || this.setting.method2406().test(var1);
   }

   private boolean method5026() {
      return activeComponent == this;
   }

   private void method5027() {
      if (this.text.length() >= this.setting.method2404() && this.text.length() <= this.setting.method2405()) {
         this.setting.method2407(this.text);
      } else {
         this.text = this.setting.method2403() == null ? "" : this.setting.method2403();
      }

      this.dragging = false;
   }

   private static void method5028(Helper470 var0) {
      if (activeComponent != null && activeComponent != var0) {
         activeComponent.method5027();
         activeComponent.method5018();
         activeComponent.dragging = false;
      }

      activeComponent = var0;
      typing = activeComponent != null;
   }

   public static void method5029() {
      if (activeComponent != null) {
         activeComponent.method5027();
         activeComponent.method5018();
         activeComponent.dragging = false;
      }

      activeComponent = null;
      typing = false;
   }
}
