package ru.metaculture.protection;

import java.awt.Color;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.MinecraftClient;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.json.JSONObject;
import ru.metaculture.sdk.Loader;

public class IrcWebSocketClient extends WebSocketClient {
   public static IrcWebSocketClient O00000000;
   private static String O000000000000O = "";
   private static volatile boolean O00000000000O;
   private static volatile Thread O00000000000O0;
   private static final Map<String, String> O00000000000OO = new HashMap<>();
   public static final Map<String, String> O000000000 = new ConcurrentHashMap<>();
   public static final Map<String, IrcWebSocketClient.W355> O0000000000 = new ConcurrentHashMap<>();
   public static final Map<String, IrcWebSocketClient.W356> O00000000000 = new ConcurrentHashMap<>();
   public static final Map<String, Integer> O000000000000 = new ConcurrentHashMap<>();
   public static final Map<String, Long> O0000000000000 = new ConcurrentHashMap<>();
   private static String O0000000000O = null;

   public static String O00000000() {
      return "prota_$crashdammi1337";
   }

   public IrcWebSocketClient(URI uRI) {
      super(uRI);
      O00000000000O = false;
      O00000000 = this;
   }

   public static void O000000000() {
      O00000000000O = true;
      Thread var0 = O00000000000O0;
      O00000000000O0 = null;
      if (var0 != null) {
         var0.interrupt();
      }

      IrcWebSocketClient var1 = O00000000;
      O00000000 = null;
      O000000000000O = "";
      if (var1 != null) {
         try {
            var1.closeBlocking();
         } catch (InterruptedException var3) {
            Thread.currentThread().interrupt();
         } catch (Throwable var4) {
         }
      }
   }

   public void onOpen(ServerHandshake serverHandshake) {
      System.out.println("[IRC] Успешно подключено к серверу! Ждем проверку...");
      O00000000(() -> {
         if (MinecraftAccessor.a_.player != null) {
            MinecraftAccessor.a_.player.sendMessage(Text.literal("§a[IRC] Соединение установлено, проверка..."), false);
         }
      });
   }

   public void O0000000000() {
      if (this.isOpen() && MinecraftAccessor.a_.getSession() != null) {
         String var1 = MinecraftAccessor.a_.getSession().getUsername();
         if (!var1.equals(O000000000000O)) {
            O000000000000O = var1;

            try {
               JSONObject var2 = new JSONObject();
               var2.put("type", "handshake");
               var2.put("user", var1);
               var2.put(
                  "client", WildClient.O00000000 != null && WildClient.O00000000.O0000000000O() != null ? WildClient.O00000000.O0000000000O() : "LitkaFree"
               );
               this.send(var2.toString());
            } catch (Exception var3) {
            }
         }
      }
   }

   public void O00000000(double d, double e, double f, String string, float g, String string2, boolean bl) {
      if (this.isOpen() && MinecraftAccessor.a_.getSession() != null) {
         try {
            JSONObject var11 = new JSONObject();
            var11.put("type", "pos_sync");
            var11.put("user", MinecraftAccessor.a_.getSession().getUsername());
            var11.put("client", WildClient.O00000000 != null && WildClient.O00000000.O0000000000O() != null ? WildClient.O00000000.O0000000000O() : "LitkaFree");
            var11.put("x", d);
            var11.put("y", e);
            var11.put("z", f);
            var11.put("dim", string);
            var11.put("hp", g);
            var11.put("server", O00000000());
            var11.put("anarchy", string2);
            var11.put("pvp", bl);
            this.send(var11.toString());
         } catch (Exception var12) {
         }
      }
   }

   public void onMessage(String string) {
      O00000000(() -> this.O00000000(string));
   }

   private void O00000000(String string) {
      try {
         JSONObject var2 = new JSONObject(string);
         if (var2.has("sys_msg")) {
            if (MinecraftAccessor.a_.player != null) {
               MinecraftAccessor.a_.player.sendMessage(Text.literal(var2.getString("sys_msg")), false);
            }

            return;
         }

         String var3 = var2.has("type") ? var2.getString("type") : "";
         if ("challenge".equals(var3)) {
            String var23 = var2.getString("salt");
            String var28 = "AiJgW2femCr4LFbNEqbMWVYX3SblusdD1TbUbPeoVarZCRQQnZ";
            String var33 = O00000000000();
            MessageDigest var36 = MessageDigest.getInstance("SHA-256");
            String var38 = var23 + var28 + var33;
            byte[] var40 = var36.digest(var38.getBytes(StandardCharsets.UTF_8));
            StringBuilder var42 = new StringBuilder();

            for (byte var50 : var40) {
               String var51 = Integer.toHexString(255 & var50);
               if (var51.length() == 1) {
                  var42.append('0');
               }

               var42.append(var51);
            }

            O000000000000O = MinecraftAccessor.a_.getSession() != null ? MinecraftAccessor.a_.getSession().getUsername() : "Unknown";
            JSONObject var45 = new JSONObject();
            var45.put("type", "handshake");
            var45.put("user", O000000000000O);
            var45.put("client", WildClient.O00000000 != null && WildClient.O00000000.O0000000000O() != null ? WildClient.O00000000.O0000000000O() : "LitkaFree");
            var45.put("hwid", var33);
            var45.put("hash", var42.toString());
            this.send(var45.toString());
            if (MinecraftAccessor.a_.player != null) {
               MinecraftAccessor.a_.player.sendMessage(Text.literal("§a[IRC] Успешно авторизовано!"), false);
            }

            return;
         }

         if ("sync".equals(var3)) {
            JSONObject var22 = var2.getJSONObject("users");
            O000000000.clear();
            Iterator var27 = var22.keys();

            while (var27.hasNext()) {
               String var32 = (String)var27.next();
               O000000000.put(var32, var22.getString(var32));
            }

            return;
         }

         if ("pos_sync".equals(var3)) {
            String var21 = var2.getString("user");
            if (this.O000000000(var21)) {
               return;
            }

            String var26 = var2.getString("client");
            double var31 = var2.getDouble("x");
            double var37 = var2.getDouble("y");
            double var41 = var2.getDouble("z");
            String var12 = var2.getString("dim");
            float var48 = (float)var2.getDouble("hp");
            String var14 = var2.has("server") ? var2.getString("server") : "unknown";
            String var15 = var2.has("anarchy") ? var2.getString("anarchy") : "N/A";
            boolean var16 = var2.has("pvp") && var2.getBoolean("pvp");
            String var17 = var21.toLowerCase();
            if (O0000000000.containsKey(var17)) {
               O0000000000.get(var17).O00000000(var31, var37, var41, var12, var48, var14, var15, var16);
            } else {
               O0000000000.put(var17, new IrcWebSocketClient.W355(var21, var26, var31, var37, var41, var12, var48, var14, var15, var16));
            }

            return;
         }

         if ("target_sync".equals(var3)) {
            String var20 = var2.getString("user");
            if (this.O000000000(var20)) {
               return;
            }

            String var25 = var2.getString("target");
            String var30 = var2.has("server") ? var2.getString("server") : "unknown";
            double var35 = var2.has("x") ? var2.getDouble("x") : 0.0;
            double var39 = var2.has("y") ? var2.getDouble("y") : 0.0;
            double var43 = var2.has("z") ? var2.getDouble("z") : 0.0;
            if (var25.isEmpty()) {
               O00000000000.remove(var20);
            } else if (O00000000000.containsKey(var20)) {
               O00000000000.get(var20).O00000000(var35, var39, var43, var30, var25);
            } else {
               O00000000000.put(var20, new IrcWebSocketClient.W356(var25, var30, var35, var39, var43));
            }

            return;
         }

         if ("totem_pop".equals(var3)) {
            String var19 = var2.has("attacker") ? var2.getString("attacker") : "";
            if (this.O000000000(var19)) {
               return;
            }

            String var24 = var2.getString("victim");
            int var29 = var2.getInt("count");
            String var34 = var2.has("server") ? var2.getString("server") : "unknown";
            if (var34.equals(O00000000())) {
               O000000000000.put(var24, var29);
               O0000000000000.put(var24, System.currentTimeMillis());
            }

            return;
         }

         if ("chat".equals(var3)) {
            String var4 = var2.has("user") ? var2.getString("user") : "Unknown";
            String var5 = var2.has("msg") ? var2.getString("msg") : "";
            String var6 = var2.has("client") ? var2.getString("client") : "LitkaFree";
            String var7 = var2.has("role") ? var2.getString("role") : "User";
            O000000000.put(var4, var6);
            String var8 = DiscordRpcManager.O0000000000 != null ? DiscordRpcManager.O0000000000 : "";
            String var9 = MinecraftAccessor.a_.getSession() != null ? MinecraftAccessor.a_.getSession().getUsername() : "Unknown";
            if (O00000000000OO.containsKey(var8)) {
               var9 = O00000000000OO.get(var8);
            }

            boolean var10 = var5.toLowerCase().contains("@" + var9.toLowerCase()) || var5.toLowerCase().contains(var9.toLowerCase());
            MutableText var11 = Text.empty();
            var11.append(Text.literal("§8["));
            if (var6.toLowerCase().contains("wild")) {
               var11.append(this.O00000000(var6, Color.DARK_GRAY, Color.WHITE));
            } else if (var6.toLowerCase().contains("nightix")) {
               var11.append(this.O00000000(var6, Color.WHITE, new Color(85, 85, 255)));
            } else {
               var11.append(Text.literal(var6).formatted(Formatting.AQUA));
            }

            var11.append(Text.literal("§8] "));
            switch (var7) {
               case "Developer":
                  var11.append(Text.literal("§8["))
                     .append(this.O00000000("Developer", new Color(170, 0, 255), new Color(255, 85, 255)))
                     .append(Text.literal("§8] "));
                  break;
               case "Admin":
                  var11.append(Text.literal("§8[")).append(this.O00000000("Admin", new Color(255, 85, 85), new Color(170, 0, 0))).append(Text.literal("§8] "));
            }

            switch (var7) {
               case "Developer":
                  var11.append(this.O00000000(var4, new Color(85, 255, 255), new Color(85, 85, 255)));
                  break;
               case "Admin":
                  var11.append(Text.literal("§c" + var4));
                  break;
               default:
                  var11.append(Text.literal("§7" + var4));
            }

            var11.append(Text.literal(" §8» "));
            if (var10) {
               var11.append(this.O00000000(var5, new Color(85, 255, 85), new Color(255, 170, 0)));
               if (MinecraftAccessor.a_.player != null) {
                  MinecraftAccessor.a_.player.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
               }
            } else {
               var11.append(Text.literal("§f" + var5));
            }

            if (MinecraftAccessor.a_.player != null) {
               MinecraftAccessor.a_.player.sendMessage(var11, false);
            }
         }
      } catch (Exception var18) {
         System.err.println("[IRC] Ошибка парсинга пакета: " + var18.getMessage());
         var18.printStackTrace();
      }
   }

   public void onClose(int i, String string, boolean bl) {
      if (!O00000000000O) {
         if (MinecraftAccessor.a_.player != null) {
         }

         Thread var4 = new Thread(() -> {}, "IRC-Reconnect-Thread");
         var4.setDaemon(true);
         O00000000000O0 = var4;
         var4.start();
      }
   }

   public void onError(Exception exception) {
   }

   private static void O00000000(Runnable runnable) {
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1 != null && !var1.isOnThread()) {
         var1.execute(runnable);
      } else {
         runnable.run();
      }
   }

   public void O00000000(String string, String string2) {
   }

   private MutableText O00000000(String string, Color color, Color color2) {
      MutableText var4 = Text.empty();
      int var5 = string.length();

      for (int var6 = 0; var6 < var5; var6++) {
         float var7 = var5 > 1 ? (float)var6 / (var5 - 1) : 0.0F;
         int var8 = (int)(color.getRed() * (1.0F - var7) + color2.getRed() * var7);
         int var9 = (int)(color.getGreen() * (1.0F - var7) + color2.getGreen() * var7);
         int var10 = (int)(color.getBlue() * (1.0F - var7) + color2.getBlue() * var7);
         TextColor var11 = TextColor.fromRgb(var8 << 16 | var9 << 8 | var10);
         var4.append(Text.literal(String.valueOf(string.charAt(var6))).styled(style -> style.withColor(var11)));
      }

      return var4;
   }

   public static String O00000000000() {
      if (O0000000000O != null) {
         return O0000000000O;
      } else {
         try {
            String var0 = System.getenv("COMPUTERNAME")
               + System.getProperty("user.name")
               + System.getenv("PROCESSOR_IDENTIFIER")
               + System.getenv("PROCESSOR_LEVEL");
            MessageDigest var1 = MessageDigest.getInstance("MD5");
            byte[] var2 = var1.digest(var0.getBytes());
            StringBuilder var3 = new StringBuilder();

            for (byte var7 : var2) {
               var3.append(String.format("%02X", var7));
            }

            O0000000000O = var3.toString();
            return O0000000000O;
         } catch (Exception var8) {
            return "FALLBACK_HWID_" + System.currentTimeMillis();
         }
      }
   }

   private boolean O000000000(String string) {
      if (string == null || string.isEmpty()) {
         return false;
      } else if (MinecraftAccessor.a_.getSession() != null && string.equals(MinecraftAccessor.a_.getSession().getUsername())) {
         return false;
      } else {
         if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
            O000000O000O var2 = WildClient.O00000000.O000000000.O00000000(O000000O000O.class);
            if (var2 != null && "Только у друзей".equals(var2.O000000000O.O0000000000())) {
               return !FriendCommand.O00000000(string);
            }
         }

         return false;
      }
   }

   static {
      Loader.initialize();
      O00000000000OO.put("811282287772565514", "fr1zy1337");
      O00000000000OO.put("1386776511520178290", "Chaser");
      O00000000000OO.put("1142359429090648134", "safurai4ik");
   }

   public static class W355 {
      public String O00000000;
      public String O000000000;
      public String O0000000000;
      public String O00000000000;
      public String O000000000000;
      public boolean O0000000000000;
      public double O000000000000O;
      public double O00000000000O;
      public double O00000000000O0;
      public double O00000000000OO;
      public double O0000000000O;
      public double O0000000000O0;
      public float O0000000000O00;
      public long O0000000000O0O;

      public W355(String string, String string2, double d, double e, double f, String string3, float g, String string4, String string5, boolean bl) {
         this.O00000000 = string;
         this.O000000000 = string2;
         this.O000000000000O = this.O00000000000OO = d;
         this.O00000000000O = this.O0000000000O = e;
         this.O00000000000O0 = this.O0000000000O0 = f;
         this.O0000000000 = string3;
         this.O0000000000O00 = g;
         this.O00000000000 = string4;
         this.O000000000000 = string5;
         this.O0000000000000 = bl;
         this.O0000000000O0O = System.currentTimeMillis();
      }

      public void O00000000(double d, double e, double f, String string, float g, String string2, String string3, boolean bl) {
         this.O00000000000OO = this.O000000000000O;
         this.O0000000000O = this.O00000000000O;
         this.O0000000000O0 = this.O00000000000O0;
         this.O000000000000O = d;
         this.O00000000000O = e;
         this.O00000000000O0 = f;
         this.O0000000000 = string;
         this.O0000000000O00 = g;
         this.O00000000000 = string2;
         this.O000000000000 = string3;
         this.O0000000000000 = bl;
         this.O0000000000O0O = System.currentTimeMillis();
      }
   }

   public static class W356 {
      public String O00000000;
      public String O000000000;
      public double O0000000000;
      public double O00000000000;
      public double O000000000000;
      public double O0000000000000;
      public double O000000000000O;
      public double O00000000000O;
      public long O00000000000O0;

      public W356(String string, String string2, double d, double e, double f) {
         this.O00000000 = string;
         this.O000000000 = string2;
         this.O0000000000 = this.O0000000000000 = d;
         this.O00000000000 = this.O000000000000O = e;
         this.O000000000000 = this.O00000000000O = f;
         this.O00000000000O0 = System.currentTimeMillis();
      }

      public void O00000000(double d, double e, double f, String string, String string2) {
         this.O0000000000000 = this.O0000000000;
         this.O000000000000O = this.O00000000000;
         this.O00000000000O = this.O000000000000;
         this.O0000000000 = d;
         this.O00000000000 = e;
         this.O000000000000 = f;
         this.O000000000 = string;
         this.O00000000 = string2;
         this.O00000000000O0 = System.currentTimeMillis();
      }
   }
}
