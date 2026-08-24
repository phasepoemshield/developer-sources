package org.zenith.hud;

import org.zenith.core.TextScanner;
import org.zenith.event.Event18;
import org.zenith.event.EventPosHook;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.StopUsingItemEvent;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.util.ScoreboardUtils;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.client.screens.nlgui.style.GuiStyle;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.CustomDrawContext;














import java.util.Objects;

class HudElementText2_Var159 {
   public final UiAnimation var1434 = new UiAnimation(150L, Easing.StopUsingItemEvent);
   public final Module module2;
   public float width;

   public HudElementText2_Var159(HudElementText2 var1, Module var2) {
      this.module2 = var2;
   }

   public float float205() {
      float f = 100.0F;
      float f1 = Fonts.NEW_MEDIUM.getWidth(this.module2.getName(), 5.4F);
      Font font = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      String s = ScoreboardUtils.EventPosHook(this.module2.getKeyCode());
      float f2 = font.width(s);
      float f3 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + f2);
      float f4 = 16.0F + f3;
      float f5 = f - (f4 + 8.0F);
      if (f5 < 8.0F + f1 + 8.0F) {
         float f6 = f1 + 8.0F + 8.0F - f5;
         f += f6;
      }

      return f;
   }

   public float getHeight() {
      return 7.0F;
   }

   public void on23(CustomDrawContext var1, float var2, float var3, float var4, int var5, float var6) {
      ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
      Font font = Fonts.NEW_ICONS.getFont(5.5F);
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.4F);
      this.var1434
         .on23(this.module2.isEnabled() && this.module2.getKeyCode() != -1 ? 1.0F : 0.0F);
      var1.pushMatrix();
      var1.getMatrices().translate(var2 + var4 / 2.0F, var3 + this.getHeight() / 2.0F, 0.0F);
      float f = this.var1434.Event18();
      var1.getMatrices().scale(f, f, 1.0F);
      var1.getMatrices().translate(-(var2 + var4 / 2.0F), -(var3 + this.getHeight() / 2.0F), 0.0F);
      Font font2 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      String s = ScoreboardUtils.EventPosHook(this.module2.getKeyCode());
      float f1 = font2.width(s);
      float f2 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + f1);
      var1.drawText(
         font,
         this.module2.getCategory().getIcon(),
         var2 + 8.0F,
         var3 + (this.getHeight() - font.height()) / 2.0F,
         zenithstyle.getPrimaryColor().getColor()
      );
      var1.drawText(
         font1,
         this.module2.getName(),
         var2 + 8.0F + font.width(this.module2.getCategory().getIcon()) + (float)GuiStyle.PADDING.intValue(),
         var3 + (this.getHeight() - font1.height()) / 2.0F,
         zenithstyle.getTextEnable().getColor()
      );
      float f3 = var2 + var4 - f2 - (float)(GuiStyle.PADDING * 2);
      var1.drawRoundedRect(
         f3,
         var3,
         f2,
         this.getHeight(),
         org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(1.0F),
         zenithstyle.getHeaderHudBackground().getColor()
      );
      var1.drawText(font2, s, f3 + (f2 - f1) / 2.0F, var3 + (this.getHeight() - font1.height()) / 2.0F, zenithstyle.getTextEnable().getColor());
      var1.popMatrix();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         HudElementText2_Var159 iiiliilli1i1li111i11lil1liil_ii1il11l111ii11iil = (HudElementText2_Var159)var1;
         return Objects.equals(this.module2.getId(), iiiliilli1i1li111i11lil1liil_ii1il11l111ii11iil.module2.getId());
      } else {
         return false;
      }
   }

   public boolean float206() {
      return this.var1434.Event18() == 0.0F;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.module2.getId());
   }

   public int Easing(HudElementText2_Var159 var1) {
      return this.module2.getName().compareTo(var1.module2.getName());
   }
}
