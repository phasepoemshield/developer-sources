package ru.metaculture.protection;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.HexFormat;
import java.util.concurrent.atomic.AtomicBoolean;

public final class LicenseFuse {
   private static final SecureRandom O00000000 = new SecureRandom();
   private static final AtomicBoolean O000000000 = new AtomicBoolean(false);
   private static final long O0000000000 = Long.getLong("wild.fuse.minDelaySeconds", 21600L);
   private static final long O00000000000 = Long.getLong("wild.fuse.maxExtraDelaySeconds", 151200L);
   private static final int O000000000000 = Integer.getInteger("wild.fuse.minLaunches", 3);
   private static final int O0000000000000 = Integer.getInteger("wild.fuse.extraLaunches", 4);

   private LicenseFuse() {
   }

   public static void O00000000(String string) {
   }

   public static void O00000000() {
   }

   public static boolean O000000000() {
      return true;
   }

   public static void O0000000000() {
   }

   public static void O00000000000() {
   }

   public static boolean O00000000(long l) {
      return true;
   }

   private static String O000000000(String string) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");
         String var2 = "wild-1.21.8-1783538716222|" + string + "|wild-fuse-v1";
         return HexFormat.of().formatHex(var1.digest(var2.getBytes(StandardCharsets.UTF_8)));
      } catch (Throwable var3) {
         return "";
      }
   }
}
