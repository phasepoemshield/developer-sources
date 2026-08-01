package l;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.Arrays;
import java.util.HexFormat;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public final class Helper228 {
   private static final String MOD_ID = "rich";
   private static final String CONFIG_RESOURCE = "releon-update.properties";
   private static final Gson GSON = new Gson();
   private static final HttpClient HTTP = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10L)).followRedirects(Redirect.NORMAL).build();
   private static final AtomicBoolean started = new AtomicBoolean(false);

   private Helper228() {
   }

   public static void method2036() {
      if (started.compareAndSet(false, true)) {
         CompletableFuture.runAsync(() -> {
            try {
               method2037();
            } catch (Throwable var1) {
               Helper211.method1811("Update check failed", var1);
            }
         });
      }
   }

   private static void method2037() throws java.io.IOException, InterruptedException {
      String var0 = method2038();
      if (!method2049(var0) && !method2048(var0)) {
         Helper227 var1 = method2039(var0);
         if (var1 != null && !method2049(var1.version) && !method2049(var1.downloadUrl)) {
            String var2 = method2042();
            if (!method2043(var1.version, var2)) {
               Helper211.method1807("Releon is up to date: " + var2);
            } else {
               Path var3 = method2041().resolve(method2045(var1.fileName, var1.version));
               method2040(var1.downloadUrl, var3, var1.sha256);
               method2047(var2, var1, var3);
            }
         } else {
            Helper211.method1810("Update manifest is incomplete: " + var0);
         }
      } else {
         Helper211.method1807("Update checker disabled: manifest URL is not configured");
      }
   }

   private static String method2038() throws java.io.IOException {
      String var0 = System.getProperty("releon.updateManifestUrl");
      if (!method2049(var0)) {
         return var0.trim();
      } else {
         Properties var1 = new Properties();

         try (InputStream var2 = Helper228.class.getClassLoader().getResourceAsStream("releon-update.properties")) {
            if (var2 == null) {
               return "";
            }

            var1.load(var2);
         }

         return var1.getProperty("manifestUrl", "").trim();
      }
   }

   private static Helper227 method2039(String var0) throws java.io.IOException, InterruptedException {
      HttpRequest var1 = HttpRequest.newBuilder(URI.create(var0)).timeout(Duration.ofSeconds(20L)).header("Accept", "application/json").GET().build();
      HttpResponse var2 = HTTP.send(var1, BodyHandlers.ofString(StandardCharsets.UTF_8));
      if (var2.statusCode() >= 200 && var2.statusCode() < 300) {
         try {
            return (Helper227)GSON.fromJson((String)var2.body(), Helper227.class);
         } catch (JsonSyntaxException var4) {
            Helper211.method1811("Update manifest is not valid JSON", var4);
            return null;
         }
      } else {
         Helper211.method1810("Update manifest request returned HTTP " + var2.statusCode());
         return null;
      }
   }

   private static void method2040(String var0, Path var1, String var2) throws java.io.IOException, InterruptedException {
      Files.createDirectories(var1.getParent());
      Path var3 = var1.resolveSibling(var1.getFileName() + ".download");
      HttpRequest var4 = HttpRequest.newBuilder(URI.create(var0)).timeout(Duration.ofMinutes(3L)).GET().build();
      HttpResponse var5 = HTTP.send(var4, BodyHandlers.ofInputStream());
      if (var5.statusCode() >= 200 && var5.statusCode() < 300) {
         try (InputStream var6 = (InputStream)var5.body()) {
            Files.copy(var6, var3, StandardCopyOption.REPLACE_EXISTING);
         }

         if (!method2049(var2)) {
            String var11 = method2046(var3);
            if (!var11.equalsIgnoreCase(var2.trim())) {
               Files.deleteIfExists(var3);
               throw new IOException("Downloaded update hash mismatch: " + var11);
            }
         }

         Files.move(var3, var1, StandardCopyOption.REPLACE_EXISTING);
      } else {
         throw new IOException("Update download returned HTTP " + var5.statusCode());
      }
   }

   private static Path method2041() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      return var0 != null && var0.runDirectory != null
         ? var0.runDirectory.toPath().resolve("Releon").resolve("Updates")
         : FabricLoader.getInstance().getGameDir().resolve("Releon").resolve("Updates");
   }

   private static String method2042() {
      Optional<String> var0 = FabricLoader.getInstance().getModContainer("rich").map(var0x -> var0x.getMetadata().getVersion().getFriendlyString());
      return var0.orElse("0.0.0");
   }

   private static boolean method2043(String var0, String var1) {
      int[] var2 = method2044(var0);
      int[] var3 = method2044(var1);
      int var4 = Math.max(var2.length, var3.length);

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = var5 < var2.length ? var2[var5] : 0;
         int var7 = var5 < var3.length ? var3[var5] : 0;
         if (var6 != var7) {
            return var6 > var7;
         }
      }

      return false;
   }

   private static int[] method2044(String var0) {
      String[] var1 = var0 == null ? new String[0] : var0.split("[^0-9]+");
      return Arrays.stream(var1).filter(var0x -> !var0x.isBlank()).mapToInt(var0x -> {
         try {
            return Integer.parseInt(var0x);
         } catch (NumberFormatException var2) {
            return 0;
         }
      }).toArray();
   }

   private static String method2045(String var0, String var1) {
      String var2 = method2049(var0) ? "Releon-" + var1 + ".jar" : var0.trim();
      var2 = var2.replace('\\', '_')
         .replace('/', '_')
         .replace(':', '_')
         .replace('*', '_')
         .replace('?', '_')
         .replace('"', '_')
         .replace('<', '_')
         .replace('>', '_')
         .replace('|', '_');
      return var2.endsWith(".jar") ? var2 : var2 + ".jar";
   }

   private static String method2046(Path var0) throws java.io.IOException {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");

         try (InputStream var2 = Files.newInputStream(var0)) {
            byte[] var3 = new byte[8192];

            int var4;
            while ((var4 = var2.read(var3)) != -1) {
               var1.update(var3, 0, var4);
            }
         }

         return HexFormat.of().formatHex(var1.digest());
      } catch (Exception var7) {
         throw new IOException("Could not calculate SHA-256", var7);
      }
   }

   private static void method2047(String var0, Helper227 var1, Path var2) {
      String var3 = !method2049(var1.message) ? var1.message : "New Releon update downloaded";
      Helper211.method1807(var3 + ": " + var0 + " -> " + var1.version + " (" + var2 + ")");
      MinecraftClient var4 = MinecraftClient.getInstance();
      if (var4 != null) {
         var4.execute(() -> {
            if (var4.player != null) {
               var4.player.sendMessage(Text.literal("[Releon] Update downloaded: " + var0 + " -> " + var1.version).formatted(Formatting.GREEN), false);
               var4.player.sendMessage(Text.literal("[Releon] File: " + var2.toAbsolutePath()).formatted(Formatting.YELLOW), false);
               var4.player.sendMessage(Text.literal("[Releon] Close Minecraft and replace the old jar in mods.").formatted(Formatting.GRAY), false);
            }
         });
      }
   }

   private static boolean method2048(String var0) {
      String var1 = var0.toLowerCase();
      return var1.contains("example.com") || var1.contains("paste_manifest_url_here");
   }

   private static boolean method2049(String var0) {
      return var0 == null || var0.isBlank();
   }
}
