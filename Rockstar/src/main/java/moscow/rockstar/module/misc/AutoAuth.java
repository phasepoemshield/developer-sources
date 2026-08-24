package moscow.rockstar.module.misc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.network.ReceivePacketEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.StringSetting;
import moscow.rockstar.util.game.TextUtility;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
@ModuleInfo(name = "Auto Auth", category = ModuleCategory.OTHER, desc = "Автоматически регистрирует аккаунт на сервере")
public class AutoAuth extends BaseModule {
   private final BooleanSetting random = new BooleanSetting(this, "Рандом");
   private final StringSetting password = new StringSetting(this, "Пароль", this.random::isEnabled).text("123123");
   private final Map<String, String> nickAndPassword = new HashMap<>();
   private final EventListener<ReceivePacketEvent> onReceivePacketEvent = event -> {
      if (event.getPacket() instanceof GameMessageS2CPacket packet && mc.player != null) {
         String message = packet.content().getString().toLowerCase();
         String randomPass = TextUtility.getRandomNick();
         String password = this.random.isEnabled() ? randomPass : this.password.getText();
         this.nickAndPassword.put(mc.player.getDisplayName().getString(), " " + randomPass);
         if (!message.contains("зарегистрируйтесь") && !message.contains("/reg")) {
            if (message.contains("авторизуйтесь") || message.contains("/login") || message.contains("/l") && message.matches("/l(\\s|$)")) {
               mc.player.networkHandler.sendChatCommand(String.format("l %s", password));
            }
         } else {
            mc.player.networkHandler.sendChatCommand(String.format("reg %s %s", password, password));
         }
      }
   };

   public Map<String, String> listPassword() {
      return Collections.unmodifiableMap(this.nickAndPassword);
   }

   public void put(String key, String value) {
      this.nickAndPassword.put(key, value);
   }
}
