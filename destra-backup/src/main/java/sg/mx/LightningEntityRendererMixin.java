package sg.mx;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LightningEntityRenderer;
import net.minecraft.client.render.entity.state.LightningEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LightningEntity;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.misc.KillEffectColorAccessor;
import ru.destra.module.KillEffectModule;
import ru.destra.util.ColorUtil;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(LightningEntityRenderer.class)
public abstract class LightningEntityRendererMixin {
   @Unique
   private static final ThreadLocal<float[]> DESTRA_KILL_EFFECT_COLOR = new ThreadLocal<>();
   private static final float ПП;
   private static final float П2;
   private static final float ПХ;

   @Shadow
   private static void drawBranch(
      Matrix4f var0,
      VertexConsumer var1,
      float var2,
      float var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15
   ) {
      throw new AssertionError();
   }

   @Inject(method = "updateRenderState", at = @At("TAIL"))
   private void destra$updateKillEffectColor(LightningEntity var1, LightningEntityRenderState var2, float var3, CallbackInfo var4) {
      ((KillEffectColorAccessor)var2).destra$setKillEffectColor(KillEffectModule.Т(var1.getUuid()));
   }

   @Inject(method = "render", at = @At("HEAD"))
   private void destra$cacheKillEffectColor(LightningEntityRenderState var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      Integer var6 = ((KillEffectColorAccessor)var1).destra$getKillEffectColor();
      if (var6 == null) {
         DESTRA_KILL_EFFECT_COLOR.remove();
      } else {
         DESTRA_KILL_EFFECT_COLOR.set(new float[]{ColorUtil.getRed(var6) / ПП, ColorUtil.getGreen(var6) / П2, ColorUtil.getBlueAlt(var6) / ПХ});
      }
   }

   @Redirect(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/LightningEntityRenderer;drawBranch(Lorg/joml/Matrix4f;Lnet/minecraft/client/render/VertexConsumer;FFIFFFFFFFZZZZ)V")
   )
   private static void destra$drawKillEffectLightning(
      Matrix4f var0,
      VertexConsumer var1,
      float var2,
      float var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15
   ) {
      float[] var16 = DESTRA_KILL_EFFECT_COLOR.get();
      if (var16 != null) {
         var7 = var16[0];
         var8 = var16[1];
         var9 = var16[2];
      }

      drawBranch(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   @Inject(method = "render", at = @At("TAIL"))
   private void destra$clearKillEffectColor(LightningEntityRenderState var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      DESTRA_KILL_EFFECT_COLOR.remove();
   }

   static {
      VMBridge.identifyClass(LightningEntityRendererMixin.class, "GleJKFca");
   }
}
