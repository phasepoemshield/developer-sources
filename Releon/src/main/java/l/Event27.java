package l;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Hand;

public class Event27 implements Helper41 {
   public Hand hand;
   public MatrixStack matrix;

   public Event27(Hand var1, MatrixStack var2) {
      this.hand = var1;
      this.matrix = var2;
   }

   public Hand method4145() {
      return this.hand;
   }

   public MatrixStack method4146() {
      return this.matrix;
   }

   public void method4147(Hand var1) {
      this.hand = var1;
   }

   public void method4148(MatrixStack var1) {
      this.matrix = var1;
   }
}
