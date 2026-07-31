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
import net.minecraft.client.MinecraftClient;

public final class CloudConfigService {
   public static final String O00000000 = "https://raw.githubusercontent.com/Minecraft-Wild/configs/main/";
   private static final Duration O000000000 = Duration.ofSeconds(6L);
   private static final Duration O0000000000 = Duration.ofSeconds(10L);
   private static final Pattern O00000000000 = Pattern.compile("[A-Za-z0-9._-]+");
   private static final AtomicInteger O000000000000 = new AtomicInteger();
   private static final ExecutorService O0000000000000 = Executors.newFixedThreadPool(2, runnable -> {
      Thread var1 = new Thread(runnable, "Wild-CloudConfig-" + O000000000000.incrementAndGet());
      var1.setDaemon(true);
      return var1;
   });
   private static final HttpClient O000000000000O = HttpClient.newBuilder()
      .connectTimeout(O000000000)
      .followRedirects(Redirect.NORMAL)
      .executor(O0000000000000)
      .build();
   private static volatile List<String> O00000000000O = List.of();

   private CloudConfigService() {
   }

   public static CompletableFuture<CloudConfigService.W11> O00000000(String string) {
      URI var1 = O000000000(string);
      String var2 = O00000000(string, var1);
      if (var1 == null) {
         return CompletableFuture.completedFuture(CloudConfigService.W11.failure(var2, null, "Некорректное имя или URL."));
      } else {
         HttpRequest var3 = O00000000(var1);
         return O000000000000O.sendAsync(var3, BodyHandlers.ofString(StandardCharsets.UTF_8))
            .thenComposeAsync(httpResponse -> O00000000(var2, var1, (HttpResponse<String>)httpResponse), O0000000000000)
            .exceptionally(throwable -> CloudConfigService.W11.failure(var2, var1.toString(), O00000000(throwable)));
      }
   }

   public static CompletableFuture<CloudConfigService.W10> O00000000() {
      URI var0 = O00000000000();
      HttpRequest var1 = O00000000(var0);
      return O000000000000O.sendAsync(var1, BodyHandlers.ofString(StandardCharsets.UTF_8))
         .thenApplyAsync(httpResponse -> O00000000(var0, (HttpResponse<String>)httpResponse), O0000000000000)
         .exceptionally(throwable -> CloudConfigService.W10.failure(var0.toString(), O00000000(throwable)));
   }

   public static List<String> O000000000() {
      return O00000000000O;
   }

   public static void O0000000000() {
      O0000000000000.shutdownNow();
   }

   private static CompletableFuture<CloudConfigService.W11> O00000000(String string, URI uRI, HttpResponse<String> httpResponse) {
      if (!O00000000(httpResponse.statusCode())) {
         return CompletableFuture.completedFuture(CloudConfigService.W11.failure(string, uRI.toString(), "HTTP " + httpResponse.statusCode()));
      } else {
         JsonElement var3;
         try {
            var3 = JsonParser.parseString((String)httpResponse.body());
         } catch (Exception var5) {
            return CompletableFuture.completedFuture(CloudConfigService.W11.failure(string, uRI.toString(), "Некорректный JSON: " + O000000000(var5)));
         }

         if (var3 != null && var3.isJsonObject()) {
            JsonObject var4 = var3.getAsJsonObject();
            return O00000000((Callable<CloudConfigService.W12>)(() -> O00000000(string, uRI, var4)))
               .thenApplyAsync(CloudConfigService::O00000000, O0000000000000);
         } else {
            return CompletableFuture.completedFuture(CloudConfigService.W11.failure(string, uRI.toString(), "Файл должен содержать JSON-объект."));
         }
      }
   }

   private static CloudConfigService.W12 O00000000(String string, URI uRI, JsonObject jsonObject) {
      if (WildClient.O00000000 == null || WildClient.O00000000.O0000000000O00 == null) {
         return CloudConfigService.W12.failure(string, uRI.toString(), "ConfigManager не инициализирован.");
      } else if (!WildClient.O00000000.O0000000000O00.O00000000(string, jsonObject)) {
         return CloudConfigService.W12.failure(string, uRI.toString(), "Не удалось применить конфиг.");
      } else {
         Config var3 = WildClient.O00000000.O0000000000O00.O0000000000(string);
         return var3 == null
            ? CloudConfigService.W12.failure(string, uRI.toString(), "Не удалось подготовить локальную копию.")
            : CloudConfigService.W12.success(string, uRI.toString(), var3.O00000000(), var3.O0000000000());
      }
   }

   private static CloudConfigService.W11 O00000000(CloudConfigService.W12 o0000000000) {
      if (!o0000000000.success()) {
         return CloudConfigService.W11.failure(o0000000000.name(), o0000000000.url(), o0000000000.error());
      } else {
         try {
            if (!ConfigManager.O00000000.exists() && !ConfigManager.O00000000.mkdirs()) {
               return CloudConfigService.W11.failure(o0000000000.name(), o0000000000.url(), "Не удалось создать папку конфигов.");
            } else {
               String var1 = new GsonBuilder().setPrettyPrinting().create().toJson(o0000000000.object());
               Files.writeString(o0000000000.file().toPath(), var1, StandardCharsets.UTF_8);
               return CloudConfigService.W11.success(o0000000000.name(), o0000000000.url());
            }
         } catch (Exception var2) {
            return CloudConfigService.W11.failure(o0000000000.name(), o0000000000.url(), "Конфиг применен, но не сохранен на диск.");
         }
      }
   }

   private static CloudConfigService.W10 O00000000(URI uRI, HttpResponse<String> httpResponse) {
      if (!O00000000(httpResponse.statusCode())) {
         return CloudConfigService.W10.failure(uRI.toString(), "HTTP " + httpResponse.statusCode());
      } else {
         JsonElement var2;
         try {
            var2 = JsonParser.parseString((String)httpResponse.body());
         } catch (Exception var8) {
            return CloudConfigService.W10.failure(uRI.toString(), "Некорректный index.json: " + O000000000(var8));
         }

         if (var2 != null && var2.isJsonArray()) {
            JsonArray var3 = var2.getAsJsonArray();
            LinkedHashSet var4 = new LinkedHashSet();

            for (JsonElement var6 : var3) {
               String var7 = O00000000(var6);
               if (var7 != null) {
                  var4.add(var7);
               }
            }

            List var9 = List.copyOf(var4);
            O00000000000O = var9;
            return CloudConfigService.W10.success(var9, uRI.toString());
         } else {
            return CloudConfigService.W10.failure(uRI.toString(), "index.json должен быть JSON-массивом.");
         }
      }
   }

   private static String O00000000(JsonElement jsonElement) {
      if (jsonElement != null && !jsonElement.isJsonNull()) {
         String var1 = null;

         try {
            if (jsonElement.isJsonPrimitive()) {
               var1 = jsonElement.getAsString();
            } else if (jsonElement.isJsonObject()) {
               JsonObject var2 = jsonElement.getAsJsonObject();
               if (var2.has("name")) {
                  var1 = var2.get("name").getAsString();
               }
            }
         } catch (Exception var3) {
            return null;
         }

         return O0000000000(var1);
      } else {
         return null;
      }
   }

   private static URI O000000000(String string) {
      if (string != null && !string.isBlank()) {
         String var1 = string.trim();
         if (!var1.startsWith("https://") && !var1.startsWith("http://")) {
            String var2 = O0000000000(var1);
            if (var2 == null) {
               return null;
            } else {
               String var3 = URLEncoder.encode(var2, StandardCharsets.UTF_8).replace("+", "%20");
               return URI.create(O000000000000() + var3 + ".json");
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

   private static URI O00000000000() {
      return URI.create(O000000000000() + "index.json");
   }

   private static HttpRequest O00000000(URI uRI) {
      return HttpRequest.newBuilder(uRI).timeout(O0000000000).header("Accept", "application/json").header("User-Agent", "WildClient-CloudConfig").GET().build();
   }

   private static String O000000000000() {
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

   private static String O0000000000(String string) {
      if (string == null) {
         return null;
      } else {
         String var1 = string.trim();
         if (var1.endsWith(".json")) {
            var1 = var1.substring(0, var1.length() - 5);
         }

         return !var1.isBlank() && O00000000000.matcher(var1).matches() ? var1 : null;
      }
   }

   private static String O00000000(String string, URI uRI) {
      String var2 = null;
      if (string != null) {
         String var3 = string.trim();
         if (!var3.startsWith("https://") && !var3.startsWith("http://")) {
            var2 = O0000000000(var3);
         } else {
            String var4 = uRI == null ? "" : uRI.getPath();
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

   private static boolean O00000000(int i) {
      return i >= 200 && i < 300;
   }

   private static <T> CompletableFuture<T> O00000000(Callable<T> callable) {
      CompletableFuture var1 = new CompletableFuture();
      MinecraftClient var2 = MinecraftClient.getInstance();
      Runnable var3 = () -> {
         try {
            var1.complete(callable.call());
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

   private static String O00000000(Throwable throwable) {
      Throwable var1 = throwable;

      while (var1 instanceof CompletionException && var1.getCause() != null) {
         var1 = var1.getCause();
      }

      return O000000000(var1);
   }

   private static String O000000000(Throwable throwable) {
      if (throwable == null) {
         return "неизвестная ошибка";
      } else {
         String var1 = throwable.getMessage();
         return var1 != null && !var1.isBlank() ? var1 : throwable.getClass().getSimpleName();
      }
   }

   public record W10(boolean success, List<String> names, String url, String error) {
      public W10(boolean success, List<String> names, String url, String error) {
         names = names == null ? List.of() : List.copyOf(new ArrayList(names));
         this.success = success;
         this.names = names;
         this.url = url;
         this.error = error;
      }

      public static CloudConfigService.W10 success(List<String> list, String string) {
         return new CloudConfigService.W10(true, list, string, null);
      }

      public static CloudConfigService.W10 failure(String string, String string2) {
         return new CloudConfigService.W10(false, List.of(), string, string2);
      }
   }

   public record W11(boolean success, String name, String url, String error) {
      public static CloudConfigService.W11 success(String string, String string2) {
         return new CloudConfigService.W11(true, string, string2, null);
      }

      public static CloudConfigService.W11 failure(String string, String string2, String string3) {
         return new CloudConfigService.W11(false, string, string2, string3);
      }
   }

   record W12(boolean success, String name, String url, File file, JsonObject object, String error) {
      public static CloudConfigService.W12 success(String string, String string2, File file, JsonObject jsonObject) {
         return new CloudConfigService.W12(true, string, string2, file, jsonObject, null);
      }

      public static CloudConfigService.W12 failure(String string, String string2, String string3) {
         return new CloudConfigService.W12(false, string, string2, null, null, string3);
      }
   }
}
