package zenith;

import zenith.hud.*;

import zenith.zov.base.font.Font;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

abstract class Notifications$II1Il11l111II11IIl {
   long IIl11I11lI1lI;
   final long ll1I111lllIIlIl1I1l1Il1l1;
   boolean III1II1Il1 = false;
   final GetStartTimeHandler IlllIl1lIIlIII1IIIIl11I11I1 = new GetStartTimeHandler(300L, IReturn.ListHolder_8);
   final GetStartTimeHandler I1ll1lIIIlllI11l = new GetStartTimeHandler(300L, IReturn.ListHolder_8);

   Notifications$II1Il11l111II11IIl(long i) {
      this.IIl11I11lI1lI = System.currentTimeMillis();
      this.ll1I111lllIIlIl1I1l1Il1l1 = i;
   }

   abstract void StringHolder_8(
      DrawContextImpl lliii11l1lllil, float f, float f1, Font font, ZenithStyle zenithstyle, float f2, Notifications ili1111ii1l1li
   );
}
