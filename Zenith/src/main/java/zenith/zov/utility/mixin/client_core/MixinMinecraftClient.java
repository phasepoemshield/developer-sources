package zenith.zov.utility.mixin.client_core;

import zenith.hud.*;

import net.minecraft.client.util.Window;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.entity.Entity;
import net.minecraft.util.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.util.ActionResult.IronGolemFlowerFeatureRenderer0;
import net.minecraft.util.ActionResult.IronGolemFlowerFeatureRenderer1;
import net.minecraft.client.render.RenderTickCounter.Deadmau5FeatureRenderer1;
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
import zenith.EventImpl_2;
import zenith.ZenithClient;
import zenith.ZenithInternal055;
import zenith.ZenithInternal062;
import zenith.EventImpl_15;
import zenith.EventImpl_16;
import zenith.EventImpl_17;
import zenith.ZenithInternal076;
import zenith.EventBus;
import zenith.Nointeract;
import zenith.ZenithInternal111;
import zenith.Event;
import zenith.ZenithInternal125;
import zenith.Shaderesp;
import zenith.EventImpl_36;

@Mixin({MinecraftClient.class})
public abstract class MixinMinecraftClient {
   @Shadow
   @Final
   private Window window;
   @Shadow
   @Nullable
   public ClientPlayerEntity player;
   @Shadow
   @Nullable
   public ClientPlayerInteractionManager interactionManager;
   @Shadow
   @Final
   public GameRenderer gameRenderer;
   @Shadow
   public int itemUseCooldown;
   @Shadow
   @Final
   public GameOptions options;
   @Shadow
   @Nullable
   public Screen currentScreen;
   @Shadow
   @Final
   private Deadmau5FeatureRenderer1 renderTickCounter;
   @Shadow
   private volatile boolean paused;
   @Unique
   private final Deadmau5FeatureRenderer1 zenith$renderTickCounter = new Deadmau5FeatureRenderer1(40.0F, 0L, this::getTargetMillisPerTick);

   @Shadow
   public abstract Window getWindow();

   @Shadow
   protected abstract void doItemUse();

   @Shadow
   protected abstract boolean shouldTick();

   @Shadow
   protected abstract float getTargetMillisPerTick(float f);

   @Inject(
      method = {"setScreen"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/MinecraftClient;currentScreen:Lnet/minecraft/client/gui/screen/Screen;",
         ordinal = 3,
         shift = Shift.AFTER
      )}
   )
   private void hook(Screen Screen, CallbackInfo callbackinfo) {
      if (this.currentScreen instanceof TitleScreen) {
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
   private void hookPacketProcess(CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EventImpl_17()));
      int i = this.zenith$renderTickCounter.beginRenderTick(Util.getMeasuringTimeMs(), true);

      for (int j = 0; j < Math.min(10, i); j++) {
         EventBus.StringHolder_8((Event)(new EventImpl_15()));
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
   private void hookTickRender(CallbackInfo callbackinfo) {
      this.zenith$renderTickCounter.tick(this.paused);
      this.zenith$renderTickCounter.setTickFrozen(!this.shouldTick());
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void hookTickEvent(CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EventImpl_2()));
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"close"}
   )
   private void stop(CallbackInfo callbackinfo) {
      ZenithClient.getInstance().shutdown();
   }

   @Redirect(
      method = {"handleInputEvents"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayNetworkHandler;sendPacket(Lnet/minecraft/network/packet/Packet;)V",
         ordinal = 0
      )
   )
   public void injectHandleInputEventss(ClientPlayNetworkHandler ClientPlayNetworkHandler, Packet Packet) {
      ZenithInternal055 il1ii11111lil1l1llllllli11i = new ZenithInternal055();
      EventBus.StringHolder_8((Event)il1ii11111lil1l1llllllli11i);
      if (!il1ii11111lil1l1llllllli11i.Event()) {
         ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendPacket(Packet);
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
   public void injectHandleInputEventsss(ClientPlayerInteractionManager ClientPlayerInteractionManager, PlayerEntity PlayerEntity) {
      ZenithInternal062 ilii1111lllilllilllii = new ZenithInternal062();
      EventBus.StringHolder_8((Event)ilii1111lllilllilllii);
      if (!ilii1111lllilllilllii.Event()) {
         ClientPlayerInteractionManager.stopUsingItem(PlayerEntity);
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/MinecraftClient;overlay:Lnet/minecraft/client/gui/screen/Overlay;"
      )}
   )
   public void injectHandleInputEvents(CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EventImpl_16()));
      ZenithInternal055 il1ii11111lil1l1llllllli11i = new ZenithInternal055();
      EventBus.StringHolder_8((Event)il1ii11111lil1l1llllllli11i);
      if (!il1ii11111lil1l1llllllli11i.Event()) {
         ZenithInternal111 lii11l11i1lil11ii11ii1il1lll = new ZenithInternal111();
         EventBus.StringHolder_8((Event)lii11l11i1lil11ii11ii1il1lll);
      }
   }

   @Inject(
      method = {"doItemUse"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/Hand;values()[Lnet/minecraft/util/Hand;"
      )},
      cancellable = true
   )
   public void doItemUseHook(CallbackInfo callbackinfo) {
      ZenithInternal055 il1ii11111lil1l1llllllli11i = new ZenithInternal055();
      EventBus.StringHolder_8((Event)il1ii11111lil1l1llllllli11i);
      if (il1ii11111lil1l1llllllli11i.Event()) {
         callbackinfo.cancel();
      }

      if (Nointeract.lIII11IIl1lIII1l11IIl.Spider()) {
         for (Hand Hand : Hand.values()) {
            if (!this.player.getStackInHand(Hand).isEmpty()) {
               ActionResult ActionResult = this.interactionManager.interactItem(this.player, Hand);
               if (ActionResult.isAccepted()) {
                  if (ActionResult instanceof IronGolemFlowerFeatureRenderer0) {
                     IronGolemFlowerFeatureRenderer0 IronGolemFlowerFeatureRenderer0 = (IronGolemFlowerFeatureRenderer0)ActionResult;
                     if (IronGolemFlowerFeatureRenderer0.swingSource().equals(IronGolemFlowerFeatureRenderer1.CLIENT)) {
                        this.player.swingHand(Hand);
                     }
                  }

                  this.gameRenderer.firstPersonRenderer.resetEquipProgress(Hand);
                  callbackinfo.cancel();
               }
            }
         }
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
   public void handleInputEventsHook(CallbackInfo callbackinfo) {
      ZenithInternal125 lilii1lililli1liil1iiiill1l = new ZenithInternal125();
      EventBus.StringHolder_8((Event)lilii1lililli1liil1iiiill1l);
      if (lilii1lililli1liil1iiiill1l.Event()) {
         callbackinfo.cancel();
      }
   }

   @Inject(
      method = {"onResolutionChanged"},
      at = {@At("TAIL")}
   )
   private void captureResize(CallbackInfo callbackinfo) {
      ZenithClient.getInstance().GetDisplayNameHandler().Ill111IlIll1l1l1l1l1l();
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gl/Framebuffer;endWrite()V",
         shift = Shift.BEFORE
      )}
   )
   private void captureRessize(CallbackInfo callbackinfo) {
      ZenithClient.getInstance().GetDisplayNameHandler().lll11III11l1lIl1I11lII11Il();
   }

   @ModifyVariable(
      method = {"setScreen(Lnet/minecraft/client/gui/screen/Screen;)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private Screen mixin$modifySetScreenArg(Screen Screen) {
      EventImpl_36 lllil11lil1l1l1l1 = new EventImpl_36(Screen);
      EventBus.StringHolder_8((Event)lllil11lil1l1l1l1);
      Screen result = lllil11lil1l1l1l1.Nopush();
      if (result instanceof TitleScreen) {
         return ZenithClient.getInstance().LoggerHolder();
      }
      return result;
   }

   @Inject(
      method = {"hasOutline"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void zenith$shaderEspForceOutline(Entity Entity, CallbackInfoReturnable<Boolean> callbackinforeturnable) {
      Shaderesp ll1i1illiii111l1llliill = Shaderesp.IIlIII1I1Il1I111IlIl1lII;
      if (ll1i1illiii111l1llliill != null
         && ll1i1illiii111l1llliill.Spider()
         && Entity != null
         && !Entity.isRemoved()
         && ll1i1illiii111l1llliill.ZenithInternal042(Entity)) {
         callbackinforeturnable.setReturnValue(true);
      }
   }
}
