package l;

import net.minecraft.client.gui.screen.Screen;

public class Helper405 extends Event3 {
   private Screen screen;

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Helper405 var2)) {
         return false;
      } else if (!var2.method4149(this)) {
         return false;
      } else if (!super.equals(var1)) {
         return false;
      } else {
         Screen var3 = this.method4150();
         Screen var4 = var2.method4150();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   protected boolean method4149(Object var1) {
      return var1 instanceof Helper405;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = super.hashCode();
      Screen var3 = this.method4150();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   public Screen method4150() {
      return this.screen;
   }

   public void method4151(Screen var1) {
      this.screen = var1;
   }

   @Override
   public String toString() {
      return "CloseScreenEvent(screen=" + this.method4150() + ")";
   }

   public Helper405(Screen var1) {
      this.screen = var1;
   }
}
