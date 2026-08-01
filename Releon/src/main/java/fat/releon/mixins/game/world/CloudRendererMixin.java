package fat.releon.mixins.game.world;

import l.WorldTweaks;
import net.minecraft.client.option.CloudRenderMode;
import net.minecraft.client.render.CloudRenderer;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({CloudRenderer.class})
public abstract class CloudRendererMixin {
   public CloudRendererMixin() {
   }

   @Inject(
      method = {"renderClouds"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideAmbienceClouds(int var1, CloudRenderMode var2, float var3, Matrix4f var4, Matrix4f var5, Vec3d var6, float var7, CallbackInfo var8) {
      WorldTweaks var9 = WorldTweaks.method2811();
      if (var9 != null && var9.isState() && var9.modeSetting.method2588("No Clouds")) {
         var8.cancel();
      }
   }
}
