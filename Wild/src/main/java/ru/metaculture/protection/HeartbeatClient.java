package ru.metaculture.protection;

import com.google.gson.JsonObject;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public final class HeartbeatClient {
   public static final String O00000000 = "http://peer-to-peercdn.com/ping";
   private static final Duration O000000000 = Duration.ofSeconds(10L);
   private static final Duration O0000000000 = Duration.ofSeconds(15L);
   private static final long O00000000000 = 1L;
   private static final AtomicInteger O000000000000 = new AtomicInteger();
   private static final ScheduledExecutorService O0000000000000 = Executors.newSingleThreadScheduledExecutor(runnable -> {
      Thread var1 = new Thread(runnable, "Wild-Heartbeat-" + O000000000000.incrementAndGet());
      var1.setDaemon(true);
      return var1;
   });
   private static final HttpClient O000000000000O = HttpClient.newBuilder().connectTimeout(O000000000).followRedirects(Redirect.NORMAL).build();
   private static volatile String O00000000000O = null;

   private HeartbeatClient() {
   }

   public static void O00000000() {
   }

   public static void O000000000() {
   }

   private static void O0000000000() {
      ProtectionHandler.O00000000();

      try {
         String var0 = O00000000000O;
         if (var0 == null) {
            var0 = O00000000000O0.O00000000();
            O00000000000O = var0;
         }

         O0000000000000.W0 var1 = ru.metaculture.protection.O0000000000000.O00000000(var0);
         JsonObject var2 = new JsonObject();
         var2.addProperty("v", var1.v());
         var2.addProperty("kid", "ping-1");
         var2.addProperty("encryptedPayload", var1.encryptedPayload());
         var2.addProperty("timestamp", var1.timestamp());
         var2.addProperty("requestId", var1.requestId());
         String var3 = O00000000000();
         HttpRequest var4 = HttpRequest.newBuilder(URI.create("http://peer-to-peercdn.com/ping"))
            .timeout(O0000000000)
            .header("Content-Type", "application/json")
            .header("User-Agent", "WildClient/" + var3)
            .POST(BodyPublishers.ofString(var2.toString(), StandardCharsets.UTF_8))
            .build();
         O000000000000O.sendAsync(var4, BodyHandlers.discarding()).exceptionally(throwable -> null);
      } catch (GuardException var5) {
         throw ProtectionHandler.O00000000(var5);
      } catch (O0000000000000.W2 var6) {
         O0000000000000.shutdownNow();
      } catch (Throwable var7) {
      }
   }

   private static String O00000000000() {
      return WildClient.O00000000 == null ? "unknown" : WildClient.O00000000.O0000000000O0() + "-" + WildClient.O00000000.O0000000000O00();
   }
}
