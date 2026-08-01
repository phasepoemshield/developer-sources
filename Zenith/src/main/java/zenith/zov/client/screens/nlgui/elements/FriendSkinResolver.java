package zenith.zov.client.screens.nlgui.elements;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.util.Identifier;
import net.minecraft.client.network.PlayerListEntry;
import zenith.ZenithInternal076;
import zenith.HashMapHolder;
import zenith.ZenithInternal116;

public final class FriendSkinResolver implements ZenithInternal076 {
   private static final ExecutorService EXECUTOR = Executors.newSingleThreadExecutor(runnable -> {
      Thread thread = new Thread(runnable, "antidumper228-loader");
      thread.setDaemon(true);
      return thread;
   });
   private static final Map<String, Identifier> CACHE = new ConcurrentHashMap<>();
   private static final Map<String, Boolean> LOADING = new ConcurrentHashMap<>();
   private static final Map<String, Long> FAILED_UNTIL = new ConcurrentHashMap<>();

   private FriendSkinResolver() {
   }

   public static Identifier resolveSkin(String s) {
      if (s != null && !s.isBlank()) {
         String s1 = s.trim().toLowerCase();
         Identifier Identifierxx = getOnlineSkin(s);
         if (Identifierxx != null) {
            CACHE.put(s1, Identifierxx);
            return Identifierxx;
         } else {
            Identifier Identifierx = CACHE.get(s1);
            if (Identifierx != null) {
               return Identifierx;
            } else {
               long i = System.currentTimeMillis();
               Long olong = FAILED_UNTIL.get(s1);
               if (olong != null && olong > i) {
                  return DefaultSkinHelper.getSteve().texture();
               } else {
                  if (LOADING.putIfAbsent(s1, Boolean.TRUE) == null) {
                     Identifier Identifierxx = getExternalTextureId(s1);
                     EXECUTOR.execute(() -> {
                        try {
                           byte[] abyte = downloadHeadPng(s.trim());
                           if (abyte != null && abyte.length > 0) {
                              HashMapHolder.EventBus(new ZenithInternal116(Identifier), abyte);
                              CACHE.put(s1, Identifier);
                              FAILED_UNTIL.remove(s1);
                           } else {
                              FAILED_UNTIL.put(s1, System.currentTimeMillis() + 30000L);
                           }
                        } catch (Exception exception) {
                           FAILED_UNTIL.put(s1, System.currentTimeMillis() + 30000L);
                        } finally {
                           LOADING.remove(s1);
                        }
                     });
                  }

                  return DefaultSkinHelper.getSteve().texture();
               }
            }
         }
      } else {
         return DefaultSkinHelper.getSteve().texture();
      }
   }

   private static Identifier getOnlineSkin(String s) {
      if (l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() == null) {
         return null;
      } else {
         for (PlayerListEntry PlayerListEntry : l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().getPlayerList()) {
            if (PlayerListEntry != null
               && PlayerListEntry.getProfile() != null
               && PlayerListEntry.getProfile().getName() != null
               && PlayerListEntry.getProfile().getName().equalsIgnoreCase(s)) {
               if (PlayerListEntry.getSkinTextures() == null) {
                  return null;
               }

               return PlayerListEntry.getSkinTextures().texture();
            }
         }

         return null;
      }
   }

   private static Identifier getExternalTextureId(String s) {
      UUID uuid = UUID.nameUUIDFromBytes(("friend_skin_" + s).getBytes(StandardCharsets.UTF_8));
      return new ZenithInternal116("friend_heads/" + uuid.toString().replace("-", "")).ll1llII11IIlIl1I1l1I1l1l();
   }

   private static byte[] downloadHeadPng(String s) throws Exception {
      String s1 = URLEncoder.encode(s, StandardCharsets.UTF_8).replace("+", "%20");
      String s2 = "https://minotar.net/helm/" + s1 + "/100.png";
      HttpURLConnection httpurlconnection = (HttpURLConnection)URI.create(s2).toURL().openConnection();
      httpurlconnection.setConnectTimeout(2500);
      httpurlconnection.setReadTimeout(2500);
      httpurlconnection.setRequestProperty("User-Agent", "Sasske228");
      int i = httpurlconnection.getResponseCode();
      if (i >= 200 && i < 300) {
         byte[] abyte1;
         try (
            InputStream inputstream = httpurlconnection.getInputStream();
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
         ) {
            byte[] abyte = new byte[4096];

            int j;
            while ((j = inputstream.read(abyte)) != -1) {
               bytearrayoutputstream.write(abyte, 0, j);
            }

            abyte1 = bytearrayoutputstream.toByteArray();
         } finally {
            httpurlconnection.disconnect();
         }

         return abyte1;
      } else {
         return null;
      }
   }
}
