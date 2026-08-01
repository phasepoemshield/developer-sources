package l;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Stream;
import net.minecraft.client.MinecraftClient;

public final class Helper256 {
   private static final String RESOURCE_ROOT = "assets/Releon/figura_avatars/";
   public static final Helper255 EMPTY = new Helper255("empty", "Releon Empty");
   public static final Helper255 NINJAGO = new Helper255("the_actuall_ninjago_maste", "the actuall ninjago maste");
   public static final Helper255 ARIA = new Helper255("Aria", "Aria");
   public static final Helper255 LOLIPOP = new Helper255("Lolipop", "Lolipop");
   public static final Helper255 TSUMIKI_MINIWA = new Helper255("tsumiki_miniwa", "Tsumiki Miniwa");
   public static final Helper255 Vin = new Helper255("vin", "Vin");
   public static final Helper255 SENFORD = new Helper255("senford", "Senford");
   public static final Helper255 STRIKE = new Helper255("Strike", "Strike");
   public static final Helper255 SIMPLE = new Helper255("simplewings", "Simple");
   public static final Helper255 ALY = new Helper255("Aly/aylDWT", "Aly");
   public static final Helper255 HARPY = new Helper255("Harpy", "Harpy");
   public static final Helper255 DEVILSKNIFE = new Helper255("Devilsknife", "Devilsknife");
   public static final Helper255 ZWEISWORD = new Helper255("zweisword", "Zweisword");
   public static final Helper255 FireShlasher = new Helper255("FireSlasher", "FireSlasher");
   public static final Helper255 RANA = new Helper255("rana", "Rana");
   public static final Helper255 MIKU = new Helper255("miku", "Miku");
   public static final Helper255 BAT = new Helper255("bat", "Bat");
   public static final Helper255 PETER_GRIFFIN = new Helper255("peter_griffin", "Peter Griffin");
   public static final Helper255 BEARDIE = new Helper255("beardie", "Beardie");
   public static final Helper255 OLDHAT = new Helper255("wazzat", "Wazzat");
   public static final Helper255 HAT = new Helper255("Hat", "Hat");
   public static final Helper255 SANTA = new Helper255("Santa", "santa");

   private Helper256() {
   }

   public static Path method2626(Helper255 var0) throws java.io.IOException {
      MinecraftClient var1 = MinecraftClient.getInstance();
      Path var2 = var1 != null ? var1.runDirectory.toPath() : Path.of(".");
      Path var3 = var2.resolve("figura").resolve("avatars").resolve(var0.method2625());
      method2630("assets/Releon/figura_avatars/" + var0.method2624() + "/", var3);
      method2641(var3);
      Helper211.method1807("Installed Figura avatar: " + var0.method2625());
      return var3;
   }

   public static void method2627(Helper255 var0) throws java.io.IOException {
      Path var1 = method2626(var0);
      method2629(var1);
   }

   public static void method2628(Helper255 var0, List<Helper255> var1) throws java.io.IOException {
      MinecraftClient var2 = MinecraftClient.getInstance();
      Path var3 = var2 != null ? var2.runDirectory.toPath() : Path.of(".");
      Path var4 = var3.resolve("figura").resolve("avatars").resolve("Releon Cosmetic");
      method2646(var4);
      method2630("assets/Releon/figura_avatars/" + var0.method2624() + "/", var4);
      method2641(var4);
      StringBuilder var5 = new StringBuilder();
      var5.append("\n\n-- Releon Figura cosmetics\n");

      for (Helper255 var7 : var1) {
         method2631("assets/Releon/figura_avatars/" + var7.method2624() + "/", var4, var7, var5);
      }

      if (var5.length() > "\n\n-- Releon Figura cosmetics\n".length()) {
         Files.writeString(
            var4.resolve("script.lua"),
            var5.toString(),
            StandardCharsets.UTF_8,
            Files.exists(var4.resolve("script.lua")) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE
         );
      }

      Helper211.method1807("Installed composite Figura avatar: " + var4.getFileName());
      method2629(var4);
   }

   private static void method2629(Path var0) throws java.io.IOException {
      try {
         Class var1 = Class.forName("org.figuramc.figura.avatar.local.LocalAvatarFetcher");
         var1.getMethod("loadAvatars").invoke(null);
         Class var2 = Class.forName("org.figuramc.figura.avatar.AvatarManager");
         var2.getMethod("loadLocalAvatar", Path.class).invoke(null, var0);
         Helper211.method1807("Loaded Figura avatar: " + var0.getFileName());
      } catch (ClassNotFoundException var3) {
         Helper211.method1810("Figura is not loaded, avatar was only installed");
      } catch (ReflectiveOperationException var4) {
         Helper211.method1811("Failed to load Figura avatar automatically", var4);
      }
   }

   private static void method2630(String var0, Path var1) throws java.io.IOException {
      ClassLoader var2 = Helper256.class.getClassLoader();
      URL var3 = var2.getResource(var0);
      if (var3 == null) {
         URL var4 = var2.getResource(var0 + "avatar.json");
         if (var4 == null) {
            throw new IOException("Missing bundled Figura avatar resource: " + var0);
         }

         if ("jar".equals(var4.getProtocol())) {
            Files.createDirectories(var1);
            method2648(var4, var0, var1);
            return;
         }

         if (!"file".equals(var4.getProtocol())) {
            throw new IOException("Unsupported Figura avatar resource protocol: " + var4.getProtocol());
         }

         var3 = new URL(var4, ".");
      }

      Files.createDirectories(var1);
      if ("file".equals(var3.getProtocol())) {
         method2647(var3, var1);
      } else if ("jar".equals(var3.getProtocol())) {
         method2648(var3, var0, var1);
      } else {
         throw new IOException("Unsupported Figura avatar resource protocol: " + var3.getProtocol());
      }
   }

   private static void method2631(String var0, Path var1, Helper255 var2, StringBuilder var3) throws java.io.IOException {
      ClassLoader var4 = Helper256.class.getClassLoader();
      URL var5 = var4.getResource(var0);
      if (var5 == null) {
         URL var6 = var4.getResource(var0 + "avatar.json");
         if (var6 == null) {
            throw new IOException("Missing bundled Figura overlay resource: " + var0);
         }

         if ("jar".equals(var6.getProtocol())) {
            method2633(var6, var0, var1, var2, var3);
            return;
         }

         if (!"file".equals(var6.getProtocol())) {
            throw new IOException("Unsupported Figura overlay resource protocol: " + var6.getProtocol());
         }

         var5 = new URL(var6, ".");
      }

      if ("file".equals(var5.getProtocol())) {
         method2632(var5, var1, var2, var3);
      } else if ("jar".equals(var5.getProtocol())) {
         method2633(var5, var0, var1, var2, var3);
      } else {
         throw new IOException("Unsupported Figura overlay resource protocol: " + var5.getProtocol());
      }
   }

   private static void method2632(URL var0, Path var1, Helper255 var2, StringBuilder var3) throws java.io.IOException {
      try {
         Path var4 = Path.of(var0.toURI());
         Map<String, String> var5 = method2634(var4, var2);

         try (Stream<java.nio.file.Path> var6 = Files.walk(var4)) {
            for (Path var8 : var6.toList()) {
               if (!Files.isDirectory(var8)) {
                  Path var9 = var4.relativize(var8);
                  String var10 = var8.getFileName().toString();
                  if (!method2642(var10) && (!var10.endsWith(".lua") || method2643(var10, var2))) {
                     if (method2643(var10, var2)) {
                        method2637(Files.readString(var8, StandardCharsets.UTF_8), var5, var3);
                     } else {
                        Path var11 = var1.resolve(method2636(var9, var5));
                        if (!Files.exists(var11) || var10.endsWith(".bbmodel")) {
                           Files.createDirectories(var11.getParent());
                           if (var10.endsWith(".bbmodel")) {
                              Files.writeString(var11, method2638(Files.readString(var8, StandardCharsets.UTF_8), var2), StandardCharsets.UTF_8);
                           } else {
                              Files.copy(var8, var11, StandardCopyOption.REPLACE_EXISTING);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (URISyntaxException var14) {
         throw new IOException("Invalid Figura overlay resource path", var14);
      }
   }

   private static void method2633(URL var0, String var1, Path var2, Helper255 var3, StringBuilder var4) throws java.io.IOException {
      JarURLConnection var5 = (JarURLConnection)var0.openConnection();

      try (JarFile var6 = var5.getJarFile()) {
         Map<String, String> var7 = method2635(var6, var1, var3);
         Enumeration var8 = var6.entries();

         while (var8.hasMoreElements()) {
            JarEntry var9 = (JarEntry)var8.nextElement();
            String var10 = var9.getName();
            if (var10.startsWith(var1) && !var9.isDirectory()) {
               String var11 = var10.substring(var1.length());
               Path var12 = Path.of(var11);
               String var13 = var12.getFileName().toString();
               if (!method2642(var13)) {
                  try (InputStream var14 = var6.getInputStream(var9)) {
                     if (!var13.endsWith(".lua") || method2643(var13, var3)) {
                        if (method2643(var13, var3)) {
                           method2637(new String(var14.readAllBytes(), StandardCharsets.UTF_8), var7, var4);
                        } else {
                           Path var15 = var2.resolve(method2636(var12, var7));
                           if (!Files.exists(var15) || var13.endsWith(".bbmodel")) {
                              Files.createDirectories(var15.getParent());
                              if (var13.endsWith(".bbmodel")) {
                                 Files.writeString(var15, method2638(new String(var14.readAllBytes(), StandardCharsets.UTF_8), var3), StandardCharsets.UTF_8);
                              } else {
                                 Files.copy(var14, var15, StandardCopyOption.REPLACE_EXISTING);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static Map<String, String> method2634(Path var0, Helper255 var1) throws java.io.IOException {
      HashMap<String, String> var2 = new HashMap<>();

      try (Stream<java.nio.file.Path> var3 = Files.walk(var0)) {
         for (Path var5 : var3.toList()) {
            if (Files.isRegularFile(var5) && var5.getFileName().toString().endsWith(".bbmodel")) {
               String var6 = method2644(var5.getFileName().toString());
               var2.put(var6, "releon_" + method2645(var1.method2625()) + "_" + method2645(var6));
            }
         }
      }

      return var2;
   }

   private static Map<String, String> method2635(JarFile var0, String var1, Helper255 var2) throws java.io.IOException {
      HashMap<String, String> var3 = new HashMap<>();
      Enumeration<JarEntry> var4 = var0.entries();

      while (var4.hasMoreElements()) {
         JarEntry var5 = (JarEntry)var4.nextElement();
         String var6 = var5.getName();
         if (!var5.isDirectory() && var6.startsWith(var1) && var6.endsWith(".bbmodel")) {
            var3.put(
               method2644(Path.of(var6).getFileName().toString()),
               "releon_" + method2645(var2.method2625()) + "_" + method2645(method2644(Path.of(var6).getFileName().toString()))
            );
         }
      }

      return var3;
   }

   private static Path method2636(Path var0, Map<String, String> var1) {
      String var2 = var0.getFileName().toString();
      if (!var2.endsWith(".bbmodel")) {
         return var0;
      } else {
         String var3 = method2644(var2);
         String var4 = var1.getOrDefault(var3, var3) + ".bbmodel";
         Path var5 = var0.getParent();
         return var5 == null ? Path.of(var4) : var5.resolve(var4);
      }
   }

   private static void method2637(String var0, Map<String, String> var1, StringBuilder var2) {
      String var3 = var0.replaceAll("(?m)^\\s*vanilla_model\\.(PLAYER|ARMOR|HELMET_ITEM|CAPE):setVisible\\([^\\n]*\\)\\s*$", "");

      for (Entry var5 : var1.entrySet()) {
         var3 = var3.replace("models." + (String)var5.getKey(), "models." + (String)var5.getValue())
            .replace("animations." + (String)var5.getKey(), "animations." + (String)var5.getValue());
      }

      var2.append("\n-- overlay\n");
      var2.append(var3);
      var2.append('\n');
   }

   private static String method2638(String var0, Helper255 var1) throws java.io.IOException {
      String var2 = var1.method2625().toLowerCase();
      if (!method2640(var2)) {
         return var0;
      } else {
         JsonObject var3 = JsonParser.parseString(var0).getAsJsonObject();
         JsonArray var4 = var3.getAsJsonArray("outliner");
         if (var4 == null) {
            return var0;
         } else {
            JsonArray var5 = new JsonArray();

            for (JsonElement var7 : var4) {
               JsonElement var8 = method2639(var7);
               if (var8 != null) {
                  var5.add(var8);
               }
            }

            var3.add("outliner", var5);
            var3.remove("animations");
            var3.remove("animators");
            var3.remove("animation_controllers");
            var3.remove("timeline_setups");
            return var3.toString();
         }
      }
   }

   private static JsonElement method2639(JsonElement var0) {
      if (var0 == null || var0.isJsonNull()) {
         return null;
      } else if (var0.isJsonPrimitive()) {
         return null;
      } else {
         JsonObject var1 = var0.getAsJsonObject();
         JsonArray var2 = var1.getAsJsonArray("children");
         JsonArray var3 = new JsonArray();
         if (var2 != null) {
            for (JsonElement var5 : var2) {
               JsonElement var6 = method2639(var5);
               if (var6 != null) {
                  var3.add(var6);
               }
            }
         }

         String var7 = var1.has("name") && !var1.get("name").isJsonNull() ? var1.get("name").getAsString().toLowerCase() : "";
         boolean var8 = var7.contains("wing") || var7.contains("elytra") || var7.contains("membrane") || var7.contains("tail") || var7.contains("cover");
         if (!var8 && var3.size() == 0) {
            return null;
         } else {
            JsonObject var9 = var1.deepCopy();
            var9.add("children", var3);
            return var9;
         }
      }
   }

   private static boolean method2640(String var0) {
      return var0.contains("simple") || var0.contains("aly") || var0.contains("harpy");
   }

   private static void method2641(Path var0) throws java.io.IOException {
      Path var1 = var0.resolve("script.lua");
      Path var2 = var0.resolve("MainScript.lua");
      if (!Files.exists(var1) && Files.exists(var2)) {
         Files.copy(var2, var1, StandardCopyOption.REPLACE_EXISTING);
      }
   }

   private static boolean method2642(String var0) {
      return "avatar.json".equals(var0) || "avatar.png".equals(var0) || "README.txt".equals(var0);
   }

   private static boolean method2643(String var0, Helper255 var1) {
      return "script.lua".equals(var0) && (var1.method2625().equals("Devilsknife") || var1.method2625().equals("Zweisword"));
   }

   private static String method2644(String var0) {
      int var1 = var0.lastIndexOf(46);
      return var1 == -1 ? var0 : var0.substring(0, var1);
   }

   private static String method2645(String var0) {
      return var0.replaceAll("[^A-Za-z0-9_]", "_");
   }

   private static void method2646(Path var0) throws java.io.IOException {
      if (Files.exists(var0)) {
         try (Stream<java.nio.file.Path> var1 = Files.walk(var0)) {
            for (Path var3 : var1.sorted((var0x, var1x) -> var1x.getNameCount() - var0x.getNameCount()).toList()) {
               Files.deleteIfExists(var3);
            }
         }
      }
   }

   private static void method2647(URL var0, Path var1) throws java.io.IOException {
      try {
         Path var2 = Path.of(var0.toURI());

         try (Stream<java.nio.file.Path> var3 = Files.walk(var2)) {
            for (Path var5 : var3.toList()) {
               Path var6 = var2.relativize(var5);
               Path var7 = var1.resolve(var6.toString());
               if (Files.isDirectory(var5)) {
                  Files.createDirectories(var7);
               } else {
                  Files.createDirectories(var7.getParent());
                  Files.copy(var5, var7, StandardCopyOption.REPLACE_EXISTING);
               }
            }
         }
      } catch (URISyntaxException var10) {
         throw new IOException("Invalid Figura avatar resource path", var10);
      }
   }

   private static void method2648(URL var0, String var1, Path var2) throws java.io.IOException {
      JarURLConnection var3 = (JarURLConnection)var0.openConnection();

      try (JarFile var4 = var3.getJarFile()) {
         Enumeration var5 = var4.entries();

         while (var5.hasMoreElements()) {
            JarEntry var6 = (JarEntry)var5.nextElement();
            String var7 = var6.getName();
            if (var7.startsWith(var1) && !var7.equals(var1)) {
               Path var8 = Path.of(var1).relativize(Path.of(var7));
               Path var9 = var2.resolve(var8.toString());
               if (var6.isDirectory()) {
                  Files.createDirectories(var9);
               } else {
                  Files.createDirectories(var9.getParent());

                  try (InputStream var10 = var4.getInputStream(var6)) {
                     Files.copy(var10, var9, StandardCopyOption.REPLACE_EXISTING);
                  }
               }
            }
         }
      }
   }
}
