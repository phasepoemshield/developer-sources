package org.zenith.utility.mixin.screen;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.ClientProvider;













import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ChatScreen.class})
public class MixinChatScreen extends Screen implements ClientProvider {
   protected MixinChatScreen(Text var1) {
      super(var1);
   }

   @Inject(
      method = {"sendMessage(Ljava/lang/String;Z)V"},
      at = {@At("HEAD")},
      cancellable = false
   )
   public void onSendMessage(String var1, boolean var2, CallbackInfo var3) {
   }
}
