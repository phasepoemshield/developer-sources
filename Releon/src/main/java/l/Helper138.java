package l;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;

public final class Helper138 {
   private static final AtomicBoolean STARTED = new AtomicBoolean();
   private static final AtomicBoolean RELOADING = new AtomicBoolean();
   private static final AtomicBoolean RELOAD_PENDING = new AtomicBoolean();
   private static final AtomicLong RELOAD_SEQUENCE = new AtomicLong();
   private static final long RELOAD_DEBOUNCE_MS = 500L;
   private static final long STABILITY_CHECK_MS = 250L;
   private static final long RELOAD_TIMEOUT_SECONDS = 10L;

   private Helper138() {
   }

   public static void method1184() {
      if (STARTED.compareAndSet(false, true)) {
         Path var0 = FabricLoader.getInstance().getGameDir().toAbsolutePath().normalize();
         Path var1 = var0.getParent();
         if (var1 != null) {
            Path var2 = var1.resolve("src/main/resources/assets/mre/shaders");
            Path var3 = var1.resolve("build/resources/main/assets/mre/shaders");
            Path var4 = Files.isDirectory(var2) ? var2 : var3;
            Thread var5 = new Thread(() -> method1185(var4, var2, var3), "releon-shader-hot-reload");
            var5.setDaemon(true);
            var5.start();
         }
      }
   }

   private static void method1185(Path var0, Path var1, Path var2) {
      try {
         method1186(var0);
         method1188(var1, var2);
         WatchService var3 = FileSystems.getDefault().newWatchService();
         method1187(var0, var3);
         Helper211.method1807("Shader hot reload is watching " + var0);

         while (!Thread.currentThread().isInterrupted()) {
            WatchKey var4 = var3.take();
            boolean var5 = false;

            for (WatchEvent var7 : var4.pollEvents()) {
               if (var7.kind() != StandardWatchEventKinds.OVERFLOW) {
                  Path var8 = (Path)var7.context();
                  if (method1190(var8)) {
                     var5 = true;
                  }
               }
            }

            if (!var4.reset()) {
               break;
            }

            if (var5) {
               Thread.sleep(500L);
               method1191(var0);
               method1188(var1, var2);
               method1193();
            }
         }
      } catch (InterruptedException var9) {
         Thread.currentThread().interrupt();
      } catch (IOException var10) {
         Helper211.method1811("Shader hot reload watcher failed", var10);
      }
   }

   private static void method1186(Path var0) {
      try {
         while (!Files.isDirectory(var0)) {
            Thread.sleep(500L);
         }
      } catch (InterruptedException var2) {
         Thread.currentThread().interrupt();
      }
   }

   private static void method1187(Path var0, WatchService var1) {
      try {
         try (Stream<java.nio.file.Path> var2 = Files.walk(var0)) {
            var2.filter(var0x -> Files.isDirectory(var0x)).forEach(var1x -> {
               try {
                  var1x.register(var1, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY);
               } catch (IOException var3) {
                  throw new Exception4(var3);
               }
            });
         }
      } catch (Exception4 var7) {
         throw new RuntimeException(var7.method1181());
      } catch (java.io.IOException var9) {
         throw new RuntimeException(var9);
      }
   }

   private static void method1188(Path var0, Path var1) {
      if (Files.isDirectory(var0)) {
         try (Stream<java.nio.file.Path> var2 = Files.walk(var0)) {
            var2.filter(var0x -> Files.isRegularFile(var0x)).filter(Helper138::method1190).forEach(var2x -> method1189(var0, var1, var2x));
         } catch (IOException var7) {
            Helper211.method1811("Failed to sync shader sources before reload", var7);
         }
      }
   }

   private static void method1189(Path var0, Path var1, Path var2) {
      try {
         Path var3 = var0.relativize(var2);
         Path var4 = var1.resolve(var3);
         Files.createDirectories(var4.getParent());
         Files.copy(var2, var4, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
      } catch (IOException var5) {
         Helper211.method1811("Failed to copy shader file " + var2, var5);
      }
   }

   private static boolean method1190(Path var0) {
      String var1 = var0.getFileName().toString().toLowerCase();
      return var1.endsWith(".fsh") || var1.endsWith(".vsh") || var1.endsWith(".glsl") || var1.endsWith(".json");
   }

   private static void method1191(Path var0) {
      try {
         Map<java.nio.file.Path, Helper137> var1 = method1192(var0);

         for (int var2 = 0; var2 < 8; var2++) {
            Thread.sleep(250L);
            Map<java.nio.file.Path, Helper137> var3 = method1192(var0);
            if (var3.equals(var1)) {
               return;
            }

            var1 = var3;
         }
      } catch (InterruptedException var4) {
         Thread.currentThread().interrupt();
      }
   }

   private static Map<Path, Helper137> method1192(Path var0) {
      HashMap<java.nio.file.Path, Helper137> var1 = new HashMap<>();

      try (Stream<java.nio.file.Path> var2 = Files.walk(var0)) {
         var2.filter(var0x -> Files.isRegularFile(var0x)).filter(Helper138::method1190).forEach(var1x -> {
            try {
               var1.put(var1x, new Helper137(Files.size(var1x), Files.getLastModifiedTime(var1x).toMillis()));
            } catch (IOException var3) {
            }
         });
      } catch (java.io.IOException var4) {
         throw new RuntimeException(var4);
      }

      return var1;
   }

   private static void method1193() {
      RELOAD_PENDING.set(true);
      method1194();
   }

   private static void method1194() {
      if (RELOAD_PENDING.get() && RELOADING.compareAndSet(false, true)) {
         RELOAD_PENDING.set(false);
         MinecraftClient var0 = MinecraftClient.getInstance();
         long var1 = RELOAD_SEQUENCE.incrementAndGet();
         var0.execute(() -> {
            var0.reloadResources().whenComplete((var2, var3) -> method1195(var1, var3));
            CompletableFuture.delayedExecutor(10L, TimeUnit.SECONDS).execute(() -> {
               if (RELOAD_SEQUENCE.get() == var1 && RELOADING.compareAndSet(true, false)) {
                  Helper211.method1810("Automatic shader reload timed out; watcher recovered");
                  method1194();
               }
            });
         });
      }
   }

   private static void method1195(long var0, Throwable var2) {
      if (RELOAD_SEQUENCE.get() == var0 && RELOADING.compareAndSet(true, false)) {
         if (var2 == null) {
            Helper211.method1807("Shaders reloaded automatically");
         } else {
            Helper211.method1811("Automatic shader reload failed", var2);
         }

         method1194();
      }
   }
}
