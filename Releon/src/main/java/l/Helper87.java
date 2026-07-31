package l;

import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.util.math.MatrixStack;

public class Helper87 extends Helper88 {
   MatrixStack stack;
   RenderTickCounter tickCounter;

   public MatrixStack method877() {
      return this.stack;
   }

   public RenderTickCounter method878() {
      return this.tickCounter;
   }

   public Helper87(MatrixStack var1, RenderTickCounter var2) {
      this.stack = var1;
      this.tickCounter = var2;
   }
}
