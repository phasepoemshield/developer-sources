package zenith;

import zenith.hud.*;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

class Cooldowns$II1Il11l111II11IIl {
   private final GetStartTimeHandler IIlIIl1Ill1ll1l1lI = new GetStartTimeHandler(150L, 0.01F, IReturn.ListHolder_8);
   private final GetStartTimeHandler lIIIIl1IlII1ll1II1111lll;
   private final ItemStack IIIl11IIII11llIIl111l;
   private final String III1llI1lI1Il11lIl1I1I111;
   private final Supplier<Float> lIll1I111lIll1ll1II1I1II;
   private final BooleanSupplier ll1IlI1l1lIlIlI111lII;
   private final Supplier<Integer> IlIl1lIllIIllII1llll111lI;

   Cooldowns$II1Il11l111II11IIl(
      ItemStack ItemStack, String ItemStack, float s, Supplier<Float> f, BooleanSupplier supplier, Supplier<Integer> booleansupplier, Supplier supplier1
   ) {
      this.IIIl11IIII11llIIl111l = ItemStack;
      this.III1llI1lI1Il11lIl1I1I111 = s;
      this.lIll1I111lIll1ll1II1I1II = supplier;
      this.ll1IlI1l1lIlIlI111lII = booleansupplier;
      this.IlIl1lIllIIllII1llll111lI = supplier1;
      this.lIIIIl1IlII1ll1II1111lll = new GetStartTimeHandler(200L, f, IReturn.ScreenImpl);
   }

   float IIIlI1lI11l1111IlIl11() {
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      String s = this.StringHolder(this.IlIl1lIllIIllII1llll111lI.get());
      float f = 100.0F;
      float f1 = font.width(this.III1llI1lI1Il11lIl1I1I111);
      float f2 = font1.width(s);
      float f3 = this.getHeight();
      float f4 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + (float)GuiStyle.PADDING.intValue() / 2.0F + f2 + f3);
      float f5 = (float)(8 + GuiStyle.PADDING * 2) + f4;
      float f6 = f - (f5 + 8.0F);
      if (f6 < 8.0F + f1 + 8.0F) {
         f += f1 + 8.0F + 8.0F - f6;
      }

      return f;
   }

   float getHeight() {
      return 7.0F;
   }

   void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, float f2) {
      float f3 = this.Il1II1lIll1Illl11llIl111();
      this.IIlIIl1Ill1ll1l1lI.StringHolder_8(f3 > 0.0F ? 1.0F : 0.0F);
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      String s = this.StringHolder(this.IlIl1lIllIIllII1llll111lI.get());
      float f4 = font1.width(s);
      float f5 = this.getHeight();
      float f6 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + (float)GuiStyle.PADDING.intValue() / 2.0F + f4 + f5);
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(f + f2 / 2.0F, f1 + this.getHeight() / 2.0F, 0.0F);
      lliii11l1lllil.getMatrices().scale(this.IIlIIl1Ill1ll1l1lI.CloudFriendInfo(), this.IIlIIl1Ill1ll1l1lI.CloudFriendInfo(), 1.0F);
      lliii11l1lllil.getMatrices().translate(-(f + f2 / 2.0F), -(f1 + this.getHeight() / 2.0F), 0.0F);
      float f7 = 0.35F;
      float f8 = 16.0F * f7;
      float f9 = f + 8.0F;
      float f10 = f1 + (this.getHeight() - f8) / 2.0F - 0.1F;
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(f9, f10, 0.0F);
      lliii11l1lllil.getMatrices().scale(f7, f7, 1.0F);
      lliii11l1lllil.StringHolder_8(this.IIIl11IIII11llIIl111l, 0, 0);
      lliii11l1lllil.IIlII1lII1();
      float f11 = f + 8.0F + f8 + (float)GuiStyle.PADDING.intValue();
      lliii11l1lllil.StringHolder_8(
         font,
         this.III1llI1lI1Il11lIl1I1I111,
         f11,
         f1 + (this.getHeight() - font.height()) / 2.0F,
         zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      float f12 = f + f2 - f6 - (float)(GuiStyle.PADDING * 2);
      float f13 = f12 + f6 - (float)GuiStyle.PADDING.intValue() / 2.0F - f5;
      float f14 = f1 + (this.getHeight() - f5) / 2.0F;
      lliii11l1lllil.StringHolder_8(
         f12, f1, f6, this.getHeight(), floatHolder_5.StringHolder_30(1.0F), zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      float f15 = f12 + (float)GuiStyle.PADDING.intValue();
      float f16 = f13 - (float)GuiStyle.PADDING.intValue();
      float f17 = Math.max(0.0F, f16 - f15);
      lliii11l1lllil.StringHolder_8(
         font1, s, f15 + (f17 - f4) / 2.0F, f1 + (this.getHeight() - font1.height()) / 2.0F, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      floatHolder_8.StringHolder_8(
         lliii11l1lllil.getMatrices(), f13, f14, f5, f5, 1.0F, 360.0F, 0.5F, zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      floatHolder_8.StringHolder_8(
         lliii11l1lllil.getMatrices(), f13, f14, f5, f5, 1.0F, 360.0F * f3, 0.5F, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.IIlII1lII1();
   }

   boolean IlIl11l11ll() {
      return this.IIlIIl1Ill1ll1l1lI.CloudFriendInfo() == 0.0F && this.ll1IlI1l1lIlIlI111lII.getAsBoolean();
   }

   private float Il1II1lIll1Illl11llIl111() {
      float f = MathHelper.clamp(this.lIll1I111lIll1ll1II1I1II.get(), 0.0F, 1.0F);
      this.lIIIIl1IlII1ll1II1111lll.StringHolder_8(f);
      return MathHelper.clamp(this.lIIIIl1IlII1ll1II1111lll.CloudFriendInfo(), 0.0F, 1.0F);
   }

   private String StringHolder(int i) {
      if (i < 0) {
         i = 0;
      }

      int j = i / 60;
      int k = i % 60;
      return String.format("%d:%02d", j, k);
   }
}
