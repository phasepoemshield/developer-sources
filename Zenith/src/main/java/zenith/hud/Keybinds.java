package zenith.hud;

import java.util.LinkedHashSet;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class Keybinds extends HudElement {
   private final LinkedHashSet<Keybinds$II1Il11l111II11IIl> Il1ll1llllIl = new LinkedHashSet<>();
   private final GetStartTimeHandler I111IIlI1Ill1IIlll = new GetStartTimeHandler(200L, 100.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler IIllIlII1I1 = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler lIII1l11II1II1IlIlII1lIlI1I = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);

   public Keybinds(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      Font font = Fonts.NEW_ICONS.getFont(5.5F);
      ZenithClient.getInstance()
         .getModuleManager()
         .ZenithInternal140()
         .forEach(
            ll111il1lliill11 -> {
               if (ll111il1lliill11.Elytramotion() != -1
                  && this.Il1ll1llllIl
                     .stream()
                     .noneMatch(ili11i1111i$ii1il11l111ii11iil1 -> ili11i1111i$ii1il11l111ii11iil1.l1ll1III1IlI11I11llI == ll111il1lliill11)) {
                  this.Il1ll1llllIl.addLast(new Keybinds$II1Il11l111II11IIl(this, ll111il1lliill11));
               }
            }
         );
      this.Il1ll1llllIl
         .removeIf(
            ili11i1111i$ii1il11l111ii11iil1 -> (
                     !ili11i1111i$ii1il11l111ii11iil1.l1ll1III1IlI11I11llI.Spider()
                        || ili11i1111i$ii1il11l111ii11iil1.l1ll1III1IlI11I11llI.Elytramotion() == -1
                  )
                  && ili11i1111i$ii1il11l111ii11iil1.IlIl11l11ll()
         );
      if (this.Il1ll1llllIl.isEmpty()) {
         this.IIllIlII1I1.StringHolder_8(0.0F);
      } else {
         this.IIllIlII1I1.StringHolder_8(this.Il1ll1llllIl.size() == 1 && this.Il1ll1llllIl.getFirst().ll1lIllIIIl1I1.HootBar() == 0.0F ? 0.0F : 1.0F);
      }

      float f = this.x;
      float f1 = this.y;
      float f2 = 1.5F;
      float f3 = (float)(
         (double)(17 + GuiStyle.PADDING)
            + this.Il1ll1llllIl
               .stream()
               .mapToDouble(
                  ili11i1111i$ii1il11l111ii11iil1 -> (double)(
                        (ili11i1111i$ii1il11l111ii11iil1.getHeight() + (float)GuiStyle.PADDING.intValue())
                           * ili11i1111i$ii1il11l111ii11iil1.ll1lIllIIIl1I1.CloudFriendInfo()
                     )
               )
               .sum()
      );
      float f4 = (float)this.Il1ll1llllIl.stream().mapToDouble(Keybinds$II1Il11l111II11IIl::IIIlI1lI11l1111IlIl11).max().orElse(100.0);
      f4 = this.I111IIlI1Ill1IIlll.StringHolder_8(f4);
      this.width = f4;
      this.height = f3;
      this.lIII1l11II1II1IlIlII1lIlI1I
         .ZenithInternal101(
            l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen
               || ZenithClient.getInstance().ZenithInternal141().isRenderHud()
               || !this.Il1ll1llllIl.isEmpty()
         );
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      float f5 = Interface.lIl111ll1l111lIIlIlI1I1();
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(f5);
      lliii11l1lllil.getMatrices().translate(f + f4 / 2.0F, f1 + f3 / 2.0F, 0.0F);
      lliii11l1lllil.getMatrices()
         .scale(this.lIII1l11II1II1IlIlII1lIlI1I.CloudFriendInfo(), this.lIII1l11II1II1IlIlII1lIlI1I.CloudFriendInfo(), 1.0F);
      lliii11l1lllil.getMatrices().translate(-(f + f4 / 2.0F), -(f1 + f3 / 2.0F), 0.0F);
      floatHolder_8.Event(
         lliii11l1lllil.getMatrices(), f, f1, f4, f3, 21.0F, iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      lliii11l1lllil.StringHolder_8(f, f1, f4, f3, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1());
      lliii11l1lllil.StringHolder_8(f, f1, f4, 17.0F, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1());
      lliii11l1lllil.StringHolder_8(
         font, "n", f + 8.0F, f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font, "m", f + f4 - 8.0F - font.width("M"), f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
      lliii11l1lllil.StringHolder_8(
         font1,
         "Keybinds",
         f + 8.0F + font.width("n") + (float)GuiStyle.PADDING.intValue(),
         f1 + (17.0F - font1.height()) / 2.0F,
         zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      if (this.lIII1l11II1II1IlIlII1lIlI1I.CloudFriendInfo() == 1.0F) {
         float f6 = f1 + 17.0F + (float)GuiStyle.PADDING.intValue();
         int i = 0;
         lliii11l1lllil.StringHolder_8((int)f, (int)f1, (int)(f + f4), (int)(f1 + f3));

         for (Keybinds$II1Il11l111II11IIl ili11i1111i$ii1il11l111ii11iil : this.Il1ll1llllIl) {
            ili11i1111i$ii1il11l111ii11iil.StringHolder_8(lliii11l1lllil, f, f6, f4, i, f5);
            f6 += (ili11i1111i$ii1il11l111ii11iil.getHeight() + (float)GuiStyle.PADDING.intValue())
               * ili11i1111i$ii1il11l111ii11iil.ll1lIllIIIl1I1.CloudFriendInfo();
            i++;
         }

         lliii11l1lllil.llIIll1II1l1IIll();
      }

      lliii11l1lllil.IIlII1lII1();
   }
}
