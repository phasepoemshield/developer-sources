package Nursultan;

import com.mojang.serialization.Dynamic;
import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import minecraft.class03448;
import minecraft.class03519;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07742;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11894 {
   public static Object N_0 = LogManager.getLogger(String.class);

   public static void L(Path var0) {
      try {
         if (!Files.isDirectory(var0)) {
            ((Logger)N_0).error("Path {} is not a directory", var0);
         } else if (!Files.exists(var0)) {
            ((Logger)N_0).error("Path {} does not exist", var0);
         } else {
            try (DirectoryStream<Path> var1 = Files.newDirectoryStream(var0)) {
               for (Path var3 : var1) {
                  if (!var3.getFileName().toString().endsWith(".nbt")) {
                     ((Logger)N_0).info("Skipping non-NBT file: {}", var3);
                  } else {
                     class07001 var5 = u(var3);
                     if (var5 != null) {
                        if (var5.y("count")) {
                           var5.b("count");
                        }

                        if (var5.y("components")) {
                           var5.W("components").ifPresent(var0x -> {
                              if (var0x.y("minecraft:damage")) {
                                 var0x.b("minecraft:damage");
                              }

                              if (var0x.y("minecraft:repair_cost")) {
                                 var0x.b("minecraft:repair_cost");
                              }

                              if (var0x.y("minecraft:tooltip_display")) {
                                 var0x.b("minecraft:tooltip_display");
                              }

                              if (var0x.y("minecraft:custom_data")) {
                                 var0x.b("minecraft:custom_data");
                              }
                           });
                        }

                        class07742.y(var5, var3);
                        ((Logger)N_0).info("Cleaned NBT file: {}", var3);
                     }
                  }
               }
            } catch (Exception var8) {
               ((Logger)N_0).error("Error cleaning parsed items", var8);
            }
         }
      } catch (Throwable var9) {
         throw var9;
      }
   }

   private static void L() {
   }

   public static Path L(class06584 var0) {
      try {
         return y(y(var0));
      } catch (Throwable var1) {
         throw var1;
      }
   }

   private class11894() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      L();
      y();
   }

   public static class07001 u(Path var0) {
      try {
         return class07742.N(var0);
      } catch (Throwable var1) {
         throw var1;
      }
   }

   public static Path y(class07001 var0) {
      try {
         Path var1 = ((File)class06202.Nq().l_1).toPath().resolve("parsed-item");
         if (Files.notExists(var1)) {
            Files.createDirectories(var1);
         }

         Path var2 = Path.of(var1.toString(), "item0.nbt");
         int var3 = 0;

         while (Files.exists(var2)) {
            var2 = Path.of(var1.toString(), "item%s.nbt".formatted(++var3));
         }

         class07742.y(var0, var2);
         ((class03448)class06202.Nq().T_3).method_67392(class04909.yx, class04911.field_15250, 2.0F, 0.5F);
         return var2;
      } catch (Throwable var4) {
         throw var4;
      }
   }

   public static class07001 y(class06584 var0) {
      return (class07001)class06584.R.encodeStart(class11917.y(), var0).getOrThrow();
   }

   public static class06584 y(Path var0) {
      try {
         return (class06584)class06584.R.parse(new Dynamic(N(), class07742.N(var0))).getOrThrow();
      } catch (Throwable var1) {
         throw var1;
      }
   }

   private static void y() {
      N_0 = null;
   }

   public static class06584 N(Path var0) {
      try {
         return N(class07742.N(var0));
      } catch (Throwable var1) {
         throw var1;
      }
   }

   public static class03519<class07709> N() {
      return ((class03448)class06202.Nq().T_3).method_30349().N(class07713.N);
   }

   public static class07001 N(class06584 var0) {
      return (class07001)class06584.R.encodeStart(N(), var0).getOrThrow();
   }

   public static class06584 N(class07001 var0) {
      return (class06584)class06584.R.parse(new Dynamic(class11917.y(), var0)).getOrThrow();
   }
}
