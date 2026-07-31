package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.HeldItemFeatureRenderer;
import net.minecraft.client.render.entity.state.ArmedEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.model.CustomModelInstance;
import ru.destra.model.CustomModelManager;

@Mixin(HeldItemFeatureRenderer.class)
public abstract class HeldItemFeatureRendererCustomModelMixin<S extends ArmedEntityRenderState> {
   @Inject(method = "renderItem", at = @At("HEAD"), cancellable = true)
   private void destra$renderHeldItemFromCustomPivot(
      S var1, ItemRenderState var2, Arm var3, MatrixStack var4, VertexConsumerProvider var5, int var6, CallbackInfo var7
   ) {
      if (!var2.isEmpty() && var1 instanceof PlayerEntityRenderState var8) {
         MinecraftClient var9 = MinecraftClient.getInstance();
         if (var9.player != null && var8.id == var9.player.getId()) {
            CustomModelInstance var10 = CustomModelManager.Р().Ъ();
            if (var10 != null) {
               ItemStack var11 = var3 == var9.player.getMainArm() ? var9.player.getMainHandStack() : var9.player.getOffHandStack();
               if (var10.必(var11, var2, var3, var4, var5, var6) || var10.shouldHideHeldItems()) {
                  var7.cancel();
               }
            }
         }
      }
   }
}
