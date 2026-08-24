package org.zenith.client.screens.nlgui.panel;

import org.zenith.base.comand.CommandManager;
import org.zenith.core.ItemRegistry;
import org.zenith.core.NbtEditor;
import org.zenith.core.TextScanner;
import org.zenith.core.BotFeaturesDto;
import org.zenith.event.Event18;
import org.zenith.event.Event26;
import org.zenith.event.Event29;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.SprintStateEvent;
import org.zenith.event.StopUsingItemEvent;
import org.zenith.managers.EmoteManager;
import org.zenith.module.Trails;
import org.zenith.module.ViewArmorDurability;
import org.zenith.module.ViewModel;
import org.zenith.setting.Setting;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.NumberSetting;
import org.zenith.setting.StringSetting;

import org.zenith.util.ArgbColor;
import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.setting.BooleanSetting;
import org.zenith.client.screens.nlgui.elements.setting.GuiBooleanSetting;
import org.zenith.client.screens.nlgui.elements.setting.GuiButtonSetting;
import org.zenith.client.screens.nlgui.elements.setting.GuiNumberSetting;
import org.zenith.client.screens.nlgui.panel.api.Panel;
import org.zenith.client.screens.nlgui.style.GuiStyle;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.HudDrawContext;
import org.zenith.setting.NumberSetting;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.render.ShapeRenderer;
import org.zenith.setting.StringSetting;
import org.zenith.utility.render.display.base.CornerRadiusF;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.BlockPosEntry;
import org.zenith.core.HudPreviewItem;
import org.zenith.core.ClientSession;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.MenuScreenId;
import org.zenith.core.CloudResponse;
import org.zenith.core.UsageStatStore;

















import com.google.gson.JsonObject;
import java.io.IOException;

public class ClientPanel extends Panel {
   public final UiAnimation animationVisible = new UiAnimation(300L, 0.0F, Easing.StopUsingItemEvent);
   public boolean expanded = false;
   public final GuiNumberSetting guiScale = new GuiNumberSetting(
      new NumberSetting("panel.client.setting.guiScale", 100.0F, 100.0F, 250.0F, 5.0F, "", "%", () -> true, (var0, var1) -> {
      }), 112.0F
   );
   public final GuiNumberSetting blurStrength = new GuiNumberSetting(
      new NumberSetting("panel.client.setting.backgroundBlur", 20.0F, 0.0F, 30.0F, 5.0F, "", "px"), 112.0F
   );
   public final GuiBooleanSetting renderDescription = new GuiBooleanSetting(new BooleanSetting("panel.client.setting.description", true), 112.0F);
   public final GuiBooleanSetting renderIcon = new GuiBooleanSetting(new BooleanSetting("panel.client.setting.settingIcon", true), 112.0F);
   public final GuiButtonSetting webProfile = new GuiButtonSetting(new StringSetting("panel.client.setting.telegram", "W", () -> {
      try {
         Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler https://t.me/zenithdlcdevlog");
      } catch (IOException ioexception) {
         ioexception.printStackTrace();
      }
   }), 112.0F);
   public final GuiButtonSetting openFolder = new GuiButtonSetting(new StringSetting("panel.client.setting.chat", "T", () -> {
      try {
         Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler https://t.me/+J-lV24z-Wmg1M2Y6");
      } catch (IOException ioexception) {
         ioexception.printStackTrace();
      }
   }), 112.0F);
   public CornerRadiusF exitBounds;

   public ClientPanel() {
   }

   @Override
   public void render(HudDrawContext var1, int var2, int var3, float var4, float var5, float var6) {
      this.animationVisible.on23(this.expanded);
      this.animationVisible.on23(200L);
      var4 *= this.animationVisible.Event18();
      float f = 128.0F;
      float f1 = 227.0F;
      var1.enableScissor(var5 - (float)(GuiStyle.PADDING * 3), var6, var5 + f + (float)(GuiStyle.PADDING * 4), var6 + f1);
      var5 -= (f + (float)GuiStyle.PADDING.intValue()) * (1.0F - this.animationVisible.Event18());
      if (ZenithClient.on23().NbtEditor().getBlurPower() != 0.0F) {
         ShapeRenderer.on23(
            var1.getMatrices(),
            var5,
            var6,
            f,
            f1,
            ZenithClient.on23().NbtEditor().getBlurPower(),
            org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent((float)GuiStyle.ROUND.intValue()),
            ArgbColor.var11934.SprintStateEvent(var4),
            true,
            false
         );
      }

      float f2 = 29.0F;
      float f3 = 45.0F;
      float f4 = 67.0F;
      float f5 = 56.0F;
      float f6 = 30.0F;
      ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
      this.renderHeader(var1, var2, var3, var4, var5, var6, f, f2, zenithstyle);
      this.renderTill(var1, var2, var3, var4, var5, var6 + f2, f, f3, zenithstyle);
      this.renderSettings(var1, var2, var3, var4, var5, var6 + f2 + f3, f, f4, zenithstyle);
      this.renderInfo(var1, var2, var3, var4, var5, var6 + f2 + f3 + f4, f, f5, zenithstyle);
      this.renderButton(var1, var2, var3, var4, var5, var6 + f2 + f3 + f4 + f5, f, f6, zenithstyle);
      var1.disableScissor();
   }

   public void renderButton(HudDrawContext var1, int var2, int var3, float var4, float var5, float var6, float var7, float var8, ZenithStyle var9) {
      var1.drawRoundedRect(
         var5,
         var6,
         var7,
         var8,
         org.zenith.utility.render.display.base.CornerRadius.Event26((float)GuiStyle.ROUND.intValue()),
         var9.getRightBackground().getColor().SprintStateEvent(var4)
      );
      float f = var5 + (float)(GuiStyle.PADDING * 2);
      float f1 = var6 + (float)(GuiStyle.PADDING * 2);
      float f2 = 112.0F;
      float f3 = 14.0F;
      Font font = Fonts.NEW_REGULAR.getFont(5.0F);
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.0F);
      Font font2 = Fonts.NEW_ICONS.getFont(5.0F);
      float f4 = f2 / 3.0F;
      var1.drawRoundedRect(
         f + f4,
         f1 + 1.0F,
         0.5F,
         f3 - 2.0F,
         org.zenith.utility.render.display.base.CornerRadius.var159,
         var9.getTextTertiary().getColor().SprintStateEvent(var4)
      );
      var1.drawRoundedRect(
         f + f4 * 2.0F,
         f1 + 1.0F,
         0.5F,
         f3 - 2.0F,
         org.zenith.utility.render.display.base.CornerRadius.var159,
         var9.getTextTertiary().getColor().SprintStateEvent(var4)
      );
      this.renderBox(var1, font, font1, font2, "Version", "P", "3.0", f, f1, f4, f3, var9, var4);
      this.renderBox(var1, font, font1, font2, "Commit", "Q", "129", f + f4, f1, f4, f3, var9, var4);
      this.renderBox(
         var1,
         font,
         font1,
         font2,
         "Build",
         "R",
         ZenithClient.on23().CommandManager().EmoteManager().getName(),
         f + f4 + f4,
         f1,
         f4,
         f3,
         var9,
         var4
      );
   }

   public void renderBox(
      HudDrawContext var1,
      Font var2,
      Font var3,
      Font var4,
      String var5,
      String var6,
      String var7,
      float var8,
      float var9,
      float var10,
      float var11,
      ZenithStyle var12,
      float var13
   ) {
      var1.drawText(var2, var5, var8 + (var10 - var2.width(var5)) / 2.0F, var9, var12.getTextSecondary().getColor(var13));
      float f = var4.width(var6);
      float f1 = f + (float)GuiStyle.PADDING.intValue() / 2.0F + var3.width(var7);
      var1.drawText(
         var4,
         var6,
         var8 + (var10 - f1) / 2.0F,
         var9 + var11 - var4.height() - (float)GuiStyle.PADDING.intValue() / 2.0F,
         var12.getPrimaryColor().getColor(var13)
      );
      var1.drawText(
         var3,
         var7,
         var8 + (var10 - f1) / 2.0F + f + (float)GuiStyle.PADDING.intValue() / 2.0F,
         var9 + var11 - var3.height() - (float)GuiStyle.PADDING.intValue() / 2.0F,
         var12.getTextEnable().getColor(var13)
      );
   }

   public void renderHeader(HudDrawContext var1, int var2, int var3, float var4, float var5, float var6, float var7, float var8, ZenithStyle var9) {
      var1.drawRoundedRect(
         var5,
         var6,
         var7,
         var8,
         org.zenith.utility.render.display.base.CornerRadius.Event29((float)GuiStyle.ROUND.intValue()),
         var9.getRightBackground().getColor().SprintStateEvent(var4)
      );
      float f = var5 + (float)(GuiStyle.PADDING * 2);
      float f1 = var6 + (float)(GuiStyle.PADDING * 2);
      Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
      Font font1 = Fonts.NEW_REGULAR.getFont(5.0F);
      ClientSession ii1il11l111ii11iil_ii1il11l111ii11iil = ZenithClient.on23().CommandManager();
      var1.drawText(font, "Client", f, f1 + 1.0F, var9.getTextEnable().getColor().SprintStateEvent(var4));
      var1.drawText(font1, "Global system settings", f, f1 + font.height() + 3.0F, var9.getTextTertiary().getColor().SprintStateEvent(var4));
      Font font2 = Fonts.NEW_ICONS.getFont(4.0F);
      float f2 = var5 + var7 - font2.width("2") - (float)(GuiStyle.PADDING * 2);
      float f3 = f1 + 2.0F;
      this.exitBounds = new CornerRadiusF(f2, f3, 5.0F, 5.0F);
      var1.drawText(font2, "2", f2, f3, var9.getTextTertiary().getColor().SprintStateEvent(var4));
   }

   public void renderTill(HudDrawContext var1, int var2, int var3, float var4, float var5, float var6, float var7, float var8, ZenithStyle var9) {
      var1.drawRoundedRect(
         var5,
         var6,
         var7,
         var8,
         org.zenith.utility.render.display.base.CornerRadius.var159,
         var9.getLeftBackground().getColor().SprintStateEvent(var4)
      );
      float f = var5 + (float)(GuiStyle.PADDING * 2);
      float f1 = var6 + (float)(GuiStyle.PADDING * 2);
      Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
      Font font1 = Fonts.NEW_REGULAR.getFont(5.0F);
      var1.drawText(font1, "Navigation", f, f1, var9.getTextSecondary().getColor().SprintStateEvent(var4));
      f1 += font1.height() + (float)GuiStyle.PADDING.intValue();
      this.webProfile.render(var1, (float)var2, (float)var3, f, f1, var4);
      f1 += this.webProfile.getAnimHeight() + (float)GuiStyle.PADDING.intValue();
      this.openFolder.render(var1, (float)var2, (float)var3, f, f1, var4);
   }

   public void renderSettings(HudDrawContext var1, int var2, int var3, float var4, float var5, float var6, float var7, float var8, ZenithStyle var9) {
      var1.drawRoundedRect(
         var5,
         var6,
         var7,
         var8,
         org.zenith.utility.render.display.base.CornerRadius.var159,
         var9.getRightBackground().getColor().SprintStateEvent(var4)
      );
      float f = var5 + (float)(GuiStyle.PADDING * 2);
      float f1 = var6 + (float)(GuiStyle.PADDING * 2);
      Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
      Font font1 = Fonts.NEW_REGULAR.getFont(5.0F);
      var1.drawText(font1, "Settings", f, f1, var9.getTextSecondary().getColor().SprintStateEvent(var4));
      f1 += font1.height() + (float)(GuiStyle.PADDING * 2);
      this.guiScale.render(var1, (float)var2, (float)var3, f, f1, var4);
      f1 += this.guiScale.getAnimHeight() + (float)GuiStyle.PADDING.intValue();
      this.blurStrength.render(var1, (float)var2, (float)var3, f, f1, var4);
      f1 += this.blurStrength.getAnimHeight() + (float)GuiStyle.PADDING.intValue();
      this.renderDescription.render(var1, (float)var2, (float)var3, f, f1, var4);
      f1 += this.renderDescription.getAnimHeight() + (float)GuiStyle.PADDING.intValue();
      this.renderIcon.render(var1, (float)var2, (float)var3, f, f1, var4);
   }

   public void renderInfo(HudDrawContext var1, int var2, int var3, float var4, float var5, float var6, float var7, float var8, ZenithStyle var9) {
      var1.drawRoundedRect(
         var5,
         var6,
         var7,
         var8,
         org.zenith.utility.render.display.base.CornerRadius.var159,
         var9.getLeftBackground().getColor().SprintStateEvent(var4)
      );
      float f = var5 + (float)(GuiStyle.PADDING * 2);
      float f1 = var6 + (float)(GuiStyle.PADDING * 2);
      float f2 = var7 - (float)(GuiStyle.PADDING * 4);
      Font font = Fonts.NEW_REGULAR.getFont(5.0F);
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
      String s = ZenithClient.on23().Easing().translate("panel.client.playtime");
      var1.drawText(font, s, f, f1, var9.getTextSecondary().getColor().SprintStateEvent(var4));
      f1 += font.height() + (float)GuiStyle.PADDING.intValue();
      UsageStatStore lii11l11i1lil11ii11ii1il1lll = ZenithClient.on23().BotFeaturesDto();
      float f3 = font1.height() + (float)(GuiStyle.PADDING * 2);
      this.renderTimeRow(
         var1,
         font1,
         font1,
         ZenithClient.on23().Easing().translate("panel.client.playtime.session"),
         UsageStatStore.ItemRegistry(lii11l11i1lil11ii11ii1il1lll.Trails()),
         f,
         f1,
         f2,
         var9,
         var4
      );
      f1 += f3;
      this.renderTimeRow(
         var1,
         font1,
         font1,
         ZenithClient.on23().Easing().translate("panel.client.playtime.week"),
         UsageStatStore.ItemRegistry(lii11l11i1lil11ii11ii1il1lll.ViewArmorDurability()),
         f,
         f1,
         f2,
         var9,
         var4
      );
      f1 += f3;
      this.renderTimeRow(
         var1,
         font1,
         font1,
         ZenithClient.on23().Easing().translate("panel.client.playtime.total"),
         UsageStatStore.ItemRegistry(lii11l11i1lil11ii11ii1il1lll.ViewModel()),
         f,
         f1,
         f2,
         var9,
         var4
      );
   }

   public void renderTimeRow(
      HudDrawContext var1, Font var2, Font var3, String var4, String var5, float var6, float var7, float var8, ZenithStyle var9, float var10
   ) {
      float f = (float)GuiStyle.PADDING.intValue();
      float f1 = (float)GuiStyle.PADDING.intValue() / 2.0F;
      float f2 = var3.width(var5) + f * 2.0F;
      float f3 = var3.height() + f1 * 2.0F;
      float f4 = var6 + var8 - f2;
      float f5 = var7 - f1;
      var1.drawRoundedRect(
         f4,
         f5,
         f2,
         f3,
         org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(2.0F),
         GuiStyle.FIELD_SURFACE_BACKGROUND.SprintStateEvent(var10)
      );
      var1.drawRoundedBorder(
         f4,
         f5,
         f2,
         f3,
         0.5F,
         org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(2.0F),
         GuiStyle.FIELD_BORDER.SprintStateEvent(var10)
      );
      var1.drawText(var3, var5, f4 + f, var7, var9.getPrimaryColor().getColor().SprintStateEvent(var10));
      var1.drawRoundedRect(
         var6,
         var7 + var2.height() / 2.0F - 0.6F,
         3.0F,
         3.0F,
         org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(1.5F),
         var9.getPrimaryColor().getColor().SprintStateEvent(var10)
      );
      var1.drawText(var2, var4, var6 + 7.0F, var7, var9.getTextEnable().getColor().SprintStateEvent(var10));
   }

   @Override
   public boolean onMouseClicked(double var1, double var3, MenuScreenId var5) {
      if (var5.int203() != 0) {
         return false;
      } else if (this.expanded && this.exitBounds != null && this.exitBounds.on23(var1, var3, 2.0F)) {
         this.expanded = false;
         return true;
      } else if (this.renderDescription.onMouseClicked(var1, var3, var5)) {
         return true;
      } else if (this.renderIcon.onMouseClicked(var1, var3, var5)) {
         return true;
      } else if (this.webProfile.onMouseClicked(var1, var3, var5)) {
         return true;
      } else if (this.guiScale.onMouseClicked(var1, var3, var5)) {
         return true;
      } else {
         return this.blurStrength.onMouseClicked(var1, var3, var5) ? true : this.openFolder.onMouseClicked(var1, var3, var5);
      }
   }

   @Override
   public boolean onMouseReleased(double var1, double var3, MenuScreenId var5) {
      this.guiScale.onMouseReleased(var1, var3, var5);
      this.blurStrength.onMouseReleased(var1, var3, var5);
      return super.onMouseReleased(var1, var3, var5);
   }

   public void toggleExpanded() {
      this.expanded = !this.expanded;
   }

   public boolean isRender() {
      return this.animationVisible.Event18() > 0.0F || this.expanded;
   }

   public float getAnimationProgress() {
      return this.animationVisible.Event18();
   }

   public void safe(JsonObject var1) {
      var1.addProperty("expanded", this.expanded);
      this.guiScale.getSetting().safe(var1);
      this.blurStrength.getSetting().safe(var1);
      this.renderDescription.getSetting().safe(var1);
      this.renderIcon.getSetting().safe(var1);
   }

   public void load(JsonObject var1) {
      if (var1.has("expanded")) {
         this.expanded = var1.get("expanded").getAsBoolean();
      }

      if (var1.has(this.guiScale.getSetting().getKey())) {
         this.guiScale.getSetting().load(var1);
      }

      if (var1.has(this.blurStrength.getSetting().getKey())) {
         this.blurStrength.getSetting().load(var1);
      }

      if (var1.has(this.renderDescription.getSetting().getKey())) {
         this.renderDescription.getSetting().load(var1);
      }

      if (var1.has(this.renderIcon.getSetting().getKey())) {
         this.renderIcon.getSetting().load(var1);
      }
   }

   public UiAnimation getAnimationVisible() {
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

   public CornerRadiusF getExitBounds() {
      return this.exitBounds;
   }

   public void setExpanded(boolean var1) {
      this.expanded = var1;
   }
}
