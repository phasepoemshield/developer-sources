package l;

import antidaunleak.api.UserProfile;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fat.releon.Releon;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

public class NetClient2 extends WebSocketClient {
   private boolean isMuted = false;
   private final String clientId = UserProfile.getInstance().profile("uid");
   private final Set<String> processedMessages = new HashSet<>();

   public boolean method1440() {
      return this.isMuted;
   }

   public NetClient2(URI var1) {
      super(var1);
      this.addHeader("Sec-WebSocket-Key", this.clientId);
   }

   public void onOpen(ServerHandshake var1) {
      System.out.println("[IrcClient] Connected to " + this.getURI());
      this.method1445();
      Releon.method71().method36().isConnecting.set(false);
   }

   public void onMessage(String var1) {
      System.out.println("[IrcClient raw] " + var1);
      String var2 = this.method1446(var1);
      System.out.println("[IrcClient decoded] " + var2);
      this.method1441(var2);
   }

   private void method1441(String var1) {
      try {
         JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
         if (!var2.has("type")) {
            return;
         }

         String var3 = var2.get("type").getAsString();
         if (var3.equals("text")) {
            if (!var2.has("message") || !var2.has("author")) {
               return;
            }

            String var12 = var2.get("author").getAsString();
            String var13 = var2.get("message").getAsString();
            String var14 = var2.has("prefix") ? var2.get("prefix").getAsString() : "";
            if (Releon.method71().method40()) {
               this.method1442(var14, var12, var13);
            }
         } else if (var3.equals("mute") || var3.equals("mute_attempt")) {
            this.isMuted = true;
            if (Releon.method71().method40() && var2.has("reason") && var2.has("duration_minutes")) {
               String var11 = var2.get("reason").getAsString();
               int var5 = var2.get("duration_minutes").getAsInt();

               String var6 = switch (var11) {
                  case "Спам" -> "спам";
                  case "Мат" -> "мат";
                  case "Капс" -> "злоупотребление капсом или символами";
                  default -> "отправку ссылок";
               };
               Helper238.method2192("Вы замучены за " + var6 + " на " + var5 + " минут!");
            }
         } else if (var3.equals("unmute")) {
            this.isMuted = false;
            if (Releon.method71().method40()) {
               Helper238.method2191("Вы размучены!");
            }
         } else if (!var3.equals("prefix_info") && !var3.equals("prefix_updated")) {
            if (var3.equals("system")) {
               if (!var2.has("message")) {
                  return;
               }

               String var10 = var2.get("message").getAsString();
               if (Releon.method71().method40()) {
                  Helper238.method2190(var10);
               }
            }
         } else {
            if (!var2.has("prefix")) {
               return;
            }

            String var4 = var2.get("prefix").getAsString();
            Irc.method3087(var4.isEmpty() ? null : var4);
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }

   private void method1442(String var1, String var2, String var3) {
      if (MinecraftClient.getInstance().player != null && Releon.method71().method40()) {
         Object var4 = switch (var1) {
            case "propen" -> Helper238.method2195(var2 + " ");
            case "panfa" -> Helper238.method2198(var2 + " ");
            case "boost" -> Helper238.method2196(var2 + " ");
            case "TikTok" -> Helper238.method2197(var2 + " ");
            case "Admin" -> Helper238.method2193(var2 + " ");
            default -> Text.literal(var2 + " ").setStyle(Style.EMPTY.withColor(Formatting.WHITE));
         };
         Text var5 = Helper37.method513("[IrcClient] ", "black_light_purple", true);
         MutableText var9 = Text.literal("→ ").setStyle(Style.EMPTY.withColor(Formatting.GRAY));
         MutableText var7 = Text.literal(var3).setStyle(Style.EMPTY.withColor(Formatting.WHITE));
         MutableText var8 = var5.copy().append((Text)var4).append(var9).append(var7);
         MinecraftClient.getInstance().player.sendMessage(var8, false);
      }
   }

   public void onClose(int var1, String var2, boolean var3) {
      System.out.println("[IrcClient] Closed: " + var1 + " / " + var2 + " / remote=" + var3);
      Releon.method71().method36().isConnecting.set(false);
   }

   public void onError(Exception var1) {
      var1.printStackTrace();
      if (Releon.method71().method40()) {
         Helper238.method2192("Ошибка подключения к IrcClient");
      }

      Releon.method71().method36().isConnecting.set(false);
   }

   public void method1443(String var1) {
      if (!this.isOpen()) {
         System.out.println("[IrcClient] sendMessage called while socket not open");
      } else if (this.isMuted) {
         if (Releon.method71().method40()) {
            Helper238.method2192("Вы замучены и не можете отправлять сообщения");
         }
      } else {
         String var2 = MinecraftClient.getInstance().getSession().getUsername();
         String var3 = Irc.method3081();
         JsonObject var4 = new JsonObject();
         var4.addProperty("type", "text");
         var4.addProperty("message", var1);
         var4.addProperty("author", var2);
         var4.addProperty("clientId", this.clientId);
         var4.addProperty("prefix", var3 == null ? "" : var3);
         String var5 = this.method1446(var4.toString());
         System.out.println("[IrcClient] send encoded: " + var5);
         this.send(var5);
      }
   }

   public void method1444(String var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("type", "set_prefix");
      var2.addProperty("new_prefix", var1);
      var2.addProperty("clientId", this.clientId);
      var2.addProperty("author", UserProfile.getInstance().profile("username"));
      this.send(this.method1446(var2.toString()));
   }

   private void method1445() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("type", "get_prefix");
      var1.addProperty("clientId", this.clientId);
      this.send(this.method1446(var1.toString()));
   }

   private String method1446(String var1) {
      byte[] var2 = var1.getBytes(StandardCharsets.UTF_8);

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = (byte)(var2[var3] ^ 21);
      }

      return new String(var2, StandardCharsets.UTF_8);
   }
}
