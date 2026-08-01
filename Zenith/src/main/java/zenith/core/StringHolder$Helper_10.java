package zenith;

import zenith.hud.*;

class Coordinates$EventBus {
   private final String l11ll11l1Il11l1IIII1II;
   private final boolean I1Il1l1l111II11Illlll11lIIIIl;

   private Coordinates$EventBus(String s, boolean flag) {
      this.l11ll11l1Il11l1IIII1II = s;
      this.I1Il1l1l111II11Illlll11lIIIIl = flag;
   }

   private static Coordinates$EventBus EventImpl_35(String s) {
      return new Coordinates$EventBus(s, false);
   }

   private static Coordinates$EventBus EventImpl_31(String s) {
      return new Coordinates$EventBus(s, true);
   }
}
