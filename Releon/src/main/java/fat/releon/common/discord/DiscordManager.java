package fat.releon.common.discord;

import fat.releon.Releon;
import fat.releon.common.discord.utils.DiscordEventHandlers;
import fat.releon.common.discord.utils.DiscordRPC;
import fat.releon.common.discord.utils.DiscordRichPresence;
import fat.releon.common.discord.utils.RPCButton;
import l.Helper160;
import l.Helper208;
import net.minecraft.util.Identifier;

public class DiscordManager implements Helper160 {
   private final DiscordManager.DiscordDaemonThread discordDaemonThread = new DiscordManager.DiscordDaemonThread();
   private boolean running = true;
   private DiscordManager.DiscordInfo info = new DiscordManager.DiscordInfo("FREE", "", "");
   private Identifier avatarId;

   public DiscordManager() {
   }

   public void init() {
      String var1 = System.getProperty("os.name").toLowerCase();
      if (!var1.contains("linux")) {
         DiscordEventHandlers var2 = new DiscordEventHandlers.Builder()
            .ready(
               var0 -> {
                  Releon.method71()
                     .method27()
                     .setInfo(
                        new DiscordManager.DiscordInfo(
                           var0.username, "https://cdn.discordapp.com/avatars/" + var0.userId + "/" + var0.avatar + ".png", var0.userId
                        )
                     );
                  DiscordRichPresence var1x = new DiscordRichPresence.Builder()
                     .setStartTimestamp(System.currentTimeMillis() / 1000L)
                     .setDetails("User: Free")
                     .setState("Uid: Free")
                     .setSmallImage(Releon.method71().method27().getInfo().avatarUrl, "")
                     .setButtons(RPCButton.create("Телеграм", "https://t.me/releonclient"))
                     .build();
                  DiscordRPC.INSTANCE.Discord_UpdatePresence(var1x);
               }
            )
            .build();
         DiscordRPC.INSTANCE.Discord_Initialize("1473026034457903147", var2, true, "");
         this.discordDaemonThread.start();
      }
   }

   public void stopRPC() {
      DiscordRPC.INSTANCE.Discord_Shutdown();
      this.running = false;
   }

   public void load() {
      if (this.avatarId == null && !this.info.avatarUrl.isEmpty()) {
         try {
            this.avatarId = Helper208.method1786("avatar-", Helper208.method1781(this.info.avatarUrl));
         } catch (java.io.IOException var2) {
            var2.printStackTrace();
         }
      }
   }

   public Identifier getAvatarId() {
      return this.avatarId;
   }

   public void setRunning(boolean var1) {
      this.running = var1;
   }

   public void setInfo(DiscordManager.DiscordInfo var1) {
      this.info = var1;
   }

   public void setAvatarId(Identifier var1) {
      this.avatarId = var1;
   }

   public DiscordManager.DiscordDaemonThread getDiscordDaemonThread() {
      return this.discordDaemonThread;
   }

   public boolean isRunning() {
      return this.running;
   }

   public DiscordManager.DiscordInfo getInfo() {
      return this.info;
   }

   class DiscordDaemonThread extends Thread {
      DiscordDaemonThread() {
      }

      @Override
      public void run() {
         this.setName("Discord-RPC");

         try {
            while (Releon.method71().method27().isRunning()) {
               DiscordRPC.INSTANCE.Discord_RunCallbacks();
               DiscordManager.this.load();
               Thread.sleep(15000L);
            }
         } catch (Exception var2) {
            DiscordManager.this.stopRPC();
         }

         super.run();
      }
   }

   public class DiscordInfo {
      private final String userName;
      final String avatarUrl;
      private final String userId;

      public DiscordInfo(String var1, String var2, String var3) {
         this.userName = var1;
         this.avatarUrl = var2;
         this.userId = var3;
      }
   }
}
