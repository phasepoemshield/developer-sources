package org.zenith.module;

import org.zenith.setting.Setting;
import org.zenith.utility.render.display.base.HudDrawContext;

import org.zenith.module.ModuleInfo;

import org.zenith.util.ArgbColor;
import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import org.zenith.event.EventRenderScreenHook;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.NumberSetting;

import org.zenith.utility.render.display.base.CustomDrawContext;

















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.client.option.Perspective;
import net.minecraft.util.hit.HitResult.Type;

@ModuleInfo(
   name = "Crosshair",
   category = Category.RENDER,
   description = "\u041a\u0430\u0441\u0442\u043e\u043c\u043d\u044b\u0439 \u043f\u0440\u0438\u0446\u0435\u043b"
)
public final class Crosshair extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final Crosshair crosshair = new Crosshair();
   public final NumberSetting thickness = new NumberSetting(
      "module.crosshair.thickness", 1.0F, 0.5F, 3.0F, 0.1F, "module.crosshair.thickness.desc", "px"
   );
   public final NumberSetting length = new NumberSetting(
      "module.crosshair.length", 3.0F, 1.0F, 8.0F, 0.5F, "module.crosshair.length.desc", "px"
   );
   public final NumberSetting gap = new NumberSetting(
      "module.crosshair.gap", 2.0F, 0.0F, 5.0F, 0.5F, "module.crosshair.gap.desc", "px"
   );
   public final BooleanSetting dynamicGap = new BooleanSetting("module.crosshair.dynamicGap", "module.crosshair.dynamicGap.desc", false);
   public final BooleanSetting useEntityColor = new BooleanSetting("module.crosshair.useEntityColor", "module.crosshair.useEntityColor.desc", false);
   public final ArgbColor var119 = new ArgbColor(255, 0, 0, 255);

   public Crosshair() {
   }

   @EventTarget(0)
   public void on23(EventRenderScreenHook var1) {
      try {
         if (minecraftClient3.player == null || minecraftClient3.world == null) {
            return;
         }

         if (minecraftClient3.options.getPerspective() != Perspective.FIRST_PERSON) {
            return;
         }

         org.zenith.utility.render.display.base.HudDrawContext ililll1lli1i11l11l111i1l1 = var1.WarpFarm();
         float f = (float)minecraftClient3.getWindow().getScaledWidth() / 2.0F;
         float f1 = (float)minecraftClient3.getWindow().getScaledHeight() / 2.0F;
         float f2 = this.gap.getCurrent();
         if (this.dynamicGap.isEnabled()) {
            float f3 = 1.0F - minecraftClient3.player.getAttackCooldownProgress(0.0F);
            f2 += 8.0F * f3;
         }

         float f5 = this.thickness.getCurrent();
         float f4 = this.length.getCurrent();
         ArgbColor i11ii1llliilllii1i1 = this.useEntityColor.isEnabled()
               && minecraftClient3.crosshairTarget != null
               && minecraftClient3.crosshairTarget.getType() == Type.ENTITY
            ? this.var119
            : new ArgbColor(255, 255, 255, 255);
         this.on23(ililll1lli1i11l11l111i1l1, f - f5 / 2.0F, f1 - f2 - f4, f5, f4, i11ii1llliilllii1i1);
         this.on23(ililll1lli1i11l11l111i1l1, f - f5 / 2.0F, f1 + f2, f5, f4, i11ii1llliilllii1i1);
         this.on23(ililll1lli1i11l11l111i1l1, f - f2 - f4, f1 - f5 / 2.0F, f4, f5, i11ii1llliilllii1i1);
         this.on23(ililll1lli1i11l11l111i1l1, f + f2, f1 - f5 / 2.0F, f4, f5, i11ii1llliilllii1i1);
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   public void on23(CustomDrawContext var1, float var2, float var3, float var4, float var5, ArgbColor var6) {
      var1.drawRect(var2, var3, var4, var5, var6);
   }
}
