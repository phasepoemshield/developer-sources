package zenith;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class ZenithInternal091 {
   private ZenithInternal091() {
   }

   public static int ConnectThread(int i, int j) {
      if (i > j) {
         throw new IllegalArgumentException("min > max");
      } else {
         return ThreadLocalRandom.current().nextInt(i, j + 1);
      }
   }

   public static int CallableImpl(int i, int j) {
      return ConnectThread(i, j);
   }

   public static boolean longHolder_5(int i, int j) {
      int k = ConnectThread(i, j);
      return k > ThreadLocalRandom.current().nextInt(100);
   }

   public static <T> List<T> ZenithInternal070(List<T> list) {
      ArrayList arraylist = new ArrayList(list);
      Collections.shuffle(arraylist, (Random)ThreadLocalRandom.current());
      return arraylist;
   }

   public static <T> void longHolder_6(List<T> list) {
      Collections.shuffle(list, (Random)ThreadLocalRandom.current());
   }
}
