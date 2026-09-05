package ru.metaculture.protection;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.net.http.WebSocketHandshakeException;
import java.net.http.WebSocket.Listener;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class UuvvNVnu {
   private static final String UuUVuuUu = "wss://wildclient.org/api/v1/mc/online";
   private static final long[] C00OOC00oO = new long[]{5000L, 10000L, 30000L, 60000L};
   private static final long uUnuvNvvNU = 1000L;
   private static final long vVvUvVVuuNvV = 30000L;
   private static final long uNNnnnuuuN = 120000L;
   private static final long nuUnNvnuUu = 1000L;
   private static final int VVuuUN = 429;
   private static final UuvvNVnu vNUvnnVnUvu = new UuvvNVnu();
   private final AtomicBoolean uVUuuVnNVU = new AtomicBoolean();
   private final AtomicBoolean vuuuNvNuv = new AtomicBoolean();
   private final ScheduledExecutorService nvUVNnuu = Executors.newSingleThreadScheduledExecutor(var0 -> {
      Thread var1 = new Thread(var0, "Wild-Online-Beacon");
      var1.setDaemon(true);
      return var1;
   });
   private volatile HttpClient UuuNnUvUuv;
   volatile WebSocket nUUVuvU;
   private volatile boolean UnUNVVVNuv;
   private volatile long vNVuvnUUnuUn;
   private volatile String UvnvNVnnnnNU = "";
   private String uVUVnuvnuVuv;
   private int NVNnnvnuunNv;
   private CompletableFuture<WebSocket> uVunuUNVVUUV = CompletableFuture.completedFuture(null);

   private UuvvNVnu() {
   }

   public static void UuUVuuUu() {
      vNUvnnVnUvu.uUnuvNvvNU();
   }

   public static void C00OOC00oO() {
      vNUvnnVnUvu.vVvUvVVuuNvV();
   }

   public static void UuUVuuUu(String var0) {
      vNUvnnVnUvu.C00OOC00oO(vUvNUVuNUvUu.UuUVuuUu(var0));
   }

   private void uUnuvNvvNU() {
      if (this.uVUuuVnNVU.compareAndSet(false, true)) {
         this.UuuNnUvUuv = HttpClient.newBuilder().executor(this.nvUVNnuu).connectTimeout(Duration.ofSeconds(10L)).build();
         this.nvUVNnuu.scheduleWithFixedDelay(this::uVUuuVnNVU, 30000L, 30000L, TimeUnit.MILLISECONDS);
         this.VVuuUN();
      }
   }

   private void vVvUvVVuuNvV() {
      this.UnUNVVVNuv = true;
      WebSocket var1 = this.nUUVuvU;
      this.nUUVuvU = null;
      this.nvUVNnuu.shutdownNow();
      if (var1 != null) {
         try {
            var1.sendClose(1000, "").orTimeout(1000L, TimeUnit.MILLISECONDS).exceptionally(var0 -> null).join();
         } catch (Throwable var3) {
         }

         var1.abort();
      }
   }

   private void C00OOC00oO(String var1) {
      if (!var1.equals(this.UvnvNVnnnnNU)) {
         this.UvnvNVnnnnNU = var1;
         this.uNNnnnuuuN();
      }
   }

   private void uNNnnnuuuN() {
      if (!this.UnUNVVVNuv && this.nUUVuvU != null) {
         if (this.vuuuNvNuv.compareAndSet(false, true)) {
            this.UuUVuuUu(this::nuUnNvnuUu, 1000L);
         }
      }
   }

   private void nuUnNvnuUu() {
      this.vuuuNvNuv.set(false);
      WebSocket var1 = this.nUUVuvU;
      if (!this.UnUNVVVNuv && var1 != null) {
         String var2 = this.UvnvNVnnnnNU;
         if (!var2.equals(this.uVUVnuvnuVuv)) {
            this.uVUVnuvnuVuv = var2;
            this.uVunuUNVVUUV = this.uVunuUNVVUUV.<WebSocket>thenCompose(var2x -> var1.sendText(var2, true)).exceptionally(var0 -> null);
         }
      }
   }

   private void VVuuUN() {
      if (!this.UnUNVVVNuv) {
         this.UuuNnUvUuv
            .newWebSocketBuilder()
            .connectTimeout(Duration.ofSeconds(10L))
            .buildAsync(UuuNnUvUuv(), new UuvvNVnu.NVnVnNnN())
            .whenComplete((var1, var2) -> {
               if (var2 != null) {
                  if (UuUVuuUu(var2)) {
                     this.NVNnnvnuunNv = C00OOC00oO.length - 1;
                  }

                  this.vNUvnnVnUvu();
               }
            });
      }
   }

   private void vNUvnnVnUvu() {
      if (!this.UnUNVVVNuv) {
         long var1 = C00OOC00oO[Math.min(this.NVNnnvnuunNv, C00OOC00oO.length - 1)];
         this.NVNnnvnuunNv = Math.min(this.NVNnnvnuunNv + 1, C00OOC00oO.length - 1);
         this.UuUVuuUu(this::VVuuUN, var1);
      }
   }

   private void UuUVuuUu(Runnable var1, long var2) {
      if (!this.UnUNVVVNuv && !this.nvUVNnuu.isShutdown()) {
         try {
            this.nvUVNnuu.schedule(var1, var2, TimeUnit.MILLISECONDS);
         } catch (Throwable var5) {
         }
      }
   }

   private void uVUuuVnNVU() {
      WebSocket var1 = this.nUUVuvU;
      if (!this.UnUNVVVNuv && var1 != null) {
         if (System.currentTimeMillis() - this.vNVuvnUUnuUn >= 120000L) {
            this.nUUVuvU = null;
            var1.abort();
            this.vNUvnnVnUvu();
         }
      }
   }

   void UuUVuuUu(WebSocket var1) {
      this.nUUVuvU = var1;
      this.NVNnnvnuunNv = 0;
      this.uVUVnuvnuVuv = null;
      this.uVunuUNVVUUV = CompletableFuture.completedFuture(null);
      this.vuuuNvNuv();
      this.nuUnNvnuUu();
   }

   void vuuuNvNuv() {
      this.vNVuvnUUnuUn = System.currentTimeMillis();
   }

   void nvUVNnuu() {
      this.nUUVuvU = null;
      this.vNUvnnVnUvu();
   }

   private static boolean UuUVuuUu(Throwable var0) {
      for (Throwable var1 = var0; var1 != null; var1 = var1.getCause()) {
         if (var1 instanceof WebSocketHandshakeException var2) {
            return var2.getResponse().statusCode() == 429;
         }
      }

      return false;
   }

   private static URI UuuNnUvUuv() {
      String var0 = System.getProperty("wild.online.url");
      return URI.create(var0 != null && !var0.isBlank() ? var0.trim() : "wss://wildclient.org/api/v1/mc/online");
   }

   final class NVnVnNnN implements Listener {
      @Override
      public void onOpen(WebSocket var1) {
         var1.request(1L);
         UuvvNVnu.this.UuUVuuUu(var1);
      }

      @Override
      public CompletionStage<?> onText(WebSocket var1, CharSequence var2, boolean var3) {
         UuvvNVnu.this.vuuuNvNuv();
         var1.request(1L);
         return null;
      }

      @Override
      public CompletionStage<?> onBinary(WebSocket var1, ByteBuffer var2, boolean var3) {
         UuvvNVnu.this.vuuuNvNuv();
         var1.request(1L);
         return null;
      }

      @Override
      public CompletionStage<?> onPing(WebSocket var1, ByteBuffer var2) {
         UuvvNVnu.this.vuuuNvNuv();
         var1.request(1L);
         return Listener.super.onPing(var1, var2);
      }

      @Override
      public CompletionStage<?> onPong(WebSocket var1, ByteBuffer var2) {
         UuvvNVnu.this.vuuuNvNuv();
         var1.request(1L);
         return null;
      }

      @Override
      public CompletionStage<?> onClose(WebSocket var1, int var2, String var3) {
         if (var1 == UuvvNVnu.this.nUUVuvU) {
            UuvvNVnu.this.nvUVNnuu();
         }

         return CompletableFuture.completedFuture(null);
      }

      @Override
      public void onError(WebSocket var1, Throwable var2) {
         if (var1 == UuvvNVnu.this.nUUVuvU) {
            UuvvNVnu.this.nvUVNnuu();
         }
      }
   }
}
