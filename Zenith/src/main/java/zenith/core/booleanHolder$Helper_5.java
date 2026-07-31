package zenith;

import zenith.hud.*;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.math.MathHelper;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

class TargetPotions$II1Il11l111II11IIl {
   private final GetStartTimeHandler l11111IllI11llI1I1l;
   private final GetStartTimeHandler ll11lIl1l1IlI11llI1I1I1llI1I1;
   private final boolean lIIII1l11III11ll;
   private StatusEffectInstance lllll111llI1l1111I11lI1Il1;
   private int l11I1Il11I11l1I1;

   TargetPotions$II1Il11l111II11IIl(TargetPotions lilil1i111ll111li11l1l1, StatusEffectInstance StatusEffectInstance, boolean flag) {
      this.Ill1IlII1111l1l1lIIllI1lI = lilil1i111ll111li11l1l1;
      this.l11111IllI11llI1I1l = new GetStartTimeHandler(150L, 0.01F, IReturn.ListHolder_8);
      this.ll11lIl1l1IlI11llI1I1I1llI1I1 = new GetStartTimeHandler(200L, 1.0F, IReturn.ScreenImpl);
      this.lllll111llI1l1111I11lI1Il1 = StatusEffectInstance;
      this.lIIII1l11III11ll = flag;
      this.l11I1Il11I11l1I1 = Math.max(1, StatusEffectInstance.getDuration());
   }

   float IIIlI1lI11l1111IlIl11() {
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      String s = this.Ill1IlII1111l1l1lIIllI1lI.EventBus(this.lllll111llI1l1111I11lI1Il1);
      String s1 = this.Ill1IlII1111l1l1lIIllI1lI.StringHolder_12(this.lllll111llI1l1111I11lI1Il1.getDuration());
      float f = 100.0F;
      float f1 = font.width(s);
      float f2 = font1.width(s1);
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

   boolean l1lIII1l1I() {
      return this.lIIII1l11III11ll;
   }

   void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, float f2) {
      String s = this.Ill1IlII1111l1l1lIIllI1lI.EventTarget(this.lllll111llI1l1111I11lI1Il1);
      if (!this.Ill1IlII1111l1l1lIIllI1lI.l1lII1I11 && this.Ill1IlII1111l1l1lIIllI1lI.I1I1l1llIl1lI != null) {
         this.lllll111llI1l1111I11lI1Il1 = this.Ill1IlII1111l1l1lIIllI1lI
            .I1I1l1llIl1lI
            .getActiveStatusEffects()
            .values()
            .stream()
            .filter(StatusEffectInstance -> this.Ill1IlII1111l1l1lIIllI1lI.EventTarget(StatusEffectInstance).equals(s))
            .findAny()
            .orElse(this.lllll111llI1l1111I11lI1Il1);
      }

      this.l11111IllI11llI1I1l
         .StringHolder_8(this.Ill1IlII1111l1l1lIIllI1lI.lII11IlIl1l1I1IIl11II1llI.contains(s) && !this.Ill1IlII1111l1l1lIIllI1lI.l1lII1I11 ? 1.0F : 0.0F);
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      String s1 = this.Ill1IlII1111l1l1lIIllI1lI.EventBus(this.lllll111llI1l1111I11lI1Il1);
      String s2 = this.Ill1IlII1111l1l1lIIllI1lI.StringHolder_12(this.lllll111llI1l1111I11lI1Il1.getDuration());
      float f3 = font1.width(s2);
      float f4 = this.getHeight();
      float f5 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + (float)GuiStyle.PADDING.intValue() / 2.0F + f3 + f4);
      int i = Math.max(0, this.lllll111llI1l1111I11lI1Il1.getDuration());
      if (this.Ill1IlII1111l1l1lIIllI1lI.lII11IlIl1l1I1IIl11II1llI.contains(s) && !this.Ill1IlII1111l1l1lIIllI1lI.l1lII1I11) {
         this.l11I1Il11I11l1I1 = Math.max(this.l11I1Il11I11l1I1, Math.max(1, i));
      }

      float f6 = this.l11I1Il11I11l1I1 <= 0 ? 0.0F : MathHelper.clamp((float)i / (float)this.l11I1Il11I11l1I1, 0.0F, 1.0F);
      float f7 = MathHelper.clamp(this.ll11lIl1l1IlI11llI1I1I1llI1I1.StringHolder_8(f6), 0.0F, 1.0F);
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(f + f2 / 2.0F, f1 + this.getHeight() / 2.0F, 0.0F);
      float f8 = this.l11111IllI11llI1I1l.CloudFriendInfo();
      lliii11l1lllil.getMatrices().scale(f8, f8, 1.0F);
      lliii11l1lllil.getMatrices().translate(-(f + f2 / 2.0F), -(f1 + this.getHeight() / 2.0F), 0.0F);
      float f9 = 6.0F;
      float f10 = f + 8.0F;
      float f11 = f1 + (this.getHeight() - f9) / 2.0F + 1.0F;
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(f10, f11, 0.0F);
      lliii11l1lllil.StringHolder_8(
         RenderLayer::getGuiTextured,
         ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.getStatusEffectSpriteManager().getSprite(this.lllll111llI1l1111I11lI1Il1.getEffectType()),
         0,
         0,
         (int)f9,
         (int)f9
      );
      lliii11l1lllil.IIlII1lII1();
      float f12 = f + 8.0F + f9 + (float)GuiStyle.PADDING.intValue();
      lliii11l1lllil.StringHolder_8(
         font, s1, f12, f1 + (this.getHeight() - font.height()) / 2.0F, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      float f13 = f + f2 - f5 - (float)(GuiStyle.PADDING * 2);
      float f14 = f13 + f5 - (float)GuiStyle.PADDING.intValue() / 2.0F - f4;
      float f15 = f1 + (this.getHeight() - f4) / 2.0F;
      lliii11l1lllil.StringHolder_8(
         f13, f1, f5, this.getHeight(), floatHolder_5.StringHolder_30(1.0F), zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      float f16 = f13 + (float)GuiStyle.PADDING.intValue();
      float f17 = f14 - (float)GuiStyle.PADDING.intValue();
      float f18 = Math.max(0.0F, f17 - f16);
      lliii11l1lllil.StringHolder_8(
         font1, s2, f16 + (f18 - f3) / 2.0F, f1 + (this.getHeight() - font1.height()) / 2.0F, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      floatHolder_8.StringHolder_8(
         lliii11l1lllil.getMatrices(), f14, f15, f4, f4, 1.0F, 360.0F, 0.5F, zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      floatHolder_8.StringHolder_8(
         lliii11l1lllil.getMatrices(), f14, f15, f4, f4, 1.0F, 360.0F * f7, 0.5F, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.IIlII1lII1();
   }

   boolean IlIl11l11ll() {
      return this.l11111IllI11llI1I1l.CloudFriendInfo() == 0.0F;
   }
}
