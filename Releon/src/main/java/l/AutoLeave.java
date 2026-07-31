package l;

import net.minecraft.text.Text;

public class AutoLeave extends Helper242 {
   private final Setting5 leaveType = new Setting5("Тип выхода", "Позволяет выбрать тип выхода").method2381("Hub", "Main Menu").method2383("Main Menu");
   private final Setting8 triggerSetting = new Setting8("Триггеры", "Выберите, в каких случаях произойдет выход")
      .method2585("Players", "Staff")
      .method2586("Players", "Staff");
   private final Setting2 distanceSetting = new Setting2("Максимальная дистанция", "Максимальная дистанция для активации авто-выхода")
      .method2086(10.0F)
      .method2079(5, 40)
      .method2081(() -> this.triggerSetting.method2588("Players"));

   public AutoLeave() {
      super("AutoLeave", "Auto Leave", Helper269.MISC);
      this.setup(new Helper264[]{this.leaveType, this.triggerSetting, this.distanceSetting});
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (!Helper128.method1047()) {
         if (this.triggerSetting.method2588("Players")) {
            mc.world
               .getPlayers()
               .stream()
               .filter(var1x -> mc.player.distanceTo(var1x) < this.distanceSetting.method2082() && mc.player != var1x && !Helper309.method3075(var1x))
               .findFirst()
               .ifPresent(var1x -> this.method4587(var1x.getName().copy().append(" - Появился рядом " + mc.player.distanceTo(var1x) + "м")));
         }

         if (this.triggerSetting.method2588("Staff") && !StaffList.method4926().list.isEmpty()) {
            this.method4587(Text.of("Стафф на сервере"));
         }
      }
   }

   public void method4587(Text var1) {
      String var2 = this.leaveType.method2386();
      switch (var2) {
         case "Hub":
            Notifications.method1666().method1669(Text.of("[AutoLeave] ").copy().append(var1), 10000L);
            mc.getNetworkHandler().sendChatCommand("hub");
            break;
         case "Main Menu":
            mc.getNetworkHandler().getConnection().disconnect(Text.of("[Auto Leave] \n").copy().append(var1));
      }

      this.setState(false);
   }
}
