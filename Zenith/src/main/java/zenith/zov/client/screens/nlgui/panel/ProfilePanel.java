package zenith.zov.client.screens.nlgui.panel;

import zenith.hud.*;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import zenith.BooleanSetting;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.ZenithClient$II1Il11l111II11IIl;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ButtonSetting;
import zenith.ZenithInternal068;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.FileHolder_2;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.setting.GuiBooleanSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiButtonSetting;
import zenith.zov.client.screens.nlgui.panel.api.Panel;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class ProfilePanel extends Panel {
   private final GetStartTimeHandler animationVisible = new GetStartTimeHandler(300L, 0.0F, IReturn.ListHolder_8);
   private boolean expanded = false;
   private final GuiBooleanSetting steamMode = new GuiBooleanSetting(new BooleanSetting("panel.profile.setting.streamerMode", false), 112.0F);
   private final GuiBooleanSetting discordRPC = new GuiBooleanSetting(new BooleanSetting("panel.profile.setting.discordRpc", true), 112.0F);
   private final GuiButtonSetting webProfile = new GuiButtonSetting(new ButtonSetting("panel.profile.setting.webProfile", "J", () -> {
      try {
         Runtime.getRuntime().exec("explorer " + FileHolder_2.l1I11IIIl11lIIllI1II1lI1I1.getAbsolutePath());
      } catch (IOException ioexception) {
      }
   }), 112.0F);
   private final GuiButtonSetting openFolder = new GuiButtonSetting(new ButtonSetting("panel.profile.setting.openFolder", "K", () -> {
      try {
         Runtime.getRuntime().exec("explorer " + FileHolder_2.l1I11IIIl11lIIllI1II1lI1I1.getAbsolutePath());
      } catch (IOException ioexception) {
      }
   }), 112.0F);
   private HeightHandler languageLeftBounds;
   private HeightHandler languageRightBounds;
   private HeightHandler exitBounds;

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2) {
      this.animationVisible.ZenithInternal101(this.expanded);
      this.animationVisible.EventImpl_21(200L);
      f *= this.animationVisible.CloudFriendInfo();
      float f3 = 128.0F;
      float f4 = 190.0F;
      iiii1ilili1l1l1lilli1liliii.ListHolder_6(f1, f2, f1 + f3 + (float)(GuiStyle.PADDING * 4), f2 + f4);
      f1 += (f3 + (float)GuiStyle.PADDING.intValue()) * (1.0F - this.animationVisible.CloudFriendInfo());
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
      float f6 = 27.0F;
      float f7 = 56.0F;
      float f8 = 45.0F;
      float f9 = 33.0F;
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
      float f7 = f3 - (float)(GuiStyle.PADDING * 4);
      float f8 = f4 - (float)(GuiStyle.PADDING * 4);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f5,
         f6,
         f7,
         f8,
         floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
         new ByteBufferHolder("#FF97A0").ZenithInternal039(f)
      );
      Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
      Font font1 = Fonts.NEW_ICONS.getFont(5.0F);
      float f9 = font1.width("I");
      float f10 = font.width("Русская рулетка");
      float f11 = f9 + (float)GuiStyle.PADDING.intValue() + f10;
      float f12 = f5 + (f7 - f11) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, "I", f12, f6 + (f8 - font1.height()) / 2.0F, zenithstyle.getTextEnable().HostnameVerifierImpl(f));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font,
         "Русская рулетка",
         f12 + f9 + (float)GuiStyle.PADDING.intValue(),
         f6 + (f8 - font.height()) / 2.0F,
         zenithstyle.getTextEnable().HostnameVerifierImpl(f)
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
      float f7 = 13.0F;
      floatHolder_8.StringHolder_8(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         ZenithClient.StringHolder_10("icons/avatar.png"),
         f5,
         f6,
         f7,
         f7,
         floatHolder_5.StringHolder_30(4.0F),
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f)
      );
      Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
      Font font1 = Fonts.NEW_REGULAR.getFont(5.0F);
      float f8 = f5 + f7 + (float)GuiStyle.PADDING.intValue();
      ZenithClient$II1Il11l111II11IIl iiil1llll1liili1lilii1l1li1iii$ii1il11l111ii11iil = ZenithClient.getInstance()
         .ListHolder_7();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font,
         iiil1llll1liili1lilii1l1li1iii$ii1il11l111ii11iil.getUsername(),
         f8,
         f6 + 1.0F,
         zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1,
         "uid: " + iiil1llll1liili1lilii1l1li1iii$ii1il11l111ii11iil.SoundEventHolder(),
         f8,
         f6 + f7 - font1.height() - 1.0F,
         zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      Font font2 = Fonts.NEW_ICONS.getFont(4.0F);
      this.exitBounds = new HeightHandler(f1 + f3 - font2.width("2") - (float)(GuiStyle.PADDING * 2), f6 + 2.0F, 5.0F, 5.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font2,
         "2",
         f1 + f3 - font2.width("2") - (float)(GuiStyle.PADDING * 2),
         f6 + 2.0F,
         zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
   }

   public void renderTill(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, int j, int k, float f, float f1, float f2, float f3, float f4, ZenithStyle zenithstyle
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
      Font font = Fonts.NEW_MEDIUM.getFont(4.8F);
      ZenithClient$II1Il11l111II11IIl iiil1llll1liili1lilii1l1li1iii$ii1il11l111ii11iil = ZenithClient.getInstance()
         .ListHolder_7();
      float f7 = 1.4F;
      String s = "01.01.2048";
      DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
      LocalDate localdate = LocalDate.parse(s, datetimeformatter);
      LocalDate localdate1 = LocalDate.now();
      float f8;
      long i;
      if (localdate1.isAfter(localdate)) {
         f8 = 0.0F;
         i = 0L;
      } else {
         i = ChronoUnit.DAYS.between(localdate1, localdate);
         f8 = Math.min(1.0F, Math.max(0.0F, (float)i / 365.0F));
      }

      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font, "Active: " + i + " day", f5, f6, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      Font font1 = Fonts.NEW_ICONS.getFont(5.0F);
      float f9 = font1.width("G");
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font,
         "Extend",
         f1 + f3 - (float)(GuiStyle.PADDING * 2) - f9 - font.width("Extend") - (float)GuiStyle.PADDING.intValue(),
         f6,
         zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, "G", f1 + f3 - (float)(GuiStyle.PADDING * 2) - f9, f6, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      float f10 = f2 + f4 - (float)(GuiStyle.PADDING * 2) - f7;
      float f11 = f3 - (float)(GuiStyle.PADDING * 4);
      float f12 = f11 * f8;
      iiii1ilili1l1l1lilli1liliii.EventBus(
         f5,
         f10,
         f11,
         f7,
         floatHolder_5.StringHolder_30(0.01F),
         zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      iiii1ilili1l1l1lilli1liliii.EventBus(
         f5, f10, f12, f7, floatHolder_5.StringHolder_30(0.01F), zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
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
      f6 += font1.height() + (float)GuiStyle.PADDING.intValue();
      this.steamMode.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f5, f6, f);
      f6 += this.steamMode.getAnimHeight() + (float)GuiStyle.PADDING.intValue();
      this.discordRPC.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f5, f6, f);
      float f7 = this.steamMode.getHeight();
      float f8 = f6 + this.discordRPC.getAnimHeight() + (float)GuiStyle.PADDING.intValue();
      String s = ZenithClient.getInstance().StringHolder_31().floatHolder().toUpperCase();
      String s1 = "<";
      String s2 = ">";
      float f9 = (float)GuiStyle.PADDING.intValue() / 1.5F;
      float f10 = font.width(s2);
      float f11 = f1 + f3 - (float)GuiStyle.PADDING.intValue() * 2.0F;
      float f12 = f11 - f10;
      float f13 = f12 - f9 - font1.width(s);
      float f14 = f13 - f9 - f10;
      float f15 = f8 + (f7 - font.height()) / 2.0F;
      float f16 = f8 + (f7 - font1.height()) / 2.0F;
      float f17 = 2.0F;
      this.languageLeftBounds = new HeightHandler(f14 - f17, f8 - f17, f10 + f17 * 2.0F, f7 + f17 * 2.0F);
      this.languageRightBounds = new HeightHandler(f12 - f17, f8 - f17, f10 + f17 * 2.0F, f7 + f17 * 2.0F);
      boolean flag = this.languageLeftBounds.byteHolder((double)i, (double)j);
      boolean flag1 = this.languageRightBounds.byteHolder((double)i, (double)j);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font, "Language", f5, f15, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font,
         s1,
         f14,
         f15,
         zenithstyle.getTextSecondary()
            .l1IllIl1l1llIlI11I11Il1l1l1lI1()
            .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), flag ? 1.0F : 0.0F)
            .ZenithInternal039(f)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, s, f13, f16, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font,
         s2,
         f12,
         f15,
         zenithstyle.getTextSecondary()
            .l1IllIl1l1llIlI11I11Il1l1l1lI1()
            .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), flag1 ? 1.0F : 0.0F)
            .ZenithInternal039(f)
      );
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
      Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
      Font font1 = Fonts.NEW_REGULAR.getFont(5.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, "Info", f5, f6, zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      f6 += font1.height() + (float)GuiStyle.PADDING.intValue();
      this.webProfile.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f5, f6, f);
      f6 += this.webProfile.getAnimHeight() + (float)GuiStyle.PADDING.intValue();
      this.openFolder.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f5, f6, f);
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() != 0 || !this.expanded) {
         return false;
      } else if (this.steamMode.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else if (this.discordRPC.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else if (this.webProfile.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else if (this.openFolder.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else {
         if (this.exitBounds != null && this.exitBounds.StringHolder_8(d0, d1, 2.0F)) {
            this.expanded = false;
         }

         if (this.languageLeftBounds != null && this.languageLeftBounds.byteHolder(d0, d1)) {
            ZenithClient.getInstance().StringHolder_31().longHolder_6(false);
            return true;
         } else if (this.languageRightBounds != null && this.languageRightBounds.byteHolder(d0, d1)) {
            ZenithClient.getInstance().StringHolder_31().longHolder_6(true);
            return true;
         } else {
            return false;
         }
      }
   }

   public void setExpanded(boolean flag) {
      this.expanded = flag;
   }

   public void toggleExpanded() {
      this.expanded = !this.expanded;
   }

   public boolean isRender() {
      return this.animationVisible.CloudFriendInfo() > 0.0F || this.expanded;
   }

   public void safe(JsonObject jsonobject) {
      jsonobject.addProperty("expanded", this.expanded);
      jsonobject.addProperty("language", ZenithClient.getInstance().StringHolder_31().floatHolder_6());
      this.steamMode.getSetting().safe(jsonobject);
      this.discordRPC.getSetting().safe(jsonobject);
   }

   public void load(JsonObject jsonobject) {
      if (jsonobject.has("expanded")) {
         this.expanded = jsonobject.get("expanded").getAsBoolean();
      }

      if (jsonobject.has("language")) {
         ZenithClient.getInstance().StringHolder_31().EventImpl_36(jsonobject.get("language").getAsString());
      }

      if (jsonobject.has(this.steamMode.getSetting().getName())) {
         this.steamMode.getSetting().load(jsonobject);
      }

      if (jsonobject.has(this.discordRPC.getSetting().getName())) {
         this.discordRPC.getSetting().load(jsonobject);
      }
   }
}
