package rainpatch;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.http.HttpHeaders;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.HexFormat;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Restores the HTTP methods stripped from Rain's Models/Figura catalog.
 *
 * The surrounding catalog parser and installer remain the original Rain
 * bytecode. They enforce avatar-id, path, entry-count and unpacked-size limits.
 * This bridge adds bounded HTTPS downloads, exact size checks, SHA-256 checks,
 * atomic caches and the original refresh lifecycle without exposing the
 * obfuscated catalog's private implementation types.
 */
public final class ModelsNetworkBridge {
    private static final String CATALOG_CLASS = "oxxxde.صل";
    private static final String REQUEST_SIGNER_CLASS = "oxxxde.رق";
    private static final URI ORIGIN = URI.create("https://social.rainvisuals.pro");
    private static final String MANIFEST_PATH = "/v1/figura/manifest";
    private static final long REFRESH_INTERVAL_MILLIS = 300_000L;
    private static final long RETRY_INTERVAL_MILLIS = 30_000L;
    private static final int MAX_MANIFEST_BYTES = 512 * 1024;
    private static final HttpClient HTTP = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(7))
            .followRedirects(HttpClient.Redirect.NEVER)
            .build();

    private ModelsNetworkBridge() {
    }

    public static byte[] downloadAsset(String path, long expectedSize, int maximumSize) throws Exception {
        if (expectedSize < 1 || expectedSize > maximumSize) {
            throw new IOException("Figura asset size is outside the allowed range");
        }
        return downloadBounded(path, expectedSize, maximumSize);
    }

    public static byte[] loadPreview(String avatarId) throws Exception {
        Object avatar = invoke("requireAvatar", new Class<?>[]{String.class}, avatarId);
        String path = (String) invokeOn(avatar, "previewPath");
        String sha256 = (String) invokeOn(avatar, "previewSha256");
        long size = ((Number) invokeOn(avatar, "previewSize")).longValue();
        return cachedAsset("previews", sha256, path, size, 8 * 1024 * 1024);
    }

    public static byte[] downloadArchive(Object avatar) throws Exception {
        if (avatar == null) {
            throw new IOException("Figura avatar is missing");
        }
        String path = (String) invokeOn(avatar, "archivePath");
        String sha256 = (String) invokeOn(avatar, "archiveSha256");
        long size = ((Number) invokeOn(avatar, "archiveSize")).longValue();
        return cachedAsset("archives", sha256, path, size, 32 * 1024 * 1024);
    }

    public static CompletableFuture<Void> startRefresh() {
        try {
            Object lock = field("REFRESH_LOCK").get(null);
            synchronized (lock) {
                @SuppressWarnings("unchecked")
                CompletableFuture<Void> existing = (CompletableFuture<Void>) field("refreshFuture").get(null);
                if (existing != null && !existing.isDone()) {
                    return existing;
                }
                Executor executor = (Executor) field("EXECUTOR").get(null);
                CompletableFuture<Void> created = CompletableFuture.runAsync(() -> {
                    try {
                        refreshNow();
                    } catch (Throwable error) {
                        Throwable cause = unwrap(error);
                        setField("lastError", cause);
                        setLongField("nextRefreshAt", System.currentTimeMillis() + RETRY_INTERVAL_MILLIS);
                        throw new CompletionException(cause);
                    }
                }, executor);
                field("refreshFuture").set(null, created);
                return created;
            }
        } catch (Throwable error) {
            return CompletableFuture.failedFuture(unwrap(error));
        }
    }

    public static void refreshBlocking() throws Exception {
        initialize();
        try {
            startRefresh().get();
        } catch (ExecutionException error) {
            throwAsException(unwrap(error));
        }
    }

    public static void refreshNow() throws Exception {
        byte[] body = downloadBounded(MANIFEST_PATH, -1L, MAX_MANIFEST_BYTES);
        String source = new String(body, StandardCharsets.UTF_8);
        Object snapshot = invoke("parseManifest", new Class<?>[]{String.class}, source);
        invokeCompatible("applySnapshot", snapshot);
        writeAtomically(cacheDirectory().resolve("manifest.json"), body);
        setField("lastError", null);
        setLongField("nextRefreshAt", System.currentTimeMillis() + REFRESH_INTERVAL_MILLIS);
    }

    public static void refreshAsync() {
        initialize();
        refreshIfStale();
    }

    public static void refreshIfStale() {
        try {
            long next = field("nextRefreshAt").getLong(null);
            if (System.currentTimeMillis() >= next) {
                startRefresh();
            }
        } catch (Throwable error) {
            setField("lastError", unwrap(error));
        }
    }

    public static void initialize() {
        try {
            AtomicBoolean initialized = (AtomicBoolean) field("INITIALIZED").get(null);
            if (initialized.compareAndSet(false, true)) {
                invoke("loadCachedManifest", new Class<?>[0]);
            }
            refreshIfStale();
        } catch (Throwable error) {
            setField("lastError", unwrap(error));
            setLongField("nextRefreshAt", System.currentTimeMillis() + RETRY_INTERVAL_MILLIS);
        }
    }

    private static byte[] cachedAsset(String directory, String sha256, String path, long size, int maximumSize) throws Exception {
        requireSha256(sha256);
        Path target = cacheDirectory().resolve(directory).resolve(sha256 + ".bin").normalize();
        Path root = cacheDirectory().normalize();
        if (!target.startsWith(root)) {
            throw new SecurityException("Figura cache path escapes its root");
        }
        if (Files.isRegularFile(target) && Files.size(target) == size) {
            byte[] cached = Files.readAllBytes(target);
            if (matchesHash(cached, sha256)) {
                return cached;
            }
        }
        byte[] downloaded = downloadAsset(path, size, maximumSize);
        if (!matchesHash(downloaded, sha256)) {
            throw new SecurityException("Figura asset SHA-256 does not match the catalog");
        }
        writeAtomically(target, downloaded);
        return downloaded;
    }

    private static byte[] downloadBounded(String path, long expectedSize, int maximumSize) throws Exception {
        URI uri = checkedUri(path);
        HttpRequest request = signedRequestBuilder(uri)
                .timeout(Duration.ofSeconds(15))
                .header("Accept", "application/json, application/octet-stream")
                .header("User-Agent", "RainVisuals-Recovered/1.0")
                .GET()
                .build();
        HttpResponse<InputStream> response = HTTP.send(request, HttpResponse.BodyHandlers.ofInputStream());
        long declared = response.headers().firstValueAsLong("Content-Length").orElse(-1L);
        if (declared > maximumSize) {
            response.body().close();
            throw new IOException("Figura server returned an invalid Content-Length");
        }
        byte[] body;
        try (InputStream input = response.body()) {
            body = input.readNBytes(maximumSize + 1);
        }
        if (body.length > maximumSize) {
            throw new IOException("Figura response exceeds its size limit");
        }
        requireValidResponse(request, response.statusCode(), response.headers(), body);
        if (response.statusCode() != 200) {
            throw new IOException("Figura server returned HTTP " + response.statusCode());
        }
        if ((expectedSize > 0 && declared > 0 && declared != expectedSize)
                || (expectedSize > 0 && body.length != expectedSize)) {
            throw new IOException("Figura asset size does not match the catalog");
        }
        return body;
    }

    private static HttpRequest.Builder signedRequestBuilder(URI uri) throws Exception {
        Class<?> signerClass = Class.forName(REQUEST_SIGNER_CLASS);
        Object signer = signerClass.getField("INSTANCE").get(null);
        Method method = signerClass.getMethod("signedBuilder", URI.class, String.class, String.class);
        return (HttpRequest.Builder) method.invoke(signer, uri, "GET", "");
    }

    private static void requireValidResponse(HttpRequest request, int statusCode, HttpHeaders headers, byte[] body) throws Exception {
        Class<?> signerClass = Class.forName(REQUEST_SIGNER_CLASS);
        Object signer = signerClass.getField("INSTANCE").get(null);
        Method method = signerClass.getMethod(
                "requireValidResponse",
                HttpRequest.class,
                int.class,
                HttpHeaders.class,
                byte[].class
        );
        try {
            method.invoke(signer, request, statusCode, headers, body);
        } catch (InvocationTargetException error) {
            throwAsException(unwrap(error));
        }
    }

    private static URI checkedUri(String path) {
        if (path == null || !path.startsWith("/v1/figura/") || path.contains("\\") || path.contains("..")) {
            throw new IllegalArgumentException("Unsafe Figura asset path");
        }
        URI uri = ORIGIN.resolve(path);
        if (!"https".equals(uri.getScheme()) || !ORIGIN.getHost().equals(uri.getHost())
                || uri.getUserInfo() != null || uri.getQuery() != null || uri.getFragment() != null) {
            throw new IllegalArgumentException("Unsafe Figura asset URI");
        }
        return uri;
    }

    private static Path cacheDirectory() throws Exception {
        return (Path) invoke("cacheDirectory", new Class<?>[0]);
    }

    private static void writeAtomically(Path target, byte[] content) throws IOException {
        Files.createDirectories(target.getParent());
        Path temporary = Files.createTempFile(target.getParent(), target.getFileName().toString(), ".tmp");
        try {
            Files.write(temporary, content);
            try {
                Files.move(temporary, target, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
            } catch (AtomicMoveNotSupportedException ignored) {
                Files.move(temporary, target, StandardCopyOption.REPLACE_EXISTING);
            }
        } finally {
            Files.deleteIfExists(temporary);
        }
    }

    private static boolean matchesHash(byte[] data, String expected) throws Exception {
        requireSha256(expected);
        byte[] actual = MessageDigest.getInstance("SHA-256").digest(data);
        byte[] supplied = HexFormat.of().parseHex(expected);
        return MessageDigest.isEqual(actual, supplied);
    }

    private static void requireSha256(String value) {
        if (value == null || !value.matches("[a-f0-9]{64}")) {
            throw new IllegalArgumentException("Invalid Figura SHA-256");
        }
    }

    private static Class<?> catalogClass() throws ClassNotFoundException {
        return Class.forName(CATALOG_CLASS);
    }

    private static Field field(String name) throws Exception {
        Field field = catalogClass().getDeclaredField(name);
        field.setAccessible(true);
        return field;
    }

    private static Object invoke(String name, Class<?>[] parameterTypes, Object... arguments) throws Exception {
        Method method = catalogClass().getDeclaredMethod(name, parameterTypes);
        method.setAccessible(true);
        try {
            return method.invoke(null, arguments);
        } catch (InvocationTargetException error) {
            throwAsException(unwrap(error));
            return null;
        }
    }

    private static Object invokeOn(Object target, String name) throws Exception {
        Method method = target.getClass().getDeclaredMethod(name);
        method.setAccessible(true);
        try {
            return method.invoke(target);
        } catch (InvocationTargetException error) {
            throwAsException(unwrap(error));
            return null;
        }
    }

    private static void invokeCompatible(String name, Object argument) throws Exception {
        for (Method method : catalogClass().getDeclaredMethods()) {
            if (method.getName().equals(name) && method.getParameterCount() == 1
                    && method.getParameterTypes()[0].isInstance(argument)) {
                method.setAccessible(true);
                try {
                    method.invoke(null, argument);
                    return;
                } catch (InvocationTargetException error) {
                    throwAsException(unwrap(error));
                }
            }
        }
        throw new NoSuchMethodException(name);
    }

    private static void setField(String name, Object value) {
        try {
            field(name).set(null, value);
        } catch (Throwable ignored) {
        }
    }

    private static void setLongField(String name, long value) {
        try {
            field(name).setLong(null, value);
        } catch (Throwable ignored) {
        }
    }

    private static Throwable unwrap(Throwable error) {
        Throwable current = error;
        while ((current instanceof InvocationTargetException
                || current instanceof CompletionException
                || current instanceof ExecutionException) && current.getCause() != null) {
            current = current.getCause();
        }
        return current;
    }

    private static void throwAsException(Throwable error) throws Exception {
        if (error instanceof Exception exception) {
            throw exception;
        }
        if (error instanceof Error fatal) {
            throw fatal;
        }
        throw new Exception(error);
    }
}
