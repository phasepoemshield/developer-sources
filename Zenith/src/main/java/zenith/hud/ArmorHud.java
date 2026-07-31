package zenith.hud;

import java.util.ArrayList;
import java.util.List;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class ArmorHud extends HudElement {
   private final List<ArmorHud$II1Il11l111II11IIl> l11l11I111I1ll1II1Illllll1 = new ArrayList<>();

   public ArmorHud(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
      float f6 = 22.0F;
      this.width = f6 * 4.0F;
      this.height = f6;

      for (int i = 0; i < 4; i++) {
         this.l11l11I111I1ll1II1Illllll1.add(new ArmorHud$II1Il11l111II11IIl(this, i));
      }
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      float f = 22.0F;
      this.width = f * 4.0F;
      this.height = f;
      float f1 = Interface.lIl111ll1l111lIIlIlI1I1();
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      floatHolder_8.Event(
         lliii11l1lllil.getMatrices(),
         this.x,
         this.y,
         this.width,
         this.height,
         21.0F,
         floatHolder_5.StringHolder_30(f1),
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      lliii11l1lllil.StringHolder_8(
         this.x, this.y, this.width, this.height, floatHolder_5.StringHolder_30(f1), zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      float f2 = this.x;
      float f3 = this.y;

      for (ArmorHud$II1Il11l111II11IIl ill11ii1ilil1liili1iliil$ii1il11l111ii11iil : this.l11l11I111I1ll1II1Illllll1) {
         ill11ii1ilil1liili1iliil$ii1il11l111ii11iil.StringHolder_8(lliii11l1lllil, f2, f3, zenithstyle);
         f2 += f;
      }

      lliii11l1lllil.IIlII1lII1();
   }
}
