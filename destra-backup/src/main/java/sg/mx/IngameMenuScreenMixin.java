package sg.mx;

import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.screen.MessageScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.realms.gui.screen.RealmsMainScreen;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.gui.CustomServerListScreen;
import ru.destra.misc.BossBarParser;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(GameMenuScreen.class)
public class IngameMenuScreenMixin extends Screen {
   private static final String IН;
   private static final String Iа;
   private static final String II;

   protected IngameMenuScreenMixin(Text var1) {
      super(var1);
   }

   @Inject(method = "disconnect", at = @At("HEAD"), cancellable = true)
   private void modifyExitButton(CallbackInfo var1) {
      var1.cancel();
      if (DestraClient.getInstance().getModuleManager().ktSafe.Д() && BossBarParser.isInPvp()) {
         this.client.setScreen(new ConfirmScreen(var1x -> {
            if (var1x) {
               this.executeExitLogic();
            } else {
               this.client.setScreen(this);
            }
         }, Text.literal(IН), Text.literal(Iа)));
      } else {
         this.executeExitLogic();
      }
   }

   private void executeExitLogic() {
      boolean var1 = this.client.isInSingleplayer();
      ServerInfo var2 = this.client.getCurrentServerEntry();
      this.client.world.disconnect();
      if (var1) {
         this.client.disconnect(new MessageScreen(Text.translatable(II)));
      } else {
         this.client.disconnect();
      }

      TitleScreen var3 = new TitleScreen();
      if (var1) {
         this.client.setScreen(var3);
      } else if (var2 != null && var2.isRealm()) {
         this.client.setScreen(new RealmsMainScreen(var3));
      } else if (DestraClient.mainMenuShown) {
         this.client.setScreen(new MultiplayerScreen(var3));
      } else {
         this.client.setScreen(new CustomServerListScreen(var3));
      }
   }

   static {
      VMBridge.identifyClass(IngameMenuScreenMixin.class, "uPArex1B");
   }
}
