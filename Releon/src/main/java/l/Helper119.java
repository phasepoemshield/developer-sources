package l;

import fat.releon.Releon;
import net.minecraft.client.gui.DrawContext;

public abstract class Helper119 implements Helper39, Helper94, Helper160 {
   private String name;
   private int x;
   private int y;
   private int width;
   private int height;
   private boolean dragging;
   private boolean canDrag;
   private int dragX;
   private int dragY;
   public final Helper467 scaleAnimation = new Animation2().method5004(1.0).method5003(200);

   public Helper119(String var1, int var2, int var3, int var4, int var5, boolean var6) {
      this.name = var1;
      this.x = var2;
      this.y = var3;
      this.width = var4;
      this.height = var5;
      this.canDrag = var6;
   }

   @Override
   public boolean method307() {
      return true;
   }

   @Override
   public void method308() {
   }

   @Override
   public void method309(Helper386 var1) {
   }

   @Override
   public void method555(DrawContext var1, int var2, int var3, float var4) {
      if (!this.dragging) {
         this.dragX = 0;
         this.dragY = 0;
      }

      Hud var5 = Hud.method1824();
      float var6 = var2 + this.dragX;
      float var7 = var3 + this.dragY;
      int var8 = window.getScaledWidth();
      int var9 = window.getScaledHeight();
      byte var10 = 3;
      if (this.dragging) {
         this.x = (int)Math.max(0.0F, Math.min(var6, (float)(var8 - this.width)));
         this.y = (int)Math.max(0.0F, Math.min(var7, (float)(var9 - this.height)));
      }

      for (Helper119 var12 : Releon.method71().method26().method788()) {
         if (var12.method971(var5, var12) && var12.canDrag && var12 != this) {
            int var13 = var12.x + var12.width + var10;
            int var14 = var12.x - this.width - var10;
            int var15 = var12.y + var12.height + var10;
            int var16 = var12.y - this.height - var10;
            int var17 = var12.y;
            if (Math.abs(var13 - var6) <= var10) {
               this.method965(var13 - 1.5F, 0.0F, 1.0F, var9);
               this.x = var13;
            }

            if (Math.abs(var14 - var6) <= var10) {
               this.method965(var14 + this.width + 1, 0.0F, 1.0F, var9);
               this.x = var14;
            }

            if (Math.abs(var15 - var7) <= var10) {
               this.method965(0.0F, var15 - 1.5F, var8, 1.0F);
               this.y = var15;
            }

            if (Math.abs(var16 - var7) <= var10) {
               this.method965(0.0F, var16 + this.height + 1, var8, 1.0F);
               this.y = var16;
            }

            if (Math.abs(var17 - var7) <= var10) {
               this.method965(0.0F, var17 - 1.5F, var8, 1.0F);
               this.y = var17;
            }
         }
      }

      if (Math.abs(this.x + (this.width - var8) / 2) <= var10) {
         this.method965(var8 / 2.0F - 0.5F, 0.0F, 1.0F, var9);
         this.x = (var8 - this.width) / 2;
      }

      if (Math.abs(this.y + (this.height - var9) / 2) <= var10) {
         this.method965(0.0F, var9 / 2.0F - 0.5F, var8, 1.0F);
         this.y = (var9 - this.height) / 2;
      }
   }

   @Override
   public void method556(Event4 var1) {
      if (Helper38.method548(var1.method3646())) {
         this.dragging = false;
         this.dragX = 0;
         this.dragY = 0;
      }
   }

   @Override
   public boolean method557(double var1, double var3, int var5) {
      if (this.method969(var1, var3) && var5 == 0 && this.canDrag) {
         this.dragging = true;
         this.dragX = this.x - (int)var1;
         this.dragY = this.y - (int)var3;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method558(double var1, double var3, int var5) {
      this.dragging = false;
      this.dragX = 0;
      this.dragY = 0;
      return true;
   }

   public abstract void method310(DrawContext var1);

   public void method965(float var1, float var2, float var3, float var4) {
      Helper178.method1516(var1, var2, var3, var4, Helper133.method1159(0.5F));
   }

   public void method966() {
      this.scaleAnimation.method4997(Helper450.BACKWARDS);
   }

   public void method967() {
      this.scaleAnimation.method4997(Helper450.FORWARDS);
   }

   public void method968() {
      if (this.x + this.width > window.getScaledWidth()) {
         this.x = window.getScaledWidth() - this.width;
      }

      if (this.y + this.height > window.getScaledHeight()) {
         this.y = window.getScaledHeight() - this.height;
      }

      if (this.y < 0) {
         this.y = 0;
      }

      if (this.x < 0) {
         this.x = 0;
      }
   }

   public boolean method969(double var1, double var3) {
      return var1 >= this.x && var1 <= this.x + this.width && var3 >= this.y && var3 <= this.y + this.height;
   }

   public boolean method970() {
      return this.scaleAnimation.method4995(Helper450.BACKWARDS);
   }

   public boolean method971(Hud var1, Helper119 var2) {
      return var1.isState() && var1.interfaceSettings.method2588(var2.getName()) && this.method307();
   }

   public void method972(String var1) {
      this.name = var1;
   }

   public void method973(int var1) {
      this.x = var1;
   }

   public void method974(int var1) {
      this.y = var1;
   }

   public void method975(int var1) {
      this.width = var1;
   }

   public void method976(int var1) {
      this.height = var1;
   }

   public void method977(boolean var1) {
      this.dragging = var1;
   }

   public void method978(boolean var1) {
      this.canDrag = var1;
   }

   public void method979(int var1) {
      this.dragX = var1;
   }

   public void method980(int var1) {
      this.dragY = var1;
   }

   public String getName() {
      return this.name;
   }

   public int method981() {
      return this.x;
   }

   public int method982() {
      return this.y;
   }

   public int method983() {
      return this.width;
   }

   public int method984() {
      return this.height;
   }

   public boolean method985() {
      return this.dragging;
   }

   public boolean method986() {
      return this.canDrag;
   }

   public int method987() {
      return this.dragX;
   }

   public int method988() {
      return this.dragY;
   }

   public Helper467 method989() {
      return this.scaleAnimation;
   }
}
