package oxxxde

import net.minecraft.client.util.math.MatrixStack
import net.minecraft.item.ItemStack
import net.minecraft.util.Hand

// $VF: Compiled from HandOffsetEvent.kt
public class سع {
   private Hand hand;
   private ItemStack stack;
   private MatrixStack matrices;

   fun getMatrices(): MatrixStack {
      this.matrices
   }

   fun getStack(): ItemStack {
      this.stack
   }

   fun getHand(): Hand {
      this.hand
   }

   fun سع(stack: MatrixStack, matrices: ItemStack, hand: Hand) {
      this.matrices = matrices
      this.stack = stack
      this.hand = hand
   }
}
