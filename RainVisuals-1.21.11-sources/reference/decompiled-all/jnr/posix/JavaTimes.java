package jnr.posix;

// $VF: Compiled from JavaTimes.java
final class JavaTimes implements Times {
   static final long HZ = 1000L;
   private static final long startTime = System.currentTimeMillis();

   @Override
   public long cutime() {
      return 0L;
   }

   @Override
   public long stime() {
      return 0L;
   }

   @Override
   public long utime() {
      return Math.max(System.currentTimeMillis() - startTime, 1L);
   }

   @Override
   public long cstime() {
      return 0L;
   }
}
