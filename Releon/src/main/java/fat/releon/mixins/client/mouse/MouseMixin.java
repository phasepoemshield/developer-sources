package fat.releon.mixins.client.mouse;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import l.Helper124;
import l.AutoBuy;
import l.Helper384;
import l.Event17;
import l.Helper428;
import l.Helper437;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.InputUtil.Type;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Mouse.class})
public class MouseMixin {
   @Final
   @Shadow
   private MinecraftClient client;
   @Shadow
   public double cursorDeltaX;
   @Shadow
   public double cursorDeltaY;

   public MouseMixin() {
   }

   @Inject(
      method = {"onMouseButton"},
      at = {@At("HEAD")}
   )
   public void onMouseButtonHook(long var1, int var3, int var4, int var5, CallbackInfo var6) {
      if (var3 != -1 && var1 == this.client.getWindow().getHandle()) {
         Helper124.method1026(new Event17(this.client.currentScreen, Type.MOUSE, var3, var4));
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
      if (AutoBuy.method3835(var5)) {
         var7.cancel();
      } else {
         Helper428 var8 = new Helper428(var3, var5);
         Helper124.method1026(var8);
         if (var8.method581()) {
            var7.cancel();
         }
      }
   }

   @Inject(
      method = {"updateMouse"},
      at = {@At("HEAD")}
   )
   private void onUpdateMouse(double var1, CallbackInfo var3) {
      Helper437 var4 = new Helper437();
      Helper124.method1026(var4);
      if (var4.method581()) {
         double var5 = (double)var4.method4551() / this.client.options.getFov().getValue().intValue();
         this.cursorDeltaX *= var5;
         this.cursorDeltaY *= var5;
      }
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
   private boolean modifyMouseRotationInput(ClientPlayerEntity var1, double var2, double var4) {
      Helper384 var6 = new Helper384((float)var2, (float)var4);
      Helper124.method1026(var6);
      if (var6.method581()) {
         return false;
      } else {
         var1.changeLookDirection(var6.method3889(), var6.method3890());
         return false;
      }
   }
}
