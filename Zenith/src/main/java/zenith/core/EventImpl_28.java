package zenith;

import net.minecraft.screen.slot.Slot;

public class EventImpl_28 implements Event {
   private final net.minecraft.client.gui.DrawContext Il1II1lIll1Illl11llIl111;
   private final Slot lIl111lll1llIlI;
   private final int l11lIIlIIllIllIl;
   private final int IIIIII11l1IIl1l11lI1l1ll;

   public net.minecraft.client.gui.DrawContext Crosshair() {
      return this.Il1II1lIll1Illl11llIl111;
   }

   public Slot Entityesp() {
      return this.lIl111lll1llIlI;
   }

   public int Eventhelper() {
      return this.l11lIIlIIllIllIl;
   }

   public int Fireworkesp() {
      return this.IIIIII11l1IIl1l11lI1l1ll;
   }

   public EventImpl_28(net.minecraft.client.gui.DrawContext DrawContext, Slot Slot, int i, int j) {
      this.Il1II1lIll1Illl11llIl111 = DrawContext;
      this.lIl111lll1llIlI = Slot;
      this.l11lIIlIIllIllIl = i;
      this.IIIIII11l1IIl1l11lI1l1ll = j;
   }
}
