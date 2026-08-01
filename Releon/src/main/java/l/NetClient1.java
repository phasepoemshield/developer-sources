package l;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

public class NetClient1 extends WebSocketClient {
   private JsonObject config = new JsonObject();
   private long lastWarningTime = 0L;
   private static final long WARNING_INTERVAL = 5000L;
   private boolean connected = false;

   public NetClient1(URI var1) {
      super(var1);
      this.setConnectionLostTimeout(10);
   }

   public void onOpen(ServerHandshake var1) {
      this.connected = true;

      try {
         this.send("{\"type\":\"getConfig\"}");
      } catch (Exception var3) {
      }
   }

   public void onMessage(String var1) {
      try {
         JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
         if (var2.has("type") && var2.get("type").getAsString().equals("config")) {
            this.config = var2.getAsJsonObject("data");
         }
      } catch (Exception var3) {
      }
   }

   public void onClose(int var1, String var2, boolean var3) {
      this.connected = false;
   }

   public void onError(Exception var1) {
      this.connected = false;
   }

   public boolean method929() {
      return this.connected && this.isOpen();
   }

   public boolean method930() {
      if (!this.method929()) {
         return false;
      } else {
         try {
            return this.config.has("ftfixed") && this.config.get("ftfixed").getAsBoolean();
         } catch (Exception var2) {
            return false;
         }
      }
   }

   public void method931() {
      if (this.method929()) {
         MinecraftClient var1 = MinecraftClient.getInstance();
         if (var1.player != null) {
            long var2 = System.currentTimeMillis();
            if (var2 - this.lastWarningTime >= 5000L) {
               try {
                  if (this.method930()) {
                     MutableText var4 = Helper238.method2182();
                     MutableText var5 = Text.literal(
                        " » Funtime исправил Киллауру. Не играйте с ней, иначе вас забанят! Мы уже усердно делаем новую — ожидайте."
                     );
                     var1.player.sendMessage(var4.copy().append(var5), false);
                     this.lastWarningTime = var2;
                  }
               } catch (Exception var6) {
               }
            }
         }
      }
   }
}
