package Nursultan;

import java.util.Comparator;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11313 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;

   private static void M() {
      N_0 = null;
      N_1 = "default";
   }

   private class11313() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      M();
   }

   private static class11290 u() {
      byte[] var0 = class11280.N(class11938.u().NN());
      class11290 var1 = new class11290(
         class11309.N(), 0L, "default", ((class11472)class11938.L_2).Z(), System.currentTimeMillis(), 0L, 0L, class11296.LOCAL, 1, true, var0
      );
      class11938.G().N(var1);
      class11938.I().y(var1);
      return var1;
   }

   public static void y() {
      class11521 var0 = class11938.M().N(class11521.class);
      class11325 var1 = class11938.G();
      UUID var2 = var0.y();
      if (var2 == null || !var1.N(var2).isPresent()) {
         class11290 var3 = var1.L().stream().filter(var0x -> var0x.M() != class11296.DELETING).max(Comparator.comparingLong(class11290::B)).orElse(null);
         if (var3 == null) {
            var3 = u();
         }

         var0.N(var3.u());
         class11519.y(class11521.class);
      }
   }

   public static void N() {
      if (class11938.B().N()) {
         UUID var1 = class11938.M().N(class11521.class).y();
         if (var1 != null) {
            class11290 var2 = class11938.G().N(var1).orElse(null);
            if (var2 != null) {
               try {
                  byte[] var3 = class11280.N(class11938.u().NN());
                  var2.N(var3);
                  var2.N(true);
                  var2.N(1);
                  var2.N(System.currentTimeMillis());
                  if (var2.M() == class11296.SYNCED) {
                     var2.N(class11296.DIRTY);
                  }

                  class11938.G().N(var2);
               } catch (Exception var4) {
                  ((Logger)N_0).error("auto-save selected preset failed", var4);
               }
            }
         }
      }
   }
}
