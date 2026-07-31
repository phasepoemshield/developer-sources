package fat.releon.mixins.client.display.title;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MinecraftClient.class})
public class TitleScreenMixin {
   public TitleScreenMixin() {
   }

   @Inject(
      method = {"setScreen"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void replaceTitleScreen(Screen var1, CallbackInfo var2) {
      if (!this.rich$isSelfDestructUnhookedTitle()) {
         MinecraftClient var3 = (MinecraftClient)(Object)this;
         if (var1 instanceof TitleScreen) {
            Screen var4 = this.createCustomMainMenu();
            if (var4 != null) {
               var3.setScreen(var4);
               var2.cancel();
            }
         }
      }
   }

   private Screen createCustomMainMenu() {
      try {
         Class var1 = Class.forName("l.雨山");
         if (Screen.class.isAssignableFrom(var1)) {
            return (Screen)var1.getDeclaredConstructor().newInstance();
         }
      } catch (Throwable var2) {
      }

      return null;
   }

   private boolean rich$isSelfDestructUnhookedTitle() {
      try {
         Class var1 = Class.forName("l.雨小");
         return var1.getField("unhooked").getBoolean(null);
      } catch (Throwable var2) {
         return false;
      }
   }
}
