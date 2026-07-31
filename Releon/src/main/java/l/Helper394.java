package l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Locale;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

public final class Helper394 {
   private static final String HASH_RESOURCE = "releon.integrity.sha256";
   private static volatile boolean armed;
   private static final boolean ANDROID_RUNTIME = method4019();
   private static final boolean MAC_RUNTIME = method4020();
   private static final boolean STRICT_GUARD = method4021();
   private static final boolean BLOCK_JAVA_AGENTS = !method4018("releon.runtimeguard.allowJavaAgents");
   private static final boolean HARD_FAIL = method4018("releon.runtimeguard.hardFail");
   private static final boolean ALLOW_UNSIGNED_JAR = method4018("releon.runtimeguard.allowUnsignedJar");

   private Helper394() {
   }

   public static void method4007() {
      if (!method4008() && !ANDROID_RUNTIME && !MAC_RUNTIME && !method4022()) {
         armed = true;
         method4009();
         method4010();
         method4011();
         method4012();
         method4023();
      }
   }

   private static boolean method4008() {
      return method4018("fabric.development");
   }

   private static void method4009() {
      for (String var2 : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
         String var3 = var2.toLowerCase(Locale.ROOT);
         if (var3.contains("jdwp") || var3.contains("-xdebug") || var3.contains("hprof")) {
            method4016();
         }

         if (var3.contains("-javaagent") && STRICT_GUARD && BLOCK_JAVA_AGENTS) {
            method4016();
         }
      }
   }

   private static void method4010() {
      if (method4018("mixin.debug")
         || method4018("mixin.debug.export")
         || method4018("mixin.dumpTargetOnFailure")
         || method4018("fabric.development")
         || method4018("java.vm.debug")) {
         method4016();
      }
   }

   private static void method4011() {
      String[] var0 = new String[]{
         "org.benf.cfr.reader.Main", "jadx.api.JadxDecompiler", "org.jd.core.v1.ClassFileToJavaSourceDecompiler", "net.bytebuddy.agent.ByteBuddyAgent"
      };
      ClassLoader var1 = Helper394.class.getClassLoader();

      for (String var5 : var0) {
         try {
            Class.forName(var5, false, var1);
            method4016();
         } catch (ClassNotFoundException var7) {
         }
      }
   }

   private static void method4012() {
      try {
         URI var0 = Helper394.class.getProtectionDomain().getCodeSource().getLocation().toURI();
         Path var1 = Path.of(var0);
         if (!Files.isRegularFile(var1) || !var1.toString().toLowerCase(Locale.ROOT).endsWith(".jar")) {
            return;
         }

         String var2 = method4013();
         if (var2 == null || var2.isBlank()) {
            if (ALLOW_UNSIGNED_JAR) {
               return;
            }

            method4017();
            return;
         }

         String var3 = method4014(var1);
         if (!var2.equalsIgnoreCase(var3)) {
            method4017();
         }
      } catch (Throwable var4) {
         method4017();
      }
   }

   private static String method4013() {
      try {
         String var1;
         try (InputStream var0 = Helper394.class.getClassLoader().getResourceAsStream("releon.integrity.sha256")) {
            if (var0 == null) {
               return null;
            }

            var1 = new String(var0.readAllBytes(), StandardCharsets.UTF_8).trim();
         }

         return var1;
      } catch (Throwable var5) {
         return null;
      }
   }

   private static String method4014(Path var0) throws java.security.NoSuchAlgorithmException, java.io.IOException {
      MessageDigest var1 = MessageDigest.getInstance("SHA-256");
      ArrayList<java.util.jar.JarEntry> var2 = new ArrayList<>();

      try (JarFile var3 = new JarFile(var0.toFile())) {
         Enumeration var4 = var3.entries();

         while (var4.hasMoreElements()) {
            JarEntry var5 = (JarEntry)var4.nextElement();
            if (!var5.isDirectory() && var5.getName().endsWith(".class")) {
               var2.add(var5);
            }
         }

         var2.sort(Comparator.comparing(ZipEntry::getName));
         byte[] var18 = new byte[8192];

         for (JarEntry var7 : var2) {
            var1.update(var7.getName().getBytes(StandardCharsets.UTF_8));

            try (
               InputStream var8 = var3.getInputStream(var7);
               ByteArrayOutputStream var9 = new ByteArrayOutputStream();
            ) {
               int var10;
               while ((var10 = var8.read(var18)) != -1) {
                  var9.write(var18, 0, var10);
               }

               var1.update(var9.toByteArray());
            }
         }
      }

      return method4015(var1.digest());
   }

   private static String method4015(byte[] var0) {
      StringBuilder var1 = new StringBuilder(var0.length * 2);

      for (byte var5 : var0) {
         var1.append(Character.forDigit(var5 >>> 4 & 15, 16));
         var1.append(Character.forDigit(var5 & 15, 16));
      }

      return var1.toString();
   }

   private static void method4016() {
      armed = false;
      if (HARD_FAIL) {
         method4017();
      } else {
         System.err
            .println("[Releon/RuntimeGuard] Guard triggered, switching to soft-fail mode. Enable -Dreleon.runtimeguard.hardFail=true to restore process halt.");
      }
   }

   private static void method4017() {
      armed = false;
      Runtime.getRuntime().halt(17);
   }

   private static boolean method4018(String var0) {
      String var1 = System.getProperty(var0);
      if (var1 == null) {
         return false;
      } else {
         String var2 = var1.trim().toLowerCase(Locale.ROOT);
         return "true".equals(var2) || "1".equals(var2) || "yes".equals(var2);
      }
   }

   private static boolean method4019() {
      try {
         String var0 = System.getProperty("java.vm.name", "").toLowerCase(Locale.ROOT);
         String var1 = System.getProperty("java.runtime.name", "").toLowerCase(Locale.ROOT);
         String var2 = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
         String var3 = System.getProperty("os.version", "").toLowerCase(Locale.ROOT);
         String var4 = System.getenv("ANDROID_DATA");
         String var5 = System.getenv("FCL_VERSION_CODE");
         String var6 = System.getenv("POJAV_RENDERER");
         if (!var0.contains("dalvik")
            && !var1.contains("android")
            && !var3.contains("android")
            && (!var2.contains("linux") || var4 == null)
            && var5 == null
            && var6 == null) {
            try {
               Class.forName("android.os.Build", false, Helper394.class.getClassLoader());
               return true;
            } catch (Throwable var8) {
               return false;
            }
         } else {
            return true;
         }
      } catch (Throwable var9) {
         return false;
      }
   }

   private static boolean method4020() {
      try {
         String var0 = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
         return var0.contains("mac");
      } catch (Throwable var1) {
         return false;
      }
   }

   private static boolean method4021() {
      try {
         String var0 = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
         return var0.contains("win");
      } catch (Throwable var1) {
         return false;
      }
   }

   private static boolean method4022() {
      return method4018("releon.runtimeguard.disabled");
   }

   private static void method4023() {
      Thread var0 = new Thread(() -> {
         while (armed) {
            try {
               method4009();
               method4010();
               method4011();
               method4012();
               Thread.sleep(20000L);
            } catch (InterruptedException var1) {
               Thread.currentThread().interrupt();
               return;
            } catch (Throwable var2) {
               method4016();
            }
         }
      }, "rt-guard");
      var0.setDaemon(true);
      var0.start();
   }
}
