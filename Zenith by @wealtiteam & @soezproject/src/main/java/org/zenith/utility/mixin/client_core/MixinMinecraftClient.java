package org.zenith.utility.mixin.client_core;

import org.zenith.core.ModuleStateStore;
import org.zenith.core.AutoCraftHelper;
import org.zenith.module.Module;

import org.zenith.module.NoInteract;
import org.zenith.module.ShaderESP;

import org.zenith.event.Event18Ext2;
import org.zenith.event.EventHookPacketProcess;
import org.zenith.event.EventHookPacketProcess2;
import org.zenith.event.EventHookTickEvent;
import org.zenith.event.EventInjectHandleInputEvents;
import org.zenith.event.EventMixin_modifySetScreenArg;
import org.zenith.event.PreventActionEvent;
import org.zenith.event.StopUsingItemEvent;
import org.zenith.event.RefreshCacheEvent;

import org.zenith.event.Event18Ext2;
import org.zenith.event.EventHookPacketProcess;
import org.zenith.event.EventHookPacketProcess2;
import org.zenith.event.EventHookTickEvent;
import org.zenith.event.EventInjectHandleInputEvents;
import org.zenith.event.EventMixin_modifySetScreenArg;
import org.zenith.module.NoInteract;
import org.zenith.ZenithClient;
import org.zenith.event.PreventActionEvent;
import org.zenith.module.ShaderESP;
import org.zenith.event.StopUsingItemEvent;
import org.zenith.util.TimerSpeed;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.event.RefreshCacheEvent;
import org.zenith.core.PermissionListCodec;















import com.darkmagician6.eventapi.EventManager;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter.Dynamic;
import net.minecraft.client.util.Window;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.util.ActionResult.Success;
import net.minecraft.util.ActionResult.SwingSource;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({MinecraftClient.class})
public abstract class MixinMinecraftClient {
   @Shadow
   @Final
   public Window field_1704;
   @Shadow
   @Nullable
   public ClientPlayerEntity field_1724;
   @Shadow
   @Nullable
   public ClientWorld field_1687;
   @Shadow
   @Nullable
   public ClientPlayerInteractionManager field_1761;
   @Shadow
   @Final
   public GameRenderer field_1773;
   @Shadow
   public int field_1752;
   @Shadow
   @Final
   public GameOptions field_1690;
   @Shadow
   @Nullable
   public Screen field_1755;
   @Shadow
   @Final
   public Dynamic field_52750;
   @Shadow
   public volatile boolean field_1734;
   @Unique
   public final Dynamic zenith_renderTickCounter = new Dynamic(40.0F, 0L, this::method_54785);

   public MixinMinecraftClient() {
   }

   @Shadow
   public abstract Window method_22683();

   @Shadow
   protected abstract void method_1583();

   @Shadow
   protected abstract boolean method_60647();

   @Shadow
   protected abstract float method_54785(float var1);

   @Inject(
      method = {"setScreen"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/MinecraftClient;currentScreen:Lnet/minecraft/client/gui/screen/Screen;",
         ordinal = 3,
         shift = Shift.AFTER
      )}
   )
   public void hook(Screen var1, CallbackInfo var2) {
      if (this.field_1755 instanceof TitleScreen) {
      }
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/MinecraftClient;runTasks()V",
         shift = Shift.BEFORE
      )}
   )
   public void hookPacketProcess(CallbackInfo var1) {
      EventManager.call(new EventHookPacketProcess());
      int i = this.zenith_renderTickCounter.beginRenderTick(Util.getMeasuringTimeMs(), true);

      for (int j = 0; j < Math.min(10, i); j++) {
         EventManager.call(new EventHookPacketProcess2());
      }
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/RenderTickCounter$Dynamic;setTickFrozen(Z)V",
         shift = Shift.AFTER
      )}
   )
   public void hookTickRender(CallbackInfo var1) {
      this.zenith_renderTickCounter.tick(this.field_1734);
      this.zenith_renderTickCounter.setTickFrozen(!this.method_60647());
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   public void hookTickEvent(CallbackInfo var1) {
      EventManager.call(new EventHookTickEvent());
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"close"}
   )
   public void stop(CallbackInfo var1) {
      ZenithClient.on23().shutdown();
   }

   @Inject(
      method = {"handleInputEvents"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void zenith_skipInputWithoutPlayer(CallbackInfo var1) {
      if (this.field_1724 == null || this.field_1761 == null) {
         var1.cancel();
      }
   }

   @Redirect(
      method = {"handleInputEvents"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayNetworkHandler;sendPacket(Lnet/minecraft/network/packet/Packet;)V",
         ordinal = 0
      )
   )
   public void injectHandleInputEventss(ClientPlayNetworkHandler var1, Packet var2) {
      PreventActionEvent lll11lil1illli11lili1ililiiiil = new PreventActionEvent();
      EventManager.call(lll11lil1illli11lili1ililiiiil);
      if (!lll11lil1illli11lili1ililiiiil.isCancelled()) {
         var1.sendPacket(var2);
      }
   }

   @Redirect(
      method = {"handleInputEvents"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerInteractionManager;stopUsingItem(Lnet/minecraft/entity/player/PlayerEntity;)V",
         ordinal = 0
      )
   )
   public void injectHandleInputEventsss(ClientPlayerInteractionManager var1, PlayerEntity var2) {
      StopUsingItemEvent lil1illiii1li = new StopUsingItemEvent();
      EventManager.call(lil1illiii1li);
      if (!lil1illiii1li.isCancelled()) {
         var1.stopUsingItem(var2);
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/MinecraftClient;overlay:Lnet/minecraft/client/gui/screen/Overlay;"
      )}
   )
   public void injectHandleInputEvents(CallbackInfo var1) {
      EventManager.call(new EventInjectHandleInputEvents());
      PreventActionEvent lll11lil1illli11lili1ililiiiil = new PreventActionEvent();
      EventManager.call(lll11lil1illli11lili1ililiiiil);
      if (!lll11lil1illli11lili1ililiiiil.isCancelled()) {
         RefreshCacheEvent lil11i1111lill1lill = new RefreshCacheEvent();
         EventManager.call(lil11i1111lill1lill);
      }
   }

   @ModifyReturnValue(
      method = {"getTargetMillisPerTick"},
      at = {@At("RETURN")}
   )
   public float zenith_applyTimerSpeed(float var1) {
      float f = TimerSpeed.float136();
      return f == 1.0F ? var1 : var1 / f;
   }

   @Inject(
      method = {"doItemUse"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/Hand;values()[Lnet/minecraft/util/Hand;"
      )},
      cancellable = true
   )
   public void doItemUseHook(CallbackInfo var1) {
      if (this.field_1724 != null && this.field_1761 != null) {
         PreventActionEvent lll11lil1illli11lili1ililiiiil = new PreventActionEvent();
         EventManager.call(lll11lil1illli11lili1ililiiiil);
         if (lll11lil1illli11lili1ililiiiil.isCancelled()) {
            var1.cancel();
         }

         if (NoInteract.noInteract.isEnabled()) {
            for (Hand hand : Hand.values()) {
               if (!this.field_1724.getStackInHand(hand).isEmpty()) {
                  ActionResult actionresult = this.field_1761.interactItem(this.field_1724, hand);
                  if (actionresult.isAccepted()) {
                     if (actionresult instanceof Success) {
                        Success success = (Success)actionresult;
                        if (success.swingSource().equals(SwingSource.CLIENT)) {
                           this.field_1724.swingHand(hand);
                        }
                     }

                     this.field_1773.firstPersonRenderer.resetEquipProgress(hand);
                     var1.cancel();
                  }
               }
            }
         }
      } else {
         var1.cancel();
      }
   }

   @Inject(
      method = {"handleInputEvents"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getInventory()Lnet/minecraft/entity/player/PlayerInventory;"
      )},
      cancellable = true
   )
   public void handleInputEventsHook(CallbackInfo var1) {
      Event18Ext2 ill1li1iii11i111iliil = new Event18Ext2();
      EventManager.call(ill1li1iii11i111iliil);
      if (ill1li1iii11i111iliil.isCancelled()) {
         var1.cancel();
      }
   }

   @Inject(
      method = {"onResolutionChanged"},
      at = {@At("TAIL")}
   )
   public void captureResize(CallbackInfo var1) {
      ZenithClient.on23().ModuleStateStore().executorService4();
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gl/Framebuffer;endWrite()V",
         shift = Shift.BEFORE
      )}
   )
   public void captureRessize(CallbackInfo var1) {
      ZenithClient.on23().ModuleStateStore().call266();
   }

   @ModifyVariable(
      method = {"setScreen(Lnet/minecraft/client/gui/screen/Screen;)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   public Screen mixin_modifySetScreenArg(Screen var1) {
      EventMixin_modifySetScreenArg llli1iilli1ii1 = new EventMixin_modifySetScreenArg(var1);
      EventManager.call(llli1iilli1ii1);
      return llli1iilli1ii1.AutoCraftHelper();
   }

   @Inject(
      method = {"hasOutline"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void zenith_shaderEspForceOutline(Entity var1, CallbackInfoReturnable<Boolean> var2) {
      ShaderESP lii1l1ili11ill1l1 = ShaderESP.shaderESP;
      if (lii1l1ili11ill1l1 != null && lii1l1ili11ill1l1.isEnabled() && var1 != null && !var1.isRemoved() && lii1l1ili11ill1l1.BotFeatureRegistry(var1)) {
         var2.setReturnValue(true);
      }
   }
}
