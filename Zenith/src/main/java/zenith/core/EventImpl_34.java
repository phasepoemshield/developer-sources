package zenith;

import net.minecraft.client.util.math.MatrixStack;

public final class EventImpl_34 implements Event {
   private final MatrixStack I11llII1IlIll1lllllII1IlI;
   private final float llIIl1lllllII;

   public MatrixStack Norender() {
      return this.I11llII1IlIll1lllllII1IlI;
   }

   public float Particles() {
      return this.llIIl1lllllII;
   }

   public EventImpl_34(MatrixStack MatrixStack, float f) {
      this.I11llII1IlIll1lllllII1IlI = MatrixStack;
      this.llIIl1lllllII = f;
   }
}
