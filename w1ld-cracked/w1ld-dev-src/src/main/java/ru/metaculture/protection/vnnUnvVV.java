package ru.metaculture.protection;

import org.wild.rpc.DiscordEventHandlers;
import org.wild.rpc.DiscordRichPresence;
import ru.metaculture.profile.Profile;

public class vnnUnvVV implements O000c0oocoo {
   private static final String vVvUvVVuuNvV = "1494051037655339148";
   private static final String uNNnnnuuuN = "https://i.ibb.co/20hRBGzL/gif-gif.gif";
   private static final long nuUnNvnuUu = 250L;
   private static final long VVuuUN = 1500L;
   private static final Object vNUvnnVnUvu = new Object();
   private static final UnVvunvVNVuu uVUuuVnNVU = var0 -> vnnUnvVV.uUnuvNvvNU = var0 != null && var0.userId != null ? var0.userId : "";
   private static final nnNVUNnuv vuuuNvNuv = (var0, var1) -> {};
   private static final NvNNVNN nUUVuvU = (var0, var1) -> {};
   private static final DiscordEventHandlers UnUNVVVNuv = new DiscordEventHandlers();
   public static DiscordRichPresence UuUVuuUu = new DiscordRichPresence();
   public static volatile boolean C00OOC00oO;
   public static volatile String uUnuvNvvNU = "";
   private static volatile Thread vNVuvnUUnuUn;
   private static volatile uvnVuuuvUuNV UvnvNVnnnnNU;
   private static volatile boolean uVUVnuvnuVuv;
   private static volatile String NVNnnvnuunNv = "";

   public void UuUVuuUu() {
      synchronized (vnnUnvVV.class) {
         if (!C00OOC00oO) {
            if (uvnVuuuvUuNV.NVnVnNnN.C00OOC00oO()) {
               uvnVuuuvUuNV var2 = uvnVuuuvUuNV.NVnVnNnN.UuUVuuUu();
               C00OOC00oO = true;
               uVUVnuvnuVuv = true;
               UvnvNVnnnnNU = var2;
               NVNnnvnuunNv = "";
               UuUVuuUu.startTimestamp = System.currentTimeMillis() / 1000L;
               UuUVuuUu.largeImageKey = "https://i.ibb.co/20hRBGzL/gif-gif.gif";
               UuUVuuUu.largeImageText = String.valueOf(Profile.getUid());
               UuUVuuUu.button_label_1 = "Telegram";
               UuUVuuUu.button_url_1 = "https://t.me/wildclient";
               UuUVuuUu.button_label_2 = "VK";
               UuUVuuUu.button_url_2 = "https://vk.com/wildclient";
               synchronized (vNUvnnVnUvu) {
                  var2.Discord_Initialize("1494051037655339148", UnUNVVVNuv, true, "");
               }

               Thread var8 = new Thread(() -> UuUVuuUu(var2), "TH-RPC-Handler");
               var8.setDaemon(true);
               vNVuvnUUnuUn = var8;
               var8.start();
            }
         }
      }
   }

   public static void C00OOC00oO() {
      Thread var0;
      uvnVuuuvUuNV var1;
      synchronized (vnnUnvVV.class) {
         if (!C00OOC00oO && vNVuvnUUnuUn == null && UvnvNVnnnnNU == null) {
            return;
         }

         C00OOC00oO = false;
         uVUVnuvnuVuv = false;
         var0 = vNVuvnUUnuUn;
         vNVuvnUUnuUn = null;
         var1 = UvnvNVnnnnNU;
         UvnvNVnnnnNU = null;
      }

      NVNnnvnuunNv = "";
      if (var0 != null && var0 != Thread.currentThread()) {
         var0.interrupt();

         try {
            var0.join(1500L);
         } catch (InterruptedException var8) {
            Thread.currentThread().interrupt();
         }

         if (var0.isAlive()) {
            System.out.println("[Wild] rpc: callback thread did not quiesce, skipping native shutdown");
            return;
         }
      }

      if (var1 != null) {
         synchronized (vNUvnnVnUvu) {
            try {
               var1.Discord_ClearPresence();
            } catch (Throwable var6) {
            }

            try {
               var1.Discord_Shutdown();
            } catch (Throwable var5) {
            }
         }
      }
   }

   private static void UuUVuuUu(uvnVuuuvUuNV var0) {
      while (uVUVnuvnuVuv && !Thread.currentThread().isInterrupted()) {
         try {
            synchronized (vNUvnnVnUvu) {
               if (!uVUVnuvnuVuv) {
                  break;
               }

               var0.Discord_RunCallbacks();
               if (uUnuvNvvNU()) {
                  var0.Discord_UpdatePresence(UuUVuuUu);
               }
            }
         } catch (Throwable var5) {
         }

         try {
            Thread.sleep(250L);
         } catch (InterruptedException var3) {
            Thread.currentThread().interrupt();
            break;
         }
      }
   }

   private static boolean uUnuvNvvNU() {
      NVnVnNnN var0 = NVnVnNnN.UuUVuuUu;
      String var1 = "Version: " + (var0 == null ? "" : "1.21.8");
      String var2 = "User: " + Profile.getUsername();
      String var3 = var1 + "\u0000" + var2;
      if (var3.equals(NVNnnvnuunNv)) {
         return false;
      } else {
         NVNnnvnuunNv = var3;
         UuUVuuUu.details = var1;
         UuUVuuUu.state = var2;
         return true;
      }
   }

   static {
      UnUNVVVNuv.ready = uVUuuVnNVU;
      UnUNVVVNuv.disconnected = vuuuNvNuv;
      UnUNVVVNuv.errored = nUUVuvU;
   }
}
