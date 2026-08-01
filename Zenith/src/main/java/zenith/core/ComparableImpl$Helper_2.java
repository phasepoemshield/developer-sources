package zenith;

import zenith.hud.*;

import java.util.Objects;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

class Keybinds$II1Il11l111II11IIl implements Comparable<Keybinds$II1Il11l111II11IIl> {
   private final GetStartTimeHandler ll1lIllIIIl1I1 = new GetStartTimeHandler(150L, IReturn.ListHolder_8);
   private final Module l1ll1III1IlI11I11llI;
   private float width;

   public Keybinds$II1Il11l111II11IIl(Keybinds ili11i1111i, Module ll111il1lliill11) {
      this.l1ll1III1IlI11I11llI = ll111il1lliill11;
   }

   public float IIIlI1lI11l1111IlIl11() {
      float f = 100.0F;
      float f1 = Fonts.NEW_MEDIUM.getWidth(this.l1ll1III1IlI11I11llI.getName(), 5.4F);
      Font font = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      String s = StringHolder_3.doubleHolder_2(this.l1ll1III1IlI11I11llI.Elytramotion());
      float f2 = font.width(s);
      float f3 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + f2);
      float f4 = 16.0F + f3;
      float f5 = f - (f4 + 8.0F);
      if (f5 < 8.0F + f1 + 8.0F) {
         float f6 = f1 + 8.0F + 8.0F - f5;
         f += f6;
      }

      return f;
   }

   public float getHeight() {
      return 7.0F;
   }

   public void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, float f2, int i, float f7) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      Font font = Fonts.NEW_ICONS.getFont(5.5F);
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.4F);
      this.ll1lIllIIIl1I1.StringHolder_8(this.l1ll1III1IlI11I11llI.Spider() && this.l1ll1III1IlI11I11llI.Elytramotion() != -1 ? 1.0F : 0.0F);
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(f + f2 / 2.0F, f1 + this.getHeight() / 2.0F, 0.0F);
      float f3 = this.ll1lIllIIIl1I1.CloudFriendInfo();
      lliii11l1lllil.getMatrices().scale(f3, f3, 1.0F);
      lliii11l1lllil.getMatrices().translate(-(f + f2 / 2.0F), -(f1 + this.getHeight() / 2.0F), 0.0F);
      Font font2 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      String s = StringHolder_3.doubleHolder_2(this.l1ll1III1IlI11I11llI.Elytramotion());
      float f4 = font2.width(s);
      float f5 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + f4);
      lliii11l1lllil.StringHolder_8(
         font,
         this.l1ll1III1IlI11I11llI.getCategory().getIcon(),
         f + 8.0F,
         f1 + (this.getHeight() - font.height()) / 2.0F,
         zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font1,
         this.l1ll1III1IlI11I11llI.getName(),
         f + 8.0F + font.width(this.l1ll1III1IlI11I11llI.getCategory().getIcon()) + (float)GuiStyle.PADDING.intValue(),
         f1 + (this.getHeight() - font1.height()) / 2.0F,
         zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      float f6 = f + f2 - f5 - (float)(GuiStyle.PADDING * 2);
      lliii11l1lllil.StringHolder_8(
         f6, f1, f5, this.getHeight(), floatHolder_5.StringHolder_30(1.0F), zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font2, s, f6 + (f5 - f4) / 2.0F, f1 + (this.getHeight() - font1.height()) / 2.0F, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.IIlII1lII1();
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) {
         return true;
      } else if (object != null && this.getClass() == object.getClass()) {
         Keybinds$II1Il11l111II11IIl ili11i1111i$ii1il11l111ii11iil1 = (Keybinds$II1Il11l111II11IIl)object;
         return Objects.equals(this.l1ll1III1IlI11I11llI.getName(), ili11i1111i$ii1il11l111ii11iil1.l1ll1III1IlI11I11llI.getName());
      } else {
         return false;
      }
   }

   public boolean IlIl11l11ll() {
      return this.ll1lIllIIIl1I1.CloudFriendInfo() == 0.0F;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.l1ll1III1IlI11I11llI.getName());
   }

   public int EventTarget(Keybinds$II1Il11l111II11IIl ili11i1111i$ii1il11l111ii11iil1) {
      return this.l1ll1III1IlI11I11llI.getName().compareTo(ili11i1111i$ii1il11l111ii11iil1.l1ll1III1IlI11I11llI.getName());
   }
}
