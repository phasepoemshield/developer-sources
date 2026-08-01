package zenith.zov.client.screens.menu.settings.impl;

import java.util.Locale;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.NumberSetting;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;

public class MenuSliderSetting extends MenuSetting {
   private final NumberSetting setting;
   private boolean dragging = false;
   private HeightHandler rect;
   private final GetStartTimeHandler animation = new GetStartTimeHandler(300L, IReturn.ZenithInternal022);

   public MenuSliderSetting(NumberSetting illil1lill1llll11) {
      this.setting = illil1lill1llll11;
   }

   @Override
   public void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f,
      float f20,
      float f1,
      float f2,
      float f3,
      float f4,
      float f5,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill2,
      SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      float f6 = 8.0F;
      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.REGULAR.getFont(7.0F);
      Font font2 = Fonts.ICONS.getFont(7.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font2, "D", f1 + f6, f2, il1iliilli1l1iill);
      float f7 = f1 + f6 + 10.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, this.setting.getName(), f7, f2, il1iliilli1l1iill1);
      float f8 = this.setting.lll1lI1llll1IIllIIIII1lll();
      float f9 = this.setting.llllIII11IIl1ll1llI1lII1I().isEmpty() ? f3 - 20.0F : f3 / 2.8F;
      float f10 = 35.0F;
      float f11 = f1 + f3 - f6 - 4.0F - f9;
      float f12 = f2 + 12.0F;
      String s = String.format(Locale.US, "%.2f", f8);
      float f13 = font.width(s);
      float f14 = f1 + f3 - f6 - f13;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f14, f2, il1iliilli1l1iill);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f11, f12, f9, 2.0F, floatHolder_5.StringHolder_30(0.2F), llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1().ZenithInternal039(f4)
      );
      float f15 = (f8 - this.setting.Il1llI11l1()) / (this.setting.Il1IIllllIIIll1I1IIIIIlI() - this.setting.Il1llI11l1());
      float f16 = f9 * f15;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f11,
         f12,
         f16 - 2.0F,
         2.0F,
         floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
         llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III().StringHolder_8(llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), f5).ZenithInternal039(f4)
      );
      float f17 = f11 + f16;
      float f18 = f12 - 1.0F;
      ByteBufferHolder il1iliilli1l1iill3 = llliili1l1ii11i1lii1.I111llllll1ll1l1Il()
         .StringHolder_8(llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(), f5)
         .ZenithInternal039(f4);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f17, f18, 4.0F, 4.0F, floatHolder_5.StringHolder_30(2.0F), il1iliilli1l1iill3);
      this.rect = new HeightHandler(f11, f12 - 2.0F, f9, 6.0F);
      if (!this.setting.llllIII11IIl1ll1llI1lII1I().isEmpty()) {
         float f19 = f2 + 10.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, this.setting.llllIII11IIl1ll1llI1lII1I(), f1 + f6, f19, il1iliilli1l1iill2);
      }

      this.updateSlider((double)f);
   }

   public void updateSlider(double d0) {
      if (this.dragging) {
         HeightHandler li1il11i1iilii1iiili111li11 = this.rect;
         if (li1il11i1iilii1iiili111li11 != null) {
            double d1 = d0 - (double)li1il11i1iilii1iiili111li11.Il11lIlllI111I1l1111();
            double d2 = Math.max(0.0, Math.min(1.0, d1 / (double)li1il11i1iilii1iiili111li11.width()));
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
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl && this.rect != null && this.rect.byteHolder(d0, d1)) {
         this.dragging = true;
         if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0 || ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 1) {
            ZenithClient.getInstance()
               .MinecraftClientHolder_5()
               .StringHolder_8(
                  ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0
                     ? ZenithClient.getInstance().MinecraftClientHolder_5().IIl1l1II1I11IllI1I111Ill1
                     : ZenithClient.getInstance().MinecraftClientHolder_5().l11l11lII11lIl1l
               );
         }
      }
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         this.dragging = false;
      }
   }

   @Override
   public float getWidth() {
      return 0.0F;
   }

   @Override
   public float getHeight() {
      return 14.0F;
   }

   @Override
   public boolean isVisible() {
      return this.setting.l1l1II1I1ll11l1IlI1lI11l1().get();
   }

   public NumberSetting getSetting() {
      return this.setting;
   }
}
