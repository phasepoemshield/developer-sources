package ru.metaculture.protection;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Locale;
import lombok.Generated;

public final class O0000O000OOO0 {
   private static boolean O00000000;

   public static void O00000000() {
   }

   public static void O000000000() {
   }

   public static void O0000000000() {
   }

   public static void O00000000(long l) {
   }

   @Generated
   public static boolean O00000000000() {
      return O00000000;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      O00000000 = false;
      label95:
      if (System.getProperty("os.name", "").toLowerCase(Locale.ROOT).contains("win")) {
         Path var0 = null;
         boolean var9 = false /* VF: Semaphore variable */;

         label92: {
            try {
               var9 = true;
               var0 = Files.createTempFile("wild_media_controller", ".dll");

               try (InputStream var1 = O0000O000OOO0.class.getResourceAsStream("/assets/wild/natives/MediaController.dll")) {
                  if (var1 != null) {
                     Files.copy(var1, var0, StandardCopyOption.REPLACE_EXISTING);
                     System.load(var0.toAbsolutePath().toString());
                     O00000000 = true;
                  }
                  break label92;
               }
            } catch (UnsatisfiedLinkError | Exception var12) {
               O00000000 = false;
               var9 = false;
            } finally {
               if (var9) {
                  if (var0 != null) {
                     var0.toFile().deleteOnExit();
                  }
               }
            }

            if (var0 != null) {
               var0.toFile().deleteOnExit();
            }
            break label95;
         }

         if (var0 != null) {
            var0.toFile().deleteOnExit();
         }
      }
   }
}
