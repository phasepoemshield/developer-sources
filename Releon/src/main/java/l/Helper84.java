package l;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;

public class Helper84 extends Helper88 {
   DrawContext context;
   RenderTickCounter tickCounter;

   public DrawContext method872() {
      return this.context;
   }

   public RenderTickCounter method873() {
      return this.tickCounter;
   }

   public Helper84(DrawContext var1, RenderTickCounter var2) {
      this.context = var1;
      this.tickCounter = var2;
   }
}
