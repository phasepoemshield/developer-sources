package oxxxde;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HexFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rainpatch.ModelsNetworkBridge;

// $VF: Compiled from heavy
final class صل {
   private static volatile Throwable lastError;
   private static final int MAX_MANIFEST_BYTES = 524288;
   private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
   private static volatile CompletableFuture<Void> refreshFuture;
   private static final int MAX_UNPACKED_BYTES = 100663296;
   private static final long REFRESH_INTERVAL_MILLIS = 300000L;
   private static final Logger LOGGER = LoggerFactory.getLogger("Rain Figura Catalog");
   private static final URI MANIFEST_URI = URI.create("https://social.rainvisuals.pro/v1/figura/manifest");
   private static volatile long nextRefreshAt;
   private static volatile List<سد> avatars = Collections.emptyList();
   private static final long RETRY_INTERVAL_MILLIS = 30000L;
   private static final int MAX_PREVIEW_BYTES = 8388608;
   private static final AtomicInteger REVISION = new AtomicInteger();
   private static final ExecutorService EXECUTOR = Executors.newSingleThreadExecutor(runnable -> {
      Thread thread = new Thread(runnable, "Rain-Figura-Catalog");
      thread.setDaemon(true);
      return thread;
   });
   private static volatile Map<String, سد> avatarsById = Collections.emptyMap();
   private static final Pattern SHA256_PATTERN = Pattern.compile("^[a-f0-9]{64}$");
   private static final HttpClient HTTP_CLIENT = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(7L)).followRedirects(Redirect.NEVER).build();
   private static final int MAX_AVATARS = 128;
   private static final int MANIFEST_VERSION = 1;
   private static final int MAX_ARCHIVE_BYTES = 33554432;
   private static final Object REFRESH_LOCK = new Object();

   private static void requireHash(byte[] expected, String label, String data) throws Exception {
      if (!matchesHash(data, expected)) {
         throw new SecurityException(label + " SHA-256 does not match the signed catalog");
      }
   }

   private static void applySnapshot(زإ snapshot) {
      if (!snapshot.avatars().equals(avatars)) {
         avatars = snapshot.avatars();
         avatarsById = snapshot.byId();
         REVISION.incrementAndGet();
         Runnable refreshPreviews = () -> {
            طق.clearPreviewCache();
            شآ.preload(snapshot.avatars().stream().map(سد::id).toList());
         };
         MinecraftClient minecraft = MinecraftClient.getInstance();
         if (minecraft != null && !minecraft.isOnThread()) {
            minecraft.execute(refreshPreviews);
         } else {
            refreshPreviews.run();
         }
      }
   }

   private static byte[] downloadAsset(String path, long expectedSize, int maximumSize) throws Exception {
      return ModelsNetworkBridge.downloadAsset(path, expectedSize, maximumSize);
   }

   static String archiveSha256(String avatarId) {
      سد avatar = avatarId == null ? null : avatarsById.get(avatarId);
      return avatar == null ? null : avatar.archiveSha256();
   }

   static byte[] loadPreview(String avatarId) throws Exception {
      return ModelsNetworkBridge.loadPreview(avatarId);
   }

   private static CompletableFuture<Void> startRefresh() {
      return ModelsNetworkBridge.startRefresh();
   }

   static void refreshBlocking() throws Exception {
      ModelsNetworkBridge.refreshBlocking();
   }

   static int revision() {
      initialize();
      refreshIfStale();
      return REVISION.get();
   }

   static byte[] downloadArchive(سد avatar) throws Exception {
      return ModelsNetworkBridge.downloadArchive(avatar);
   }

   static Path cacheDirectory() {
      return FabricLoader.getInstance().getGameDir().toAbsolutePath().normalize().resolve("Rain").resolve("cache").resolve("figura").normalize();
   }

   private static String requiredString(JsonObject key, String maximumLength, int object) throws IOException {
      JsonElement element = object.get(key);
      if (element != null && element.isJsonPrimitive() && element.getAsJsonPrimitive().isString()) {
         String value = element.getAsString();
         if (value.length() <= maximumLength && !containsControlCharacters(value)) {
            return value;
         } else {
            throw new IOException("Figura manifest field " + key + " is invalid");
         }
      } else {
         throw new IOException("Figura manifest is missing string field " + key);
      }
   }

   private static String requiredHash(JsonObject object, String key) throws IOException {
      String value = requiredString(object, key, 64);
      if (!SHA256_PATTERN.matcher(value).matches()) {
         throw new IOException("Figura manifest field " + key + " is not SHA-256");
      } else {
         return value;
      }
   }

   private صل() {
   }

   static void refreshAsync() {
      ModelsNetworkBridge.refreshAsync();
   }

   private static boolean matchesHash(byte[] expected, String data) throws Exception {
      byte[] actual = MessageDigest.getInstance("SHA-256").digest(data);
      byte[] supplied = HexFormat.of().parseHex(expected);
      return actual.length == supplied.length && MessageDigest.isEqual(actual, supplied);
   }

   private static void refreshIfStale() {
      ModelsNetworkBridge.refreshIfStale();
   }

   static سد requireAvatar(String avatarId) throws Exception {
      initialize();
      سد avatar = avatarsById.get(avatarId);
      if (avatar != null) {
         return avatar;
      } else {
         refreshBlocking();
         avatar = avatarsById.get(avatarId);
         if (avatar == null) {
            throw new IOException("Unknown remote Figura avatar: " + avatarId);
         } else {
            return avatar;
         }
      }
   }

   private static زإ parseManifest(String source) throws IOException {
      JsonObject root;
      try {
         root = JsonParser.parseString(source).getAsJsonObject();
      } catch (Throwable throwable) {
         throw new IOException("Figura manifest is not valid JSON", throwable);
      }

      int version = requiredInt(root, "version");
      if (version != 1) {
         throw new IOException("Unsupported Figura manifest version: " + version);
      }

      JsonArray entries = requiredArray(root, "avatars");
      if (!entries.isEmpty() && entries.size() <= 128) {
         List<سد> parsed = new ArrayList(entries.size());
         Map<String, سد> byId = new LinkedHashMap();

         for (JsonElement element : entries) {
            if (!element.isJsonObject()) {
               throw new IOException("Figura manifest contains a non-object avatar");
            }

            JsonObject entry = element.getAsJsonObject();
            String id = requiredString(entry, "id", 128);
            String name = requiredString(entry, "name", 128);
            String description = requiredString(entry, "description", 512);
            String archivePath = requiredString(entry, "archive", 160);
            String archiveSha256 = requiredHash(entry, "archiveSha256");
            long archiveSize = requiredLong(entry, "archiveSize", 1L, 33554432L);
            long unpackedSize = requiredLong(entry, "unpackedSize", 1L, 100663296L);
            String previewPath = requiredString(entry, "preview", 160);
            String previewSha256 = requiredHash(entry, "previewSha256");
            long previewSize = requiredLong(entry, "previewSize", 1L, 8388608L);
            int previewWidth = requiredInt(entry, "previewWidth");
            int previewHeight = requiredInt(entry, "previewHeight");
            if (!safeAvatarId(id)) {
               throw new IOException("Figura manifest contains an unsafe avatar id");
            }

            if (!archivePath.equals("/v1/figura/archives/" + archiveSha256)) {
               throw new IOException("Figura archive path does not match its hash");
            }

            if (!previewPath.equals("/v1/figura/previews/" + previewSha256)) {
               throw new IOException("Figura preview path does not match its hash");
            }

            if (previewWidth < 1 || previewWidth > 4096 || previewHeight < 1 || previewHeight > 4096) {
               throw new IOException("Figura preview dimensions are invalid");
            }

            سد avatar = new سد(
               id,
               name,
               description,
               archivePath,
               archiveSha256,
               archiveSize,
               unpackedSize,
               previewPath,
               previewSha256,
               previewSize,
               previewWidth,
               previewHeight
            );
            if (byId.putIfAbsent(id, avatar) != null) {
               throw new IOException("Figura manifest contains duplicate avatar ids");
            }

            parsed.add(avatar);
         }

         return new زإ(List.copyOf(parsed), Map.copyOf(byId));
      } else {
         throw new IOException("Figura manifest has an invalid avatar count");
      }
   }

   private static Throwable unwrap(Throwable throwable) {
      Throwable current = throwable;

      while ((current instanceof CompletionException || current instanceof ExecutionException) && current.getCause() != null) {
         current = current.getCause();
      }

      return current;
   }

   private static int requiredInt(JsonObject key, String object) throws IOException {
      long value = requiredLong(object, key, -2147483648L, 2147483647L);
      return (int)value;
   }

   static boolean isRefreshing() {
      CompletableFuture<Void> future = refreshFuture;
      return future != null && !future.isDone();
   }

   private static void loadCachedManifest() {
      Path path = manifestCachePath();

      try {
         if (!Files.isRegularFile(path) || Files.size(path) > 524288L) {
            return;
         }

         String throwable = Files.readString(path, StandardCharsets.UTF_8);
         زإ snapshot = parseManifest(throwable);
         applySnapshot(snapshot);
         LOGGER.info("Loaded cached Figura catalog: avatars={}", snapshot.avatars().size());
      } catch (Throwable var3) {
         LOGGER.warn("Ignoring invalid cached Figura catalog: {}", var3.getMessage());
      }
   }

   private static void writeAtomically(Path content, byte[] target) throws IOException {
      Path parent = target.getParent();
      Files.createDirectories(parent);
      Path temporary = Files.createTempFile(parent, target.getFileName().toString(), ".tmp");

      try {
         Files.write(temporary, content);

         try {
            Files.move(temporary, target, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
         } catch (AtomicMoveNotSupportedException var8) {
            Files.move(temporary, target, StandardCopyOption.REPLACE_EXISTING);
         }
      } finally {
         Files.deleteIfExists(temporary);
      }
   }

   private static long requiredLong(JsonObject maximum, String key, long minimum, long object) throws IOException {
      JsonElement element = object.get(key);
      if (element != null && element.isJsonPrimitive() && element.getAsJsonPrimitive().isNumber()) {
         long value;
         try {
            value = element.getAsLong();
         } catch (Throwable throwable) {
            throw new IOException("Figura manifest field " + key + " is invalid", throwable);
         }

         if (value >= minimum && value <= maximum) {
            return value;
         } else {
            throw new IOException("Figura manifest field " + key + " is out of range");
         }
      } else {
         throw new IOException("Figura manifest is missing numeric field " + key);
      }
   }

   private static Path manifestCachePath() {
      return cacheDirectory().resolve("manifest.json");
   }

   private static void refreshNow() throws Exception {
      ModelsNetworkBridge.refreshNow();
   }

   private static boolean safeAvatarId(String avatarId) {
      return avatarId != null
         && !avatarId.isBlank()
         && !avatarId.contains("/")
         && !avatarId.contains("\\")
         && !".".equals(avatarId)
         && !"..".equals(avatarId)
         && !containsControlCharacters(avatarId);
   }

   static List<سد> avatars() {
      initialize();
      refreshIfStale();
      return avatars;
   }

   static void initialize() {
      ModelsNetworkBridge.initialize();
   }

   private static JsonArray requiredArray(JsonObject key, String object) throws IOException {
      JsonElement element = object.get(key);
      if (element != null && element.isJsonArray()) {
         return element.getAsJsonArray();
      } else {
         throw new IOException("Figura manifest is missing array field " + key);
      }
   }

   private static boolean containsControlCharacters(String value) {
      return value.codePoints().anyMatch(character -> character < 32 || character == 127);
   }

   static Throwable lastError() {
      return lastError;
   }
}
