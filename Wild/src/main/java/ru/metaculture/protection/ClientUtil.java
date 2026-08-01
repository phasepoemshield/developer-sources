package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ClientUtil",
   O0000000000 = Category.Misc,
   O000000000 = "Настройки для клиента"
)
public class ClientUtil extends Module {
   public static final BooleanSetting O000000000O = new BooleanSetting("Уведомления в Telegram", true);
   public static final BooleanSetting O000000000O0 = new BooleanSetting("Звуки клиента", true);
   public static GroupSetting O000000000O00 = new GroupSetting(
      "Звуки", new BooleanSetting("Модули", true), new BooleanSetting("Уведомления", true).O00000000(() -> !O000000000O0.O0000000000())
   );
   public static NumberSetting O000000000O000 = new NumberSetting("Громкость", 100.0F, 10.0F, 100.0F, 1.0F, false).O00000000(() -> !O000000000O0.O0000000000());

   public ClientUtil() {
      this.O00000000(new Setting[]{O000000000O, O000000000O0, O000000000O00, O000000000O000});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O000000000O.O0000000000() && !O0000000OO0O00.O00000000()) {
         ChatUtil.O00000000("§cСписок пуст для отправки сообщений. Настройте API через .tapi");
         O000000000O.O000000000(false);
      }
   }
}
