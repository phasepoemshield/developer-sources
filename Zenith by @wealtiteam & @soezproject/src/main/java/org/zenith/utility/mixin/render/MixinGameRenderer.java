package org.zenith.utility.mixin.render;

import org.zenith.base.font.Font;
import org.zenith.core.ItemRegistry;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.core.MediaTrackInfo;
import org.zenith.core.CloudRouter;
import org.zenith.event.Event19;
import org.zenith.module.AHHelper;
import org.zenith.module.ClanUpgrade;
import org.zenith.module.GrimGlide;
import org.zenith.module.GuiWalk;
import org.zenith.module.Module;
import org.zenith.module.Spider;

import org.zenith.module.NoFriendDamage;
import org.zenith.module.ShaderHand;
import org.zenith.module.WorldTweaks;

import org.zenith.event.EventGetBasicProjectionMatrixHook;
import org.zenith.event.EventGetBasicProjectionMatrixHook2;
import org.zenith.event.EventHookWorldRender;
import org.zenith.event.EventRenderScreenHook;
import org.zenith.event.FovEvent;

import org.zenith.base.font.MsdfRenderer;
import org.zenith.event.EventGetBasicProjectionMatrixHook;
import org.zenith.event.EventGetBasicProjectionMatrixHook2;
import org.zenith.event.EventHookWorldRender;
import org.zenith.event.EventRenderScreenHook;
import org.zenith.event.FovEvent;
import org.zenith.render.HandShaderManager;
import org.zenith.utility.render.display.base.HudDrawContext;
import org.zenith.module.NoFriendDamage;
import org.zenith.ZenithClient;
import org.zenith.rotation.Rotation;
import org.zenith.module.ShaderHand;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.render.WorldRender;
import org.zenith.module.WorldTweaks;
import org.zenith.core.ClientProvider;
















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventManager;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Predicate;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({GameRenderer.class})
public abstract class MixinGameRenderer {
   @Unique
   private static String zenith$hudRenderErrorLogged;

   @Shadow
   public float field_4005;
   @Shadow
   public float field_3988;
   @Shadow
   public float field_4004;
   @Shadow
   @Final
   public Camera field_18765;

   public MixinGameRenderer() {
   }

   @Shadow
   public abstract float method_32796();

   @Shadow
   protected abstract HitResult method_56153(Entity var1, double var2, double var4, float var6);

   @Shadow
   protected abstract void method_3172(Camera var1, float var2, Matrix4f var3);

   @Inject(
      method = {"getBasicProjectionMatrix"},
      at = {@At("TAIL")},
      cancellable = true
   )
   public void getBasicProjectionMatrixHook(float var1, CallbackInfoReturnable<Matrix4f> var2) {
      EventGetBasicProjectionMatrixHook i1il11li11liill1l = new EventGetBasicProjectionMatrixHook();
      EventManager.call(i1il11li11liill1l);
      if (i1il11li11liill1l.isCancelled()) {
         Matrix4f matrix4f = new Matrix4f();
         if (this.field_4005 != 1.0F) {
            matrix4f.translate(this.field_3988, -this.field_4004, 0.0F);
            matrix4f.scale(this.field_4005, this.field_4005, 1.0F);
         }

         matrix4f.perspective(var1 * (float) (Math.PI / 180.0), i1il11li11liill1l.Spider(), 0.05F, this.method_32796());
         var2.setReturnValue(matrix4f);
      }
   }

   @Inject(
      method = {"updateCrosshairTarget"},
      at = {@At("RETURN")}
   )
   public void getBasicProjectionMatrixHook(float var1, CallbackInfo var2) {
      EventManager.call(new EventGetBasicProjectionMatrixHook2());
   }

   @ModifyExpressionValue(
      method = {"getFov"},
      at = {@At(
         value = "INVOKE",
         target = "Ljava/lang/Integer;intValue()I",
         remap = false
      )}
   )
   public int hookGetFov(int var1) {
      FovEvent iililil11ii1i = new FovEvent();
      EventManager.call(iililil11ii1i);
      return iililil11ii1i.isCancelled() ? iililil11ii1i.AHHelper() : var1;
   }

   @Inject(
      method = {"renderWorld"},
      at = {@At("HEAD")}
   )
   public void beginWorldTweaksSaturation(RenderTickCounter var1, CallbackInfo var2) {
      WorldTweaks.worldTweaks.Event19(true);
   }

   @Inject(
      method = {"renderWorld"},
      at = {@At("RETURN")}
   )
   public void endWorldTweaksSaturation(RenderTickCounter var1, CallbackInfo var2) {
      WorldTweaks.worldTweaks.Event19(false);
   }

   @Inject(
      method = {"renderWorld"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/GameRenderer;renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V"
      )}
   )
   public void beforeRenderHand(RenderTickCounter var1, CallbackInfo var2) {
      if (!HandShaderManager.isInitialized()) {
         HandShaderManager.float246();
      }

      ShaderHand llillll1i1i11iiii1ii11il = ShaderHand.shaderHand;
   }

   @Redirect(
      method = {"renderWorld"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/GameRenderer;renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V"
      )
   )
   public void afterRenderHand(GameRenderer var1, Camera var2, float var3, Matrix4f var4) {
      ShaderHand llillll1i1i11iiii1ii11il = ShaderHand.shaderHand;
      if (llillll1i1i11iiii1ii11il != null && llillll1i1i11iiii1ii11il.isEnabled()) {
         HandShaderManager.float247();
         llillll1i1i11iiii1ii11il.on23(() -> this.method_3172(this.field_18765, var3, var4), var3);
      } else {
         this.method_3172(this.field_18765, var3, var4);
      }
   }

   @Inject(
      method = {"renderWorld"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/render/GameRenderer;renderHand:Z",
         opcode = 180,
         ordinal = 0
      )}
   )
   public void hookWorldRender(RenderTickCounter var1, CallbackInfo var2, @Local(ordinal = 2) Matrix4f var3) {
      MatrixStack matrixstack = new MatrixStack();
      matrixstack.multiplyPositionMatrix(var3);
      WorldRender.on23(RenderSystem.getProjectionMatrix());
      WorldRender.UiAnimation(RenderSystem.getModelViewMatrix());
      WorldRender.Easing(var3);
      EventHookWorldRender i111liliill1iii1iiii1 = new EventHookWorldRender(matrixstack, var1.getTickDelta(false));
      EventManager.call(i111liliill1iii1iiii1);
      WorldRender.ItemRegistry(i111liliill1iii1iiii1.ClanUpgrade());
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/MinecraftClient;getOverlay()Lnet/minecraft/client/gui/screen/Overlay;",
         ordinal = 0
      )}
   )
   public void renderScreenHook(
      RenderTickCounter var1, boolean var2, CallbackInfo var3, @Local(ordinal = 0) int var4, @Local(ordinal = 1) int var5, @Local DrawContext var6
   ) {
      var6.getMatrices().push();

      try {
         EventManager.call(
            new EventRenderScreenHook(
               HudDrawContext.of(var6, var4, var5, ClientProvider.minecraftClient3.getRenderTickCounter().getTickDelta(false))
            )
         );
         MsdfRenderer.flushBatch();
         var6.draw();
         RenderSystem.clear(256);
      } catch (Exception exception) {
         if (zenith$hudRenderErrorLogged == null || !zenith$hudRenderErrorLogged.equals(String.valueOf(exception))) {
            zenith$hudRenderErrorLogged = String.valueOf(exception);
            System.err.println("[Zenith] HUD render failed:");
            exception.printStackTrace();
         }
      }

      var6.getMatrices().pop();
   }

   @Redirect(
      method = {"updateCrosshairTarget"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/GameRenderer;findCrosshairTarget(Lnet/minecraft/entity/Entity;DDF)Lnet/minecraft/util/hit/HitResult;"
      )
   )
   public HitResult hookRaycast(GameRenderer var1, Entity var2, double var3, double var5, float var7) {
      Rotation ililiiili1ll1li11 = ZenithClient.on23().CloudRouter().ZClass092();
      if (var2 == ClientProvider.minecraftClient3.player && ililiiili1ll1li11 != null) {
         float f = var2.getYaw();
         float f1 = var2.getPitch();
         var2.setYaw(ililiiili1ll1li11.GrimGlide());
         var2.setPitch(ililiiili1ll1li11.GuiWalk());
         HitResult hitresult = this.method_56153(var2, var3, var5, var7);
         var2.setYaw(f);
         var2.setPitch(f1);
         return hitresult;
      } else {
         return this.method_56153(var2, var3, var5, var7);
      }
   }

   @ModifyExpressionValue(
      method = {"findCrosshairTarget"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;getRotationVec(F)Lnet/minecraft/util/math/Vec3d;"
      )}
   )
   public Vec3d hookRotationVector(Vec3d var1, Entity var2, double var3, double var5, float var7) {
      if (var2 != ClientProvider.minecraftClient3.player) {
         return var1;
      } else {
         Rotation ililiiili1ll1li11 = ZenithClient.on23().CloudRouter().ZClass092();
         return ililiiili1ll1li11 != null ? ililiiili1ll1li11.int202() : var1;
      }
   }

   @ModifyExpressionValue(
      method = {"findCrosshairTarget"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/predicate/entity/EntityPredicates;CAN_HIT:Ljava/util/function/Predicate;"
      )}
   )
   public Predicate<Entity> hookNoFriendDamage(Predicate<Entity> var1) {
      return !NoFriendDamage.noFriendDamage.isEnabled()
         ? var1
         : var1x -> var1.test(var1x) && !ZenithClient.on23().MediaTrackInfo().UiAnimation(var1x);
   }
}
