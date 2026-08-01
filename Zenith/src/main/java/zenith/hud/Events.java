package zenith.hud;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class Events extends HudElement {
   private static final float I11IlllIlI1l1ll1lI1IIll1I11I1 = 17.0F;
   private static final float l1Il1IIl11ll1l1lI1I1I1I = 7.0F;
   private final GetStartTimeHandler II11111lllIlIII11ll = new GetStartTimeHandler(200L, 100.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler l1111II = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler lI1I111l1IlIIIlllllIIl1l11I1l = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final Map<String, Events$II1Il11l111II11IIl> l111I1II = new LinkedHashMap<>();
   private final Set<String> lllI1l1lIl11llI1ll1llIllllIl = new HashSet<>();

   public Events(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      List list = ZenithClient.getInstance().ZenithInternal026().llI1llllIllIlll1l1lI11lIIIl();
      this.lllI1l1lIl11llI1ll1llIllllIl.clear();

      for (GetDisplayNameHandler iili1iilllliiil : list) {
         String s = this.StringHolder_8(iili1iilllliiil);
         this.lllI1l1lIl11llI1ll1llIllllIl.add(s);
         this.l111I1II.computeIfAbsent(s, s1 -> new Events$II1Il11l111II11IIl(this, iili1iilllliiil)).EventBus(iili1iilllliiil);
      }

      this.l111I1II.values().removeIf(Events$II1Il11l111II11IIl::IlIl11l11ll);
      if (this.l111I1II.isEmpty()) {
         this.l1111II.StringHolder_8(0.0F);
      } else {
         Events$II1Il11l111II11IIl i1ll1llliii11l1$ii1il11l111ii11iil1 = this.l111I1II.values().iterator().next();
         this.l1111II
            .StringHolder_8(
               this.l111I1II.size() == 1 && i1ll1llliii11l1$ii1il11l111ii11iil1.I1IIIII1IIlIIllIlI1I1l1l1lIII.HootBar() == 0.0F ? 0.0F : 1.0F
            );
      }

      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      Font font = Fonts.NEW_ICONS.getFont(5.5F);
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
      float f = this.x;
      float f1 = this.y;
      float f2 = (float)(
         (double)(17.0F + (float)GuiStyle.PADDING.intValue())
            + this.l111I1II
               .values()
               .stream()
               .mapToDouble(
                  i1ll1llliii11l1$ii1il11l111ii11iil2 -> (double)(
                        (i1ll1llliii11l1$ii1il11l111ii11iil2.getHeight() + (float)GuiStyle.PADDING.intValue())
                           * i1ll1llliii11l1$ii1il11l111ii11iil2.I1IIIII1IIlIIllIlI1I1l1l1lIII.CloudFriendInfo()
                     )
               )
               .sum()
      );
      float f3 = (float)this.l111I1II.values().stream().mapToDouble(Events$II1Il11l111II11IIl::IIIlI1lI11l1111IlIl11).max().orElse(100.0);
      f3 = this.II11111lllIlIII11ll.StringHolder_8(f3);
      this.width = f3;
      this.height = f2;
      this.lI1I111l1IlIIIlllllIIl1l11I1l
         .ZenithInternal101(
            l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen
               || ZenithClient.getInstance().ZenithInternal141().isRenderHud()
               || !this.l111I1II.isEmpty()
         );
      float f4 = Interface.lIl111ll1l111lIIlIlI1I1();
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(f + f3 / 2.0F, f1 + f2 / 2.0F, 0.0F);
      lliii11l1lllil.getMatrices()
         .scale(this.lI1I111l1IlIIIlllllIIl1l11I1l.CloudFriendInfo(), this.lI1I111l1IlIIIlllllIIl1l11I1l.CloudFriendInfo(), 1.0F);
      lliii11l1lllil.getMatrices().translate(-(f + f3 / 2.0F), -(f1 + f2 / 2.0F), 0.0F);
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(f4);
      floatHolder_8.Event(
         lliii11l1lllil.getMatrices(), f, f1, f3, f2, 21.0F, iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      lliii11l1lllil.StringHolder_8(f, f1, f3, f2, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1());
      lliii11l1lllil.StringHolder_8(f, f1, f3, 17.0F, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1());
      lliii11l1lllil.StringHolder_8(
         font, "L", f + 8.0F, f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font, "m", f + f3 - 8.0F - font.width("m"), f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font1,
         "Events",
         f + 8.0F + font.width("L") + (float)GuiStyle.PADDING.intValue(),
         f1 + (17.0F - font1.height()) / 2.0F,
         zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      if (this.lI1I111l1IlIIIlllllIIl1l11I1l.CloudFriendInfo() == 1.0F) {
         float f5 = f1 + 17.0F + (float)GuiStyle.PADDING.intValue();
         lliii11l1lllil.StringHolder_8((int)f, (int)f1, (int)(f + f3), (int)(f1 + f2));

         for (Entry entry : this.l111I1II.entrySet()) {
            Events$II1Il11l111II11IIl i1ll1llliii11l1$ii1il11l111ii11iil = (Events$II1Il11l111II11IIl)entry.getValue();
            i1ll1llliii11l1$ii1il11l111ii11iil.StringHolder_8(lliii11l1lllil, f, f5, f3, this.lllI1l1lIl11llI1ll1llIllllIl.contains(entry.getKey()));
            f5 += (i1ll1llliii11l1$ii1il11l111ii11iil.getHeight() + (float)GuiStyle.PADDING.intValue())
               * i1ll1llliii11l1$ii1il11l111ii11iil.I1IIIII1IIlIIllIlI1I1l1l1lIII.CloudFriendInfo();
         }

         lliii11l1lllil.llIIll1II1l1IIll();
      }

      lliii11l1lllil.IIlII1lII1();
   }

   private String StringHolder_8(GetDisplayNameHandler iili1iilllliiil) {
      return iili1iilllliiil.Illl1llIIIl1lI11Ill().name() + "|" + iili1iilllliiil.getTimestamp() + "|" + iili1iilllliiil.getMessage();
   }
}
