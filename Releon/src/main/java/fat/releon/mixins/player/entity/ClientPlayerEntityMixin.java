package fat.releon.mixins.player.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.authlib.GameProfile;
import fat.releon.teremok.impl.combat.Aura;
import l.Helper124;
import l.Helper160;
import l.Helper165;
import l.NoSlow;
import l.Helper351;
import l.Helper352;
import l.Helper368;
import l.Helper369;
import l.Helper373;
import l.Event8;
import l.Event11;
import l.Event13;
import l.Helper387;
import l.Helper405;
import l.Helper429;
import l.AutoSprint;
import l.Helper433;
import l.Helper59;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
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
public abstract class ClientPlayerEntityMixin extends AbstractClientPlayerEntity {
   @Final
   @Shadow
   protected MinecraftClient client;
   @Shadow
   public Input input;
   private double prevX = 0.0;
   private double prevZ = 0.0;
   private float prevBodyYaw = 0.0F;
   private boolean initialized = false;

   @Shadow
   @Override
   public abstract float getPitch(float tickDelta);

   @Shadow
   @Override
   public abstract float getYaw(float tickDelta);

   @Shadow
   protected abstract void autoJump(float var1, float var2);

   public ClientPlayerEntityMixin(ClientWorld var1, GameProfile var2) {
      super(var1, var2);
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   public void tick(CallbackInfo var1) {
      if (this.client.player != null && this.client.world != null) {
         Helper124.method1026(new Event8());
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   public void onTickInit(CallbackInfo var1) {
      if (!this.initialized && Helper160.mc.player != null) {
         this.prevX = Helper160.mc.player.getX();
         this.prevZ = Helper160.mc.player.getZ();
         this.prevBodyYaw = Helper160.mc.player.getBodyYaw();
         this.initialized = true;
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/AbstractClientPlayerEntity;tick()V",
         shift = Shift.AFTER
      )}
   )
   public void postTick(CallbackInfo var1) {
      if (this.client.player != null && this.client.world != null) {
         Helper124.method1026(new Event11());
      }
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/input/Input;tick()V",
         shift = Shift.AFTER
      )}
   )
   private void onInputTick(CallbackInfo var1) {
      if (Helper160.mc.player != null) {
         Helper387 var2 = new Helper387(Vec3d.ZERO, false);
         Helper124.method1026(var2);
      }
   }

   @ModifyExpressionValue(
      method = {"sendMovementPackets", "tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getYaw()F"
      )}
   )
   private float hookSilentRotationYaw(float var1) {
      if (Helper160.mc.player == null) {
         return var1;
      } else {
         Helper351 var2 = Helper351.INSTANCE;
         float var3 = var2.method3486() ? var2.method3484() : var1;
         Helper352 var4 = var2.method3499();
         boolean var5 = var4 != null && var4.method3548();
         float var6;
         if (var5) {
            var6 = var3;
            Helper160.mc.player.setHeadYaw(var3);
            Helper160.mc.player.prevHeadYaw = var3;
            Helper160.mc.player.prevYaw = var3;
         } else {
            var6 = Helper165.method1360(
               var3,
               this.prevBodyYaw,
               this.prevX,
               this.prevZ,
               Helper160.mc.player.getX(),
               Helper160.mc.player.getZ(),
               Helper160.mc.player.handSwingProgress
            );
         }

         this.prevBodyYaw = var6;
         this.prevX = Helper160.mc.player.getX();
         this.prevZ = Helper160.mc.player.getZ();
         Helper160.mc.player.setBodyYaw(var6);
         Helper160.mc.player.prevBodyYaw = var6;
         return var3;
      }
   }

   @ModifyExpressionValue(
      method = {"sendMovementPackets", "tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getPitch()F"
      )}
   )
   private float hookSilentRotationPitch(float var1) {
      Helper351 var2 = Helper351.INSTANCE;
      return var2.method3486() ? var2.method3485() : var1;
   }

   @Inject(
      method = {"closeHandledScreen"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void closeHandledScreenHook(CallbackInfo var1) {
      Helper405 var2 = new Helper405(this.client.currentScreen);
      Helper124.method1026(var2);
      if (var2.method581()) {
         var1.cancel();
      }
   }

   @Redirect(
      method = {"tickMovement"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z"
      ),
      require = 0
   )
   private boolean tickMovementHook(ClientPlayerEntity var1) {
      Helper429 var2 = new Helper429((byte)1);
      Helper124.method1026(var2);
      if (var1.isUsingItem()) {
         AutoSprint.tickStop = 0;
      }

      return var2.method581() ? false : var1.isUsingItem();
   }

   @WrapOperation(
      method = {"tickMovement"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/option/KeyBinding;isPressed()Z"
      )}
   )
   private boolean ignoreLeftControlSprintKey(KeyBinding var1, Operation<Boolean> var2) {
      return Aura.getInstance().isState() && var1 == this.client.options.sprintKey && this.isLeftControlPressed()
         ? false
         : (Boolean)var2.call(new Object[]{var1});
   }

   @ModifyExpressionValue(
      method = {"tickMovement"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;canSprint()Z"
      )}
   )
   private boolean suppressAuraSprintStart(boolean var1) {
      return var1;
   }

   private boolean isLeftControlPressed() {
      return this.client.getWindow() != null && InputUtil.isKeyPressed(this.client.getWindow().getHandle(), 341);
   }

   @Inject(
      method = {"canStartSprinting"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void allowAutoSprintStart(CallbackInfoReturnable<Boolean> var1) {
      AutoSprint var2 = AutoSprint.method4403();
      if (var2 != null && var2.method4404()) {
         var1.setReturnValue(true);
      }
   }

   @Inject(
      method = {"sendMovementPackets"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preMotion(CallbackInfo var1) {
      Helper433 var2 = new Helper433(this.getX(), this.getY(), this.getZ(), this.getYaw(1.0F), this.getPitch(1.0F), this.isOnGround());
      Helper124.method1026(var2);
      if (var2.method581()) {
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
      Event13 var4 = new Event13(var2);
      Helper124.method1026(var4);
      double var5 = this.getX();
      double var7 = this.getZ();
      super.move(var1, var4.method3725());
      this.autoJump((float)(this.getX() - var5), (float)(this.getZ() - var7));
      var3.cancel();
   }

   @Inject(
      method = {"sendMovementPackets"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postMotion(CallbackInfo var1) {
      Helper373 var2 = new Helper373();
      Helper124.method1026(var2);
      Helper59.method655();
      if (var2.method581()) {
         var1.cancel();
      }
   }

   @Inject(
      method = {"pushOutOfBlocks"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void pushOutOfBlocks(double var1, double var3, CallbackInfo var5) {
      Helper369 var6 = new Helper369(Helper368.BLOCK);
      Helper124.method1026(var6);
      if (var6.method581()) {
         var5.cancel();
      }
   }

   @Inject(
      method = {"shouldStopSprinting"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z"
      )},
      cancellable = true
   )
   public void shouldStopSprintingHook(CallbackInfoReturnable<Boolean> var1) {
      if (AutoSprint.tickStop < 0) {
         if (AutoSprint.method4403().isState() && NoSlow.method2681().isState()) {
            var1.setReturnValue(false);
         }
      }
   }

   @Inject(
      method = {"canStartSprinting"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z"
      )},
      cancellable = true
   )
   public void canStartSprintingHook(CallbackInfoReturnable<Boolean> var1) {
      if (AutoSprint.method4403().isState() && NoSlow.method2681().isState()) {
         var1.setReturnValue(true);
      }
   }
}
