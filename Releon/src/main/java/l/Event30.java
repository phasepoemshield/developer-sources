package l;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class Event30 implements Helper41 {
   private MatrixStack matrices;
   private ItemStack stack;
   private Hand hand;

   public Event30(MatrixStack var1, ItemStack var2, Hand var3) {
      this.matrices = var1;
      this.stack = var2;
      this.hand = var3;
   }

   public MatrixStack method4628() {
      return this.matrices;
   }

   public ItemStack method4629() {
      return this.stack;
   }

   public Hand method4630() {
      return this.hand;
   }

   public void method4631(MatrixStack var1) {
      this.matrices = var1;
   }

   public void method4632(ItemStack var1) {
      this.stack = var1;
   }

   public void method4633(Hand var1) {
      this.hand = var1;
   }
}
