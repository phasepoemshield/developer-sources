package l;

import net.minecraft.client.gui.DrawContext;

public abstract class Widget35 extends Helper296 {
   protected boolean dragging;
   private boolean draggable;
   protected int dragX;
   protected int dragY;
   private final Helper32 scaleAnimation = new Helper32(320, 1.0, 1.5F, Helper449.FORWARDS);

   public Widget35() {
   }

   public Widget35 method4826(boolean var1) {
      this.draggable = var1;
      return this;
   }

   public Widget35 method4827(float var1, float var2) {
      this.width = var1;
      this.height = var2;
      return this;
   }

   public Widget35 method4828(float var1, float var2) {
      this.x = var1;
      this.y = var2;
      return this;
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (this.method4829(var1, var3) && var5 == 0 && this.draggable) {
         this.dragging = true;
         this.dragX = (int)(this.x - var1);
         this.dragY = (int)(this.y - var3);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      if (this.dragging && this.draggable) {
         this.x = var2 + this.dragX;
         this.y = var3 + this.dragY;
      }

      float var5 = (float)this.scaleAnimation.method472();
      Helper147.method1230(var1.getMatrices(), this.x + this.width / 2.0F, this.y + this.height / 2.0F, var5, () -> this.method284(var1, var2, var3, var4));
   }

   protected abstract void method284(DrawContext var1, int var2, int var3, float var4);

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.dragging = false;
      return true;
   }

   public boolean method4829(double var1, double var3) {
      return var1 >= this.x && var1 <= this.x + this.width && var3 >= this.y && var3 <= this.y + this.height;
   }

   public void method4830() {
      this.scaleAnimation.method469(Helper449.BACKWARDS);
   }

   public boolean method4831() {
      return this.scaleAnimation.method461(Helper449.BACKWARDS);
   }

   public Helper32 method4832() {
      return this.scaleAnimation;
   }
}
