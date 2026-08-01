package zenith.zov.client.screens.nlgui.elements.setting;

import zenith.hud.*;

import zenith.StringHolder_3;
import zenith.BindSetting;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.GuiSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiKeySetting extends GuiSetting<BindSetting> {
   private final GetStartTimeHandler animationEnable = new GetStartTimeHandler(200L, IReturn.ScreenImpl);
   private HeightHandler bounds;
   private boolean binding;

   public GuiKeySetting(BindSetting iii11ll1iiiiiill1lil) {
      super(166.0F, iii11ll1iiiiiill1lil);
   }

   public GuiKeySetting(BindSetting iii11ll1iiiiiill1lil, float f) {
      super(f, iii11ll1iiiiiill1lil);
   }

   @Override
   public String getName() {
      return this.setting.getName();
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.binding && ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() >= 2) {
         this.setting.setKeyCode(ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll());
         this.binding = false;
         return true;
      } else if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         this.binding = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      if (!this.binding) {
         return super.keyPressed(i, j, k);
      } else {
         if (i != 256 && i != 261 && i != 259) {
            this.setting.setKeyCode(i);
         } else {
            this.setting.setKeyCode(-1);
         }

         this.binding = false;
         return true;
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      try {
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         if (zenithstyle == null) {
            return;
         }

         this.animationVisible.ZenithInternal101(this.setting.isVisible());
         f4 *= this.animationVisible.CloudFriendInfo();
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font1 = Fonts.NEW_REGULAR.getFont(5.4F);
         float f5 = this.width / 1.4F - (float)GuiStyle.PADDING.intValue();
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         this.drawDefault(
            iiii1ilili1l1l1lilli1liliii,
            f,
            f1,
            "N",
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
         String s = this.getBindText();
         this.animationEnable.ZenithInternal101(this.binding || this.setting.Elytramotion() != -1);
         Font font2 = Fonts.NEW_MEDIUM.getFont(4.5F);
         Font font3 = Fonts.NEW_ICONS.getFont(4.2F);
         float f6 = font2.width(s);
         float f7 = (float)GuiStyle.PADDING.intValue() / 2.0F
            + f6
            + (float)GuiStyle.PADDING.intValue() / 3.0F
            + 3.75F
            + (float)GuiStyle.PADDING.intValue() / 2.0F;
         float f8 = 7.0F;
         float f9 = f2 + this.width - f7;
         float f10 = f3 + (this.getHeight() - f8) / 2.0F;
         this.bounds = new HeightHandler(f9, f10, f7, f8);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f9,
            f10,
            f7,
            f8,
            floatHolder_5.StringHolder_30(1.5F),
            zenithstyle.getDisableActiveBg()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(
                  zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(0.15F), this.animationEnable.CloudFriendInfo()
               )
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2,
            s,
            f9 + (float)GuiStyle.PADDING.intValue() / 2.0F,
            f10 + (f8 - font2.height()) / 2.0F,
            zenithstyle.getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animationEnable.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font3,
            "N",
            f9 + (float)GuiStyle.PADDING.intValue() / 2.0F + f6 + (float)GuiStyle.PADDING.intValue() / 3.0F,
            f10 + (float)GuiStyle.PADDING.intValue() / 2.0F,
            zenithstyle.getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animationEnable.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   private String getBindText() {
      if (this.binding) {
         return this.getBindingDots();
      } else {
         String s = "n/a";
         int i = this.setting.Elytramotion();
         if (i != -1 && i != 0) {
            try {
               String s1 = StringHolder_3.doubleHolder_2(i);
               if (s1 != null && !s1.isBlank()) {
                  s = s1.toUpperCase();
               }
            } catch (Exception exception) {
            }
         }

         return s;
      }
   }

   private String getBindingDots() {
      int i = (int)(System.currentTimeMillis() / 500L % 3L);
      if (i == 0) {
         return ".";
      } else {
         return i == 1 ? ".." : "...";
      }
   }
}
