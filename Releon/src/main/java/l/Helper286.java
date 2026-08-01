package l;

import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Stream;
import net.minecraft.client.MinecraftClient;

public final class Helper286 {
   private static final String RESOURCE_ROOT = "assets/Releon/figura_avatars/";
   public static final Helper285 Vin = new Helper285("vin", "Vin");

   private Helper286() {
   }

   public static Path method2794(Helper285 var0) throws java.io.IOException {
      MinecraftClient var1 = MinecraftClient.getInstance();
      Path var2 = var1 != null ? var1.runDirectory.toPath() : Path.of(".");
      Path var3 = var2.resolve("figura").resolve("avatars").resolve(var0.method2793());
      method2797("assets/Releon/figura_avatars/" + var0.method2792() + "/", var3);
      Helper211.method1807("Installed Figura avatar: " + var0.method2793());
      return var3;
   }

   public static void method2795(Helper285 var0) throws java.io.IOException {
      Path var1 = method2794(var0);
      method2796(var1);
   }

   private static void method2796(Path var0) throws java.io.IOException {
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

   private static void method2797(String var0, Path var1) throws java.io.IOException {
      ClassLoader var2 = Helper256.class.getClassLoader();
      URL var3 = var2.getResource(var0);
      if (var3 == null) {
         URL var4 = var2.getResource(var0 + "avatar.json");
         if (var4 == null) {
            throw new IOException("Missing bundled Figura avatar resource: " + var0);
         }

         if ("jar".equals(var4.getProtocol())) {
            Files.createDirectories(var1);
            method2799(var4, var0, var1);
            return;
         }

         if (!"file".equals(var4.getProtocol())) {
            throw new IOException("Unsupported Figura avatar resource protocol: " + var4.getProtocol());
         }

         var3 = new URL(var4, ".");
      }

      Files.createDirectories(var1);
      if ("file".equals(var3.getProtocol())) {
         method2798(var3, var1);
      } else if ("jar".equals(var3.getProtocol())) {
         method2799(var3, var0, var1);
      } else {
         throw new IOException("Unsupported Figura avatar resource protocol: " + var3.getProtocol());
      }
   }

   private static void method2798(URL var0, Path var1) throws java.io.IOException {
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

   private static void method2799(URL var0, String var1, Path var2) throws java.io.IOException {
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
