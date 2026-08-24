package org.zenith.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Stream;
import org.zenith.ZenithClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Makes the bundled Figura catalog available to the existing local-avatar loader. */
public final class CosmeticCatalogBootstrap {
   private static final Logger LOGGER = LoggerFactory.getLogger(CosmeticCatalogBootstrap.class);
   private static final String RESOURCE_ROOT = "assets/zenith/cosmetics/catalog";
   private static boolean prepared;

   private CosmeticCatalogBootstrap() {
   }

   public static synchronized void ensure() {
      if (prepared) {
         return;
      }

      Path target = ZenithClient.ColorAnimator.toPath().resolve("cosmetics").toAbsolutePath().normalize();
      try {
         Files.createDirectories(target);
         URL resource = CosmeticCatalogBootstrap.class.getClassLoader().getResource(RESOURCE_ROOT);
         if (resource == null) {
            resource = CosmeticCatalogBootstrap.class.getClassLoader().getResource(RESOURCE_ROOT + "/");
         }
         if (resource == null) {
            throw new IOException("Missing bundled cosmetic catalog: " + RESOURCE_ROOT);
         }

         if ("file".equals(resource.getProtocol())) {
            copyDirectory(Path.of(URI.create(resource.toString())), target);
         } else if ("jar".equals(resource.getProtocol())
            && resource.openConnection() instanceof JarURLConnection connection) {
            copyJar(connection, target);
         } else {
            throw new IOException("Unsupported cosmetic catalog resource protocol: " + resource.getProtocol());
         }

         long avatars;
         try (Stream<Path> files = Files.walk(target)) {
            avatars = files.filter(Files::isRegularFile)
               .filter(path -> path.getFileName().toString().equalsIgnoreCase("avatar.json"))
               .count();
         }
         LOGGER.info("Prepared {} bundled cosmetics in {}", avatars, target);
         prepared = true;
      } catch (Exception exception) {
         LOGGER.warn("Bundled cosmetics could not be prepared", exception);
      }
   }

   private static void copyDirectory(Path source, Path target) {
      try (Stream<Path> files = Files.walk(source)) {
         files.forEach(path -> {
            try {
               Path relative = source.relativize(path);
               copyPath(path, target.resolve(relative));
            } catch (IOException exception) {
               throw new UncheckedIOException(exception);
            }
         });
      } catch (UncheckedIOException exception) {
         throw exception;
      } catch (IOException exception) {
         throw new UncheckedIOException(exception);
      }
   }

   private static void copyJar(JarURLConnection connection, Path target) throws IOException {
      String prefix = RESOURCE_ROOT + "/";
      try (JarFile jar = connection.getJarFile()) {
         Enumeration<JarEntry> entries = jar.entries();
         while (entries.hasMoreElements()) {
            JarEntry entry = entries.nextElement();
            if (entry.isDirectory() || !entry.getName().startsWith(prefix)) {
               continue;
            }

            Path relative = Path.of(entry.getName().substring(prefix.length()));
            Path destination = target.resolve(relative).normalize();
            if (!destination.startsWith(target)) {
               throw new IOException("Invalid bundled cosmetic path: " + entry.getName());
            }
            Files.createDirectories(destination.getParent());
            try (InputStream input = jar.getInputStream(entry)) {
               copyIfMissing(input, destination);
            }
         }
      }
   }

   private static void copyPath(Path source, Path destination) throws IOException {
      if (Files.isDirectory(source)) {
         Files.createDirectories(destination);
         return;
      }

      Files.createDirectories(destination.getParent());
      try {
         Files.copy(source, destination);
      } catch (FileAlreadyExistsException ignored) {
         // Keep user-imported or previously extracted cosmetics intact.
      }
   }

   private static void copyIfMissing(InputStream input, Path destination) throws IOException {
      try {
         Files.copy(input, destination);
      } catch (FileAlreadyExistsException ignored) {
         // Keep user-imported or previously extracted cosmetics intact.
      }
   }
}
