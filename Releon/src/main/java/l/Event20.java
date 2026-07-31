package l;

import net.minecraft.client.gui.DrawContext;

public class Event20 implements Helper41 {
   private DrawContext drawContext;
   private Helper169 drawEngine;
   private float partialTicks;

   public DrawContext method4058() {
      return this.drawContext;
   }

   public Helper169 method4059() {
      return this.drawEngine;
   }

   public float method4060() {
      return this.partialTicks;
   }

   public Event20(DrawContext var1, Helper169 var2, float var3) {
      this.drawContext = var1;
      this.drawEngine = var2;
      this.partialTicks = var3;
   }
}
