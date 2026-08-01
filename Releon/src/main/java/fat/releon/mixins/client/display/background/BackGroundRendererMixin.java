package fat.releon.mixins.client.display.background;

import l.Helper124;
import l.Helper133;
import l.NoRender;
import l.Helper400;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.FogShape;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({BackgroundRenderer.class})
public class BackGroundRendererMixin {
   public BackGroundRendererMixin() {
   }

   @Inject(
      method = {"getFogModifier(Lnet/minecraft/entity/Entity;F)Lnet/minecraft/client/render/BackgroundRenderer$StatusEffectFogModifier;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void onGetFogModifier(Entity var0, float var1, CallbackInfoReturnable<Object> var2) {
      NoRender var3 = NoRender.method2708();
      if (var3.isState() && var3.modeSetting.method2588("Bad Effects")) {
         var2.setReturnValue(null);
      }

      if (var3.isState() && var3.modeSetting.method2588("Darkness") && var0 instanceof LivingEntity) {
         var2.setReturnValue(null);
      }
   }

   @Inject(
      method = {"getFogColor"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void getFogColorHook(Camera var0, float var1, ClientWorld var2, int var3, float var4, CallbackInfoReturnable<Vector4f> var5) {
      Helper400 var6 = new Helper400();
      Helper124.method1026(var6);
      if (var6.method581()) {
         int var7 = var6.method4074();
         var5.setReturnValue(
            new Vector4f(Helper133.method1092(var7), Helper133.method1093(var7), Helper133.method1094(var7), Helper133.method1095(var7))
         );
      }
   }

   @Inject(
      method = {"applyFog"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void modifyFog(Camera var0, FogType var1, Vector4f var2, float var3, boolean var4, float var5, CallbackInfoReturnable<Fog> var6) {
      Helper400 var7 = new Helper400();
      Helper124.method1026(var7);
      if (var7.method581()) {
         int var8 = var7.method4074();
         var6.setReturnValue(
            new Fog(
               2.0F,
               var7.method4073(),
               FogShape.CYLINDER,
               Helper133.method1092(var8),
               Helper133.method1093(var8),
               Helper133.method1094(var8),
               Helper133.method1095(var8)
            )
         );
      }
   }
}
