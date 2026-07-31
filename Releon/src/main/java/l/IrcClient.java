package l;

import fat.releon.Releon;

public class IrcClient extends Helper242 {
   public IrcClient() {
      super("IrcClient", Helper269.MISC);
   }

   @Override
   public void setState(boolean var1) {
      super.setState(var1);
      if (var1) {
         this.activate();
      } else {
         this.deactivate();
      }
   }

   @Override
   public void activate() {
      Releon.method71().method68(true);
      Releon.method71().method36().method950();
   }

   @Override
   public void deactivate() {
      Releon.method71().method68(false);
      Releon.method71().method36().method951();
   }

   public void method3697(String var1) {
      if (!this.isState()) {
         Helper238.method2192("Модуль IrcClient выключен");
      } else {
         if (Releon.method71().method36().method949() != null && Releon.method71().method36().method949().isOpen()) {
            Releon.method71().method36().method949().method1443(var1);
         }
      }
   }
}
