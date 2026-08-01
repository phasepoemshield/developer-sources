package zenith.zov.utility.mixin.input;

import zenith.hud.*;

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
import zenith.KeyEvent;
import zenith.doubleHolder_2;
import zenith.ZenithInternal076;
import zenith.EventBus;
import zenith.ZenithInternal090;
import zenith.Event;
import zenith.ZenithInternal135;
import zenith.EventImpl_38;

@Mixin({Mouse.class})
public class MixinMouse {
   @Shadow
   private int activeButton;
   @Shadow
   private double cursorDeltaX;
   @Shadow
   private double cursorDeltaY;

   @Inject(
      method = {"onMouseButton"},
      at = {@At("HEAD")}
   )
   private void onMouseButton(long i, int j, int k, int l, CallbackInfo callbackinfo) {
      if (j != -1 && i == ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.getWindow().getHandle()) {
         EventBus.StringHolder_8((Event)(new KeyEvent(k, j)));
         EventBus.StringHolder_8((Event)(new EventImpl_38(j, k)));
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
   public void onMouseScrollHook(long i, double d0, double d1, CallbackInfo callbackinfo) {
      doubleHolder_2 illli1l1llii1ii1ii1llllii1i1l = new doubleHolder_2(d0, d1);
      EventBus.StringHolder_8((Event)illli1l1llii1ii1ii1llllii1i1l);
      if (illli1l1llii1ii1ii1llllii1i1l.Event()) {
         callbackinfo.cancel();
      }
   }

   @Redirect(
      method = {"tick"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Mouse;isCursorLocked()Z"
      )
   )
   public boolean onIsCursorLocked(Mouse Mouse) {
      return Mouse.isCursorLocked() || this.isAnim();
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
   private boolean modifyMouseRotationInput(ClientPlayerEntity ClientPlayerEntity, double d0, double d1) {
      ZenithInternal090 l1l11ii1iiillilll = new ZenithInternal090(d0, d1, this.cursorDeltaX, this.cursorDeltaY);
      EventBus.StringHolder_8((Event)l1l11ii1iiillilll);
      if (l1l11ii1iiillilll.Event()) {
         return false;
      } else {
         ClientPlayerEntity.changeLookDirection(l1l11ii1iiillilll.Castlefly(), l1l11ii1iiillilll.GrimGlide());
         return false;
      }
   }

   @Unique
   private boolean isAnim() {
      if (MinecraftClient.getInstance().currentScreen instanceof ZenithInternal135 ll11il11il1lilii1iliilil
         && ll11il11il1lilii1iliilil.zenith$betterMinecraft$isClosingAnimation()) {
         return true;
      }

      return false;
   }
}
