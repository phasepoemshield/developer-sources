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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
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
import kotakbaz.rain.client.figura.FiguraAvatarInstaller$AvatarEntry;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rainpatch.ModelsNetworkBridge;

// $VF: Compiled from heavy
public final class دس {
   private static volatile Throwable lastError;
   private static final AtomicInteger REPLACED_FILES = new AtomicInteger();
   private static final Map<String, String> COSMETIC_SOURCE_CATEGORIES = Map.of("hats", "hats", "wings", "wings", "tails", "tail");
   private static final AtomicInteger SKIPPED_FILES = new AtomicInteger();
   private static final String REMOTE_MARKER_FILE = ".rain-archive.sha256";
   private static final AtomicBoolean RUNNING = new AtomicBoolean(false);
   private static final AtomicInteger INSTALLED_FILES = new AtomicInteger();
   private static final Logger LOGGER = LoggerFactory.getLogger("Rain Figura Installer");
   private static final String MOD_ID = "rain-visuals";
   private static volatile boolean finished;
   private static final int MAX_REMOTE_ARCHIVE_ENTRIES = 512;
   private static final String RESOURCE_ROOT = "figura_avatars";

   private static String titleName(String avatarId) {
      if (avatarId != null && !avatarId.isBlank()) {
         String[] parts = avatarId.replace('-', ' ').replace('_', ' ').split(" ");
         StringBuilder builder = new StringBuilder();

         for (String part : parts) {
            if (!part.isBlank()) {
               if (!builder.isEmpty()) {
                  builder.append(' ');
               }

               builder.append(Character.toUpperCase(part.charAt(0)));
               if (part.length() > 1) {
                  builder.append(part.substring(1));
               }
            }
         }

         return builder.isEmpty() ? avatarId : builder.toString();
      } else {
         return "Avatar";
      }
   }

   private static void collectCosmeticIdsFromJar(JarFile jar, String sourceCategory, String ids, Set<String> rootEntry) {
      String prefix = (rootEntry.endsWith("/") ? rootEntry : rootEntry + "/") + "cosmetics/" + sourceCategory + "/";
      Enumeration<JarEntry> entries = jar.entries();

      while (entries.hasMoreElements()) {
         JarEntry entry = entries.nextElement();
         if (entry != null && !entry.isDirectory() && entry.getName().startsWith(prefix) && entry.getName().endsWith("/avatar.json")) {
            String relative = entry.getName().substring(prefix.length(), entry.getName().length() - "/avatar.json".length());
            if (!relative.contains("/") && isSafeAvatarId(relative)) {
               ids.add(relative);
            }
         }
      }
   }

   private static boolean containsRegularFile(Path root) throws IOException {
      if (!Files.isDirectory(root)) {
         return false;
      }

      try (Stream<Path> files = Files.walk(root)) {
         return files.anyMatch(x$0 -> Files.isRegularFile(x$0));
      }
   }

   private static void rethrowLastErrorIfPresent() throws Exception {
      Throwable error = lastError;
      if (error != null) {
         throwAsException(error);
      }
   }

   private static Path findModResourceRoot() {
      try {
         ModContainer throwable = (ModContainer)FabricLoader.getInstance().getModContainer("rain-visuals").orElse(null);
         if (throwable == null) {
            return null;
         }

         Path root = (Path)throwable.findPath("figura_avatars").orElse(null);
         return root != null && Files.isDirectory(root) ? root.normalize() : null;
      } catch (Throwable var2) {
         LOGGER.debug("Fabric mod resource lookup failed: path={}", "figura_avatars", var2);
         return null;
      }
   }

   public static void initializeRemoteCatalog() {
      ModelsNetworkBridge.initialize();
   }

   private static void collectAvatarIdsFromDirectory(Path root, Set<String> ids) throws IOException {
      if (Files.isDirectory(root)) {
         try (Stream<Path> stream = Files.list(root)) {
            stream.filter(x$0 -> Files.isDirectory(x$0))
               .filter(path -> Files.isRegularFile(path.resolve("avatar.json")))
               .map(path -> path.getFileName().toString())
               .filter(دس::isSafeAvatarId)
               .forEach(ids::add);
         }
      }
   }

   private static boolean isRemoteAvatarCurrent(سد avatar) {
      Path avatarsDir = avatarsDirectory();
      if (avatarsDir != null && avatar != null && isSafeAvatarId(avatar.id())) {
         Path target = avatarsDir.resolve(avatar.id()).normalize();
         Path marker = target.resolve(".rain-archive.sha256").normalize();
         if (target.startsWith(avatarsDir) && Files.isRegularFile(target.resolve("avatar.json")) && Files.isRegularFile(marker)) {
            try {
               return Files.readString(marker, StandardCharsets.UTF_8).trim().equals(avatar.archiveSha256());
            } catch (IOException var5) {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static String installCombinedCosmetics(List<String> avatarIds) throws Exception {
      Map<String, صخ> cosmeticsByCategory = new LinkedHashMap<>();

      for (String avatarsDir : avatarIds) {
         صخ combinedId = parseCosmeticAvatarId(normalizeAvatarId(avatarsDir));
         if (combinedId != null) {
            cosmeticsByCategory.put(combinedId.category(), combinedId);
         }
      }

      if (cosmeticsByCategory.isEmpty()) {
         throw new IOException("No cosmetics selected");
      }

      List<صخ> var11 = new ArrayList<>(cosmeticsByCategory.values());
      var11.sort(Comparator.comparingInt(دس::cosmeticCategoryOrder));

      for (صخ var14 : var11) {
         installBlocking(cosmeticAvatarId(var14.category(), var14.itemId()));
      }

      Path var13 = avatarsDirectory();
      if (var13 == null) {
         throw new IOException("Figura avatars directory is unavailable");
      }

      String var15 = combinedCosmeticsAvatarId(var11);
      Path output = var13.resolve(var15).normalize();
      if (!output.startsWith(var13)) {
         throw new IOException("Invalid combined cosmetics path");
      }

      recreateDirectory(output);
      List<String> scripts = new ArrayList();
      Set<String> copiedNames = new LinkedHashSet();

      for (صخ cosmetic : var11) {
         Path source = var13.resolve(cosmeticAvatarId(cosmetic.category(), cosmetic.itemId())).normalize();
         if (!source.startsWith(var13) || !Files.isDirectory(source)) {
            throw new IOException("Cosmetic files not found: " + cosmetic.itemId());
         }

         copyCosmeticFiles(source, output, cosmetic, copiedNames, scripts);
      }

      Files.writeString(output.resolve("avatar.json"), "{\n  \"name\": \"Rain Cosmetics\",\n  \"authors\": [\"Rain\"]\n}\n", StandardCharsets.UTF_8);
      if (!scripts.isEmpty()) {
         Files.writeString(output.resolve("script.lua"), String.join("\n\n", scripts) + "\n", StandardCharsets.UTF_8);
      }

      return var15;
   }

   private static int cosmeticCategoryOrder(صخ cosmetic) {
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
      if (throwable instanceof Exception exception) {
         throw exception;
      } else if (throwable instanceof Error error) {
         throw error;
      } else {
         throw new Exception(throwable);
      }
   }

   private static void collectCosmeticIdsFromDirectory(Path root, Set<String> ids) throws IOException {
      if (Files.isDirectory(root)) {
         try (Stream<Path> stream = Files.list(root)) {
            stream.filter(x$0 -> Files.isDirectory(x$0))
               .filter(path -> Files.isRegularFile(path.resolve("avatar.json")))
               .map(path -> path.getFileName().toString())
               .filter(دس::isSafeAvatarId)
               .forEach(ids::add);
         }
      }
   }

   private static boolean copyFromCodeSourceJar(Path avatarId, String avatarsDir) throws Exception {
      Path path = codeSourcePath();
      if (path == null) {
         LOGGER.warn("Code source is unavailable while locating bundled Figura models");
         return false;
      }

      if (Files.isDirectory(path)) {
         Path var8 = path.resolve("figura_avatars").normalize();
         return copyResourceDirectory(var8, avatarsDir, avatarId);
      }

      if (Files.isRegularFile(path)) {
         try (JarFile jar = new JarFile(path.toFile())) {
            return copyFromJar(jar, "figura_avatars", avatarsDir, avatarId) > 0;
         }
      } else {
         return false;
      }
   }

   private static String normalizeCosmeticCategory(String category) {
      if (category == null) {
         return null;
      }

      String normalized = category.trim().toLowerCase(Locale.ROOT);
      return COSMETIC_SOURCE_CATEGORIES.containsKey(normalized) ? normalized : null;
   }

   public static boolean isCatalogRefreshing() {
      return صل.isRefreshing();
   }

   private static File gameDirectory() {
      try {
         Path gameDirectory = FabricLoader.getInstance().getGameDir();
         if (gameDirectory != null) {
            return gameDirectory.toAbsolutePath().normalize().toFile();
         }
      } catch (Throwable var2) {
      }

      try {
         MinecraftClient minecraft = MinecraftClient.getInstance();
         if (minecraft != null && minecraft.runDirectory != null) {
            return minecraft.runDirectory.toPath().toAbsolutePath().normalize().toFile();
         }
      } catch (Throwable var1) {
      }

      String userDir = System.getProperty("user.dir");
      return userDir == null ? null : Path.of(userDir).toAbsolutePath().normalize().toFile();
   }

   public static void installAsync(String avatarId) {
      if (normalizeAvatarId(avatarId) == null) {
         صل.refreshAsync();
      } else if (!RUNNING.compareAndSet(false, true)) {
         LOGGER.debug("Async install request joined an active install: target={}", installTarget(avatarId));
      } else {
         Thread thread = new Thread(
            () -> {
               long startedAt = System.currentTimeMillis();
               LOGGER.info("Starting async model installation: target={}", installTarget(avatarId));

               try {
                  prepareCounters();
                  installNow(avatarId);
                  finished = true;
                  lastError = null;
                  LOGGER.info(
                     "Async model installation completed: target={}, installed={}, replaced={}, skipped={}, duration={}ms",
                     installTarget(avatarId),
                     INSTALLED_FILES.get(),
                     REPLACED_FILES.get(),
                     SKIPPED_FILES.get(),
                     System.currentTimeMillis() - startedAt
                  );
               } catch (Throwable var7) {
                  finished = false;
                  lastError = var7;
                  LOGGER.error(
                     "Async model installation failed: target={}, duration={}ms", installTarget(avatarId), System.currentTimeMillis() - startedAt, var7
                  );
               } finally {
                  RUNNING.set(false);
               }
            },
            "Rain-Figura-Avatar-Installer"
         );
         thread.setDaemon(true);
         thread.start();
      }
   }

   private static void collectCosmeticIdsFromCodeSource(String sourceCategory, Set<String> ids) throws Exception {
      Path path = codeSourcePath();
      if (path != null) {
         if (Files.isDirectory(path)) {
            collectCosmeticIdsFromDirectory(path.resolve("figura_avatars").resolve("cosmetics").resolve(sourceCategory), ids);
         } else if (Files.isRegularFile(path)) {
            try (JarFile jar = new JarFile(path.toFile())) {
               collectCosmeticIdsFromJar(jar, "figura_avatars", sourceCategory, ids);
            }
         }
      }
   }

   private static List<String> findBundledAvatarIds() {
      Set<String> ids = new LinkedHashSet<>();

      try {
         Path modResourceRoot = findModResourceRoot();
         if (modResourceRoot != null) {
            collectAvatarIdsFromDirectory(modResourceRoot, ids);
         }

         if (ids.isEmpty()) {
            ClassLoader loader = دس.class.getClassLoader();
            Enumeration<URL> roots = loader.getResources("figura_avatars");

            while (roots.hasMoreElements()) {
               collectAvatarIds((URL)roots.nextElement(), ids);
            }
         }

         if (ids.isEmpty()) {
            collectAvatarIdsFromCodeSource(ids);
         }
      } catch (Throwable var4) {
         LOGGER.warn("Failed to discover bundled Figura models", var4);
      }

      return new ArrayList<>(ids);
   }

   private static void installRemoteAvatar(Path avatar, سد avatarsDir) throws Exception {
      if (isRemoteAvatarCurrent(avatar)) {
         SKIPPED_FILES.incrementAndGet();
      } else {
         byte[] archive = صل.downloadArchive(avatar);
         Path temporary = Files.createTempDirectory(avatarsDir, ".rain-figura-install-");
         boolean installed = false;

         try {
            extractRemoteArchive(archive, temporary, avatar.unpackedSize());
            if (!Files.isRegularFile(temporary.resolve("avatar.json"))) {
               throw new IOException("Remote Figura archive does not contain avatar.json");
            }

            Files.writeString(temporary.resolve(".rain-archive.sha256"), avatar.archiveSha256(), StandardCharsets.UTF_8);
            Path target = avatarsDir.resolve(avatar.id()).normalize();
            if (!target.startsWith(avatarsDir) || !isSafeAvatarId(avatar.id())) {
               throw new IOException("Remote Figura avatar has an unsafe destination");
            }

            replaceDirectory(temporary, target, avatarsDir);
            installed = true;
         } finally {
            if (!installed) {
               deleteDirectory(temporary);
            }
         }
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

      for (Path segment : relativePath) {
         String name = segment.toString();
         if (name.isBlank() || ".".equals(name) || "..".equals(name)) {
            throw new IOException("Invalid bundled model path segment: " + name);
         }

         output = output.resolve(name);
      }

      Path var6 = output.normalize();
      if (!var6.startsWith(outputRoot)) {
         throw new IOException("Bundled model path escapes destination: " + relativePath);
      } else {
         return var6;
      }
   }

   private static void copyCosmeticFiles(Path output, Path source, صخ cosmetic, Set<String> copiedNames, List<String> scripts) throws IOException {
      try (Stream<Path> files = Files.walk(source)) {
         for (Path input : files.filter(x$0 -> Files.isRegularFile(x$0)).toList()) {
            Path relative = source.relativize(input);
            String fileName = relative.getFileName().toString();
            if (!"avatar.json".equals(fileName)) {
               if ("script.lua".equals(fileName)) {
                  scripts.add(Files.readString(input, StandardCharsets.UTF_8));
               } else {
                  Path destination = output.resolve(relative).normalize();
                  if (copiedNames.contains(relative.toString())) {
                     destination = output.resolve(cosmetic.category() + "-" + cosmetic.itemId() + "-" + fileName).normalize();
                  }

                  if (destination.startsWith(output)) {
                     Files.createDirectories(destination.getParent());
                     Files.copy(input, destination, StandardCopyOption.REPLACE_EXISTING);
                     copiedNames.add(output.relativize(destination).toString());
                  }
               }
            }
         }
      }
   }

   private static void copyStream(InputStream input, Path sourceSize, Path output, long outputRoot) throws IOException {
      Path normalizedOutput = output.normalize();
      Path normalizedOutputRoot = outputRoot.normalize();
      if (normalizedOutput.startsWith(normalizedOutputRoot)) {
         Files.createDirectories(normalizedOutput.getParent());
         if (Files.exists(normalizedOutput) && sourceSize >= 0L && Files.size(normalizedOutput) == sourceSize) {
            SKIPPED_FILES.incrementAndGet();
            LOGGER.debug("Model file unchanged: {}", normalizedOutput);
         } else {
            if (Files.exists(normalizedOutput)) {
               REPLACED_FILES.incrementAndGet();
               LOGGER.debug("Replacing model file: {}", normalizedOutput);
            } else {
               INSTALLED_FILES.incrementAndGet();
               LOGGER.debug("Installing model file: {}", normalizedOutput);
            }

            Files.copy(input, normalizedOutput, StandardCopyOption.REPLACE_EXISTING);
         }
      }
   }

   private static String normalizeAvatarId(String avatarId) {
      if (avatarId == null) {
         return null;
      }

      String normalized = avatarId.trim();
      return normalized.isEmpty() ? null : normalized;
   }

   private static خُ readMetadata(String resourcePath, String fallbackName) {
      try (InputStream input = openBundledResource(resourcePath)) {
         if (input == null) {
            return new خُ(fallbackName, "");
         }

         String json = new String(input.readAllBytes(), StandardCharsets.UTF_8);
         JsonObject root = JsonParser.parseString(json).getAsJsonObject();
         String name = root.has("name") ? root.get("name").getAsString() : fallbackName;
         String description = root.has("description") ? root.get("description").getAsString() : "";
         return new خُ(name, description);
      } catch (Throwable var10) {
         return new خُ(fallbackName, "");
      }
   }

   private static void waitForRunningInstall() throws InterruptedException {
      while (RUNNING.get()) {
         Thread.sleep(10L);
      }
   }

   private دس() {
   }

   private static int copyFromJar(JarFile avatarsDir, String rootEntry, Path avatarId, String jar) throws IOException {
      Path normalizedAvatarsDir = avatarsDir.normalize();
      String prefix = rootEntry.endsWith("/") ? rootEntry : rootEntry + "/";
      Enumeration<JarEntry> entries = jar.entries();
      int matchedFiles = 0;

      while (entries.hasMoreElements()) {
         JarEntry entry = entries.nextElement();
         if (entry != null && !entry.isDirectory()) {
            String name = entry.getName();
            if (name.startsWith(prefix)) {
               String relativeName = name.substring(prefix.length());
               if (!relativeName.isEmpty() && !relativeName.contains("\\")) {
                  Path relativePath = Path.of(relativeName).normalize();
                  if (!relativePath.isAbsolute()
                     && !startsWithParentTraversal(relativePath)
                     && (avatarId == null || relativePath.getNameCount() != 0 && avatarId.equals(relativePath.getName(0).toString()))) {
                     Path output = normalizedAvatarsDir.resolve(relativePath).normalize();
                     if (output.startsWith(normalizedAvatarsDir)) {
                        Files.createDirectories(output.getParent());

                        try (InputStream input = jar.getInputStream(entry)) {
                           copyStream(input, output, normalizedAvatarsDir, entry.getSize());
                           matchedFiles++;
                        }
                     }
                  }
               }
            }
         }
      }

      return matchedFiles;
   }

   public static void installBlocking(String avatarId) throws Exception {
      if (normalizeAvatarId(avatarId) == null) {
         صل.refreshBlocking();
      } else {
         long waitStartedAt = System.currentTimeMillis();
         boolean waited = false;

         while (!RUNNING.compareAndSet(false, true)) {
            if (!waited) {
               waited = true;
               LOGGER.info("Waiting for active model installation: target={}", installTarget(avatarId));
            }

            waitForRunningInstall();
            rethrowLastErrorIfPresent();
            if (avatarId == null || isInstalled(avatarId)) {
               LOGGER.info("Model became available after waiting: target={}, wait={}ms", installTarget(avatarId), System.currentTimeMillis() - waitStartedAt);
               return;
            }
         }

         long startedAt = System.currentTimeMillis();
         LOGGER.info("Starting blocking model installation: target={}, waited={}ms", installTarget(avatarId), waited ? startedAt - waitStartedAt : 0L);

         try {
            prepareCounters();
            installNow(avatarId);
            finished = true;
            lastError = null;
            LOGGER.info(
               "Blocking model installation completed: target={}, installed={}, replaced={}, skipped={}, duration={}ms",
               installTarget(avatarId),
               INSTALLED_FILES.get(),
               REPLACED_FILES.get(),
               SKIPPED_FILES.get(),
               System.currentTimeMillis() - startedAt
            );
         } catch (Throwable var10) {
            finished = false;
            lastError = var10;
            LOGGER.error("Blocking model installation failed: target={}, duration={}ms", installTarget(avatarId), System.currentTimeMillis() - startedAt, var10);
            throwAsException(var10);
         } finally {
            RUNNING.set(false);
         }
      }
   }

   private static Path codeSourcePath() {
      try {
         ProtectionDomain domain = دس.class.getProtectionDomain();
         CodeSource codeSource = domain == null ? null : domain.getCodeSource();
         URL location = codeSource == null ? null : codeSource.getLocation();
         if (location == null) {
            return null;
         }

         URI uri = location.toURI();
         return Path.of(uri).normalize();
      } catch (Throwable var4) {
         LOGGER.debug("Code source lookup failed", var4);
         return null;
      }
   }

   public static void installBlocking() throws Exception {
      installBlocking(null);
   }

   private static void moveDirectory(Path source, Path target) throws IOException {
      try {
         Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
      } catch (AtomicMoveNotSupportedException var3) {
         Files.move(source, target);
      }
   }

   public static int getCatalogRevision() {
      return صل.revision();
   }

   private static void collectAvatarIdsFromCodeSource(Set<String> ids) throws Exception {
      Path path = codeSourcePath();
      if (path != null) {
         if (Files.isDirectory(path)) {
            collectAvatarIdsFromDirectory(path.resolve("figura_avatars").normalize(), ids);
         } else {
            if (Files.isRegularFile(path)) {
               try (JarFile jar = new JarFile(path.toFile())) {
                  collectAvatarIdsFromJar(jar, "figura_avatars", ids);
               }
            }
         }
      }
   }

   private static void recreateDirectory(Path directory) throws IOException {
      if (Files.exists(directory)) {
         try (Stream<Path> paths = Files.walk(directory)) {
            for (Path path : paths.sorted(Comparator.reverseOrder()).toList()) {
               Files.deleteIfExists(path);
            }
         }
      }

      Files.createDirectories(directory);
   }

   private static void materializeCosmeticAvatar(Path avatarsDir, صخ cosmetic) throws IOException {
      String sourceCategory = COSMETIC_SOURCE_CATEGORIES.get(cosmetic.category());
      if (sourceCategory != null) {
         Path source = avatarsDir.resolve("cosmetics").resolve(sourceCategory).resolve(cosmetic.itemId()).normalize();
         Path output = avatarsDir.resolve(cosmeticAvatarId(cosmetic.category(), cosmetic.itemId())).normalize();
         if (source.startsWith(avatarsDir) && output.startsWith(avatarsDir)) {
            copyDirectory(source, output);
         }
      }
   }

   private static boolean copyResourceRoot(URL avatarId, Path root, String avatarsDir) throws Exception {
      String protocol = root.getProtocol();
      if ("file".equalsIgnoreCase(protocol)) {
         Path rootPath = Path.of(root.toURI()).normalize();
         return copyResourceDirectory(rootPath, avatarsDir, avatarId);
      }

      if (!"jar".equalsIgnoreCase(protocol)) {
         LOGGER.warn("Unsupported bundled Figura resource protocol: protocol={}, source={}", protocol, root);
         return false;
      }

      JarURLConnection connection = (JarURLConnection)root.openConnection();
      String entryName = connection.getEntryName();
      if (entryName == null || entryName.isEmpty()) {
         entryName = "figura_avatars";
      }

      try (JarFile jar = connection.getJarFile()) {
         return copyFromJar(jar, entryName, avatarsDir, avatarId) > 0;
      }
   }

   public static Path avatarsDirectory() {
      File gameDirectory = gameDirectory();
      return gameDirectory == null ? null : gameDirectory.toPath().resolve("figura").resolve("avatars").normalize();
   }

   private static void replaceDirectory(Path avatarsDir, Path source, Path target) throws IOException {
      Path backup = avatarsDir.resolve(".rain-figura-backup-" + UUID.randomUUID()).normalize();
      boolean hadTarget = Files.exists(target);
      if (hadTarget) {
         moveDirectory(target, backup);
      }

      try {
         moveDirectory(source, target);
         if (hadTarget) {
            REPLACED_FILES.incrementAndGet();
         }
      } catch (Throwable var14) {
         if (Files.exists(backup) && !Files.exists(target)) {
            moveDirectory(backup, target);
         }

         if (var14 instanceof IOException exception) {
            throw exception;
         }

         throw new IOException("Failed to replace Figura avatar directory", var14);
      } finally {
         try {
            deleteDirectory(backup);
         } catch (IOException var13) {
            LOGGER.warn("Failed to remove old Figura avatar backup: {}", backup);
         }
      }
   }

   private static void collectCosmeticIdsFromDevelopmentDirectories(String ids, Set<String> sourceCategory) throws IOException {
      String userDir = System.getProperty("user.dir");
      if (userDir != null && !userDir.isBlank()) {
         Path project = Path.of(userDir).normalize();
         collectCosmeticIdsFromDirectory(
            project.resolve("src").resolve("main").resolve("resources").resolve("figura_avatars").resolve("cosmetics").resolve(sourceCategory), ids
         );
         collectCosmeticIdsFromDirectory(
            project.resolve("build").resolve("resources").resolve("main").resolve("figura_avatars").resolve("cosmetics").resolve(sourceCategory), ids
         );
      }
   }

   private static void collectAvatarIds(URL ids, Set<String> root) throws Exception {
      String protocol = root.getProtocol();
      if ("file".equalsIgnoreCase(protocol)) {
         Path var10 = Path.of(root.toURI()).normalize();
         collectAvatarIdsFromDirectory(var10, ids);
      } else {
         if ("jar".equalsIgnoreCase(protocol)) {
            JarURLConnection connection = (JarURLConnection)root.openConnection();
            String entryName = connection.getEntryName();
            if (entryName == null || entryName.isEmpty()) {
               entryName = "figura_avatars";
            }

            try (JarFile jar = connection.getJarFile()) {
               collectAvatarIdsFromJar(jar, entryName, ids);
            }
         }
      }
   }

   public static boolean isFinished() {
      return finished;
   }

   private static String installTarget(String avatarId) {
      String normalized = normalizeAvatarId(avatarId);
      return normalized == null ? "all bundled models" : normalized;
   }

   private static String combinedCosmeticsAvatarId(List<صخ> cosmetics) {
      StringBuilder id = new StringBuilder("rain-cosmetics");

      for (صخ cosmetic : cosmetics) {
         id.append('-').append(cosmetic.category()).append('-').append(cosmetic.itemId());
      }

      return id.toString();
   }

   private static خُ readCosmeticMetadata(String cosmeticId, String category) {
      String sourceCategory = COSMETIC_SOURCE_CATEGORIES.get(category);
      String fallbackName = titleName(cosmeticId);
      if (sourceCategory == null) {
         return new خُ(fallbackName, "");
      }

      خُ metadata = readMetadata("figura_avatars/cosmetics/" + sourceCategory + "/" + cosmeticId + "/avatar.json", fallbackName);
      if (metadata.name().equals(fallbackName) && metadata.description().isBlank()) {
         Path avatarsDir = avatarsDirectory();
         if (avatarsDir == null) {
            return metadata;
         }

         Path avatarJson = avatarsDir.resolve("cosmetics").resolve(sourceCategory).resolve(cosmeticId).resolve("avatar.json").normalize();
         if (avatarJson.startsWith(avatarsDir) && Files.isRegularFile(avatarJson)) {
            try {
               JsonObject ignored = JsonParser.parseString(Files.readString(avatarJson, StandardCharsets.UTF_8)).getAsJsonObject();
               String name = ignored.has("name") ? ignored.get("name").getAsString() : fallbackName;
               String description = ignored.has("description") ? ignored.get("description").getAsString() : "";
               return new خُ(name, description);
            } catch (Throwable var10) {
               return metadata;
            }
         } else {
            return metadata;
         }
      } else {
         return metadata;
      }
   }

   private static صخ parseCosmeticAvatarId(String avatarId) {
      if (avatarId != null && avatarId.startsWith("cosmetic-")) {
         for (String category : COSMETIC_SOURCE_CATEGORIES.keySet()) {
            String prefix = "cosmetic-" + category + "-";
            if (avatarId.startsWith(prefix)) {
               String itemId = avatarId.substring(prefix.length());
               return isSafeAvatarId(itemId) ? new صخ(category, itemId) : null;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static InputStream openBundledResource(String resourcePath) throws IOException {
      InputStream classpathInput = دس.class.getClassLoader().getResourceAsStream(resourcePath);
      if (classpathInput != null) {
         return classpathInput;
      }

      Path root = findModResourceRoot();
      if (root == null) {
         return null;
      }

      String prefix = "figura_avatars/";
      if (!resourcePath.startsWith(prefix)) {
         return null;
      }

      Path resource = root.resolve(resourcePath.substring(prefix.length())).normalize();
      return resource.startsWith(root) && Files.isRegularFile(resource) ? Files.newInputStream(resource) : null;
   }

   private static void extractRemoteArchive(byte[] output, Path archive, long expectedUnpackedSize) throws IOException {
      long unpackedSize = 0L;
      int fileCount = 0;
      Set<String> extractedPaths = new HashSet();
      byte[] buffer = new byte[16384];
      ZipInputStream zip = new ZipInputStream(new ByteArrayInputStream(archive), StandardCharsets.UTF_8);

      ZipEntry entry;
      try {
         while ((entry = zip.getNextEntry()) != null) {
            String name = entry.getName();
            if (name != null && !name.isBlank() && !name.contains("\\")) {
               Path relative = Path.of(name).normalize();
               if (!relative.isAbsolute() && !startsWithParentTraversal(relative)) {
                  Path destination = output.resolve(relative).normalize();
                  if (!destination.startsWith(output)) {
                     throw new IOException("Remote Figura archive escapes its destination");
                  }

                  if (entry.isDirectory()) {
                     Files.createDirectories(destination);
                     zip.closeEntry();
                     continue;
                  }

                  if (!".rain-archive.sha256".equals(relative.toString()) && extractedPaths.add(relative.toString())) {
                     if (++fileCount > 512) {
                        throw new IOException("Remote Figura archive contains too many files");
                     }

                     Files.createDirectories(destination.getParent());

                     int read;
                     try (OutputStream outputStream = Files.newOutputStream(destination, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE)) {
                        while ((read = zip.read(buffer)) >= 0) {
                           if (read != 0) {
                              unpackedSize += read;
                              if (unpackedSize > expectedUnpackedSize) {
                                 throw new IOException("Remote Figura archive exceeds its declared size");
                              }

                              outputStream.write(buffer, 0, read);
                           }
                        }
                     }

                     zip.closeEntry();
                     INSTALLED_FILES.incrementAndGet();
                     continue;
                  }

                  throw new IOException("Remote Figura archive contains a duplicate path");
               }

               throw new IOException("Remote Figura archive escapes its destination");
            }

            throw new IOException("Remote Figura archive contains an invalid path");
         }
      } catch (Throwable var20) {
         try {
            zip.close();
         } catch (Throwable var17) {
            var20.addSuppressed(var17);
         }

         throw var20;
      }

      zip.close();
      if (fileCount == 0 || unpackedSize != expectedUnpackedSize) {
         throw new IOException("Remote Figura archive size does not match the catalog");
      }
   }

   private static List<String> findBundledCosmeticIds(String category) {
      String sourceCategory = COSMETIC_SOURCE_CATEGORIES.get(category);
      if (sourceCategory == null) {
         return Collections.emptyList();
      }

      Set<String> ids = new LinkedHashSet<>();

      try {
         Path modResourceRoot = findModResourceRoot();
         if (modResourceRoot != null) {
            collectCosmeticIdsFromDirectory(modResourceRoot.resolve("cosmetics").resolve(sourceCategory), ids);
         }

         if (ids.isEmpty()) {
            ClassLoader loader = دس.class.getClassLoader();
            Enumeration<URL> roots = loader.getResources("figura_avatars");

            while (roots.hasMoreElements()) {
               collectCosmeticIds((URL)roots.nextElement(), sourceCategory, ids);
            }
         }

         if (ids.isEmpty()) {
            collectCosmeticIdsFromCodeSource(sourceCategory, ids);
         }

         if (ids.isEmpty()) {
            collectCosmeticIdsFromDevelopmentDirectories(sourceCategory, ids);
         }
      } catch (Throwable var6) {
         LOGGER.warn("Failed to discover bundled Figura cosmetics: category={}", category, var6);
      }

      return new ArrayList<>(ids);
   }

   private static boolean startsWithParentTraversal(Path path) {
      return path.getNameCount() > 0 && "..".equals(path.getName(0).toString());
   }

   public static boolean isInstalled(String avatarId) {
      String normalizedAvatarId = normalizeAvatarId(avatarId);
      if (!isSafeAvatarId(normalizedAvatarId)) {
         return false;
      }

      Path avatarsDir = avatarsDirectory();
      if (avatarsDir == null) {
         return false;
      }

      Path avatarJson = avatarsDir.resolve(normalizedAvatarId).resolve("avatar.json").normalize();
      return avatarJson.startsWith(avatarsDir) && Files.isRegularFile(avatarJson);
   }

   public static List<FiguraAvatarInstaller$AvatarEntry> getBundledAvatars() {
      List<سد> remoteAvatars = صل.avatars();
      if (remoteAvatars.isEmpty()) {
         return Collections.emptyList();
      }

      List<FiguraAvatarInstaller$AvatarEntry> avatars = new ArrayList<>(remoteAvatars.size());

      for (سد avatar : remoteAvatars) {
         avatars.add(
            new FiguraAvatarInstaller$AvatarEntry(
               avatar.id(),
               avatar.name(),
               avatar.description(),
               avatar.previewPath(),
               isRemoteAvatarCurrent(avatar),
               avatar.previewSha256(),
               avatar.previewSize(),
               avatar.previewWidth(),
               avatar.previewHeight()
            )
         );
      }

      return avatars;
   }

   private static String cosmeticAvatarId(String category, String itemId) {
      return "cosmetic-" + category + "-" + itemId;
   }

   private static void collectCosmeticIds(URL ids, String sourceCategory, Set<String> root) throws Exception {
      if ("file".equalsIgnoreCase(root.getProtocol())) {
         collectCosmeticIdsFromDirectory(Path.of(root.toURI()).resolve("cosmetics").resolve(sourceCategory), ids);
      } else {
         if ("jar".equalsIgnoreCase(root.getProtocol())) {
            JarURLConnection connection = (JarURLConnection)root.openConnection();
            String entryName = connection.getEntryName();

            try (JarFile jar = connection.getJarFile()) {
               collectCosmeticIdsFromJar(jar, entryName != null && !entryName.isEmpty() ? entryName : "figura_avatars", sourceCategory, ids);
            }
         }
      }
   }

   public static Throwable getLastError() {
      return lastError;
   }

   public static Throwable getCatalogError() {
      return صل.lastError();
   }

   public static void installAsync() {
      installAsync(null);
   }

   private static void installNow(String avatarId) throws Exception {
      String normalizedAvatarId = normalizeAvatarId(avatarId);
      صخ cosmetic = parseCosmeticAvatarId(normalizedAvatarId);
      if (normalizedAvatarId == null) {
         صل.refreshBlocking();
      } else if (cosmetic == null) {
         Path var9 = avatarsDirectory();
         if (var9 == null) {
            throw new IOException("Figura avatars directory is unavailable");
         }

         Files.createDirectories(var9);
         سد var10 = صل.requireAvatar(normalizedAvatarId);
         installRemoteAvatar(var9, var10);
      } else {
         Path avatarsDir = avatarsDirectory();
         if (avatarsDir == null) {
            LOGGER.warn("Figura avatars directory is unavailable: target={}", installTarget(avatarId));
         } else {
            LOGGER.info("Figura model installation directory: target={}, path={}", installTarget(avatarId), avatarsDir);
            Files.createDirectories(avatarsDir);
            boolean found = false;
            Path modResourceRoot = findModResourceRoot();
            if (modResourceRoot != null) {
               LOGGER.info("Installing model resources from Fabric mod root: target={}, source={}", installTarget(avatarId), modResourceRoot);
               found = copyResourceDirectory(modResourceRoot, avatarsDir, cosmetic == null ? normalizedAvatarId : null);
            }

            if (!found) {
               ClassLoader loader = دس.class.getClassLoader();
               Enumeration<URL> roots = loader.getResources("figura_avatars");

               while (roots.hasMoreElements()) {
                  URL root = (URL)roots.nextElement();
                  LOGGER.debug(
                     "Installing model resources from classpath root: target={}, protocol={}, source={}", installTarget(avatarId), root.getProtocol(), root
                  );
                  found |= copyResourceRoot(root, avatarsDir, cosmetic == null ? normalizedAvatarId : null);
               }
            }

            if (!found) {
               LOGGER.debug("Classpath model root was not found, using code source: target={}", installTarget(avatarId));
               found = copyFromCodeSourceJar(avatarsDir, cosmetic == null ? normalizedAvatarId : null);
            }

            if (!found) {
               throw new IOException("Bundled Figura model resources were not found");
            }

            if (cosmetic != null) {
               materializeCosmeticAvatar(avatarsDir, cosmetic);
            }
         }
      }
   }

   private static void copyDirectory(Path outputRoot, Path root) throws IOException {
      if (Files.isDirectory(root)) {
         Path normalizedRoot = root.normalize();
         Path normalizedOutputRoot = outputRoot.normalize();

         try (Stream<Path> stream = Files.walk(normalizedRoot)) {
            for (Path file : stream.filter(x$0 -> Files.isRegularFile(x$0)).toList()) {
               Path normalizedFile = file.normalize();
               Path relativePath = normalizedRoot.relativize(normalizedFile).normalize();
               if (relativePath.isAbsolute() || startsWithParentTraversal(relativePath)) {
                  throw new IOException("Invalid bundled model path: " + relativePath);
               }

               Path output = resolveAcrossProviders(normalizedOutputRoot, relativePath);
               copyFile(normalizedFile, output, normalizedOutputRoot);
            }
         }
      }
   }

   private static boolean copyResourceDirectory(Path avatarsDir, Path root, String avatarId) throws IOException {
      Path source = avatarId == null ? root : root.resolve(avatarId).normalize();
      if (!containsRegularFile(source)) {
         return false;
      }

      Path output = avatarId == null ? avatarsDir : avatarsDir.resolve(avatarId).normalize();
      copyDirectory(source, output);
      return true;
   }

   public static List<FiguraAvatarInstaller$AvatarEntry> getBundledCosmetics(String category) {
      String cosmeticCategory = normalizeCosmeticCategory(category);
      if (cosmeticCategory == null) {
         return Collections.emptyList();
      }

      List<String> ids = findBundledCosmeticIds(cosmeticCategory);
      ids.addAll(findInstalledCosmeticIds(cosmeticCategory));
      ids = new ArrayList<>(new LinkedHashSet<>(ids));
      if (ids.isEmpty()) {
         return Collections.emptyList();
      }

      List<FiguraAvatarInstaller$AvatarEntry> cosmetics = new ArrayList(ids.size());

      for (String id : ids) {
         خُ metadata = readCosmeticMetadata(cosmeticCategory, id);
         cosmetics.add(
            new FiguraAvatarInstaller$AvatarEntry(
               cosmeticAvatarId(cosmeticCategory, id),
               metadata.name(),
               metadata.description(),
               "textures/cosmetics/" + cosmeticCategory + "/" + id + "/avatar.png",
               isInstalled(cosmeticAvatarId(cosmeticCategory, id)),
               null,
               0L,
               0,
               0
            )
         );
      }

      return cosmetics;
   }

   private static void collectAvatarIdsFromJar(JarFile rootEntry, String ids, Set<String> jar) {
      String prefix = rootEntry.endsWith("/") ? rootEntry : rootEntry + "/";
      Enumeration<JarEntry> entries = jar.entries();

      while (entries.hasMoreElements()) {
         JarEntry entry = entries.nextElement();
         if (entry != null && !entry.isDirectory()) {
            String name = entry.getName();
            if (name.startsWith(prefix) && name.endsWith("/avatar.json")) {
               String relativeName = name.substring(prefix.length());
               int slash = relativeName.indexOf(47);
               if (slash > 0) {
                  String avatarId = relativeName.substring(0, slash);
                  if (isSafeAvatarId(avatarId)) {
                     ids.add(avatarId);
                  }
               }
            }
         }
      }
   }

   private static void copyFile(Path output, Path outputRoot, Path input) throws IOException {
      Path normalizedOutput = output.normalize();
      Path normalizedOutputRoot = outputRoot.normalize();
      if (normalizedOutput.startsWith(normalizedOutputRoot)) {
         Files.createDirectories(normalizedOutput.getParent());
         long sourceSize = Files.size(input);
         if (Files.exists(normalizedOutput) && Files.size(normalizedOutput) == sourceSize) {
            SKIPPED_FILES.incrementAndGet();
            LOGGER.debug("Model file unchanged: {}", normalizedOutput);
         } else {
            if (Files.exists(normalizedOutput)) {
               REPLACED_FILES.incrementAndGet();
               LOGGER.debug("Replacing model file: {}", normalizedOutput);
            } else {
               INSTALLED_FILES.incrementAndGet();
               LOGGER.debug("Installing model file: {}", normalizedOutput);
            }

            Files.copy(input, normalizedOutput, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
         }
      }
   }

   private static void deleteDirectory(Path directory) throws IOException {
      if (Files.exists(directory)) {
         try (Stream<Path> paths = Files.walk(directory)) {
            for (Path path : paths.sorted(Comparator.reverseOrder()).toList()) {
               Files.deleteIfExists(path);
            }
         }
      }
   }

   private static List<String> findInstalledCosmeticIds(String category) {
      String sourceCategory = COSMETIC_SOURCE_CATEGORIES.get(category);
      Path avatarsDir = avatarsDirectory();
      if (sourceCategory != null && avatarsDir != null) {
         Set<String> ids = new LinkedHashSet();

         try {
            collectCosmeticIdsFromDirectory(avatarsDir.resolve("cosmetics").resolve(sourceCategory), ids);
         } catch (Throwable var5) {
         }

         return new ArrayList<>(ids);
      } else {
         return Collections.emptyList();
      }
   }

   private static boolean isSafeAvatarId(String avatarId) {
      return avatarId != null && !avatarId.isBlank() && !avatarId.contains("/") && !avatarId.contains("\\") && !".".equals(avatarId) && !"..".equals(avatarId);
   }

   private static خُ readMetadata(String avatarId) {
      String fallbackName = titleName(avatarId);
      String resourcePath = "figura_avatars/" + avatarId + "/avatar.json";
      return readMetadata(resourcePath, fallbackName);
   }
}
