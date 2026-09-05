package ru.metaculture.protection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_155;
import net.minecraft.class_310;

public final class UnvVVnnVNN {
   public static final String UuUVuuUu = "viafabricplus";
   public static final String C00OOC00oO = "https://modrinth.com/mod/viafabricplus";
   private static final String uUnuvNvvNU = "com.viaversion.viaversion.api.protocol.version.ProtocolVersion";
   private static final String[] vVvUvVVuuNvV = new String[]{
      "com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator", "de.florianmichael.viafabricplus.protocoltranslator.ProtocolTranslator"
   };
   private static final String[] uNNnnnuuuN = new String[]{
      "com.viaversion.vialoader.util.ProtocolVersionList", "net.raphimc.vialoader.util.ProtocolVersionList"
   };
   private static final String nuUnNvnuUu = "de.florianmichael.viafabricplus.protocolhack.ProtocolHack";
   private static final String[] VVuuUN = new String[]{"1.21.5", "1.21.4", "1.21.2", "1.20.6", "1.20.1", "1.19.4", "1.18.2", "1.16.5", "1.12.2", "1.8.x"};
   private static volatile boolean vNUvnnVnUvu;
   private static boolean uVUuuVnNVU;
   private static boolean vuuuNvNuv;
   private static Method nvUVNnuu;
   private static Method UuuNnUvUuv;
   private static Method nUUVuvU;
   private static Method UnUNVVVNuv;
   private static Method vNVuvnUUnuUn;
   private static Method UvnvNVnnnnNU;
   private static Method uVUVnuvnuVuv;
   private static Method NVNnnvnuunNv;
   private static Field uVunuUNVVUUV;
   private static Field UNnVVNvvnVvU;
   private static List<UnvVVnnVNN.NVnVnNnN> uNnUnnuNUnNu = List.of();
   private static boolean NnUuNNU;
   private static long nNvNUVU;

   private UnvVVnnVNN() {
   }

   public static boolean UuUVuuUu() {
      nUUVuvU();
      return uVUuuVnNVU;
   }

   public static boolean C00OOC00oO() {
      nUUVuvU();
      return vuuuNvNuv;
   }

   public static String uUnuvNvvNU() {
      try {
         return FabricLoader.getInstance().getModContainer("viafabricplus").map(var0 -> var0.getMetadata().getVersion().getFriendlyString()).orElse(null);
      } catch (Throwable var1) {
         return null;
      }
   }

   public static String vVvUvVVuuNvV() {
      try {
         return class_155.method_16673().comp_4025();
      } catch (Throwable var1) {
         return "1.21.8";
      }
   }

   public static List<UnvVVnnVNN.NVnVnNnN> uNNnnnuuuN() {
      if (!UuUVuuUu()) {
         return List.of();
      } else {
         long var0 = System.nanoTime();
         if (uNnUnnuNUnNu.isEmpty() || !NnUuNNU && var0 - nNvNUVU >= 1000000000L) {
            nNvNUVU = var0;
            List var2 = nvUVNnuu();
            if (!var2.isEmpty()) {
               uNnUnnuNUnNu = var2;
               NnUuNNU = vuuuNvNuv();
            }

            return uNnUnnuNUnNu;
         } else {
            return uNnUnnuNUnNu;
         }
      }
   }

   public static List<UnvVVnnVNN.NVnVnNnN> UuUVuuUu(List<UnvVVnnVNN.NVnVnNnN> var0, UnvVVnnVNN.NVnVnNnN var1, int var2) {
      ArrayList var3 = new ArrayList(var2);

      for (UnvVVnnVNN.NVnVnNnN var5 : var0) {
         if (var5.autoDetect()) {
            var3.add(var5);
            break;
         }
      }

      UnvVVnnVNN.NVnVnNnN var10 = UuUVuuUu(var0, vVvUvVVuuNvV());
      if (var10 != null && !var3.contains(var10)) {
         var3.add(var10);
      }

      if (var1 != null && !var3.contains(var1)) {
         var3.add(var1);
      }

      for (String var8 : VVuuUN) {
         if (var3.size() >= var2) {
            break;
         }

         UnvVVnnVNN.NVnVnNnN var9 = UuUVuuUu(var0, var8);
         if (var9 != null && !var3.contains(var9)) {
            var3.add(var9);
         }
      }

      for (UnvVVnnVNN.NVnVnNnN var13 : var0) {
         if (var3.size() >= var2) {
            break;
         }

         if (!var3.contains(var13) && "RELEASE".equals(var13.group())) {
            var3.add(var13);
         }
      }

      return List.copyOf(var3);
   }

   private static UnvVVnnVNN.NVnVnNnN UuUVuuUu(List<UnvVVnnVNN.NVnVnNnN> var0, String var1) {
      for (UnvVVnnVNN.NVnVnNnN var3 : var0) {
         if (var3.label().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public static UnvVVnnVNN.NVnVnNnN nuUnNvnuUu() {
      if (!UuUVuuUu()) {
         return null;
      } else {
         Object var0 = uVUuuVnNVU();
         if (var0 == null) {
            return null;
         } else {
            for (UnvVVnnVNN.NVnVnNnN var2 : uNNnnnuuuN()) {
               if (Objects.equals(var2.handle(), var0)) {
                  return var2;
               }
            }

            return UuUVuuUu(var0);
         }
      }
   }

   public static String VVuuUN() {
      UnvVVnnVNN.NVnVnNnN var0 = nuUnNvnuUu();
      return var0 == null ? vVvUvVVuuNvV() : var0.label();
   }

   public static boolean vNUvnnVnUvu() {
      if (!UuUVuuUu()) {
         return false;
      } else {
         class_310 var0 = class_310.method_1551();
         return var0 != null && var0.method_1562() == null && var0.field_1687 == null;
      }
   }

   public static boolean UuUVuuUu(UnvVVnnVNN.NVnVnNnN var0) {
      if (var0 != null && var0.handle() != null && vNUvnnVnUvu()) {
         try {
            if (nUUVuvU != null) {
               nUUVuvU.invoke(null, var0.handle(), Boolean.TRUE);
            } else {
               if (UuuNnUvUuv == null) {
                  return false;
               }

               UuuNnUvUuv.invoke(null, var0.handle());
            }

            return true;
         } catch (Throwable var2) {
            return false;
         }
      } else {
         return false;
      }
   }

   private static Object uVUuuVnNVU() {
      if (nvUVNnuu != null) {
         try {
            Object var0 = nvUVNnuu.invoke(null);
            if (var0 != null) {
               return var0;
            }
         } catch (Throwable var1) {
         }
      }

      if (uVunuUNVVUUV != null) {
         try {
            return uVunuUNVVUUV.get(null);
         } catch (Throwable var2) {
         }
      }

      return null;
   }

   private static boolean vuuuNvNuv() {
      if (UNnVVNvvnVvU != null && UnUNVVVNuv != null) {
         try {
            Object var0 = UNnVVNvvnVvU.get(null);

            for (Object var2 : (List)UnUNVVVNuv.invoke(null)) {
               if (var2 == var0) {
                  return true;
               }
            }

            return false;
         } catch (Throwable var3) {
            return true;
         }
      } else {
         return true;
      }
   }

   private static List<UnvVVnnVNN.NVnVnNnN> nvUVNnuu() {
      List var0 = UuuNnUvUuv();
      if (var0.isEmpty()) {
         return List.of();
      } else {
         ArrayList var1 = new ArrayList(var0.size());

         for (Object var3 : var0) {
            UnvVVnnVNN.NVnVnNnN var4 = UuUVuuUu(var3);
            if (var4 != null) {
               var1.add(var4);
            }
         }

         return List.copyOf(var1);
      }
   }

   private static List<Object> UuuNnUvUuv() {
      if (UnUNVVVNuv != null) {
         try {
            ArrayList var0 = new ArrayList((List)UnUNVVVNuv.invoke(null));
            Collections.reverse(var0);
            return var0;
         } catch (Throwable var2) {
         }
      }

      if (vNVuvnUUnuUn != null) {
         try {
            return new ArrayList<>((List)vNVuvnUUnuUn.invoke(null));
         } catch (Throwable var1) {
         }
      }

      return List.of();
   }

   private static UnvVVnnVNN.NVnVnNnN UuUVuuUu(Object var0) {
      if (var0 != null && UvnvNVnnnnNU != null) {
         String var1;
         try {
            var1 = (String)UvnvNVnnnnNU.invoke(var0);
         } catch (Throwable var9) {
            return null;
         }

         if (var1 != null && !var1.isEmpty()) {
            int var2 = Integer.MIN_VALUE;
            if (uVUVnuvnuVuv != null) {
               try {
                  var2 = (Integer)uVUVnuvnuVuv.invoke(var0);
               } catch (Throwable var8) {
               }
            }

            String var3 = "OTHER";
            if (NVNnnvnuunNv != null) {
               try {
                  var3 = NVNnnvnuunNv.invoke(var0) instanceof Enum var5 ? var5.name() : "OTHER";
               } catch (Throwable var7) {
               }
            }

            boolean var10 = false;
            if (UNnVVNvvnVvU != null) {
               try {
                  var10 = UNnVVNvvnVvU.get(null) == var0;
               } catch (Throwable var6) {
               }
            }

            return new UnvVVnnVNN.NVnVnNnN(var0, var1, var2, var3, var10);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static void nUUVuvU() {
      if (!vNUvnnVnUvu) {
         synchronized (UnvVVnnVNN.class) {
            if (!vNUvnnVnUvu) {
               try {
                  UnUNVVVNuv();
               } catch (Throwable var3) {
                  uVUuuVnNVU = false;
               }

               vNUvnnVnUvu = true;
            }
         }
      }
   }

   private static void UnUNVVVNuv() {
      boolean var0 = false;

      try {
         var0 = FabricLoader.getInstance().isModLoaded("viafabricplus");
      } catch (Throwable var7) {
      }

      Class var1 = UuUVuuUu("com.viaversion.viaversion.api.protocol.version.ProtocolVersion");
      if (var1 == null) {
         vuuuNvNuv = var0 && UuUVuuUu("de.florianmichael.viafabricplus.protocolhack.ProtocolHack") != null;
         uVUuuVnNVU = false;
      } else {
         UvnvNVnnnnNU = UuUVuuUu(var1, "getName");
         uVUVnuvnuVuv = UuUVuuUu(var1, "getVersion");
         NVNnnvnuunNv = UuUVuuUu(var1, "getVersionType");
         UnUNVVVNuv = UuUVuuUu(var1, "getProtocols");

         for (String var5 : uNNnnnuuuN) {
            Class var6 = UuUVuuUu(var5);
            if (var6 != null) {
               vNVuvnUUnuUn = UuUVuuUu(var6, "getProtocolsNewToOld");
               if (vNVuvnUUnuUn != null) {
                  break;
               }
            }
         }

         for (String var11 : vVvUvVVuuNvV) {
            Class var12 = UuUVuuUu(var11);
            if (var12 != null) {
               nvUVNnuu = UuUVuuUu(var12, "getTargetVersion");
               UuuNnUvUuv = UuUVuuUu(var12, "setTargetVersion", var1);
               nUUVuvU = UuUVuuUu(var12, "setTargetVersion", var1, boolean.class);
               uVunuUNVVUUV = UuUVuuUu(var12, "NATIVE_VERSION");
               UNnVVNvvnVvU = UuUVuuUu(var12, "AUTO_DETECT_PROTOCOL");
               if (nvUVNnuu != null && UuuNnUvUuv != null && UvnvNVnnnnNU != null) {
                  uVUuuVnNVU = true;
                  return;
               }
            }
         }

         vuuuNvNuv = var0 && UuUVuuUu("de.florianmichael.viafabricplus.protocolhack.ProtocolHack") != null;
         uVUuuVnNVU = false;
      }
   }

   private static Class<?> UuUVuuUu(String var0) {
      try {
         return Class.forName(var0, false, UnvVVnnVNN.class.getClassLoader());
      } catch (Throwable var2) {
         return null;
      }
   }

   private static Method UuUVuuUu(Class<?> var0, String var1, Class<?>... var2) {
      try {
         Method var3 = var0.getMethod(var1, var2);
         var3.setAccessible(true);
         return var3;
      } catch (Throwable var4) {
         return null;
      }
   }

   private static Field UuUVuuUu(Class<?> var0, String var1) {
      try {
         Field var2 = var0.getField(var1);
         var2.setAccessible(true);
         return var2;
      } catch (Throwable var3) {
         return null;
      }
   }

   public record NVnVnNnN(Object handle, String label, int protocol, String group, boolean autoDetect) {
   }
}
