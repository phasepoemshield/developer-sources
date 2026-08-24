/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.minecraft.client.MinecraftClient
 */
package oxxxde;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotakbaz.rain.client.figura.FiguraAvatarInstaller;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rainpatch.ModelsNetworkBridge;
import oxxxde.\u062e\u064f;
import oxxxde.\u0633\u062f;
import oxxxde.\u0635\u062e;
import oxxxde.\u0635\u0644;

public final class \u062f\u0633 {
    private static volatile Throwable lastError;
    private static final AtomicInteger REPLACED_FILES;
    private static final Map<String, String> COSMETIC_SOURCE_CATEGORIES;
    private static final AtomicInteger SKIPPED_FILES;
    private static final String REMOTE_MARKER_FILE = ".rain-archive.sha256";
    private static final AtomicBoolean RUNNING;
    private static final AtomicInteger INSTALLED_FILES;
    private static final Logger LOGGER;
    private static final String MOD_ID = "rain-visuals";
    private static volatile boolean finished;
    private static final int MAX_REMOTE_ARCHIVE_ENTRIES = 512;
    private static final String RESOURCE_ROOT = "figura_avatars";

    /*
     * WARNING - void declaration
     */
    private static String titleName(String avatarId) {
        void var2_2;
        String string;
        if (avatarId == null || avatarId.isBlank()) {
            return "Avatar";
        }
        String[] parts = avatarId.replace('-', ' ').replace('_', ' ').split(" ");
        StringBuilder builder = new StringBuilder();
        String[] stringArray = parts;
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            String part = stringArray[i];
            if (part.isBlank()) continue;
            if (!builder.isEmpty()) {
                builder.append(' ');
            }
            builder.append(Character.toUpperCase(part.charAt(0)));
            if (part.length() <= 1) continue;
            builder.append(part.substring(1));
        }
        return builder.isEmpty() ? string : var2_2.toString();
    }

    private static void collectCosmeticIdsFromJar(JarFile jar, String rootEntry, String sourceCategory, Set<String> ids) {
        String prefix = (String)(rootEntry.endsWith("/") ? rootEntry : rootEntry + "/") + "cosmetics/" + sourceCategory + "/";
        Enumeration<JarEntry> entries = jar.entries();
        while (entries.hasMoreElements()) {
            String relative;
            JarEntry entry = entries.nextElement();
            if (entry == null || entry.isDirectory() || !entry.getName().startsWith(prefix) || !entry.getName().endsWith("/avatar.json") || (relative = entry.getName().substring(prefix.length(), entry.getName().length() - "/avatar.json".length())).contains("/") || !\u062f\u0633.isSafeAvatarId(relative)) continue;
            ids.add(relative);
        }
    }

    private static boolean containsRegularFile(Path root) throws IOException {
        boolean bl;
        block6: {
            if (!Files.isDirectory(root, new LinkOption[0])) {
                return false;
            }
            Stream<Path> files = Files.walk(root, new FileVisitOption[0]);
            try {
                bl = files.anyMatch(x$0 -> Files.isRegularFile(x$0, new LinkOption[0]));
                if (files == null) break block6;
            }
            catch (Throwable throwable) {
                if (files != null) {
                    try {
                        files.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            files.close();
        }
        return bl;
    }

    private static void rethrowLastErrorIfPresent() throws Exception {
        Throwable error = lastError;
        if (error != null) {
            \u062f\u0633.throwAsException(error);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Path findModResourceRoot() {
        try {
            ModContainer container = FabricLoader.getInstance().getModContainer(MOD_ID).orElse(null);
            if (container == null) {
                return null;
            }
            Path root = container.findPath(RESOURCE_ROOT).orElse(null);
            if (root == null) return null;
            if (!Files.isDirectory(root, new LinkOption[0])) return null;
            Path path = root.normalize();
            return path;
        }
        catch (Throwable throwable) {
            void var0_1;
            LOGGER.debug("Fabric mod resource lookup failed: path={}", (Object)RESOURCE_ROOT, (Object)var0_1);
            return null;
        }
    }

    public static void initializeRemoteCatalog() {
        ModelsNetworkBridge.initialize();
    }

    private static void collectAvatarIdsFromDirectory(Path root, Set<String> ids) throws IOException {
        if (!Files.isDirectory(root, new LinkOption[0])) {
            return;
        }
        Stream<Path> stream = Files.list(root);
        try {
            stream.filter(x$0 -> Files.isDirectory(x$0, new LinkOption[0])).filter(path -> Files.isRegularFile(path.resolve("avatar.json"), new LinkOption[0])).map(path -> path.getFileName().toString()).filter(\u062f\u0633::isSafeAvatarId).forEach(ids::add);
        }
        catch (Throwable throwable) {
            if (stream != null) {
                try {
                    stream.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
            }
            throw throwable;
        }
        if (stream != null) {
            stream.close();
        }
    }

    private static boolean isRemoteAvatarCurrent(\u0633\u062f avatar) {
        Path marker;
        block9: {
            block8: {
                Path avatarsDir;
                block7: {
                    block6: {
                        avatarsDir = \u062f\u0633.avatarsDirectory();
                        if (avatarsDir == null || avatar == null) break block6;
                        if (\u062f\u0633.isSafeAvatarId(avatar.id())) break block7;
                    }
                    return false;
                }
                Path target = avatarsDir.resolve(avatar.id()).normalize();
                marker = target.resolve(REMOTE_MARKER_FILE).normalize();
                if (!target.startsWith(avatarsDir)) break block8;
                if (!Files.isRegularFile(target.resolve("avatar.json"), new LinkOption[0])) break block8;
                if (Files.isRegularFile(marker, new LinkOption[0])) break block9;
            }
            return false;
        }
        try {
            return Files.readString(marker, StandardCharsets.UTF_8).trim().equals(avatar.archiveSha256());
        }
        catch (IOException iOException) {
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String installCombinedCosmetics(List<String> avatarIds) throws Exception {
        void var4_4;
        \u0635\u062e cosmetic;
        Object avatarId;
        LinkedHashMap<String, \u0635\u062e> cosmeticsByCategory = new LinkedHashMap<String, \u0635\u062e>();
        Iterator<String> iterator2 = avatarIds.iterator();
        while (iterator2.hasNext()) {
            avatarId = iterator2.next();
            cosmetic = \u062f\u0633.parseCosmeticAvatarId(\u062f\u0633.normalizeAvatarId((String)avatarId));
            if (cosmetic == null) continue;
            cosmeticsByCategory.put(cosmetic.category(), cosmetic);
        }
        if (cosmeticsByCategory.isEmpty()) {
            throw new IOException("No cosmetics selected");
        }
        ArrayList<\u0635\u062e> cosmetics = new ArrayList<\u0635\u062e>(cosmeticsByCategory.values());
        cosmetics.sort(Comparator.comparingInt(\u062f\u0633::cosmeticCategoryOrder));
        avatarId = cosmetics.iterator();
        while (avatarId.hasNext()) {
            cosmetic = (\u0635\u062e)avatarId.next();
            \u062f\u0633.installBlocking(\u062f\u0633.cosmeticAvatarId(cosmetic.category(), cosmetic.itemId()));
        }
        Path avatarsDir = \u062f\u0633.avatarsDirectory();
        if (avatarsDir == null) {
            throw new IOException("Figura avatars directory is unavailable");
        }
        String combinedId = \u062f\u0633.combinedCosmeticsAvatarId(cosmetics);
        Path output = avatarsDir.resolve(combinedId).normalize();
        if (!output.startsWith(avatarsDir)) {
            throw new IOException("Invalid combined cosmetics path");
        }
        \u062f\u0633.recreateDirectory(output);
        ArrayList<String> scripts = new ArrayList<String>();
        LinkedHashSet<String> copiedNames = new LinkedHashSet<String>();
        for (\u0635\u062e cosmetic2 : cosmetics) {
            void var9_9;
            void var10_10;
            block11: {
                block10: {
                    Path source = avatarsDir.resolve(\u062f\u0633.cosmeticAvatarId(cosmetic2.category(), cosmetic2.itemId())).normalize();
                    if (!source.startsWith(avatarsDir)) break block10;
                    if (Files.isDirectory(source, new LinkOption[0])) break block11;
                }
                throw new IOException("Cosmetic files not found: " + cosmetic2.itemId());
            }
            \u062f\u0633.copyCosmeticFiles((Path)var10_10, output, (\u0635\u062e)var9_9, copiedNames, scripts);
        }
        Files.writeString(output.resolve("avatar.json"), (CharSequence)"{\n  \"name\": \"Rain Cosmetics\",\n  \"authors\": [\"Rain\"]\n}\n", StandardCharsets.UTF_8, new OpenOption[0]);
        if (!scripts.isEmpty()) {
            Files.writeString(output.resolve("script.lua"), (CharSequence)(String.join((CharSequence)"\n\n", scripts) + "\n"), StandardCharsets.UTF_8, new OpenOption[0]);
        }
        return var4_4;
    }

    private static int cosmeticCategoryOrder(\u0635\u062e cosmetic) {
        return switch (cosmetic.category()) {
            case "wings" -> 0;
            case "hats" -> 1;
            case "tails" -> 2;
            default -> 3;
        };
    }

    public static int getSkippedFiles() {
        return SKIPPED_FILES.get();
    }

    private static void throwAsException(Throwable throwable) throws Exception {
        if (throwable instanceof Exception) {
            Exception exception = (Exception)throwable;
            throw exception;
        }
        if (throwable instanceof Error) {
            Error error = (Error)throwable;
            throw error;
        }
        throw new Exception(throwable);
    }

    private static void collectCosmeticIdsFromDirectory(Path root, Set<String> ids) throws IOException {
        if (!Files.isDirectory(root, new LinkOption[0])) {
            return;
        }
        Stream<Path> stream = Files.list(root);
        try {
            stream.filter(x$0 -> Files.isDirectory(x$0, new LinkOption[0])).filter(path -> Files.isRegularFile(path.resolve("avatar.json"), new LinkOption[0])).map(path -> path.getFileName().toString()).filter(\u062f\u0633::isSafeAvatarId).forEach(ids::add);
        }
        catch (Throwable throwable) {
            if (stream != null) {
                try {
                    stream.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
            }
            throw throwable;
        }
        if (stream != null) {
            stream.close();
        }
    }

    private static boolean copyFromCodeSourceJar(Path avatarsDir, String avatarId) throws Exception {
        Path path = \u062f\u0633.codeSourcePath();
        if (path == null) {
            LOGGER.warn("Code source is unavailable while locating bundled Figura models");
            return false;
        }
        if (Files.isDirectory(path, new LinkOption[0])) {
            Path root = path.resolve(RESOURCE_ROOT).normalize();
            return \u062f\u0633.copyResourceDirectory(root, avatarsDir, avatarId);
        }
        if (Files.isRegularFile(path, new LinkOption[0])) {
            boolean bl;
            try (JarFile jar = new JarFile(path.toFile());){
                bl = \u062f\u0633.copyFromJar(jar, RESOURCE_ROOT, avatarsDir, avatarId) > 0;
            }
            return bl;
        }
        return false;
    }

    private static String normalizeCosmeticCategory(String category) {
        if (category == null) {
            return null;
        }
        String normalized = category.trim().toLowerCase(Locale.ROOT);
        return COSMETIC_SOURCE_CATEGORIES.containsKey(normalized) ? normalized : null;
    }

    public static boolean isCatalogRefreshing() {
        return \u0635\u0644.isRefreshing();
    }

    private static File gameDirectory() {
        try {
            Path gameDirectory = FabricLoader.getInstance().getGameDir();
            if (gameDirectory != null) {
                return gameDirectory.toAbsolutePath().normalize().toFile();
            }
        }
        catch (Throwable gameDirectory) {
            // empty catch block
        }
        try {
            MinecraftClient minecraft = MinecraftClient.getInstance();
            if (minecraft != null && minecraft.runDirectory != null) {
                return minecraft.runDirectory.toPath().toAbsolutePath().normalize().toFile();
            }
        }
        catch (Throwable minecraft) {
            // empty catch block
        }
        String userDir = System.getProperty("user.dir");
        return userDir == null ? null : Path.of(userDir, new String[0]).toAbsolutePath().normalize().toFile();
    }

    /*
     * WARNING - void declaration
     */
    public static void installAsync(String avatarId) {
        void var1_1;
        if (\u062f\u0633.normalizeAvatarId(avatarId) == null) {
            \u0635\u0644.refreshAsync();
            return;
        }
        if (!RUNNING.compareAndSet(false, true)) {
            LOGGER.debug("Async install request joined an active install: target={}", (Object)\u062f\u0633.installTarget(avatarId));
            return;
        }
        Thread thread2 = new Thread(() -> {
            long startedAt = System.currentTimeMillis();
            LOGGER.info("Starting async model installation: target={}", (Object)\u062f\u0633.installTarget(avatarId));
            try {
                \u062f\u0633.prepareCounters();
                \u062f\u0633.installNow(avatarId);
                finished = true;
                lastError = null;
                Object[] objectArray = new Object[5];
                objectArray[0] = \u062f\u0633.installTarget(avatarId);
                objectArray[1] = INSTALLED_FILES.get();
                objectArray[2] = REPLACED_FILES.get();
                objectArray[3] = SKIPPED_FILES.get();
                objectArray[4] = System.currentTimeMillis() - startedAt;
                LOGGER.info("Async model installation completed: target={}, installed={}, replaced={}, skipped={}, duration={}ms", objectArray);
            }
            catch (Throwable t) {
                void var3_2;
                finished = false;
                lastError = t;
                Object[] objectArray = new Object[3];
                objectArray[0] = \u062f\u0633.installTarget(avatarId);
                objectArray[1] = System.currentTimeMillis() - startedAt;
                objectArray[2] = var3_2;
                LOGGER.error("Async model installation failed: target={}, duration={}ms", objectArray);
            }
            finally {
                RUNNING.set(false);
            }
        }, "Rain-Figura-Avatar-Installer");
        thread2.setDaemon(true);
        var1_1.start();
    }

    private static void collectCosmeticIdsFromCodeSource(String sourceCategory, Set<String> ids) throws Exception {
        block7: {
            Path path;
            block6: {
                path = \u062f\u0633.codeSourcePath();
                if (path == null) {
                    return;
                }
                if (!Files.isDirectory(path, new LinkOption[0])) break block6;
                \u062f\u0633.collectCosmeticIdsFromDirectory(path.resolve(RESOURCE_ROOT).resolve("cosmetics").resolve(sourceCategory), ids);
                break block7;
            }
            if (Files.isRegularFile(path, new LinkOption[0])) {
                try (JarFile jar = new JarFile(path.toFile());){
                    \u062f\u0633.collectCosmeticIdsFromJar(jar, RESOURCE_ROOT, sourceCategory, ids);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static List<String> findBundledAvatarIds() {
        void var0;
        LinkedHashSet<String> ids = new LinkedHashSet<String>();
        try {
            Path modResourceRoot = \u062f\u0633.findModResourceRoot();
            if (modResourceRoot != null) {
                \u062f\u0633.collectAvatarIdsFromDirectory(modResourceRoot, ids);
            }
            if (ids.isEmpty()) {
                ClassLoader loader = \u062f\u0633.class.getClassLoader();
                Enumeration<URL> roots = loader.getResources(RESOURCE_ROOT);
                while (roots.hasMoreElements()) {
                    \u062f\u0633.collectAvatarIds(roots.nextElement(), ids);
                }
            }
            if (ids.isEmpty()) {
                \u062f\u0633.collectAvatarIdsFromCodeSource(ids);
            }
        }
        catch (Throwable throwable) {
            void var1_2;
            LOGGER.warn("Failed to discover bundled Figura models", (Throwable)var1_2);
        }
        return new ArrayList<String>((Collection<String>)var0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void installRemoteAvatar(Path avatarsDir, \u0633\u062f avatar) throws Exception {
        if (\u062f\u0633.isRemoteAvatarCurrent(avatar)) {
            SKIPPED_FILES.incrementAndGet();
            return;
        }
        byte[] archive = \u0635\u0644.downloadArchive(avatar);
        Path temporary = Files.createTempDirectory(avatarsDir, ".rain-figura-install-", new FileAttribute[0]);
        boolean installed = false;
        try {
            void var5_5;
            \u062f\u0633.extractRemoteArchive(archive, temporary, avatar.unpackedSize());
            if (!Files.isRegularFile(temporary.resolve("avatar.json"), new LinkOption[0])) {
                throw new IOException("Remote Figura archive does not contain avatar.json");
            }
            Files.writeString(temporary.resolve(REMOTE_MARKER_FILE), (CharSequence)avatar.archiveSha256(), StandardCharsets.UTF_8, new OpenOption[0]);
            Path target = avatarsDir.resolve(avatar.id()).normalize();
            if (!target.startsWith(avatarsDir) || !\u062f\u0633.isSafeAvatarId(avatar.id())) {
                throw new IOException("Remote Figura avatar has an unsafe destination");
            }
            \u062f\u0633.replaceDirectory(temporary, (Path)var5_5, avatarsDir);
            return;
        }
        catch (Throwable throwable) {
            void var3_3;
            if (installed) throw throwable;
            \u062f\u0633.deleteDirectory((Path)var3_3);
            throw throwable;
        }
    }

    public static boolean isRunning() {
        return RUNNING.get();
    }

    public static int getReplacedFiles() {
        return REPLACED_FILES.get();
    }

    private static void prepareCounters() {
        finished = false;
        INSTALLED_FILES.set(0);
        SKIPPED_FILES.set(0);
        REPLACED_FILES.set(0);
        lastError = null;
    }

    public static int getInstalledFiles() {
        return INSTALLED_FILES.get();
    }

    private static Path resolveAcrossProviders(Path outputRoot, Path relativePath) throws IOException {
        Path output = outputRoot;
        Iterator<Path> iterator2 = relativePath.iterator();
        while (iterator2.hasNext()) {
            Path segment = iterator2.next();
            String name = segment.toString();
            if (name.isBlank() || ".".equals(name) || "..".equals(name)) {
                throw new IOException("Invalid bundled model path segment: " + name);
            }
            output = output.resolve(name);
        }
        Path normalizedOutput = output.normalize();
        if (!normalizedOutput.startsWith(outputRoot)) {
            throw new IOException("Bundled model path escapes destination: " + String.valueOf(relativePath));
        }
        return iterator2;
    }

    static {
        LOGGER = LoggerFactory.getLogger("Rain Figura Installer");
        COSMETIC_SOURCE_CATEGORIES = Map.of("hats", "hats", "wings", "wings", "tails", "tail");
        RUNNING = new AtomicBoolean(false);
        INSTALLED_FILES = new AtomicInteger();
        SKIPPED_FILES = new AtomicInteger();
        REPLACED_FILES = new AtomicInteger();
    }

    private static void copyCosmeticFiles(Path source, Path output, \u0635\u062e cosmetic, Set<String> copiedNames, List<String> scripts) throws IOException {
        try (Stream<Path> files = Files.walk(source, new FileVisitOption[0]);){
            for (Path input : files.filter(x$0 -> Files.isRegularFile(x$0, new LinkOption[0])).toList()) {
                Path relative = source.relativize(input);
                String fileName = relative.getFileName().toString();
                if ("avatar.json".equals(fileName)) continue;
                if ("script.lua".equals(fileName)) {
                    scripts.add(Files.readString(input, StandardCharsets.UTF_8));
                    continue;
                }
                Path destination = output.resolve(relative).normalize();
                if (copiedNames.contains(relative.toString())) {
                    destination = output.resolve(cosmetic.category() + "-" + cosmetic.itemId() + "-" + fileName).normalize();
                }
                if (!destination.startsWith(output)) continue;
                Files.createDirectories(destination.getParent(), new FileAttribute[0]);
                CopyOption[] copyOptionArray = new CopyOption[1];
                copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
                Files.copy(input, destination, copyOptionArray);
                copiedNames.add(output.relativize(destination).toString());
            }
        }
    }

    private static void copyStream(InputStream input, Path output, Path outputRoot, long sourceSize) throws IOException {
        Path normalizedOutput = output.normalize();
        Path normalizedOutputRoot = outputRoot.normalize();
        if (!normalizedOutput.startsWith(normalizedOutputRoot)) {
            return;
        }
        Files.createDirectories(normalizedOutput.getParent(), new FileAttribute[0]);
        if (Files.exists(normalizedOutput, new LinkOption[0])) {
            if (sourceSize >= 0L && Files.size(normalizedOutput) == sourceSize) {
                SKIPPED_FILES.incrementAndGet();
                LOGGER.debug("Model file unchanged: {}", (Object)normalizedOutput);
                return;
            }
        }
        if (Files.exists(normalizedOutput, new LinkOption[0])) {
            REPLACED_FILES.incrementAndGet();
            LOGGER.debug("Replacing model file: {}", (Object)normalizedOutput);
        } else {
            INSTALLED_FILES.incrementAndGet();
            LOGGER.debug("Installing model file: {}", (Object)normalizedOutput);
        }
        CopyOption[] copyOptionArray = new CopyOption[1];
        copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
        Files.copy(input, normalizedOutput, copyOptionArray);
    }

    /*
     * WARNING - void declaration
     */
    private static String normalizeAvatarId(String avatarId) {
        void var1_1;
        if (avatarId == null) {
            return null;
        }
        String normalized = avatarId.trim();
        return normalized.isEmpty() ? null : var1_1;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     */
    private static \u062e\u064f readMetadata(String resourcePath, String fallbackName) {
        InputStream input;
        block11: {
            \u062e\u064f \u062e\u064f2;
            block12: {
                input = \u062f\u0633.openBundledResource(resourcePath);
                if (input != null) break block11;
                \u062e\u064f2 = new \u062e\u064f(fallbackName, "");
                if (input == null) break block12;
                input.close();
            }
            return \u062e\u064f2;
        }
        String json = new String(input.readAllBytes(), StandardCharsets.UTF_8);
        JsonObject root = JsonParser.parseString(json).getAsJsonObject();
        String name = root.has("name") ? root.get("name").getAsString() : fallbackName;
        String description = root.has("description") ? root.get("description").getAsString() : "";
        \u062e\u064f \u062e\u064f3 = new \u062e\u064f(name, description);
        {
            catch (Throwable throwable) {
                try {
                    if (input != null) {
                        try {
                            input.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    void var1_1;
                    return new \u062e\u064f((String)var1_1, "");
                }
            }
        }
        if (input != null) {
            input.close();
        }
        return \u062e\u064f3;
    }

    private static void waitForRunningInstall() throws InterruptedException {
        while (RUNNING.get()) {
            Thread.sleep(10L);
        }
    }

    private \u062f\u0633() {
    }

    /*
     * WARNING - void declaration
     */
    private static int copyFromJar(JarFile jar, String rootEntry, Path avatarsDir, String avatarId) throws IOException {
        void var7_7;
        Path normalizedAvatarsDir = avatarsDir.normalize();
        Object prefix = rootEntry.endsWith("/") ? rootEntry : rootEntry + "/";
        Enumeration<JarEntry> entries = jar.entries();
        int matchedFiles = 0;
        while (entries.hasMoreElements()) {
            Path output;
            Path relativePath;
            String relativeName;
            String name;
            JarEntry entry = entries.nextElement();
            if (entry == null || entry.isDirectory() || !(name = entry.getName()).startsWith((String)prefix) || (relativeName = name.substring(((String)prefix).length())).isEmpty() || relativeName.contains("\\") || (relativePath = Path.of(relativeName, new String[0]).normalize()).isAbsolute() || \u062f\u0633.startsWithParentTraversal(relativePath)) continue;
            if (avatarId != null) {
                if (relativePath.getNameCount() == 0) continue;
                if (!avatarId.equals(relativePath.getName(0).toString())) continue;
            }
            if (!(output = normalizedAvatarsDir.resolve(relativePath).normalize()).startsWith(normalizedAvatarsDir)) continue;
            Files.createDirectories(output.getParent(), new FileAttribute[0]);
            InputStream input = jar.getInputStream(entry);
            try {
                \u062f\u0633.copyStream(input, output, normalizedAvatarsDir, entry.getSize());
                ++matchedFiles;
            }
            finally {
                if (input == null) continue;
                input.close();
            }
        }
        return (int)var7_7;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static void installBlocking(String avatarId) throws Exception {
        if (\u062f\u0633.normalizeAvatarId(avatarId) == null) {
            \u0635\u0644.refreshBlocking();
            return;
        }
        long waitStartedAt = System.currentTimeMillis();
        boolean waited = false;
        while (!RUNNING.compareAndSet(false, true)) {
            if (!waited) {
                waited = true;
                LOGGER.info("Waiting for active model installation: target={}", (Object)\u062f\u0633.installTarget(avatarId));
            }
            \u062f\u0633.waitForRunningInstall();
            \u062f\u0633.rethrowLastErrorIfPresent();
            if (avatarId != null && !\u062f\u0633.isInstalled(avatarId)) continue;
            LOGGER.info("Model became available after waiting: target={}, wait={}ms", (Object)\u062f\u0633.installTarget(avatarId), (Object)(System.currentTimeMillis() - waitStartedAt));
            return;
        }
        long startedAt = System.currentTimeMillis();
        LOGGER.info("Starting blocking model installation: target={}, waited={}ms", (Object)\u062f\u0633.installTarget(avatarId), (Object)(waited ? startedAt - waitStartedAt : 0L));
        try {
            \u062f\u0633.prepareCounters();
            \u062f\u0633.installNow(avatarId);
            finished = true;
            lastError = null;
            Object[] objectArray = new Object[5];
            objectArray[0] = \u062f\u0633.installTarget(avatarId);
            objectArray[1] = INSTALLED_FILES.get();
            objectArray[2] = REPLACED_FILES.get();
            objectArray[3] = SKIPPED_FILES.get();
            objectArray[4] = System.currentTimeMillis() - startedAt;
            LOGGER.info("Blocking model installation completed: target={}, installed={}, replaced={}, skipped={}, duration={}ms", objectArray);
        }
        catch (Throwable t) {
            void var6_4;
            finished = false;
            lastError = t;
            Object[] objectArray = new Object[3];
            objectArray[0] = \u062f\u0633.installTarget(avatarId);
            objectArray[1] = System.currentTimeMillis() - startedAt;
            objectArray[2] = var6_4;
            LOGGER.error("Blocking model installation failed: target={}, duration={}ms", objectArray);
            \u062f\u0633.throwAsException((Throwable)var6_4);
        }
        finally {
            RUNNING.set(false);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static Path codeSourcePath() {
        try {
            CodeSource codeSource;
            ProtectionDomain domain = \u062f\u0633.class.getProtectionDomain();
            CodeSource codeSource2 = domain == null ? null : (codeSource = domain.getCodeSource());
            URL location = codeSource == null ? null : codeSource.getLocation();
            if (location == null) {
                return null;
            }
            URI uri = location.toURI();
            return Path.of(uri).normalize();
        }
        catch (Throwable throwable) {
            void var0_1;
            LOGGER.debug("Code source lookup failed", (Throwable)var0_1);
            return null;
        }
    }

    public static void installBlocking() throws Exception {
        \u062f\u0633.installBlocking(null);
    }

    private static void moveDirectory(Path source, Path target) throws IOException {
        try {
            CopyOption[] copyOptionArray = new CopyOption[1];
            copyOptionArray[0] = StandardCopyOption.ATOMIC_MOVE;
            Files.move(source, target, copyOptionArray);
        }
        catch (AtomicMoveNotSupportedException ignored) {
            Files.move(source, target, new CopyOption[0]);
        }
    }

    public static int getCatalogRevision() {
        return \u0635\u0644.revision();
    }

    private static void collectAvatarIdsFromCodeSource(Set<String> ids) throws Exception {
        Path path = \u062f\u0633.codeSourcePath();
        if (path == null) {
            return;
        }
        if (Files.isDirectory(path, new LinkOption[0])) {
            \u062f\u0633.collectAvatarIdsFromDirectory(path.resolve(RESOURCE_ROOT).normalize(), ids);
            return;
        }
        if (Files.isRegularFile(path, new LinkOption[0])) {
            try (JarFile jar = new JarFile(path.toFile());){
                \u062f\u0633.collectAvatarIdsFromJar(jar, RESOURCE_ROOT, ids);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void recreateDirectory(Path directory) throws IOException {
        block6: {
            if (Files.exists(directory, new LinkOption[0])) {
                try (Stream<Path> paths = Files.walk(directory, new FileVisitOption[0]);){
                    Iterator<Path> iterator2 = paths.sorted(Comparator.reverseOrder()).toList().iterator();
                    while (iterator2.hasNext()) {
                        void var3_4;
                        Path path = iterator2.next();
                        Files.deleteIfExists((Path)var3_4);
                    }
                    if (paths == null) break block6;
                }
            }
        }
        Files.createDirectories(directory, new FileAttribute[0]);
    }

    private static void materializeCosmeticAvatar(Path avatarsDir, \u0635\u062e cosmetic) throws IOException {
        String sourceCategory = COSMETIC_SOURCE_CATEGORIES.get(cosmetic.category());
        if (sourceCategory == null) {
            return;
        }
        Path source = avatarsDir.resolve("cosmetics").resolve(sourceCategory).resolve(cosmetic.itemId()).normalize();
        Path output = avatarsDir.resolve(\u062f\u0633.cosmeticAvatarId(cosmetic.category(), cosmetic.itemId())).normalize();
        if (source.startsWith(avatarsDir) && output.startsWith(avatarsDir)) {
            \u062f\u0633.copyDirectory(source, output);
        }
    }

    private static boolean copyResourceRoot(URL root, Path avatarsDir, String avatarId) throws Exception {
        URL uRL;
        String protocol = root.getProtocol();
        if ("file".equalsIgnoreCase(protocol)) {
            Path rootPath = Path.of(root.toURI()).normalize();
            return \u062f\u0633.copyResourceDirectory(rootPath, avatarsDir, avatarId);
        }
        if ("jar".equalsIgnoreCase(protocol)) {
            JarURLConnection connection = (JarURLConnection)root.openConnection();
            String entryName = connection.getEntryName();
            if (entryName == null || entryName.isEmpty()) {
                entryName = RESOURCE_ROOT;
            }
            try (JarFile jar = connection.getJarFile();){
                boolean bl = \u062f\u0633.copyFromJar(jar, entryName, avatarsDir, avatarId) > 0;
                return bl;
            }
        }
        LOGGER.warn("Unsupported bundled Figura resource protocol: protocol={}, source={}", (Object)protocol, (Object)uRL);
        return false;
    }

    public static Path avatarsDirectory() {
        File gameDirectory = \u062f\u0633.gameDirectory();
        if (gameDirectory == null) {
            return null;
        }
        return gameDirectory.toPath().resolve("figura").resolve("avatars").normalize();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void replaceDirectory(Path source, Path target, Path avatarsDir) throws IOException {
        Path backup = avatarsDir.resolve(".rain-figura-backup-" + String.valueOf(UUID.randomUUID())).normalize();
        boolean hadTarget = Files.exists(target, new LinkOption[0]);
        if (hadTarget) {
            \u062f\u0633.moveDirectory(target, backup);
        }
        try {
            \u062f\u0633.moveDirectory(source, target);
            if (hadTarget) {
                REPLACED_FILES.incrementAndGet();
            }
        }
        catch (Throwable throwable) {
            try {
                if (Files.exists(backup, new LinkOption[0])) {
                    if (!Files.exists(target, new LinkOption[0])) {
                        \u062f\u0633.moveDirectory(backup, target);
                    }
                }
                if (!(throwable instanceof IOException)) void var5_6;
                throw new IOException("Failed to replace Figura avatar directory", (Throwable)var5_6);
                IOException iOException = (IOException)throwable;
                throw iOException;
            }
            catch (Throwable throwable2) {
                try {
                    \u062f\u0633.deleteDirectory(backup);
                    throw throwable2;
                }
                catch (IOException cleanupError) {
                    void var3_3;
                    LOGGER.warn("Failed to remove old Figura avatar backup: {}", (Object)var3_3);
                }
                throw throwable2;
            }
        }
        try {
            \u062f\u0633.deleteDirectory(backup);
            return;
        }
        catch (IOException cleanupError) {
            LOGGER.warn("Failed to remove old Figura avatar backup: {}", (Object)backup);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void collectCosmeticIdsFromDevelopmentDirectories(String sourceCategory, Set<String> ids) throws IOException {
        void var1_1;
        String userDir;
        block3: {
            block2: {
                userDir = System.getProperty("user.dir");
                if (userDir == null) break block2;
                if (!userDir.isBlank()) break block3;
            }
            return;
        }
        Path project = Path.of(userDir, new String[0]).normalize();
        \u062f\u0633.collectCosmeticIdsFromDirectory(project.resolve("src").resolve("main").resolve("resources").resolve(RESOURCE_ROOT).resolve("cosmetics").resolve(sourceCategory), ids);
        \u062f\u0633.collectCosmeticIdsFromDirectory(project.resolve("build").resolve("resources").resolve("main").resolve(RESOURCE_ROOT).resolve("cosmetics").resolve(sourceCategory), (Set<String>)var1_1);
    }

    private static void collectAvatarIds(URL root, Set<String> ids) throws Exception {
        String protocol = root.getProtocol();
        if ("file".equalsIgnoreCase(protocol)) {
            Path rootPath = Path.of(root.toURI()).normalize();
            \u062f\u0633.collectAvatarIdsFromDirectory(rootPath, ids);
            return;
        }
        if ("jar".equalsIgnoreCase(protocol)) {
            JarURLConnection connection = (JarURLConnection)root.openConnection();
            String entryName = connection.getEntryName();
            if (entryName == null || entryName.isEmpty()) {
                entryName = RESOURCE_ROOT;
            }
            try (JarFile jar = connection.getJarFile();){
                \u062f\u0633.collectAvatarIdsFromJar(jar, entryName, ids);
            }
        }
    }

    public static boolean isFinished() {
        return finished;
    }

    private static String installTarget(String avatarId) {
        String normalized = \u062f\u0633.normalizeAvatarId(avatarId);
        return normalized == null ? "all bundled models" : normalized;
    }

    /*
     * WARNING - void declaration
     */
    private static String combinedCosmeticsAvatarId(List<\u0635\u062e> cosmetics) {
        void var1_1;
        StringBuilder id = new StringBuilder("rain-cosmetics");
        Iterator<\u0635\u062e> iterator2 = cosmetics.iterator();
        while (iterator2.hasNext()) {
            \u0635\u062e cosmetic = iterator2.next();
            id.append('-').append(cosmetic.category()).append('-').append(cosmetic.itemId());
        }
        return var1_1.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static \u062e\u064f readCosmeticMetadata(String category, String cosmeticId) {
        Path avatarJson;
        String fallbackName;
        block9: {
            \u062e\u064f metadata;
            block8: {
                String sourceCategory = COSMETIC_SOURCE_CATEGORIES.get(category);
                fallbackName = \u062f\u0633.titleName(cosmeticId);
                if (sourceCategory == null) {
                    return new \u062e\u064f(fallbackName, "");
                }
                metadata = \u062f\u0633.readMetadata("figura_avatars/cosmetics/" + sourceCategory + "/" + cosmeticId + "/avatar.json", fallbackName);
                if (!metadata.name().equals(fallbackName) || !metadata.description().isBlank()) {
                    return metadata;
                }
                Path avatarsDir = \u062f\u0633.avatarsDirectory();
                if (avatarsDir == null) {
                    return metadata;
                }
                avatarJson = avatarsDir.resolve("cosmetics").resolve(sourceCategory).resolve(cosmeticId).resolve("avatar.json").normalize();
                if (!avatarJson.startsWith(avatarsDir)) break block8;
                if (Files.isRegularFile(avatarJson, new LinkOption[0])) break block9;
            }
            return metadata;
        }
        try {
            void var9_10;
            void var8_9;
            JsonObject root = JsonParser.parseString(Files.readString(avatarJson, StandardCharsets.UTF_8)).getAsJsonObject();
            String name = root.has("name") ? root.get("name").getAsString() : fallbackName;
            String description = root.has("description") ? root.get("description").getAsString() : "";
            return new \u062e\u064f((String)var8_9, (String)var9_10);
        }
        catch (Throwable throwable) {
            void var4_4;
            return var4_4;
        }
    }

    private static \u0635\u062e parseCosmeticAvatarId(String avatarId) {
        block5: {
            block4: {
                if (avatarId == null) break block4;
                if (avatarId.startsWith("cosmetic-")) break block5;
            }
            return null;
        }
        for (String category : COSMETIC_SOURCE_CATEGORIES.keySet()) {
            String prefix = "cosmetic-" + category + "-";
            if (!avatarId.startsWith(prefix)) continue;
            String itemId = avatarId.substring(prefix.length());
            return \u062f\u0633.isSafeAvatarId(itemId) ? new \u0635\u062e(category, itemId) : null;
        }
        return null;
    }

    private static InputStream openBundledResource(String resourcePath) throws IOException {
        Path resource;
        block7: {
            block6: {
                InputStream classpathInput = \u062f\u0633.class.getClassLoader().getResourceAsStream(resourcePath);
                if (classpathInput != null) {
                    return classpathInput;
                }
                Path root = \u062f\u0633.findModResourceRoot();
                if (root == null) {
                    return null;
                }
                String prefix = "figura_avatars/";
                if (!resourcePath.startsWith(prefix)) {
                    return null;
                }
                resource = root.resolve(resourcePath.substring(prefix.length())).normalize();
                if (!resource.startsWith(root)) break block6;
                if (Files.isRegularFile(resource, new LinkOption[0])) break block7;
            }
            return null;
        }
        return Files.newInputStream(resource, new OpenOption[0]);
    }

    /*
     * WARNING - void declaration
     */
    private static void extractRemoteArchive(byte[] archive, Path output, long expectedUnpackedSize) throws IOException {
        long unpackedSize = 0L;
        int fileCount = 0;
        HashSet<String> extractedPaths = new HashSet<String>();
        byte[] buffer = new byte[16384];
        try (ZipInputStream zip2 = new ZipInputStream((InputStream)new ByteArrayInputStream(archive), StandardCharsets.UTF_8);){
            ZipEntry entry;
            while ((entry = zip2.getNextEntry()) != null) {
                String name = entry.getName();
                if (name == null || name.isBlank() || name.contains("\\")) {
                    throw new IOException("Remote Figura archive contains an invalid path");
                }
                Path relative = Path.of(name, new String[0]).normalize();
                if (relative.isAbsolute() || \u062f\u0633.startsWithParentTraversal(relative)) {
                    throw new IOException("Remote Figura archive escapes its destination");
                }
                Path destination = output.resolve(relative).normalize();
                if (!destination.startsWith(output)) {
                    throw new IOException("Remote Figura archive escapes its destination");
                }
                if (entry.isDirectory()) {
                    Files.createDirectories(destination, new FileAttribute[0]);
                    zip2.closeEntry();
                    continue;
                }
                if (REMOTE_MARKER_FILE.equals(relative.toString()) || !extractedPaths.add(relative.toString())) {
                    throw new IOException("Remote Figura archive contains a duplicate path");
                }
                if (++fileCount > 512) {
                    throw new IOException("Remote Figura archive contains too many files");
                }
                Files.createDirectories(destination.getParent(), new FileAttribute[0]);
                OpenOption[] openOptionArray = new OpenOption[2];
                openOptionArray[0] = StandardOpenOption.CREATE_NEW;
                openOptionArray[1] = StandardOpenOption.WRITE;
                try (OutputStream outputStream = Files.newOutputStream(destination, openOptionArray);){
                    int read;
                    while ((read = zip2.read(buffer)) >= 0) {
                        void var15_15;
                        if (read == 0) continue;
                        if ((unpackedSize += (long)read) > expectedUnpackedSize) {
                            throw new IOException("Remote Figura archive exceeds its declared size");
                        }
                        outputStream.write(buffer, 0, (int)var15_15);
                    }
                }
                zip2.closeEntry();
                INSTALLED_FILES.incrementAndGet();
            }
        }
        if (fileCount == 0 || unpackedSize != expectedUnpackedSize) {
            throw new IOException("Remote Figura archive size does not match the catalog");
        }
    }

    /*
     * WARNING - void declaration
     */
    private static List<String> findBundledCosmeticIds(String category) {
        void var2_2;
        String sourceCategory = COSMETIC_SOURCE_CATEGORIES.get(category);
        if (sourceCategory == null) {
            return Collections.emptyList();
        }
        LinkedHashSet<String> ids = new LinkedHashSet<String>();
        try {
            Path modResourceRoot = \u062f\u0633.findModResourceRoot();
            if (modResourceRoot != null) {
                \u062f\u0633.collectCosmeticIdsFromDirectory(modResourceRoot.resolve("cosmetics").resolve(sourceCategory), ids);
            }
            if (ids.isEmpty()) {
                ClassLoader loader = \u062f\u0633.class.getClassLoader();
                Enumeration<URL> roots = loader.getResources(RESOURCE_ROOT);
                while (roots.hasMoreElements()) {
                    \u062f\u0633.collectCosmeticIds(roots.nextElement(), sourceCategory, ids);
                }
            }
            if (ids.isEmpty()) {
                \u062f\u0633.collectCosmeticIdsFromCodeSource(sourceCategory, ids);
            }
            if (ids.isEmpty()) {
                \u062f\u0633.collectCosmeticIdsFromDevelopmentDirectories(sourceCategory, ids);
            }
        }
        catch (Throwable throwable) {
            void var3_4;
            LOGGER.warn("Failed to discover bundled Figura cosmetics: category={}", (Object)category, (Object)var3_4);
        }
        return new ArrayList<String>((Collection<String>)var2_2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean startsWithParentTraversal(Path path) {
        if (path.getNameCount() <= 0) return false;
        if (!"..".equals(path.getName(0).toString())) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isInstalled(String avatarId) {
        String normalizedAvatarId = \u062f\u0633.normalizeAvatarId(avatarId);
        if (!\u062f\u0633.isSafeAvatarId(normalizedAvatarId)) {
            return false;
        }
        Path avatarsDir = \u062f\u0633.avatarsDirectory();
        if (avatarsDir == null) {
            return false;
        }
        Path avatarJson = avatarsDir.resolve(normalizedAvatarId).resolve("avatar.json").normalize();
        if (!avatarJson.startsWith(avatarsDir)) return false;
        if (!Files.isRegularFile(avatarJson, new LinkOption[0])) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static List<FiguraAvatarInstaller.AvatarEntry> getBundledAvatars() {
        void var1_1;
        List<\u0633\u062f> remoteAvatars = \u0635\u0644.avatars();
        if (remoteAvatars.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList<FiguraAvatarInstaller.AvatarEntry> avatars = new ArrayList<FiguraAvatarInstaller.AvatarEntry>(remoteAvatars.size());
        Iterator<\u0633\u062f> iterator2 = remoteAvatars.iterator();
        while (iterator2.hasNext()) {
            \u0633\u062f avatar = iterator2.next();
            avatars.add(new FiguraAvatarInstaller.AvatarEntry(avatar.id(), avatar.name(), avatar.description(), avatar.previewPath(), \u062f\u0633.isRemoteAvatarCurrent(avatar), avatar.previewSha256(), avatar.previewSize(), avatar.previewWidth(), avatar.previewHeight()));
        }
        return var1_1;
    }

    private static String cosmeticAvatarId(String category, String itemId) {
        return "cosmetic-" + category + "-" + itemId;
    }

    private static void collectCosmeticIds(URL root, String sourceCategory, Set<String> ids) throws Exception {
        if ("file".equalsIgnoreCase(root.getProtocol())) {
            \u062f\u0633.collectCosmeticIdsFromDirectory(Path.of(root.toURI()).resolve("cosmetics").resolve(sourceCategory), ids);
            return;
        }
        if ("jar".equalsIgnoreCase(root.getProtocol())) {
            JarURLConnection connection = (JarURLConnection)root.openConnection();
            String entryName = connection.getEntryName();
            try (JarFile jar = connection.getJarFile();){
                \u062f\u0633.collectCosmeticIdsFromJar(jar, entryName == null || entryName.isEmpty() ? RESOURCE_ROOT : entryName, sourceCategory, ids);
            }
        }
    }

    public static Throwable getLastError() {
        return lastError;
    }

    public static Throwable getCatalogError() {
        return \u0635\u0644.lastError();
    }

    public static void installAsync() {
        \u062f\u0633.installAsync(null);
    }

    /*
     * WARNING - void declaration
     */
    private static void installNow(String avatarId) throws Exception {
        void var2_2;
        String normalizedAvatarId = \u062f\u0633.normalizeAvatarId(avatarId);
        \u0635\u062e cosmetic = \u062f\u0633.parseCosmeticAvatarId(normalizedAvatarId);
        if (normalizedAvatarId == null) {
            \u0635\u0644.refreshBlocking();
            return;
        }
        if (cosmetic == null) {
            Path avatarsDir = \u062f\u0633.avatarsDirectory();
            if (avatarsDir == null) {
                throw new IOException("Figura avatars directory is unavailable");
            }
            Files.createDirectories(avatarsDir, new FileAttribute[0]);
            \u0633\u062f remoteAvatar = \u0635\u0644.requireAvatar(normalizedAvatarId);
            \u062f\u0633.installRemoteAvatar(avatarsDir, remoteAvatar);
            return;
        }
        Path avatarsDir = \u062f\u0633.avatarsDirectory();
        if (avatarsDir == null) {
            LOGGER.warn("Figura avatars directory is unavailable: target={}", (Object)\u062f\u0633.installTarget(avatarId));
            return;
        }
        LOGGER.info("Figura model installation directory: target={}, path={}", (Object)\u062f\u0633.installTarget(avatarId), (Object)avatarsDir);
        Files.createDirectories(avatarsDir, new FileAttribute[0]);
        boolean found = false;
        Path modResourceRoot = \u062f\u0633.findModResourceRoot();
        if (modResourceRoot != null) {
            LOGGER.info("Installing model resources from Fabric mod root: target={}, source={}", (Object)\u062f\u0633.installTarget(avatarId), (Object)modResourceRoot);
            found = \u062f\u0633.copyResourceDirectory(modResourceRoot, avatarsDir, cosmetic == null ? normalizedAvatarId : null);
        }
        if (!found) {
            ClassLoader loader = \u062f\u0633.class.getClassLoader();
            Enumeration<URL> roots = loader.getResources(RESOURCE_ROOT);
            while (roots.hasMoreElements()) {
                URL root = roots.nextElement();
                Object[] objectArray = new Object[3];
                objectArray[0] = \u062f\u0633.installTarget(avatarId);
                objectArray[1] = root.getProtocol();
                objectArray[2] = root;
                LOGGER.debug("Installing model resources from classpath root: target={}, protocol={}, source={}", objectArray);
                found |= \u062f\u0633.copyResourceRoot(root, avatarsDir, cosmetic == null ? normalizedAvatarId : null);
            }
        }
        if (!found) {
            LOGGER.debug("Classpath model root was not found, using code source: target={}", (Object)\u062f\u0633.installTarget(avatarId));
            found = \u062f\u0633.copyFromCodeSourceJar(avatarsDir, cosmetic == null ? normalizedAvatarId : null);
        }
        if (!found) {
            throw new IOException("Bundled Figura model resources were not found");
        }
        if (var2_2 != null) {
            void var3_4;
            \u062f\u0633.materializeCosmeticAvatar((Path)var3_4, (\u0635\u062e)var2_2);
        }
    }

    private static void copyDirectory(Path root, Path outputRoot) throws IOException {
        if (!Files.isDirectory(root, new LinkOption[0])) {
            return;
        }
        Path normalizedRoot = root.normalize();
        Path normalizedOutputRoot = outputRoot.normalize();
        try (Stream<Path> stream = Files.walk(normalizedRoot, new FileVisitOption[0]);){
            for (Path file : stream.filter(x$0 -> Files.isRegularFile(x$0, new LinkOption[0])).toList()) {
                Path normalizedFile = file.normalize();
                Path relativePath = normalizedRoot.relativize(normalizedFile).normalize();
                if (relativePath.isAbsolute() || \u062f\u0633.startsWithParentTraversal(relativePath)) {
                    throw new IOException("Invalid bundled model path: " + String.valueOf(relativePath));
                }
                Path output = \u062f\u0633.resolveAcrossProviders(normalizedOutputRoot, relativePath);
                \u062f\u0633.copyFile(normalizedFile, output, normalizedOutputRoot);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean copyResourceDirectory(Path root, Path avatarsDir, String avatarId) throws IOException {
        void var4_4;
        Path source = avatarId == null ? root : root.resolve(avatarId).normalize();
        if (!\u062f\u0633.containsRegularFile(source)) {
            return false;
        }
        Path output = avatarId == null ? avatarsDir : avatarsDir.resolve(avatarId).normalize();
        \u062f\u0633.copyDirectory(source, (Path)var4_4);
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static List<FiguraAvatarInstaller.AvatarEntry> getBundledCosmetics(String category) {
        void var3_3;
        String cosmeticCategory = \u062f\u0633.normalizeCosmeticCategory(category);
        if (cosmeticCategory == null) {
            return Collections.emptyList();
        }
        List<String> ids = \u062f\u0633.findBundledCosmeticIds(cosmeticCategory);
        ids.addAll(\u062f\u0633.findInstalledCosmeticIds(cosmeticCategory));
        ids = new ArrayList<String>(new LinkedHashSet<String>(ids));
        if (ids.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList<FiguraAvatarInstaller.AvatarEntry> cosmetics = new ArrayList<FiguraAvatarInstaller.AvatarEntry>(ids.size());
        for (String id : ids) {
            \u062e\u064f metadata = \u062f\u0633.readCosmeticMetadata(cosmeticCategory, id);
            cosmetics.add(new FiguraAvatarInstaller.AvatarEntry(\u062f\u0633.cosmeticAvatarId(cosmeticCategory, id), metadata.name(), metadata.description(), "textures/cosmetics/" + cosmeticCategory + "/" + id + "/avatar.png", \u062f\u0633.isInstalled(\u062f\u0633.cosmeticAvatarId(cosmeticCategory, id)), null, 0L, 0, 0));
        }
        return var3_3;
    }

    private static void collectAvatarIdsFromJar(JarFile jar, String rootEntry, Set<String> ids) {
        Object prefix = rootEntry.endsWith("/") ? rootEntry : rootEntry + "/";
        Enumeration<JarEntry> entries = jar.entries();
        while (entries.hasMoreElements()) {
            String avatarId;
            String relativeName;
            int slash;
            JarEntry entry = entries.nextElement();
            if (entry == null || entry.isDirectory()) continue;
            String name = entry.getName();
            if (!name.startsWith((String)prefix) || !name.endsWith("/avatar.json") || (slash = (relativeName = name.substring(((String)prefix).length())).indexOf(47)) <= 0 || !\u062f\u0633.isSafeAvatarId(avatarId = relativeName.substring(0, slash))) continue;
            ids.add(avatarId);
        }
    }

    private static void copyFile(Path input, Path output, Path outputRoot) throws IOException {
        Path normalizedOutput = output.normalize();
        Path normalizedOutputRoot = outputRoot.normalize();
        if (!normalizedOutput.startsWith(normalizedOutputRoot)) {
            return;
        }
        Files.createDirectories(normalizedOutput.getParent(), new FileAttribute[0]);
        long sourceSize = Files.size(input);
        if (Files.exists(normalizedOutput, new LinkOption[0])) {
            if (Files.size(normalizedOutput) == sourceSize) {
                SKIPPED_FILES.incrementAndGet();
                LOGGER.debug("Model file unchanged: {}", (Object)normalizedOutput);
                return;
            }
        }
        if (Files.exists(normalizedOutput, new LinkOption[0])) {
            REPLACED_FILES.incrementAndGet();
            LOGGER.debug("Replacing model file: {}", (Object)normalizedOutput);
        } else {
            INSTALLED_FILES.incrementAndGet();
            LOGGER.debug("Installing model file: {}", (Object)normalizedOutput);
        }
        CopyOption[] copyOptionArray = new CopyOption[2];
        copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
        copyOptionArray[1] = StandardCopyOption.COPY_ATTRIBUTES;
        Files.copy(input, normalizedOutput, copyOptionArray);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void deleteDirectory(Path directory) throws IOException {
        if (!Files.exists(directory, new LinkOption[0])) {
            return;
        }
        try (Stream<Path> paths = Files.walk(directory, new FileVisitOption[0]);){
            Iterator<Path> iterator2 = paths.sorted(Comparator.reverseOrder()).toList().iterator();
            while (iterator2.hasNext()) {
                void var3_4;
                Path path = iterator2.next();
                Files.deleteIfExists((Path)var3_4);
            }
            if (paths == null) return;
        }
    }

    private static List<String> findInstalledCosmeticIds(String category) {
        Path avatarsDir;
        String sourceCategory;
        block6: {
            block5: {
                sourceCategory = COSMETIC_SOURCE_CATEGORIES.get(category);
                avatarsDir = \u062f\u0633.avatarsDirectory();
                if (sourceCategory == null) break block5;
                if (avatarsDir != null) break block6;
            }
            return Collections.emptyList();
        }
        LinkedHashSet<String> ids = new LinkedHashSet<String>();
        try {
            \u062f\u0633.collectCosmeticIdsFromDirectory(avatarsDir.resolve("cosmetics").resolve(sourceCategory), ids);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return new ArrayList<String>(ids);
    }

    private static boolean isSafeAvatarId(String avatarId) {
        return !(avatarId == null || avatarId.isBlank() || avatarId.contains("/") || avatarId.contains("\\") || ".".equals(avatarId) || "..".equals(avatarId));
    }

    private static \u062e\u064f readMetadata(String avatarId) {
        String fallbackName = \u062f\u0633.titleName(avatarId);
        String resourcePath = "figura_avatars/" + avatarId + "/avatar.json";
        return \u062f\u0633.readMetadata(resourcePath, fallbackName);
    }
}
