package zenith.zov.utility.mixin.render;

import net.minecraft.entity.Entity;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.render.Camera;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.BlockPos.TimerCallbackSerializer9;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.floatHolder_6;
import zenith.booleanHolder_4;
import zenith.EventImpl_18;
import zenith.EventBus;
import zenith.Event;

@Mixin({Camera.class})
public abstract class MixinCamera {
   @Shadow
   private Vec3d pos;
   @Shadow
   @Final
   private TimerCallbackSerializer9 blockPos;
   @Shadow
   private float yaw;
   @Shadow
   private float pitch;

   @Shadow
   protected abstract void setRotation(float f, float f1);

   @Shadow
   protected abstract void moveBy(float f, float f1, float f2);

   @Shadow
   protected abstract float clipToSpace(float f);

   @Inject(
      method = {"update"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V",
         shift = Shift.AFTER
      )},
      cancellable = true
   )
   private void updateHook(BlockView BlockView, Entity Entity, boolean flag, boolean flag1, float f3, CallbackInfo callbackinfo) {
      booleanHolder_4 illilll1ii11l1i1l = new booleanHolder_4(false, 4.0F, new floatHolder_6(this.yaw, this.pitch));
      EventBus.StringHolder_8((Event)illilll1ii11l1i1l);
      floatHolder_6 il1ll111liili1ll11liil = illilll1ii11l1i1l.Blockesp();
      if (illilll1ii11l1i1l.Event() && Entity instanceof ClientPlayerEntity ClientPlayerEntity && !ClientPlayerEntity.isSleeping() && flag) {
         float f = flag1 ? -il1ll111liili1ll11liil.Basefinder() : il1ll111liili1ll11liil.Basefinder();
         float f1 = il1ll111liili1ll11liil.AutoBrewing() - (float)(flag1 ? 180 : 0);
         float f2 = illilll1ii11l1i1l.Betterminecraft();
         this.setRotation(f1, f);
         this.moveBy(illilll1ii11l1i1l.Arrows() ? -f2 : -this.clipToSpace(f2), 0.0F, 0.0F);
         callbackinfo.cancel();
      }
   }

   @Inject(
      method = {"setPos(Lnet/minecraft/util/math/Vec3d;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void posHook(Vec3d Vec3d, CallbackInfo callbackinfo) {
      EventImpl_18 illlil1iiii = new EventImpl_18(Vec3d);
      EventBus.StringHolder_8((Event)illlil1iiii);
      this.pos = Vec3d = illlil1iiii.Cameratweaks();
      this.blockPos.set(Vec3d.x, Vec3d.y, Vec3d.z);
      callbackinfo.cancel();
   }
}
