package l;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Hand;

public class Helper411 extends Event3 {
   private MatrixStack matrices;
   private Hand hand;
   private float swingProgress;

   public Helper411(MatrixStack var1, Hand var2, float var3) {
      this.matrices = var1;
      this.hand = var2;
      this.swingProgress = var3;
   }

   public MatrixStack method4215() {
      return this.matrices;
   }

   public Hand method4216() {
      return this.hand;
   }

   public float method4217() {
      return this.swingProgress;
   }

   public void method4218(MatrixStack var1) {
      this.matrices = var1;
   }

   public void method4219(Hand var1) {
      this.hand = var1;
   }

   public void method4220(float var1) {
      this.swingProgress = var1;
   }
}
