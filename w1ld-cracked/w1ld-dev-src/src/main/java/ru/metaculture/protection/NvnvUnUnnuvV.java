package ru.metaculture.protection;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Locale;
import lombok.Generated;

public final class NvnvUnUnnuvV {
   private static boolean UuUVuuUu;

   public static native void UuUVuuUu();

   public static native void C00OOC00oO();

   public static native void uUnuvNvvNU();

   public static native void UuUVuuUu(long var0);

   @Generated
   public static boolean vVvUvVVuuNvV() {
      return UuUVuuUu;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      UuUVuuUu = false;
      label91:
      if (System.getProperty("os.name", "").toLowerCase(Locale.ROOT).contains("win")) {
         Path var0 = null;
         boolean var9 = false /* VF: Semaphore variable */;

         label88: {
            try {
               var9 = true;
               var0 = Files.createTempFile("wild_media_controller", ".dll");

               try (InputStream var1 = NvnvUnUnnuvV.class.getResourceAsStream("/assets/wild/natives/MediaController.dll")) {
                  if (var1 != null) {
                     Files.copy(var1, var0, StandardCopyOption.REPLACE_EXISTING);
                     System.load(var0.toAbsolutePath().toString());
                     UuUVuuUu = true;
                  }
                  break label88;
               }
            } catch (UnsatisfiedLinkError | Exception var12) {
               UuUVuuUu = false;
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
            break label91;
         }

         if (var0 != null) {
            var0.toFile().deleteOnExit();
         }
      }
   }
}
