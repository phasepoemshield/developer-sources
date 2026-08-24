/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.FabricLoader
 *  net.minecraft.client.MinecraftClient
 */
package oxxxde;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
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
import oxxxde.\u0632\u0625;
import oxxxde.\u0633\u062f;
import oxxxde.\u0634\u0622;
import oxxxde.\u0637\u0642;

final class \u0635\u0644 {
    private static volatile Throwable lastError;
    private static final int MAX_MANIFEST_BYTES = 524288;
    private static final AtomicBoolean INITIALIZED;
    private static volatile CompletableFuture<Void> refreshFuture;
    private static final int MAX_UNPACKED_BYTES = 0x6000000;
    private static final long REFRESH_INTERVAL_MILLIS = 300000L;
    private static final Logger LOGGER;
    private static final URI MANIFEST_URI;
    private static volatile long nextRefreshAt;
    private static volatile List<\u0633\u062f> avatars;
    private static final long RETRY_INTERVAL_MILLIS = 30000L;
    private static final int MAX_PREVIEW_BYTES = 0x800000;
    private static final AtomicInteger REVISION;
    private static final ExecutorService EXECUTOR;
    private static volatile Map<String, \u0633\u062f> avatarsById;
    private static final Pattern SHA256_PATTERN;
    private static final HttpClient HTTP_CLIENT;
    private static final int MAX_AVATARS = 128;
    private static final int MANIFEST_VERSION = 1;
    private static final int MAX_ARCHIVE_BYTES = 0x2000000;
    private static final Object REFRESH_LOCK;

    private static void requireHash(byte[] data, String expected, String label) throws Exception {
        if (!\u0635\u0644.matchesHash(data, expected)) {
            throw new SecurityException(label + " SHA-256 does not match the signed catalog");
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static void applySnapshot(\u0632\u0625 snapshot) {
        if (snapshot.avatars().equals(avatars)) {
            return;
        }
        avatars = snapshot.avatars();
        avatarsById = snapshot.byId();
        REVISION.incrementAndGet();
        Runnable refreshPreviews = () -> {
            \u0637\u0642.clearPreviewCache();
            \u0634\u0622.preload(snapshot.avatars().stream().map(\u0633\u062f::id).toList());
        };
        MinecraftClient minecraft = MinecraftClient.getInstance();
        if (minecraft != null) {
            if (!minecraft.isOnThread()) {
                void var1_1;
                minecraft.execute((Runnable)var1_1);
                return;
            }
        }
        refreshPreviews.run();
    }

    private static byte[] downloadAsset(String string, long l, int n) throws Exception {
        throw new UnsupportedOperationException("Rain network disabled");
    }

    static String archiveSha256(String avatarId) {
        \u0633\u062f avatar;
        \u0633\u062f \u0633\u062f2 = avatarId == null ? null : (avatar = avatarsById.get(avatarId));
        return avatar == null ? null : avatar.archiveSha256();
    }

    static byte[] loadPreview(String string) throws Exception {
        throw new UnsupportedOperationException("Rain network disabled");
    }

    private static CompletableFuture<Void> startRefresh() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Rain network disabled"));
    }

    static void refreshBlocking() throws Exception {
        throw new UnsupportedOperationException("Rain network disabled");
    }

    static {
        LOGGER = LoggerFactory.getLogger("Rain Figura Catalog");
        MANIFEST_URI = URI.create("https://social.rainvisuals.pro/v1/figura/manifest");
        SHA256_PATTERN = Pattern.compile("^[a-f0-9]{64}$");
        HTTP_CLIENT = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(7L)).followRedirects(HttpClient.Redirect.NEVER).build();
        EXECUTOR = Executors.newSingleThreadExecutor(runnable -> {
            void var1_1;
            Thread thread2 = new Thread(runnable, "Rain-Figura-Catalog");
            thread2.setDaemon(true);
            return var1_1;
        });
        INITIALIZED = new AtomicBoolean();
        REVISION = new AtomicInteger();
        REFRESH_LOCK = new Object();
        avatars = Collections.emptyList();
        avatarsById = Collections.emptyMap();
    }

    static int revision() {
        \u0635\u0644.initialize();
        \u0635\u0644.refreshIfStale();
        return REVISION.get();
    }

    private static /* synthetic */ void lambda$startRefresh$1() {
        try {
            \u0635\u0644.refreshNow();
        }
        catch (Throwable throwable) {
            lastError = throwable;
            nextRefreshAt = System.currentTimeMillis() + 30000L;
            LOGGER.warn("Failed to refresh remote Figura catalog: {}", (Object)throwable.getMessage());
            throw new CompletionException(throwable);
        }
    }

    static byte[] downloadArchive(\u0633\u062f \u0633\u062f2) throws Exception {
        throw new UnsupportedOperationException("Rain network disabled");
    }

    static Path cacheDirectory() {
        return FabricLoader.getInstance().getGameDir().toAbsolutePath().normalize().resolve("Rain").resolve("cache").resolve("figura").normalize();
    }

    /*
     * WARNING - void declaration
     */
    private static String requiredString(JsonObject object, String key, int maximumLength) throws IOException {
        void var4_4;
        JsonElement element;
        block5: {
            block4: {
                element = object.get(key);
                if (element == null) break block4;
                if (!element.isJsonPrimitive()) break block4;
                if (element.getAsJsonPrimitive().isString()) break block5;
            }
            throw new IOException("Figura manifest is missing string field " + key);
        }
        String value = element.getAsString();
        if (value.length() > maximumLength || \u0635\u0644.containsControlCharacters(value)) {
            throw new IOException("Figura manifest field " + key + " is invalid");
        }
        return var4_4;
    }

    /*
     * WARNING - void declaration
     */
    private static String requiredHash(JsonObject object, String key) throws IOException {
        void var2_2;
        String value = \u0635\u0644.requiredString(object, key, 64);
        if (!SHA256_PATTERN.matcher(value).matches()) {
            throw new IOException("Figura manifest field " + key + " is not SHA-256");
        }
        return var2_2;
    }

    private \u0635\u0644() {
    }

    static void refreshAsync() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean matchesHash(byte[] data, String expected) throws Exception {
        byte[] actual = MessageDigest.getInstance("SHA-256").digest(data);
        byte[] supplied = HexFormat.of().parseHex(expected);
        if (actual.length != supplied.length) return false;
        if (!MessageDigest.isEqual(actual, supplied)) return false;
        return true;
    }

    private static void refreshIfStale() {
    }

    static \u0633\u062f requireAvatar(String avatarId) throws Exception {
        \u0635\u0644.initialize();
        \u0633\u062f avatar = avatarsById.get(avatarId);
        if (avatar != null) {
            return avatar;
        }
        \u0635\u0644.refreshBlocking();
        avatar = avatarsById.get(avatarId);
        if (avatar == null) {
            throw new IOException("Unknown remote Figura avatar: " + avatarId);
        }
        return avatar;
    }

    /*
     * WARNING - void declaration
     */
    private static \u0632\u0625 parseManifest(String source) throws IOException {
        void var5_6;
        JsonArray entries;
        block16: {
            block15: {
                JsonObject root;
                try {
                    root = JsonParser.parseString(source).getAsJsonObject();
                }
                catch (Throwable throwable) {
                    throw new IOException("Figura manifest is not valid JSON", throwable);
                }
                int version = \u0635\u0644.requiredInt(root, "version");
                if (version != 1) {
                    throw new IOException("Unsupported Figura manifest version: " + version);
                }
                entries = \u0635\u0644.requiredArray(root, "avatars");
                if (entries.isEmpty()) break block15;
                if (entries.size() <= 128) break block16;
            }
            throw new IOException("Figura manifest has an invalid avatar count");
        }
        ArrayList<void> parsed = new ArrayList<void>(entries.size());
        LinkedHashMap<String, \u0633\u062f> byId = new LinkedHashMap<String, \u0633\u062f>();
        for (JsonElement element : entries) {
            void var24_22;
            int previewHeight;
            int previewWidth;
            long previewSize;
            String previewSha256;
            String previewPath;
            long unpackedSize;
            long archiveSize;
            String archiveSha256;
            String archivePath;
            String description;
            String name;
            String id;
            block18: {
                block17: {
                    if (!element.isJsonObject()) {
                        throw new IOException("Figura manifest contains a non-object avatar");
                    }
                    JsonObject entry = element.getAsJsonObject();
                    id = \u0635\u0644.requiredString(entry, "id", 128);
                    name = \u0635\u0644.requiredString(entry, "name", 128);
                    description = \u0635\u0644.requiredString(entry, "description", 512);
                    archivePath = \u0635\u0644.requiredString(entry, "archive", 160);
                    archiveSha256 = \u0635\u0644.requiredHash(entry, "archiveSha256");
                    archiveSize = \u0635\u0644.requiredLong(entry, "archiveSize", 1L, 0x2000000L);
                    unpackedSize = \u0635\u0644.requiredLong(entry, "unpackedSize", 1L, 0x6000000L);
                    previewPath = \u0635\u0644.requiredString(entry, "preview", 160);
                    previewSha256 = \u0635\u0644.requiredHash(entry, "previewSha256");
                    previewSize = \u0635\u0644.requiredLong(entry, "previewSize", 1L, 0x800000L);
                    previewWidth = \u0635\u0644.requiredInt(entry, "previewWidth");
                    previewHeight = \u0635\u0644.requiredInt(entry, "previewHeight");
                    if (!\u0635\u0644.safeAvatarId(id)) {
                        throw new IOException("Figura manifest contains an unsafe avatar id");
                    }
                    if (!archivePath.equals("/v1/figura/archives/" + archiveSha256)) {
                        throw new IOException("Figura archive path does not match its hash");
                    }
                    if (!previewPath.equals("/v1/figura/previews/" + previewSha256)) {
                        throw new IOException("Figura preview path does not match its hash");
                    }
                    if (previewWidth < 1 || previewWidth > 4096) break block17;
                    if (previewHeight >= 1 && previewHeight <= 4096) break block18;
                }
                throw new IOException("Figura preview dimensions are invalid");
            }
            \u0633\u062f avatar = new \u0633\u062f(id, name, description, archivePath, archiveSha256, archiveSize, unpackedSize, previewPath, previewSha256, previewSize, previewWidth, previewHeight);
            if (byId.putIfAbsent(id, avatar) != null) {
                throw new IOException("Figura manifest contains duplicate avatar ids");
            }
            parsed.add(var24_22);
        }
        return new \u0632\u0625(List.copyOf(parsed), Map.copyOf(var5_6));
    }

    private static Throwable unwrap(Throwable throwable) {
        Throwable current = throwable;
        while ((current instanceof CompletionException || current instanceof ExecutionException) && current.getCause() != null) {
            current = current.getCause();
        }
        return current;
    }

    private static int requiredInt(JsonObject object, String key) throws IOException {
        long value = \u0635\u0644.requiredLong(object, key, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return (int)value;
    }

    static boolean isRefreshing() {
        CompletableFuture<Void> future = refreshFuture;
        return future != null && !future.isDone();
    }

    private static void loadCachedManifest() {
        Path path = \u0635\u0644.manifestCachePath();
        try {
            if (!Files.isRegularFile(path, new LinkOption[0]) || Files.size(path) > 524288L) {
                return;
            }
            String body = Files.readString(path, StandardCharsets.UTF_8);
            \u0632\u0625 snapshot = \u0635\u0644.parseManifest(body);
            \u0635\u0644.applySnapshot(snapshot);
            LOGGER.info("Loaded cached Figura catalog: avatars={}", (Object)snapshot.avatars().size());
        }
        catch (Throwable throwable) {
            LOGGER.warn("Ignoring invalid cached Figura catalog: {}", (Object)throwable.getMessage());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private static void writeAtomically(Path target, byte[] content) throws IOException {
        Path parent = target.getParent();
        Files.createDirectories(parent, new FileAttribute[0]);
        Path temporary = Files.createTempFile(parent, target.getFileName().toString(), ".tmp", new FileAttribute[0]);
        try {
            Files.write(temporary, content, new OpenOption[0]);
            try {
                CopyOption[] copyOptionArray = new CopyOption[2];
                copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
                copyOptionArray[1] = StandardCopyOption.ATOMIC_MOVE;
                Files.move(temporary, target, copyOptionArray);
            }
            catch (AtomicMoveNotSupportedException ignored) {
                CopyOption[] copyOptionArray = new CopyOption[1];
                copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
                Files.move(temporary, target, copyOptionArray);
            }
        }
        catch (Throwable throwable) {
            void var3_3;
            Files.deleteIfExists((Path)var3_3);
            throw throwable;
        }
        Files.deleteIfExists(temporary);
    }

    private static long requiredLong(JsonObject object, String key, long minimum, long maximum) throws IOException {
        long value;
        JsonElement element = object.get(key);
        if (element == null || !element.isJsonPrimitive() || !element.getAsJsonPrimitive().isNumber()) {
            throw new IOException("Figura manifest is missing numeric field " + key);
        }
        try {
            value = element.getAsLong();
        }
        catch (Throwable throwable) {
            throw new IOException("Figura manifest field " + key + " is invalid", throwable);
        }
        if (value < minimum || value > maximum) {
            throw new IOException("Figura manifest field " + key + " is out of range");
        }
        return value;
    }

    private static Path manifestCachePath() {
        return \u0635\u0644.cacheDirectory().resolve("manifest.json");
    }

    private static void refreshNow() throws Exception {
        throw new UnsupportedOperationException("Rain network disabled");
    }

    private static boolean safeAvatarId(String avatarId) {
        return !(avatarId == null || avatarId.isBlank() || avatarId.contains("/") || avatarId.contains("\\") || ".".equals(avatarId) || "..".equals(avatarId) || \u0635\u0644.containsControlCharacters(avatarId));
    }

    static List<\u0633\u062f> avatars() {
        \u0635\u0644.initialize();
        \u0635\u0644.refreshIfStale();
        return avatars;
    }

    static void initialize() {
    }

    private static JsonArray requiredArray(JsonObject object, String key) throws IOException {
        JsonElement element;
        block3: {
            block2: {
                element = object.get(key);
                if (element == null) break block2;
                if (element.isJsonArray()) break block3;
            }
            throw new IOException("Figura manifest is missing array field " + key);
        }
        return element.getAsJsonArray();
    }

    private static boolean containsControlCharacters(String value) {
        return value.codePoints().anyMatch(character -> character < 32 || character == 127);
    }

    static Throwable lastError() {
        return lastError;
    }
}

