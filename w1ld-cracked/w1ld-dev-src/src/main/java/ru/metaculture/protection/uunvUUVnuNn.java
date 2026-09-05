package ru.metaculture.protection;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.HexFormat;
import java.util.concurrent.atomic.AtomicBoolean;

public final class uunvUUVnuNn {
   private static final SecureRandom UuUVuuUu = new SecureRandom();
   private static final AtomicBoolean C00OOC00oO = new AtomicBoolean(false);
   private static final long uUnuvNvvNU = Long.getLong("wild.fuse.minDelaySeconds", 21600L);
   private static final long vVvUvVVuuNvV = Long.getLong("wild.fuse.maxExtraDelaySeconds", 151200L);
   private static final int uNNnnnuuuN = Integer.getInteger("wild.fuse.minLaunches", 3);
   private static final int nuUnNvnuUu = Integer.getInteger("wild.fuse.extraLaunches", 4);

   private uunvUUVnuNn() {
   }

   public static void UuUVuuUu(String var0) {
      uuVnUuun var1 = vvnuuvnUNvN.UuUVuuUu();
      if (!var1.vVvUvVVuuNvV) {
         long var2 = NuvUnNnV.uUnuvNvvNU();
         long var4 = vVvUvVVuuNvV <= 0L ? 0L : Math.floorMod(UuUVuuUu.nextLong(), vVvUvVVuuNvV + 1L);
         int var6 = nuUnNvnuUu <= 0 ? 0 : UuUVuuUu.nextInt(nuUnNvnuUu + 1);
         var1.vVvUvVVuuNvV = true;
         var1.uNNnnnuuuN = var2 + uUnuvNvvNU + var4;
         var1.nuUnNvnuUu = Math.max(1, uNNnnnuuuN + var6);
         var1.VVuuUN = 0;
         var1.vNUvnnVnUvu = C00OOC00oO(var0);
         vvnuuvnUNvN.UuUVuuUu(var1);
      }
   }

   public static void UuUVuuUu() {
      if (C00OOC00oO.compareAndSet(false, true)) {
         uuVnUuun var0 = vvnuuvnUNvN.UuUVuuUu();
         if (var0.vVvUvVVuuNvV) {
            var0.VVuuUN++;
            vvnuuvnUNvN.UuUVuuUu(var0);
         }
      }
   }

   public static boolean C00OOC00oO() {
      return vvnuuvnUNvN.UuUVuuUu().vVvUvVVuuNvV;
   }

   public static void uUnuvNvvNU() {
      uuVnUuun var0 = vvnuuvnUNvN.UuUVuuUu();
      if (var0.vVvUvVVuuNvV) {
         var0.vVvUvVVuuNvV = false;
         var0.uNNnnnuuuN = 0L;
         var0.nuUnNvnuUu = 0;
         var0.VVuuUN = 0;
         var0.vNUvnnVnUvu = "";
         var0.C00OOC00oO = "wild-1.21.8-1787661348375";
         vvnuuvnUNvN.UuUVuuUu(var0);
      }
   }

   public static void vVvUvVVuuNvV() {
      uuVnUuun var0 = vvnuuvnUNvN.UuUVuuUu();
      boolean var1 = var0.C00OOC00oO != null && !var0.C00OOC00oO.isEmpty() && !var0.C00OOC00oO.equals("wild-1.21.8-1787661348375");
      boolean var2 = Boolean.getBoolean("wild.guard.forceDisarm");
      if ((var1 || var2) && var0.vVvUvVVuuNvV) {
         var0.vVvUvVVuuNvV = false;
         var0.uNNnnnuuuN = 0L;
         var0.nuUnNvnuUu = 0;
         var0.VVuuUN = 0;
         var0.vNUvnnVnUvu = "";
         var0.C00OOC00oO = "wild-1.21.8-1787661348375";
         vvnuuvnUNvN.UuUVuuUu(var0);
      } else if (var0.C00OOC00oO == null || var0.C00OOC00oO.isEmpty()) {
         var0.C00OOC00oO = "wild-1.21.8-1787661348375";
         vvnuuvnUNvN.UuUVuuUu(var0);
      }
   }

   public static boolean UuUVuuUu(long var0) {
      uuVnUuun var2 = vvnuuvnUNvN.UuUVuuUu();
      if (!var2.vVvUvVVuuNvV) {
         return false;
      } else {
         return var2.uNNnnnuuuN > 0L && var0 >= var2.uNNnnnuuuN ? true : var2.nuUnNvnuUu > 0 && var2.VVuuUN >= var2.nuUnNvnuUu;
      }
   }

   private static String C00OOC00oO(String var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");
         String var2 = "wild-1.21.8-1787661348375|" + var0 + "|wild-fuse-v1";
         return HexFormat.of().formatHex(var1.digest(var2.getBytes(StandardCharsets.UTF_8)));
      } catch (Throwable var3) {
         return "";
      }
   }
}
