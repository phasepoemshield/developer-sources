package l;

import net.minecraft.client.util.math.MatrixStack;

public class Event10 implements Helper41 {
   private MatrixStack stack;
   private float partialTicks;

   public Event10(MatrixStack var1, float var2) {
      this.stack = var1;
      this.partialTicks = var2;
   }

   public MatrixStack method3708() {
      return this.stack;
   }

   public float method3709() {
      return this.partialTicks;
   }
}
