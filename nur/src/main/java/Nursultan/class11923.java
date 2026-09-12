package Nursultan;

import com.google.common.collect.Queues;
import java.util.Queue;

public class class11923 {
   public static Object N_0 = Queues.newConcurrentLinkedQueue();

   private static void L() {
      N_0 = null;
   }

   private class11923() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      L();
   }

   public static void N() {
      Runnable var0;
      while ((var0 = (Runnable)((Queue)N_0).poll()) != null) {
         var0.run();
      }
   }

   public static void N(Runnable var0) {
      ((Queue)N_0).add(var0);
   }
}
