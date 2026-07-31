package zenith;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

final class Rotationrecorder$II1Il11l111II11IIl {
   private final List<Rotationrecorder$EventBus> II111l1llI1l1111IlIllI1l1Il1;
   private final long IIlI1l11lIlI11I;

   private Rotationrecorder$II1Il11l111II11IIl(Rotationrecorder llii111111) {
      this.lll1ll11IIIll1II1l11l11IIl = llii111111;
      this.II111l1llI1l1111IlIllI1l1Il1 = new ArrayList<>();
      this.IIlI1l11lIlI11I = Math.max(1L, Instant.now().toEpochMilli());
   }

   private void EventTarget(Rotationrecorder$EventBus llii111111$l1i1illlili) {
      if (this.ZenithInternal095(llii111111$l1i1illlili)) {
         this.II111l1llI1l1111IlIllI1l1Il1.add(llii111111$l1i1illlili);
      } else {
         this.I1lIlI1lI11I1lIIII();
         this.lll1ll11IIIll1II1l11l11IIl.l1I1l11llIIlIIl111l1lllI1I();
      }
   }

   private boolean ZenithInternal095(Rotationrecorder$EventBus llii111111$l1i1illlili) {
      return llii111111$l1i1illlili != null
         && llii111111$l1i1illlili.Il1IIl11I1Il1l1II1III1.length == 37
         && llii111111$l1i1illlili.IlllIllllII.length == 2
         && this.lll1ll11IIIll1II1l11l11IIl.byteHolder_2(llii111111$l1i1illlili.Il1IIl11I1Il1l1II1III1)
         && this.lll1ll11IIIll1II1l11l11IIl.byteHolder_2(llii111111$l1i1illlili.IlllIllllII);
   }

   private void I1lIlI1lI11I1lIIII() {
      int i = this.II111l1llI1l1111IlIllI1l1Il1.size();
      if (i <= 0) {
         this.II111l1llI1l1111IlIllI1l1Il1.clear();
         this.lll1ll11IIIll1II1l11l11IIl.I1lIIl1lI1IlI11I1llIll11 = null;
      } else {
         for (int j = 0; j < i; j++) {
            this.lll1ll11IIIll1II1l11l11IIl.StringHolder_8(this.IIlI1l11lIlI11I, this.II111l1llI1l1111IlIllI1l1Il1.get(j));
         }

         TextHolder.EventImpl_27("RotationRecorder: wrote " + i + "/" + this.II111l1llI1l1111IlIllI1l1Il1.size());
         this.II111l1llI1l1111IlIllI1l1Il1.clear();
         this.lll1ll11IIIll1II1l11l11IIl.I1lIIl1lI1IlI11I1llIll11 = null;
      }
   }

   private void lIl11l1I1lllI1I1l() {
      int i = -1;

      for (int j = this.II111l1llI1l1111IlIllI1l1Il1.size() - 1; j >= 0; j--) {
         if (this.lll1ll11IIIll1II1l11l11IIl.EventBus(this.II111l1llI1l1111IlIllI1l1Il1.get(j))) {
            i = j;
            break;
         }
      }

      int l = i >= 0 ? i + 1 : 0;
      if (l < this.II111l1llI1l1111IlIllI1l1Il1.size()) {
         int k = this.II111l1llI1l1111IlIllI1l1Il1.size() - l;
         this.II111l1llI1l1111IlIllI1l1Il1.subList(l, this.II111l1llI1l1111IlIllI1l1Il1.size()).clear();
         TextHolder.EventImpl_27("RotationRecorder: dropped interrupted tail " + k);
      }
   }
}
