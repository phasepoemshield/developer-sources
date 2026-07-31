package zenith.hud;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.network.PlayerListEntry;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.base.font.MsdfRenderer;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class Coordinates extends HudElement {
   private static final float llIl1II111I = 0.25F;
   private static final float Il1IlllllI11llIIlIl1I11lII111 = 0.72F;
   private static final float Il11lI1lI1IIIII11I1 = 1.0F;
   private final MultiBooleanSetting Ill1IIlI1lIlIIIl111l = new MultiBooleanSetting("Info Boxes");
   private final MultiBooleanSetting$II1Il11l111II11IIl I11I1III1I1I11111lllII111l = new MultiBooleanSetting$II1Il11l111II11IIl(this.Ill1IIlI1lIlIIIl111l, "Coordinates", true);
   private final MultiBooleanSetting$II1Il11l111II11IIl II1Il1l1II1I111lIll1lI1l11I = new MultiBooleanSetting$II1Il11l111II11IIl(this.Ill1IIlI1lIlIIIl111l, "BPS", true);
   private final GetStartTimeHandler lIIlIll1l1llllll1III111l = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private final GetStartTimeHandler Ill111lI1lIII1l1 = new GetStartTimeHandler(200L, IReturn.ListHolder_8);

   public Coordinates(String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         this.width = 0.0F;
         this.height = 0.0F;
      } else {
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         Font font = Fonts.ICONS.getFont(5.5F);
         Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font2 = Fonts.NEW_MEDIUM.getFont(4.8F);
         double d0 = Math.hypot(
               l11I1I1ll1Illll1I1l1111l1II.player.getX() - l11I1I1ll1Illll1I1l1111l1II.player.prevX,
               l11I1I1ll1Illll1I1l1111l1II.player.getZ() - l11I1I1ll1Illll1I1l1111l1II.player.prevZ
            )
            * 20.0;
         int i = (int)l11I1I1ll1Illll1I1l1111l1II.player.getX();
         int j = (int)l11I1I1ll1Illll1I1l1111l1II.player.getY();
         int k = (int)l11I1I1ll1Illll1I1l1111l1II.player.getZ();
         String s = String.format(Locale.US, "%.2f", d0);
         String s1 = String.format(Locale.US, "%.2f", ZenithClient.getInstance().SupplierHolder().l11l111lIlIl1llI1Il1I1Il());
         String s2 = this.l11lIIlIIllIllIl();
         String s3 = String.valueOf(net.minecraft.client.MinecraftClient.getInstance().getCurrentFps());
         boolean flag = !this.I11I1III1I1I11111lllII111l.Spider() && !this.II1Il1l1II1I111lIll1lI1l11I.Spider();
         ArrayList arraylist = new ArrayList(5);
         arraylist.add(this.EventBus(font1, font2, font, i, j, k, this.lIIlIll1l1llllll1III111l, flag || this.I11I1III1I1I11111lllII111l.Spider()));
         arraylist.add(this.EventBus(font1, font2, font, "1", s, " bps", this.Ill111lI1lIII1l1, flag || this.II1Il1l1II1I111lIll1lI1l11I.Spider()));
         ArrayList arraylist1 = new ArrayList(arraylist.size());
         float f = (float)(-GuiStyle.PADDING);

         for (Coordinates$II1Il11l111II11IIl l1li1l1$ii1il11l111ii11iilx : arraylist) {
            if (l1li1l1$ii1il11l111ii11iilx.llllIlI1llIIIlIII1I > 0.25F) {
               arraylist1.add(l1li1l1$ii1il11l111ii11iilx);
               f += l1li1l1$ii1il11l111ii11iilx.llllIlI1llIIIlIII1I + (float)GuiStyle.PADDING.intValue();
            }
         }

         if (arraylist1.isEmpty()) {
            arraylist1 = arraylist;
         }

         float f6 = 17.0F;
         this.width = f;
         this.height = f6;
         float f7 = Interface.lIl111ll1l111lIIlIlI1I1();
         floatHolder_8.Event(
            lliii11l1lllil.getMatrices(), this.x, this.y, f, f6, 21.0F, floatHolder_5.StringHolder_30(f7), ByteBufferHolder.ll1lIllll111I1lIIl1lIl
         );
         lliii11l1lllil.StringHolder_8(
            this.x, this.y, f, f6, floatHolder_5.StringHolder_30(f7), zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         float f1 = this.x;

         for (int l = 0; l < arraylist1.size(); l++) {
            Coordinates$II1Il11l111II11IIl l1li1l1$ii1il11l111ii11iilx = (Coordinates$II1Il11l111II11IIl)arraylist1.get(l);
            lliii11l1lllil.StringHolder_8(
               f1,
               this.y,
               l1li1l1$ii1il11l111ii11iilx.llllIlI1llIIIlIII1I,
               f6,
               floatHolder_5.StringHolder_30(f7),
               zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
            );
            float f2 = f1 + (float)GuiStyle.PADDING.intValue();
            float f3 = this.y + (f6 - font.height()) / 2.0F;
            lliii11l1lllil.StringHolder_8(
               font, l1li1l1$ii1il11l111ii11iilx.lI1I111ll11lI1I, f2, f3, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
            );
            float f4 = f2 + l1li1l1$ii1il11l111ii11iilx.lllI1I1II11l1I + (float)GuiStyle.PADDING.intValue() / 2.0F;
            float f5 = Math.max(
               0.0F,
               l1li1l1$ii1il11l111ii11iilx.llllIlI1llIIIlIII1I
                  - (float)GuiStyle.PADDING.intValue() / 2.0F * 2.0F
                  - l1li1l1$ii1il11l111ii11iilx.lllI1I1II11l1I
                  - (float)GuiStyle.PADDING.intValue() / 2.0F
            );
            this.StringHolder_8(
               lliii11l1lllil,
               l1li1l1$ii1il11l111ii11iilx.I1IlIIlll1Il11lllI11Il,
               font1,
               font2,
               f4,
               this.y,
               f6,
               f5,
               zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(),
               zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1()
            );
            f1 += l1li1l1$ii1il11l111ii11iilx.llllIlI1llIIIlIII1I + (float)(l != arraylist1.size() - 1 ? GuiStyle.PADDING : 0);
         }
      }
   }

   private Coordinates$II1Il11l111II11IIl EventBus(Font font, Font font1, Font font2, int i, int j, int k, GetStartTimeHandler li1liiliill1, boolean flag) {
      List list = List.of(
         Coordinates$EventBus.EventImpl_35(String.valueOf(i)),
         Coordinates$EventBus.EventImpl_31("x "),
         Coordinates$EventBus.EventImpl_35(String.valueOf(j)),
         Coordinates$EventBus.EventImpl_31("y "),
         Coordinates$EventBus.EventImpl_35(String.valueOf(k)),
         Coordinates$EventBus.EventImpl_31("z")
      );
      return this.EventBus(font2, font, font1, "J", list, li1liiliill1, flag);
   }

   private Coordinates$II1Il11l111II11IIl EventBus(Font font, Font font1, Font font2, String s, String s1, String s2, GetStartTimeHandler li1liiliill1, boolean flag) {
      List list = List.of(Coordinates$EventBus.EventImpl_35(s1), Coordinates$EventBus.EventImpl_31(s2));
      return this.EventBus(font2, font, font1, s, list, li1liiliill1, flag);
   }

   private Coordinates$II1Il11l111II11IIl EventBus(
      Font font, Font font1, Font font2, String s, List<Coordinates$EventBus> list, GetStartTimeHandler li1liiliill1, boolean flag
   ) {
      float f = font.width(s);
      float f1 = 0.0F;

      for (Coordinates$EventBus l1li1l1$l1i1illlili : list) {
         f1 += l1li1l1$l1i1illlili.I1Il1l1l111II11Illlll11lIIIIl
            ? font2.width(l1li1l1$l1i1illlili.l11ll11l1Il11l1IIII1II)
            : font1.width(l1li1l1$l1i1illlili.l11ll11l1Il11l1IIII1II);
      }

      float f2 = flag ? (float)GuiStyle.PADDING.intValue() + f + (float)GuiStyle.PADDING.intValue() / 2.0F + f1 + (float)GuiStyle.PADDING.intValue() : 0.0F;
      float f3 = MathHelper.lerp(0.2F, li1liiliill1.CloudFriendInfo(), f2);
      li1liiliill1.EventBus(f3);
      return new Coordinates$II1Il11l111II11IIl(s, f, list, f3);
   }

   private void StringHolder_8(
      DrawContextImpl lliii11l1lllil,
      List<Coordinates$EventBus> list,
      Font font,
      Font font1,
      float f,
      float f1,
      float f2,
      float f3,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1
   ) {
      float f4 = 0.0F;

      for (Coordinates$EventBus l1li1l1$l1i1illlili : list) {
         Font font2 = l1li1l1$l1i1illlili.I1Il1l1l111II11Illlll11lIIIIl ? font1 : font;
         float f5 = font2.width(l1li1l1$l1i1illlili.l11ll11l1Il11l1IIII1II);
         float f6 = f3 - f4;
         if (f6 <= 0.1F) {
            break;
         }

         ByteBufferHolder il1iliilli1l1iill2 = l1li1l1$l1i1illlili.I1Il1l1l111II11Illlll11lIIIIl ? il1iliilli1l1iill1 : il1iliilli1l1iill;
         float f7 = f1 + (f2 - font2.height()) / 2.0F;
         MsdfRenderer.renderText(
            font2.getFont(),
            l1li1l1$l1i1illlili.l11ll11l1Il11l1IIII1II,
            font2.getSize(),
            il1iliilli1l1iill2.lllIlll1Ill111l111Il11II11lII(),
            lliii11l1lllil.getMatrices().peek().getPositionMatrix(),
            f + f4,
            f7,
            0.0F,
            true,
            0.72F,
            1.0F,
            f6
         );
         f4 += f5;
      }
   }

   private String l11lIIlIIllIllIl() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
         PlayerListEntry PlayerListEntry = l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().getPlayerListEntry(l11I1I1ll1Illll1I1l1111l1II.player.getUuid());
         return PlayerListEntry == null ? "-" : String.valueOf(Math.max(0, PlayerListEntry.getLatency()));
      } else {
         return "-";
      }
   }
}
