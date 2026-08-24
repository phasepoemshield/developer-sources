package org.zenith.module;

import org.zenith.base.font.Font;
import org.zenith.core.NbtEditor;
import org.zenith.core.UiAnimation;
import org.zenith.core.CloudResponse;
import org.zenith.core.FileLogger;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.util.MathUtils;
import org.zenith.module.Module;
import org.zenith.util.MovementUtils;
import org.zenith.ZenithClient;
import org.zenith.core.ColorAnimator;
import org.zenith.core.TextScanner;
import org.zenith.core.Easing;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.render.WorldRender;

import org.zenith.event.EventHookWorldRender;
import org.zenith.event.EventPosHook;
import org.zenith.event.EventRender2;
import org.zenith.event.MovementInputEvent;

import org.zenith.setting.ModeSetting3;
import org.zenith.setting.NumberSetting;

import org.zenith.base.font.Fonts;
import org.zenith.utility.render.display.base.GuiSprite;


















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.client.option.Perspective;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(
   name = "FreeCam",
   description = "\u0421\u0432\u043e\u0431\u043e\u0434\u043d\u044b\u0439 \u043e\u0431\u0437\u043e\u0440 \u043a\u0430\u043c\u0435\u0440\u044b \u043b\u0435\u0442\u0430\u0442\u044c \u043c\u043e\u0436\u043d\u043e",
   category = Category.MISC
)
public final class FreeCam extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final FreeCam freeCam = new FreeCam();
   public final NumberSetting speedSetting = new NumberSetting(
      "module.freeCam.speedSetting", 2.0F, 0.5F, 5.0F, 0.5F, "module.freeCam.speedSetting.desc", "x"
   );
   public Vec3d TriggerBot;
   public Vec3d ModeSetting3;

   public Vec3d var1357() {
      return this.isEnabled() ? this.TriggerBot : minecraftClient3.getCameraEntity().getEyePos();
   }

   public FreeCam() {
   }

   @Override
   public void onEnable() {
      this.ModeSetting3 = this.TriggerBot = new Vec3d(
         minecraftClient3.getEntityRenderDispatcher().camera.getPos().toVector3f()
      );
      super.onEnable();
   }

   @Override
   public void onDisable() {
      minecraftClient3.options.setPerspective(Perspective.FIRST_PERSON);
      super.onDisable();
   }

   @EventTarget
   public void ColorAnimator(EventHookWorldRender var1) {
      WorldRender.on23(
         minecraftClient3.player
            .getBoundingBox()
            .offset(MathUtils.CloudResponse(minecraftClient3.player).subtract(minecraftClient3.player.getPos())),
         val003.TextScanner().getClientColor(90).call001(),
         1.0F
      );
   }

   @EventTarget
   public void Easing(EventRender2 var1) {
      String s = MathUtils.round((float)this.TriggerBot.x)
         + "   "
         + MathUtils.round((float)this.TriggerBot.y)
         + "   "
         + MathUtils.round((float)this.TriggerBot.z);
      float f = Fonts.MEDIUM.getWidth(s, 7.0F);
      var1.Bot()
         .drawText(
            Fonts.MEDIUM.getFont(7.0F),
            s,
            (float)minecraftClient3.getWindow().getScaledWidth() / 2.0F - f / 2.0F,
            10.0F,
            ZenithClient.on23().TextScanner().getCurrentStyle().getTextEnable().getColor()
         );
   }

   @EventTarget
   public void TextScanner(MovementInputEvent var1) {
      float f = this.speedSetting.getCurrent();
      double[] adouble = MovementUtils.FileLogger((double)f);
      this.ModeSetting3 = this.TriggerBot;
      this.TriggerBot = this.TriggerBot
         .add(adouble[0], var1.NoSweetSlow().jump() ? (double)f : (var1.NoSweetSlow().sneak() ? (double)(-f) : 0.0), adouble[1]);
      var1.NoSlow();
   }

   @EventTarget
   public void on23(EventPosHook var1) {
      if (this.ModeSetting3 != null && this.TriggerBot != null) {
         var1.UiAnimation(MathUtils.NbtEditor(this.ModeSetting3, this.TriggerBot));
         minecraftClient3.options.setPerspective(Perspective.THIRD_PERSON_BACK);
      }
   }
}
