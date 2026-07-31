package zenith.zov.utility.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.authlib.GameProfile;
import net.minecraft.entity.MovementType;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import project.weye.metadata.Transpile;
import zenith.ZenithInternal025;
import zenith.EventImpl_9;
import zenith.ZenithClient;
import zenith.booleanHolder_3;
import zenith.floatHolder_6;
import zenith.EventImpl_22;
import zenith.EventBus;
import zenith.ZenithInternal078;
import zenith.Event;
import zenith.ZenithInternal127;
import zenith.ZenithInternal126$Helper;
import zenith.ScreenHolder;
import zenith.EventImpl_32;
import zenith.Vec3dHolder_2;

@Mixin({ClientPlayerEntity.class})
public abstract class MixinClientPlayerEntity extends AbstractClientPlayerEntity {
   @Shadow
   private float lastYaw;
   @Shadow
   @Final
   protected MinecraftClient client;

   public MixinClientPlayerEntity(ClientWorld ClientWorld, GameProfile gameprofile) {
      super(ClientWorld, gameprofile);
   }

   @Shadow
   protected abstract void sendSprintingPacket();

   @Shadow
   protected abstract void autoJump(float f, float f1);

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   @Transpile
   public void tick(CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EventImpl_22()));
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/AbstractClientPlayerEntity;tick()V",
         shift = Shift.AFTER
      )}
   )
   public void tickEnd(CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EventImpl_9()));
   }

   @Inject(
      method = {"sendMovementPackets"},
      at = {@At("RETURN")}
   )
   public void motion(CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EventImpl_32()));
   }

   @Redirect(
      method = {"sendMovementPackets"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;sendSprintingPacket()V"
      )
   )
   public void invokeSprintUpdate(ClientPlayerEntity ClientPlayerEntity) {
      ZenithInternal025 i1illl111l11illl1il111 = new ZenithInternal025();
      EventBus.StringHolder_8((Event)i1illl111l11illl1il111);
      if (!i1illl111l11illl1il111.Event()) {
         this.sendSprintingPacket();
      }
   }

   @Inject(
      method = {"canSprint"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void zenith$canSprint(CallbackInfoReturnable<Boolean> callbackinforeturnable) {
      booleanHolder_3 il11lill1lil1l1iill = new booleanHolder_3((Boolean)callbackinforeturnable.getReturnValue());
      EventBus.StringHolder_8((Event)il11lill1lil1l1iill);
      callbackinforeturnable.setReturnValue(il11lill1lil1l1iill.Event() || il11lill1lil1l1iill.Xraybypass());
   }

   @Inject(
      method = {"pushOutOfBlocks"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void pushOutOfBlocks(double d0, double d1, CallbackInfo callbackinfo) {
      ZenithInternal127 lilili1lilli111illllliill = new ZenithInternal127(ZenithInternal126$Helper.l1l1IIlI11l11I1l1l);
      EventBus.StringHolder_8((Event)lilili1lilli111illllliill);
      if (lilili1lilli111illllliill.Event()) {
         callbackinfo.cancel();
      }
   }

   @ModifyExpressionValue(
      method = {"sendMovementPackets", "tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getYaw()F"
      )}
   )
   private float hookSilentRotationYaw(float f) {
      floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl();
      return il1ll111liili1ll11liil == null ? f : il1ll111liili1ll11liil.AutoBrewing();
   }

   @ModifyExpressionValue(
      method = {"sendMovementPackets", "tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getPitch()F"
      )}
   )
   private float hookSilentRotationPitch(float f) {
      floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl();
      return il1ll111liili1ll11liil == null ? f : il1ll111liili1ll11liil.Basefinder();
   }

   @Redirect(
      method = {"tickMovement"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z"
      ),
      require = 0
   )
   private boolean onIsUsingItemRedirect(ClientPlayerEntity ClientPlayerEntity) {
      if (ClientPlayerEntity.isUsingItem()) {
         ZenithInternal078 l1i1liliili = new ZenithInternal078();
         EventBus.StringHolder_8((Event)l1i1liliili);
         return ClientPlayerEntity.isUsingItem() && ClientPlayerEntity.getVehicle() == null && !l1i1liliili.Event();
      } else {
         return ClientPlayerEntity.isUsingItem() && ClientPlayerEntity.getVehicle() == null;
      }
   }

   @Inject(
      method = {"closeHandledScreen"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void closeHandledScreenHook(CallbackInfo callbackinfo) {
      ScreenHolder ll1iliil1l1li11li111l = new ScreenHolder(this.client.currentScreen);
      EventBus.StringHolder_8((Event)ll1iliil1l1li11li111l);
      if (ll1iliil1l1li11li111l.Event()) {
         callbackinfo.cancel();
      }
   }

   @Inject(
      method = {"move"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/AbstractClientPlayerEntity;move(Lnet/minecraft/entity/MovementType;Lnet/minecraft/util/math/Vec3d;)V"
      )},
      cancellable = true
   )
   public void onMoveHook(MovementType MovementType, Vec3d Vec3d, CallbackInfo callbackinfo) {
      Vec3dHolder_2 ll1lii1ii1l11ii11lil111lili11 = new Vec3dHolder_2(Vec3d);
      EventBus.StringHolder_8((Event)ll1lii1ii1l11ii11lil111lili11);
      double d0 = this.getX();
      double d1 = this.getZ();
      super.move(MovementType, ll1lii1ii1l11ii11lil111lili11.Clanupgrade());
      this.autoJump((float)(this.getX() - d0), (float)(this.getZ() - d1));
      callbackinfo.cancel();
   }
}
