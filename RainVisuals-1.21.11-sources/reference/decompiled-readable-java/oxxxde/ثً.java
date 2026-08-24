/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public final class \u062b\u064b {
    private static final Map<String, CompletableFuture<String>> PENDING_TRANSLATIONS;
    private static final int MAX_CACHE_SIZE = 256;
    private static final ExecutorService TRANSLATION_EXECUTOR;
    private static final Map<String, String> TRANSLATION_CACHE;
    private static final int MAX_TEXT_LENGTH = 2000;
    private static final Duration REQUEST_TIMEOUT;
    private static final HttpClient HTTP_CLIENT;
    private static final String FAILED_TRANSLATION = "";

    private \u062b\u064b() {
    }

    private static String cacheKey(String text, String sourceLanguage, String targetLanguage) {
        return sourceLanguage + "\u0000" + targetLanguage + "\u0000" + text;
    }

    /*
     * WARNING - void declaration
     */
    private static String normalize(String text) {
        void var1_1;
        if (text == null) {
            return FAILED_TRANSLATION;
        }
        String normalized = text.trim();
        if (normalized.length() > 2000) {
            return normalized.substring(0, 2000);
        }
        return var1_1;
    }

    public static String getCachedOrRequest(String text, String sourceLanguage, String targetLanguage) {
        String normalizedText = \u062b\u064b.normalize(text);
        if (normalizedText.isEmpty()) {
            return FAILED_TRANSLATION;
        }
        String key = \u062b\u064b.cacheKey(normalizedText, sourceLanguage, targetLanguage);
        String cachedTranslation = TRANSLATION_CACHE.get(key);
        if (cachedTranslation != null) {
            return cachedTranslation;
        }
        \u062b\u064b.requestTranslationAsync(key, normalizedText, sourceLanguage, targetLanguage);
        return null;
    }

    public static void translateAsync(String text, String sourceLanguage, String targetLanguage, Consumer<String> callback) {
        String normalizedText = \u062b\u064b.normalize(text);
        if (normalizedText.isEmpty()) {
            callback.accept(text);
            return;
        }
        String key = \u062b\u064b.cacheKey(normalizedText, sourceLanguage, targetLanguage);
        String cachedTranslation = TRANSLATION_CACHE.get(key);
        if (cachedTranslation != null) {
            callback.accept(cachedTranslation.isEmpty() ? text : cachedTranslation);
            return;
        }
        \u062b\u064b.requestTranslationAsync(key, normalizedText, sourceLanguage, targetLanguage).thenAccept(translation -> callback.accept(translation.isBlank() ? text : translation));
    }

    static {
        REQUEST_TIMEOUT = Duration.ofSeconds(8L);
        HTTP_CLIENT = HttpClient.newBuilder().connectTimeout(REQUEST_TIMEOUT).build();
        TRANSLATION_EXECUTOR = Executors.newSingleThreadExecutor(runnable -> {
            void var1_1;
            Thread thread2 = new Thread(runnable, "Rain-ChatTranslator");
            thread2.setDaemon(true);
            return var1_1;
        });
        TRANSLATION_CACHE = new ConcurrentHashMap<String, String>();
        PENDING_TRANSLATIONS = new ConcurrentHashMap<String, CompletableFuture<String>>();
    }

    private static String requestTranslation(String text, String sourceLanguage, String targetLanguage) {
        try {
            String url = "https://translate.googleapis.com/translate_a/single?client=gtx&dt=t&sl=" + URLEncoder.encode(sourceLanguage, StandardCharsets.UTF_8) + "&tl=" + URLEncoder.encode(targetLanguage, StandardCharsets.UTF_8) + "&q=" + URLEncoder.encode(text, StandardCharsets.UTF_8);
            HttpRequest request = HttpRequest.newBuilder(URI.create(url)).timeout(REQUEST_TIMEOUT).header("User-Agent", "RainVisuals ChatTranslator").GET().build();
            HttpResponse<String> response = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            if (response.statusCode() != 200) {
                return null;
            }
            JsonArray responseBody = JsonParser.parseString(response.body()).getAsJsonArray();
            JsonArray translatedSegments = responseBody.get(0).getAsJsonArray();
            StringBuilder translation = new StringBuilder();
            Iterator<JsonElement> iterator2 = translatedSegments.iterator();
            while (iterator2.hasNext()) {
                JsonElement segmentElement = iterator2.next();
                JsonArray segment = segmentElement.getAsJsonArray();
                if (segment.isEmpty()) continue;
                if (segment.get(0).isJsonNull()) continue;
                translation.append(segment.get(0).getAsString());
            }
            String result = translation.toString().trim();
            return result.isEmpty() ? null : iterator2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void cache(String key, String translation) {
        if (TRANSLATION_CACHE.size() >= 256) {
            TRANSLATION_CACHE.clear();
        }
        TRANSLATION_CACHE.put(key, translation);
    }

    private static CompletableFuture<String> requestTranslationAsync(String key, String text, String sourceLanguage, String targetLanguage) {
        CompletableFuture<String> pending = PENDING_TRANSLATIONS.get(key);
        if (pending != null) {
            return pending;
        }
        CompletableFuture<String> request = new CompletableFuture<String>();
        CompletableFuture<String> existing = PENDING_TRANSLATIONS.putIfAbsent(key, request);
        if (existing != null) {
            return existing;
        }
        TRANSLATION_EXECUTOR.execute(() -> {
            try {
                String translation = \u062b\u064b.requestTranslation(text, sourceLanguage, targetLanguage);
                String result = translation == null ? FAILED_TRANSLATION : translation;
                \u062b\u064b.cache(key, result);
                request.complete(result);
            }
            catch (Exception exception) {
                request.complete(FAILED_TRANSLATION);
            }
            finally {
                PENDING_TRANSLATIONS.remove(key, request);
            }
        });
        return request;
    }
}

