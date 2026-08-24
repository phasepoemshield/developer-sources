package org.zenith.utility.mixin.entity;

import org.zenith.core.CloudRouter;
import org.zenith.module.GrimGlide;
import org.zenith.module.GuiWalk;
import org.zenith.module.NoPush;
import org.zenith.module.Speed;

import org.zenith.event.CloseScreenEvent;
import org.zenith.event.Event18Ext4;
import org.zenith.event.EventMotion;
import org.zenith.event.EventPushOutOfBlocks;
import org.zenith.event.EventTick;
import org.zenith.event.EventTickEnd;
import org.zenith.event.ItemUseEvent;
import org.zenith.event.PlayerMoveEvent;
import org.zenith.event.SprintStateEvent;

import org.zenith.event.CloseScreenEvent;
import org.zenith.event.Event18Ext4;
import org.zenith.event.Event36_Var159;
import org.zenith.event.EventMotion;
import org.zenith.event.EventPushOutOfBlocks;
import org.zenith.event.EventTick;
import org.zenith.event.EventTickEnd;
import org.zenith.event.ItemUseEvent;
import org.zenith.ZenithClient;
import org.zenith.event.PlayerMoveEvent;
import org.zenith.rotation.Rotation;
import org.zenith.event.SprintStateEvent;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.ClickFxController;















import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.events.Event;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.authlib.GameProfile;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.MovementType;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ClientPlayerEntity.class})
public abstract class MixinClientPlayerEntity extends AbstractClientPlayerEntity {
   @Shadow
   public float field_3941;
   @Shadow
   public Input field_3913;
   @Shadow
   @Final
   protected MinecraftClient field_3937;

   public MixinClientPlayerEntity(ClientWorld var1, GameProfile var2) {
      super(var1, var2);
   }

   @Shadow
   protected abstract void method_46742();

   @Shadow
   protected abstract void method_3148(float var1, float var2);

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   public void tick(CallbackInfo var1) {
      dispatchEvent(new EventTick());
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/AbstractClientPlayerEntity;tick()V",
         shift = Shift.AFTER
      )}
   )
   public void tickEnd(CallbackInfo var1) {
      dispatchEvent(new EventTickEnd());
   }

   @Inject(
      method = {"sendMovementPackets"},
      at = {@At("RETURN")}
   )
   public void motion(CallbackInfo var1) {
      dispatchEvent(new EventMotion());
   }

   @Redirect(
      method = {"sendMovementPackets"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;sendSprintingPacket()V"
      )
   )
   public void invokeSprintUpdate(ClientPlayerEntity var1) {
      Event18Ext4 lillllii11iiill11i = new Event18Ext4();
      dispatchEvent(lillllii11iiill11i);
      if (!lillllii11iiill11i.isCancelled()) {
         this.method_46742();
      }
   }

   @Inject(
      method = {"canSprint"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void zenith_canSprint(CallbackInfoReturnable<Boolean> var1) {
      SprintStateEvent i1ilii1l1l1lll = new SprintStateEvent((Boolean)var1.getReturnValue());
      dispatchEvent(i1ilii1l1l1lll);
      var1.setReturnValue(i1ilii1l1l1lll.isCancelled() || i1ilii1l1l1lll.Speed());
   }

   @Inject(
      method = {"pushOutOfBlocks"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void pushOutOfBlocks(double var1, double var3, CallbackInfo var5) {
      EventPushOutOfBlocks li1liiliill1 = new EventPushOutOfBlocks(Event36_Var159.call133);
      dispatchEvent(li1liiliill1);
      if (li1liiliill1.isCancelled()) {
         var5.cancel();
      }
   }

   @ModifyExpressionValue(
      method = {"sendMovementPackets", "tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getYaw()F"
      )}
   )
   public float hookSilentRotationYaw(float var1) {
      Rotation ililiiili1ll1li11 = ZenithClient.on23().CloudRouter().ZClass092();
      return ililiiili1ll1li11 == null ? var1 : ililiiili1ll1li11.GrimGlide();
   }

   @ModifyExpressionValue(
      method = {"sendMovementPackets", "tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getPitch()F"
      )}
   )
   public float hookSilentRotationPitch(float var1) {
      Rotation ililiiili1ll1li11 = ZenithClient.on23().CloudRouter().ZClass092();
      return ililiiili1ll1li11 == null ? var1 : ililiiili1ll1li11.GuiWalk();
   }

   @Redirect(
      method = {"tickMovement"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z"
      ),
      require = 0
   )
   public boolean onIsUsingItemRedirect(ClientPlayerEntity var1) {
      if (var1.isUsingItem()) {
         ItemUseEvent li1ii1ll1iili1l1lil1 = new ItemUseEvent();
         dispatchEvent(li1ii1ll1iili1l1lil1);
         return var1.isUsingItem() && var1.getVehicle() == null && !li1ii1ll1iili1l1lil1.isCancelled();
      } else {
         return var1.isUsingItem() && var1.getVehicle() == null;
      }
   }

   @Inject(
      method = {"closeHandledScreen"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void closeHandledScreenHook(CallbackInfo var1) {
      CloseScreenEvent i1l11ll1l1l11l1111li1 = new CloseScreenEvent(this.field_3937.currentScreen);
      dispatchEvent(i1l11ll1l1l11l1111li1);
      if (i1l11ll1l1l11l1111li1.isCancelled()) {
         var1.cancel();
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
   public void onMoveHook(MovementType var1, Vec3d var2, CallbackInfo var3) {
      PlayerMoveEvent i1lil1ii11ll111l1li1il = new PlayerMoveEvent(var2);
      dispatchEvent(i1lil1ii11ll111l1li1il);
      double d0 = this.getX();
      double d1 = this.getZ();
      super.move(var1, i1lil1ii11ll111l1li1il.NoPush());
      this.method_3148((float)(this.getX() - d0), (float)(this.getZ() - d1));
      var3.cancel();
   }

   private static void dispatchEvent(Event var0) {
      EventManager.call(var0);
   }
}
