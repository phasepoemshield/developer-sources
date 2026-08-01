package fat.releon.mixins.player.camera;

import l.Helper124;
import l.Helper165;
import l.Helper336;
import l.Helper351;
import l.Helper352;
import l.Event9;
import l.Helper378;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Camera.class})
public abstract class CameraMixin {
   @Shadow
   private Vec3d pos;
   @Shadow
   @Final
   private Mutable blockPos;
   @Shadow
   private float yaw;
   @Shadow
   private float pitch;

   public CameraMixin() {
   }

   @Shadow
   public abstract void setRotation(float var1, float var2);

   @Shadow
   protected abstract void moveBy(float var1, float var2, float var3);

   @Shadow
   protected abstract float clipToSpace(float var1);

   @Inject(
      method = {"update"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V",
         shift = Shift.AFTER
      )},
      cancellable = true
   )
   private void updateHook(BlockView var1, Entity var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      Helper378 var7 = new Helper378(false, 4.0F, new Helper336(this.yaw, this.pitch));
      Helper124.method1026(var7);
      Helper336 var8 = var7.method3740();
      if (var7.method581() && var2 instanceof ClientPlayerEntity var9 && !var9.isSleeping() && var3) {
         float var10 = var4 ? -var8.method3334() : var8.method3334();
         float var11 = var8.method3333() - (var4 ? 180 : 0);
         float var12 = var7.method3739();
         this.setRotation(var11, var10);
         this.moveBy(var7.method3738() ? -var12 : -this.clipToSpace(var12), 0.0F, 0.0F);
         var6.cancel();
      }
   }

   @Inject(
      method = {"update"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V",
         shift = Shift.AFTER
      )}
   )
   private void injectQuickPerspectiveSwap(BlockView var1, Entity var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      Helper351 var7 = Helper351.INSTANCE;
      Helper352 var8 = var7.method3499();
      Helper336 var9 = var7.method3526();
      Helper336 var10 = var7.method3525();
      boolean var11 = var8 != null && var8.method3548();
      if (var10 != null && var9 != null && var11) {
         this.setRotation(
            (float)MathHelper.lerp(Helper165.method1361() == 1488.0 ? var5 : Helper165.method1361(), (double)var9.method3333(), (double)var10.method3333()),
            (float)MathHelper.lerp(Helper165.method1361() == 1488.0 ? var5 : Helper165.method1361(), (double)var9.method3334(), (double)var10.method3334())
         );
      }
   }

   @Inject(
      method = {"setPos(Lnet/minecraft/util/math/Vec3d;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void posHook(Vec3d var1, CallbackInfo var2) {
      Event9 var3 = new Event9(var1);
      Helper124.method1026(var3);
      this.pos = var1 = var3.method3706();
      this.blockPos.set(var1.x, var1.y, var1.z);
      var2.cancel();
   }
}
