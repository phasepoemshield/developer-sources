package zenith.zov.client.screens.nlgui.panel;

import zenith.hud.*;

import com.google.gson.JsonObject;
import java.io.IOException;
import zenith.BooleanSetting;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.ZenithClient$II1Il11l111II11IIl;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ButtonSetting;
import zenith.ZenithInternal068;
import zenith.NumberSetting;
import zenith.StringHolder_18;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.setting.GuiBooleanSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiButtonSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiNumberSetting;
import zenith.zov.client.screens.nlgui.panel.api.Panel;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class ClientPanel extends Panel {
   private final GetStartTimeHandler animationVisible = new GetStartTimeHandler(300L, 0.0F, IReturn.ListHolder_8);
   private boolean expanded = false;
   private final GuiNumberSetting guiScale = new GuiNumberSetting(
      new NumberSetting("panel.client.setting.guiScale", 100.0F, 100.0F, 250.0F, 5.0F, "", "%", () -> true, (f, f1) -> {
      }), 112.0F
   );
   private final GuiNumberSetting blurStrength = new GuiNumberSetting(
      new NumberSetting("panel.client.setting.backgroundBlur", 20.0F, 0.0F, 30.0F, 5.0F, "", "px"), 112.0F
   );
   private final GuiBooleanSetting renderDescription = new GuiBooleanSetting(new BooleanSetting("panel.client.setting.description", true), 112.0F);
   private final GuiBooleanSetting renderIcon = new GuiBooleanSetting(new BooleanSetting("panel.client.setting.settingIcon", true), 112.0F);
   private final GuiButtonSetting webProfile = new GuiButtonSetting(new ButtonSetting("panel.client.setting.telegram", "W", () -> {
      try {
         Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler https://t.me/zenithdlcdevlog");
      } catch (IOException ioexception) {
         ioexception.printStackTrace();
      }
   }), 112.0F);
   private final GuiButtonSetting openFolder = new GuiButtonSetting(new ButtonSetting("panel.client.setting.chat", "T", () -> {
      try {
         Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler https://t.me/+J-lV24z-Wmg1M2Y6");
      } catch (IOException ioexception) {
         ioexception.printStackTrace();
      }
   }), 112.0F);
   private HeightHandler exitBounds;

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2) {
      this.animationVisible.ZenithInternal101(this.expanded);
      this.animationVisible.EventImpl_21(200L);
      f *= this.animationVisible.CloudFriendInfo();
      float f3 = 128.0F;
      float f4 = 227.0F;
      iiii1ilili1l1l1lilli1liliii.ListHolder_6(f1 - (float)(GuiStyle.PADDING * 3), f2, f1 + f3 + (float)(GuiStyle.PADDING * 4), f2 + f4);
      f1 -= (f3 + (float)GuiStyle.PADDING.intValue()) * (1.0F - this.animationVisible.CloudFriendInfo());
      if (ZenithClient.getInstance().ZenithInternal141().getBlurPower() != 0.0F) {
         floatHolder_8.StringHolder_8(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            f1,
            f2,
            f3,
            f4,
            ZenithClient.getInstance().ZenithInternal141().getBlurPower(),
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f),
            true,
            false
         );
      }

      float f5 = 29.0F;
      float f6 = 45.0F;
      float f7 = 67.0F;
      float f8 = 56.0F;
      float f9 = 30.0F;
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      this.renderHeader(iiii1ilili1l1l1lilli1liliii, i, j, f, f1, f2, f3, f5, zenithstyle);
      this.renderTill(iiii1ilili1l1l1lilli1liliii, i, j, f, f1, f2 + f5, f3, f6, zenithstyle);
      this.renderSettings(iiii1ilili1l1l1lilli1liliii, i, j, f, f1, f2 + f5 + f6, f3, f7, zenithstyle);
      this.renderInfo(iiii1ilili1l1l1lilli1liliii, i, j, f, f1, f2 + f5 + f6 + f7, f3, f8, zenithstyle);
      this.renderButton(iiii1ilili1l1l1lilli1liliii, i, j, f, f1, f2 + f5 + f6 + f7 + f8, f3, f9, zenithstyle);
      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
   }

   public void renderButton(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3, float f4, ZenithStyle zenithstyle
   ) {
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f1,
         f2,
         f3,
         f4,
         floatHolder_5.ZenithInternal016((float)GuiStyle.ROUND.intValue()),
         zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      float f5 = f1 + (float)(GuiStyle.PADDING * 2);
      float f6 = f2 + (float)(GuiStyle.PADDING * 2);
      float f7 = 112.0F;
      float f8 = 14.0F;
      Font font = Fonts.NEW_REGULAR.getFont(5.0F);
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.0F);
      Font font2 = Fonts.NEW_ICONS.getFont(5.0F);
      float f9 = f7 / 3.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f5 + f9,
         f6 + 1.0F,
         0.5F,
         f8 - 2.0F,
         floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
         zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f5 + f9 * 2.0F,
         f6 + 1.0F,
         0.5F,
         f8 - 2.0F,
         floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
         zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      this.renderBox(iiii1ilili1l1l1lilli1liliii, font, font1, font2, "Version", "P", "3.0", f5, f6, f9, f8, zenithstyle, f);
      this.renderBox(iiii1ilili1l1l1lilli1liliii, font, font1, font2, "Commit", "Q", "129", f5 + f9, f6, f9, f8, zenithstyle, f);
      this.renderBox(
         iiii1ilili1l1l1lilli1liliii,
         font,
         font1,
         font2,
         "Build",
         "R",
         ZenithClient.getInstance().ListHolder_7().GetClientColorHandler().getName(),
         f5 + f9 + f9,
         f6,
         f9,
         f8,
         zenithstyle,
         f
      );
   }

   private void renderBox(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      Font font,
      Font font1,
      Font font2,
      String s,
      String s1,
      String s2,
      float f,
      float f1,
      float f2,
      float f3,
      ZenithStyle zenithstyle,
      float f4
   ) {
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f + (f2 - font.width(s)) / 2.0F, f1, zenithstyle.getTextSecondary().HostnameVerifierImpl(f4));
      float f5 = font2.width(s1);
      float f6 = f5 + (float)GuiStyle.PADDING.intValue() / 2.0F + font1.width(s2);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font2,
         s1,
         f + (f2 - f6) / 2.0F,
         f1 + f3 - font2.height() - (float)GuiStyle.PADDING.intValue() / 2.0F,
         zenithstyle.getPrimaryColor().HostnameVerifierImpl(f4)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1,
         s2,
         f + (f2 - f6) / 2.0F + f5 + (float)GuiStyle.PADDING.intValue() / 2.0F,
         f1 + f3 - font1.height() - (float)GuiStyle.PADDING.intValue() / 2.0F,
         zenithstyle.getTextEnable().HostnameVerifierImpl(f4)
      );
   }

   public void renderHeader(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3, float f4, ZenithStyle zenithstyle
   ) {
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f1,
         f2,
         f3,
         f4,
         floatHolder_5.GetDisplayNameHandler_2((float)GuiStyle.ROUND.intValue()),
         zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      float f5 = f1 + (float)(GuiStyle.PADDING * 2);
      float f6 = f2 + (float)(GuiStyle.PADDING * 2);
      Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
      Font font1 = Fonts.NEW_REGULAR.getFont(5.0F);
      ZenithClient$II1Il11l111II11IIl iiil1llll1liili1lilii1l1li1iii$ii1il11l111ii11iil = ZenithClient.getInstance()
         .ListHolder_7();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font, "Client", f5, f6 + 1.0F, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, "Global system settings", f5, f6 + font.height() + 3.0F, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      Font font2 = Fonts.NEW_ICONS.getFont(4.0F);
      float f7 = f1 + f3 - font2.width("2") - (float)(GuiStyle.PADDING * 2);
      float f8 = f6 + 2.0F;
      this.exitBounds = new HeightHandler(f7, f8, 5.0F, 5.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font2, "2", f7, f8, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f));
   }

   public void renderTill(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3, float f4, ZenithStyle zenithstyle
   ) {
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f1,
         f2,
         f3,
         f4,
         floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
         zenithstyle.getLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      float f5 = f1 + (float)(GuiStyle.PADDING * 2);
      float f6 = f2 + (float)(GuiStyle.PADDING * 2);
      Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
      Font font1 = Fonts.NEW_REGULAR.getFont(5.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, "Navigation", f5, f6, zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      f6 += font1.height() + (float)GuiStyle.PADDING.intValue();
      this.webProfile.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f5, f6, f);
      f6 += this.webProfile.getAnimHeight() + (float)GuiStyle.PADDING.intValue();
      this.openFolder.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f5, f6, f);
   }

   public void renderSettings(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3, float f4, ZenithStyle zenithstyle
   ) {
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f1,
         f2,
         f3,
         f4,
         floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
         zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      float f5 = f1 + (float)(GuiStyle.PADDING * 2);
      float f6 = f2 + (float)(GuiStyle.PADDING * 2);
      Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
      Font font1 = Fonts.NEW_REGULAR.getFont(5.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, "Settings", f5, f6, zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      f6 += font1.height() + (float)(GuiStyle.PADDING * 2);
      this.guiScale.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f5, f6, f);
      f6 += this.guiScale.getAnimHeight() + (float)GuiStyle.PADDING.intValue();
      this.blurStrength.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f5, f6, f);
      f6 += this.blurStrength.getAnimHeight() + (float)GuiStyle.PADDING.intValue();
      this.renderDescription.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f5, f6, f);
      f6 += this.renderDescription.getAnimHeight() + (float)GuiStyle.PADDING.intValue();
      this.renderIcon.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f5, f6, f);
   }

   public void renderInfo(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3, float f4, ZenithStyle zenithstyle
   ) {
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f1,
         f2,
         f3,
         f4,
         floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
         zenithstyle.getLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      float f5 = f1 + (float)(GuiStyle.PADDING * 2);
      float f6 = f2 + (float)(GuiStyle.PADDING * 2);
      float f7 = f3 - (float)(GuiStyle.PADDING * 4);
      Font font = Fonts.NEW_REGULAR.getFont(5.0F);
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
      String s = ZenithClient.getInstance().StringHolder_31().translate("panel.client.playtime");
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f5, f6, zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f));
      f6 += font.height() + (float)GuiStyle.PADDING.intValue();
      StringHolder_18 l111ili1iiil11i1ii1l1l = ZenithClient.getInstance().ZenithInternal002();
      float f8 = font1.height() + (float)(GuiStyle.PADDING * 2);
      this.renderTimeRow(
         iiii1ilili1l1l1lilli1liliii,
         font1,
         font1,
         ZenithClient.getInstance().StringHolder_31().translate("panel.client.playtime.session"),
         StringHolder_18.byteHolder_2(l111ili1iiil11i1ii1l1l.ZenithInternal147()),
         f5,
         f6,
         f7,
         zenithstyle,
         f
      );
      f6 += f8;
      this.renderTimeRow(
         iiii1ilili1l1l1lilli1liliii,
         font1,
         font1,
         ZenithClient.getInstance().StringHolder_31().translate("panel.client.playtime.week"),
         StringHolder_18.byteHolder_2(l111ili1iiil11i1ii1l1l.StringHolder_21()),
         f5,
         f6,
         f7,
         zenithstyle,
         f
      );
      f6 += f8;
      this.renderTimeRow(
         iiii1ilili1l1l1lilli1liliii,
         font1,
         font1,
         ZenithClient.getInstance().StringHolder_31().translate("panel.client.playtime.total"),
         StringHolder_18.byteHolder_2(l111ili1iiil11i1ii1l1l.ScreenImpl()),
         f5,
         f6,
         f7,
         zenithstyle,
         f
      );
   }

   private void renderTimeRow(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      Font font,
      Font font1,
      String s,
      String s1,
      float f,
      float f1,
      float f2,
      ZenithStyle zenithstyle,
      float f3
   ) {
      float f4 = (float)GuiStyle.PADDING.intValue();
      float f5 = (float)GuiStyle.PADDING.intValue() / 2.0F;
      float f6 = font1.width(s1) + f4 * 2.0F;
      float f7 = font1.height() + f5 * 2.0F;
      float f8 = f + f2 - f6;
      float f9 = f1 - f5;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f8, f9, f6, f7, floatHolder_5.StringHolder_30(2.0F), GuiStyle.FIELD_SURFACE_BACKGROUND.ZenithInternal039(f3)
      );
      iiii1ilili1l1l1lilli1liliii.EventBus(f8, f9, f6, f7, 0.5F, floatHolder_5.StringHolder_30(2.0F), GuiStyle.FIELD_BORDER.ZenithInternal039(f3));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, s1, f8 + f4, f1, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f3)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f,
         f1 + font.height() / 2.0F - 0.6F,
         3.0F,
         3.0F,
         floatHolder_5.StringHolder_30(1.5F),
         zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f3)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f + 7.0F, f1, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f3));
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() != 0) {
         return false;
      } else if (this.expanded && this.exitBounds != null && this.exitBounds.StringHolder_8(d0, d1, 2.0F)) {
         this.expanded = false;
         return true;
      } else if (this.renderDescription.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else if (this.renderIcon.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else if (this.webProfile.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else if (this.guiScale.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else {
         return this.blurStrength.onMouseClicked(d0, d1, ill1iili11ii1l) ? true : this.openFolder.onMouseClicked(d0, d1, ill1iili11ii1l);
      }
   }

   @Override
   public boolean onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      this.guiScale.onMouseReleased(d0, d1, ill1iili11ii1l);
      this.blurStrength.onMouseReleased(d0, d1, ill1iili11ii1l);
      return super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   public void toggleExpanded() {
      this.expanded = !this.expanded;
   }

   public boolean isRender() {
      return this.animationVisible.CloudFriendInfo() > 0.0F || this.expanded;
   }

   public float getAnimationProgress() {
      return this.animationVisible.CloudFriendInfo();
   }

   public void safe(JsonObject jsonobject) {
      jsonobject.addProperty("expanded", this.expanded);
      this.guiScale.getSetting().safe(jsonobject);
      this.blurStrength.getSetting().safe(jsonobject);
      this.renderDescription.getSetting().safe(jsonobject);
      this.renderIcon.getSetting().safe(jsonobject);
   }

   public void load(JsonObject jsonobject) {
      if (jsonobject.has("expanded")) {
         this.expanded = jsonobject.get("expanded").getAsBoolean();
      }

      if (jsonobject.has(this.guiScale.getSetting().getName())) {
         this.guiScale.getSetting().load(jsonobject);
      }

      if (jsonobject.has(this.blurStrength.getSetting().getName())) {
         this.blurStrength.getSetting().load(jsonobject);
      }

      if (jsonobject.has(this.renderDescription.getSetting().getName())) {
         this.renderDescription.getSetting().load(jsonobject);
      }

      if (jsonobject.has(this.renderIcon.getSetting().getName())) {
         this.renderIcon.getSetting().load(jsonobject);
      }
   }

   public GetStartTimeHandler getAnimationVisible() {
      return this.animationVisible;
   }

   public boolean isExpanded() {
      return this.expanded;
   }

   public GuiNumberSetting getGuiScale() {
      return this.guiScale;
   }

   public GuiNumberSetting getBlurStrength() {
      return this.blurStrength;
   }

   public GuiBooleanSetting getRenderDescription() {
      return this.renderDescription;
   }

   public GuiBooleanSetting getRenderIcon() {
      return this.renderIcon;
   }

   public GuiButtonSetting getWebProfile() {
      return this.webProfile;
   }

   public GuiButtonSetting getOpenFolder() {
      return this.openFolder;
   }

   public HeightHandler getExitBounds() {
      return this.exitBounds;
   }

   public void setExpanded(boolean flag) {
      this.expanded = flag;
   }
}
