package l;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Helper14 implements Helper465 {
   private final String displayName;
   private final ItemStack reference;
   private final Item material;
   private final int price;
   private final Helper361 settings;
   private boolean enabled;

   public Helper14(String var1, Item var2, ItemStack var3, int var4) {
      this.displayName = var1;
      this.material = var2;
      this.reference = var3;
      this.price = var4;
      this.enabled = true;
      this.settings = new Helper361(var4, var2, var1);
      Helper31.method477().method479(var1, this.settings);
   }

   @Override
   public String method364() {
      return this.displayName;
   }

   @Override
   public ItemStack method365() {
      return this.reference.copy();
   }

   @Override
   public int method366() {
      return this.price;
   }

   @Override
   public boolean isEnabled() {
      return this.enabled;
   }

   @Override
   public void method367(boolean var1) {
      this.enabled = var1;
   }

   @Override
   public Helper361 method368() {
      return this.settings;
   }
}
