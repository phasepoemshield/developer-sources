package fat.releon.mixins.game.world;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import l.FullBright;
import l.NoRender;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({LightmapTextureManager.class})
public class LightmapTextureManagerMixin {
   public LightmapTextureManagerMixin() {
   }

   @ModifyExpressionValue(
      method = {"update(F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/option/SimpleOption;getValue()Ljava/lang/Object;"
      )}
   )
   private Object injectXRayFullBright(Object var1) {
      FullBright var2 = FullBright.method1961();
      if (var2 != null) {
         try {
            if (var2.isState()) {
               double var3 = ((Number)var1).doubleValue();
               double var5 = var2.brightSetting.method2082() * 10.0;
               return Math.max(var3, var5);
            }
         } catch (Exception var7) {
            return var1;
         }
      }

      return var1;
   }

   @Inject(
      method = {"getDarknessFactor"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void removeDarknessFactor(float var1, CallbackInfoReturnable<Float> var2) {
      if (this.isDarknessDisabled()) {
         var2.setReturnValue(0.0F);
      }
   }

   @Inject(
      method = {"getDarkness"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void removeDarknessEffect(LivingEntity var1, float var2, float var3, CallbackInfoReturnable<Float> var4) {
      if (this.isDarknessDisabled()) {
         var4.setReturnValue(0.0F);
      }
   }

   private boolean isDarknessDisabled() {
      try {
         NoRender var1 = NoRender.method2708();
         return var1 != null && var1.isState() && var1.modeSetting.method2588("Darkness");
      } catch (Exception var2) {
         return false;
      }
   }
}
