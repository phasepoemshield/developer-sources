package l;

import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Helper35 {
   private final int slot;
   private final boolean found;
   private final ItemStack stack;
   private static final Helper35 NOT_FOUND_RESULT = new Helper35(-1, false, null);

   public Helper35(int var1, boolean var2, ItemStack var3) {
      this.slot = var1;
      this.found = var2;
      this.stack = var3;
   }

   public static Helper35 method498() {
      return NOT_FOUND_RESULT;
   }

   @NotNull
   public static Helper35 method499(ItemStack var0) {
      return new Helper35(999, true, var0);
   }

   public boolean method500() {
      return Helper160.mc.player == null ? false : Helper160.mc.player.getInventory().selectedSlot == this.slot;
   }

   public boolean method501() {
      return this.slot < 9;
   }

   public void method502() {
      if (this.found && this.method501()) {
         Helper70.method767(this.slot);
      }
   }

   public void method503() {
      if (this.found && this.method501()) {
         Helper70.method768(this.slot);
      }
   }

   public int method504() {
      return this.slot;
   }

   public boolean method505() {
      return this.found;
   }

   public ItemStack method506() {
      return this.stack;
   }
}
