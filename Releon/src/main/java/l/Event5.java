package l;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.screen.slot.Slot;

public class Event5 implements Helper41 {
   private DrawContext drawContext;
   private Slot slotHover;
   private int backgroundWidth;
   private int backgroundHeight;

   public DrawContext method3656() {
      return this.drawContext;
   }

   public Slot method3657() {
      return this.slotHover;
   }

   public int method3658() {
      return this.backgroundWidth;
   }

   public int method3659() {
      return this.backgroundHeight;
   }

   public Event5(DrawContext var1, Slot var2, int var3, int var4) {
      this.drawContext = var1;
      this.slotHover = var2;
      this.backgroundWidth = var3;
      this.backgroundHeight = var4;
   }
}
