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

public class Information extends HudElement {
   private static final float I1IllIIlI1lI1111IllI = 0.25F;
   private static final float lI1l1I111l1l1II11l11IllIlII = 0.72F;
   private static final float I1IllI1I1l11l = 1.0F;
   private final MultiBooleanSetting IIlI1lIII11lIIIllll1l1IlIII = new MultiBooleanSetting("Info Boxes");
   private final MultiBooleanSetting$II1Il11l111II11IIl Ill1111IIl = new MultiBooleanSetting$II1Il11l111II11IIl(this.IIlI1lIII11lIIIllll1l1IlIII, "TPS", true);
   private final MultiBooleanSetting$II1Il11l111II11IIl lIIIllI1II1 = new MultiBooleanSetting$II1Il11l111II11IIl(this.IIlI1lIII11lIIIllll1l1IlIII, "Ping", true);
   private final MultiBooleanSetting$II1Il11l111II11IIl I111Illl11I11II1lIll1lll1llI = new MultiBooleanSetting$II1Il11l111II11IIl(this.IIlI1lIII11lIIIllll1l1IlIII, "FPS", true);
   private final GetStartTimeHandler lIl1I11IlI1I = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private final GetStartTimeHandler IIl11II1lII1ll11lIIl1 = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private final GetStartTimeHandler lIlll1llIl = new GetStartTimeHandler(200L, IReturn.ListHolder_8);

   public Information(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         this.width = 0.0F;
         this.height = 0.0F;
      } else {
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         if (zenithstyle == null) {
            this.width = 0.0F;
            this.height = 0.0F;
         } else {
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
            String s1 = String.format(
               Locale.US, "%.2f", ZenithClient.getInstance().SupplierHolder().l11l111lIlIl1llI1Il1I1Il()
            );
            String s2 = this.l11lIIlIIllIllIl();
            String s3 = String.valueOf(net.minecraft.client.MinecraftClient.getInstance().getCurrentFps());
            boolean flag = !this.Ill1111IIl.Spider() && !this.lIIIllI1II1.Spider() && !this.I111Illl11I11II1lIll1lll1llI.Spider();
            ArrayList arraylist = new ArrayList(5);
            arraylist.add(this.StringHolder_8(font1, font2, font, "I", s1, " tps", this.lIl1I11IlI1I, flag || this.Ill1111IIl.Spider()));
            arraylist.add(this.StringHolder_8(font1, font2, font, "H", s2, " ms", this.IIl11II1lII1ll11lIIl1, flag || this.lIIIllI1II1.Spider()));
            arraylist.add(this.StringHolder_8(font1, font2, font, "F", s3, " fps", this.lIlll1llIl, flag || this.I111Illl11I11II1lIll1lll1llI.Spider()));
            ArrayList arraylist1 = new ArrayList(arraylist.size());
            float f = (float)(-GuiStyle.PADDING);

            for (Information$II1Il11l111II11IIl llllliiii1l1111illi$ii1il11l111ii11iilx : arraylist) {
               if (llllliiii1l1111illi$ii1il11l111ii11iilx.lI1IllIIII11Il11I11l11I1I1II1 > 0.25F) {
                  arraylist1.add(llllliiii1l1111illi$ii1il11l111ii11iilx);
                  f += llllliiii1l1111illi$ii1il11l111ii11iilx.lI1IllIIII11Il11I11l11I1I1II1 + (float)GuiStyle.PADDING.intValue();
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
               lliii11l1lllil.getMatrices(),
               this.x,
               this.y,
               f,
               f6,
               21.0F,
               floatHolder_5.StringHolder_30(f7),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl
            );
            lliii11l1lllil.StringHolder_8(
               this.x, this.y, f, f6, floatHolder_5.StringHolder_30(f7), zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
            );
            float f1 = this.x;

            for (int l = 0; l < arraylist1.size(); l++) {
               Information$II1Il11l111II11IIl llllliiii1l1111illi$ii1il11l111ii11iilx = (Information$II1Il11l111II11IIl)arraylist1.get(l);
               lliii11l1lllil.StringHolder_8(
                  f1,
                  this.y,
                  llllliiii1l1111illi$ii1il11l111ii11iilx.lI1IllIIII11Il11I11l11I1I1II1,
                  f6,
                  floatHolder_5.StringHolder_30(f7),
                  zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
               );
               float f2 = f1 + (float)GuiStyle.PADDING.intValue();
               float f3 = this.y + (f6 - font.height()) / 2.0F;
               lliii11l1lllil.StringHolder_8(
                  font, llllliiii1l1111illi$ii1il11l111ii11iilx.Il1llI1l11lIIIII1l1II, f2, f3, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
               );
               float f4 = f2 + llllliiii1l1111illi$ii1il11l111ii11iilx.I1ll1Ill1l1I1 + (float)GuiStyle.PADDING.intValue() / 2.0F;
               float f5 = Math.max(
                  0.0F,
                  llllliiii1l1111illi$ii1il11l111ii11iilx.lI1IllIIII11Il11I11l11I1I1II1
                     - (float)GuiStyle.PADDING.intValue() / 2.0F * 2.0F
                     - llllliiii1l1111illi$ii1il11l111ii11iilx.I1ll1Ill1l1I1
                     - (float)GuiStyle.PADDING.intValue() / 2.0F
               );
               this.StringHolder_8(
                  lliii11l1lllil,
                  llllliiii1l1111illi$ii1il11l111ii11iilx.IIlIl1llll11IIll,
                  font1,
                  font2,
                  f4,
                  this.y,
                  f6,
                  f5,
                  zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(),
                  zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1()
               );
               f1 += llllliiii1l1111illi$ii1il11l111ii11iilx.lI1IllIIII11Il11I11l11I1I1II1 + (float)(l != arraylist1.size() - 1 ? GuiStyle.PADDING : 0);
            }
         }
      }
   }

   private Information$II1Il11l111II11IIl StringHolder_8(
      Font font, Font font1, Font font2, int i, int j, int k, GetStartTimeHandler li1liiliill1, boolean flag
   ) {
      List list = List.of(
         Information$EventBus.EntityHolder(String.valueOf(i)),
         Information$EventBus.BlockHolder_2("x "),
         Information$EventBus.EntityHolder(String.valueOf(j)),
         Information$EventBus.BlockHolder_2("y "),
         Information$EventBus.EntityHolder(String.valueOf(k)),
         Information$EventBus.BlockHolder_2("z")
      );
      return this.StringHolder_8(font2, font, font1, "J", list, li1liiliill1, flag);
   }

   private Information$II1Il11l111II11IIl StringHolder_8(
      Font font, Font font1, Font font2, String s, String s1, String s2, GetStartTimeHandler li1liiliill1, boolean flag
   ) {
      List list = List.of(Information$EventBus.EntityHolder(s1), Information$EventBus.BlockHolder_2(s2));
      return this.StringHolder_8(font2, font, font1, s, list, li1liiliill1, flag);
   }

   private Information$II1Il11l111II11IIl StringHolder_8(
      Font font, Font font1, Font font2, String s, List<Information$EventBus> list, GetStartTimeHandler li1liiliill1, boolean flag
   ) {
      float f = font.width(s);
      float f1 = 0.0F;

      for (Information$EventBus llllliiii1l1111illi$l1i1illlili : list) {
         f1 += llllliiii1l1111illi$l1i1illlili.l111llI111I1I
            ? font2.width(llllliiii1l1111illi$l1i1illlili.l1IIIIIlllIlIlI1111l1llIl1II)
            : font1.width(llllliiii1l1111illi$l1i1illlili.l1IIIIIlllIlIlI1111l1llIl1II);
      }

      float f2 = flag ? (float)GuiStyle.PADDING.intValue() + f + (float)GuiStyle.PADDING.intValue() / 2.0F + f1 + (float)GuiStyle.PADDING.intValue() : 0.0F;
      float f3 = MathHelper.lerp(0.2F, li1liiliill1.CloudFriendInfo(), f2);
      li1liiliill1.EventBus(f3);
      return new Information$II1Il11l111II11IIl(s, f, list, f3);
   }

   private void StringHolder_8(
      DrawContextImpl lliii11l1lllil,
      List<Information$EventBus> list,
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

      for (Information$EventBus llllliiii1l1111illi$l1i1illlili : list) {
         Font font2 = llllliiii1l1111illi$l1i1illlili.l111llI111I1I ? font1 : font;
         float f5 = font2.width(llllliiii1l1111illi$l1i1illlili.l1IIIIIlllIlIlI1111l1llIl1II);
         float f6 = f3 - f4;
         if (f6 <= 0.1F) {
            break;
         }

         ByteBufferHolder il1iliilli1l1iill2 = llllliiii1l1111illi$l1i1illlili.l111llI111I1I ? il1iliilli1l1iill1 : il1iliilli1l1iill;
         float f7 = f1 + (f2 - font2.height()) / 2.0F;
         MsdfRenderer.renderText(
            font2.getFont(),
            llllliiii1l1111illi$l1i1illlili.l1IIIIIlllIlIlI1111l1llIl1II,
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
