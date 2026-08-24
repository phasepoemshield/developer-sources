package org.zenith.hud;

import org.zenith.core.TextScanner;
import org.zenith.event.MovementInputEvent;
import org.zenith.module.Module;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.util.ArgbColor;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import org.zenith.module.Interface;

import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.CustomDrawContext;














import java.util.ArrayList;
import java.util.List;

public class HudElementText extends HudElement {
   public List<HudElementText_Var159> list84 = new ArrayList<>();

   public HudElementText(String var1, float var2, float var3, float var4, float var5, float var6, float var7, HudElement_Var159 var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
      float f = 22.0F;
      this.width = f * 4.0F;
      this.height = f;

      for (int i = 0; i < 4; i++) {
         this.list84.add(new HudElementText_Var159(this, i));
      }
   }

   @Override
   public void on23(CustomDrawContext var1) {
      ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
      float f = 22.0F;
      this.width = f * 4.0F;
      this.height = f;
      float f1 = Interface.float212();
      var1.pushMatrix();
      var1.drawBlurHud(
         this.x,
         this.y,
         this.width,
         this.height,
         21.0F,
         org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(f1),
         ArgbColor.var11934
      );
      var1.drawRoundedRect(
         this.x,
         this.y,
         this.width,
         this.height,
         org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(f1),
         zenithstyle.getHudBackground().getColor()
      );
      float f2 = this.x;
      float f3 = this.y;

      for (HudElementText_Var159 iiiililli1111i1lil_ii1il11l111ii11iil : this.list84) {
         iiiililli1111i1lil_ii1il11l111ii11iil.on23(var1, f2, f3, zenithstyle);
         f2 += f;
      }

      var1.popMatrix();
   }
}
