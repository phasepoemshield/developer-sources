package zenith.zov.client.screens.menu.settings.impl.popup;

import zenith.hud.*;

import java.awt.Color;
import java.util.Objects;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.Vector2f;
import zenith.ZenithInternal027;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.doubleHolder_3;
import zenith.PatternHolder;
import zenith.ZenithInternal076;
import zenith.GetHeightHandler;
import zenith.floatHolder_8;
import zenith.OnMouseClickedHandler;
import zenith.ZenithInternal097$Helper;
import zenith.ColorSetting;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuPopupSetting;

public class MenuColorPopupSetting extends MenuPopupSetting {
   private boolean open;
   // $VF: renamed from: hue float
   private float defaultPenalty;
   private float saturation;
   private float brightness;
   private int alpha;
   private boolean afocused;
   private boolean hfocused;
   private boolean sbfocused;
   private ColorSetting setting;
   private final OnMouseClickedHandler colorString;

   public MenuColorPopupSetting(GetHeightHandler l1l1ii11lllll, ColorSetting llil11111111l1il1ii) {
      super(l1l1ii11lllll);
      this.setting = llil11111111l1il1ii;
      this.colorString = new OnMouseClickedHandler(new Vector2f(0.0F, 0.0F), Fonts.MEDIUM.getFont(7.0F), "color", 78.0F);
      this.colorString.StringHolder_8(ZenithInternal097$Helper.IIIll1l11I);
      this.colorString.EventImpl_38(6);
      this.updatePos();
      this.animationScale.StringHolder_8(1.0F);
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      return this.colorString.keyPressed(i, j, k);
   }

   @Override
   public boolean charTyped(char c0, int i) {
      return this.colorString.charTyped(c0, i);
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, SetColorHandler_3 llliili1l1ii11i1lii1) {
      this.animationScale.ArmorHud();
      f2 = 1.0F;
      iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(this.bounds.getX(), this.bounds.getY() + this.bounds.getHeight() / 2.0F, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().scale(this.animationScale.CloudFriendInfo(), this.animationScale.CloudFriendInfo(), 1.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-this.bounds.getX(), -(this.bounds.getY() + this.bounds.getHeight() / 2.0F), 0.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         this.bounds.getX(),
         this.bounds.getY(),
         this.bounds.getWidth(),
         this.bounds.getHeight(),
         floatHolder_5.StringHolder_30(4.0F),
         llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f2)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         this.bounds.getX(),
         this.bounds.getY(),
         this.bounds.getWidth(),
         18.0F,
         floatHolder_5.StringHolder_19(4.0F, 4.0F),
         llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1().ZenithInternal039(f2)
      );
      if (ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.currentScreen == null) {
         this.afocused = false;
         this.hfocused = false;
         this.sbfocused = false;
      }

      float f3 = this.bounds.getX();
      float f4 = this.bounds.getY();
      float f5 = this.bounds.getWidth();
      float f6 = this.bounds.getHeight();
      float f7 = 5.0F;
      float f8 = f7 + f3;
      float f9 = f7 + f4 + 18.0F;
      float f10 = f5 - f7 * 2.0F;
      float f11 = 48.0F;
      Font font = Fonts.ICONS.getFont(6.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font, "V", f3 + f7, f4 + (18.0F - font.height()) / 2.0F, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font, "M", f3 + f5 - f7 - font.width("M"), f4 + (18.0F - font.height()) / 2.0F, llliili1l1ii11i1lii1.l1l1lIIlI1l11().ZenithInternal039(f2)
      );
      Font font1 = Fonts.MEDIUM.getFont(7.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1,
         this.setting.getName(),
         f3 + 8.0F + 8.0F,
         f4 + (18.0F - font1.height()) / 2.0F,
         llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl().ZenithInternal039(f2)
      );
      this.bounds.setWidth(Math.max(96.0F, font1.width(this.setting.getName()) + 30.0F));
      this.bounds.setHeight(18.0F + f7 + f11 + f7 + 6.0F + f7 + 6.0F + f7 + 18.0F + f7);
      float f12 = f8 + f10 - (f10 - f10 * this.saturation);
      float f13 = f9 + (f11 - f11 * this.brightness);
      float f14 = f10 * this.defaultPenalty;
      float f15 = f10 * (float)this.alpha / 255.0F;
      ByteBufferHolder il1iliilli1l1iill = new ByteBufferHolder(Color.getHSBColor(this.defaultPenalty, 0.0F, 1.0F)).ZenithInternal039(f2);
      ByteBufferHolder il1iliilli1l1iill1 = new ByteBufferHolder(Color.getHSBColor(this.defaultPenalty, 1.0F, 1.0F)).ZenithInternal039(f2);
      ByteBufferHolder il1iliilli1l1iill2 = new ByteBufferHolder(new Color(0, 0, 0, 0));
      ByteBufferHolder il1iliilli1l1iill3 = new ByteBufferHolder(new Color(0, 0, 0));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f8,
         f9,
         f10,
         f11,
         floatHolder_5.StringHolder_30(4.0F),
         ZenithInternal027.StringHolder_8(il1iliilli1l1iill, il1iliilli1l1iill, il1iliilli1l1iill1, il1iliilli1l1iill1)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f8,
         f9,
         f10,
         f11,
         floatHolder_5.StringHolder_30(4.0F),
         ZenithInternal027.StringHolder_8(il1iliilli1l1iill2, il1iliilli1l1iill3, il1iliilli1l1iill2, il1iliilli1l1iill3)
      );
      iiii1ilili1l1l1lilli1liliii.EventBus(
         f8, f9, f10, f11, 0.1F, floatHolder_5.StringHolder_30(4.0F), ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f12 - 2.0F, f13 - 2.0F, 6.0F, 6.0F, floatHolder_5.StringHolder_30(2.0F), ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
      );
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(1.0F);
      floatHolder_8.StringHolder_8(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         ZenithClient.StringHolder_10("icons/sliderhue.png"),
         f8,
         f9 + f11 + f7,
         f10,
         4.0F,
         iil11iill1il1l1llilll1l1i1i1,
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f8 + f14 - 2.0F,
         f9 + f11 + f7 - 1.0F,
         6.0F,
         6.0F,
         floatHolder_5.StringHolder_30(2.0F),
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
      );
      floatHolder_8.StringHolder_8(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         ZenithClient.StringHolder_10("icons/slidertransparent.png"),
         f8,
         f9 + f11 + f7 + 6.0F + f7,
         f10,
         4.0F,
         iil11iill1il1l1llilll1l1i1i1,
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
      );
      ByteBufferHolder il1iliilli1l1iill4 = this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1().EventImpl_36(255).ZenithInternal039(f2);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f8,
         f9 + f11 + f7 + 6.0F + f7,
         f10,
         4.0F,
         iil11iill1il1l1llilll1l1i1i1,
         ZenithInternal027.StringHolder_8(
            ByteBufferHolder.lllIll11l1I11Il1II11II1I11, ByteBufferHolder.lllIll11l1I11Il1II11II1I11, il1iliilli1l1iill4, il1iliilli1l1iill4
         )
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f8 + f15 - 2.0F,
         f9 + f11 + 6.0F + f7 + f7 - 1.0F,
         6.0F,
         6.0F,
         floatHolder_5.StringHolder_30(2.0F),
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f8,
         f9 + f11 + f7 + 6.0F + f7 + 6.0F + f7,
         f10,
         14.0F,
         iil11iill1il1l1llilll1l1i1i1,
         llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1().ZenithInternal039(f2)
      );
      iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, "#", f8 + f7, f9 + f11 + f7 + 6.0F + f7 + 6.0F + f7 + 4.0F, llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
      );
      this.colorString
         .StringHolder_8(
            iiii1ilili1l1l1lilli1liliii,
            f8 + f7 + font1.width("#") + 1.0F,
            f9 + f11 + f7 + 6.0F + f7 + 6.0F + f7 + 4.5F,
            llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl().ZenithInternal039(f2),
            llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III().ZenithInternal039(f2)
         );
      this.colorString.setWidth(f10 - 20.0F);
      iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
      Color color = Color.getHSBColor(this.defaultPenalty, this.saturation, this.brightness);
      if (this.sbfocused) {
         this.saturation = MathHelper.clamp(f - f8, 0.0F, f10) / f10;
         this.brightness = (f11 - MathHelper.clamp(f1 - f9, 0.0F, f11)) / f11;
         this.saturation = MathHelper.clamp(this.saturation, 0.0F, 1.0F);
         this.brightness = MathHelper.clamp(this.brightness, 0.0F, 1.0F);
         color = Color.getHSBColor(this.defaultPenalty, this.saturation, this.brightness);
         this.setColor(new ByteBufferHolder(color.getRed(), color.getGreen(), color.getBlue(), this.alpha));
      }

      if (this.hfocused) {
         this.defaultPenalty = MathHelper.clamp(f - f8, 0.0F, f10) / f10;
         this.defaultPenalty = MathHelper.clamp(this.defaultPenalty, 0.0F, 1.0F);
         color = Color.getHSBColor(this.defaultPenalty, this.saturation, this.brightness);
         this.setColor(new ByteBufferHolder(color.getRed(), color.getGreen(), color.getBlue(), this.alpha));
      }

      if (this.afocused) {
         this.alpha = (int)(MathHelper.clamp((f - f3) / f10, 0.0F, 1.0F) * 255.0F);
         this.setColor(new ByteBufferHolder(color.getRed(), color.getGreen(), color.getBlue(), this.alpha));
      }

      if (this.colorString.isSelected()) {
         this.setColor(PatternHolder.StringHolder_8(this.colorString.II1I11IIl(), this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1()));
         this.updatePos();
      } else {
         this.colorString.GetDisplayNameHandler(PatternHolder.ZenithInternal045(this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1()));
         this.colorString.EventImpl_16(6);
      }

      iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
   }

   @Override
   public void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3) {
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      this.colorString.onMouseClicked(d0, d1, ill1iili11ii1l);
      float f = this.bounds.getX();
      float f1 = this.bounds.getY();
      float f2 = this.bounds.getWidth();
      float f3 = this.bounds.getHeight();
      float f4 = 5.0F;
      float f5 = f4 + f;
      float f6 = f4 + f1 + 18.0F;
      float f7 = f2 - f4 * 2.0F;
      float f8 = 48.0F;
      if (doubleHolder_3.StringHolder_8(
         d0, d1, (double)this.colorString.I1l111ll1I().getX(), (double)this.colorString.I1l111ll1I().getY(), (double)f7, 14.0
      )) {
         this.colorString.setSelected(true);
      }

      if (doubleHolder_3.StringHolder_8(d0, d1, (double)f5, (double)f6, (double)f7, (double)f8)) {
         if (!this.hfocused && !this.afocused) {
            this.sbfocused = true;
         }
      } else if (doubleHolder_3.StringHolder_8(d0, d1, (double)f5, (double)(f6 + f8 + f4), (double)f7, 6.0)) {
         if (!this.sbfocused && !this.afocused) {
            this.hfocused = true;
         }
      } else if (doubleHolder_3.StringHolder_8(d0, d1, (double)f5, (double)(f6 + f8 + f4 + 6.0F + f4), (double)f2, 6.0)) {
         if (!this.hfocused && !this.sbfocused) {
            this.afocused = true;
         }
      } else {
         Font font = Fonts.ICONS.getFont(6.0F);
         if (doubleHolder_3.StringHolder_8(
            d0, d1, (double)(f + f2 - f4 - font.width("M")), (double)(f1 + (18.0F - font.height()) / 2.0F), (double)font.width("M"), 4.0
         )) {
            this.animationScale.StringHolder_8(0.0F);
         }
      }
   }

   @Override
   public float getWidth() {
      return 0.0F;
   }

   @Override
   public float getHeight() {
      return 0.0F;
   }

   @Override
   public boolean isVisible() {
      return true;
   }

   private void updatePos() {
      float[] afloat = Color.RGBtoHSB(
         this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1().IlIIlllIIIlllI1Il1Il11llI1lll(),
         this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1().llI11I1ll11IlI(),
         this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1().III11IllIIIIlII1Il1IIlI(),
         null
      );
      this.defaultPenalty = afloat[0];
      this.saturation = afloat[1];
      this.brightness = afloat[2];
      this.alpha = this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1().I11Ill1I1I1llll11Il1I1I();
   }

   private void setColor(ByteBufferHolder il1iliilli1l1iill) {
      this.setting.setColor(il1iliilli1l1iill);
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) {
         return true;
      } else {
         return object instanceof MenuColorPopupSetting menucolorpopupsetting1 ? this.setting == menucolorpopupsetting1.setting : false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.setting);
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      this.hfocused = false;
      this.sbfocused = false;
      this.afocused = false;
   }
}
