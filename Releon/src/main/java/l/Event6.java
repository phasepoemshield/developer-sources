package l;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class Event6 implements Helper41 {
   private AbstractClientPlayerEntity player;
   private ItemStack stack;
   private Hand hand;

   public AbstractClientPlayerEntity method3668() {
      return this.player;
   }

   public ItemStack method3669() {
      return this.stack;
   }

   public Hand method3670() {
      return this.hand;
   }

   public void method3671(AbstractClientPlayerEntity var1) {
      this.player = var1;
   }

   public void method3672(ItemStack var1) {
      this.stack = var1;
   }

   public void method3673(Hand var1) {
      this.hand = var1;
   }

   public Event6(AbstractClientPlayerEntity var1, ItemStack var2, Hand var3) {
      this.player = var1;
      this.stack = var2;
      this.hand = var3;
   }
}
