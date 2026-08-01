package fat.releon.mixins.player.input;

import l.Helper124;
import l.ClickGui;
import l.Widget16;
import l.Helper302;
import l.Event17;
import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil.Type;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Keyboard.class})
public class KeyboardMixin {
   @Final
   @Shadow
   private MinecraftClient client;

   public KeyboardMixin() {
   }

   @Inject(
      method = {"onKey"},
      at = {@At("HEAD")}
   )
   private void onKey(long var1, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      if (var3 != -1 && var1 == this.client.getWindow().getHandle()) {
         int var8 = this.getClickGuiOpenKey();
         if (var5 == 0 && var3 == var8 && this.client.currentScreen == null) {
            Widget16.INSTANCE.method2889();
         }

         Helper124.method1026(new Event17(this.client.currentScreen, Type.KEYSYM, var3, var5));
      }
   }

   private int getClickGuiOpenKey() {
      try {
         int var1 = ClickGui.method2650().method2656();
         if (var1 != -1) {
            return var1;
         }
      } catch (Throwable var2) {
      }

      return Helper302.method2986();
   }
}
