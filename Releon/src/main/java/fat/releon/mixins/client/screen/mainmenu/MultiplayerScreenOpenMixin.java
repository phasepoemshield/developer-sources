package fat.releon.mixins.client.screen.mainmenu;

import fat.releon.mixins.client.screen.IScreen;
import l.Helper16;
import l.Helper301;
import l.Helper29;
import l.Widget15;
import l.SelfDestruct;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MultiplayerScreen.class})
public class MultiplayerScreenOpenMixin {
   public MultiplayerScreenOpenMixin() {
   }

   @Inject(
      method = {"init()V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerScreen;updateButtonActivationStates()V"
      )}
   )
   public void multiplayerGuiOpen(CallbackInfo var1) {
      if (!SelfDestruct.unhooked) {
         String var2 = MinecraftClient.getInstance().getSession().getUsername();
         if (!var2.equals(Helper16.lastPlayerName)) {
            Helper16.lastPlayerName = var2;
            if (Helper16.accounts.containsKey(var2)) {
               Helper301.proxy = Helper16.accounts.get(var2);
            } else if (Helper16.accounts.containsKey("")) {
               Helper301.proxy = Helper16.accounts.get("");
            } else {
               Helper301.proxy = new Helper29();
            }
         }

         MultiplayerScreen var3 = (MultiplayerScreen)(Object)this;
         MinecraftClient var4 = MinecraftClient.getInstance();
         int var5 = var4.getWindow().getScaledWidth();
         String var6;
         if (Helper301.proxyEnabled && Helper301.proxy != null && !Helper301.proxy.ipPort.isEmpty()) {
            var6 = "Прокси: Активен";
         } else {
            var6 = "Proxy";
         }

         Helper301.proxyMenuButton = ButtonWidget.builder(Text.literal(var6), var1x -> MinecraftClient.getInstance().setScreen(new Widget15(var3)))
            .dimensions(5, 5, 100, 20)
            .build();
         IScreen var7 = (IScreen)var3;
         var7.getDrawables().add(Helper301.proxyMenuButton);
         var7.getSelectables().add(Helper301.proxyMenuButton);
         var7.getChildren().add(Helper301.proxyMenuButton);
      }
   }
}
