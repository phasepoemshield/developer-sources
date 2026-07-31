package fat.releon.mixins.game.render;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import l.Helper124;
import l.Helper183;
import l.NoEntityTrace;
import l.NoRender;
import l.Helper324;
import l.Helper349;
import l.Helper351;
import l.Helper367;
import l.FreeCam;
import l.Event10;
import l.Helper38;
import l.HitBox;
import l.Helper437;
import l.Widget16;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.profiler.Profilers;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({GameRenderer.class})
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

   public GameRendererMixin() {
   }

   @Shadow
   public abstract float getFarPlaneDistance();

   @Inject(
      method = {"renderWorld"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void skipWorldRenderWhenClickGuiOpen(RenderTickCounter var1, CallbackInfo var2) {
      if (this.client.currentScreen instanceof Widget16) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"updateCrosshairTarget"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/GameRenderer;findCrosshairTarget(Lnet/minecraft/entity/Entity;DDF)Lnet/minecraft/util/hit/HitResult;"
      )},
      cancellable = true
   )
   private void onUpdateTargetedEntity(float var1, CallbackInfo var2) {
      if (!Helper38.method549()) {
         FreeCam var3 = FreeCam.method3641();
         if (var3.isState()) {
            Profilers.get().pop();
            this.client.crosshairTarget = Helper324.method3224(var3.pos, 4.5, Helper349.method3473(), false);
            var2.cancel();
         }
      }
   }

   @Inject(
      method = {"findCrosshairTarget"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void findCrosshairTargetHook(Entity var1, double var2, double var4, float var6, CallbackInfoReturnable<HitResult> var7) {
      HitBox.method4495();
      NoEntityTrace var8 = NoEntityTrace.method2315();
      if (var8 != null && var8.method2316()) {
         double var9 = Math.max(var2, var4);
         Vec3d var11 = var1.getCameraPosVec(var6);
         HitResult var12 = var1.raycast(var9, var6, false);
         var7.setReturnValue(var12);
      }
   }

   @Inject(
      method = {"findCrosshairTarget"},
      at = {@At("RETURN")}
   )
   private void findCrosshairTargetReturnHook(Entity var1, double var2, double var4, float var6, CallbackInfoReturnable<HitResult> var7) {
      HitBox.method4496();
   }

   @Redirect(
      method = {"findCrosshairTarget"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;raycast(DFZ)Lnet/minecraft/util/hit/HitResult;"
      )
   )
   private HitResult hookRaycast(Entity var1, double var2, float var4, boolean var5) {
      return (HitResult)(var1 != this.client.player
         ? var1.raycast(var2, var4, var5)
         : Helper324.method3223(var2, Helper351.INSTANCE.method3483(), var5));
   }

   @Redirect(
      method = {"findCrosshairTarget"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;getRotationVec(F)Lnet/minecraft/util/math/Vec3d;"
      )
   )
   private Vec3d hookRotationVector(Entity var1, float var2) {
      return Helper351.INSTANCE.method3483().method3329();
   }

   @Inject(
      method = {"getBasicProjectionMatrix"},
      at = {@At("TAIL")},
      cancellable = true
   )
   public void getBasicProjectionMatrixHook(float var1, CallbackInfoReturnable<Matrix4f> var2) {
      Helper367 var3 = new Helper367();
      Helper124.method1026(var3);
      if (var3.method581()) {
         Matrix4f var4 = new Matrix4f();
         if (this.zoom != 1.0F) {
            var4.translate(this.zoomX, -this.zoomY, 0.0F);
            var4.scale(this.zoom, this.zoom, 1.0F);
         }

         var4.perspective(var1 * (float) (Math.PI / 180.0), var3.method3639(), 0.05F, this.getFarPlaneDistance());
         var2.setReturnValue(var4);
      }
   }

   @ModifyExpressionValue(
      method = {"getFov"},
      at = {@At(
         value = "INVOKE",
         target = "Ljava/lang/Integer;intValue()I",
         remap = false
      )}
   )
   private int hookGetFov(int var1) {
      Helper437 var2 = new Helper437();
      Helper124.method1026(var2);
      return var2.method581() ? var2.method4551() : var1;
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
      MatrixStack var4 = new MatrixStack();
      var4.multiplyPositionMatrix(var3);
      var4.translate(this.client.getEntityRenderDispatcher().camera.getPos().negate());
      Helper183.method1569(RenderSystem.getProjectionMatrix());
      Helper183.method1570(var4.peek());
      Event10 var5 = new Event10(var4, var1.getTickDelta(false));
      Helper124.method1026(var5);
      Helper183.onWorldRender(var5);
   }

   @Inject(
      method = {"tiltViewWhenHurt"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onTiltViewWhenHurt(MatrixStack var1, float var2, CallbackInfo var3) {
      NoRender var4 = NoRender.method2708();
      if (var4 != null && var4.isState() && var4.modeSetting.method2588("Damage")) {
         var3.cancel();
      }
   }
}
