package zenith.zov.utility.mixin.screen;

import net.minecraft.text.Text;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.ZenithInternal076;

@Mixin({ChatScreen.class})
public class MixinChatScreen extends Screen implements ZenithInternal076 {
   protected MixinChatScreen(Text Text) {
      super(Text);
   }

   @Inject(
      method = {"sendMessage(Ljava/lang/String;Z)V"},
      at = {@At("HEAD")},
      cancellable = false
   )
   private void onSendMessage(String s, boolean flag, CallbackInfo callbackinfo) {
   }
}
