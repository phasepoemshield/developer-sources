import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Compiles the Figura bridge class and patches PathHolder for immediate cosmetic apply.
 */
public class ApplyCosmeticsPatches {
   public static void main(String[] args) throws Exception {
      Path root = Path.of("").toAbsolutePath();
      Path classes = root.resolve("build/classes/java/main");
      Path patchSrc = root.resolve("patches/cosmetics");
      Path out = patchSrc.resolve("out");
      Path figura = root.resolve("libs/figura-0.1.6+1.21.4-fabric-mc.jar");
      Path mods = root.resolve("run/mods");

      Files.createDirectories(out);
      Files.createDirectories(mods);

      if (Files.exists(figura)) {
         Files.copy(figura, mods.resolve(figura.getFileName()), StandardCopyOption.REPLACE_EXISTING);
         System.out.println("Installed Figura into run/mods");
      }

      Path bundled = mods.resolve("ZenithClient-1.0.0.jar");
      if (Files.exists(bundled)) {
         Path disabled = mods.resolve("_disabled");
         Files.createDirectories(disabled);
         Files.move(bundled, disabled.resolve(bundled.getFileName()), StandardCopyOption.REPLACE_EXISTING);
         System.out.println("Moved bundled ZenithClient jar out of run/mods to avoid duplicate mod id");
      }

      String javaHome = System.getProperty("java.home");
      Path javac = Path.of(javaHome, "bin", "javac");
      Path java = Path.of(javaHome, "bin", "java");

      List<Path> cp = new ArrayList<>();
      cp.add(classes);
      try (Stream<Path> s = Files.walk(root.resolve(".gradle/loom-cache/minecraftMaven"))) {
         s.filter(p -> p.toString().endsWith(".jar")).filter(p -> p.toString().contains("1.21.4")).forEach(cp::add);
      }
      try (Stream<Path> s = Files.walk(root.resolve(".gradle/loom-cache/remapped_mods"))) {
         s.filter(p -> p.toString().endsWith(".jar")).filter(p -> !p.toString().contains("sources")).forEach(cp::add);
      }
      Path home = Path.of(System.getProperty("user.home"));
      try (Stream<Path> s = Files.walk(home.resolve(".gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader"))) {
         s.filter(p -> p.getFileName().toString().equals("fabric-loader-0.16.14.jar")).forEach(cp::add);
      }
      // Minecraft compile deps (brigadier, authlib, etc.)
      Path remapCp = root.resolve(".gradle/loom-cache/remapClasspath.txt");
      if (Files.exists(remapCp)) {
         for (String entry : Files.readString(remapCp).split(System.getProperty("path.separator"))) {
            if (!entry.isBlank()) {
               cp.add(Path.of(entry));
            }
         }
      }

      String classpath = cp.stream().map(Path::toString).collect(Collectors.joining(System.getProperty("path.separator")));
      run(javac.toString(), "--release", "21", "-cp", classpath, "-d", out.toString(),
         patchSrc.resolve("zenith/l1ll111IIIl.java").toString());

      Files.copy(out.resolve("zenith/l1ll111IIIl.class"), classes.resolve("zenith/l1ll111IIIl.class"), StandardCopyOption.REPLACE_EXISTING);
      Files.copy(out.resolve("zenith/l1ll111IIIl$TrackingMap.class"), classes.resolve("zenith/l1ll111IIIl$TrackingMap.class"), StandardCopyOption.REPLACE_EXISTING);
      System.out.println("Installed l1ll111IIIl (Figura bridge)");

      List<Path> asm = new ArrayList<>();
      try (Stream<Path> s = Files.walk(home.resolve(".gradle/caches/modules-2/files-2.1/org.ow2.asm"))) {
         s.filter(p -> {
            String n = p.getFileName().toString();
            return n.matches("asm-9\\.\\d+(\\.\\d+)?\\.jar")
               || n.matches("asm-tree-9\\.\\d+(\\.\\d+)?\\.jar")
               || n.matches("asm-commons-9\\.\\d+(\\.\\d+)?\\.jar");
         }).sorted(Comparator.comparing(Path::toString)).forEach(asm::add);
      }
      String asmCp = asm.stream().map(Path::toString).collect(Collectors.joining(System.getProperty("path.separator")));
      run(javac.toString(), "--release", "21", "-cp", asmCp, "-d", out.toString(),
         patchSrc.resolve("PatchCosmetics.java").toString());
      run(java.toString(), "-cp", out + System.getProperty("path.separator") + asmCp, "PatchCosmetics");
      System.out.println("Cosmetics patches applied");

      // Restore main menu / button wiring
      Path restoreSrc = root.resolve("patches/restore");
      Path restoreOut = restoreSrc.resolve("out");
      Files.createDirectories(restoreOut);
      Path menuOut = classes.resolve("zenith/zov/client/screens/override/main");
      Files.createDirectories(menuOut);

      // Prefer global named minecraft jar if loom-cache local is sparse
      try (Stream<Path> s = Files.walk(home.resolve(".gradle/caches/fabric-loom/minecraftMaven"))) {
         s.filter(p -> p.toString().endsWith(".jar"))
            .filter(p -> p.toString().contains("1.21.4"))
            .filter(p -> p.toString().contains("minecraft-merged") && !p.toString().contains("intermediary"))
            .forEach(cp::add);
      }

      String restoreCp = cp.stream().map(Path::toString).collect(Collectors.joining(System.getProperty("path.separator")));
      run(javac.toString(), "--release", "21", "-cp", restoreCp, "-d", restoreOut.toString(),
         restoreSrc.resolve("AltManagerScreen.java").toString(),
         restoreSrc.resolve("ModsListScreen.java").toString());
      Files.copy(restoreOut.resolve("zenith/zov/client/screens/override/main/AltManagerScreen.class"),
         menuOut.resolve("AltManagerScreen.class"), StandardCopyOption.REPLACE_EXISTING);
      Files.copy(restoreOut.resolve("zenith/zov/client/screens/override/main/ModsListScreen.class"),
         menuOut.resolve("ModsListScreen.class"), StandardCopyOption.REPLACE_EXISTING);
      System.out.println("Installed AltManagerScreen + ModsListScreen");

      run(javac.toString(), "--release", "21", "-cp", asmCp, "-d", restoreOut.toString(),
         restoreSrc.resolve("PatchMainMenu.java").toString());
      run(java.toString(), "-cp", restoreOut + System.getProperty("path.separator") + asmCp, "PatchMainMenu");
      System.out.println("Main menu restore applied");
   }

   private static void run(String... cmd) throws Exception {
      ProcessBuilder pb = new ProcessBuilder(cmd);
      pb.redirectErrorStream(true);
      Process p = pb.start();
      try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), StandardCharsets.UTF_8))) {
         String line;
         while ((line = br.readLine()) != null) {
            System.out.println(line);
         }
      }
      int code = p.waitFor();
      if (code != 0) {
         throw new IllegalStateException("Command failed (" + code + "): " + String.join(" ", cmd));
      }
   }
}
