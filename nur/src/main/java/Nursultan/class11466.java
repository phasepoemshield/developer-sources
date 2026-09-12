package Nursultan;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Predicate;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11466 {
   public Object N_0;
   public static Object y_0 = LogManager.getLogger(String.class);

   public class11466() {
      this.R();
      this.N_0 = new ConcurrentLinkedDeque();
   }

   static {
      i();
   }

   private static void i() {
      y_0 = null;
   }

   public void y(int var1, Runnable var2) {
      ((ConcurrentLinkedDeque)this.N_0).add(new class11462(var1, var2));
   }

   public class11461 y(int var1, int var2, Runnable var3) {
      class11461 var4 = new class11461(var1, var2, var3);
      ((ConcurrentLinkedDeque)this.N_0).add(var4);
      return var4;
   }

   public void N(Predicate<class06202> var1, Runnable var2) {
      ((ConcurrentLinkedDeque)this.N_0).add(new class11482(var2, var1));
   }

   public class11461 N(int var1, Runnable var2) {
      class11461 var3 = new class11461(var1, var2);
      ((ConcurrentLinkedDeque)this.N_0).add(var3);
      return var3;
   }

   public void N() {
      Iterator var1 = ((ConcurrentLinkedDeque)this.N_0).iterator();

      while (var1.hasNext()) {
         try {
            class11462 var2 = (class11462)var1.next();
            boolean var3 = var2 != null;
            if (var3) {
               var2.u();
            }

            if (!var3 || var2.L()) {
               var1.remove();
            }
         } catch (Exception var4) {
            ((Logger)y_0).error("Error updating schedules: {}", var4.getMessage(), var4);
         }
      }
   }

   public void N(class11474 var1) {
      ((ConcurrentLinkedDeque)this.N_0).add(var1);
   }

   public void N(int var1, int var2, Runnable var3) {
      this.N(new class11474(var1, var2, var3));
   }

   public void N(Runnable var1) {
      this.y(1, var1);
   }

   private void R() {
   }
}
