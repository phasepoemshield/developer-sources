package zenith;

import zenith.hud.*;

class Information$EventBus {
   private final String l1IIIIIlllIlIlI1111l1llIl1II;
   private final boolean l111llI111I1I;

   private Information$EventBus(String s, boolean flag) {
      this.l1IIIIIlllIlIlI1111l1llIl1II = s;
      this.l111llI111I1I = flag;
   }

   private static Information$EventBus EntityHolder(String s) {
      return new Information$EventBus(s, false);
   }

   private static Information$EventBus BlockHolder_2(String s) {
      return new Information$EventBus(s, true);
   }
}
