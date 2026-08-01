package sg.mx;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.destra.animation.InterpolationUtil;
import ru.destra.core.DestraClient;
import ru.destra.misc.KeyBindManager;
import ru.destra.module.AspectRatioModule;
import ru.destra.module.CustomHandsModule;
import ru.destra.module.RenderTweaksModule;
import ru.destra.module.ZoomModule;
import ru.destra.render.ChamsRenderer;
import ru.destra.render.CustomHandShaderRenderer;
import ru.destra.render.FramebufferHelper;
import ru.destra.util.WorldToScreenUtil;

@Mixin(GameRenderer.class)
public abstract class GameRendererMixin {
   @Final
   @Shadow
   private MinecraftClient client;
   @Shadow
   private float zoom;
   @Shadow
   private float zoomX;
   @Shadow
   private float zoomY;
   float anim;
   private static final float шСР = 0.017453292F;
   private static final float шСъ = 0.05F;
   private static final float шСм = 1.0F;
   private static final float шСЛ = 10.0F;
   private static final float шСИ = 5.0F;
   private static final float шСв = 5.0F;
   private static final float шСю = 5.0F;
   private static final float шСг = 8.0F;
   private static final float шСж = 2.0F;
   private static final float шСЮ = 3.0F;
   private static final float шСл = 0.15F;

   @Shadow
   public abstract float getFarPlaneDistance();

   @Inject(method = "render", at = @At("HEAD"))
   private void destra$beginChamsFrame(RenderTickCounter var1, boolean renderBlockOutline, CallbackInfo var2) {
      FramebufferHelper.checkAndInvalidateOnChange();
      ChamsRenderer.finishFrame();
   }

   @Inject(method = "getBasicProjectionMatrix", at = @At("TAIL"), cancellable = true)
   public void getBasicProjectionMatrixHook(float var1, CallbackInfoReturnable<Matrix4f> var2) {
      DestraClient var3 = DestraClient.getInstance();
      if (var3 != null && var3.getModuleManager() != null) {
         AspectRatioModule var4 = var3.getModuleManager().aspectRatio;
         if (var4 != null && (ru.destra.misc.ModuleHelper.isEnabled(var4) || var4.resettingToNative)) {
            Matrix4f var5 = new Matrix4f();
            if (this.zoom != 1.0F) {
               var5.translate(this.zoomX, -this.zoomY, 0.0F);
               var5.scale(this.zoom, this.zoom, 1.0F);
            }

            var5.perspective(var1 * шСР, var4.getCurrentRatio(), шСъ, this.getFarPlaneDistance());
            var2.setReturnValue(var5);
         }
      }
   }

    @Inject(
       method = "renderWorld",
       at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/WorldRenderer;render(Lnet/minecraft/client/util/ObjectAllocator;Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V", shift = Shift.BEFORE)
    )
    private void destra$flushChamsBeforeHand(RenderTickCounter var1, CallbackInfo var2) {
       ChamsRenderer.renderChams();
       destra$applyAspectRatioViewport();
    }

    @Inject(
       method = "renderWorld",
       at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/WorldRenderer;render(Lnet/minecraft/client/util/ObjectAllocator;Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V", shift = Shift.AFTER)
    )
    private void destra$renderCustomHandShader(RenderTickCounter var1, CallbackInfo var2) {
       destra$resetAspectRatioViewport();
       if (DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null) {
          CustomHandsModule var3 = DestraClient.getInstance().getModuleManager().customHands;
          if (var3 != null && var3.isVisible()) {
             CustomHandShaderRenderer.render(var3);
          }
       }
    }

    private void destra$applyAspectRatioViewport() {
       DestraClient var0 = DestraClient.getInstance();
       if (var0 != null && var0.getModuleManager() != null) {
          AspectRatioModule var1 = var0.getModuleManager().aspectRatio;
          if (var1 != null && (ru.destra.misc.ModuleHelper.isEnabled(var1) || var1.resettingToNative)) {
             int[] var2 = var1.getViewportRect();
             if (var2 != null && var2.length == 4 && var2[2] > 0 && var2[3] > 0) {
                GL11.glViewport(var2[0], var2[1], var2[2], var2[3]);
             }
          }
       }
    }

    private void destra$resetAspectRatioViewport() {
       DestraClient var0 = DestraClient.getInstance();
       if (var0 != null && var0.getModuleManager() != null) {
          AspectRatioModule var1 = var0.getModuleManager().aspectRatio;
          if (var1 != null && (ru.destra.misc.ModuleHelper.isEnabled(var1) || var1.resettingToNative)) {
             Window var2 = this.client.getWindow();
             if (var2 != null) {
                GL11.glViewport(0, 0, var2.getFramebufferWidth(), var2.getFramebufferHeight());
             }
          }
       }
    }

   @Inject(method = "render", at = @At("RETURN"))
   private void destra$flushChamsAtEnd(RenderTickCounter var1, boolean renderBlockOutline, CallbackInfo var2) {
      ChamsRenderer.renderChams();
   }

   @Inject(
      method = "render",
      at = @At(value = "INVOKE_STRING", target = "Lnet/minecraft/client/render/RenderLayer;getArmorCutoutNoCull(Ljava/lang/String;)V", args = "ldc=hand"),
      require = 0
   )
   private void onRenderWorld(
      RenderTickCounter var1,
      boolean renderBlockOutline,
      CallbackInfo var2,
      @Local(ordinal = 0) Matrix4f var3,
      @Local(ordinal = 2) Matrix4f var4,
      @Local(ordinal = 1) float var5,
      @Local MatrixStack var6
   ) {
      WorldToScreenUtil.updateMatrices(var4, var3);
   }

   @Inject(method = "bobView", at = @At("TAIL"))
   private void destra$applyHurtScreenShake(MatrixStack var1, float var2, CallbackInfo var3) {
      if (destra$useHurtShake()) {
         if (this.client.getCameraEntity() instanceof LivingEntity var5) {
            float var6 = var5.hurtTime - var2;
            if (!(var6 <= 0.0F)) {
               float var7 = MathHelper.clamp(var6 / Math.max(1.0F, var5.maxHurtTime), 0.0F, 1.0F);
               float var8 = var7 * var7;
               float var9 = (var5.age + var2) * шСм;
               float var10 = MathHelper.sin(var9 * шСЛ) * шСИ * var8;
               float var11 = MathHelper.cos(var9 * шСв) * шСю * var8;
               float var12 = MathHelper.sin(var9 * шСг + шСж) * шСЮ * var8;
               var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var10));
               var1.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var11));
               var1.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var12));
            }
         }
      }
   }

   private static boolean destra$useHurtShake() {
      DestraClient var0 = DestraClient.getInstance();
      if (var0 != null && var0.getModuleManager() != null) {
         RenderTweaksModule var1 = var0.getModuleManager().renderTweaks;
         return var1 != null && var1.shouldHideHurtOverlayAlways();
      } else {
         return false;
      }
   }

   @ModifyVariable(
      method = "getFov",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;getSubmersionType()Lnet/minecraft/block/enums/CameraSubmersionType;", ordinal = 0, shift = Shift.BEFORE),
      require = 0,
      index = 4,
      argsOnly = false
   )
   private float modifyFov(float var1, Camera var2, float var3, boolean var4) {
      ZoomModule var5 = DestraClient.getInstance().getModuleManager().zoom;
      boolean var6 = false;
      if (this.client.currentScreen == null) {
         Integer destra$zoomKey = (Integer)ru.destra.misc.ModuleHelper.getValue(var5.zoomKeyBinding);
         var6 = destra$zoomKey != null && KeyBindManager.isKeyDown(this.client.getWindow().getHandle(), destra$zoomKey.intValue());
      }

      if (ru.destra.misc.ModuleHelper.isEnabled(DestraClient.getInstance().getModuleManager().zoom)) {
         this.anim = InterpolationUtil.lerpFloat(this.anim, var6 ? var5.zoomLevel : 1.0F, шСл);
         var1 /= Math.max(1.0F, this.anim);
      }

      return var1;
   }

   static {}
}
