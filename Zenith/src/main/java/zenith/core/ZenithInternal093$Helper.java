package zenith;

import zenith.hud.*;

import net.minecraft.item.ItemStack;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;
import zenith.zov.utility.mixin.accessors.DrawContextAccessor;

class HootBar$II1Il11l111II11IIl {
   private final GetStartTimeHandler I1l1llI1IlI1 = new GetStartTimeHandler(150L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler Il11I11l1IIlIlll11ll1lIllI11Il = new GetStartTimeHandler(150L, 0.0F, IReturn.ListHolder_8);
   private final int l111llI1I1lI1IlIlII1IIl1lI;

   private HootBar$II1Il11l111II11IIl(HootBar l1lili1ii11, int i) {
      this.l111llI1I1lI1IlIlII1IIl1lI = i;
   }

   public void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, ZenithStyle zenithstyle) {
      float f2 = Interface.lIl111ll1l111lIIlIlI1I1();
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(f2);
      this.I1l1llI1IlI1.EventImpl_21(80L);
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      this.I1l1llI1IlI1
         .StringHolder_8(
            this.l111llI1I1lI1IlIlII1IIl1lI == ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.player.getInventory().selectedSlot ? 1.0F : 0.0F
         );
      ByteBufferHolder il1iliilli1l1iill = zenithstyle.getHeaderHudBackground().HostnameVerifierImpl(this.I1l1llI1IlI1.CloudFriendInfo());
      ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getTextSecondary()
         .l1IllIl1l1llIlI11I11Il1l1l1lI1()
         .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.I1l1llI1IlI1.CloudFriendInfo());
      ItemStack ItemStack = (ItemStack)ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II
         .player
         .getInventory()
         .main
         .get(this.l111llI1I1lI1IlIlII1IIl1lI);
      this.Il11I11l1IIlIlll11ll1lIllI11Il.ZenithInternal101(ItemStack.isEmpty());
      lliii11l1lllil.StringHolder_8(f, f1, 22.0F, 22.0F, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate((double)f + 4.6, (double)f1 + 4.6, 1.0);
      lliii11l1lllil.getMatrices().scale(0.8F, 0.8F, 0.8F);
      lliii11l1lllil.StringHolder_8(ItemStack, 0, 0);
      ((DrawContextAccessor)lliii11l1lllil).callDrawItemBar(ItemStack, 0, 0);
      ((DrawContextAccessor)lliii11l1lllil).callDrawCooldownProgress(ItemStack, 0, 0);
      lliii11l1lllil.IIlII1lII1();
      lliii11l1lllil.StringHolder_8(
         font,
         String.valueOf(this.l111llI1I1lI1IlIlII1IIl1lI + 1),
         f + (22.0F - font.width(String.valueOf(this.l111llI1I1lI1IlIlII1IIl1lI + 1))) / 2.0F,
         f1 + (22.0F - font.height()) / 2.0F,
         zenithstyle.getTextTertiary().HostnameVerifierImpl(this.Il11I11l1IIlIlll11ll1lIllI11Il.CloudFriendInfo())
      );
      if (ItemStack.getCount() > 1) {
         String s = "x" + ItemStack.getCount();
         float f3 = font.width(s);
         float f4 = f + 22.0F - f3 - 3.0F;
         float f5 = f1 + 22.0F - font.height() - 3.0F;
         lliii11l1lllil.StringHolder_8(font, s, f4, f5, il1iliilli1l1iill1);
      }
   }
}
