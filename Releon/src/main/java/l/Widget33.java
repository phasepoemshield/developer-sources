package l;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public abstract class Widget33 extends Widget35 {
   private boolean binding;

   protected abstract int getKey();

   protected abstract void setKey(int var1);

   protected abstract int getType();

   protected abstract void setType(int var1);

   @Override
   public void method284(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      rectangle.method677(
         Helper80.method841(var5, this.x, this.y, this.width, this.height).method826(4.0F).method834(25.0F).method823(838860800).method840()
      );
      rectangle.method677(
         Helper80.method841(var5, this.x, this.y, this.width, this.height)
            .method826(4.0F)
            .method835(2.0F)
            .method839(Helper133.method1165(0.8F, 1.0F))
            .method823(Helper133.method1157(1.0F))
            .method840()
      );
      Helper103.method926(14).method1474(var5, "Binding module", this.x + 5.0F, this.y + 8.0F, -1);
      image.method678("textures/trash.png").method677(Helper80.method841(var5, this.x + this.width - 13.0F, this.y + 5.3F, 8.0, 8.0).method840());
      this.method4816(var5);
      this.method4817(var5);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (var5 == 0) {
         if (Helper147.method1224(var1, var3, this.x + this.width - 57.0F, this.y + 37.0F, 52.0, 13.0)) {
            this.setType(this.getType() != 1 ? 1 : 0);
         }

         float var6 = Helper103.method926(14).method1479(Helper209.method1791(this.getKey()));
         if (Helper147.method1224(var1, var3, this.x + this.width - var6 - 15.0F, this.y + 18.8F, var6 + 10.0F, 13.0)) {
            this.binding = !this.binding;
         }

         if (Helper147.method1224(var1, var3, this.x + this.width - 13.0F, this.y + 5.3F, 8.0, 8.0)) {
            this.setKey(-1);
         }
      }

      if (this.binding && var5 > 1) {
         this.setKey(var5);
         this.binding = false;
      }

      return super.method247(var1, var3, var5);
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      int var4 = var1 == 261 ? -1 : var1;
      if (this.binding) {
         this.setKey(var4);
         this.binding = false;
      }

      return super.method250(var1, var2, var3);
   }

   private void method4816(MatrixStack var1) {
      float var2 = Helper103.method926(14).method1479(Helper209.method1791(this.getKey()));
      rectangle.method677(
         Helper80.method841(var1, this.x + this.width - var2 - 15.0F, this.y + 18.8F, var2 + 10.0F, 13.0)
            .method826(2.0F)
            .method835(2.0F)
            .method834(1.0F)
            .method839(Helper133.method1165(0.8F, 1.0F))
            .method823(Helper133.method1165(0.1F, 1.0F))
            .method840()
      );
      int var3 = this.binding ? -8288257 : -2828575;
      Helper103.method926(14).method1474(var1, Helper209.method1791(this.getKey()), this.x + this.width - 10.0F - var2, this.y + 23.6F, var3);
      Helper103.method926(14).method1474(var1, "Key", (int)(this.x + 5.0F), (int)(this.y + 24.3), -2828575);
   }

   private void method4817(MatrixStack var1) {
      rectangle.method677(
         Helper80.method841(var1, this.x + this.width - 57.0F, this.y + 37.0F, 52.0, 13.0)
            .method826(2.0F)
            .method835(2.0F)
            .method834(1.0F)
            .method839(Helper133.method1165(0.8F, 1.0F))
            .method823(Helper133.method1165(0.1F, 1.0F))
            .method840()
      );
      if (this.getType() == 1) {
         rectangle.method677(
            Helper80.method841(var1, this.x + this.width - 34.0F, this.y + 37.0F, 29.0, 13.0)
               .method828(2.0F, 2.0F, 0.0F, 0.0F)
               .method823(-8288257)
               .method840()
         );
      } else {
         rectangle.method677(
            Helper80.method841(var1, this.x + this.width - 57.0F, this.y + 37.0F, 23.0, 13.0)
               .method828(0.0F, 0.0F, 2.0F, 2.0F)
               .method823(-8288257)
               .method840()
         );
      }

      Helper103.method926(12).method1474(var1, "HOLD", this.x + 52.0F, this.y + 42.3, -2828575);
      Helper103.method926(12).method1474(var1, "TOGGLE", this.x + 73.0F, this.y + 42.3, -2828575);
      Helper103.method926(14).method1474(var1, "Bind mode", (int)(this.x + 5.0F), (int)(this.y + 42.3F), -2828575);
   }

   public Widget33() {
   }
}
