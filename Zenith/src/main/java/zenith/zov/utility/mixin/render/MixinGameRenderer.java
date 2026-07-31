package zenith.zov.utility.mixin.render;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zenith.Shaderhand;
import zenith.Nofrienddamage;
import zenith.ListHolder_2;
import zenith.EventImpl_7;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_6;
import zenith.MinecraftClientHolder_3;
import zenith.Worldtweaks;
import zenith.ZenithInternal076;
import zenith.EventBus;
import zenith.Event;
import zenith.floatHolder_10;
import zenith.ZenithInternal136;
import zenith.EventImpl_34;
import zenith.EventImpl_37;

@Mixin({GameRenderer.class})
public abstract class MixinGameRenderer {
   @Shadow
   private float zoom;
   @Shadow
   private float zoomX;
   @Shadow
   private float zoomY;
   @Shadow
   @Final
   private Camera camera;

   @Shadow
   public abstract float getFarPlaneDistance();

   @Shadow
   protected abstract HitResult findCrosshairTarget(Entity Entity, double d0, double d1, float f);

   @Shadow
   protected abstract void renderHand(Camera Camera, float f, Matrix4f matrix4f);

   @Inject(
      method = {"getBasicProjectionMatrix"},
      at = {@At("TAIL")},
      cancellable = true
   )
   public void getBasicProjectionMatrixHook(float f, CallbackInfoReturnable<Matrix4f> callbackinforeturnable) {
      floatHolder_10 lilili1l1iil = new floatHolder_10();
      EventBus.StringHolder_8((Event)lilili1l1iil);
      if (lilili1l1iil.Event()) {
         Matrix4f matrix4f = new Matrix4f();
         if (this.zoom != 1.0F) {
            matrix4f.translate(this.zoomX, -this.zoomY, 0.0F);
            matrix4f.scale(this.zoom, this.zoom, 1.0F);
         }

         matrix4f.perspective(f * (float) (Math.PI / 180.0), lilili1l1iil.AntiInvisible(), 0.05F, this.getFarPlaneDistance());
         callbackinforeturnable.setReturnValue(matrix4f);
      }
   }

   @Inject(
      method = {"updateCrosshairTarget"},
      at = {@At("RETURN")}
   )
   public void getBasicProjectionMatrixHook(float f, CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EventImpl_7()));
   }

   @ModifyExpressionValue(
      method = {"getFov"},
      at = {@At(
         value = "INVOKE",
         target = "Ljava/lang/Integer;intValue()I",
         remap = false
      )}
   )
   private int hookGetFov(int i) {
      ZenithInternal136 ll11l1i1l1ii = new ZenithInternal136();
      EventBus.StringHolder_8((Event)ll11l1i1l1ii);
      return ll11l1i1l1ii.Event() ? ll11l1i1l1ii.Cape() : i;
   }

   @Inject(
      method = {"renderWorld"},
      at = {@At("HEAD")}
   )
   private void beginWorldTweaksSaturation(RenderTickCounter RenderTickCounter, CallbackInfo callbackinfo) {
      Worldtweaks.l1I1II1l111l1llI11l1I1llII.ZenithInternal056(true);
   }

   @Inject(
      method = {"renderWorld"},
      at = {@At("RETURN")}
   )
   private void endWorldTweaksSaturation(RenderTickCounter RenderTickCounter, CallbackInfo callbackinfo) {
      Worldtweaks.l1I1II1l111l1llI11l1I1llII.ZenithInternal056(false);
   }

   @Redirect(
      method = {"renderWorld"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/GameRenderer;renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V"
      )
   )
   public void afterRenderHand(GameRenderer GameRenderer, Camera Camera, float f, Matrix4f matrix4f) {
      Shaderhand i11l11llllli11i111il1 = Shaderhand.l1Il1l1lllllll1I1III1Il1I1;
      if (i11l11llllli11i111il1.Spider()) {
         if (!MinecraftClientHolder_3.isInitialized()) {
            MinecraftClientHolder_3.llIl1II1I111IlIIlIl();
         }

         MinecraftClientHolder_3.IlIl1lll1Il11I1Illll1IIl();
         i11l11llllli11i111il1.StringHolder_8(() -> this.renderHand(this.camera, f, matrix4f), f);
      } else {
         this.renderHand(this.camera, f, matrix4f);
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
   public void hookWorldRender(RenderTickCounter RenderTickCounter, CallbackInfo callbackinfo, @Local(ordinal = 2) Matrix4f matrix4f) {
      MatrixStack MatrixStack = new MatrixStack();
      MatrixStack.multiplyPositionMatrix(matrix4f);
      ListHolder_2.StringHolder_8(RenderSystem.getProjectionMatrix());
      ListHolder_2.EventBus(RenderSystem.getModelViewMatrix());
      ListHolder_2.EventTarget(matrix4f);
      EventImpl_34 ll1li1l111llllli1 = new EventImpl_34(MatrixStack, RenderTickCounter.getTickDelta(false));
      EventBus.StringHolder_8((Event)ll1li1l111llllli1);
      ListHolder_2.Event(ll1li1l111llllli1.Norender());
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/MinecraftClient;getOverlay()Lnet/minecraft/client/gui/screen/Overlay;",
         ordinal = 0
      )}
   )
   private void renderScreenHook(
      RenderTickCounter RenderTickCounter, boolean flag, CallbackInfo callbackinfo, @Local(ordinal = 0) int i, @Local(ordinal = 1) int j, @Local DrawContext DrawContext
   ) {
      DrawContext.getMatrices().push();

      try {
         EventBus.StringHolder_8(
            (Event)(new EventImpl_37(
               floatHolder_4.StringHolder_8(
                  DrawContext, i, j, ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter().getTickDelta(false)
               )
            ))
         );
         DrawContext.draw();
         RenderSystem.clear(256);
      } catch (Exception exception) {
      }

      DrawContext.getMatrices().pop();
   }

   @Redirect(
      method = {"updateCrosshairTarget"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/GameRenderer;findCrosshairTarget(Lnet/minecraft/entity/Entity;DDF)Lnet/minecraft/util/hit/HitResult;"
      )
   )
   private HitResult hookRaycast(GameRenderer GameRenderer, Entity Entity, double d0, double d1, float f) {
      if (Entity == ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.player
         && ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl() != null) {
         float f1 = Entity.getYaw();
         float f2 = Entity.getPitch();
         Entity.setYaw(
            ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl().AutoBrewing()
         );
         Entity.setPitch(
            ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl().Basefinder()
         );
         HitResult HitResult = this.findCrosshairTarget(Entity, d0, d1, f);
         Entity.setYaw(f1);
         Entity.setPitch(f2);
         return HitResult;
      } else {
         return this.findCrosshairTarget(Entity, d0, d1, f);
      }
   }

   @ModifyExpressionValue(
      method = {"findCrosshairTarget"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;getRotationVec(F)Lnet/minecraft/util/math/Vec3d;"
      )}
   )
   private Vec3d hookRotationVector(Vec3d Vec3d, Entity Entity, double d0, double d1, float f) {
      if (Entity != ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.player) {
         return Vec3d;
      } else {
         floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance()
            .ZenithInternal057()
            .I111Ill1lIllIIIl();
         return il1ll111liili1ll11liil != null ? il1ll111liili1ll11liil.lllIl11IIIlIIlI1() : Vec3d;
      }
   }

   @ModifyExpressionValue(
      method = {"findCrosshairTarget"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/predicate/entity/EntityPredicates;CAN_HIT:Ljava/util/function/Predicate;"
      )}
   )
   private Predicate<Entity> hookNoFriendDamage(Predicate<Entity> predicate) {
      return !Nofrienddamage.I1IlIl111lII1l.Spider()
         ? predicate
         : Entity -> predicate.test(Entity)
               && !ZenithClient.getInstance().StringHolder_26().EventBus(Entity);
   }
}
