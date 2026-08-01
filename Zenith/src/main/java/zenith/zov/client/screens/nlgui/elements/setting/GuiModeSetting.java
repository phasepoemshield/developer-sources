package zenith.zov.client.screens.nlgui.elements.setting;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.ModeSetting;
import zenith.ModeOption;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.base.font.MsdfRenderer;
import zenith.zov.client.screens.nlgui.elements.api.GuiSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiModeSetting extends GuiSetting<ModeSetting> {
   private final GetStartTimeHandler animationExpanded = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private final GetStartTimeHandler textFadeAnimation = new GetStartTimeHandler(130L, 1.0F, IReturn.ScreenImpl);
   private final List<GuiModeSetting$RenderValue> renderValues = new ArrayList<>();
   private HeightHandler bounds;
   private HeightHandler rectBounds;
   private boolean expanded;
   private String displayedValueText = "";
   private String pendingValueText = "";
   private boolean textSwitchPending;
   private boolean textAppearing;

   public GuiModeSetting(ModeSetting liii11li1iliiiii1l1li) {
      this(liii11li1iliiiii1l1li, 166.0F);
   }

   public GuiModeSetting(ModeSetting liii11li1iliiiii1l1li, float f) {
      super(f, liii11li1iliiiii1l1li);

      for (ModeOption liii11li1iliiiii1l1li$ii1il11l111ii11iil : liii11li1iliiiii1l1li.ll1lIIIIlII()) {
         this.renderValues.add(new GuiModeSetting$RenderValue(this, liii11li1iliiiii1l1li$ii1il11l111ii11iil));
      }

      this.displayedValueText = liii11li1iliiiii1l1li.lII1I1l1IlIIl1I().getName();
   }

   @Override
   public String getName() {
      return this.setting.getName();
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         this.expanded = !this.expanded;
         return true;
      } else if (this.expanded && this.rectBounds != null && this.rectBounds.byteHolder(d0, d1)) {
         return true;
      } else {
         this.expanded = false;
         return false;
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         this.animationVisible.ZenithInternal101(this.setting.isVisible());
         f4 *= this.animationVisible.CloudFriendInfo();
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
            "v",
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
         float f6 = this.width / 2.0F;
         float f7 = this.getHeight();
         this.bounds = new HeightHandler(f2 + this.width - f6, f3 + (this.getHeight() - f7) / 2.0F, f6, f7);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f6,
            f7,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
            zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         iiii1ilili1l1l1lilli1liliii.EventBus(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f6,
            f7,
            0.1F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
            zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         String s = this.setting.lII1I1l1IlIIl1I().getName();
         if (this.displayedValueText.isEmpty()) {
            this.displayedValueText = s;
            this.textFadeAnimation.EventBus(1.0F);
         }

         if (!this.textSwitchPending && !s.equals(this.displayedValueText)) {
            this.pendingValueText = s;
            this.textSwitchPending = true;
            this.textAppearing = false;
            this.textFadeAnimation.ZenithInternal095(0.0F);
         } else if (this.textSwitchPending && !s.equals(this.pendingValueText)) {
            this.pendingValueText = s;
         }

         float f8 = this.textFadeAnimation.ArmorHud();
         if (this.textSwitchPending && !this.textAppearing && f8 <= 0.02F) {
            this.displayedValueText = this.pendingValueText;
            this.textAppearing = true;
            this.textFadeAnimation.EventBus(0.0F);
            this.textFadeAnimation.ZenithInternal095(1.0F);
            f8 = 0.0F;
         } else if (this.textSwitchPending && this.textAppearing && f8 >= 0.98F) {
            this.textSwitchPending = false;
            this.textAppearing = false;
            this.textFadeAnimation.EventBus(1.0F);
            f8 = 1.0F;
         } else if (!this.textSwitchPending) {
            f8 = this.textFadeAnimation.StringHolder_8(1.0F);
         }

         this.textFadeAnimation.StringHolder_8(IReturn.ListHolder_8);
         this.textFadeAnimation.EventImpl_21(200L);
         Font font2 = Fonts.NEW_MEDIUM.getFont(5.3F);
         float f9 = this.bounds.Il11lIlllI111I1l1111() + (float)GuiStyle.PADDING.intValue();
         float f10 = this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f7 - font2.height()) / 2.0F;
         float f11 = f6 - (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f12;
         float f13;
         if (this.textSwitchPending && !this.textAppearing) {
            f12 = f8;
            f13 = 1.0F;
         } else if (this.textSwitchPending) {
            f12 = 0.0F;
            f13 = Math.max(0.02F, f8);
         } else {
            f12 = 1.0F;
            f13 = 1.0F;
         }

         MsdfRenderer.renderText(
            font2.getFont(),
            this.displayedValueText,
            font2.getSize(),
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4).lllIlll1Ill111l111Il11II11lII(),
            iiii1ilili1l1l1lilli1liliii.getMatrices().peek().getPositionMatrix(),
            f9,
            f10,
            0.0F,
            true,
            f12,
            f13,
            f11
         );
      }
   }

   @Override
   public float getHeight() {
      return 14.0F;
   }

   @Override
   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, float f10) {
      f4 *= this.animationExpanded.CloudFriendInfo() * this.animationVisible.CloudFriendInfo();
      float f5 = this.width / 2.0F;
      float f6 = this.getHeight();
      this.bounds = new HeightHandler(f2 + this.width - f5, f3 + (this.getHeight() - f6) / 2.0F, f5, f6);
      this.animationExpanded.ZenithInternal101(this.expanded);
      if (this.animationExpanded.CloudFriendInfo() > 0.0F) {
         float f7 = (float)GuiStyle.PADDING.intValue() / 2.0F + (float)this.renderValues.size() * (10.0F + (float)GuiStyle.PADDING.intValue() / 2.0F);
         float f8 = this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() + f6 + (float)GuiStyle.PADDING.intValue();
         iiii1ilili1l1l1lilli1liliii.getMatrices().push();
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(this.bounds.Il11lIlllI111I1l1111() + f5 / 2.0F, f8, 0.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices()
            .scale(this.animationExpanded.CloudFriendInfo(), this.animationExpanded.CloudFriendInfo(), 1.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-(this.bounds.Il11lIlllI111I1l1111() + f5 / 2.0F), -f8, 0.0F);
         this.rectBounds = new HeightHandler(this.bounds.Il11lIlllI111I1l1111(), f8, f5, f7);
         floatHolder_8.EventImpl_24(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            this.bounds.Il11lIlllI111I1l1111(),
            f8,
            f5,
            f7,
            12.0F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f4)
         );
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         if (zenithstyle != null) {
            iiii1ilili1l1l1lilli1liliii.EventBus(
               this.bounds.Il11lIlllI111I1l1111(),
               f8,
               f5,
               f7,
               floatHolder_5.StringHolder_30(4.0F),
               zenithstyle.getLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4 * 1.2F)
            );
            iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
            iiii1ilili1l1l1lilli1liliii.EventBus(
               this.bounds.Il11lIlllI111I1l1111(),
               f8,
               f5,
               f7,
               0.1F,
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
            );
         }

         f8 += (float)GuiStyle.PADDING.intValue() / 2.0F;
         Font font = Fonts.NEW_MEDIUM.getFont(5.3F);
         Font font1 = Fonts.NEW_ICONS.getFont(5.0F);

         for (GuiModeSetting$RenderValue guimodesetting$rendervalue : this.renderValues) {
            guimodesetting$rendervalue.addRectToBatch(iiii1ilili1l1l1lilli1liliii, f, f1, this.bounds.Il11lIlllI111I1l1111(), f8, f4);
            f8 += 10.0F + (float)GuiStyle.PADDING.intValue() / 2.0F;
         }

         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         float f9 = this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() + f6 + (float)GuiStyle.PADDING.intValue() + (float)GuiStyle.PADDING.intValue() / 2.0F;

         for (GuiModeSetting$RenderValue guimodesetting$rendervalue1 : this.renderValues) {
            guimodesetting$rendervalue1.renderText(iiii1ilili1l1l1lilli1liliii, this.bounds.Il11lIlllI111I1l1111(), f9, f4, font, font1);
            f9 += 10.0F + (float)GuiStyle.PADDING.intValue() / 2.0F;
         }

         iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
      }
   }

   @Override
   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.expanded && this.rectBounds != null && this.rectBounds.byteHolder(d0, d1) && ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0) {
         for (GuiModeSetting$RenderValue guimodesetting$rendervalue : this.renderValues) {
            if (guimodesetting$rendervalue.onMouseClicked(d0, d1, ill1iili11ii1l)) {
               return true;
            }
         }

         return true;
      } else if ((this.bounds == null || !this.bounds.byteHolder(d0, d1)) && this.expanded) {
         this.expanded = false;
         return false;
      } else {
         return super.onMousePriorityClicked(d0, d1, ill1iili11ii1l);
      }
   }

   @Override
   public boolean onMousePriorityScroll(double d0, double d1, double d2, double d3) {
      this.expanded = false;
      return false;
   }

   public boolean contains(float f, float f1) {
      return this.expanded && this.rectBounds != null && this.rectBounds.byteHolder((double)f, (double)f1);
   }
}
