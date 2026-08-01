package l;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class Helper361 {
   private int buyBelow;
   private int sellAbove;
   private int minQuantity;
   private final boolean canHaveQuantity;
   private final String itemName;

   public Helper361(int var1, Item var2, String var3) {
      this.itemName = var3;
      this.buyBelow = var1;
      this.sellAbove = (int)(var1 * 1.5);
      this.minQuantity = 1;
      this.canHaveQuantity = this.method3591(var2);
   }

   private boolean method3591(Item var1) {
      return var1 != Items.NETHERITE_HELMET
            && var1 != Items.NETHERITE_CHESTPLATE
            && var1 != Items.NETHERITE_LEGGINGS
            && var1 != Items.NETHERITE_BOOTS
            && var1 != Items.NETHERITE_SWORD
            && var1 != Items.NETHERITE_PICKAXE
            && var1 != Items.CROSSBOW
            && var1 != Items.TRIDENT
            && var1 != Items.MACE
            && var1 != Items.ELYTRA
            && var1 != Items.TOTEM_OF_UNDYING
         ? var1.getMaxCount() > 1
         : false;
   }

   public int method3592() {
      return this.buyBelow;
   }

   public int method3593() {
      return this.sellAbove;
   }

   public int method3594() {
      return this.minQuantity;
   }

   public boolean method3595() {
      return this.canHaveQuantity;
   }

   public String method3596() {
      return this.itemName;
   }

   public void method3597(int var1) {
      this.buyBelow = var1;
   }

   public void method3598(int var1) {
      this.sellAbove = var1;
   }

   public void method3599(int var1) {
      this.minQuantity = var1;
   }
}
