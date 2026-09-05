package ru.metaculture.protection;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import net.minecraft.class_310;

public final class nNvunNUnV {
   public static final String UuUVuuUu = "https://raw.githubusercontent.com/Minecraft-Wild/configs/main/";
   private static final Duration C00OOC00oO = Duration.ofSeconds(6L);
   private static final Duration uUnuvNvvNU = Duration.ofSeconds(10L);
   private static final Pattern vVvUvVVuuNvV = Pattern.compile("[A-Za-z0-9._-]+");
   private static final AtomicInteger uNNnnnuuuN = new AtomicInteger();
   private static final ExecutorService nuUnNvnuUu = Executors.newFixedThreadPool(2, var0 -> {
      Thread var1 = new Thread(var0, "Wild-CloudConfig-" + uNNnnnuuuN.incrementAndGet());
      var1.setDaemon(true);
      return var1;
   });
   private static final HttpClient VVuuUN = HttpClient.newBuilder().connectTimeout(C00OOC00oO).followRedirects(Redirect.NORMAL).executor(nuUnNvnuUu).build();
   private static volatile List<String> vNUvnnVnUvu = List.of();

   private nNvunNUnV() {
   }

   public static CompletableFuture<nNvunNUnV.nvnNNunvv> UuUVuuUu(String var0) {
      URI var1 = C00OOC00oO(var0);
      String var2 = UuUVuuUu(var0, var1);
      if (var1 == null) {
         return CompletableFuture.completedFuture(nNvunNUnV.nvnNNunvv.failure(var2, null, "Некорректное имя или URL."));
      } else {
         HttpRequest var3 = UuUVuuUu(var1);
         return VVuuUN.sendAsync(var3, BodyHandlers.ofString(StandardCharsets.UTF_8))
            .thenComposeAsync(var2x -> UuUVuuUu(var2, var1, (HttpResponse<String>)var2x), nuUnNvnuUu)
            .exceptionally(var2x -> nNvunNUnV.nvnNNunvv.failure(var2, var1.toString(), UuUVuuUu(var2x)));
      }
   }

   public static CompletableFuture<nNvunNUnV.NVnVnNnN> UuUVuuUu() {
      URI var0 = vVvUvVVuuNvV();
      HttpRequest var1 = UuUVuuUu(var0);
      return VVuuUN.sendAsync(var1, BodyHandlers.ofString(StandardCharsets.UTF_8))
         .thenApplyAsync(var1x -> UuUVuuUu(var0, (HttpResponse<String>)var1x), nuUnNvnuUu)
         .exceptionally(var1x -> nNvunNUnV.NVnVnNnN.failure(var0.toString(), UuUVuuUu(var1x)));
   }

   public static List<String> C00OOC00oO() {
      return vNUvnnVnUvu;
   }

   public static void uUnuvNvvNU() {
      nuUnNvnuUu.shutdownNow();
   }

   private static CompletableFuture<nNvunNUnV.nvnNNunvv> UuUVuuUu(String var0, URI var1, HttpResponse<String> var2) {
      if (!UuUVuuUu(var2.statusCode())) {
         return CompletableFuture.completedFuture(nNvunNUnV.nvnNNunvv.failure(var0, var1.toString(), "HTTP " + var2.statusCode()));
      } else {
         JsonElement var3;
         try {
            var3 = JsonParser.parseString((String)var2.body());
         } catch (Exception var5) {
            return CompletableFuture.completedFuture(nNvunNUnV.nvnNNunvv.failure(var0, var1.toString(), "Некорректный JSON: " + C00OOC00oO(var5)));
         }

         if (var3 != null && var3.isJsonObject()) {
            JsonObject var4 = var3.getAsJsonObject();
            return UuUVuuUu((Callable<nNvunNUnV.VvunVVUvUNnv>)(() -> UuUVuuUu(var0, var1, var4))).thenApplyAsync(nNvunNUnV::UuUVuuUu, nuUnNvnuUu);
         } else {
            return CompletableFuture.completedFuture(nNvunNUnV.nvnNNunvv.failure(var0, var1.toString(), "Файл должен содержать JSON-объект."));
         }
      }
   }

   private static nNvunNUnV.VvunVVUvUNnv UuUVuuUu(String var0, URI var1, JsonObject var2) {
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu == null || ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU == null) {
         return nNvunNUnV.VvunVVUvUNnv.failure(var0, var1.toString(), "ConfigManager не инициализирован.");
      } else if (!ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU.UuUVuuUu(var0, var2)) {
         return nNvunNUnV.VvunVVUvUNnv.failure(var0, var1.toString(), "Не удалось применить конфиг.");
      } else {
         UNVVUvUnNuNU var3 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU(var0);
         return var3 == null
            ? nNvunNUnV.VvunVVUvUNnv.failure(var0, var1.toString(), "Не удалось подготовить локальную копию.")
            : nNvunNUnV.VvunVVUvUNnv.success(var0, var1.toString(), var3.UuUVuuUu(), var3.uUnuvNvvNU());
      }
   }

   private static nNvunNUnV.nvnNNunvv UuUVuuUu(nNvunNUnV.VvunVVUvUNnv var0) {
      if (!var0.success()) {
         return nNvunNUnV.nvnNNunvv.failure(var0.name(), var0.url(), var0.error());
      } else {
         try {
            if (!NnunnNUUUNVn.UuUVuuUu.exists() && !NnunnNUUUNVn.UuUVuuUu.mkdirs()) {
               return nNvunNUnV.nvnNNunvv.failure(var0.name(), var0.url(), "Не удалось создать папку конфигов.");
            } else {
               String var1 = new GsonBuilder().setPrettyPrinting().create().toJson(var0.object());
               Files.writeString(var0.file().toPath(), var1, StandardCharsets.UTF_8);
               return nNvunNUnV.nvnNNunvv.success(var0.name(), var0.url());
            }
         } catch (Exception var2) {
            return nNvunNUnV.nvnNNunvv.failure(var0.name(), var0.url(), "Конфиг применен, но не сохранен на диск.");
         }
      }
   }

   private static nNvunNUnV.NVnVnNnN UuUVuuUu(URI var0, HttpResponse<String> var1) {
      if (!UuUVuuUu(var1.statusCode())) {
         return nNvunNUnV.NVnVnNnN.failure(var0.toString(), "HTTP " + var1.statusCode());
      } else {
         JsonElement var2;
         try {
            var2 = JsonParser.parseString((String)var1.body());
         } catch (Exception var8) {
            return nNvunNUnV.NVnVnNnN.failure(var0.toString(), "Некорректный index.json: " + C00OOC00oO(var8));
         }

         if (var2 != null && var2.isJsonArray()) {
            JsonArray var3 = var2.getAsJsonArray();
            LinkedHashSet var4 = new LinkedHashSet();

            for (JsonElement var6 : var3) {
               String var7 = UuUVuuUu(var6);
               if (var7 != null) {
                  var4.add(var7);
               }
            }

            List var9 = List.copyOf(var4);
            vNUvnnVnUvu = var9;
            return nNvunNUnV.NVnVnNnN.success(var9, var0.toString());
         } else {
            return nNvunNUnV.NVnVnNnN.failure(var0.toString(), "index.json должен быть JSON-массивом.");
         }
      }
   }

   private static String UuUVuuUu(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         String var1 = null;

         try {
            if (var0.isJsonPrimitive()) {
               var1 = var0.getAsString();
            } else if (var0.isJsonObject()) {
               JsonObject var2 = var0.getAsJsonObject();
               if (var2.has("name")) {
                  var1 = var2.get("name").getAsString();
               }
            }
         } catch (Exception var3) {
            return null;
         }

         return uUnuvNvvNU(var1);
      } else {
         return null;
      }
   }

   private static URI C00OOC00oO(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String var1 = var0.trim();
         if (!var1.startsWith("https://") && !var1.startsWith("http://")) {
            String var2 = uUnuvNvvNU(var1);
            if (var2 == null) {
               return null;
            } else {
               String var3 = URLEncoder.encode(var2, StandardCharsets.UTF_8).replace("+", "%20");
               return URI.create(uNNnnnuuuN() + var3 + ".json");
            }
         } else {
            try {
               return URI.create(var1);
            } catch (Exception var4) {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static URI vVvUvVVuuNvV() {
      return URI.create(uNNnnnuuuN() + "index.json");
   }

   private static HttpRequest UuUVuuUu(URI var0) {
      return HttpRequest.newBuilder(var0).timeout(uUnuvNvvNU).header("Accept", "application/json").header("User-Agent", "WildClient-CloudConfig").GET().build();
   }

   private static String uNNnnnuuuN() {
      String var0 = System.getProperty("wild.config.repo");
      if (var0 == null || var0.isBlank()) {
         var0 = System.getenv("WILD_CONFIG_REPO");
      }

      if (var0 == null || var0.isBlank()) {
         var0 = "https://raw.githubusercontent.com/Minecraft-Wild/configs/main/";
      }

      var0 = var0.trim();
      return var0.endsWith("/") ? var0 : var0 + "/";
   }

   private static String uUnuvNvvNU(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String var1 = var0.trim();
         if (var1.endsWith(".json")) {
            var1 = var1.substring(0, var1.length() - 5);
         }

         return !var1.isBlank() && vVvUvVVuuNvV.matcher(var1).matches() ? var1 : null;
      }
   }

   private static String UuUVuuUu(String var0, URI var1) {
      String var2 = null;
      if (var0 != null) {
         String var3 = var0.trim();
         if (!var3.startsWith("https://") && !var3.startsWith("http://")) {
            var2 = uUnuvNvvNU(var3);
         } else {
            String var4 = var1 == null ? "" : var1.getPath();
            int var5 = var4.lastIndexOf(47);
            var2 = var5 >= 0 ? var4.substring(var5 + 1) : "cloud";
         }
      }

      if (var2 == null || var2.isBlank()) {
         var2 = "cloud";
      }

      if (var2.endsWith(".json")) {
         var2 = var2.substring(0, var2.length() - 5);
      }

      var2 = var2.replaceAll("[^A-Za-z0-9._-]", "_");
      return var2.isBlank() ? "cloud" : var2;
   }

   private static boolean UuUVuuUu(int var0) {
      return var0 >= 200 && var0 < 300;
   }

   private static <T> CompletableFuture<T> UuUVuuUu(Callable<T> var0) {
      CompletableFuture var1 = new CompletableFuture();
      class_310 var2 = class_310.method_1551();
      Runnable var3 = () -> {
         try {
            var1.complete(var0.call());
         } catch (Throwable var3x) {
            var1.completeExceptionally(var3x);
         }
      };
      if (var2 == null) {
         var3.run();
      } else {
         var2.execute(var3);
      }

      return var1;
   }

   private static String UuUVuuUu(Throwable var0) {
      Throwable var1 = var0;

      while (var1 instanceof CompletionException && var1.getCause() != null) {
         var1 = var1.getCause();
      }

      return C00OOC00oO(var1);
   }

   private static String C00OOC00oO(Throwable var0) {
      if (var0 == null) {
         return "неизвестная ошибка";
      } else {
         String var1 = var0.getMessage();
         return var1 != null && !var1.isBlank() ? var1 : var0.getClass().getSimpleName();
      }
   }

   public record NVnVnNnN(boolean success, List<String> names, String url, String error) {
      public NVnVnNnN(boolean success, List<String> names, String url, String error) {
         names = names == null ? List.of() : List.copyOf(new ArrayList(names));
         this.success = success;
         this.names = names;
         this.url = url;
         this.error = error;
      }

      public static nNvunNUnV.NVnVnNnN success(List<String> var0, String var1) {
         return new nNvunNUnV.NVnVnNnN(true, var0, var1, null);
      }

      public static nNvunNUnV.NVnVnNnN failure(String var0, String var1) {
         return new nNvunNUnV.NVnVnNnN(false, List.of(), var0, var1);
      }
   }

   record VvunVVUvUNnv(boolean success, String name, String url, File file, JsonObject object, String error) {
      public static nNvunNUnV.VvunVVUvUNnv success(String var0, String var1, File var2, JsonObject var3) {
         return new nNvunNUnV.VvunVVUvUNnv(true, var0, var1, var2, var3, null);
      }

      public static nNvunNUnV.VvunVVUvUNnv failure(String var0, String var1, String var2) {
         return new nNvunNUnV.VvunVVUvUNnv(false, var0, var1, null, null, var2);
      }
   }

   public record nvnNNunvv(boolean success, String name, String url, String error) {
      public static nNvunNUnV.nvnNNunvv success(String var0, String var1) {
         return new nNvunNUnV.nvnNNunvv(true, var0, var1, null);
      }

      public static nNvunNUnV.nvnNNunvv failure(String var0, String var1, String var2) {
         return new nNvunNUnV.nvnNNunvv(false, var0, var1, var2);
      }
   }
}
