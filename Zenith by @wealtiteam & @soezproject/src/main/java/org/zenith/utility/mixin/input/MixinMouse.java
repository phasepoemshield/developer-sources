package org.zenith.utility.mixin.input;

import org.zenith.core.BlockPosEntry;
import org.zenith.core.CraftingExecutor;

import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.event.EventMouseButton;
import org.zenith.event.EventMouseScrollHook;
import org.zenith.event.EventTriggerKeyEvent;

import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.event.EventMouseButton;
import org.zenith.event.EventMouseScrollHook;
import org.zenith.event.EventTriggerKeyEvent;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.core.ClientProvider;
import org.zenith.core.DrawContextSink;













import com.darkmagician6.eventapi.EventManager;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Mouse.class})
public class MixinMouse {
   @Shadow
   public int field_1780;
   @Shadow
   public double field_1789;
   @Shadow
   public double field_1787;

   public MixinMouse() {
   }

   @Inject(
      method = {"onMouseButton"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onMouseButton(long var1, int var3, int var4, int var5, CallbackInfo var6) {
      if (var3 != -1 && var1 == ClientProvider.minecraftClient3.getWindow().getHandle()) {
         EventManager.call(new EventTriggerKeyEvent(var4, var3));
         EventMouseButton llilil1lill111 = new EventMouseButton(var3, var4);
         EventManager.call(llilil1lill111);
         if (llilil1lill111.isCancelled()) {
            var6.cancel();
         }
      }
   }

   @Inject(
      method = {"onMouseScroll"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getInventory()Lnet/minecraft/entity/player/PlayerInventory;"
      )},
      cancellable = true
   )
   public void onMouseScrollHook(long var1, double var3, double var5, CallbackInfo var7) {
      EventMouseScrollHook il11i1li1llll1i1111ll = new EventMouseScrollHook(var3, var5);
      EventManager.call(il11i1li1llll1i1111ll);
      if (il11i1li1llll1i1111ll.isCancelled()) {
         var7.cancel();
      }
   }

   @Redirect(
      method = {"tick"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Mouse;isCursorLocked()Z"
      )
   )
   public boolean onIsCursorLocked(Mouse var1) {
      return var1.isCursorLocked() || this.isAnim();
   }

   @WrapWithCondition(
      method = {"updateMouse"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;changeLookDirection(DD)V"
      )},
      require = 1,
      allow = 1
   )
   public boolean modifyMouseRotationInput(ClientPlayerEntity var1, double var2, double var4) {
      EventModifyMouseRotationInput i1il11ili = new EventModifyMouseRotationInput(var2, var4, this.field_1789, this.field_1787);
      EventManager.call(i1il11ili);
      if (i1il11ili.isCancelled()) {
         return false;
      } else {
         var1.changeLookDirection(i1il11ili.CraftingExecutor(), i1il11ili.BlockPosEntry());
         return false;
      }
   }

   @Unique
   public boolean isAnim() {
      if (MinecraftClient.getInstance().currentScreen instanceof DrawContextSink lll111ll1i1l11l1
         && lll111ll1i1l11l1.zenith_betterMinecraft_isClosingAnimation()) {
         return true;
      }

      return false;
   }
}
