package moscow.rockstar.util.game;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Stream;

public final class LegacyLauncherPaths {
   private LegacyLauncherPaths() {
   }

   public static Optional<Path> findGameDirectory() {
      for (Path root : candidateRoots()) {
         Optional<Path> fromProps = findInTree(root);
         if (fromProps.isPresent()) {
            return fromProps;
         }
      }
      return Optional.empty();
   }

   private static List<Path> candidateRoots() {
      List<Path> roots = new ArrayList<>();
      addEnv(roots, "APPDATA");
      addEnv(roots, "LOCALAPPDATA");
      addEnv(roots, "XDG_DATA_HOME");
      addEnv(roots, "XDG_CONFIG_HOME");
      String userHome = System.getProperty("user.home");
      if (userHome != null && !userHome.isBlank()) {
         roots.add(Paths.get(userHome));
      }
      return roots;
   }

   private static void addEnv(List<Path> roots, String env) {
      String value = System.getenv(env);
      if (value != null && !value.isBlank()) {
         roots.add(Paths.get(value));
      }
   }

   private static Optional<Path> findInTree(Path root) {
      if (root == null || !Files.isDirectory(root)) {
         return Optional.empty();
      }
      try (Stream<Path> walk = Files.walk(root, 6)) {
         return walk.filter(path -> path.getFileName() != null && path.getFileName().toString().equalsIgnoreCase("legacy.properties"))
            .map(LegacyLauncherPaths::readGameDir)
            .flatMap(Optional::stream)
            .findFirst();
      } catch (Exception ignored) {
         return Optional.empty();
      }
   }

   private static Optional<Path> readGameDir(Path propertiesFile) {
      Properties properties = new Properties();
      try (InputStream in = Files.newInputStream(propertiesFile)) {
         properties.load(in);
      } catch (Exception ignored) {
         return Optional.empty();
      }

      String gameDir = properties.getProperty("minecraft.gamedir");
      if (gameDir == null || gameDir.isBlank()) {
         return Optional.empty();
      }

      Path resolved = Paths.get(gameDir.trim());
      if (!resolved.isAbsolute()) {
         Path parent = propertiesFile.toAbsolutePath().getParent();
         resolved = parent == null ? resolved : parent.resolve(resolved);
      }
      return Optional.of(resolved.toAbsolutePath().normalize());
   }
}
