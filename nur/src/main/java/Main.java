import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.impl.FabricLoaderImpl;

public final class Main {
   private static final String MC_MAIN = "net.minecraft.client.main.Main";
   private static final String MODS_RESOURCE = "/nursultan-mods.json";

   public static void main(String[] var0) throws Throwable {
      Path var1 = resolveGameDir(var0);
      Files.createDirectories(var1);
      Path var2 = selfPath();
      System.setProperty("java.awt.headless", "false");
      System.setProperty("fabric.development", "false");
      System.setProperty("fabric.skipMcProvider", "true");
      System.setProperty("mixin.env.remapRefMap", "false");
      System.setProperty("user.dir", var1.toString());
      FabricLoaderImpl var3 = FabricLoaderImpl.INSTANCE;
      var3.setGameDir(var1);
      var3.setLaunchArguments(var0);
      var3.setRawGameVersion(readGameVersion());
      List var4 = registerMods(var3, var2);
      instantiate(var3, var4);
      nursultan.NursultanUserDataFix.markBootstrapped();
      var3.invokeEntrypoints("preLaunch", PreLaunchEntrypoint.class, PreLaunchEntrypoint::onPreLaunch);
      Class var5 = Class.forName("net.minecraft.client.main.Main");
      Method var6 = var5.getDeclaredMethod("main", String[].class);
      var6.setAccessible(true);
      var6.invoke(null, new Object[]{var0});
   }

   private static Path resolveGameDir(String[] var0) {
      for (int var1 = 0; var1 < var0.length - 1; var1++) {
         if ("--gameDir".equals(var0[var1])) {
            return Paths.get(var0[var1 + 1]).toAbsolutePath().normalize();
         }
      }

      return Paths.get(".").toAbsolutePath().normalize();
   }

   private static List<Path> selfRoots() {
      List<Path> roots = new ArrayList<>();
      try {
         URI var0 = Main.class.getProtectionDomain().getCodeSource().getLocation().toURI();
         Path var1 = Paths.get(var0);

         Path[] candidateJars = new Path[] {
            var1,
            Paths.get("libs/nursultan-core.jar"),
            Paths.get("../libs/nursultan-core.jar"),
            var1.resolve("../../../libs/nursultan-core.jar").normalize()
         };
         for (Path cJar : candidateJars) {
            if (Files.isRegularFile(cJar)) {
               try {
                  FileSystem var2 = FileSystems.newFileSystem(cJar, (ClassLoader)null);
                  Path jarRoot = var2.getRootDirectories().iterator().next();
                  if (!roots.contains(jarRoot)) {
                     roots.add(jarRoot);
                  }
                  break;
               } catch (Throwable var3) {
               }
            }
         }

         Path resDir = var1.resolve("../../resources/main").normalize();
         if (Files.isDirectory(resDir) && !roots.contains(resDir)) {
            roots.add(resDir);
         }

         if (!roots.contains(var1)) {
            roots.add(var1);
         }
      } catch (Throwable var4) {
         roots.add(Paths.get(".").toAbsolutePath().normalize());
      }
      return roots;
   }

   private static Path selfPath() {
      List<Path> roots = selfRoots();
      return roots.isEmpty() ? Paths.get(".").toAbsolutePath().normalize() : roots.get(0);
   }

   private static String readGameVersion() {
      try {
         String var3;
         try (InputStream var0 = Main.class.getResourceAsStream("/version.json")) {
            if (var0 == null) {
               return "1.21.11";
            }

            Object var1 = NurJson.parse(new String(var0.readAllBytes(), StandardCharsets.UTF_8));
            Object var2 = ((Map)var1).get("id");
            var3 = var2 == null ? "1.21.11" : var2.toString();
         }

         return var3;
      } catch (Throwable var6) {
         return "1.21.11";
      }
   }

   private static List<Object[]> registerMods(FabricLoaderImpl var0, Path var1) throws Exception {
      ArrayList var2 = new ArrayList();
      InputStream var3 = Main.class.getResourceAsStream("/nursultan-mods.json");
      if (var3 == null) {
         return var2;
      } else {
         InputStream var5 = var3;

         String var4;
         try {
            var4 = new String(var5.readAllBytes(), StandardCharsets.UTF_8);
         } catch (Throwable var18) {
            if (var3 != null) {
               try {
                  var5.close();
               } catch (Throwable var17) {
                  var18.addSuppressed(var17);
               }
            }

            throw var18;
         }

         if (var3 != null) {
            var3.close();
         }

         Object var19 = NurJson.parse(var4);
         List var6 = (List)var19;
         List<Path> var7 = selfRoots();
         if (!var7.contains(var1)) {
            var7.add(0, var1);
         }

         for (Object var9 : var6) {
            Map var10 = (Map)var9;
            NurMeta var11 = new NurMeta(
               str(var10.get("id")),
               str(var10.get("name")),
               str(var10.get("desc")),
               str(var10.get("version")),
               str(var10.get("environment")),
               toCvMap(var10.get("custom")),
               toStrMap(var10.get("contact")),
               toStrList(var10.get("license")),
               toStrList(var10.get("provides")),
               toStrList(var10.get("authors")),
               var10.get("icon") == null ? null : str(var10.get("icon"))
            );
            NurContainer var12 = new NurContainer(var11, var7);
            var0.registerMod(var12);
            Object var13 = var10.get("entrypoints");
            if (var13 instanceof List) {
               for (Object var15 : (List)var13) {
                  List var16 = (List)var15;
                  var2.add(new Object[]{str(var16.get(0)), str(var16.get(1)), var12});
               }
            }
         }

         return var2;
      }
   }

   private static void instantiate(FabricLoaderImpl var0, List<Object[]> var1) {
      for (Object[] var3 : var1) {
         String var4 = (String)var3[0];
         String var5 = (String)var3[1];
         NurContainer var6 = (NurContainer)var3[2];

         try {
            var0.registerEntrypoint(var4, create(var5), var6);
         } catch (Throwable var8) {
            Throwable cause = (var8 instanceof java.lang.reflect.InvocationTargetException && var8.getCause() != null) ? var8.getCause() : var8;
            System.err.println("[Nursultan] entrypoint " + var4 + " " + var5 + " failed: " + cause);
         }
      }
   }

   private static Object create(String var0) throws Throwable {
      int var1 = var0.indexOf("::");
      if (var1 < 0) {
         Class var9 = Class.forName(var0);
         Constructor var10 = var9.getDeclaredConstructor();
         var10.setAccessible(true);
         return var10.newInstance();
      } else {
         String var2 = var0.substring(0, var1);
         String var3 = var0.substring(var1 + 2);
         Class var4 = Class.forName(var2);

         for (Method var8 : var4.getDeclaredMethods()) {
            if (var8.getName().equals(var3) && var8.getParameterCount() == 0) {
               var8.setAccessible(true);
               return new Main.MethodEntry(var8);
            }
         }

         Field var11 = var4.getDeclaredField(var3);
         var11.setAccessible(true);
         return var11.get(null);
      }
   }

   private static String str(Object var0) {
      return var0 == null ? "" : var0.toString();
   }

   private static List<String> toStrList(Object var0) {
      ArrayList var1 = new ArrayList();
      if (var0 instanceof List) {
         for (Object var3 : (List)var0) {
            if (var3 != null) {
               var1.add(var3.toString());
            }
         }
      }

      return var1;
   }

   private static Map<String, String> toStrMap(Object var0) {
      LinkedHashMap var1 = new LinkedHashMap();
      if (var0 instanceof Map) {
         for (Map.Entry<?, ?> var3 : ((Map<?, ?>)var0).entrySet()) {
            if (var3.getValue() != null) {
               var1.put(var3.getKey().toString(), var3.getValue().toString());
            }
         }
      }

      return var1;
   }

   private static Map<String, CustomValue> toCvMap(Object var0) {
      LinkedHashMap var1 = new LinkedHashMap();
      if (var0 instanceof Map) {
         for (Map.Entry<?, ?> var3 : ((Map<?, ?>)var0).entrySet()) {
            var1.put(var3.getKey().toString(), toCv(var3.getValue()));
         }
      }

      return var1;
   }

   private static CustomValue toCv(Object var0) {
      if (var0 == null) {
         return NurCv.Nil.INSTANCE;
      } else if (var0 instanceof Map) {
         LinkedHashMap var4 = new LinkedHashMap();

         for (Map.Entry<?, ?> var6 : ((Map<?, ?>)var0).entrySet()) {
            var4.put(var6.getKey().toString(), toCv(var6.getValue()));
         }

         return new NurCv.Obj(var4);
      } else if (!(var0 instanceof List)) {
         if (var0 instanceof Boolean) {
            return new NurCv.Bool((Boolean)var0);
         } else {
            return (CustomValue)(var0 instanceof Number ? new NurCv.Num((Number)var0) : new NurCv.Str(var0.toString()));
         }
      } else {
         ArrayList var1 = new ArrayList();

         for (Object var3 : (List)var0) {
            var1.add(toCv(var3));
         }

         return new NurCv.Arr(var1);
      }
   }

   private Main() {
   }

   private static final class MethodEntry implements ModInitializer, ClientModInitializer, PreLaunchEntrypoint {
      private final Method m;

      MethodEntry(Method var1) {
         this.m = var1;
      }

      private void call() {
         try {
            this.m.invoke(null);
         } catch (Throwable var2) {
            throw var2 instanceof RuntimeException ? (RuntimeException)var2 : new RuntimeException(var2);
         }
      }

      public void onInitialize() {
         this.call();
      }

      public void onInitializeClient() {
         this.call();
      }

      public void onPreLaunch() {
         this.call();
      }
   }
}
