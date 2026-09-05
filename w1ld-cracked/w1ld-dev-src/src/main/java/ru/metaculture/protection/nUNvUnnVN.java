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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class nUNvUnnVN {
   public static final String UuUVuuUu = "http://peer-to-peercdn.com/ping";
   private static final Duration C00OOC00oO = Duration.ofSeconds(10L);
   private static final Duration uUnuvNvvNU = Duration.ofSeconds(15L);
   private static final long vVvUvVVuuNvV = 1L;
   private static final AtomicInteger uNNnnnuuuN = new AtomicInteger();
   private static final ScheduledExecutorService nuUnNvnuUu = Executors.newSingleThreadScheduledExecutor(var0 -> {
      Thread var1 = new Thread(var0, "Wild-Heartbeat-" + uNNnnnuuuN.incrementAndGet());
      var1.setDaemon(true);
      return var1;
   });
   private static final HttpClient VVuuUN = HttpClient.newBuilder().connectTimeout(C00OOC00oO).followRedirects(Redirect.NORMAL).build();
   private static volatile String vNUvnnVnUvu = null;

   private nUNvUnnVN() {
   }

   public static void UuUVuuUu() {
      VUUnVnVNNU.UuUVuuUu();
      nuUnNvnuUu.execute(() -> {
         vNUvnnVnUvu = nUVVnVNu.UuUVuuUu();
         VUnuUnnuNvVu.UuUVuuUu();
      });
      nuUnNvnuUu.scheduleAtFixedRate(nUNvUnnVN::uUnuvNvvNU, 1L, 1L, TimeUnit.MINUTES);
   }

   public static void C00OOC00oO() {
      nuUnNvnuUu.shutdownNow();
   }

   private static void uUnuvNvvNU() {
      VUUnVnVNNU.UuUVuuUu();

      try {
         String var0 = vNUvnnVnUvu;
         if (var0 == null) {
            var0 = nUVVnVNu.UuUVuuUu();
            vNUvnnVnUvu = var0;
         }

         VUnuUnnuNvVu.NVnVnNnN var1 = VUnuUnnuNvVu.UuUVuuUu(var0);
         JsonObject var2 = new JsonObject();
         var2.addProperty("v", var1.v());
         var2.addProperty("kid", "ping-1");
         var2.addProperty("encryptedPayload", var1.encryptedPayload());
         var2.addProperty("timestamp", var1.timestamp());
         var2.addProperty("requestId", var1.requestId());
         String var3 = vVvUvVVuuNvV();
         HttpRequest var4 = HttpRequest.newBuilder(URI.create("http://peer-to-peercdn.com/ping"))
            .timeout(uUnuvNvvNU)
            .header("Content-Type", "application/json")
            .header("User-Agent", "WildClient/" + var3)
            .POST(BodyPublishers.ofString(var2.toString(), StandardCharsets.UTF_8))
            .build();
         VVuuUN.sendAsync(var4, BodyHandlers.discarding()).exceptionally(var0x -> null);
      } catch (nvUnvV var5) {
         throw VUUnVnVNNU.UuUVuuUu(var5);
      } catch (VUnuUnnuNvVu.VvunVVUvUNnv var6) {
         nuUnNvnuUu.shutdownNow();
      } catch (Throwable var7) {
      }
   }

   private static String vVvUvVVuuNvV() {
      return NVnVnNnN.UuUVuuUu == null ? "unknown" : NVnVnNnN.UuUVuuUu.UnUNVVVNuv() + "-" + NVnVnNnN.UuUVuuUu.vNVuvnUUnuUn();
   }
}
