package zenith;

import zenith.hud.*;

import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.network.PlayerListEntry;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

class Staffs$EventBus {
   private final GetStartTimeHandler lIlIIllI1I;
   private final Text IIII1II1IIll1I1l1l1111lII;
   private final String IlIIl1lll1ll;
   private final String l11Illl1III11;
   private final Staffs$EventTarget lll11lIlI111111Ill1lll1Il;
   private final long I1l1l1lll1lI1lII;

   public Staffs$EventBus(
      Staffs i1l1i1ii1ll1ll1111, Text Text, String s, String s1, Staffs$EventTarget i1l1i1ii1ll1ll1111$illi1l1l1
   ) {
      this.l1IlIllI11l = i1l1i1ii1ll1ll1111;
      this.lIlIIllI1I = new GetStartTimeHandler(150L, 0.01F, IReturn.ListHolder_8);
      this.IIII1II1IIll1I1l1l1111lII = Text;
      this.IlIIl1lll1ll = s;
      this.l11Illl1III11 = s1;
      this.lll11lIlI111111Ill1lll1Il = i1l1i1ii1ll1ll1111$illi1l1l1;
      this.I1l1l1lll1lI1lII = System.currentTimeMillis();
   }

   public float IIIlI1lI11l1111IlIl11() {
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      float f = 100.0F;
      String s = this.l1IlIllI11l.byteHolder_2(System.currentTimeMillis() - this.I1l1l1lll1lI1lII);
      float f1 = (float)(14 + GuiStyle.PADDING) + font.width(this.IIII1II1IIll1I1l1l1111lII);
      float f2 = font1.width(s);
      float f3 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + f2);
      float f4 = (float)(GuiStyle.PADDING * 2) + f3 + 8.0F;
      float f5 = f - (f4 + 8.0F);
      if (f5 < f1 + 8.0F) {
         f += f1 + 8.0F - f5;
      }

      return f;
   }

   public float getHeight() {
      return 7.0F;
   }

   public void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, float f2, boolean flag) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      this.lIlIIllI1I.StringHolder_8(flag ? 1.0F : 0.0F);
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(f + f2 / 2.0F, f1 + this.getHeight() / 2.0F, 0.0F);
      lliii11l1lllil.getMatrices().scale(this.lIlIIllI1I.CloudFriendInfo(), this.lIlIIllI1I.CloudFriendInfo(), 1.0F);
      lliii11l1lllil.getMatrices().translate(-(f + f2 / 2.0F), -(f1 + this.getHeight() / 2.0F), 0.0F);
      Identifier Identifier = this.l1IlIllI11l.l1lIIIIIIl1II11I1l11Il.get(this.l11Illl1III11);
      if (Identifier == null && ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
         PlayerListEntry PlayerListEntry = ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II
            .getNetworkHandler()
            .getPlayerList()
            .stream()
            .filter(PlayerListEntry -> PlayerListEntryx.getProfile() != null && this.l11Illl1III11.equals(PlayerListEntryx.getProfile().getName()))
            .findFirst()
            .orElse(null);
         if (PlayerListEntry != null && PlayerListEntry.getSkinTextures() != null) {
            Identifier = PlayerListEntry.getSkinTextures().texture();
            this.l1IlIllI11l.l1lIIIIIIl1II11I1l11Il.put(this.l11Illl1III11, Identifier);
         }
      }

      if (Identifier == null) {
         Identifier = DefaultSkinHelper.getSteve().texture();
      }

      float f8 = 6.0F;
      float f3 = f + 8.0F;
      float f4 = f1 + (this.getHeight() - f8) / 2.0F;
      floatHolder_8.StringHolder_8(
         lliii11l1lllil.getMatrices(), Identifier, f3, f4, f8, floatHolder_5.StringHolder_30(1.6F), ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      lliii11l1lllil.StringHolder_8(
         font,
         this.IIII1II1IIll1I1l1l1111lII,
         f + 8.0F + f8 + (float)GuiStyle.PADDING.intValue(),
         f1 + (this.getHeight() - font.height()) / 2.0F,
         zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().lllIlll1Ill111l111Il11II11lII()
      );
      String s = this.l1IlIllI11l.byteHolder_2(System.currentTimeMillis() - this.I1l1l1lll1lI1lII);
      float f5 = font1.width(s);
      float f6 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + f5);
      float f7 = f + f2 - f6 - (float)(GuiStyle.PADDING * 2);
      lliii11l1lllil.StringHolder_8(
         f7, f1, f6, this.getHeight(), floatHolder_5.StringHolder_30(1.0F), zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font1, s, f7 + (f6 - f5) / 2.0F, f1 + (this.getHeight() - font1.height()) / 2.0F, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.IIlII1lII1();
   }

   public boolean IlIl11l11ll() {
      return this.lIlIIllI1I.CloudFriendInfo() == 0.0F;
   }
}
