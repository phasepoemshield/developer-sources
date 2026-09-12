package Nursultan;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class class11309 {
   private static String[] N;

   private class11309() {
      throw new UnsupportedOperationException(N[0]);
   }

   static {
      y();
   }

   private static void y() {
      N = new String[1];
      N[0] = "This is a utility class and cannot be instantiated";
   }

   public static UUID N() {
      long var0 = System.currentTimeMillis() & 281474976710655L;
      long var2 = ThreadLocalRandom.current().nextLong() & 4095L;
      long var4 = var0 << 16 | 28672L | var2;
      long var8 = ThreadLocalRandom.current().nextLong() & 4611686018427387903L | Long.MIN_VALUE;
      return new UUID(var4, var8);
   }
}
