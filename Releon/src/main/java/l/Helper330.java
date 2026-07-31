package l;

public class Helper330 {
   private static boolean waitingForServerLoad = false;
   private static long serverSwitchTime = 0L;

   public Helper330() {
   }

   public static void method3268(boolean var0) {
      waitingForServerLoad = var0;
   }

   public static boolean method3269() {
      return waitingForServerLoad;
   }

   public static void method3270(long var0) {
      serverSwitchTime = var0;
   }

   public static long method3271() {
      return serverSwitchTime;
   }

   public static boolean method3272() {
      return System.currentTimeMillis() - serverSwitchTime > 10000L;
   }
}
