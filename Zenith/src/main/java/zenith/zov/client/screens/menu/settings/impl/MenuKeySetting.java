package zenith.zov.client.screens.menu.settings.impl;

import zenith.StringHolder_3;
import zenith.BindSetting;
import zenith.floatHolder_4;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.HeightHandler;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;

public class MenuKeySetting extends MenuSetting {
   private final BindSetting setting;
   private HeightHandler bounds;
   private boolean binding = false;

   public MenuKeySetting(BindSetting iii11ll1iiiiiill1lil) {
      this.setting = iii11ll1iiiiiill1lil;
   }

   @Override
   public void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f13,
      float f14,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      ByteBufferHolder il1iliilli1l1iill2,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill3,
      SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      float f5 = 24.0F;
      float f6 = f + 8.0F;
      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.MEDIUM.getFont(6.0F);
      float f7 = f1 + (8.0F - font.height()) / 2.0F - 0.5F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, this.setting.getName(), f + 8.0F + 10.0F, f7, il1iliilli1l1iill);
      float f8 = 6.0F;
      float f9 = f7 - 1.0F;
      Font font2 = Fonts.ICONS.getFont(6.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         Fonts.ICONS.getFont(5.5F),
         "L",
         f6 + 1.2F,
         f9 + 1.2F,
         llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III().StringHolder_8(llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), f4).ZenithInternal039(f3)
      );
      String s = this.binding ? "..." : "n/a";
      int i = this.setting.Elytramotion();
      if (i != -1 && i != 0 && !this.binding) {
         try {
            String s1 = StringHolder_3.doubleHolder_2(i);
            if (s1 != null && !s1.isBlank()) {
               s = s1.toLowerCase();
               if (s.length() > 6) {
                  s = s.substring(0, 6) + "..";
               }
            }
         } catch (Exception exception) {
         }
      }

      Font font3 = Fonts.MEDIUM.getFont(7.0F);
      float f10 = 4.0F + font3.width(s) + 4.0F;
      float f11 = 8.0F;
      float f12 = f + f2 - f10 - 8.0F;
      ByteBufferHolder il1iliilli1l1iill1 = llliili1l1ii11i1lii1.l1l1lIIlI1l11()
         .StringHolder_8(llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), f4)
         .ZenithInternal039(f3);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f12, f1, f10, f11, floatHolder_5.StringHolder_30(2.0F), il1iliilli1l1iill1);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font3, s, f12 + 4.0F, f1 + 1.0F, il1iliilli1l1iill);
      this.bounds = new HeightHandler(f12, f1, f10, f11);
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.binding && ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() >= 2) {
         this.setting.setKeyCode(ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll());
         this.binding = false;
      } else if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         this.binding = true;
      }
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      if (!this.binding) {
         return false;
      } else {
         if (i == 256 || i == 261 || i == 259) {
            i = -1;
         }

         this.setting.setKeyCode(i);
         this.binding = false;
         return true;
      }
   }

   @Override
   public float getWidth() {
      return 0.0F;
   }

   @Override
   public float getHeight() {
      return 8.0F;
   }

   @Override
   public boolean isVisible() {
      return this.setting.l1l1II1I1ll11l1IlI1lI11l1().get();
   }

   public BindSetting getSetting() {
      return this.setting;
   }
}
