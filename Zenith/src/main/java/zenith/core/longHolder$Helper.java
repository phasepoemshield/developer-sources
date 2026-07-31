package zenith;

import zenith.hud.*;

import net.minecraft.entity.player.PlayerEntity;

class Notifications$l1lll11l1l {
   private long l1III1I1I11111lIl111IIl111;
   private int lIIlI1IIlI1III1IIll1lI1I1ll;

   private Notifications$l1lll11l1l(Notifications ili1111ii1l1li) {
      this.lI11l11I1II11II1IIl11 = ili1111ii1l1li;
      this.l1III1I1I11111lIl111IIl111 = System.currentTimeMillis();
      this.lIIlI1IIlI1III1IIll1lI1I1ll = 0;
   }

   private void ZenithInternal095(PlayerEntity PlayerEntity) {
      this.l1III1I1I11111lIl111IIl111 = System.currentTimeMillis();
      this.lIIlI1IIlI1III1IIll1lI1I1ll++;
      this.lI11l11I1II11II1IIl11.EventBus("Y", this.lI11l11I1II11II1IIl11.StringHolder_8(PlayerEntity, this.lIIlI1IIlI1III1IIll1lI1I1ll), 3000L);
   }

   private boolean IlIl11l11ll() {
      return System.currentTimeMillis() - this.l1III1I1I11111lIl111IIl111 > 600000L;
   }
}
