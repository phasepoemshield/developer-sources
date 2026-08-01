package zenith.zov.client.screens.nlgui.elements.setting;

import zenith.hud.*;

import java.util.Locale;
import net.minecraft.util.math.MathHelper;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.NumberSetting;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.GuiSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiNumberSetting extends GuiSetting<NumberSetting> {
   private final GetStartTimeHandler hoveredEnable = new GetStartTimeHandler(200L, IReturn.ScreenImpl);
   private final GetStartTimeHandler numberAnimation;
   private HeightHandler bounds;
   private HeightHandler selectedBounds;
   private boolean selected = false;
   public float applayValue;

   public float getApplayValue() {
      return this.selected ? this.applayValue : this.setting.lll1lI1llll1IIllIIIII1lll();
   }

   public GuiNumberSetting(NumberSetting illil1lill1llll11) {
      this(illil1lill1llll11, 166.0F);
   }

   public GuiNumberSetting(NumberSetting illil1lill1llll11, float f) {
      super(f, illil1lill1llll11);
      this.numberAnimation = new GetStartTimeHandler(200L, illil1lill1llll11.lll1lI1llll1IIllIIIII1lll(), IReturn.ScreenImpl);
      this.applayValue = illil1lill1llll11.lll1lI1llll1IIllIIIII1lll();
   }

   @Override
   public String getName() {
      return this.setting.getName();
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.selectedBounds != null && this.selectedBounds.StringHolder_8(d0, d1, 2.0F)) {
         this.selected = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      this.selected = false;
      this.applayValue = this.setting.lll1lI1llll1IIllIIIII1lll();
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         if (!this.selected) {
            this.applayValue = this.setting.lll1lI1llll1IIllIIIII1lll();
         }

         this.animationVisible.ZenithInternal101(this.setting.isVisible());
         f4 *= this.animationVisible.CloudFriendInfo();
         this.hoveredEnable
            .ZenithInternal101(this.selected || this.selectedBounds != null && this.selectedBounds.byteHolder((double)f, (double)f1));
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font1 = Fonts.NEW_REGULAR.getFont(5.4F);
         float f5 = this.width / 2.0F - (float)GuiStyle.PADDING.intValue();
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         this.drawDefault(
            iiii1ilili1l1l1lilli1liliii,
            f,
            f1,
            "u",
            this.setting.getName(),
            this.setting.llllIII11IIl1ll1llI1lII1I(),
            font,
            font1,
            f2,
            f3,
            f5,
            il1iliilli1l1iill,
            il1iliilli1l1iill1,
            il1iliilli1l1iill2
         );
         String s = String.valueOf(this.setting.IIl11llIllllI1lI11I());
         int i = 0;
         int j = s.indexOf(46);
         if (j != -1 && (s.charAt(j + 1) != '0' || s.length() > j + 2 && s.charAt(j + 2) != '0')) {
            i = s.length() - j - 1;
         }

         String s1 = String.format(Locale.US, "%." + i + "f", this.numberAnimation.CloudFriendInfo());
         float f6 = font.width(this.setting.getSuffix());
         float f7 = font.width(s1);
         float f8 = (float)GuiStyle.PADDING.intValue() / 2.0F + f7 + f6 + (float)GuiStyle.PADDING.intValue() / 2.0F + 1.0F;
         float f9 = 9.0F;
         this.bounds = new HeightHandler(f2 + this.width - f8, f3 + (this.getHeight() - f9) / 2.0F, f8, f9);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f8,
            f9,
            floatHolder_5.StringHolder_30(1.0F),
            zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         iiii1ilili1l1l1lilli1liliii.EventBus(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f8,
            f9,
            -0.5F,
            floatHolder_5.StringHolder_30(1.0F),
            zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            s1,
            this.bounds.Il11lIlllI111I1l1111() + (float)GuiStyle.PADDING.intValue() / 2.0F,
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f9 - font.height()) / 2.0F,
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            this.setting.getSuffix(),
            this.bounds.Il11lIlllI111I1l1111() + this.bounds.width() - (float)GuiStyle.PADDING.intValue() / 2.0F - f6,
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f9 - font.height()) / 2.0F,
            zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         float f10 = (float)GuiStyle.PADDING.intValue() / 2.0F + font.width(s1.replaceAll(".", "0")) + f6 + (float)GuiStyle.PADDING.intValue() / 2.0F + 1.0F;
         float f11 = f5 - f10 - (float)GuiStyle.PADDING.intValue();
         float f12 = 2.0F;
         float f13 = f2 + this.width - f10 - f11 - (float)GuiStyle.PADDING.intValue();
         float f14 = f3 + (this.getHeight() - f12) / 2.0F;
         this.selectedBounds = new HeightHandler(f13, f14, f11, f12);
         float f15 = this.setting.Il1llI11l1();
         float f16 = this.setting.Il1IIllllIIIll1I1IIIIIlI();
         float f17 = MathHelper.lerp(0.3F, this.numberAnimation.CloudFriendInfo(), this.setting.lll1lI1llll1IIllIIIII1lll());
         this.numberAnimation.EventBus(f17);
         float f18 = MathHelper.clamp((f17 - f15) / (f16 - f15), 0.0F, 1.0F);
         this.numberAnimation.EventImpl_21(120L);
         this.numberAnimation.StringHolder_8(IReturn.ZenithInternal135);
         float f19 = f11 * f18;
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f13,
            f14,
            f11,
            f12,
            floatHolder_5.StringHolder_30(0.04F),
            zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f13,
            f14,
            f19 - 0.5F,
            f12,
            floatHolder_5.FinishThread(0.04F, 0.04F),
            zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f13 + f19 - 0.5F,
            f14 - 0.5F,
            3.0F,
            3.0F,
            floatHolder_5.StringHolder_30(1.0F),
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         this.updateSlider((double)f);
      }
   }

   public void updateSlider(double d0) {
      if (this.selected) {
         if (this.selectedBounds != null) {
            double d1 = d0 - (double)this.selectedBounds.Il11lIlllI111I1l1111();
            double d2 = Math.max(0.0, Math.min(1.0, d1 / (double)this.selectedBounds.width()));
            double d3 = (double)this.setting.Il1llI11l1();
            double d4 = (double)this.setting.Il1IIllllIIIll1I1IIIIIlI();
            float f = this.setting.IIl11llIllllI1lI11I();
            double d5 = d3 + (d4 - d3) * d2;
            d5 = (double)((float)Math.round((d5 - d3) / (double)f) * f) + d3;
            d5 = Math.max(d3, Math.min(d4, d5));
            if (this.setting.lll1lI1llll1IIllIIIII1lll() != (float)d5) {
               ZenithClient.getInstance()
                  .MinecraftClientHolder_5()
                  .StringHolder_8(ZenithClient.getInstance().MinecraftClientHolder_5().II11l111l1IllII);
            }

            this.setting.longHolder_4((float)d5);
         }
      }
   }

   @Override
   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f4, float f5, float f6, float f7, float f8, float f9) {
      float f = this.setting.Il1llI11l1();
      float f1 = this.setting.Il1IIllllIIIll1I1IIIIIlI();
      float f2 = this.numberAnimation.CloudFriendInfo();
      float f3 = MathHelper.clamp((f2 - f) / (f1 - f), 0.0F, 1.0F);
   }
}
