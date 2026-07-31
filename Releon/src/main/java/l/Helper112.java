package l;

import antidaunleak.api.annotation.Native;
import fat.releon.Releon;
import java.net.URI;
import java.util.concurrent.atomic.AtomicBoolean;

public class Helper112 {
   NetClient2 client;
   final AtomicBoolean isConnecting = new AtomicBoolean(false);

   public Helper112() {
   }

   public NetClient2 method949() {
      return this.client;
   }

   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   public void method950() {
      if (!this.isConnecting.get()) {
         try {
            this.isConnecting.set(true);
            if (this.client != null && !this.client.isClosed()) {
               this.client.close();
            }

            this.client = new NetClient2(new URI("ws://82.114.226.148:8081"));
            this.client.connect();
         } catch (Exception var2) {
            if (Releon.method71().method40()) {
               Helper238.method2192("Не удалось подключиться к серверу IrcClient");
            }

            this.isConnecting.set(false);
         }
      }
   }

   public void method951() {
      if (this.client != null) {
         this.client.close();
         this.client = null;
      }

      this.isConnecting.set(false);
   }

   public void method952(String var1, String var2) {
      String var3 = (var2 != null && !var2.isEmpty() ? var2 + ": " : "") + var1;
      if (this.client != null && this.client.isOpen()) {
         this.client.method1443(var3);
         if (Releon.method71().method40()) {
            Helper238.method2190(var3);
         }
      } else if (Releon.method71().method40()) {
         Helper238.method2192("Нет подключения к IrcClient — сообщение не отправлено: " + var3);
      }
   }
}
