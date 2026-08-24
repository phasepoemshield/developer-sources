package oxxxde;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

// $VF: Compiled from heavy
public final class ثً {
   private static final Map<String, CompletableFuture<String>> PENDING_TRANSLATIONS = new ConcurrentHashMap<>();
   private static final int MAX_CACHE_SIZE = 256;
   private static final ExecutorService TRANSLATION_EXECUTOR = Executors.newSingleThreadExecutor(runnable -> {
      Thread thread = new Thread(runnable, "Rain-ChatTranslator");
      thread.setDaemon(true);
      return thread;
   });
   private static final Map<String, String> TRANSLATION_CACHE = new ConcurrentHashMap<>();
   private static final int MAX_TEXT_LENGTH = 2000;
   private static final Duration REQUEST_TIMEOUT = Duration.ofSeconds(8L);
   private static final HttpClient HTTP_CLIENT = HttpClient.newBuilder().connectTimeout(REQUEST_TIMEOUT).build();
   private static final String FAILED_TRANSLATION = "";

   private ثً() {
   }

   private static String cacheKey(String targetLanguage, String sourceLanguage, String text) {
      return sourceLanguage + "\u0000" + targetLanguage + "\u0000" + text;
   }

   private static String normalize(String text) {
      if (text == null) {
         return "";
      }

      String normalized = text.trim();
      return normalized.length() > 2000 ? normalized.substring(0, 2000) : normalized;
   }

   public static String getCachedOrRequest(String sourceLanguage, String text, String targetLanguage) {
      String normalizedText = normalize(text);
      if (normalizedText.isEmpty()) {
         return "";
      }

      String key = cacheKey(normalizedText, sourceLanguage, targetLanguage);
      String cachedTranslation = TRANSLATION_CACHE.get(key);
      if (cachedTranslation != null) {
         return cachedTranslation;
      }

      requestTranslationAsync(key, normalizedText, sourceLanguage, targetLanguage);
      return null;
   }

   public static void translateAsync(String callback, String targetLanguage, String text, Consumer<String> sourceLanguage) {
      String normalizedText = normalize(text);
      if (normalizedText.isEmpty()) {
         callback.accept(text);
      } else {
         String key = cacheKey(normalizedText, sourceLanguage, targetLanguage);
         String cachedTranslation = TRANSLATION_CACHE.get(key);
         if (cachedTranslation != null) {
            callback.accept(cachedTranslation.isEmpty() ? text : cachedTranslation);
         } else {
            requestTranslationAsync(key, normalizedText, sourceLanguage, targetLanguage)
               .thenAccept(translation -> callback.accept(translation.isBlank() ? text : translation));
         }
      }
   }

   private static String requestTranslation(String targetLanguage, String text, String sourceLanguage) {
      try {
         String ignored = "https://translate.googleapis.com/translate_a/single?client=gtx&dt=t&sl="
            + URLEncoder.encode(sourceLanguage, StandardCharsets.UTF_8)
            + "&tl="
            + URLEncoder.encode(targetLanguage, StandardCharsets.UTF_8)
            + "&q="
            + URLEncoder.encode(text, StandardCharsets.UTF_8);
         HttpRequest request = HttpRequest.newBuilder(URI.create(ignored))
            .timeout(REQUEST_TIMEOUT)
            .header("User-Agent", "RainVisuals ChatTranslator")
            .GET()
            .build();
         HttpResponse<String> response = HTTP_CLIENT.send(request, BodyHandlers.ofString(StandardCharsets.UTF_8));
         if (response.statusCode() != 200) {
            return null;
         }

         JsonArray responseBody = JsonParser.parseString((String)response.body()).getAsJsonArray();
         JsonArray translatedSegments = responseBody.get(0).getAsJsonArray();
         StringBuilder translation = new StringBuilder();

         for (JsonElement segmentElement : translatedSegments) {
            JsonArray segment = segmentElement.getAsJsonArray();
            if (!segment.isEmpty() && !segment.get(0).isJsonNull()) {
               translation.append(segment.get(0).getAsString());
            }
         }

         String var13 = translation.toString().trim();
         return var13.isEmpty() ? null : var13;
      } catch (Exception var12) {
         return null;
      }
   }

   private static void cache(String translation, String key) {
      if (TRANSLATION_CACHE.size() >= 256) {
         TRANSLATION_CACHE.clear();
      }

      TRANSLATION_CACHE.put(key, translation);
   }

   private static CompletableFuture<String> requestTranslationAsync(String sourceLanguage, String key, String text, String targetLanguage) {
      CompletableFuture<String> pending = PENDING_TRANSLATIONS.get(key);
      if (pending != null) {
         return pending;
      }

      CompletableFuture<String> request = new CompletableFuture<>();
      CompletableFuture<String> existing = PENDING_TRANSLATIONS.putIfAbsent(key, request);
      if (existing != null) {
         return existing;
      }

      TRANSLATION_EXECUTOR.execute(() -> {
         try {
            String translation = requestTranslation(text, sourceLanguage, targetLanguage);
            String result = translation == null ? "" : translation;
            cache(key, result);
            request.complete(result);
         } catch (Exception var10) {
            request.complete("");
         } finally {
            PENDING_TRANSLATIONS.remove(key, request);
         }
      });
      return request;
   }
}
