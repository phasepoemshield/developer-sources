package zenith.zov.client.screens.nlgui.elements.setting;

import zenith.hud.*;

import java.awt.Color;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.Vector2f;
import zenith.ZenithInternal027;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.PatternHolder;
import zenith.floatHolder_8;
import zenith.OnMouseClickedHandler;
import zenith.ZenithInternal097$Helper;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.ColorSetting;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.GuiSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiColorSetting extends GuiSetting<ColorSetting> {
   private final GetStartTimeHandler animationExpanded = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private HeightHandler bounds;
   private HeightHandler rectBounds;
   private HeightHandler colorBounds;
   private HeightHandler hueBounds;
   private HeightHandler alphaBounds;
   private HeightHandler textBounds;
   private HeightHandler copyBounds;
   private HeightHandler pasteBounds;
   private HeightHandler exitBounds;
   private boolean expanded;
   // $VF: renamed from: hue float
   private float field_11;
   private float saturation;
   private float brightness;
   private int alpha;
   private boolean sbFocused;
   private boolean hFocused;
   private boolean aFocused;
   private OnMouseClickedHandler colorString;

   public GuiColorSetting(ColorSetting llil11111111l1il1ii) {
      this(llil11111111l1il1ii, 166.0F);
   }

   public GuiColorSetting(ColorSetting llil11111111l1il1ii, float f) {
      super(f, llil11111111l1il1ii);
      this.updateFromColor();
   }

   @Override
   public String getName() {
      return this.setting.getName();
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.StringHolder_8(d0, d1, 2.0F)) {
         if (this.animationExpanded.HootBar() == 0.0F) {
            this.expanded = true;
         } else {
            this.expanded = false;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      if (this.colorString == null) {
         this.colorString = new OnMouseClickedHandler(new Vector2f(0.0F, 0.0F), Fonts.NEW_MEDIUM.getFont(5.5F), "Enter hex color", 0.0F);
         this.colorString.StringHolder_8(ZenithInternal097$Helper.IIIll1l11I);
         this.colorString.EventImpl_38(6);
      }

      if (!this.expanded) {
         this.updateFromColor();
      }

      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
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
            "x",
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
         float f6 = 4.0F;
         float f7 = 4.0F;
         this.bounds = new HeightHandler(f2 + this.width - f6, f3 + (this.getHeight() - f7) / 2.0F, f6, f7);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f6,
            f7,
            floatHolder_5.StringHolder_30(1.0F),
            zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f6,
            f7,
            -0.5F,
            floatHolder_5.StringHolder_30(1.0F),
            zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         Font font2 = Fonts.NEW_ICONS.getFont(6.0F);
         float f8 = 1.5F;
         ByteBufferHolder il1iliilli1l1iill3 = this.setting.HostnameVerifierImpl(f4);
         ByteBufferHolder il1iliilli1l1iill4 = ByteBufferHolder.Il1lII1I1l1ll1IlIllllll1Il1ll1.ZenithInternal039(f4);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            this.bounds.Il11lIlllI111I1l1111() - f8,
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() - f8,
            f6 + f8 * 2.0F,
            f7 + f8 * 2.0F,
            0.1F,
            floatHolder_5.StringHolder_30(3.0F),
            il1iliilli1l1iill3
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f6,
            f7,
            floatHolder_5.StringHolder_30(3.0F),
            ZenithInternal027.StringHolder_8(il1iliilli1l1iill4, il1iliilli1l1iill3, il1iliilli1l1iill3, il1iliilli1l1iill4)
         );
      }
   }

   @Override
   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f30, float f31, float f2, float f32) {
      this.animationExpanded.ZenithInternal101(this.expanded);
      if (!(this.animationExpanded.CloudFriendInfo() <= 0.0F) && this.bounds != null) {
         float f3 = (float)(GuiStyle.PADDING * 2) + this.getHeight() + (float)(GuiStyle.PADDING * 2);
         float f4 = (float)(GuiStyle.PADDING * 2);
         float f5 = 126.0F;
         float f6 = 64.0F;
         float f7 = 0.0F;
         float f8 = 4.0F;
         float f9 = 14.0F;
         float f10 = f3 + f4 + f6 + f4 + f7 + f4 + f8 + f4 + f8 + f4 * 2.0F + f9 + f4;
         float f11 = this.bounds.Il11lIlllI111I1l1111() + (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f12 = this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() - f10 / 2.0F;
         this.rectBounds = new HeightHandler(f11, f12, f5, f10);
         f2 *= this.animationExpanded.CloudFriendInfo();
         iiii1ilili1l1l1lilli1liliii.getMatrices().push();
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f11, this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(), 0.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices()
            .scale(this.animationExpanded.CloudFriendInfo(), this.animationExpanded.CloudFriendInfo(), 1.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-f11, -this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(), 0.0F);
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         if (zenithstyle != null) {
            floatHolder_8.EventImpl_24(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               f11,
               f12,
               f5,
               f10,
               12.0F,
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f11,
               f12,
               f5,
               f3,
               floatHolder_5.StringHolder_19((float)GuiStyle.ROUND.intValue() / 2.0F, (float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            Font font = Fonts.NEW_ICONS.getFont(4.0F);
            float f13 = f11 + f5 - font.width("2") - f4;
            float f14 = f12 + f4 + font.height();
            this.exitBounds = new HeightHandler(f13, f14, 5.0F, 5.0F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font, "2", f13, f14, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            float f15 = f11 + f4;
            float f16 = f12 + f3 + f4;
            float f17 = f5 - f4 * 2.0F;
            this.colorBounds = new HeightHandler(f15, f16, f17, f6);
            float f18 = f15 + f17 * this.saturation;
            float f19 = f16 + (f6 - f6 * this.brightness);
            float f20 = f17 * this.field_11;
            float f21 = f17 * ((float)this.alpha / 255.0F);
            ByteBufferHolder il1iliilli1l1iill = new ByteBufferHolder(Color.getHSBColor(this.field_11, 0.0F, 1.0F)).ZenithInternal039(f2);
            ByteBufferHolder il1iliilli1l1iill1 = new ByteBufferHolder(Color.getHSBColor(this.field_11, 1.0F, 1.0F)).ZenithInternal039(f2);
            ByteBufferHolder il1iliilli1l1iill2 = new ByteBufferHolder(new Color(0, 0, 0, 0)).ZenithInternal039(f2);
            ByteBufferHolder il1iliilli1l1iill3 = new ByteBufferHolder(new Color(0, 0, 0)).ZenithInternal039(f2);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f11,
               f16 - f4,
               f5,
               f6 + f4 * 2.0F,
               floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
               zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f15,
               f16,
               f17,
               f6,
               floatHolder_5.StringHolder_30(4.0F),
               ZenithInternal027.StringHolder_8(il1iliilli1l1iill, il1iliilli1l1iill, il1iliilli1l1iill1, il1iliilli1l1iill1)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f15,
               f16,
               f17,
               f6,
               floatHolder_5.StringHolder_30(4.0F),
               ZenithInternal027.StringHolder_8(il1iliilli1l1iill2, il1iliilli1l1iill3, il1iliilli1l1iill2, il1iliilli1l1iill3)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f18 - 2.0F,
               f19 - 2.0F,
               6.0F,
               6.0F,
               floatHolder_5.StringHolder_30(2.0F),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
            );
            Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
            Font font2 = Fonts.NEW_REGULAR.getFont(5.4F);
            float f22 = f5 / 1.4F - (float)GuiStyle.PADDING.intValue();
            ByteBufferHolder il1iliilli1l1iill4 = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2);
            ByteBufferHolder il1iliilli1l1iill5 = zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2);
            ByteBufferHolder il1iliilli1l1iill6 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2);
            this.drawDefault(
               iiii1ilili1l1l1lilli1liliii,
               f,
               f1,
               "x",
               this.setting.getName(),
               this.setting.llllIII11IIl1ll1llI1lII1I(),
               font1,
               font2,
               f15,
               f12 + f4,
               f22,
               il1iliilli1l1iill4,
               il1iliilli1l1iill5,
               il1iliilli1l1iill6
            );
            float f26 = f16 + f6 + f4 * 2.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f11,
               f26 - f4,
               f5,
               f4 * 3.0F + f8 * 2.0F,
               floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
               zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            this.hueBounds = new HeightHandler(f15, f26, f17, f8);
            floatHolder_8.StringHolder_8(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               ZenithClient.StringHolder_10("icons/sliderhue.png"),
               f15,
               f26,
               f17,
               f8,
               floatHolder_5.StringHolder_30(1.0F),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f15 + f20 - 2.0F,
               f26 - 1.0F,
               6.0F,
               6.0F,
               floatHolder_5.StringHolder_30(2.0F),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
            );
            float f27 = f26 + f8 + f4;
            this.alphaBounds = new HeightHandler(f15, f27, f17, f8);
            floatHolder_8.StringHolder_8(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               ZenithClient.StringHolder_10("icons/slidertransparent.png"),
               f15,
               f27,
               f17,
               f8,
               floatHolder_5.StringHolder_30(1.0F),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
            );
            ByteBufferHolder il1iliilli1l1iill7 = this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1().EventImpl_36(255).ZenithInternal039(f2);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f15,
               f27,
               f17,
               f8,
               floatHolder_5.StringHolder_30(1.0F),
               ZenithInternal027.StringHolder_8(
                  ByteBufferHolder.lllIll11l1I11Il1II11II1I11, ByteBufferHolder.lllIll11l1I11Il1II11II1I11, il1iliilli1l1iill7, il1iliilli1l1iill7
               )
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f15 + f21 - 2.0F,
               f27 - 1.0F,
               6.0F,
               6.0F,
               floatHolder_5.StringHolder_30(2.0F),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
            );
            float f28 = f27 + f4 + f8;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f11,
               f28,
               f5,
               f7,
               floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
               zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            float f29 = f28 + f7 + f4;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f11,
               f29 - f4,
               f5,
               f9 + f4 * 2.0F,
               floatHolder_5.ZenithInternal016((float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            float f23 = f15 + f17 - f9;
            float f24 = f23 - f4 / 2.0F - f9;
            float f25 = f24 - f4 / 2.0F - f15;
            this.textBounds = new HeightHandler(f15, f29, f25, f9);
            this.copyBounds = new HeightHandler(f24, f29, f9, f9);
            this.pasteBounds = new HeightHandler(f23, f29, f9, f9);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               this.textBounds.Il11lIlllI111I1l1111(),
               this.textBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               this.textBounds.width(),
               this.textBounds.height(),
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.EventBus(
               this.textBounds.Il11lIlllI111I1l1111(),
               this.textBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               this.textBounds.width(),
               this.textBounds.height(),
               0.1F,
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            Font font3 = Fonts.NEW_MEDIUM.getFont(5.4F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font3,
               "#",
               this.textBounds.Il11lIlllI111I1l1111() + f4,
               this.textBounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f9 - font3.height()) / 2.0F,
               zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            this.colorString.setWidth(this.textBounds.width() - f4 * 2.0F - font3.width("#"));
            this.colorString
               .StringHolder_8(
                  iiii1ilili1l1l1lilli1liliii,
                  this.textBounds.Il11lIlllI111I1l1111() + f4 + font3.width("#") + 1.0F,
                  this.textBounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f9 - font3.height()) / 2.0F,
                  zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2),
                  zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
               );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               this.copyBounds.Il11lIlllI111I1l1111(),
               this.copyBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               this.copyBounds.width(),
               this.copyBounds.height(),
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getDisableActiveBg().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               this.pasteBounds.Il11lIlllI111I1l1111(),
               this.pasteBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               this.pasteBounds.width(),
               this.pasteBounds.height(),
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            Font font4 = Fonts.NEW_ICONS.getFont(5.0F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font4,
               "L",
               this.copyBounds.Il11lIlllI111I1l1111() + (f9 - font4.width("C")) / 2.0F,
               this.copyBounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f9 - font4.height()) / 2.0F,
               zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font4,
               "M",
               this.pasteBounds.Il11lIlllI111I1l1111() + (f9 - font4.width("P")) / 2.0F + 0.2F,
               this.pasteBounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f9 - font4.height()) / 2.0F,
               zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            if (this.sbFocused) {
               this.saturation = MathHelper.clamp(f - f15, 0.0F, f17) / f17;
               this.brightness = (f6 - MathHelper.clamp(f1 - f16, 0.0F, f6)) / f6;
               this.saturation = MathHelper.clamp(this.saturation, 0.0F, 1.0F);
               this.brightness = MathHelper.clamp(this.brightness, 0.0F, 1.0F);
               this.setColorFromHSB();
            }

            if (this.hFocused) {
               this.field_11 = MathHelper.clamp(f - f15, 0.0F, f17) / f17;
               this.field_11 = MathHelper.clamp(this.field_11, 0.0F, 1.0F);
               this.setColorFromHSB();
            }

            if (this.aFocused) {
               this.alpha = (int)(MathHelper.clamp((f - f15) / f17, 0.0F, 1.0F) * 255.0F);
               this.setColorFromHSB();
            }

            if (this.colorString.isSelected()) {
               this.setColor(
                  PatternHolder.StringHolder_8(this.colorString.II1I11IIl(), this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1())
                     .EventImpl_36(this.alpha)
               );
               this.updateFromColor();
            } else {
               this.colorString.GetDisplayNameHandler(PatternHolder.ZenithInternal045(this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1()));
               this.colorString.EventImpl_16(6);
            }

            iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
         }
      }
   }

   @Override
   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (!this.expanded || this.rectBounds == null) {
         return false;
      } else if (!this.rectBounds.byteHolder(d0, d1)) {
         this.expanded = false;
         this.colorString.setSelected(false);
         this.sbFocused = false;
         this.hFocused = false;
         this.aFocused = false;
         return false;
      } else if (this.exitBounds != null && this.exitBounds.StringHolder_8(d0, d1, 2.0F)) {
         this.expanded = false;
         this.colorString.setSelected(false);
         this.sbFocused = false;
         this.hFocused = false;
         this.aFocused = false;
         return true;
      } else {
         if (this.textBounds != null && this.textBounds.byteHolder(d0, d1)) {
            this.colorString.setSelected(true);
         } else {
            this.colorString.setSelected(false);
         }

         if (this.copyBounds != null && this.copyBounds.byteHolder(d0, d1)) {
            l11I1I1ll1Illll1I1l1111l1II.keyboard.setClipboard(PatternHolder.ZenithInternal045(this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1()));
            return true;
         } else if (this.pasteBounds != null && this.pasteBounds.byteHolder(d0, d1)) {
            String s = l11I1I1ll1Illll1I1l1111l1II.keyboard.getClipboard();
            if (s != null) {
               s = s.replace("#", "").trim();
               this.colorString.GetDisplayNameHandler(s);
               this.colorString.EventImpl_16(Math.min(s.length(), 6));
               this.setColor(PatternHolder.StringHolder_8(s, this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1()).EventImpl_36(this.alpha));
               this.updateFromColor();
            }

            return true;
         } else if (this.colorBounds != null && this.colorBounds.byteHolder(d0, d1)) {
            if (!this.hFocused && !this.aFocused) {
               this.sbFocused = true;
            }

            return true;
         } else if (this.hueBounds != null && this.hueBounds.byteHolder(d0, d1)) {
            if (!this.sbFocused && !this.aFocused) {
               this.hFocused = true;
            }

            return true;
         } else if (this.alphaBounds != null && this.alphaBounds.byteHolder(d0, d1)) {
            if (!this.sbFocused && !this.hFocused) {
               this.aFocused = true;
            }

            return true;
         } else {
            return true;
         }
      }
   }

   @Override
   public boolean onMousePriorityScroll(double d0, double d1, double d2, double d3) {
      if (!this.expanded) {
         return false;
      } else {
         this.expanded = false;
         this.colorString.setSelected(false);
         this.sbFocused = false;
         this.hFocused = false;
         this.aFocused = false;
         return false;
      }
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      return this.expanded && this.colorString.keyPressed(i, j, k) ? true : super.keyPressed(i, j, k);
   }

   @Override
   public boolean charTyped(char c0, int i) {
      return this.expanded && this.colorString.charTyped(c0, i) ? true : super.charTyped(c0, i);
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      this.sbFocused = false;
      this.hFocused = false;
      this.aFocused = false;
      super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   private void updateFromColor() {
      float[] afloat = Color.RGBtoHSB(
         this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1().IlIIlllIIIlllI1Il1Il11llI1lll(),
         this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1().llI11I1ll11IlI(),
         this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1().III11IllIIIIlII1Il1IIlI(),
         null
      );
      this.field_11 = afloat[0];
      this.saturation = afloat[1];
      this.brightness = afloat[2];
      this.alpha = this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1().I11Ill1I1I1llll11Il1I1I();
   }

   private void setColorFromHSB() {
      Color color = Color.getHSBColor(this.field_11, this.saturation, this.brightness);
      this.setting.setColor(new ByteBufferHolder(color.getRed(), color.getGreen(), color.getBlue(), this.alpha));
   }

   private void setColor(ByteBufferHolder il1iliilli1l1iill) {
      this.setting.setColor(il1iliilli1l1iill);
   }
}
